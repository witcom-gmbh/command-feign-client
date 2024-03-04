package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateNparVirtualServerRequestData;
import com.fntsoftware.businessgateway.entities.CreateNparVirtualServerResponse;
import com.fntsoftware.businessgateway.entities.CreateOsPartitionVirtualServerRequestData;
import com.fntsoftware.businessgateway.entities.CreateOsPartitionVirtualServerResponse;
import com.fntsoftware.businessgateway.entities.CreateVirtualServerRequestData;
import com.fntsoftware.businessgateway.entities.CreateVirtualServerResponse;
import com.fntsoftware.businessgateway.entities.DeleteVirtualServerRequestData;
import com.fntsoftware.businessgateway.entities.DeleteVirtualServerResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesVirtualServerRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesVirtualServerResponse;
import com.fntsoftware.businessgateway.entities.UpdateVirtualServerRequestData;
import com.fntsoftware.businessgateway.entities.UpdateVirtualServerResponse;
import com.fntsoftware.businessgateway.entities.VirtualServerContractsRequestData;
import com.fntsoftware.businessgateway.entities.VirtualServerContractsResponseData;
import com.fntsoftware.businessgateway.entities.VirtualServerFailoverClustersRequestData;
import com.fntsoftware.businessgateway.entities.VirtualServerFailoverClustersResponseData;
import com.fntsoftware.businessgateway.entities.VirtualServerFileSystemsRequestData;
import com.fntsoftware.businessgateway.entities.VirtualServerFileSystemsResponseData;
import com.fntsoftware.businessgateway.entities.VirtualServerFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.VirtualServerFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.VirtualServerInterfacesRequestData;
import com.fntsoftware.businessgateway.entities.VirtualServerInterfacesResponseData;
import com.fntsoftware.businessgateway.entities.VirtualServerIpAddressesRequest;
import com.fntsoftware.businessgateway.entities.VirtualServerIpAddressesResponse;
import com.fntsoftware.businessgateway.entities.VirtualServerIpv4AddressesRequestData;
import com.fntsoftware.businessgateway.entities.VirtualServerIpv4AddressesResponseData;
import com.fntsoftware.businessgateway.entities.VirtualServerIpv4NetrangesRequestData;
import com.fntsoftware.businessgateway.entities.VirtualServerIpv4NetrangesResponseData;
import com.fntsoftware.businessgateway.entities.VirtualServerIpv4NetworksRequestData;
import com.fntsoftware.businessgateway.entities.VirtualServerIpv4NetworksResponseData;
import com.fntsoftware.businessgateway.entities.VirtualServerMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.VirtualServerMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.VirtualServerMaintenanceWindowsRequestData;
import com.fntsoftware.businessgateway.entities.VirtualServerMaintenanceWindowsResponseData;
import com.fntsoftware.businessgateway.entities.VirtualServerNetworksAndNetrangesRequest;
import com.fntsoftware.businessgateway.entities.VirtualServerNetworksAndNetrangesResponse;
import com.fntsoftware.businessgateway.entities.VirtualServerOperatingSystemInstallationRequestData;
import com.fntsoftware.businessgateway.entities.VirtualServerOperatingSystemInstallationResponseData;
import com.fntsoftware.businessgateway.entities.VirtualServerOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.VirtualServerOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.VirtualServerPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.VirtualServerPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.VirtualServerPersonsRequestData;
import com.fntsoftware.businessgateway.entities.VirtualServerPersonsResponseData;
import com.fntsoftware.businessgateway.entities.VirtualServerQueryRequest;
import com.fntsoftware.businessgateway.entities.VirtualServerQueryResponse;
import com.fntsoftware.businessgateway.entities.VirtualServerResourceGroupRequestData;
import com.fntsoftware.businessgateway.entities.VirtualServerResourceGroupResponseData;
import com.fntsoftware.businessgateway.entities.VirtualServerServerfarmsRequestData;
import com.fntsoftware.businessgateway.entities.VirtualServerServerfarmsResponseData;
import com.fntsoftware.businessgateway.entities.VirtualServerServersRequestData;
import com.fntsoftware.businessgateway.entities.VirtualServerServersResponseData;
import com.fntsoftware.businessgateway.entities.VirtualServerSoftwareInstallationsRequestData;
import com.fntsoftware.businessgateway.entities.VirtualServerSoftwareInstallationsResponseData;
import com.fntsoftware.businessgateway.entities.VirtualServerSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.VirtualServerSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.VirtualServerVirtualDrivesRequestData;
import com.fntsoftware.businessgateway.entities.VirtualServerVirtualDrivesResponseData;
import com.fntsoftware.businessgateway.entities.VirtualServerVirtualHardDisksRequestData;
import com.fntsoftware.businessgateway.entities.VirtualServerVirtualHardDisksResponseData;
import com.fntsoftware.businessgateway.entities.VirtualServerVirtualNetworkCardsRequestData;
import com.fntsoftware.businessgateway.entities.VirtualServerVirtualNetworkCardsResponseData;
import com.fntsoftware.businessgateway.entities.VirtualServerVlansRequest;
import com.fntsoftware.businessgateway.entities.VirtualServerVlansResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface VirtualServerApi extends ApiClient.Api {


  /**
   * Create NPAR
   * Create Virtual server
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateNparVirtualServerResponse
   */
  @RequestLine("POST /api/rest/entity/virtualServer/createNpar?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateNparVirtualServerResponse createNparVirtualServer(@Param("sessionId") String sessionId, CreateNparVirtualServerRequestData body);

  /**
   * Create NPAR
   * Similar to <code>createNparVirtualServer</code> but it also returns the http response headers .
   * Create Virtual server
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualServer/createNpar?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateNparVirtualServerResponse> createNparVirtualServerWithHttpInfo(@Param("sessionId") String sessionId, CreateNparVirtualServerRequestData body);


  /**
   * Create NPAR
   * Create Virtual server
   * Note, this is equivalent to the other <code>createNparVirtualServer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateNparVirtualServerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateNparVirtualServerResponse
   */
  @RequestLine("POST /api/rest/entity/virtualServer/createNpar?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateNparVirtualServerResponse createNparVirtualServer(CreateNparVirtualServerRequestData body, @QueryMap(encoded=true) CreateNparVirtualServerQueryParams queryParams);

  /**
  * Create NPAR
  * Create Virtual server
  * Note, this is equivalent to the other <code>createNparVirtualServer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateNparVirtualServerResponse
      */
      @RequestLine("POST /api/rest/entity/virtualServer/createNpar?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateNparVirtualServerResponse> createNparVirtualServerWithHttpInfo(CreateNparVirtualServerRequestData body, @QueryMap(encoded=true) CreateNparVirtualServerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createNparVirtualServer</code> method in a fluent style.
   */
  public static class CreateNparVirtualServerQueryParams extends HashMap<String, Object> {
    public CreateNparVirtualServerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create OS partition
   * Create Virtual server
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateOsPartitionVirtualServerResponse
   */
  @RequestLine("POST /api/rest/entity/virtualServer/createOsPartition?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateOsPartitionVirtualServerResponse createOsPartitionVirtualServer(@Param("sessionId") String sessionId, CreateOsPartitionVirtualServerRequestData body);

  /**
   * Create OS partition
   * Similar to <code>createOsPartitionVirtualServer</code> but it also returns the http response headers .
   * Create Virtual server
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualServer/createOsPartition?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateOsPartitionVirtualServerResponse> createOsPartitionVirtualServerWithHttpInfo(@Param("sessionId") String sessionId, CreateOsPartitionVirtualServerRequestData body);


  /**
   * Create OS partition
   * Create Virtual server
   * Note, this is equivalent to the other <code>createOsPartitionVirtualServer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateOsPartitionVirtualServerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateOsPartitionVirtualServerResponse
   */
  @RequestLine("POST /api/rest/entity/virtualServer/createOsPartition?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateOsPartitionVirtualServerResponse createOsPartitionVirtualServer(CreateOsPartitionVirtualServerRequestData body, @QueryMap(encoded=true) CreateOsPartitionVirtualServerQueryParams queryParams);

  /**
  * Create OS partition
  * Create Virtual server
  * Note, this is equivalent to the other <code>createOsPartitionVirtualServer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateOsPartitionVirtualServerResponse
      */
      @RequestLine("POST /api/rest/entity/virtualServer/createOsPartition?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateOsPartitionVirtualServerResponse> createOsPartitionVirtualServerWithHttpInfo(CreateOsPartitionVirtualServerRequestData body, @QueryMap(encoded=true) CreateOsPartitionVirtualServerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createOsPartitionVirtualServer</code> method in a fluent style.
   */
  public static class CreateOsPartitionVirtualServerQueryParams extends HashMap<String, Object> {
    public CreateOsPartitionVirtualServerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create VM
   * Create virtual server
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateVirtualServerResponse
   */
  @RequestLine("POST /api/rest/entity/virtualServer/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateVirtualServerResponse createVirtualServer(@Param("sessionId") String sessionId, CreateVirtualServerRequestData body);

  /**
   * Create VM
   * Similar to <code>createVirtualServer</code> but it also returns the http response headers .
   * Create virtual server
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualServer/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateVirtualServerResponse> createVirtualServerWithHttpInfo(@Param("sessionId") String sessionId, CreateVirtualServerRequestData body);


  /**
   * Create VM
   * Create virtual server
   * Note, this is equivalent to the other <code>createVirtualServer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateVirtualServerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateVirtualServerResponse
   */
  @RequestLine("POST /api/rest/entity/virtualServer/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateVirtualServerResponse createVirtualServer(CreateVirtualServerRequestData body, @QueryMap(encoded=true) CreateVirtualServerQueryParams queryParams);

  /**
  * Create VM
  * Create virtual server
  * Note, this is equivalent to the other <code>createVirtualServer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateVirtualServerResponse
      */
      @RequestLine("POST /api/rest/entity/virtualServer/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateVirtualServerResponse> createVirtualServerWithHttpInfo(CreateVirtualServerRequestData body, @QueryMap(encoded=true) CreateVirtualServerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createVirtualServer</code> method in a fluent style.
   */
  public static class CreateVirtualServerQueryParams extends HashMap<String, Object> {
    public CreateVirtualServerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete virtual server
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteVirtualServerResponse
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteVirtualServerResponse deleteVirtualServer(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteVirtualServerRequestData body);

  /**
   * Delete
   * Similar to <code>deleteVirtualServer</code> but it also returns the http response headers .
   * Delete virtual server
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteVirtualServerResponse> deleteVirtualServerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteVirtualServerRequestData body);


  /**
   * Delete
   * Delete virtual server
   * Note, this is equivalent to the other <code>deleteVirtualServer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteVirtualServerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteVirtualServerResponse
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteVirtualServerResponse deleteVirtualServer(@Param("elid") String elid, DeleteVirtualServerRequestData body, @QueryMap(encoded=true) DeleteVirtualServerQueryParams queryParams);

  /**
  * Delete
  * Delete virtual server
  * Note, this is equivalent to the other <code>deleteVirtualServer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteVirtualServerResponse
      */
      @RequestLine("POST /api/rest/entity/virtualServer/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteVirtualServerResponse> deleteVirtualServerWithHttpInfo(@Param("elid") String elid, DeleteVirtualServerRequestData body, @QueryMap(encoded=true) DeleteVirtualServerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteVirtualServer</code> method in a fluent style.
   */
  public static class DeleteVirtualServerQueryParams extends HashMap<String, Object> {
    public DeleteVirtualServerQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesVirtualServerResponse
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesVirtualServerResponse updateSystemAttributesVirtualServer(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesVirtualServerRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesVirtualServer</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesVirtualServerResponse> updateSystemAttributesVirtualServerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesVirtualServerRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesVirtualServer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesVirtualServerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesVirtualServerResponse
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesVirtualServerResponse updateSystemAttributesVirtualServer(@Param("elid") String elid, UpdateSystemAttributesVirtualServerRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesVirtualServerQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesVirtualServer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesVirtualServerResponse
      */
      @RequestLine("POST /api/rest/entity/virtualServer/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesVirtualServerResponse> updateSystemAttributesVirtualServerWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesVirtualServerRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesVirtualServerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesVirtualServer</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesVirtualServerQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesVirtualServerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify virtual server
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateVirtualServerResponse
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateVirtualServerResponse updateVirtualServer(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateVirtualServerRequestData body);

  /**
   * Modify
   * Similar to <code>updateVirtualServer</code> but it also returns the http response headers .
   * Modify virtual server
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateVirtualServerResponse> updateVirtualServerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateVirtualServerRequestData body);


  /**
   * Modify
   * Modify virtual server
   * Note, this is equivalent to the other <code>updateVirtualServer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateVirtualServerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateVirtualServerResponse
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateVirtualServerResponse updateVirtualServer(@Param("elid") String elid, UpdateVirtualServerRequestData body, @QueryMap(encoded=true) UpdateVirtualServerQueryParams queryParams);

  /**
  * Modify
  * Modify virtual server
  * Note, this is equivalent to the other <code>updateVirtualServer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateVirtualServerResponse
      */
      @RequestLine("POST /api/rest/entity/virtualServer/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateVirtualServerResponse> updateVirtualServerWithHttpInfo(@Param("elid") String elid, UpdateVirtualServerRequestData body, @QueryMap(encoded=true) UpdateVirtualServerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateVirtualServer</code> method in a fluent style.
   */
  public static class UpdateVirtualServerQueryParams extends HashMap<String, Object> {
    public UpdateVirtualServerQueryParams sessionId(final String value) {
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
   * @return VirtualServerContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualServerContractsResponseData virtualServerContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualServerContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>virtualServerContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualServerContractsResponseData> virtualServerContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualServerContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>virtualServerContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualServerContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualServerContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualServerContractsResponseData virtualServerContracts(@Param("elid") String elid, VirtualServerContractsRequestData body, @QueryMap(encoded=true) VirtualServerContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>virtualServerContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualServerContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualServer/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualServerContractsResponseData> virtualServerContractsWithHttpInfo(@Param("elid") String elid, VirtualServerContractsRequestData body, @QueryMap(encoded=true) VirtualServerContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualServerContracts</code> method in a fluent style.
   */
  public static class VirtualServerContractsQueryParams extends HashMap<String, Object> {
    public VirtualServerContractsQueryParams sessionId(final String value) {
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
   * @return VirtualServerFailoverClustersResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/FailoverClusters?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualServerFailoverClustersResponseData virtualServerFailoverClusters(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualServerFailoverClustersRequestData body);

  /**
   * Get relations to Failover Cluster entities
   * Similar to <code>virtualServerFailoverClusters</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/FailoverClusters?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualServerFailoverClustersResponseData> virtualServerFailoverClustersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualServerFailoverClustersRequestData body);


  /**
   * Get relations to Failover Cluster entities
   * 
   * Note, this is equivalent to the other <code>virtualServerFailoverClusters</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualServerFailoverClustersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualServerFailoverClustersResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/FailoverClusters?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualServerFailoverClustersResponseData virtualServerFailoverClusters(@Param("elid") String elid, VirtualServerFailoverClustersRequestData body, @QueryMap(encoded=true) VirtualServerFailoverClustersQueryParams queryParams);

  /**
  * Get relations to Failover Cluster entities
  * 
  * Note, this is equivalent to the other <code>virtualServerFailoverClusters</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualServerFailoverClustersResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualServer/{elid}/FailoverClusters?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualServerFailoverClustersResponseData> virtualServerFailoverClustersWithHttpInfo(@Param("elid") String elid, VirtualServerFailoverClustersRequestData body, @QueryMap(encoded=true) VirtualServerFailoverClustersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualServerFailoverClusters</code> method in a fluent style.
   */
  public static class VirtualServerFailoverClustersQueryParams extends HashMap<String, Object> {
    public VirtualServerFailoverClustersQueryParams sessionId(final String value) {
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
   * @return VirtualServerFileSystemsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/FileSystems?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualServerFileSystemsResponseData virtualServerFileSystems(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualServerFileSystemsRequestData body);

  /**
   * Get relations to File system entities
   * Similar to <code>virtualServerFileSystems</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/FileSystems?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualServerFileSystemsResponseData> virtualServerFileSystemsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualServerFileSystemsRequestData body);


  /**
   * Get relations to File system entities
   * 
   * Note, this is equivalent to the other <code>virtualServerFileSystems</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualServerFileSystemsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualServerFileSystemsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/FileSystems?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualServerFileSystemsResponseData virtualServerFileSystems(@Param("elid") String elid, VirtualServerFileSystemsRequestData body, @QueryMap(encoded=true) VirtualServerFileSystemsQueryParams queryParams);

  /**
  * Get relations to File system entities
  * 
  * Note, this is equivalent to the other <code>virtualServerFileSystems</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualServerFileSystemsResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualServer/{elid}/FileSystems?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualServerFileSystemsResponseData> virtualServerFileSystemsWithHttpInfo(@Param("elid") String elid, VirtualServerFileSystemsRequestData body, @QueryMap(encoded=true) VirtualServerFileSystemsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualServerFileSystems</code> method in a fluent style.
   */
  public static class VirtualServerFileSystemsQueryParams extends HashMap<String, Object> {
    public VirtualServerFileSystemsQueryParams sessionId(final String value) {
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
   * @return VirtualServerFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualServerFrameContractsResponseData virtualServerFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualServerFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>virtualServerFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualServerFrameContractsResponseData> virtualServerFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualServerFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>virtualServerFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualServerFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualServerFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualServerFrameContractsResponseData virtualServerFrameContracts(@Param("elid") String elid, VirtualServerFrameContractsRequestData body, @QueryMap(encoded=true) VirtualServerFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>virtualServerFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualServerFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualServer/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualServerFrameContractsResponseData> virtualServerFrameContractsWithHttpInfo(@Param("elid") String elid, VirtualServerFrameContractsRequestData body, @QueryMap(encoded=true) VirtualServerFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualServerFrameContracts</code> method in a fluent style.
   */
  public static class VirtualServerFrameContractsQueryParams extends HashMap<String, Object> {
    public VirtualServerFrameContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Interface entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return VirtualServerInterfacesResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualServerInterfacesResponseData virtualServerInterfaces(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualServerInterfacesRequestData body);

  /**
   * Get relations to Interface entities
   * Similar to <code>virtualServerInterfaces</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualServerInterfacesResponseData> virtualServerInterfacesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualServerInterfacesRequestData body);


  /**
   * Get relations to Interface entities
   * 
   * Note, this is equivalent to the other <code>virtualServerInterfaces</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualServerInterfacesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualServerInterfacesResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualServerInterfacesResponseData virtualServerInterfaces(@Param("elid") String elid, VirtualServerInterfacesRequestData body, @QueryMap(encoded=true) VirtualServerInterfacesQueryParams queryParams);

  /**
  * Get relations to Interface entities
  * 
  * Note, this is equivalent to the other <code>virtualServerInterfaces</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualServerInterfacesResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualServer/{elid}/Interfaces?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualServerInterfacesResponseData> virtualServerInterfacesWithHttpInfo(@Param("elid") String elid, VirtualServerInterfacesRequestData body, @QueryMap(encoded=true) VirtualServerInterfacesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualServerInterfaces</code> method in a fluent style.
   */
  public static class VirtualServerInterfacesQueryParams extends HashMap<String, Object> {
    public VirtualServerInterfacesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * IP addresses
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return VirtualServerIpAddressesResponse
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualServerIpAddressesResponse virtualServerIpAddresses(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualServerIpAddressesRequest body);

  /**
   * IP addresses
   * Similar to <code>virtualServerIpAddresses</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualServerIpAddressesResponse> virtualServerIpAddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualServerIpAddressesRequest body);


  /**
   * IP addresses
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>virtualServerIpAddresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualServerIpAddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualServerIpAddressesResponse
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualServerIpAddressesResponse virtualServerIpAddresses(@Param("elid") String elid, VirtualServerIpAddressesRequest body, @QueryMap(encoded=true) VirtualServerIpAddressesQueryParams queryParams);

  /**
  * IP addresses
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>virtualServerIpAddresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualServerIpAddressesResponse
      */
      @RequestLine("POST /api/rest/entity/virtualServer/{elid}/IpAddresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualServerIpAddressesResponse> virtualServerIpAddressesWithHttpInfo(@Param("elid") String elid, VirtualServerIpAddressesRequest body, @QueryMap(encoded=true) VirtualServerIpAddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualServerIpAddresses</code> method in a fluent style.
   */
  public static class VirtualServerIpAddressesQueryParams extends HashMap<String, Object> {
    public VirtualServerIpAddressesQueryParams sessionId(final String value) {
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
   * @return VirtualServerIpv4AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualServerIpv4AddressesResponseData virtualServerIpv4Addresses(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualServerIpv4AddressesRequestData body);

  /**
   * Get relations to IPv4 address entities
   * Similar to <code>virtualServerIpv4Addresses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualServerIpv4AddressesResponseData> virtualServerIpv4AddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualServerIpv4AddressesRequestData body);


  /**
   * Get relations to IPv4 address entities
   * 
   * Note, this is equivalent to the other <code>virtualServerIpv4Addresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualServerIpv4AddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualServerIpv4AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualServerIpv4AddressesResponseData virtualServerIpv4Addresses(@Param("elid") String elid, VirtualServerIpv4AddressesRequestData body, @QueryMap(encoded=true) VirtualServerIpv4AddressesQueryParams queryParams);

  /**
  * Get relations to IPv4 address entities
  * 
  * Note, this is equivalent to the other <code>virtualServerIpv4Addresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualServerIpv4AddressesResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualServer/{elid}/Ipv4Addresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualServerIpv4AddressesResponseData> virtualServerIpv4AddressesWithHttpInfo(@Param("elid") String elid, VirtualServerIpv4AddressesRequestData body, @QueryMap(encoded=true) VirtualServerIpv4AddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualServerIpv4Addresses</code> method in a fluent style.
   */
  public static class VirtualServerIpv4AddressesQueryParams extends HashMap<String, Object> {
    public VirtualServerIpv4AddressesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to IPv4 netrange entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return VirtualServerIpv4NetrangesResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualServerIpv4NetrangesResponseData virtualServerIpv4Netranges(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualServerIpv4NetrangesRequestData body);

  /**
   * Get relations to IPv4 netrange entities
   * Similar to <code>virtualServerIpv4Netranges</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualServerIpv4NetrangesResponseData> virtualServerIpv4NetrangesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualServerIpv4NetrangesRequestData body);


  /**
   * Get relations to IPv4 netrange entities
   * 
   * Note, this is equivalent to the other <code>virtualServerIpv4Netranges</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualServerIpv4NetrangesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualServerIpv4NetrangesResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualServerIpv4NetrangesResponseData virtualServerIpv4Netranges(@Param("elid") String elid, VirtualServerIpv4NetrangesRequestData body, @QueryMap(encoded=true) VirtualServerIpv4NetrangesQueryParams queryParams);

  /**
  * Get relations to IPv4 netrange entities
  * 
  * Note, this is equivalent to the other <code>virtualServerIpv4Netranges</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualServerIpv4NetrangesResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualServer/{elid}/Ipv4Netranges?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualServerIpv4NetrangesResponseData> virtualServerIpv4NetrangesWithHttpInfo(@Param("elid") String elid, VirtualServerIpv4NetrangesRequestData body, @QueryMap(encoded=true) VirtualServerIpv4NetrangesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualServerIpv4Netranges</code> method in a fluent style.
   */
  public static class VirtualServerIpv4NetrangesQueryParams extends HashMap<String, Object> {
    public VirtualServerIpv4NetrangesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to IPv4 Network entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return VirtualServerIpv4NetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualServerIpv4NetworksResponseData virtualServerIpv4Networks(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualServerIpv4NetworksRequestData body);

  /**
   * Get relations to IPv4 Network entities
   * Similar to <code>virtualServerIpv4Networks</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualServerIpv4NetworksResponseData> virtualServerIpv4NetworksWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualServerIpv4NetworksRequestData body);


  /**
   * Get relations to IPv4 Network entities
   * 
   * Note, this is equivalent to the other <code>virtualServerIpv4Networks</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualServerIpv4NetworksQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualServerIpv4NetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualServerIpv4NetworksResponseData virtualServerIpv4Networks(@Param("elid") String elid, VirtualServerIpv4NetworksRequestData body, @QueryMap(encoded=true) VirtualServerIpv4NetworksQueryParams queryParams);

  /**
  * Get relations to IPv4 Network entities
  * 
  * Note, this is equivalent to the other <code>virtualServerIpv4Networks</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualServerIpv4NetworksResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualServer/{elid}/Ipv4Networks?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualServerIpv4NetworksResponseData> virtualServerIpv4NetworksWithHttpInfo(@Param("elid") String elid, VirtualServerIpv4NetworksRequestData body, @QueryMap(encoded=true) VirtualServerIpv4NetworksQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualServerIpv4Networks</code> method in a fluent style.
   */
  public static class VirtualServerIpv4NetworksQueryParams extends HashMap<String, Object> {
    public VirtualServerIpv4NetworksQueryParams sessionId(final String value) {
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
   * @return VirtualServerMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualServerMaintenanceContractsResponseData virtualServerMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualServerMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>virtualServerMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualServerMaintenanceContractsResponseData> virtualServerMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualServerMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>virtualServerMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualServerMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualServerMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualServerMaintenanceContractsResponseData virtualServerMaintenanceContracts(@Param("elid") String elid, VirtualServerMaintenanceContractsRequestData body, @QueryMap(encoded=true) VirtualServerMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>virtualServerMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualServerMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualServer/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualServerMaintenanceContractsResponseData> virtualServerMaintenanceContractsWithHttpInfo(@Param("elid") String elid, VirtualServerMaintenanceContractsRequestData body, @QueryMap(encoded=true) VirtualServerMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualServerMaintenanceContracts</code> method in a fluent style.
   */
  public static class VirtualServerMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public VirtualServerMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return VirtualServerMaintenanceWindowsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/MaintenanceWindows?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualServerMaintenanceWindowsResponseData virtualServerMaintenanceWindows(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualServerMaintenanceWindowsRequestData body);

  /**
   * Get relations to Maintenance window entities
   * Similar to <code>virtualServerMaintenanceWindows</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/MaintenanceWindows?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualServerMaintenanceWindowsResponseData> virtualServerMaintenanceWindowsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualServerMaintenanceWindowsRequestData body);


  /**
   * Get relations to Maintenance window entities
   * 
   * Note, this is equivalent to the other <code>virtualServerMaintenanceWindows</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualServerMaintenanceWindowsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualServerMaintenanceWindowsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/MaintenanceWindows?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualServerMaintenanceWindowsResponseData virtualServerMaintenanceWindows(@Param("elid") String elid, VirtualServerMaintenanceWindowsRequestData body, @QueryMap(encoded=true) VirtualServerMaintenanceWindowsQueryParams queryParams);

  /**
  * Get relations to Maintenance window entities
  * 
  * Note, this is equivalent to the other <code>virtualServerMaintenanceWindows</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualServerMaintenanceWindowsResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualServer/{elid}/MaintenanceWindows?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualServerMaintenanceWindowsResponseData> virtualServerMaintenanceWindowsWithHttpInfo(@Param("elid") String elid, VirtualServerMaintenanceWindowsRequestData body, @QueryMap(encoded=true) VirtualServerMaintenanceWindowsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualServerMaintenanceWindows</code> method in a fluent style.
   */
  public static class VirtualServerMaintenanceWindowsQueryParams extends HashMap<String, Object> {
    public VirtualServerMaintenanceWindowsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Nets / Net ranges
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return VirtualServerNetworksAndNetrangesResponse
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualServerNetworksAndNetrangesResponse virtualServerNetworksAndNetranges(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualServerNetworksAndNetrangesRequest body);

  /**
   * Nets / Net ranges
   * Similar to <code>virtualServerNetworksAndNetranges</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualServerNetworksAndNetrangesResponse> virtualServerNetworksAndNetrangesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualServerNetworksAndNetrangesRequest body);


  /**
   * Nets / Net ranges
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>virtualServerNetworksAndNetranges</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualServerNetworksAndNetrangesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualServerNetworksAndNetrangesResponse
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualServerNetworksAndNetrangesResponse virtualServerNetworksAndNetranges(@Param("elid") String elid, VirtualServerNetworksAndNetrangesRequest body, @QueryMap(encoded=true) VirtualServerNetworksAndNetrangesQueryParams queryParams);

  /**
  * Nets / Net ranges
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>virtualServerNetworksAndNetranges</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualServerNetworksAndNetrangesResponse
      */
      @RequestLine("POST /api/rest/entity/virtualServer/{elid}/NetworksAndNetranges?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualServerNetworksAndNetrangesResponse> virtualServerNetworksAndNetrangesWithHttpInfo(@Param("elid") String elid, VirtualServerNetworksAndNetrangesRequest body, @QueryMap(encoded=true) VirtualServerNetworksAndNetrangesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualServerNetworksAndNetranges</code> method in a fluent style.
   */
  public static class VirtualServerNetworksAndNetrangesQueryParams extends HashMap<String, Object> {
    public VirtualServerNetworksAndNetrangesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Operating system installation entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return VirtualServerOperatingSystemInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualServerOperatingSystemInstallationResponseData virtualServerOperatingSystemInstallation(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualServerOperatingSystemInstallationRequestData body);

  /**
   * Get relations to Operating system installation entities
   * Similar to <code>virtualServerOperatingSystemInstallation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualServerOperatingSystemInstallationResponseData> virtualServerOperatingSystemInstallationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualServerOperatingSystemInstallationRequestData body);


  /**
   * Get relations to Operating system installation entities
   * 
   * Note, this is equivalent to the other <code>virtualServerOperatingSystemInstallation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualServerOperatingSystemInstallationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualServerOperatingSystemInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualServerOperatingSystemInstallationResponseData virtualServerOperatingSystemInstallation(@Param("elid") String elid, VirtualServerOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) VirtualServerOperatingSystemInstallationQueryParams queryParams);

  /**
  * Get relations to Operating system installation entities
  * 
  * Note, this is equivalent to the other <code>virtualServerOperatingSystemInstallation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualServerOperatingSystemInstallationResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualServer/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualServerOperatingSystemInstallationResponseData> virtualServerOperatingSystemInstallationWithHttpInfo(@Param("elid") String elid, VirtualServerOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) VirtualServerOperatingSystemInstallationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualServerOperatingSystemInstallation</code> method in a fluent style.
   */
  public static class VirtualServerOperatingSystemInstallationQueryParams extends HashMap<String, Object> {
    public VirtualServerOperatingSystemInstallationQueryParams sessionId(final String value) {
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
   * @return VirtualServerOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualServerOrganizationsResponseData virtualServerOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualServerOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>virtualServerOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualServerOrganizationsResponseData> virtualServerOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualServerOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>virtualServerOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualServerOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualServerOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualServerOrganizationsResponseData virtualServerOrganizations(@Param("elid") String elid, VirtualServerOrganizationsRequestData body, @QueryMap(encoded=true) VirtualServerOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>virtualServerOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualServerOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualServer/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualServerOrganizationsResponseData> virtualServerOrganizationsWithHttpInfo(@Param("elid") String elid, VirtualServerOrganizationsRequestData body, @QueryMap(encoded=true) VirtualServerOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualServerOrganizations</code> method in a fluent style.
   */
  public static class VirtualServerOrganizationsQueryParams extends HashMap<String, Object> {
    public VirtualServerOrganizationsQueryParams sessionId(final String value) {
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
   * @return VirtualServerPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualServerPersonGroupsResponseData virtualServerPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualServerPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>virtualServerPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualServerPersonGroupsResponseData> virtualServerPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualServerPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>virtualServerPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualServerPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualServerPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualServerPersonGroupsResponseData virtualServerPersonGroups(@Param("elid") String elid, VirtualServerPersonGroupsRequestData body, @QueryMap(encoded=true) VirtualServerPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>virtualServerPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualServerPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualServer/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualServerPersonGroupsResponseData> virtualServerPersonGroupsWithHttpInfo(@Param("elid") String elid, VirtualServerPersonGroupsRequestData body, @QueryMap(encoded=true) VirtualServerPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualServerPersonGroups</code> method in a fluent style.
   */
  public static class VirtualServerPersonGroupsQueryParams extends HashMap<String, Object> {
    public VirtualServerPersonGroupsQueryParams sessionId(final String value) {
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
   * @return VirtualServerPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualServerPersonsResponseData virtualServerPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualServerPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>virtualServerPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualServerPersonsResponseData> virtualServerPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualServerPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>virtualServerPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualServerPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualServerPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualServerPersonsResponseData virtualServerPersons(@Param("elid") String elid, VirtualServerPersonsRequestData body, @QueryMap(encoded=true) VirtualServerPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>virtualServerPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualServerPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualServer/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualServerPersonsResponseData> virtualServerPersonsWithHttpInfo(@Param("elid") String elid, VirtualServerPersonsRequestData body, @QueryMap(encoded=true) VirtualServerPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualServerPersons</code> method in a fluent style.
   */
  public static class VirtualServerPersonsQueryParams extends HashMap<String, Object> {
    public VirtualServerPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return VirtualServerQueryResponse
   */
  @RequestLine("POST /api/rest/entity/virtualServer/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualServerQueryResponse virtualServerQuery(@Param("sessionId") String sessionId, VirtualServerQueryRequest body);

  /**
   * Basic query
   * Similar to <code>virtualServerQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualServer/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualServerQueryResponse> virtualServerQueryWithHttpInfo(@Param("sessionId") String sessionId, VirtualServerQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>virtualServerQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualServerQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualServerQueryResponse
   */
  @RequestLine("POST /api/rest/entity/virtualServer/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualServerQueryResponse virtualServerQuery(VirtualServerQueryRequest body, @QueryMap(encoded=true) VirtualServerQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>virtualServerQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualServerQueryResponse
      */
      @RequestLine("POST /api/rest/entity/virtualServer/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualServerQueryResponse> virtualServerQueryWithHttpInfo(VirtualServerQueryRequest body, @QueryMap(encoded=true) VirtualServerQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualServerQuery</code> method in a fluent style.
   */
  public static class VirtualServerQueryQueryParams extends HashMap<String, Object> {
    public VirtualServerQueryQueryParams sessionId(final String value) {
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
   * @return VirtualServerResourceGroupResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/ResourceGroup?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualServerResourceGroupResponseData virtualServerResourceGroup(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualServerResourceGroupRequestData body);

  /**
   * Get relations to Resource group entities
   * Similar to <code>virtualServerResourceGroup</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/ResourceGroup?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualServerResourceGroupResponseData> virtualServerResourceGroupWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualServerResourceGroupRequestData body);


  /**
   * Get relations to Resource group entities
   * 
   * Note, this is equivalent to the other <code>virtualServerResourceGroup</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualServerResourceGroupQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualServerResourceGroupResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/ResourceGroup?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualServerResourceGroupResponseData virtualServerResourceGroup(@Param("elid") String elid, VirtualServerResourceGroupRequestData body, @QueryMap(encoded=true) VirtualServerResourceGroupQueryParams queryParams);

  /**
  * Get relations to Resource group entities
  * 
  * Note, this is equivalent to the other <code>virtualServerResourceGroup</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualServerResourceGroupResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualServer/{elid}/ResourceGroup?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualServerResourceGroupResponseData> virtualServerResourceGroupWithHttpInfo(@Param("elid") String elid, VirtualServerResourceGroupRequestData body, @QueryMap(encoded=true) VirtualServerResourceGroupQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualServerResourceGroup</code> method in a fluent style.
   */
  public static class VirtualServerResourceGroupQueryParams extends HashMap<String, Object> {
    public VirtualServerResourceGroupQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Serverfarm entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return VirtualServerServerfarmsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/Serverfarms?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualServerServerfarmsResponseData virtualServerServerfarms(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualServerServerfarmsRequestData body);

  /**
   * Get relations to Serverfarm entities
   * Similar to <code>virtualServerServerfarms</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/Serverfarms?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualServerServerfarmsResponseData> virtualServerServerfarmsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualServerServerfarmsRequestData body);


  /**
   * Get relations to Serverfarm entities
   * 
   * Note, this is equivalent to the other <code>virtualServerServerfarms</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualServerServerfarmsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualServerServerfarmsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/Serverfarms?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualServerServerfarmsResponseData virtualServerServerfarms(@Param("elid") String elid, VirtualServerServerfarmsRequestData body, @QueryMap(encoded=true) VirtualServerServerfarmsQueryParams queryParams);

  /**
  * Get relations to Serverfarm entities
  * 
  * Note, this is equivalent to the other <code>virtualServerServerfarms</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualServerServerfarmsResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualServer/{elid}/Serverfarms?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualServerServerfarmsResponseData> virtualServerServerfarmsWithHttpInfo(@Param("elid") String elid, VirtualServerServerfarmsRequestData body, @QueryMap(encoded=true) VirtualServerServerfarmsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualServerServerfarms</code> method in a fluent style.
   */
  public static class VirtualServerServerfarmsQueryParams extends HashMap<String, Object> {
    public VirtualServerServerfarmsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Server entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return VirtualServerServersResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/Servers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualServerServersResponseData virtualServerServers(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualServerServersRequestData body);

  /**
   * Get relations to Server entities
   * Similar to <code>virtualServerServers</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/Servers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualServerServersResponseData> virtualServerServersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualServerServersRequestData body);


  /**
   * Get relations to Server entities
   * 
   * Note, this is equivalent to the other <code>virtualServerServers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualServerServersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualServerServersResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/Servers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualServerServersResponseData virtualServerServers(@Param("elid") String elid, VirtualServerServersRequestData body, @QueryMap(encoded=true) VirtualServerServersQueryParams queryParams);

  /**
  * Get relations to Server entities
  * 
  * Note, this is equivalent to the other <code>virtualServerServers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualServerServersResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualServer/{elid}/Servers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualServerServersResponseData> virtualServerServersWithHttpInfo(@Param("elid") String elid, VirtualServerServersRequestData body, @QueryMap(encoded=true) VirtualServerServersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualServerServers</code> method in a fluent style.
   */
  public static class VirtualServerServersQueryParams extends HashMap<String, Object> {
    public VirtualServerServersQueryParams sessionId(final String value) {
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
   * @return VirtualServerSoftwareInstallationsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/SoftwareInstallations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualServerSoftwareInstallationsResponseData virtualServerSoftwareInstallations(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualServerSoftwareInstallationsRequestData body);

  /**
   * Get relations to Software installation entities
   * Similar to <code>virtualServerSoftwareInstallations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/SoftwareInstallations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualServerSoftwareInstallationsResponseData> virtualServerSoftwareInstallationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualServerSoftwareInstallationsRequestData body);


  /**
   * Get relations to Software installation entities
   * 
   * Note, this is equivalent to the other <code>virtualServerSoftwareInstallations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualServerSoftwareInstallationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualServerSoftwareInstallationsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/SoftwareInstallations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualServerSoftwareInstallationsResponseData virtualServerSoftwareInstallations(@Param("elid") String elid, VirtualServerSoftwareInstallationsRequestData body, @QueryMap(encoded=true) VirtualServerSoftwareInstallationsQueryParams queryParams);

  /**
  * Get relations to Software installation entities
  * 
  * Note, this is equivalent to the other <code>virtualServerSoftwareInstallations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualServerSoftwareInstallationsResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualServer/{elid}/SoftwareInstallations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualServerSoftwareInstallationsResponseData> virtualServerSoftwareInstallationsWithHttpInfo(@Param("elid") String elid, VirtualServerSoftwareInstallationsRequestData body, @QueryMap(encoded=true) VirtualServerSoftwareInstallationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualServerSoftwareInstallations</code> method in a fluent style.
   */
  public static class VirtualServerSoftwareInstallationsQueryParams extends HashMap<String, Object> {
    public VirtualServerSoftwareInstallationsQueryParams sessionId(final String value) {
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
   * @return VirtualServerSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualServerSystemAttributesResponse virtualServerSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualServerSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>virtualServerSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualServerSystemAttributesResponse> virtualServerSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualServerSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>virtualServerSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualServerSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualServerSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualServerSystemAttributesResponse virtualServerSystemAttributes(@Param("elid") String elid, VirtualServerSystemAttributesRequest body, @QueryMap(encoded=true) VirtualServerSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>virtualServerSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualServerSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/virtualServer/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualServerSystemAttributesResponse> virtualServerSystemAttributesWithHttpInfo(@Param("elid") String elid, VirtualServerSystemAttributesRequest body, @QueryMap(encoded=true) VirtualServerSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualServerSystemAttributes</code> method in a fluent style.
   */
  public static class VirtualServerSystemAttributesQueryParams extends HashMap<String, Object> {
    public VirtualServerSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Virtual CD/DVD drive entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return VirtualServerVirtualDrivesResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/VirtualDrives?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualServerVirtualDrivesResponseData virtualServerVirtualDrives(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualServerVirtualDrivesRequestData body);

  /**
   * Get relations to Virtual CD/DVD drive entities
   * Similar to <code>virtualServerVirtualDrives</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/VirtualDrives?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualServerVirtualDrivesResponseData> virtualServerVirtualDrivesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualServerVirtualDrivesRequestData body);


  /**
   * Get relations to Virtual CD/DVD drive entities
   * 
   * Note, this is equivalent to the other <code>virtualServerVirtualDrives</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualServerVirtualDrivesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualServerVirtualDrivesResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/VirtualDrives?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualServerVirtualDrivesResponseData virtualServerVirtualDrives(@Param("elid") String elid, VirtualServerVirtualDrivesRequestData body, @QueryMap(encoded=true) VirtualServerVirtualDrivesQueryParams queryParams);

  /**
  * Get relations to Virtual CD/DVD drive entities
  * 
  * Note, this is equivalent to the other <code>virtualServerVirtualDrives</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualServerVirtualDrivesResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualServer/{elid}/VirtualDrives?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualServerVirtualDrivesResponseData> virtualServerVirtualDrivesWithHttpInfo(@Param("elid") String elid, VirtualServerVirtualDrivesRequestData body, @QueryMap(encoded=true) VirtualServerVirtualDrivesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualServerVirtualDrives</code> method in a fluent style.
   */
  public static class VirtualServerVirtualDrivesQueryParams extends HashMap<String, Object> {
    public VirtualServerVirtualDrivesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Virtual hard disk entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return VirtualServerVirtualHardDisksResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/VirtualHardDisks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualServerVirtualHardDisksResponseData virtualServerVirtualHardDisks(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualServerVirtualHardDisksRequestData body);

  /**
   * Get relations to Virtual hard disk entities
   * Similar to <code>virtualServerVirtualHardDisks</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/VirtualHardDisks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualServerVirtualHardDisksResponseData> virtualServerVirtualHardDisksWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualServerVirtualHardDisksRequestData body);


  /**
   * Get relations to Virtual hard disk entities
   * 
   * Note, this is equivalent to the other <code>virtualServerVirtualHardDisks</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualServerVirtualHardDisksQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualServerVirtualHardDisksResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/VirtualHardDisks?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualServerVirtualHardDisksResponseData virtualServerVirtualHardDisks(@Param("elid") String elid, VirtualServerVirtualHardDisksRequestData body, @QueryMap(encoded=true) VirtualServerVirtualHardDisksQueryParams queryParams);

  /**
  * Get relations to Virtual hard disk entities
  * 
  * Note, this is equivalent to the other <code>virtualServerVirtualHardDisks</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualServerVirtualHardDisksResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualServer/{elid}/VirtualHardDisks?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualServerVirtualHardDisksResponseData> virtualServerVirtualHardDisksWithHttpInfo(@Param("elid") String elid, VirtualServerVirtualHardDisksRequestData body, @QueryMap(encoded=true) VirtualServerVirtualHardDisksQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualServerVirtualHardDisks</code> method in a fluent style.
   */
  public static class VirtualServerVirtualHardDisksQueryParams extends HashMap<String, Object> {
    public VirtualServerVirtualHardDisksQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Virtual network card entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return VirtualServerVirtualNetworkCardsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/VirtualNetworkCards?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualServerVirtualNetworkCardsResponseData virtualServerVirtualNetworkCards(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualServerVirtualNetworkCardsRequestData body);

  /**
   * Get relations to Virtual network card entities
   * Similar to <code>virtualServerVirtualNetworkCards</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/VirtualNetworkCards?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualServerVirtualNetworkCardsResponseData> virtualServerVirtualNetworkCardsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualServerVirtualNetworkCardsRequestData body);


  /**
   * Get relations to Virtual network card entities
   * 
   * Note, this is equivalent to the other <code>virtualServerVirtualNetworkCards</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualServerVirtualNetworkCardsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualServerVirtualNetworkCardsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/VirtualNetworkCards?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualServerVirtualNetworkCardsResponseData virtualServerVirtualNetworkCards(@Param("elid") String elid, VirtualServerVirtualNetworkCardsRequestData body, @QueryMap(encoded=true) VirtualServerVirtualNetworkCardsQueryParams queryParams);

  /**
  * Get relations to Virtual network card entities
  * 
  * Note, this is equivalent to the other <code>virtualServerVirtualNetworkCards</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualServerVirtualNetworkCardsResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualServer/{elid}/VirtualNetworkCards?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualServerVirtualNetworkCardsResponseData> virtualServerVirtualNetworkCardsWithHttpInfo(@Param("elid") String elid, VirtualServerVirtualNetworkCardsRequestData body, @QueryMap(encoded=true) VirtualServerVirtualNetworkCardsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualServerVirtualNetworkCards</code> method in a fluent style.
   */
  public static class VirtualServerVirtualNetworkCardsQueryParams extends HashMap<String, Object> {
    public VirtualServerVirtualNetworkCardsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * VLANs
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return VirtualServerVlansResponse
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualServerVlansResponse virtualServerVlans(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualServerVlansRequest body);

  /**
   * VLANs
   * Similar to <code>virtualServerVlans</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualServerVlansResponse> virtualServerVlansWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualServerVlansRequest body);


  /**
   * VLANs
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>virtualServerVlans</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualServerVlansQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualServerVlansResponse
   */
  @RequestLine("POST /api/rest/entity/virtualServer/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualServerVlansResponse virtualServerVlans(@Param("elid") String elid, VirtualServerVlansRequest body, @QueryMap(encoded=true) VirtualServerVlansQueryParams queryParams);

  /**
  * VLANs
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>virtualServerVlans</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualServerVlansResponse
      */
      @RequestLine("POST /api/rest/entity/virtualServer/{elid}/Vlans?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualServerVlansResponse> virtualServerVlansWithHttpInfo(@Param("elid") String elid, VirtualServerVlansRequest body, @QueryMap(encoded=true) VirtualServerVlansQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualServerVlans</code> method in a fluent style.
   */
  public static class VirtualServerVlansQueryParams extends HashMap<String, Object> {
    public VirtualServerVlansQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
