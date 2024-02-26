package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateVirtualNasServerRequestData;
import com.fntsoftware.businessgateway.entities.CreateVirtualNasServerResponse;
import com.fntsoftware.businessgateway.entities.DeleteVirtualNasServerRequestData;
import com.fntsoftware.businessgateway.entities.DeleteVirtualNasServerResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesVirtualNasServerRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesVirtualNasServerResponse;
import com.fntsoftware.businessgateway.entities.UpdateVirtualNasServerRequestData;
import com.fntsoftware.businessgateway.entities.UpdateVirtualNasServerResponse;
import com.fntsoftware.businessgateway.entities.VirtualNasServerInterfacesRequestData;
import com.fntsoftware.businessgateway.entities.VirtualNasServerInterfacesResponseData;
import com.fntsoftware.businessgateway.entities.VirtualNasServerIpAddressesRequest;
import com.fntsoftware.businessgateway.entities.VirtualNasServerIpAddressesResponse;
import com.fntsoftware.businessgateway.entities.VirtualNasServerIpv4AddressesRequestData;
import com.fntsoftware.businessgateway.entities.VirtualNasServerIpv4AddressesResponseData;
import com.fntsoftware.businessgateway.entities.VirtualNasServerIpv4NetrangesRequestData;
import com.fntsoftware.businessgateway.entities.VirtualNasServerIpv4NetrangesResponseData;
import com.fntsoftware.businessgateway.entities.VirtualNasServerIpv4NetworksRequestData;
import com.fntsoftware.businessgateway.entities.VirtualNasServerIpv4NetworksResponseData;
import com.fntsoftware.businessgateway.entities.VirtualNasServerNetworksAndNetrangesRequest;
import com.fntsoftware.businessgateway.entities.VirtualNasServerNetworksAndNetrangesResponse;
import com.fntsoftware.businessgateway.entities.VirtualNasServerQueryRequest;
import com.fntsoftware.businessgateway.entities.VirtualNasServerQueryResponse;
import com.fntsoftware.businessgateway.entities.VirtualNasServerStorageSystemRequestData;
import com.fntsoftware.businessgateway.entities.VirtualNasServerStorageSystemResponseData;
import com.fntsoftware.businessgateway.entities.VirtualNasServerStorageUnitQtreesRequestData;
import com.fntsoftware.businessgateway.entities.VirtualNasServerStorageUnitQtreesResponseData;
import com.fntsoftware.businessgateway.entities.VirtualNasServerStorageUnitVolumesRequestData;
import com.fntsoftware.businessgateway.entities.VirtualNasServerStorageUnitVolumesResponseData;
import com.fntsoftware.businessgateway.entities.VirtualNasServerStoragesRequestData;
import com.fntsoftware.businessgateway.entities.VirtualNasServerStoragesResponseData;
import com.fntsoftware.businessgateway.entities.VirtualNasServerSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.VirtualNasServerSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.VirtualNasServerVlansRequest;
import com.fntsoftware.businessgateway.entities.VirtualNasServerVlansResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface VirtualNasServerApi extends ApiClient.Api {


  /**
   * Create
   * Create Virtual NAS server
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateVirtualNasServerResponse
   */
  @RequestLine("POST /api/rest/entity/virtualNasServer/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateVirtualNasServerResponse createVirtualNasServer(@Param("sessionId") String sessionId, CreateVirtualNasServerRequestData body);

  /**
   * Create
   * Similar to <code>createVirtualNasServer</code> but it also returns the http response headers .
   * Create Virtual NAS server
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualNasServer/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateVirtualNasServerResponse> createVirtualNasServerWithHttpInfo(@Param("sessionId") String sessionId, CreateVirtualNasServerRequestData body);


  /**
   * Create
   * Create Virtual NAS server
   * Note, this is equivalent to the other <code>createVirtualNasServer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateVirtualNasServerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateVirtualNasServerResponse
   */
  @RequestLine("POST /api/rest/entity/virtualNasServer/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateVirtualNasServerResponse createVirtualNasServer(CreateVirtualNasServerRequestData body, @QueryMap(encoded=true) CreateVirtualNasServerQueryParams queryParams);

  /**
  * Create
  * Create Virtual NAS server
  * Note, this is equivalent to the other <code>createVirtualNasServer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateVirtualNasServerResponse
      */
      @RequestLine("POST /api/rest/entity/virtualNasServer/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateVirtualNasServerResponse> createVirtualNasServerWithHttpInfo(CreateVirtualNasServerRequestData body, @QueryMap(encoded=true) CreateVirtualNasServerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createVirtualNasServer</code> method in a fluent style.
   */
  public static class CreateVirtualNasServerQueryParams extends HashMap<String, Object> {
    public CreateVirtualNasServerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Virtual NAS server
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteVirtualNasServerResponse
   */
  @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteVirtualNasServerResponse deleteVirtualNasServer(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteVirtualNasServerRequestData body);

  /**
   * Delete
   * Similar to <code>deleteVirtualNasServer</code> but it also returns the http response headers .
   * Delete Virtual NAS server
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteVirtualNasServerResponse> deleteVirtualNasServerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteVirtualNasServerRequestData body);


  /**
   * Delete
   * Delete Virtual NAS server
   * Note, this is equivalent to the other <code>deleteVirtualNasServer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteVirtualNasServerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteVirtualNasServerResponse
   */
  @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteVirtualNasServerResponse deleteVirtualNasServer(@Param("elid") String elid, DeleteVirtualNasServerRequestData body, @QueryMap(encoded=true) DeleteVirtualNasServerQueryParams queryParams);

  /**
  * Delete
  * Delete Virtual NAS server
  * Note, this is equivalent to the other <code>deleteVirtualNasServer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteVirtualNasServerResponse
      */
      @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteVirtualNasServerResponse> deleteVirtualNasServerWithHttpInfo(@Param("elid") String elid, DeleteVirtualNasServerRequestData body, @QueryMap(encoded=true) DeleteVirtualNasServerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteVirtualNasServer</code> method in a fluent style.
   */
  public static class DeleteVirtualNasServerQueryParams extends HashMap<String, Object> {
    public DeleteVirtualNasServerQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesVirtualNasServerResponse
   */
  @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesVirtualNasServerResponse updateSystemAttributesVirtualNasServer(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesVirtualNasServerRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesVirtualNasServer</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesVirtualNasServerResponse> updateSystemAttributesVirtualNasServerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesVirtualNasServerRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesVirtualNasServer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesVirtualNasServerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesVirtualNasServerResponse
   */
  @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesVirtualNasServerResponse updateSystemAttributesVirtualNasServer(@Param("elid") String elid, UpdateSystemAttributesVirtualNasServerRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesVirtualNasServerQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesVirtualNasServer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesVirtualNasServerResponse
      */
      @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesVirtualNasServerResponse> updateSystemAttributesVirtualNasServerWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesVirtualNasServerRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesVirtualNasServerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesVirtualNasServer</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesVirtualNasServerQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesVirtualNasServerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Virtual NAS server
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateVirtualNasServerResponse
   */
  @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateVirtualNasServerResponse updateVirtualNasServer(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateVirtualNasServerRequestData body);

  /**
   * Modify
   * Similar to <code>updateVirtualNasServer</code> but it also returns the http response headers .
   * Modify Virtual NAS server
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateVirtualNasServerResponse> updateVirtualNasServerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateVirtualNasServerRequestData body);


  /**
   * Modify
   * Modify Virtual NAS server
   * Note, this is equivalent to the other <code>updateVirtualNasServer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateVirtualNasServerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateVirtualNasServerResponse
   */
  @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateVirtualNasServerResponse updateVirtualNasServer(@Param("elid") String elid, UpdateVirtualNasServerRequestData body, @QueryMap(encoded=true) UpdateVirtualNasServerQueryParams queryParams);

  /**
  * Modify
  * Modify Virtual NAS server
  * Note, this is equivalent to the other <code>updateVirtualNasServer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateVirtualNasServerResponse
      */
      @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateVirtualNasServerResponse> updateVirtualNasServerWithHttpInfo(@Param("elid") String elid, UpdateVirtualNasServerRequestData body, @QueryMap(encoded=true) UpdateVirtualNasServerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateVirtualNasServer</code> method in a fluent style.
   */
  public static class UpdateVirtualNasServerQueryParams extends HashMap<String, Object> {
    public UpdateVirtualNasServerQueryParams sessionId(final String value) {
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
   * @return VirtualNasServerInterfacesResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualNasServerInterfacesResponseData virtualNasServerInterfaces(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualNasServerInterfacesRequestData body);

  /**
   * Get relations to Interface entities
   * Similar to <code>virtualNasServerInterfaces</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualNasServerInterfacesResponseData> virtualNasServerInterfacesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualNasServerInterfacesRequestData body);


  /**
   * Get relations to Interface entities
   * 
   * Note, this is equivalent to the other <code>virtualNasServerInterfaces</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualNasServerInterfacesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualNasServerInterfacesResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualNasServerInterfacesResponseData virtualNasServerInterfaces(@Param("elid") String elid, VirtualNasServerInterfacesRequestData body, @QueryMap(encoded=true) VirtualNasServerInterfacesQueryParams queryParams);

  /**
  * Get relations to Interface entities
  * 
  * Note, this is equivalent to the other <code>virtualNasServerInterfaces</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualNasServerInterfacesResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/Interfaces?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualNasServerInterfacesResponseData> virtualNasServerInterfacesWithHttpInfo(@Param("elid") String elid, VirtualNasServerInterfacesRequestData body, @QueryMap(encoded=true) VirtualNasServerInterfacesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualNasServerInterfaces</code> method in a fluent style.
   */
  public static class VirtualNasServerInterfacesQueryParams extends HashMap<String, Object> {
    public VirtualNasServerInterfacesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * IP addresses
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return VirtualNasServerIpAddressesResponse
   */
  @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualNasServerIpAddressesResponse virtualNasServerIpAddresses(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualNasServerIpAddressesRequest body);

  /**
   * IP addresses
   * Similar to <code>virtualNasServerIpAddresses</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualNasServerIpAddressesResponse> virtualNasServerIpAddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualNasServerIpAddressesRequest body);


  /**
   * IP addresses
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>virtualNasServerIpAddresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualNasServerIpAddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualNasServerIpAddressesResponse
   */
  @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualNasServerIpAddressesResponse virtualNasServerIpAddresses(@Param("elid") String elid, VirtualNasServerIpAddressesRequest body, @QueryMap(encoded=true) VirtualNasServerIpAddressesQueryParams queryParams);

  /**
  * IP addresses
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>virtualNasServerIpAddresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualNasServerIpAddressesResponse
      */
      @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/IpAddresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualNasServerIpAddressesResponse> virtualNasServerIpAddressesWithHttpInfo(@Param("elid") String elid, VirtualNasServerIpAddressesRequest body, @QueryMap(encoded=true) VirtualNasServerIpAddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualNasServerIpAddresses</code> method in a fluent style.
   */
  public static class VirtualNasServerIpAddressesQueryParams extends HashMap<String, Object> {
    public VirtualNasServerIpAddressesQueryParams sessionId(final String value) {
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
   * @return VirtualNasServerIpv4AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualNasServerIpv4AddressesResponseData virtualNasServerIpv4Addresses(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualNasServerIpv4AddressesRequestData body);

  /**
   * Get relations to IPv4 address entities
   * Similar to <code>virtualNasServerIpv4Addresses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualNasServerIpv4AddressesResponseData> virtualNasServerIpv4AddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualNasServerIpv4AddressesRequestData body);


  /**
   * Get relations to IPv4 address entities
   * 
   * Note, this is equivalent to the other <code>virtualNasServerIpv4Addresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualNasServerIpv4AddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualNasServerIpv4AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualNasServerIpv4AddressesResponseData virtualNasServerIpv4Addresses(@Param("elid") String elid, VirtualNasServerIpv4AddressesRequestData body, @QueryMap(encoded=true) VirtualNasServerIpv4AddressesQueryParams queryParams);

  /**
  * Get relations to IPv4 address entities
  * 
  * Note, this is equivalent to the other <code>virtualNasServerIpv4Addresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualNasServerIpv4AddressesResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/Ipv4Addresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualNasServerIpv4AddressesResponseData> virtualNasServerIpv4AddressesWithHttpInfo(@Param("elid") String elid, VirtualNasServerIpv4AddressesRequestData body, @QueryMap(encoded=true) VirtualNasServerIpv4AddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualNasServerIpv4Addresses</code> method in a fluent style.
   */
  public static class VirtualNasServerIpv4AddressesQueryParams extends HashMap<String, Object> {
    public VirtualNasServerIpv4AddressesQueryParams sessionId(final String value) {
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
   * @return VirtualNasServerIpv4NetrangesResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualNasServerIpv4NetrangesResponseData virtualNasServerIpv4Netranges(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualNasServerIpv4NetrangesRequestData body);

  /**
   * Get relations to IPv4 netrange entities
   * Similar to <code>virtualNasServerIpv4Netranges</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualNasServerIpv4NetrangesResponseData> virtualNasServerIpv4NetrangesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualNasServerIpv4NetrangesRequestData body);


  /**
   * Get relations to IPv4 netrange entities
   * 
   * Note, this is equivalent to the other <code>virtualNasServerIpv4Netranges</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualNasServerIpv4NetrangesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualNasServerIpv4NetrangesResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualNasServerIpv4NetrangesResponseData virtualNasServerIpv4Netranges(@Param("elid") String elid, VirtualNasServerIpv4NetrangesRequestData body, @QueryMap(encoded=true) VirtualNasServerIpv4NetrangesQueryParams queryParams);

  /**
  * Get relations to IPv4 netrange entities
  * 
  * Note, this is equivalent to the other <code>virtualNasServerIpv4Netranges</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualNasServerIpv4NetrangesResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/Ipv4Netranges?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualNasServerIpv4NetrangesResponseData> virtualNasServerIpv4NetrangesWithHttpInfo(@Param("elid") String elid, VirtualNasServerIpv4NetrangesRequestData body, @QueryMap(encoded=true) VirtualNasServerIpv4NetrangesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualNasServerIpv4Netranges</code> method in a fluent style.
   */
  public static class VirtualNasServerIpv4NetrangesQueryParams extends HashMap<String, Object> {
    public VirtualNasServerIpv4NetrangesQueryParams sessionId(final String value) {
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
   * @return VirtualNasServerIpv4NetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualNasServerIpv4NetworksResponseData virtualNasServerIpv4Networks(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualNasServerIpv4NetworksRequestData body);

  /**
   * Get relations to IPv4 Network entities
   * Similar to <code>virtualNasServerIpv4Networks</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualNasServerIpv4NetworksResponseData> virtualNasServerIpv4NetworksWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualNasServerIpv4NetworksRequestData body);


  /**
   * Get relations to IPv4 Network entities
   * 
   * Note, this is equivalent to the other <code>virtualNasServerIpv4Networks</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualNasServerIpv4NetworksQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualNasServerIpv4NetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualNasServerIpv4NetworksResponseData virtualNasServerIpv4Networks(@Param("elid") String elid, VirtualNasServerIpv4NetworksRequestData body, @QueryMap(encoded=true) VirtualNasServerIpv4NetworksQueryParams queryParams);

  /**
  * Get relations to IPv4 Network entities
  * 
  * Note, this is equivalent to the other <code>virtualNasServerIpv4Networks</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualNasServerIpv4NetworksResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/Ipv4Networks?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualNasServerIpv4NetworksResponseData> virtualNasServerIpv4NetworksWithHttpInfo(@Param("elid") String elid, VirtualNasServerIpv4NetworksRequestData body, @QueryMap(encoded=true) VirtualNasServerIpv4NetworksQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualNasServerIpv4Networks</code> method in a fluent style.
   */
  public static class VirtualNasServerIpv4NetworksQueryParams extends HashMap<String, Object> {
    public VirtualNasServerIpv4NetworksQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Nets / Net ranges
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return VirtualNasServerNetworksAndNetrangesResponse
   */
  @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualNasServerNetworksAndNetrangesResponse virtualNasServerNetworksAndNetranges(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualNasServerNetworksAndNetrangesRequest body);

  /**
   * Nets / Net ranges
   * Similar to <code>virtualNasServerNetworksAndNetranges</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualNasServerNetworksAndNetrangesResponse> virtualNasServerNetworksAndNetrangesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualNasServerNetworksAndNetrangesRequest body);


  /**
   * Nets / Net ranges
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>virtualNasServerNetworksAndNetranges</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualNasServerNetworksAndNetrangesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualNasServerNetworksAndNetrangesResponse
   */
  @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualNasServerNetworksAndNetrangesResponse virtualNasServerNetworksAndNetranges(@Param("elid") String elid, VirtualNasServerNetworksAndNetrangesRequest body, @QueryMap(encoded=true) VirtualNasServerNetworksAndNetrangesQueryParams queryParams);

  /**
  * Nets / Net ranges
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>virtualNasServerNetworksAndNetranges</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualNasServerNetworksAndNetrangesResponse
      */
      @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/NetworksAndNetranges?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualNasServerNetworksAndNetrangesResponse> virtualNasServerNetworksAndNetrangesWithHttpInfo(@Param("elid") String elid, VirtualNasServerNetworksAndNetrangesRequest body, @QueryMap(encoded=true) VirtualNasServerNetworksAndNetrangesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualNasServerNetworksAndNetranges</code> method in a fluent style.
   */
  public static class VirtualNasServerNetworksAndNetrangesQueryParams extends HashMap<String, Object> {
    public VirtualNasServerNetworksAndNetrangesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return VirtualNasServerQueryResponse
   */
  @RequestLine("POST /api/rest/entity/virtualNasServer/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualNasServerQueryResponse virtualNasServerQuery(@Param("sessionId") String sessionId, VirtualNasServerQueryRequest body);

  /**
   * Basic query
   * Similar to <code>virtualNasServerQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualNasServer/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualNasServerQueryResponse> virtualNasServerQueryWithHttpInfo(@Param("sessionId") String sessionId, VirtualNasServerQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>virtualNasServerQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualNasServerQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualNasServerQueryResponse
   */
  @RequestLine("POST /api/rest/entity/virtualNasServer/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualNasServerQueryResponse virtualNasServerQuery(VirtualNasServerQueryRequest body, @QueryMap(encoded=true) VirtualNasServerQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>virtualNasServerQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualNasServerQueryResponse
      */
      @RequestLine("POST /api/rest/entity/virtualNasServer/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualNasServerQueryResponse> virtualNasServerQueryWithHttpInfo(VirtualNasServerQueryRequest body, @QueryMap(encoded=true) VirtualNasServerQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualNasServerQuery</code> method in a fluent style.
   */
  public static class VirtualNasServerQueryQueryParams extends HashMap<String, Object> {
    public VirtualNasServerQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Storage system entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return VirtualNasServerStorageSystemResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/StorageSystem?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualNasServerStorageSystemResponseData virtualNasServerStorageSystem(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualNasServerStorageSystemRequestData body);

  /**
   * Get relations to Storage system entities
   * Similar to <code>virtualNasServerStorageSystem</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/StorageSystem?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualNasServerStorageSystemResponseData> virtualNasServerStorageSystemWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualNasServerStorageSystemRequestData body);


  /**
   * Get relations to Storage system entities
   * 
   * Note, this is equivalent to the other <code>virtualNasServerStorageSystem</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualNasServerStorageSystemQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualNasServerStorageSystemResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/StorageSystem?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualNasServerStorageSystemResponseData virtualNasServerStorageSystem(@Param("elid") String elid, VirtualNasServerStorageSystemRequestData body, @QueryMap(encoded=true) VirtualNasServerStorageSystemQueryParams queryParams);

  /**
  * Get relations to Storage system entities
  * 
  * Note, this is equivalent to the other <code>virtualNasServerStorageSystem</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualNasServerStorageSystemResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/StorageSystem?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualNasServerStorageSystemResponseData> virtualNasServerStorageSystemWithHttpInfo(@Param("elid") String elid, VirtualNasServerStorageSystemRequestData body, @QueryMap(encoded=true) VirtualNasServerStorageSystemQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualNasServerStorageSystem</code> method in a fluent style.
   */
  public static class VirtualNasServerStorageSystemQueryParams extends HashMap<String, Object> {
    public VirtualNasServerStorageSystemQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Storage unit Qtree entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return VirtualNasServerStorageUnitQtreesResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/StorageUnitQtrees?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualNasServerStorageUnitQtreesResponseData virtualNasServerStorageUnitQtrees(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualNasServerStorageUnitQtreesRequestData body);

  /**
   * Get relations to Storage unit Qtree entities
   * Similar to <code>virtualNasServerStorageUnitQtrees</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/StorageUnitQtrees?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualNasServerStorageUnitQtreesResponseData> virtualNasServerStorageUnitQtreesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualNasServerStorageUnitQtreesRequestData body);


  /**
   * Get relations to Storage unit Qtree entities
   * 
   * Note, this is equivalent to the other <code>virtualNasServerStorageUnitQtrees</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualNasServerStorageUnitQtreesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualNasServerStorageUnitQtreesResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/StorageUnitQtrees?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualNasServerStorageUnitQtreesResponseData virtualNasServerStorageUnitQtrees(@Param("elid") String elid, VirtualNasServerStorageUnitQtreesRequestData body, @QueryMap(encoded=true) VirtualNasServerStorageUnitQtreesQueryParams queryParams);

  /**
  * Get relations to Storage unit Qtree entities
  * 
  * Note, this is equivalent to the other <code>virtualNasServerStorageUnitQtrees</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualNasServerStorageUnitQtreesResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/StorageUnitQtrees?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualNasServerStorageUnitQtreesResponseData> virtualNasServerStorageUnitQtreesWithHttpInfo(@Param("elid") String elid, VirtualNasServerStorageUnitQtreesRequestData body, @QueryMap(encoded=true) VirtualNasServerStorageUnitQtreesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualNasServerStorageUnitQtrees</code> method in a fluent style.
   */
  public static class VirtualNasServerStorageUnitQtreesQueryParams extends HashMap<String, Object> {
    public VirtualNasServerStorageUnitQtreesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Storage unit Volume entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return VirtualNasServerStorageUnitVolumesResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/StorageUnitVolumes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualNasServerStorageUnitVolumesResponseData virtualNasServerStorageUnitVolumes(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualNasServerStorageUnitVolumesRequestData body);

  /**
   * Get relations to Storage unit Volume entities
   * Similar to <code>virtualNasServerStorageUnitVolumes</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/StorageUnitVolumes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualNasServerStorageUnitVolumesResponseData> virtualNasServerStorageUnitVolumesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualNasServerStorageUnitVolumesRequestData body);


  /**
   * Get relations to Storage unit Volume entities
   * 
   * Note, this is equivalent to the other <code>virtualNasServerStorageUnitVolumes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualNasServerStorageUnitVolumesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualNasServerStorageUnitVolumesResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/StorageUnitVolumes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualNasServerStorageUnitVolumesResponseData virtualNasServerStorageUnitVolumes(@Param("elid") String elid, VirtualNasServerStorageUnitVolumesRequestData body, @QueryMap(encoded=true) VirtualNasServerStorageUnitVolumesQueryParams queryParams);

  /**
  * Get relations to Storage unit Volume entities
  * 
  * Note, this is equivalent to the other <code>virtualNasServerStorageUnitVolumes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualNasServerStorageUnitVolumesResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/StorageUnitVolumes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualNasServerStorageUnitVolumesResponseData> virtualNasServerStorageUnitVolumesWithHttpInfo(@Param("elid") String elid, VirtualNasServerStorageUnitVolumesRequestData body, @QueryMap(encoded=true) VirtualNasServerStorageUnitVolumesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualNasServerStorageUnitVolumes</code> method in a fluent style.
   */
  public static class VirtualNasServerStorageUnitVolumesQueryParams extends HashMap<String, Object> {
    public VirtualNasServerStorageUnitVolumesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Storage entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return VirtualNasServerStoragesResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/Storages?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualNasServerStoragesResponseData virtualNasServerStorages(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualNasServerStoragesRequestData body);

  /**
   * Get relations to Storage entities
   * Similar to <code>virtualNasServerStorages</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/Storages?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualNasServerStoragesResponseData> virtualNasServerStoragesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualNasServerStoragesRequestData body);


  /**
   * Get relations to Storage entities
   * 
   * Note, this is equivalent to the other <code>virtualNasServerStorages</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualNasServerStoragesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualNasServerStoragesResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/Storages?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualNasServerStoragesResponseData virtualNasServerStorages(@Param("elid") String elid, VirtualNasServerStoragesRequestData body, @QueryMap(encoded=true) VirtualNasServerStoragesQueryParams queryParams);

  /**
  * Get relations to Storage entities
  * 
  * Note, this is equivalent to the other <code>virtualNasServerStorages</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualNasServerStoragesResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/Storages?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualNasServerStoragesResponseData> virtualNasServerStoragesWithHttpInfo(@Param("elid") String elid, VirtualNasServerStoragesRequestData body, @QueryMap(encoded=true) VirtualNasServerStoragesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualNasServerStorages</code> method in a fluent style.
   */
  public static class VirtualNasServerStoragesQueryParams extends HashMap<String, Object> {
    public VirtualNasServerStoragesQueryParams sessionId(final String value) {
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
   * @return VirtualNasServerSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualNasServerSystemAttributesResponse virtualNasServerSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualNasServerSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>virtualNasServerSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualNasServerSystemAttributesResponse> virtualNasServerSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualNasServerSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>virtualNasServerSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualNasServerSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualNasServerSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualNasServerSystemAttributesResponse virtualNasServerSystemAttributes(@Param("elid") String elid, VirtualNasServerSystemAttributesRequest body, @QueryMap(encoded=true) VirtualNasServerSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>virtualNasServerSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualNasServerSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualNasServerSystemAttributesResponse> virtualNasServerSystemAttributesWithHttpInfo(@Param("elid") String elid, VirtualNasServerSystemAttributesRequest body, @QueryMap(encoded=true) VirtualNasServerSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualNasServerSystemAttributes</code> method in a fluent style.
   */
  public static class VirtualNasServerSystemAttributesQueryParams extends HashMap<String, Object> {
    public VirtualNasServerSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * VLANs
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return VirtualNasServerVlansResponse
   */
  @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualNasServerVlansResponse virtualNasServerVlans(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualNasServerVlansRequest body);

  /**
   * VLANs
   * Similar to <code>virtualNasServerVlans</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualNasServerVlansResponse> virtualNasServerVlansWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualNasServerVlansRequest body);


  /**
   * VLANs
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>virtualNasServerVlans</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualNasServerVlansQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualNasServerVlansResponse
   */
  @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualNasServerVlansResponse virtualNasServerVlans(@Param("elid") String elid, VirtualNasServerVlansRequest body, @QueryMap(encoded=true) VirtualNasServerVlansQueryParams queryParams);

  /**
  * VLANs
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>virtualNasServerVlans</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualNasServerVlansResponse
      */
      @RequestLine("POST /api/rest/entity/virtualNasServer/{elid}/Vlans?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualNasServerVlansResponse> virtualNasServerVlansWithHttpInfo(@Param("elid") String elid, VirtualNasServerVlansRequest body, @QueryMap(encoded=true) VirtualNasServerVlansQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualNasServerVlans</code> method in a fluent style.
   */
  public static class VirtualNasServerVlansQueryParams extends HashMap<String, Object> {
    public VirtualNasServerVlansQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
