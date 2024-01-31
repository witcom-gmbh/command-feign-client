package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CloudProviderQueryRequest;
import com.fntsoftware.businessgateway.entities.CloudProviderQueryResponse;
import com.fntsoftware.businessgateway.entities.CloudProviderSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.CloudProviderSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.CloudProviderTenantsRequestData;
import com.fntsoftware.businessgateway.entities.CloudProviderTenantsResponseData;
import com.fntsoftware.businessgateway.entities.CreateCloudProviderRequestData;
import com.fntsoftware.businessgateway.entities.CreateCloudProviderResponse;
import com.fntsoftware.businessgateway.entities.DeleteCloudProviderRequestData;
import com.fntsoftware.businessgateway.entities.DeleteCloudProviderResponse;
import com.fntsoftware.businessgateway.entities.UpdateCloudProviderRequestData;
import com.fntsoftware.businessgateway.entities.UpdateCloudProviderResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCloudProviderRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCloudProviderResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface CloudProviderApi extends ApiClient.Api {


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CloudProviderQueryResponse
   */
  @RequestLine("POST /api/rest/entity/cloudProvider/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CloudProviderQueryResponse cloudProviderQuery(@Param("sessionId") String sessionId, CloudProviderQueryRequest body);

  /**
   * Basic query
   * Similar to <code>cloudProviderQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cloudProvider/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CloudProviderQueryResponse> cloudProviderQueryWithHttpInfo(@Param("sessionId") String sessionId, CloudProviderQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>cloudProviderQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CloudProviderQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CloudProviderQueryResponse
   */
  @RequestLine("POST /api/rest/entity/cloudProvider/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CloudProviderQueryResponse cloudProviderQuery(CloudProviderQueryRequest body, @QueryMap(encoded=true) CloudProviderQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>cloudProviderQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CloudProviderQueryResponse
      */
      @RequestLine("POST /api/rest/entity/cloudProvider/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CloudProviderQueryResponse> cloudProviderQueryWithHttpInfo(CloudProviderQueryRequest body, @QueryMap(encoded=true) CloudProviderQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cloudProviderQuery</code> method in a fluent style.
   */
  public static class CloudProviderQueryQueryParams extends HashMap<String, Object> {
    public CloudProviderQueryQueryParams sessionId(final String value) {
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
   * @return CloudProviderSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/cloudProvider/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CloudProviderSystemAttributesResponse cloudProviderSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, CloudProviderSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>cloudProviderSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cloudProvider/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CloudProviderSystemAttributesResponse> cloudProviderSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CloudProviderSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>cloudProviderSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CloudProviderSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CloudProviderSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/cloudProvider/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CloudProviderSystemAttributesResponse cloudProviderSystemAttributes(@Param("elid") String elid, CloudProviderSystemAttributesRequest body, @QueryMap(encoded=true) CloudProviderSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>cloudProviderSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CloudProviderSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/cloudProvider/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CloudProviderSystemAttributesResponse> cloudProviderSystemAttributesWithHttpInfo(@Param("elid") String elid, CloudProviderSystemAttributesRequest body, @QueryMap(encoded=true) CloudProviderSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cloudProviderSystemAttributes</code> method in a fluent style.
   */
  public static class CloudProviderSystemAttributesQueryParams extends HashMap<String, Object> {
    public CloudProviderSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Tenant entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CloudProviderTenantsResponseData
   */
  @RequestLine("POST /api/rest/entity/cloudProvider/{elid}/Tenants?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CloudProviderTenantsResponseData cloudProviderTenants(@Param("sessionId") String sessionId, @Param("elid") String elid, CloudProviderTenantsRequestData body);

  /**
   * Get relations to Tenant entities
   * Similar to <code>cloudProviderTenants</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cloudProvider/{elid}/Tenants?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CloudProviderTenantsResponseData> cloudProviderTenantsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CloudProviderTenantsRequestData body);


  /**
   * Get relations to Tenant entities
   * 
   * Note, this is equivalent to the other <code>cloudProviderTenants</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CloudProviderTenantsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CloudProviderTenantsResponseData
   */
  @RequestLine("POST /api/rest/entity/cloudProvider/{elid}/Tenants?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CloudProviderTenantsResponseData cloudProviderTenants(@Param("elid") String elid, CloudProviderTenantsRequestData body, @QueryMap(encoded=true) CloudProviderTenantsQueryParams queryParams);

  /**
  * Get relations to Tenant entities
  * 
  * Note, this is equivalent to the other <code>cloudProviderTenants</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CloudProviderTenantsResponseData
      */
      @RequestLine("POST /api/rest/entity/cloudProvider/{elid}/Tenants?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CloudProviderTenantsResponseData> cloudProviderTenantsWithHttpInfo(@Param("elid") String elid, CloudProviderTenantsRequestData body, @QueryMap(encoded=true) CloudProviderTenantsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cloudProviderTenants</code> method in a fluent style.
   */
  public static class CloudProviderTenantsQueryParams extends HashMap<String, Object> {
    public CloudProviderTenantsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create
   * Create Cloud Provider
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateCloudProviderResponse
   */
  @RequestLine("POST /api/rest/entity/cloudProvider/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateCloudProviderResponse createCloudProvider(@Param("sessionId") String sessionId, CreateCloudProviderRequestData body);

  /**
   * Create
   * Similar to <code>createCloudProvider</code> but it also returns the http response headers .
   * Create Cloud Provider
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cloudProvider/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateCloudProviderResponse> createCloudProviderWithHttpInfo(@Param("sessionId") String sessionId, CreateCloudProviderRequestData body);


  /**
   * Create
   * Create Cloud Provider
   * Note, this is equivalent to the other <code>createCloudProvider</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateCloudProviderQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateCloudProviderResponse
   */
  @RequestLine("POST /api/rest/entity/cloudProvider/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateCloudProviderResponse createCloudProvider(CreateCloudProviderRequestData body, @QueryMap(encoded=true) CreateCloudProviderQueryParams queryParams);

  /**
  * Create
  * Create Cloud Provider
  * Note, this is equivalent to the other <code>createCloudProvider</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateCloudProviderResponse
      */
      @RequestLine("POST /api/rest/entity/cloudProvider/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateCloudProviderResponse> createCloudProviderWithHttpInfo(CreateCloudProviderRequestData body, @QueryMap(encoded=true) CreateCloudProviderQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createCloudProvider</code> method in a fluent style.
   */
  public static class CreateCloudProviderQueryParams extends HashMap<String, Object> {
    public CreateCloudProviderQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Cloud Provider
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteCloudProviderResponse
   */
  @RequestLine("POST /api/rest/entity/cloudProvider/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteCloudProviderResponse deleteCloudProvider(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCloudProviderRequestData body);

  /**
   * Delete
   * Similar to <code>deleteCloudProvider</code> but it also returns the http response headers .
   * Delete Cloud Provider
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cloudProvider/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteCloudProviderResponse> deleteCloudProviderWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCloudProviderRequestData body);


  /**
   * Delete
   * Delete Cloud Provider
   * Note, this is equivalent to the other <code>deleteCloudProvider</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteCloudProviderQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteCloudProviderResponse
   */
  @RequestLine("POST /api/rest/entity/cloudProvider/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteCloudProviderResponse deleteCloudProvider(@Param("elid") String elid, DeleteCloudProviderRequestData body, @QueryMap(encoded=true) DeleteCloudProviderQueryParams queryParams);

  /**
  * Delete
  * Delete Cloud Provider
  * Note, this is equivalent to the other <code>deleteCloudProvider</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteCloudProviderResponse
      */
      @RequestLine("POST /api/rest/entity/cloudProvider/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteCloudProviderResponse> deleteCloudProviderWithHttpInfo(@Param("elid") String elid, DeleteCloudProviderRequestData body, @QueryMap(encoded=true) DeleteCloudProviderQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteCloudProvider</code> method in a fluent style.
   */
  public static class DeleteCloudProviderQueryParams extends HashMap<String, Object> {
    public DeleteCloudProviderQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Cloud Provider
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateCloudProviderResponse
   */
  @RequestLine("POST /api/rest/entity/cloudProvider/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateCloudProviderResponse updateCloudProvider(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCloudProviderRequestData body);

  /**
   * Modify
   * Similar to <code>updateCloudProvider</code> but it also returns the http response headers .
   * Modify Cloud Provider
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cloudProvider/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateCloudProviderResponse> updateCloudProviderWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCloudProviderRequestData body);


  /**
   * Modify
   * Modify Cloud Provider
   * Note, this is equivalent to the other <code>updateCloudProvider</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateCloudProviderQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateCloudProviderResponse
   */
  @RequestLine("POST /api/rest/entity/cloudProvider/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateCloudProviderResponse updateCloudProvider(@Param("elid") String elid, UpdateCloudProviderRequestData body, @QueryMap(encoded=true) UpdateCloudProviderQueryParams queryParams);

  /**
  * Modify
  * Modify Cloud Provider
  * Note, this is equivalent to the other <code>updateCloudProvider</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateCloudProviderResponse
      */
      @RequestLine("POST /api/rest/entity/cloudProvider/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateCloudProviderResponse> updateCloudProviderWithHttpInfo(@Param("elid") String elid, UpdateCloudProviderRequestData body, @QueryMap(encoded=true) UpdateCloudProviderQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateCloudProvider</code> method in a fluent style.
   */
  public static class UpdateCloudProviderQueryParams extends HashMap<String, Object> {
    public UpdateCloudProviderQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesCloudProviderResponse
   */
  @RequestLine("POST /api/rest/entity/cloudProvider/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesCloudProviderResponse updateSystemAttributesCloudProvider(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCloudProviderRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesCloudProvider</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cloudProvider/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesCloudProviderResponse> updateSystemAttributesCloudProviderWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCloudProviderRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesCloudProvider</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesCloudProviderQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesCloudProviderResponse
   */
  @RequestLine("POST /api/rest/entity/cloudProvider/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesCloudProviderResponse updateSystemAttributesCloudProvider(@Param("elid") String elid, UpdateSystemAttributesCloudProviderRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCloudProviderQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesCloudProvider</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesCloudProviderResponse
      */
      @RequestLine("POST /api/rest/entity/cloudProvider/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesCloudProviderResponse> updateSystemAttributesCloudProviderWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesCloudProviderRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCloudProviderQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesCloudProvider</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesCloudProviderQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesCloudProviderQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
