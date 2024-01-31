package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateTenantRequestData;
import com.fntsoftware.businessgateway.entities.CreateTenantResponse;
import com.fntsoftware.businessgateway.entities.DeleteTenantRequestData;
import com.fntsoftware.businessgateway.entities.DeleteTenantResponse;
import com.fntsoftware.businessgateway.entities.TenantCloudProvidersRequestData;
import com.fntsoftware.businessgateway.entities.TenantCloudProvidersResponseData;
import com.fntsoftware.businessgateway.entities.TenantQueryRequest;
import com.fntsoftware.businessgateway.entities.TenantQueryResponse;
import com.fntsoftware.businessgateway.entities.TenantResourceGroupsRequestData;
import com.fntsoftware.businessgateway.entities.TenantResourceGroupsResponseData;
import com.fntsoftware.businessgateway.entities.TenantSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.TenantSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesTenantRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesTenantResponse;
import com.fntsoftware.businessgateway.entities.UpdateTenantRequestData;
import com.fntsoftware.businessgateway.entities.UpdateTenantResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface TenantApi extends ApiClient.Api {


  /**
   * Create
   * Create Tenant
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateTenantResponse
   */
  @RequestLine("POST /api/rest/entity/tenant/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateTenantResponse createTenant(@Param("sessionId") String sessionId, CreateTenantRequestData body);

  /**
   * Create
   * Similar to <code>createTenant</code> but it also returns the http response headers .
   * Create Tenant
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/tenant/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateTenantResponse> createTenantWithHttpInfo(@Param("sessionId") String sessionId, CreateTenantRequestData body);


  /**
   * Create
   * Create Tenant
   * Note, this is equivalent to the other <code>createTenant</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateTenantQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateTenantResponse
   */
  @RequestLine("POST /api/rest/entity/tenant/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateTenantResponse createTenant(CreateTenantRequestData body, @QueryMap(encoded=true) CreateTenantQueryParams queryParams);

  /**
  * Create
  * Create Tenant
  * Note, this is equivalent to the other <code>createTenant</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateTenantResponse
      */
      @RequestLine("POST /api/rest/entity/tenant/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateTenantResponse> createTenantWithHttpInfo(CreateTenantRequestData body, @QueryMap(encoded=true) CreateTenantQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createTenant</code> method in a fluent style.
   */
  public static class CreateTenantQueryParams extends HashMap<String, Object> {
    public CreateTenantQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Tenant
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteTenantResponse
   */
  @RequestLine("POST /api/rest/entity/tenant/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteTenantResponse deleteTenant(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteTenantRequestData body);

  /**
   * Delete
   * Similar to <code>deleteTenant</code> but it also returns the http response headers .
   * Delete Tenant
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/tenant/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteTenantResponse> deleteTenantWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteTenantRequestData body);


  /**
   * Delete
   * Delete Tenant
   * Note, this is equivalent to the other <code>deleteTenant</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteTenantQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteTenantResponse
   */
  @RequestLine("POST /api/rest/entity/tenant/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteTenantResponse deleteTenant(@Param("elid") String elid, DeleteTenantRequestData body, @QueryMap(encoded=true) DeleteTenantQueryParams queryParams);

  /**
  * Delete
  * Delete Tenant
  * Note, this is equivalent to the other <code>deleteTenant</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteTenantResponse
      */
      @RequestLine("POST /api/rest/entity/tenant/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteTenantResponse> deleteTenantWithHttpInfo(@Param("elid") String elid, DeleteTenantRequestData body, @QueryMap(encoded=true) DeleteTenantQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteTenant</code> method in a fluent style.
   */
  public static class DeleteTenantQueryParams extends HashMap<String, Object> {
    public DeleteTenantQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Cloud Provider entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return TenantCloudProvidersResponseData
   */
  @RequestLine("POST /api/rest/entity/tenant/{elid}/CloudProviders?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TenantCloudProvidersResponseData tenantCloudProviders(@Param("sessionId") String sessionId, @Param("elid") String elid, TenantCloudProvidersRequestData body);

  /**
   * Get relations to Cloud Provider entities
   * Similar to <code>tenantCloudProviders</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/tenant/{elid}/CloudProviders?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TenantCloudProvidersResponseData> tenantCloudProvidersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TenantCloudProvidersRequestData body);


  /**
   * Get relations to Cloud Provider entities
   * 
   * Note, this is equivalent to the other <code>tenantCloudProviders</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TenantCloudProvidersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TenantCloudProvidersResponseData
   */
  @RequestLine("POST /api/rest/entity/tenant/{elid}/CloudProviders?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TenantCloudProvidersResponseData tenantCloudProviders(@Param("elid") String elid, TenantCloudProvidersRequestData body, @QueryMap(encoded=true) TenantCloudProvidersQueryParams queryParams);

  /**
  * Get relations to Cloud Provider entities
  * 
  * Note, this is equivalent to the other <code>tenantCloudProviders</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TenantCloudProvidersResponseData
      */
      @RequestLine("POST /api/rest/entity/tenant/{elid}/CloudProviders?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TenantCloudProvidersResponseData> tenantCloudProvidersWithHttpInfo(@Param("elid") String elid, TenantCloudProvidersRequestData body, @QueryMap(encoded=true) TenantCloudProvidersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>tenantCloudProviders</code> method in a fluent style.
   */
  public static class TenantCloudProvidersQueryParams extends HashMap<String, Object> {
    public TenantCloudProvidersQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return TenantQueryResponse
   */
  @RequestLine("POST /api/rest/entity/tenant/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TenantQueryResponse tenantQuery(@Param("sessionId") String sessionId, TenantQueryRequest body);

  /**
   * Basic query
   * Similar to <code>tenantQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/tenant/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TenantQueryResponse> tenantQueryWithHttpInfo(@Param("sessionId") String sessionId, TenantQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>tenantQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TenantQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TenantQueryResponse
   */
  @RequestLine("POST /api/rest/entity/tenant/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TenantQueryResponse tenantQuery(TenantQueryRequest body, @QueryMap(encoded=true) TenantQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>tenantQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TenantQueryResponse
      */
      @RequestLine("POST /api/rest/entity/tenant/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TenantQueryResponse> tenantQueryWithHttpInfo(TenantQueryRequest body, @QueryMap(encoded=true) TenantQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>tenantQuery</code> method in a fluent style.
   */
  public static class TenantQueryQueryParams extends HashMap<String, Object> {
    public TenantQueryQueryParams sessionId(final String value) {
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
   * @return TenantResourceGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/tenant/{elid}/ResourceGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TenantResourceGroupsResponseData tenantResourceGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, TenantResourceGroupsRequestData body);

  /**
   * Get relations to Resource group entities
   * Similar to <code>tenantResourceGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/tenant/{elid}/ResourceGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TenantResourceGroupsResponseData> tenantResourceGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TenantResourceGroupsRequestData body);


  /**
   * Get relations to Resource group entities
   * 
   * Note, this is equivalent to the other <code>tenantResourceGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TenantResourceGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TenantResourceGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/tenant/{elid}/ResourceGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TenantResourceGroupsResponseData tenantResourceGroups(@Param("elid") String elid, TenantResourceGroupsRequestData body, @QueryMap(encoded=true) TenantResourceGroupsQueryParams queryParams);

  /**
  * Get relations to Resource group entities
  * 
  * Note, this is equivalent to the other <code>tenantResourceGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TenantResourceGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/tenant/{elid}/ResourceGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TenantResourceGroupsResponseData> tenantResourceGroupsWithHttpInfo(@Param("elid") String elid, TenantResourceGroupsRequestData body, @QueryMap(encoded=true) TenantResourceGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>tenantResourceGroups</code> method in a fluent style.
   */
  public static class TenantResourceGroupsQueryParams extends HashMap<String, Object> {
    public TenantResourceGroupsQueryParams sessionId(final String value) {
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
   * @return TenantSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/tenant/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TenantSystemAttributesResponse tenantSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, TenantSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>tenantSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/tenant/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TenantSystemAttributesResponse> tenantSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TenantSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>tenantSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TenantSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TenantSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/tenant/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TenantSystemAttributesResponse tenantSystemAttributes(@Param("elid") String elid, TenantSystemAttributesRequest body, @QueryMap(encoded=true) TenantSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>tenantSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TenantSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/tenant/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TenantSystemAttributesResponse> tenantSystemAttributesWithHttpInfo(@Param("elid") String elid, TenantSystemAttributesRequest body, @QueryMap(encoded=true) TenantSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>tenantSystemAttributes</code> method in a fluent style.
   */
  public static class TenantSystemAttributesQueryParams extends HashMap<String, Object> {
    public TenantSystemAttributesQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesTenantResponse
   */
  @RequestLine("POST /api/rest/entity/tenant/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesTenantResponse updateSystemAttributesTenant(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesTenantRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesTenant</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/tenant/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesTenantResponse> updateSystemAttributesTenantWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesTenantRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesTenant</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesTenantQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesTenantResponse
   */
  @RequestLine("POST /api/rest/entity/tenant/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesTenantResponse updateSystemAttributesTenant(@Param("elid") String elid, UpdateSystemAttributesTenantRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesTenantQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesTenant</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesTenantResponse
      */
      @RequestLine("POST /api/rest/entity/tenant/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesTenantResponse> updateSystemAttributesTenantWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesTenantRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesTenantQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesTenant</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesTenantQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesTenantQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Tenant
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateTenantResponse
   */
  @RequestLine("POST /api/rest/entity/tenant/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateTenantResponse updateTenant(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateTenantRequestData body);

  /**
   * Modify
   * Similar to <code>updateTenant</code> but it also returns the http response headers .
   * Modify Tenant
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/tenant/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateTenantResponse> updateTenantWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateTenantRequestData body);


  /**
   * Modify
   * Modify Tenant
   * Note, this is equivalent to the other <code>updateTenant</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateTenantQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateTenantResponse
   */
  @RequestLine("POST /api/rest/entity/tenant/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateTenantResponse updateTenant(@Param("elid") String elid, UpdateTenantRequestData body, @QueryMap(encoded=true) UpdateTenantQueryParams queryParams);

  /**
  * Modify
  * Modify Tenant
  * Note, this is equivalent to the other <code>updateTenant</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateTenantResponse
      */
      @RequestLine("POST /api/rest/entity/tenant/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateTenantResponse> updateTenantWithHttpInfo(@Param("elid") String elid, UpdateTenantRequestData body, @QueryMap(encoded=true) UpdateTenantQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateTenant</code> method in a fluent style.
   */
  public static class UpdateTenantQueryParams extends HashMap<String, Object> {
    public UpdateTenantQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
