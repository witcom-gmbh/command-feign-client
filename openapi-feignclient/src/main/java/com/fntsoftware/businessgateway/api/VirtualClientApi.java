package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateVirtualClientRequestData;
import com.fntsoftware.businessgateway.entities.CreateVirtualClientResponse;
import com.fntsoftware.businessgateway.entities.DeleteVirtualClientRequestData;
import com.fntsoftware.businessgateway.entities.DeleteVirtualClientResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesVirtualClientRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesVirtualClientResponse;
import com.fntsoftware.businessgateway.entities.UpdateVirtualClientRequestData;
import com.fntsoftware.businessgateway.entities.UpdateVirtualClientResponse;
import com.fntsoftware.businessgateway.entities.VirtualClientContractsRequestData;
import com.fntsoftware.businessgateway.entities.VirtualClientContractsResponseData;
import com.fntsoftware.businessgateway.entities.VirtualClientFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.VirtualClientFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.VirtualClientInterfacesRequestData;
import com.fntsoftware.businessgateway.entities.VirtualClientInterfacesResponseData;
import com.fntsoftware.businessgateway.entities.VirtualClientIpAddressesRequest;
import com.fntsoftware.businessgateway.entities.VirtualClientIpAddressesResponse;
import com.fntsoftware.businessgateway.entities.VirtualClientIpv4AddressesRequestData;
import com.fntsoftware.businessgateway.entities.VirtualClientIpv4AddressesResponseData;
import com.fntsoftware.businessgateway.entities.VirtualClientIpv4NetrangesRequestData;
import com.fntsoftware.businessgateway.entities.VirtualClientIpv4NetrangesResponseData;
import com.fntsoftware.businessgateway.entities.VirtualClientIpv4NetworksRequestData;
import com.fntsoftware.businessgateway.entities.VirtualClientIpv4NetworksResponseData;
import com.fntsoftware.businessgateway.entities.VirtualClientMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.VirtualClientMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.VirtualClientMaintenanceWindowsRequestData;
import com.fntsoftware.businessgateway.entities.VirtualClientMaintenanceWindowsResponseData;
import com.fntsoftware.businessgateway.entities.VirtualClientNetworksAndNetrangesRequest;
import com.fntsoftware.businessgateway.entities.VirtualClientNetworksAndNetrangesResponse;
import com.fntsoftware.businessgateway.entities.VirtualClientOperatingSystemInstallationRequestData;
import com.fntsoftware.businessgateway.entities.VirtualClientOperatingSystemInstallationResponseData;
import com.fntsoftware.businessgateway.entities.VirtualClientOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.VirtualClientOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.VirtualClientPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.VirtualClientPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.VirtualClientPersonsRequestData;
import com.fntsoftware.businessgateway.entities.VirtualClientPersonsResponseData;
import com.fntsoftware.businessgateway.entities.VirtualClientQueryRequest;
import com.fntsoftware.businessgateway.entities.VirtualClientQueryResponse;
import com.fntsoftware.businessgateway.entities.VirtualClientServerRequestData;
import com.fntsoftware.businessgateway.entities.VirtualClientServerResponseData;
import com.fntsoftware.businessgateway.entities.VirtualClientServerfarmsRequestData;
import com.fntsoftware.businessgateway.entities.VirtualClientServerfarmsResponseData;
import com.fntsoftware.businessgateway.entities.VirtualClientSoftwareInstallationsRequestData;
import com.fntsoftware.businessgateway.entities.VirtualClientSoftwareInstallationsResponseData;
import com.fntsoftware.businessgateway.entities.VirtualClientSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.VirtualClientSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.VirtualClientVlansRequest;
import com.fntsoftware.businessgateway.entities.VirtualClientVlansResponse;
import com.fntsoftware.businessgateway.entities.VirtualClientWorkplacesRequestData;
import com.fntsoftware.businessgateway.entities.VirtualClientWorkplacesResponseData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface VirtualClientApi extends ApiClient.Api {


  /**
   * Create
   * Create Virtual client
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateVirtualClientResponse
   */
  @RequestLine("POST /api/rest/entity/virtualClient/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateVirtualClientResponse createVirtualClient(@Param("sessionId") String sessionId, CreateVirtualClientRequestData body);

  /**
   * Create
   * Similar to <code>createVirtualClient</code> but it also returns the http response headers .
   * Create Virtual client
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualClient/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateVirtualClientResponse> createVirtualClientWithHttpInfo(@Param("sessionId") String sessionId, CreateVirtualClientRequestData body);


  /**
   * Create
   * Create Virtual client
   * Note, this is equivalent to the other <code>createVirtualClient</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateVirtualClientQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateVirtualClientResponse
   */
  @RequestLine("POST /api/rest/entity/virtualClient/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateVirtualClientResponse createVirtualClient(CreateVirtualClientRequestData body, @QueryMap(encoded=true) CreateVirtualClientQueryParams queryParams);

  /**
  * Create
  * Create Virtual client
  * Note, this is equivalent to the other <code>createVirtualClient</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateVirtualClientResponse
      */
      @RequestLine("POST /api/rest/entity/virtualClient/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateVirtualClientResponse> createVirtualClientWithHttpInfo(CreateVirtualClientRequestData body, @QueryMap(encoded=true) CreateVirtualClientQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createVirtualClient</code> method in a fluent style.
   */
  public static class CreateVirtualClientQueryParams extends HashMap<String, Object> {
    public CreateVirtualClientQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Virtual client
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteVirtualClientResponse
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteVirtualClientResponse deleteVirtualClient(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteVirtualClientRequestData body);

  /**
   * Delete
   * Similar to <code>deleteVirtualClient</code> but it also returns the http response headers .
   * Delete Virtual client
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteVirtualClientResponse> deleteVirtualClientWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteVirtualClientRequestData body);


  /**
   * Delete
   * Delete Virtual client
   * Note, this is equivalent to the other <code>deleteVirtualClient</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteVirtualClientQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteVirtualClientResponse
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteVirtualClientResponse deleteVirtualClient(@Param("elid") String elid, DeleteVirtualClientRequestData body, @QueryMap(encoded=true) DeleteVirtualClientQueryParams queryParams);

  /**
  * Delete
  * Delete Virtual client
  * Note, this is equivalent to the other <code>deleteVirtualClient</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteVirtualClientResponse
      */
      @RequestLine("POST /api/rest/entity/virtualClient/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteVirtualClientResponse> deleteVirtualClientWithHttpInfo(@Param("elid") String elid, DeleteVirtualClientRequestData body, @QueryMap(encoded=true) DeleteVirtualClientQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteVirtualClient</code> method in a fluent style.
   */
  public static class DeleteVirtualClientQueryParams extends HashMap<String, Object> {
    public DeleteVirtualClientQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesVirtualClientResponse
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesVirtualClientResponse updateSystemAttributesVirtualClient(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesVirtualClientRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesVirtualClient</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesVirtualClientResponse> updateSystemAttributesVirtualClientWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesVirtualClientRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesVirtualClient</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesVirtualClientQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesVirtualClientResponse
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesVirtualClientResponse updateSystemAttributesVirtualClient(@Param("elid") String elid, UpdateSystemAttributesVirtualClientRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesVirtualClientQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesVirtualClient</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesVirtualClientResponse
      */
      @RequestLine("POST /api/rest/entity/virtualClient/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesVirtualClientResponse> updateSystemAttributesVirtualClientWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesVirtualClientRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesVirtualClientQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesVirtualClient</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesVirtualClientQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesVirtualClientQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Virtual client
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateVirtualClientResponse
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateVirtualClientResponse updateVirtualClient(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateVirtualClientRequestData body);

  /**
   * Modify
   * Similar to <code>updateVirtualClient</code> but it also returns the http response headers .
   * Modify Virtual client
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateVirtualClientResponse> updateVirtualClientWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateVirtualClientRequestData body);


  /**
   * Modify
   * Modify Virtual client
   * Note, this is equivalent to the other <code>updateVirtualClient</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateVirtualClientQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateVirtualClientResponse
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateVirtualClientResponse updateVirtualClient(@Param("elid") String elid, UpdateVirtualClientRequestData body, @QueryMap(encoded=true) UpdateVirtualClientQueryParams queryParams);

  /**
  * Modify
  * Modify Virtual client
  * Note, this is equivalent to the other <code>updateVirtualClient</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateVirtualClientResponse
      */
      @RequestLine("POST /api/rest/entity/virtualClient/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateVirtualClientResponse> updateVirtualClientWithHttpInfo(@Param("elid") String elid, UpdateVirtualClientRequestData body, @QueryMap(encoded=true) UpdateVirtualClientQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateVirtualClient</code> method in a fluent style.
   */
  public static class UpdateVirtualClientQueryParams extends HashMap<String, Object> {
    public UpdateVirtualClientQueryParams sessionId(final String value) {
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
   * @return VirtualClientContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualClientContractsResponseData virtualClientContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualClientContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>virtualClientContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualClientContractsResponseData> virtualClientContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualClientContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>virtualClientContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualClientContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualClientContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualClientContractsResponseData virtualClientContracts(@Param("elid") String elid, VirtualClientContractsRequestData body, @QueryMap(encoded=true) VirtualClientContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>virtualClientContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualClientContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualClient/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualClientContractsResponseData> virtualClientContractsWithHttpInfo(@Param("elid") String elid, VirtualClientContractsRequestData body, @QueryMap(encoded=true) VirtualClientContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualClientContracts</code> method in a fluent style.
   */
  public static class VirtualClientContractsQueryParams extends HashMap<String, Object> {
    public VirtualClientContractsQueryParams sessionId(final String value) {
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
   * @return VirtualClientFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualClientFrameContractsResponseData virtualClientFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualClientFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>virtualClientFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualClientFrameContractsResponseData> virtualClientFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualClientFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>virtualClientFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualClientFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualClientFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualClientFrameContractsResponseData virtualClientFrameContracts(@Param("elid") String elid, VirtualClientFrameContractsRequestData body, @QueryMap(encoded=true) VirtualClientFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>virtualClientFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualClientFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualClient/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualClientFrameContractsResponseData> virtualClientFrameContractsWithHttpInfo(@Param("elid") String elid, VirtualClientFrameContractsRequestData body, @QueryMap(encoded=true) VirtualClientFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualClientFrameContracts</code> method in a fluent style.
   */
  public static class VirtualClientFrameContractsQueryParams extends HashMap<String, Object> {
    public VirtualClientFrameContractsQueryParams sessionId(final String value) {
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
   * @return VirtualClientInterfacesResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualClientInterfacesResponseData virtualClientInterfaces(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualClientInterfacesRequestData body);

  /**
   * Get relations to Interface entities
   * Similar to <code>virtualClientInterfaces</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualClientInterfacesResponseData> virtualClientInterfacesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualClientInterfacesRequestData body);


  /**
   * Get relations to Interface entities
   * 
   * Note, this is equivalent to the other <code>virtualClientInterfaces</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualClientInterfacesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualClientInterfacesResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualClientInterfacesResponseData virtualClientInterfaces(@Param("elid") String elid, VirtualClientInterfacesRequestData body, @QueryMap(encoded=true) VirtualClientInterfacesQueryParams queryParams);

  /**
  * Get relations to Interface entities
  * 
  * Note, this is equivalent to the other <code>virtualClientInterfaces</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualClientInterfacesResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualClient/{elid}/Interfaces?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualClientInterfacesResponseData> virtualClientInterfacesWithHttpInfo(@Param("elid") String elid, VirtualClientInterfacesRequestData body, @QueryMap(encoded=true) VirtualClientInterfacesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualClientInterfaces</code> method in a fluent style.
   */
  public static class VirtualClientInterfacesQueryParams extends HashMap<String, Object> {
    public VirtualClientInterfacesQueryParams sessionId(final String value) {
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
   * @return VirtualClientIpAddressesResponse
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualClientIpAddressesResponse virtualClientIpAddresses(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualClientIpAddressesRequest body);

  /**
   * IP addresses
   * Similar to <code>virtualClientIpAddresses</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualClientIpAddressesResponse> virtualClientIpAddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualClientIpAddressesRequest body);


  /**
   * IP addresses
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>virtualClientIpAddresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualClientIpAddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualClientIpAddressesResponse
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualClientIpAddressesResponse virtualClientIpAddresses(@Param("elid") String elid, VirtualClientIpAddressesRequest body, @QueryMap(encoded=true) VirtualClientIpAddressesQueryParams queryParams);

  /**
  * IP addresses
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>virtualClientIpAddresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualClientIpAddressesResponse
      */
      @RequestLine("POST /api/rest/entity/virtualClient/{elid}/IpAddresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualClientIpAddressesResponse> virtualClientIpAddressesWithHttpInfo(@Param("elid") String elid, VirtualClientIpAddressesRequest body, @QueryMap(encoded=true) VirtualClientIpAddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualClientIpAddresses</code> method in a fluent style.
   */
  public static class VirtualClientIpAddressesQueryParams extends HashMap<String, Object> {
    public VirtualClientIpAddressesQueryParams sessionId(final String value) {
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
   * @return VirtualClientIpv4AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualClientIpv4AddressesResponseData virtualClientIpv4Addresses(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualClientIpv4AddressesRequestData body);

  /**
   * Get relations to IPv4 address entities
   * Similar to <code>virtualClientIpv4Addresses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualClientIpv4AddressesResponseData> virtualClientIpv4AddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualClientIpv4AddressesRequestData body);


  /**
   * Get relations to IPv4 address entities
   * 
   * Note, this is equivalent to the other <code>virtualClientIpv4Addresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualClientIpv4AddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualClientIpv4AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualClientIpv4AddressesResponseData virtualClientIpv4Addresses(@Param("elid") String elid, VirtualClientIpv4AddressesRequestData body, @QueryMap(encoded=true) VirtualClientIpv4AddressesQueryParams queryParams);

  /**
  * Get relations to IPv4 address entities
  * 
  * Note, this is equivalent to the other <code>virtualClientIpv4Addresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualClientIpv4AddressesResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualClient/{elid}/Ipv4Addresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualClientIpv4AddressesResponseData> virtualClientIpv4AddressesWithHttpInfo(@Param("elid") String elid, VirtualClientIpv4AddressesRequestData body, @QueryMap(encoded=true) VirtualClientIpv4AddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualClientIpv4Addresses</code> method in a fluent style.
   */
  public static class VirtualClientIpv4AddressesQueryParams extends HashMap<String, Object> {
    public VirtualClientIpv4AddressesQueryParams sessionId(final String value) {
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
   * @return VirtualClientIpv4NetrangesResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualClientIpv4NetrangesResponseData virtualClientIpv4Netranges(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualClientIpv4NetrangesRequestData body);

  /**
   * Get relations to IPv4 netrange entities
   * Similar to <code>virtualClientIpv4Netranges</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualClientIpv4NetrangesResponseData> virtualClientIpv4NetrangesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualClientIpv4NetrangesRequestData body);


  /**
   * Get relations to IPv4 netrange entities
   * 
   * Note, this is equivalent to the other <code>virtualClientIpv4Netranges</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualClientIpv4NetrangesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualClientIpv4NetrangesResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualClientIpv4NetrangesResponseData virtualClientIpv4Netranges(@Param("elid") String elid, VirtualClientIpv4NetrangesRequestData body, @QueryMap(encoded=true) VirtualClientIpv4NetrangesQueryParams queryParams);

  /**
  * Get relations to IPv4 netrange entities
  * 
  * Note, this is equivalent to the other <code>virtualClientIpv4Netranges</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualClientIpv4NetrangesResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualClient/{elid}/Ipv4Netranges?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualClientIpv4NetrangesResponseData> virtualClientIpv4NetrangesWithHttpInfo(@Param("elid") String elid, VirtualClientIpv4NetrangesRequestData body, @QueryMap(encoded=true) VirtualClientIpv4NetrangesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualClientIpv4Netranges</code> method in a fluent style.
   */
  public static class VirtualClientIpv4NetrangesQueryParams extends HashMap<String, Object> {
    public VirtualClientIpv4NetrangesQueryParams sessionId(final String value) {
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
   * @return VirtualClientIpv4NetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualClientIpv4NetworksResponseData virtualClientIpv4Networks(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualClientIpv4NetworksRequestData body);

  /**
   * Get relations to IPv4 Network entities
   * Similar to <code>virtualClientIpv4Networks</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualClientIpv4NetworksResponseData> virtualClientIpv4NetworksWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualClientIpv4NetworksRequestData body);


  /**
   * Get relations to IPv4 Network entities
   * 
   * Note, this is equivalent to the other <code>virtualClientIpv4Networks</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualClientIpv4NetworksQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualClientIpv4NetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualClientIpv4NetworksResponseData virtualClientIpv4Networks(@Param("elid") String elid, VirtualClientIpv4NetworksRequestData body, @QueryMap(encoded=true) VirtualClientIpv4NetworksQueryParams queryParams);

  /**
  * Get relations to IPv4 Network entities
  * 
  * Note, this is equivalent to the other <code>virtualClientIpv4Networks</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualClientIpv4NetworksResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualClient/{elid}/Ipv4Networks?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualClientIpv4NetworksResponseData> virtualClientIpv4NetworksWithHttpInfo(@Param("elid") String elid, VirtualClientIpv4NetworksRequestData body, @QueryMap(encoded=true) VirtualClientIpv4NetworksQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualClientIpv4Networks</code> method in a fluent style.
   */
  public static class VirtualClientIpv4NetworksQueryParams extends HashMap<String, Object> {
    public VirtualClientIpv4NetworksQueryParams sessionId(final String value) {
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
   * @return VirtualClientMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualClientMaintenanceContractsResponseData virtualClientMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualClientMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>virtualClientMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualClientMaintenanceContractsResponseData> virtualClientMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualClientMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>virtualClientMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualClientMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualClientMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualClientMaintenanceContractsResponseData virtualClientMaintenanceContracts(@Param("elid") String elid, VirtualClientMaintenanceContractsRequestData body, @QueryMap(encoded=true) VirtualClientMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>virtualClientMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualClientMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualClient/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualClientMaintenanceContractsResponseData> virtualClientMaintenanceContractsWithHttpInfo(@Param("elid") String elid, VirtualClientMaintenanceContractsRequestData body, @QueryMap(encoded=true) VirtualClientMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualClientMaintenanceContracts</code> method in a fluent style.
   */
  public static class VirtualClientMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public VirtualClientMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return VirtualClientMaintenanceWindowsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/MaintenanceWindows?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualClientMaintenanceWindowsResponseData virtualClientMaintenanceWindows(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualClientMaintenanceWindowsRequestData body);

  /**
   * Get relations to Maintenance window entities
   * Similar to <code>virtualClientMaintenanceWindows</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/MaintenanceWindows?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualClientMaintenanceWindowsResponseData> virtualClientMaintenanceWindowsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualClientMaintenanceWindowsRequestData body);


  /**
   * Get relations to Maintenance window entities
   * 
   * Note, this is equivalent to the other <code>virtualClientMaintenanceWindows</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualClientMaintenanceWindowsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualClientMaintenanceWindowsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/MaintenanceWindows?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualClientMaintenanceWindowsResponseData virtualClientMaintenanceWindows(@Param("elid") String elid, VirtualClientMaintenanceWindowsRequestData body, @QueryMap(encoded=true) VirtualClientMaintenanceWindowsQueryParams queryParams);

  /**
  * Get relations to Maintenance window entities
  * 
  * Note, this is equivalent to the other <code>virtualClientMaintenanceWindows</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualClientMaintenanceWindowsResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualClient/{elid}/MaintenanceWindows?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualClientMaintenanceWindowsResponseData> virtualClientMaintenanceWindowsWithHttpInfo(@Param("elid") String elid, VirtualClientMaintenanceWindowsRequestData body, @QueryMap(encoded=true) VirtualClientMaintenanceWindowsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualClientMaintenanceWindows</code> method in a fluent style.
   */
  public static class VirtualClientMaintenanceWindowsQueryParams extends HashMap<String, Object> {
    public VirtualClientMaintenanceWindowsQueryParams sessionId(final String value) {
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
   * @return VirtualClientNetworksAndNetrangesResponse
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualClientNetworksAndNetrangesResponse virtualClientNetworksAndNetranges(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualClientNetworksAndNetrangesRequest body);

  /**
   * Nets / Net ranges
   * Similar to <code>virtualClientNetworksAndNetranges</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualClientNetworksAndNetrangesResponse> virtualClientNetworksAndNetrangesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualClientNetworksAndNetrangesRequest body);


  /**
   * Nets / Net ranges
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>virtualClientNetworksAndNetranges</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualClientNetworksAndNetrangesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualClientNetworksAndNetrangesResponse
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualClientNetworksAndNetrangesResponse virtualClientNetworksAndNetranges(@Param("elid") String elid, VirtualClientNetworksAndNetrangesRequest body, @QueryMap(encoded=true) VirtualClientNetworksAndNetrangesQueryParams queryParams);

  /**
  * Nets / Net ranges
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>virtualClientNetworksAndNetranges</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualClientNetworksAndNetrangesResponse
      */
      @RequestLine("POST /api/rest/entity/virtualClient/{elid}/NetworksAndNetranges?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualClientNetworksAndNetrangesResponse> virtualClientNetworksAndNetrangesWithHttpInfo(@Param("elid") String elid, VirtualClientNetworksAndNetrangesRequest body, @QueryMap(encoded=true) VirtualClientNetworksAndNetrangesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualClientNetworksAndNetranges</code> method in a fluent style.
   */
  public static class VirtualClientNetworksAndNetrangesQueryParams extends HashMap<String, Object> {
    public VirtualClientNetworksAndNetrangesQueryParams sessionId(final String value) {
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
   * @return VirtualClientOperatingSystemInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualClientOperatingSystemInstallationResponseData virtualClientOperatingSystemInstallation(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualClientOperatingSystemInstallationRequestData body);

  /**
   * Get relations to Operating system installation entities
   * Similar to <code>virtualClientOperatingSystemInstallation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualClientOperatingSystemInstallationResponseData> virtualClientOperatingSystemInstallationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualClientOperatingSystemInstallationRequestData body);


  /**
   * Get relations to Operating system installation entities
   * 
   * Note, this is equivalent to the other <code>virtualClientOperatingSystemInstallation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualClientOperatingSystemInstallationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualClientOperatingSystemInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualClientOperatingSystemInstallationResponseData virtualClientOperatingSystemInstallation(@Param("elid") String elid, VirtualClientOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) VirtualClientOperatingSystemInstallationQueryParams queryParams);

  /**
  * Get relations to Operating system installation entities
  * 
  * Note, this is equivalent to the other <code>virtualClientOperatingSystemInstallation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualClientOperatingSystemInstallationResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualClient/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualClientOperatingSystemInstallationResponseData> virtualClientOperatingSystemInstallationWithHttpInfo(@Param("elid") String elid, VirtualClientOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) VirtualClientOperatingSystemInstallationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualClientOperatingSystemInstallation</code> method in a fluent style.
   */
  public static class VirtualClientOperatingSystemInstallationQueryParams extends HashMap<String, Object> {
    public VirtualClientOperatingSystemInstallationQueryParams sessionId(final String value) {
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
   * @return VirtualClientOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualClientOrganizationsResponseData virtualClientOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualClientOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>virtualClientOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualClientOrganizationsResponseData> virtualClientOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualClientOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>virtualClientOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualClientOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualClientOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualClientOrganizationsResponseData virtualClientOrganizations(@Param("elid") String elid, VirtualClientOrganizationsRequestData body, @QueryMap(encoded=true) VirtualClientOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>virtualClientOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualClientOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualClient/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualClientOrganizationsResponseData> virtualClientOrganizationsWithHttpInfo(@Param("elid") String elid, VirtualClientOrganizationsRequestData body, @QueryMap(encoded=true) VirtualClientOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualClientOrganizations</code> method in a fluent style.
   */
  public static class VirtualClientOrganizationsQueryParams extends HashMap<String, Object> {
    public VirtualClientOrganizationsQueryParams sessionId(final String value) {
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
   * @return VirtualClientPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualClientPersonGroupsResponseData virtualClientPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualClientPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>virtualClientPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualClientPersonGroupsResponseData> virtualClientPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualClientPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>virtualClientPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualClientPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualClientPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualClientPersonGroupsResponseData virtualClientPersonGroups(@Param("elid") String elid, VirtualClientPersonGroupsRequestData body, @QueryMap(encoded=true) VirtualClientPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>virtualClientPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualClientPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualClient/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualClientPersonGroupsResponseData> virtualClientPersonGroupsWithHttpInfo(@Param("elid") String elid, VirtualClientPersonGroupsRequestData body, @QueryMap(encoded=true) VirtualClientPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualClientPersonGroups</code> method in a fluent style.
   */
  public static class VirtualClientPersonGroupsQueryParams extends HashMap<String, Object> {
    public VirtualClientPersonGroupsQueryParams sessionId(final String value) {
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
   * @return VirtualClientPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualClientPersonsResponseData virtualClientPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualClientPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>virtualClientPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualClientPersonsResponseData> virtualClientPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualClientPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>virtualClientPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualClientPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualClientPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualClientPersonsResponseData virtualClientPersons(@Param("elid") String elid, VirtualClientPersonsRequestData body, @QueryMap(encoded=true) VirtualClientPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>virtualClientPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualClientPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualClient/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualClientPersonsResponseData> virtualClientPersonsWithHttpInfo(@Param("elid") String elid, VirtualClientPersonsRequestData body, @QueryMap(encoded=true) VirtualClientPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualClientPersons</code> method in a fluent style.
   */
  public static class VirtualClientPersonsQueryParams extends HashMap<String, Object> {
    public VirtualClientPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return VirtualClientQueryResponse
   */
  @RequestLine("POST /api/rest/entity/virtualClient/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualClientQueryResponse virtualClientQuery(@Param("sessionId") String sessionId, VirtualClientQueryRequest body);

  /**
   * Basic query
   * Similar to <code>virtualClientQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualClient/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualClientQueryResponse> virtualClientQueryWithHttpInfo(@Param("sessionId") String sessionId, VirtualClientQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>virtualClientQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualClientQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualClientQueryResponse
   */
  @RequestLine("POST /api/rest/entity/virtualClient/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualClientQueryResponse virtualClientQuery(VirtualClientQueryRequest body, @QueryMap(encoded=true) VirtualClientQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>virtualClientQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualClientQueryResponse
      */
      @RequestLine("POST /api/rest/entity/virtualClient/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualClientQueryResponse> virtualClientQueryWithHttpInfo(VirtualClientQueryRequest body, @QueryMap(encoded=true) VirtualClientQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualClientQuery</code> method in a fluent style.
   */
  public static class VirtualClientQueryQueryParams extends HashMap<String, Object> {
    public VirtualClientQueryQueryParams sessionId(final String value) {
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
   * @return VirtualClientServerResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/Server?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualClientServerResponseData virtualClientServer(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualClientServerRequestData body);

  /**
   * Get relations to Server entities
   * Similar to <code>virtualClientServer</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/Server?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualClientServerResponseData> virtualClientServerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualClientServerRequestData body);


  /**
   * Get relations to Server entities
   * 
   * Note, this is equivalent to the other <code>virtualClientServer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualClientServerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualClientServerResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/Server?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualClientServerResponseData virtualClientServer(@Param("elid") String elid, VirtualClientServerRequestData body, @QueryMap(encoded=true) VirtualClientServerQueryParams queryParams);

  /**
  * Get relations to Server entities
  * 
  * Note, this is equivalent to the other <code>virtualClientServer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualClientServerResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualClient/{elid}/Server?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualClientServerResponseData> virtualClientServerWithHttpInfo(@Param("elid") String elid, VirtualClientServerRequestData body, @QueryMap(encoded=true) VirtualClientServerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualClientServer</code> method in a fluent style.
   */
  public static class VirtualClientServerQueryParams extends HashMap<String, Object> {
    public VirtualClientServerQueryParams sessionId(final String value) {
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
   * @return VirtualClientServerfarmsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/Serverfarms?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualClientServerfarmsResponseData virtualClientServerfarms(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualClientServerfarmsRequestData body);

  /**
   * Get relations to Serverfarm entities
   * Similar to <code>virtualClientServerfarms</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/Serverfarms?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualClientServerfarmsResponseData> virtualClientServerfarmsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualClientServerfarmsRequestData body);


  /**
   * Get relations to Serverfarm entities
   * 
   * Note, this is equivalent to the other <code>virtualClientServerfarms</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualClientServerfarmsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualClientServerfarmsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/Serverfarms?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualClientServerfarmsResponseData virtualClientServerfarms(@Param("elid") String elid, VirtualClientServerfarmsRequestData body, @QueryMap(encoded=true) VirtualClientServerfarmsQueryParams queryParams);

  /**
  * Get relations to Serverfarm entities
  * 
  * Note, this is equivalent to the other <code>virtualClientServerfarms</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualClientServerfarmsResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualClient/{elid}/Serverfarms?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualClientServerfarmsResponseData> virtualClientServerfarmsWithHttpInfo(@Param("elid") String elid, VirtualClientServerfarmsRequestData body, @QueryMap(encoded=true) VirtualClientServerfarmsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualClientServerfarms</code> method in a fluent style.
   */
  public static class VirtualClientServerfarmsQueryParams extends HashMap<String, Object> {
    public VirtualClientServerfarmsQueryParams sessionId(final String value) {
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
   * @return VirtualClientSoftwareInstallationsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/SoftwareInstallations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualClientSoftwareInstallationsResponseData virtualClientSoftwareInstallations(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualClientSoftwareInstallationsRequestData body);

  /**
   * Get relations to Software installation entities
   * Similar to <code>virtualClientSoftwareInstallations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/SoftwareInstallations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualClientSoftwareInstallationsResponseData> virtualClientSoftwareInstallationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualClientSoftwareInstallationsRequestData body);


  /**
   * Get relations to Software installation entities
   * 
   * Note, this is equivalent to the other <code>virtualClientSoftwareInstallations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualClientSoftwareInstallationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualClientSoftwareInstallationsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/SoftwareInstallations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualClientSoftwareInstallationsResponseData virtualClientSoftwareInstallations(@Param("elid") String elid, VirtualClientSoftwareInstallationsRequestData body, @QueryMap(encoded=true) VirtualClientSoftwareInstallationsQueryParams queryParams);

  /**
  * Get relations to Software installation entities
  * 
  * Note, this is equivalent to the other <code>virtualClientSoftwareInstallations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualClientSoftwareInstallationsResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualClient/{elid}/SoftwareInstallations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualClientSoftwareInstallationsResponseData> virtualClientSoftwareInstallationsWithHttpInfo(@Param("elid") String elid, VirtualClientSoftwareInstallationsRequestData body, @QueryMap(encoded=true) VirtualClientSoftwareInstallationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualClientSoftwareInstallations</code> method in a fluent style.
   */
  public static class VirtualClientSoftwareInstallationsQueryParams extends HashMap<String, Object> {
    public VirtualClientSoftwareInstallationsQueryParams sessionId(final String value) {
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
   * @return VirtualClientSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualClientSystemAttributesResponse virtualClientSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualClientSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>virtualClientSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualClientSystemAttributesResponse> virtualClientSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualClientSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>virtualClientSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualClientSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualClientSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualClientSystemAttributesResponse virtualClientSystemAttributes(@Param("elid") String elid, VirtualClientSystemAttributesRequest body, @QueryMap(encoded=true) VirtualClientSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>virtualClientSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualClientSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/virtualClient/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualClientSystemAttributesResponse> virtualClientSystemAttributesWithHttpInfo(@Param("elid") String elid, VirtualClientSystemAttributesRequest body, @QueryMap(encoded=true) VirtualClientSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualClientSystemAttributes</code> method in a fluent style.
   */
  public static class VirtualClientSystemAttributesQueryParams extends HashMap<String, Object> {
    public VirtualClientSystemAttributesQueryParams sessionId(final String value) {
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
   * @return VirtualClientVlansResponse
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualClientVlansResponse virtualClientVlans(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualClientVlansRequest body);

  /**
   * VLANs
   * Similar to <code>virtualClientVlans</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualClientVlansResponse> virtualClientVlansWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualClientVlansRequest body);


  /**
   * VLANs
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>virtualClientVlans</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualClientVlansQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualClientVlansResponse
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualClientVlansResponse virtualClientVlans(@Param("elid") String elid, VirtualClientVlansRequest body, @QueryMap(encoded=true) VirtualClientVlansQueryParams queryParams);

  /**
  * VLANs
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>virtualClientVlans</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualClientVlansResponse
      */
      @RequestLine("POST /api/rest/entity/virtualClient/{elid}/Vlans?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualClientVlansResponse> virtualClientVlansWithHttpInfo(@Param("elid") String elid, VirtualClientVlansRequest body, @QueryMap(encoded=true) VirtualClientVlansQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualClientVlans</code> method in a fluent style.
   */
  public static class VirtualClientVlansQueryParams extends HashMap<String, Object> {
    public VirtualClientVlansQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Workplace entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return VirtualClientWorkplacesResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/Workplaces?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualClientWorkplacesResponseData virtualClientWorkplaces(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualClientWorkplacesRequestData body);

  /**
   * Get relations to Workplace entities
   * Similar to <code>virtualClientWorkplaces</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/Workplaces?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualClientWorkplacesResponseData> virtualClientWorkplacesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualClientWorkplacesRequestData body);


  /**
   * Get relations to Workplace entities
   * 
   * Note, this is equivalent to the other <code>virtualClientWorkplaces</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualClientWorkplacesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualClientWorkplacesResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualClient/{elid}/Workplaces?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualClientWorkplacesResponseData virtualClientWorkplaces(@Param("elid") String elid, VirtualClientWorkplacesRequestData body, @QueryMap(encoded=true) VirtualClientWorkplacesQueryParams queryParams);

  /**
  * Get relations to Workplace entities
  * 
  * Note, this is equivalent to the other <code>virtualClientWorkplaces</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualClientWorkplacesResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualClient/{elid}/Workplaces?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualClientWorkplacesResponseData> virtualClientWorkplacesWithHttpInfo(@Param("elid") String elid, VirtualClientWorkplacesRequestData body, @QueryMap(encoded=true) VirtualClientWorkplacesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualClientWorkplaces</code> method in a fluent style.
   */
  public static class VirtualClientWorkplacesQueryParams extends HashMap<String, Object> {
    public VirtualClientWorkplacesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
