package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateResourceGroupRequestData;
import com.fntsoftware.businessgateway.entities.CreateResourceGroupResponse;
import com.fntsoftware.businessgateway.entities.DeleteResourceGroupRequestData;
import com.fntsoftware.businessgateway.entities.DeleteResourceGroupResponse;
import com.fntsoftware.businessgateway.entities.ResourceGroupContractsRequestData;
import com.fntsoftware.businessgateway.entities.ResourceGroupContractsResponseData;
import com.fntsoftware.businessgateway.entities.ResourceGroupFailoverClustersRequestData;
import com.fntsoftware.businessgateway.entities.ResourceGroupFailoverClustersResponseData;
import com.fntsoftware.businessgateway.entities.ResourceGroupFileSystemsRequestData;
import com.fntsoftware.businessgateway.entities.ResourceGroupFileSystemsResponseData;
import com.fntsoftware.businessgateway.entities.ResourceGroupFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.ResourceGroupFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.ResourceGroupGenericResourcesRequestData;
import com.fntsoftware.businessgateway.entities.ResourceGroupGenericResourcesResponseData;
import com.fntsoftware.businessgateway.entities.ResourceGroupIpv4AddressesRequestData;
import com.fntsoftware.businessgateway.entities.ResourceGroupIpv4AddressesResponseData;
import com.fntsoftware.businessgateway.entities.ResourceGroupIpv6AddressesRequestData;
import com.fntsoftware.businessgateway.entities.ResourceGroupIpv6AddressesResponseData;
import com.fntsoftware.businessgateway.entities.ResourceGroupMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.ResourceGroupMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.ResourceGroupMaintenanceWindowsRequestData;
import com.fntsoftware.businessgateway.entities.ResourceGroupMaintenanceWindowsResponseData;
import com.fntsoftware.businessgateway.entities.ResourceGroupOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.ResourceGroupOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.ResourceGroupPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.ResourceGroupPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.ResourceGroupPersonsRequestData;
import com.fntsoftware.businessgateway.entities.ResourceGroupPersonsResponseData;
import com.fntsoftware.businessgateway.entities.ResourceGroupQueryRequest;
import com.fntsoftware.businessgateway.entities.ResourceGroupQueryResponse;
import com.fntsoftware.businessgateway.entities.ResourceGroupSoftwareInstallationRequestData;
import com.fntsoftware.businessgateway.entities.ResourceGroupSoftwareInstallationResponseData;
import com.fntsoftware.businessgateway.entities.ResourceGroupSoftwareInstancesMssqldbRequestData;
import com.fntsoftware.businessgateway.entities.ResourceGroupSoftwareInstancesMssqldbResponseData;
import com.fntsoftware.businessgateway.entities.ResourceGroupSoftwareInstancesOracledbRequestData;
import com.fntsoftware.businessgateway.entities.ResourceGroupSoftwareInstancesOracledbResponseData;
import com.fntsoftware.businessgateway.entities.ResourceGroupSoftwareInstancesRequestData;
import com.fntsoftware.businessgateway.entities.ResourceGroupSoftwareInstancesResponseData;
import com.fntsoftware.businessgateway.entities.ResourceGroupSoftwareInstancesSapRequestData;
import com.fntsoftware.businessgateway.entities.ResourceGroupSoftwareInstancesSapResponseData;
import com.fntsoftware.businessgateway.entities.ResourceGroupSoftwareInstancesWebRequestData;
import com.fntsoftware.businessgateway.entities.ResourceGroupSoftwareInstancesWebResponseData;
import com.fntsoftware.businessgateway.entities.ResourceGroupSoftwareInstancesWindowsserviceRequestData;
import com.fntsoftware.businessgateway.entities.ResourceGroupSoftwareInstancesWindowsserviceResponseData;
import com.fntsoftware.businessgateway.entities.ResourceGroupSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.ResourceGroupSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.ResourceGroupTenantRequestData;
import com.fntsoftware.businessgateway.entities.ResourceGroupTenantResponseData;
import com.fntsoftware.businessgateway.entities.ResourceGroupVirtualServersRequestData;
import com.fntsoftware.businessgateway.entities.ResourceGroupVirtualServersResponseData;
import com.fntsoftware.businessgateway.entities.UpdateResourceGroupRequestData;
import com.fntsoftware.businessgateway.entities.UpdateResourceGroupResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesResourceGroupRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesResourceGroupResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface ResourceGroupApi extends ApiClient.Api {


  /**
   * Create
   * Create resource group
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateResourceGroupResponse
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateResourceGroupResponse createResourceGroup(@Param("sessionId") String sessionId, CreateResourceGroupRequestData body);

  /**
   * Create
   * Similar to <code>createResourceGroup</code> but it also returns the http response headers .
   * Create resource group
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateResourceGroupResponse> createResourceGroupWithHttpInfo(@Param("sessionId") String sessionId, CreateResourceGroupRequestData body);


  /**
   * Create
   * Create resource group
   * Note, this is equivalent to the other <code>createResourceGroup</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateResourceGroupQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateResourceGroupResponse
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateResourceGroupResponse createResourceGroup(CreateResourceGroupRequestData body, @QueryMap(encoded=true) CreateResourceGroupQueryParams queryParams);

  /**
  * Create
  * Create resource group
  * Note, this is equivalent to the other <code>createResourceGroup</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateResourceGroupResponse
      */
      @RequestLine("POST /api/rest/entity/resourceGroup/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateResourceGroupResponse> createResourceGroupWithHttpInfo(CreateResourceGroupRequestData body, @QueryMap(encoded=true) CreateResourceGroupQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createResourceGroup</code> method in a fluent style.
   */
  public static class CreateResourceGroupQueryParams extends HashMap<String, Object> {
    public CreateResourceGroupQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete resource group
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteResourceGroupResponse
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteResourceGroupResponse deleteResourceGroup(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteResourceGroupRequestData body);

  /**
   * Delete
   * Similar to <code>deleteResourceGroup</code> but it also returns the http response headers .
   * Delete resource group
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteResourceGroupResponse> deleteResourceGroupWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteResourceGroupRequestData body);


  /**
   * Delete
   * Delete resource group
   * Note, this is equivalent to the other <code>deleteResourceGroup</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteResourceGroupQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteResourceGroupResponse
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteResourceGroupResponse deleteResourceGroup(@Param("elid") String elid, DeleteResourceGroupRequestData body, @QueryMap(encoded=true) DeleteResourceGroupQueryParams queryParams);

  /**
  * Delete
  * Delete resource group
  * Note, this is equivalent to the other <code>deleteResourceGroup</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteResourceGroupResponse
      */
      @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteResourceGroupResponse> deleteResourceGroupWithHttpInfo(@Param("elid") String elid, DeleteResourceGroupRequestData body, @QueryMap(encoded=true) DeleteResourceGroupQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteResourceGroup</code> method in a fluent style.
   */
  public static class DeleteResourceGroupQueryParams extends HashMap<String, Object> {
    public DeleteResourceGroupQueryParams sessionId(final String value) {
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
   * @return ResourceGroupContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ResourceGroupContractsResponseData resourceGroupContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ResourceGroupContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>resourceGroupContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ResourceGroupContractsResponseData> resourceGroupContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ResourceGroupContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>resourceGroupContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ResourceGroupContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ResourceGroupContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ResourceGroupContractsResponseData resourceGroupContracts(@Param("elid") String elid, ResourceGroupContractsRequestData body, @QueryMap(encoded=true) ResourceGroupContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>resourceGroupContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ResourceGroupContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ResourceGroupContractsResponseData> resourceGroupContractsWithHttpInfo(@Param("elid") String elid, ResourceGroupContractsRequestData body, @QueryMap(encoded=true) ResourceGroupContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>resourceGroupContracts</code> method in a fluent style.
   */
  public static class ResourceGroupContractsQueryParams extends HashMap<String, Object> {
    public ResourceGroupContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Failover Cluster entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ResourceGroupFailoverClustersResponseData
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/FailoverClusters?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ResourceGroupFailoverClustersResponseData resourceGroupFailoverClusters(@Param("sessionId") String sessionId, @Param("elid") String elid, ResourceGroupFailoverClustersRequestData body);

  /**
   * Get relations to Failover Cluster entities
   * Similar to <code>resourceGroupFailoverClusters</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/FailoverClusters?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ResourceGroupFailoverClustersResponseData> resourceGroupFailoverClustersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ResourceGroupFailoverClustersRequestData body);


  /**
   * Get relations to Failover Cluster entities
   * 
   * Note, this is equivalent to the other <code>resourceGroupFailoverClusters</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ResourceGroupFailoverClustersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ResourceGroupFailoverClustersResponseData
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/FailoverClusters?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ResourceGroupFailoverClustersResponseData resourceGroupFailoverClusters(@Param("elid") String elid, ResourceGroupFailoverClustersRequestData body, @QueryMap(encoded=true) ResourceGroupFailoverClustersQueryParams queryParams);

  /**
  * Get relations to Failover Cluster entities
  * 
  * Note, this is equivalent to the other <code>resourceGroupFailoverClusters</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ResourceGroupFailoverClustersResponseData
      */
      @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/FailoverClusters?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ResourceGroupFailoverClustersResponseData> resourceGroupFailoverClustersWithHttpInfo(@Param("elid") String elid, ResourceGroupFailoverClustersRequestData body, @QueryMap(encoded=true) ResourceGroupFailoverClustersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>resourceGroupFailoverClusters</code> method in a fluent style.
   */
  public static class ResourceGroupFailoverClustersQueryParams extends HashMap<String, Object> {
    public ResourceGroupFailoverClustersQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to File system entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ResourceGroupFileSystemsResponseData
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/FileSystems?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ResourceGroupFileSystemsResponseData resourceGroupFileSystems(@Param("sessionId") String sessionId, @Param("elid") String elid, ResourceGroupFileSystemsRequestData body);

  /**
   * Get relations to File system entities
   * Similar to <code>resourceGroupFileSystems</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/FileSystems?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ResourceGroupFileSystemsResponseData> resourceGroupFileSystemsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ResourceGroupFileSystemsRequestData body);


  /**
   * Get relations to File system entities
   * 
   * Note, this is equivalent to the other <code>resourceGroupFileSystems</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ResourceGroupFileSystemsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ResourceGroupFileSystemsResponseData
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/FileSystems?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ResourceGroupFileSystemsResponseData resourceGroupFileSystems(@Param("elid") String elid, ResourceGroupFileSystemsRequestData body, @QueryMap(encoded=true) ResourceGroupFileSystemsQueryParams queryParams);

  /**
  * Get relations to File system entities
  * 
  * Note, this is equivalent to the other <code>resourceGroupFileSystems</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ResourceGroupFileSystemsResponseData
      */
      @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/FileSystems?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ResourceGroupFileSystemsResponseData> resourceGroupFileSystemsWithHttpInfo(@Param("elid") String elid, ResourceGroupFileSystemsRequestData body, @QueryMap(encoded=true) ResourceGroupFileSystemsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>resourceGroupFileSystems</code> method in a fluent style.
   */
  public static class ResourceGroupFileSystemsQueryParams extends HashMap<String, Object> {
    public ResourceGroupFileSystemsQueryParams sessionId(final String value) {
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
   * @return ResourceGroupFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ResourceGroupFrameContractsResponseData resourceGroupFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ResourceGroupFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>resourceGroupFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ResourceGroupFrameContractsResponseData> resourceGroupFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ResourceGroupFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>resourceGroupFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ResourceGroupFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ResourceGroupFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ResourceGroupFrameContractsResponseData resourceGroupFrameContracts(@Param("elid") String elid, ResourceGroupFrameContractsRequestData body, @QueryMap(encoded=true) ResourceGroupFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>resourceGroupFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ResourceGroupFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ResourceGroupFrameContractsResponseData> resourceGroupFrameContractsWithHttpInfo(@Param("elid") String elid, ResourceGroupFrameContractsRequestData body, @QueryMap(encoded=true) ResourceGroupFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>resourceGroupFrameContracts</code> method in a fluent style.
   */
  public static class ResourceGroupFrameContractsQueryParams extends HashMap<String, Object> {
    public ResourceGroupFrameContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Generic Resource entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ResourceGroupGenericResourcesResponseData
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/GenericResources?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ResourceGroupGenericResourcesResponseData resourceGroupGenericResources(@Param("sessionId") String sessionId, @Param("elid") String elid, ResourceGroupGenericResourcesRequestData body);

  /**
   * Get relations to Generic Resource entities
   * Similar to <code>resourceGroupGenericResources</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/GenericResources?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ResourceGroupGenericResourcesResponseData> resourceGroupGenericResourcesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ResourceGroupGenericResourcesRequestData body);


  /**
   * Get relations to Generic Resource entities
   * 
   * Note, this is equivalent to the other <code>resourceGroupGenericResources</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ResourceGroupGenericResourcesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ResourceGroupGenericResourcesResponseData
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/GenericResources?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ResourceGroupGenericResourcesResponseData resourceGroupGenericResources(@Param("elid") String elid, ResourceGroupGenericResourcesRequestData body, @QueryMap(encoded=true) ResourceGroupGenericResourcesQueryParams queryParams);

  /**
  * Get relations to Generic Resource entities
  * 
  * Note, this is equivalent to the other <code>resourceGroupGenericResources</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ResourceGroupGenericResourcesResponseData
      */
      @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/GenericResources?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ResourceGroupGenericResourcesResponseData> resourceGroupGenericResourcesWithHttpInfo(@Param("elid") String elid, ResourceGroupGenericResourcesRequestData body, @QueryMap(encoded=true) ResourceGroupGenericResourcesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>resourceGroupGenericResources</code> method in a fluent style.
   */
  public static class ResourceGroupGenericResourcesQueryParams extends HashMap<String, Object> {
    public ResourceGroupGenericResourcesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to IPv4 address entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ResourceGroupIpv4AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ResourceGroupIpv4AddressesResponseData resourceGroupIpv4Addresses(@Param("sessionId") String sessionId, @Param("elid") String elid, ResourceGroupIpv4AddressesRequestData body);

  /**
   * Get relations to IPv4 address entities
   * Similar to <code>resourceGroupIpv4Addresses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ResourceGroupIpv4AddressesResponseData> resourceGroupIpv4AddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ResourceGroupIpv4AddressesRequestData body);


  /**
   * Get relations to IPv4 address entities
   * 
   * Note, this is equivalent to the other <code>resourceGroupIpv4Addresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ResourceGroupIpv4AddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ResourceGroupIpv4AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ResourceGroupIpv4AddressesResponseData resourceGroupIpv4Addresses(@Param("elid") String elid, ResourceGroupIpv4AddressesRequestData body, @QueryMap(encoded=true) ResourceGroupIpv4AddressesQueryParams queryParams);

  /**
  * Get relations to IPv4 address entities
  * 
  * Note, this is equivalent to the other <code>resourceGroupIpv4Addresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ResourceGroupIpv4AddressesResponseData
      */
      @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/Ipv4Addresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ResourceGroupIpv4AddressesResponseData> resourceGroupIpv4AddressesWithHttpInfo(@Param("elid") String elid, ResourceGroupIpv4AddressesRequestData body, @QueryMap(encoded=true) ResourceGroupIpv4AddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>resourceGroupIpv4Addresses</code> method in a fluent style.
   */
  public static class ResourceGroupIpv4AddressesQueryParams extends HashMap<String, Object> {
    public ResourceGroupIpv4AddressesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to IPv6 address entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ResourceGroupIpv6AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/Ipv6Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ResourceGroupIpv6AddressesResponseData resourceGroupIpv6Addresses(@Param("sessionId") String sessionId, @Param("elid") String elid, ResourceGroupIpv6AddressesRequestData body);

  /**
   * Get relations to IPv6 address entities
   * Similar to <code>resourceGroupIpv6Addresses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/Ipv6Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ResourceGroupIpv6AddressesResponseData> resourceGroupIpv6AddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ResourceGroupIpv6AddressesRequestData body);


  /**
   * Get relations to IPv6 address entities
   * 
   * Note, this is equivalent to the other <code>resourceGroupIpv6Addresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ResourceGroupIpv6AddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ResourceGroupIpv6AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/Ipv6Addresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ResourceGroupIpv6AddressesResponseData resourceGroupIpv6Addresses(@Param("elid") String elid, ResourceGroupIpv6AddressesRequestData body, @QueryMap(encoded=true) ResourceGroupIpv6AddressesQueryParams queryParams);

  /**
  * Get relations to IPv6 address entities
  * 
  * Note, this is equivalent to the other <code>resourceGroupIpv6Addresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ResourceGroupIpv6AddressesResponseData
      */
      @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/Ipv6Addresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ResourceGroupIpv6AddressesResponseData> resourceGroupIpv6AddressesWithHttpInfo(@Param("elid") String elid, ResourceGroupIpv6AddressesRequestData body, @QueryMap(encoded=true) ResourceGroupIpv6AddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>resourceGroupIpv6Addresses</code> method in a fluent style.
   */
  public static class ResourceGroupIpv6AddressesQueryParams extends HashMap<String, Object> {
    public ResourceGroupIpv6AddressesQueryParams sessionId(final String value) {
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
   * @return ResourceGroupMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ResourceGroupMaintenanceContractsResponseData resourceGroupMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ResourceGroupMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>resourceGroupMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ResourceGroupMaintenanceContractsResponseData> resourceGroupMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ResourceGroupMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>resourceGroupMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ResourceGroupMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ResourceGroupMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ResourceGroupMaintenanceContractsResponseData resourceGroupMaintenanceContracts(@Param("elid") String elid, ResourceGroupMaintenanceContractsRequestData body, @QueryMap(encoded=true) ResourceGroupMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>resourceGroupMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ResourceGroupMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ResourceGroupMaintenanceContractsResponseData> resourceGroupMaintenanceContractsWithHttpInfo(@Param("elid") String elid, ResourceGroupMaintenanceContractsRequestData body, @QueryMap(encoded=true) ResourceGroupMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>resourceGroupMaintenanceContracts</code> method in a fluent style.
   */
  public static class ResourceGroupMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public ResourceGroupMaintenanceContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Maintenance window entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ResourceGroupMaintenanceWindowsResponseData
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/MaintenanceWindows?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ResourceGroupMaintenanceWindowsResponseData resourceGroupMaintenanceWindows(@Param("sessionId") String sessionId, @Param("elid") String elid, ResourceGroupMaintenanceWindowsRequestData body);

  /**
   * Get relations to Maintenance window entities
   * Similar to <code>resourceGroupMaintenanceWindows</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/MaintenanceWindows?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ResourceGroupMaintenanceWindowsResponseData> resourceGroupMaintenanceWindowsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ResourceGroupMaintenanceWindowsRequestData body);


  /**
   * Get relations to Maintenance window entities
   * 
   * Note, this is equivalent to the other <code>resourceGroupMaintenanceWindows</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ResourceGroupMaintenanceWindowsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ResourceGroupMaintenanceWindowsResponseData
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/MaintenanceWindows?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ResourceGroupMaintenanceWindowsResponseData resourceGroupMaintenanceWindows(@Param("elid") String elid, ResourceGroupMaintenanceWindowsRequestData body, @QueryMap(encoded=true) ResourceGroupMaintenanceWindowsQueryParams queryParams);

  /**
  * Get relations to Maintenance window entities
  * 
  * Note, this is equivalent to the other <code>resourceGroupMaintenanceWindows</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ResourceGroupMaintenanceWindowsResponseData
      */
      @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/MaintenanceWindows?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ResourceGroupMaintenanceWindowsResponseData> resourceGroupMaintenanceWindowsWithHttpInfo(@Param("elid") String elid, ResourceGroupMaintenanceWindowsRequestData body, @QueryMap(encoded=true) ResourceGroupMaintenanceWindowsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>resourceGroupMaintenanceWindows</code> method in a fluent style.
   */
  public static class ResourceGroupMaintenanceWindowsQueryParams extends HashMap<String, Object> {
    public ResourceGroupMaintenanceWindowsQueryParams sessionId(final String value) {
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
   * @return ResourceGroupOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ResourceGroupOrganizationsResponseData resourceGroupOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, ResourceGroupOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>resourceGroupOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ResourceGroupOrganizationsResponseData> resourceGroupOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ResourceGroupOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>resourceGroupOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ResourceGroupOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ResourceGroupOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ResourceGroupOrganizationsResponseData resourceGroupOrganizations(@Param("elid") String elid, ResourceGroupOrganizationsRequestData body, @QueryMap(encoded=true) ResourceGroupOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>resourceGroupOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ResourceGroupOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ResourceGroupOrganizationsResponseData> resourceGroupOrganizationsWithHttpInfo(@Param("elid") String elid, ResourceGroupOrganizationsRequestData body, @QueryMap(encoded=true) ResourceGroupOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>resourceGroupOrganizations</code> method in a fluent style.
   */
  public static class ResourceGroupOrganizationsQueryParams extends HashMap<String, Object> {
    public ResourceGroupOrganizationsQueryParams sessionId(final String value) {
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
   * @return ResourceGroupPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ResourceGroupPersonGroupsResponseData resourceGroupPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, ResourceGroupPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>resourceGroupPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ResourceGroupPersonGroupsResponseData> resourceGroupPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ResourceGroupPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>resourceGroupPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ResourceGroupPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ResourceGroupPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ResourceGroupPersonGroupsResponseData resourceGroupPersonGroups(@Param("elid") String elid, ResourceGroupPersonGroupsRequestData body, @QueryMap(encoded=true) ResourceGroupPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>resourceGroupPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ResourceGroupPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ResourceGroupPersonGroupsResponseData> resourceGroupPersonGroupsWithHttpInfo(@Param("elid") String elid, ResourceGroupPersonGroupsRequestData body, @QueryMap(encoded=true) ResourceGroupPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>resourceGroupPersonGroups</code> method in a fluent style.
   */
  public static class ResourceGroupPersonGroupsQueryParams extends HashMap<String, Object> {
    public ResourceGroupPersonGroupsQueryParams sessionId(final String value) {
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
   * @return ResourceGroupPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ResourceGroupPersonsResponseData resourceGroupPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, ResourceGroupPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>resourceGroupPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ResourceGroupPersonsResponseData> resourceGroupPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ResourceGroupPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>resourceGroupPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ResourceGroupPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ResourceGroupPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ResourceGroupPersonsResponseData resourceGroupPersons(@Param("elid") String elid, ResourceGroupPersonsRequestData body, @QueryMap(encoded=true) ResourceGroupPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>resourceGroupPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ResourceGroupPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ResourceGroupPersonsResponseData> resourceGroupPersonsWithHttpInfo(@Param("elid") String elid, ResourceGroupPersonsRequestData body, @QueryMap(encoded=true) ResourceGroupPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>resourceGroupPersons</code> method in a fluent style.
   */
  public static class ResourceGroupPersonsQueryParams extends HashMap<String, Object> {
    public ResourceGroupPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ResourceGroupQueryResponse
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ResourceGroupQueryResponse resourceGroupQuery(@Param("sessionId") String sessionId, ResourceGroupQueryRequest body);

  /**
   * Basic query
   * Similar to <code>resourceGroupQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ResourceGroupQueryResponse> resourceGroupQueryWithHttpInfo(@Param("sessionId") String sessionId, ResourceGroupQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>resourceGroupQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ResourceGroupQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ResourceGroupQueryResponse
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ResourceGroupQueryResponse resourceGroupQuery(ResourceGroupQueryRequest body, @QueryMap(encoded=true) ResourceGroupQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>resourceGroupQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ResourceGroupQueryResponse
      */
      @RequestLine("POST /api/rest/entity/resourceGroup/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ResourceGroupQueryResponse> resourceGroupQueryWithHttpInfo(ResourceGroupQueryRequest body, @QueryMap(encoded=true) ResourceGroupQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>resourceGroupQuery</code> method in a fluent style.
   */
  public static class ResourceGroupQueryQueryParams extends HashMap<String, Object> {
    public ResourceGroupQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Software installation entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ResourceGroupSoftwareInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/SoftwareInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ResourceGroupSoftwareInstallationResponseData resourceGroupSoftwareInstallation(@Param("sessionId") String sessionId, @Param("elid") String elid, ResourceGroupSoftwareInstallationRequestData body);

  /**
   * Get relations to Software installation entities
   * Similar to <code>resourceGroupSoftwareInstallation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/SoftwareInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ResourceGroupSoftwareInstallationResponseData> resourceGroupSoftwareInstallationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ResourceGroupSoftwareInstallationRequestData body);


  /**
   * Get relations to Software installation entities
   * 
   * Note, this is equivalent to the other <code>resourceGroupSoftwareInstallation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ResourceGroupSoftwareInstallationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ResourceGroupSoftwareInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/SoftwareInstallation?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ResourceGroupSoftwareInstallationResponseData resourceGroupSoftwareInstallation(@Param("elid") String elid, ResourceGroupSoftwareInstallationRequestData body, @QueryMap(encoded=true) ResourceGroupSoftwareInstallationQueryParams queryParams);

  /**
  * Get relations to Software installation entities
  * 
  * Note, this is equivalent to the other <code>resourceGroupSoftwareInstallation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ResourceGroupSoftwareInstallationResponseData
      */
      @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/SoftwareInstallation?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ResourceGroupSoftwareInstallationResponseData> resourceGroupSoftwareInstallationWithHttpInfo(@Param("elid") String elid, ResourceGroupSoftwareInstallationRequestData body, @QueryMap(encoded=true) ResourceGroupSoftwareInstallationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>resourceGroupSoftwareInstallation</code> method in a fluent style.
   */
  public static class ResourceGroupSoftwareInstallationQueryParams extends HashMap<String, Object> {
    public ResourceGroupSoftwareInstallationQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Software instance entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ResourceGroupSoftwareInstancesResponseData
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/SoftwareInstances?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ResourceGroupSoftwareInstancesResponseData resourceGroupSoftwareInstances(@Param("sessionId") String sessionId, @Param("elid") String elid, ResourceGroupSoftwareInstancesRequestData body);

  /**
   * Get relations to Software instance entities
   * Similar to <code>resourceGroupSoftwareInstances</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/SoftwareInstances?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ResourceGroupSoftwareInstancesResponseData> resourceGroupSoftwareInstancesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ResourceGroupSoftwareInstancesRequestData body);


  /**
   * Get relations to Software instance entities
   * 
   * Note, this is equivalent to the other <code>resourceGroupSoftwareInstances</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ResourceGroupSoftwareInstancesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ResourceGroupSoftwareInstancesResponseData
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/SoftwareInstances?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ResourceGroupSoftwareInstancesResponseData resourceGroupSoftwareInstances(@Param("elid") String elid, ResourceGroupSoftwareInstancesRequestData body, @QueryMap(encoded=true) ResourceGroupSoftwareInstancesQueryParams queryParams);

  /**
  * Get relations to Software instance entities
  * 
  * Note, this is equivalent to the other <code>resourceGroupSoftwareInstances</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ResourceGroupSoftwareInstancesResponseData
      */
      @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/SoftwareInstances?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ResourceGroupSoftwareInstancesResponseData> resourceGroupSoftwareInstancesWithHttpInfo(@Param("elid") String elid, ResourceGroupSoftwareInstancesRequestData body, @QueryMap(encoded=true) ResourceGroupSoftwareInstancesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>resourceGroupSoftwareInstances</code> method in a fluent style.
   */
  public static class ResourceGroupSoftwareInstancesQueryParams extends HashMap<String, Object> {
    public ResourceGroupSoftwareInstancesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Software instance MS SQL DB entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ResourceGroupSoftwareInstancesMssqldbResponseData
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/SoftwareInstancesMssqldb?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ResourceGroupSoftwareInstancesMssqldbResponseData resourceGroupSoftwareInstancesMssqldb(@Param("sessionId") String sessionId, @Param("elid") String elid, ResourceGroupSoftwareInstancesMssqldbRequestData body);

  /**
   * Get relations to Software instance MS SQL DB entities
   * Similar to <code>resourceGroupSoftwareInstancesMssqldb</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/SoftwareInstancesMssqldb?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ResourceGroupSoftwareInstancesMssqldbResponseData> resourceGroupSoftwareInstancesMssqldbWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ResourceGroupSoftwareInstancesMssqldbRequestData body);


  /**
   * Get relations to Software instance MS SQL DB entities
   * 
   * Note, this is equivalent to the other <code>resourceGroupSoftwareInstancesMssqldb</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ResourceGroupSoftwareInstancesMssqldbQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ResourceGroupSoftwareInstancesMssqldbResponseData
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/SoftwareInstancesMssqldb?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ResourceGroupSoftwareInstancesMssqldbResponseData resourceGroupSoftwareInstancesMssqldb(@Param("elid") String elid, ResourceGroupSoftwareInstancesMssqldbRequestData body, @QueryMap(encoded=true) ResourceGroupSoftwareInstancesMssqldbQueryParams queryParams);

  /**
  * Get relations to Software instance MS SQL DB entities
  * 
  * Note, this is equivalent to the other <code>resourceGroupSoftwareInstancesMssqldb</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ResourceGroupSoftwareInstancesMssqldbResponseData
      */
      @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/SoftwareInstancesMssqldb?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ResourceGroupSoftwareInstancesMssqldbResponseData> resourceGroupSoftwareInstancesMssqldbWithHttpInfo(@Param("elid") String elid, ResourceGroupSoftwareInstancesMssqldbRequestData body, @QueryMap(encoded=true) ResourceGroupSoftwareInstancesMssqldbQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>resourceGroupSoftwareInstancesMssqldb</code> method in a fluent style.
   */
  public static class ResourceGroupSoftwareInstancesMssqldbQueryParams extends HashMap<String, Object> {
    public ResourceGroupSoftwareInstancesMssqldbQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Software instance Oracle DB entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ResourceGroupSoftwareInstancesOracledbResponseData
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/SoftwareInstancesOracledb?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ResourceGroupSoftwareInstancesOracledbResponseData resourceGroupSoftwareInstancesOracledb(@Param("sessionId") String sessionId, @Param("elid") String elid, ResourceGroupSoftwareInstancesOracledbRequestData body);

  /**
   * Get relations to Software instance Oracle DB entities
   * Similar to <code>resourceGroupSoftwareInstancesOracledb</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/SoftwareInstancesOracledb?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ResourceGroupSoftwareInstancesOracledbResponseData> resourceGroupSoftwareInstancesOracledbWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ResourceGroupSoftwareInstancesOracledbRequestData body);


  /**
   * Get relations to Software instance Oracle DB entities
   * 
   * Note, this is equivalent to the other <code>resourceGroupSoftwareInstancesOracledb</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ResourceGroupSoftwareInstancesOracledbQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ResourceGroupSoftwareInstancesOracledbResponseData
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/SoftwareInstancesOracledb?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ResourceGroupSoftwareInstancesOracledbResponseData resourceGroupSoftwareInstancesOracledb(@Param("elid") String elid, ResourceGroupSoftwareInstancesOracledbRequestData body, @QueryMap(encoded=true) ResourceGroupSoftwareInstancesOracledbQueryParams queryParams);

  /**
  * Get relations to Software instance Oracle DB entities
  * 
  * Note, this is equivalent to the other <code>resourceGroupSoftwareInstancesOracledb</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ResourceGroupSoftwareInstancesOracledbResponseData
      */
      @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/SoftwareInstancesOracledb?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ResourceGroupSoftwareInstancesOracledbResponseData> resourceGroupSoftwareInstancesOracledbWithHttpInfo(@Param("elid") String elid, ResourceGroupSoftwareInstancesOracledbRequestData body, @QueryMap(encoded=true) ResourceGroupSoftwareInstancesOracledbQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>resourceGroupSoftwareInstancesOracledb</code> method in a fluent style.
   */
  public static class ResourceGroupSoftwareInstancesOracledbQueryParams extends HashMap<String, Object> {
    public ResourceGroupSoftwareInstancesOracledbQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Software instance SAP entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ResourceGroupSoftwareInstancesSapResponseData
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/SoftwareInstancesSap?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ResourceGroupSoftwareInstancesSapResponseData resourceGroupSoftwareInstancesSap(@Param("sessionId") String sessionId, @Param("elid") String elid, ResourceGroupSoftwareInstancesSapRequestData body);

  /**
   * Get relations to Software instance SAP entities
   * Similar to <code>resourceGroupSoftwareInstancesSap</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/SoftwareInstancesSap?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ResourceGroupSoftwareInstancesSapResponseData> resourceGroupSoftwareInstancesSapWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ResourceGroupSoftwareInstancesSapRequestData body);


  /**
   * Get relations to Software instance SAP entities
   * 
   * Note, this is equivalent to the other <code>resourceGroupSoftwareInstancesSap</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ResourceGroupSoftwareInstancesSapQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ResourceGroupSoftwareInstancesSapResponseData
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/SoftwareInstancesSap?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ResourceGroupSoftwareInstancesSapResponseData resourceGroupSoftwareInstancesSap(@Param("elid") String elid, ResourceGroupSoftwareInstancesSapRequestData body, @QueryMap(encoded=true) ResourceGroupSoftwareInstancesSapQueryParams queryParams);

  /**
  * Get relations to Software instance SAP entities
  * 
  * Note, this is equivalent to the other <code>resourceGroupSoftwareInstancesSap</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ResourceGroupSoftwareInstancesSapResponseData
      */
      @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/SoftwareInstancesSap?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ResourceGroupSoftwareInstancesSapResponseData> resourceGroupSoftwareInstancesSapWithHttpInfo(@Param("elid") String elid, ResourceGroupSoftwareInstancesSapRequestData body, @QueryMap(encoded=true) ResourceGroupSoftwareInstancesSapQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>resourceGroupSoftwareInstancesSap</code> method in a fluent style.
   */
  public static class ResourceGroupSoftwareInstancesSapQueryParams extends HashMap<String, Object> {
    public ResourceGroupSoftwareInstancesSapQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Software instance Web entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ResourceGroupSoftwareInstancesWebResponseData
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/SoftwareInstancesWeb?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ResourceGroupSoftwareInstancesWebResponseData resourceGroupSoftwareInstancesWeb(@Param("sessionId") String sessionId, @Param("elid") String elid, ResourceGroupSoftwareInstancesWebRequestData body);

  /**
   * Get relations to Software instance Web entities
   * Similar to <code>resourceGroupSoftwareInstancesWeb</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/SoftwareInstancesWeb?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ResourceGroupSoftwareInstancesWebResponseData> resourceGroupSoftwareInstancesWebWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ResourceGroupSoftwareInstancesWebRequestData body);


  /**
   * Get relations to Software instance Web entities
   * 
   * Note, this is equivalent to the other <code>resourceGroupSoftwareInstancesWeb</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ResourceGroupSoftwareInstancesWebQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ResourceGroupSoftwareInstancesWebResponseData
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/SoftwareInstancesWeb?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ResourceGroupSoftwareInstancesWebResponseData resourceGroupSoftwareInstancesWeb(@Param("elid") String elid, ResourceGroupSoftwareInstancesWebRequestData body, @QueryMap(encoded=true) ResourceGroupSoftwareInstancesWebQueryParams queryParams);

  /**
  * Get relations to Software instance Web entities
  * 
  * Note, this is equivalent to the other <code>resourceGroupSoftwareInstancesWeb</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ResourceGroupSoftwareInstancesWebResponseData
      */
      @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/SoftwareInstancesWeb?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ResourceGroupSoftwareInstancesWebResponseData> resourceGroupSoftwareInstancesWebWithHttpInfo(@Param("elid") String elid, ResourceGroupSoftwareInstancesWebRequestData body, @QueryMap(encoded=true) ResourceGroupSoftwareInstancesWebQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>resourceGroupSoftwareInstancesWeb</code> method in a fluent style.
   */
  public static class ResourceGroupSoftwareInstancesWebQueryParams extends HashMap<String, Object> {
    public ResourceGroupSoftwareInstancesWebQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Software instance Windows service entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ResourceGroupSoftwareInstancesWindowsserviceResponseData
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/SoftwareInstancesWindowsservice?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ResourceGroupSoftwareInstancesWindowsserviceResponseData resourceGroupSoftwareInstancesWindowsservice(@Param("sessionId") String sessionId, @Param("elid") String elid, ResourceGroupSoftwareInstancesWindowsserviceRequestData body);

  /**
   * Get relations to Software instance Windows service entities
   * Similar to <code>resourceGroupSoftwareInstancesWindowsservice</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/SoftwareInstancesWindowsservice?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ResourceGroupSoftwareInstancesWindowsserviceResponseData> resourceGroupSoftwareInstancesWindowsserviceWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ResourceGroupSoftwareInstancesWindowsserviceRequestData body);


  /**
   * Get relations to Software instance Windows service entities
   * 
   * Note, this is equivalent to the other <code>resourceGroupSoftwareInstancesWindowsservice</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ResourceGroupSoftwareInstancesWindowsserviceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ResourceGroupSoftwareInstancesWindowsserviceResponseData
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/SoftwareInstancesWindowsservice?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ResourceGroupSoftwareInstancesWindowsserviceResponseData resourceGroupSoftwareInstancesWindowsservice(@Param("elid") String elid, ResourceGroupSoftwareInstancesWindowsserviceRequestData body, @QueryMap(encoded=true) ResourceGroupSoftwareInstancesWindowsserviceQueryParams queryParams);

  /**
  * Get relations to Software instance Windows service entities
  * 
  * Note, this is equivalent to the other <code>resourceGroupSoftwareInstancesWindowsservice</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ResourceGroupSoftwareInstancesWindowsserviceResponseData
      */
      @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/SoftwareInstancesWindowsservice?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ResourceGroupSoftwareInstancesWindowsserviceResponseData> resourceGroupSoftwareInstancesWindowsserviceWithHttpInfo(@Param("elid") String elid, ResourceGroupSoftwareInstancesWindowsserviceRequestData body, @QueryMap(encoded=true) ResourceGroupSoftwareInstancesWindowsserviceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>resourceGroupSoftwareInstancesWindowsservice</code> method in a fluent style.
   */
  public static class ResourceGroupSoftwareInstancesWindowsserviceQueryParams extends HashMap<String, Object> {
    public ResourceGroupSoftwareInstancesWindowsserviceQueryParams sessionId(final String value) {
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
   * @return ResourceGroupSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ResourceGroupSystemAttributesResponse resourceGroupSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, ResourceGroupSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>resourceGroupSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ResourceGroupSystemAttributesResponse> resourceGroupSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ResourceGroupSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>resourceGroupSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ResourceGroupSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ResourceGroupSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ResourceGroupSystemAttributesResponse resourceGroupSystemAttributes(@Param("elid") String elid, ResourceGroupSystemAttributesRequest body, @QueryMap(encoded=true) ResourceGroupSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>resourceGroupSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ResourceGroupSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ResourceGroupSystemAttributesResponse> resourceGroupSystemAttributesWithHttpInfo(@Param("elid") String elid, ResourceGroupSystemAttributesRequest body, @QueryMap(encoded=true) ResourceGroupSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>resourceGroupSystemAttributes</code> method in a fluent style.
   */
  public static class ResourceGroupSystemAttributesQueryParams extends HashMap<String, Object> {
    public ResourceGroupSystemAttributesQueryParams sessionId(final String value) {
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
   * @return ResourceGroupTenantResponseData
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/Tenant?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ResourceGroupTenantResponseData resourceGroupTenant(@Param("sessionId") String sessionId, @Param("elid") String elid, ResourceGroupTenantRequestData body);

  /**
   * Get relations to Tenant entities
   * Similar to <code>resourceGroupTenant</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/Tenant?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ResourceGroupTenantResponseData> resourceGroupTenantWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ResourceGroupTenantRequestData body);


  /**
   * Get relations to Tenant entities
   * 
   * Note, this is equivalent to the other <code>resourceGroupTenant</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ResourceGroupTenantQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ResourceGroupTenantResponseData
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/Tenant?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ResourceGroupTenantResponseData resourceGroupTenant(@Param("elid") String elid, ResourceGroupTenantRequestData body, @QueryMap(encoded=true) ResourceGroupTenantQueryParams queryParams);

  /**
  * Get relations to Tenant entities
  * 
  * Note, this is equivalent to the other <code>resourceGroupTenant</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ResourceGroupTenantResponseData
      */
      @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/Tenant?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ResourceGroupTenantResponseData> resourceGroupTenantWithHttpInfo(@Param("elid") String elid, ResourceGroupTenantRequestData body, @QueryMap(encoded=true) ResourceGroupTenantQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>resourceGroupTenant</code> method in a fluent style.
   */
  public static class ResourceGroupTenantQueryParams extends HashMap<String, Object> {
    public ResourceGroupTenantQueryParams sessionId(final String value) {
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
   * @return ResourceGroupVirtualServersResponseData
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/VirtualServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ResourceGroupVirtualServersResponseData resourceGroupVirtualServers(@Param("sessionId") String sessionId, @Param("elid") String elid, ResourceGroupVirtualServersRequestData body);

  /**
   * Get relations to Virtual server entities
   * Similar to <code>resourceGroupVirtualServers</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/VirtualServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ResourceGroupVirtualServersResponseData> resourceGroupVirtualServersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ResourceGroupVirtualServersRequestData body);


  /**
   * Get relations to Virtual server entities
   * 
   * Note, this is equivalent to the other <code>resourceGroupVirtualServers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ResourceGroupVirtualServersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ResourceGroupVirtualServersResponseData
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/VirtualServers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ResourceGroupVirtualServersResponseData resourceGroupVirtualServers(@Param("elid") String elid, ResourceGroupVirtualServersRequestData body, @QueryMap(encoded=true) ResourceGroupVirtualServersQueryParams queryParams);

  /**
  * Get relations to Virtual server entities
  * 
  * Note, this is equivalent to the other <code>resourceGroupVirtualServers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ResourceGroupVirtualServersResponseData
      */
      @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/VirtualServers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ResourceGroupVirtualServersResponseData> resourceGroupVirtualServersWithHttpInfo(@Param("elid") String elid, ResourceGroupVirtualServersRequestData body, @QueryMap(encoded=true) ResourceGroupVirtualServersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>resourceGroupVirtualServers</code> method in a fluent style.
   */
  public static class ResourceGroupVirtualServersQueryParams extends HashMap<String, Object> {
    public ResourceGroupVirtualServersQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify resource group
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateResourceGroupResponse
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateResourceGroupResponse updateResourceGroup(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateResourceGroupRequestData body);

  /**
   * Modify
   * Similar to <code>updateResourceGroup</code> but it also returns the http response headers .
   * Modify resource group
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateResourceGroupResponse> updateResourceGroupWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateResourceGroupRequestData body);


  /**
   * Modify
   * Modify resource group
   * Note, this is equivalent to the other <code>updateResourceGroup</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateResourceGroupQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateResourceGroupResponse
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateResourceGroupResponse updateResourceGroup(@Param("elid") String elid, UpdateResourceGroupRequestData body, @QueryMap(encoded=true) UpdateResourceGroupQueryParams queryParams);

  /**
  * Modify
  * Modify resource group
  * Note, this is equivalent to the other <code>updateResourceGroup</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateResourceGroupResponse
      */
      @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateResourceGroupResponse> updateResourceGroupWithHttpInfo(@Param("elid") String elid, UpdateResourceGroupRequestData body, @QueryMap(encoded=true) UpdateResourceGroupQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateResourceGroup</code> method in a fluent style.
   */
  public static class UpdateResourceGroupQueryParams extends HashMap<String, Object> {
    public UpdateResourceGroupQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesResourceGroupResponse
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesResourceGroupResponse updateSystemAttributesResourceGroup(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesResourceGroupRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesResourceGroup</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesResourceGroupResponse> updateSystemAttributesResourceGroupWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesResourceGroupRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesResourceGroup</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesResourceGroupQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesResourceGroupResponse
   */
  @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesResourceGroupResponse updateSystemAttributesResourceGroup(@Param("elid") String elid, UpdateSystemAttributesResourceGroupRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesResourceGroupQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesResourceGroup</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesResourceGroupResponse
      */
      @RequestLine("POST /api/rest/entity/resourceGroup/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesResourceGroupResponse> updateSystemAttributesResourceGroupWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesResourceGroupRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesResourceGroupQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesResourceGroup</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesResourceGroupQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesResourceGroupQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
