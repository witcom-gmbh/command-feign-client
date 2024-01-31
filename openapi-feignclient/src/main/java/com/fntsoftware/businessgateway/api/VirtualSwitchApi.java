package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateVirtualSwitchRequestData;
import com.fntsoftware.businessgateway.entities.CreateVirtualSwitchResponse;
import com.fntsoftware.businessgateway.entities.DeleteVirtualSwitchRequestData;
import com.fntsoftware.businessgateway.entities.DeleteVirtualSwitchResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesVirtualSwitchRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesVirtualSwitchResponse;
import com.fntsoftware.businessgateway.entities.UpdateVirtualSwitchRequestData;
import com.fntsoftware.businessgateway.entities.UpdateVirtualSwitchResponse;
import com.fntsoftware.businessgateway.entities.VirtualSwitchContractsRequestData;
import com.fntsoftware.businessgateway.entities.VirtualSwitchContractsResponseData;
import com.fntsoftware.businessgateway.entities.VirtualSwitchDevicesAllRequestData;
import com.fntsoftware.businessgateway.entities.VirtualSwitchDevicesAllResponseData;
import com.fntsoftware.businessgateway.entities.VirtualSwitchFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.VirtualSwitchFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.VirtualSwitchInterfacesRequestData;
import com.fntsoftware.businessgateway.entities.VirtualSwitchInterfacesResponseData;
import com.fntsoftware.businessgateway.entities.VirtualSwitchIpAddressesRequest;
import com.fntsoftware.businessgateway.entities.VirtualSwitchIpAddressesResponse;
import com.fntsoftware.businessgateway.entities.VirtualSwitchIpv4AddressesRequestData;
import com.fntsoftware.businessgateway.entities.VirtualSwitchIpv4AddressesResponseData;
import com.fntsoftware.businessgateway.entities.VirtualSwitchMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.VirtualSwitchMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.VirtualSwitchOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.VirtualSwitchOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.VirtualSwitchPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.VirtualSwitchPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.VirtualSwitchPersonsRequestData;
import com.fntsoftware.businessgateway.entities.VirtualSwitchPersonsResponseData;
import com.fntsoftware.businessgateway.entities.VirtualSwitchQueryRequest;
import com.fntsoftware.businessgateway.entities.VirtualSwitchQueryResponse;
import com.fntsoftware.businessgateway.entities.VirtualSwitchSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.VirtualSwitchSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.VirtualSwitchVlansRequest;
import com.fntsoftware.businessgateway.entities.VirtualSwitchVlansResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface VirtualSwitchApi extends ApiClient.Api {


  /**
   * Create
   * Create Virtual switch
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateVirtualSwitchResponse
   */
  @RequestLine("POST /api/rest/entity/virtualSwitch/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateVirtualSwitchResponse createVirtualSwitch(@Param("sessionId") String sessionId, CreateVirtualSwitchRequestData body);

  /**
   * Create
   * Similar to <code>createVirtualSwitch</code> but it also returns the http response headers .
   * Create Virtual switch
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualSwitch/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateVirtualSwitchResponse> createVirtualSwitchWithHttpInfo(@Param("sessionId") String sessionId, CreateVirtualSwitchRequestData body);


  /**
   * Create
   * Create Virtual switch
   * Note, this is equivalent to the other <code>createVirtualSwitch</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateVirtualSwitchQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateVirtualSwitchResponse
   */
  @RequestLine("POST /api/rest/entity/virtualSwitch/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateVirtualSwitchResponse createVirtualSwitch(CreateVirtualSwitchRequestData body, @QueryMap(encoded=true) CreateVirtualSwitchQueryParams queryParams);

  /**
  * Create
  * Create Virtual switch
  * Note, this is equivalent to the other <code>createVirtualSwitch</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateVirtualSwitchResponse
      */
      @RequestLine("POST /api/rest/entity/virtualSwitch/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateVirtualSwitchResponse> createVirtualSwitchWithHttpInfo(CreateVirtualSwitchRequestData body, @QueryMap(encoded=true) CreateVirtualSwitchQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createVirtualSwitch</code> method in a fluent style.
   */
  public static class CreateVirtualSwitchQueryParams extends HashMap<String, Object> {
    public CreateVirtualSwitchQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Virtual switch
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteVirtualSwitchResponse
   */
  @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteVirtualSwitchResponse deleteVirtualSwitch(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteVirtualSwitchRequestData body);

  /**
   * Delete
   * Similar to <code>deleteVirtualSwitch</code> but it also returns the http response headers .
   * Delete Virtual switch
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteVirtualSwitchResponse> deleteVirtualSwitchWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteVirtualSwitchRequestData body);


  /**
   * Delete
   * Delete Virtual switch
   * Note, this is equivalent to the other <code>deleteVirtualSwitch</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteVirtualSwitchQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteVirtualSwitchResponse
   */
  @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteVirtualSwitchResponse deleteVirtualSwitch(@Param("elid") String elid, DeleteVirtualSwitchRequestData body, @QueryMap(encoded=true) DeleteVirtualSwitchQueryParams queryParams);

  /**
  * Delete
  * Delete Virtual switch
  * Note, this is equivalent to the other <code>deleteVirtualSwitch</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteVirtualSwitchResponse
      */
      @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteVirtualSwitchResponse> deleteVirtualSwitchWithHttpInfo(@Param("elid") String elid, DeleteVirtualSwitchRequestData body, @QueryMap(encoded=true) DeleteVirtualSwitchQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteVirtualSwitch</code> method in a fluent style.
   */
  public static class DeleteVirtualSwitchQueryParams extends HashMap<String, Object> {
    public DeleteVirtualSwitchQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesVirtualSwitchResponse
   */
  @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesVirtualSwitchResponse updateSystemAttributesVirtualSwitch(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesVirtualSwitchRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesVirtualSwitch</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesVirtualSwitchResponse> updateSystemAttributesVirtualSwitchWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesVirtualSwitchRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesVirtualSwitch</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesVirtualSwitchQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesVirtualSwitchResponse
   */
  @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesVirtualSwitchResponse updateSystemAttributesVirtualSwitch(@Param("elid") String elid, UpdateSystemAttributesVirtualSwitchRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesVirtualSwitchQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesVirtualSwitch</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesVirtualSwitchResponse
      */
      @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesVirtualSwitchResponse> updateSystemAttributesVirtualSwitchWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesVirtualSwitchRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesVirtualSwitchQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesVirtualSwitch</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesVirtualSwitchQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesVirtualSwitchQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Virtual switch
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateVirtualSwitchResponse
   */
  @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateVirtualSwitchResponse updateVirtualSwitch(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateVirtualSwitchRequestData body);

  /**
   * Modify
   * Similar to <code>updateVirtualSwitch</code> but it also returns the http response headers .
   * Modify Virtual switch
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateVirtualSwitchResponse> updateVirtualSwitchWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateVirtualSwitchRequestData body);


  /**
   * Modify
   * Modify Virtual switch
   * Note, this is equivalent to the other <code>updateVirtualSwitch</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateVirtualSwitchQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateVirtualSwitchResponse
   */
  @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateVirtualSwitchResponse updateVirtualSwitch(@Param("elid") String elid, UpdateVirtualSwitchRequestData body, @QueryMap(encoded=true) UpdateVirtualSwitchQueryParams queryParams);

  /**
  * Modify
  * Modify Virtual switch
  * Note, this is equivalent to the other <code>updateVirtualSwitch</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateVirtualSwitchResponse
      */
      @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateVirtualSwitchResponse> updateVirtualSwitchWithHttpInfo(@Param("elid") String elid, UpdateVirtualSwitchRequestData body, @QueryMap(encoded=true) UpdateVirtualSwitchQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateVirtualSwitch</code> method in a fluent style.
   */
  public static class UpdateVirtualSwitchQueryParams extends HashMap<String, Object> {
    public UpdateVirtualSwitchQueryParams sessionId(final String value) {
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
   * @return VirtualSwitchContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualSwitchContractsResponseData virtualSwitchContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualSwitchContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>virtualSwitchContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualSwitchContractsResponseData> virtualSwitchContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualSwitchContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>virtualSwitchContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualSwitchContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualSwitchContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualSwitchContractsResponseData virtualSwitchContracts(@Param("elid") String elid, VirtualSwitchContractsRequestData body, @QueryMap(encoded=true) VirtualSwitchContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>virtualSwitchContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualSwitchContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualSwitchContractsResponseData> virtualSwitchContractsWithHttpInfo(@Param("elid") String elid, VirtualSwitchContractsRequestData body, @QueryMap(encoded=true) VirtualSwitchContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualSwitchContracts</code> method in a fluent style.
   */
  public static class VirtualSwitchContractsQueryParams extends HashMap<String, Object> {
    public VirtualSwitchContractsQueryParams sessionId(final String value) {
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
   * @return VirtualSwitchDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualSwitchDevicesAllResponseData virtualSwitchDevicesAll(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualSwitchDevicesAllRequestData body);

  /**
   * Get relations to Device (all) entities
   * Similar to <code>virtualSwitchDevicesAll</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualSwitchDevicesAllResponseData> virtualSwitchDevicesAllWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualSwitchDevicesAllRequestData body);


  /**
   * Get relations to Device (all) entities
   * 
   * Note, this is equivalent to the other <code>virtualSwitchDevicesAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualSwitchDevicesAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualSwitchDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualSwitchDevicesAllResponseData virtualSwitchDevicesAll(@Param("elid") String elid, VirtualSwitchDevicesAllRequestData body, @QueryMap(encoded=true) VirtualSwitchDevicesAllQueryParams queryParams);

  /**
  * Get relations to Device (all) entities
  * 
  * Note, this is equivalent to the other <code>virtualSwitchDevicesAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualSwitchDevicesAllResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/DevicesAll?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualSwitchDevicesAllResponseData> virtualSwitchDevicesAllWithHttpInfo(@Param("elid") String elid, VirtualSwitchDevicesAllRequestData body, @QueryMap(encoded=true) VirtualSwitchDevicesAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualSwitchDevicesAll</code> method in a fluent style.
   */
  public static class VirtualSwitchDevicesAllQueryParams extends HashMap<String, Object> {
    public VirtualSwitchDevicesAllQueryParams sessionId(final String value) {
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
   * @return VirtualSwitchFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualSwitchFrameContractsResponseData virtualSwitchFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualSwitchFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>virtualSwitchFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualSwitchFrameContractsResponseData> virtualSwitchFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualSwitchFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>virtualSwitchFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualSwitchFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualSwitchFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualSwitchFrameContractsResponseData virtualSwitchFrameContracts(@Param("elid") String elid, VirtualSwitchFrameContractsRequestData body, @QueryMap(encoded=true) VirtualSwitchFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>virtualSwitchFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualSwitchFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualSwitchFrameContractsResponseData> virtualSwitchFrameContractsWithHttpInfo(@Param("elid") String elid, VirtualSwitchFrameContractsRequestData body, @QueryMap(encoded=true) VirtualSwitchFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualSwitchFrameContracts</code> method in a fluent style.
   */
  public static class VirtualSwitchFrameContractsQueryParams extends HashMap<String, Object> {
    public VirtualSwitchFrameContractsQueryParams sessionId(final String value) {
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
   * @return VirtualSwitchInterfacesResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualSwitchInterfacesResponseData virtualSwitchInterfaces(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualSwitchInterfacesRequestData body);

  /**
   * Get relations to Interface entities
   * Similar to <code>virtualSwitchInterfaces</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualSwitchInterfacesResponseData> virtualSwitchInterfacesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualSwitchInterfacesRequestData body);


  /**
   * Get relations to Interface entities
   * 
   * Note, this is equivalent to the other <code>virtualSwitchInterfaces</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualSwitchInterfacesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualSwitchInterfacesResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualSwitchInterfacesResponseData virtualSwitchInterfaces(@Param("elid") String elid, VirtualSwitchInterfacesRequestData body, @QueryMap(encoded=true) VirtualSwitchInterfacesQueryParams queryParams);

  /**
  * Get relations to Interface entities
  * 
  * Note, this is equivalent to the other <code>virtualSwitchInterfaces</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualSwitchInterfacesResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/Interfaces?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualSwitchInterfacesResponseData> virtualSwitchInterfacesWithHttpInfo(@Param("elid") String elid, VirtualSwitchInterfacesRequestData body, @QueryMap(encoded=true) VirtualSwitchInterfacesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualSwitchInterfaces</code> method in a fluent style.
   */
  public static class VirtualSwitchInterfacesQueryParams extends HashMap<String, Object> {
    public VirtualSwitchInterfacesQueryParams sessionId(final String value) {
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
   * @return VirtualSwitchIpAddressesResponse
   */
  @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualSwitchIpAddressesResponse virtualSwitchIpAddresses(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualSwitchIpAddressesRequest body);

  /**
   * IP addresses
   * Similar to <code>virtualSwitchIpAddresses</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualSwitchIpAddressesResponse> virtualSwitchIpAddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualSwitchIpAddressesRequest body);


  /**
   * IP addresses
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>virtualSwitchIpAddresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualSwitchIpAddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualSwitchIpAddressesResponse
   */
  @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualSwitchIpAddressesResponse virtualSwitchIpAddresses(@Param("elid") String elid, VirtualSwitchIpAddressesRequest body, @QueryMap(encoded=true) VirtualSwitchIpAddressesQueryParams queryParams);

  /**
  * IP addresses
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>virtualSwitchIpAddresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualSwitchIpAddressesResponse
      */
      @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/IpAddresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualSwitchIpAddressesResponse> virtualSwitchIpAddressesWithHttpInfo(@Param("elid") String elid, VirtualSwitchIpAddressesRequest body, @QueryMap(encoded=true) VirtualSwitchIpAddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualSwitchIpAddresses</code> method in a fluent style.
   */
  public static class VirtualSwitchIpAddressesQueryParams extends HashMap<String, Object> {
    public VirtualSwitchIpAddressesQueryParams sessionId(final String value) {
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
   * @return VirtualSwitchIpv4AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualSwitchIpv4AddressesResponseData virtualSwitchIpv4Addresses(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualSwitchIpv4AddressesRequestData body);

  /**
   * Get relations to IPv4 address entities
   * Similar to <code>virtualSwitchIpv4Addresses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualSwitchIpv4AddressesResponseData> virtualSwitchIpv4AddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualSwitchIpv4AddressesRequestData body);


  /**
   * Get relations to IPv4 address entities
   * 
   * Note, this is equivalent to the other <code>virtualSwitchIpv4Addresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualSwitchIpv4AddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualSwitchIpv4AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualSwitchIpv4AddressesResponseData virtualSwitchIpv4Addresses(@Param("elid") String elid, VirtualSwitchIpv4AddressesRequestData body, @QueryMap(encoded=true) VirtualSwitchIpv4AddressesQueryParams queryParams);

  /**
  * Get relations to IPv4 address entities
  * 
  * Note, this is equivalent to the other <code>virtualSwitchIpv4Addresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualSwitchIpv4AddressesResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/Ipv4Addresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualSwitchIpv4AddressesResponseData> virtualSwitchIpv4AddressesWithHttpInfo(@Param("elid") String elid, VirtualSwitchIpv4AddressesRequestData body, @QueryMap(encoded=true) VirtualSwitchIpv4AddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualSwitchIpv4Addresses</code> method in a fluent style.
   */
  public static class VirtualSwitchIpv4AddressesQueryParams extends HashMap<String, Object> {
    public VirtualSwitchIpv4AddressesQueryParams sessionId(final String value) {
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
   * @return VirtualSwitchMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualSwitchMaintenanceContractsResponseData virtualSwitchMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualSwitchMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>virtualSwitchMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualSwitchMaintenanceContractsResponseData> virtualSwitchMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualSwitchMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>virtualSwitchMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualSwitchMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualSwitchMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualSwitchMaintenanceContractsResponseData virtualSwitchMaintenanceContracts(@Param("elid") String elid, VirtualSwitchMaintenanceContractsRequestData body, @QueryMap(encoded=true) VirtualSwitchMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>virtualSwitchMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualSwitchMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualSwitchMaintenanceContractsResponseData> virtualSwitchMaintenanceContractsWithHttpInfo(@Param("elid") String elid, VirtualSwitchMaintenanceContractsRequestData body, @QueryMap(encoded=true) VirtualSwitchMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualSwitchMaintenanceContracts</code> method in a fluent style.
   */
  public static class VirtualSwitchMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public VirtualSwitchMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return VirtualSwitchOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualSwitchOrganizationsResponseData virtualSwitchOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualSwitchOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>virtualSwitchOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualSwitchOrganizationsResponseData> virtualSwitchOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualSwitchOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>virtualSwitchOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualSwitchOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualSwitchOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualSwitchOrganizationsResponseData virtualSwitchOrganizations(@Param("elid") String elid, VirtualSwitchOrganizationsRequestData body, @QueryMap(encoded=true) VirtualSwitchOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>virtualSwitchOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualSwitchOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualSwitchOrganizationsResponseData> virtualSwitchOrganizationsWithHttpInfo(@Param("elid") String elid, VirtualSwitchOrganizationsRequestData body, @QueryMap(encoded=true) VirtualSwitchOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualSwitchOrganizations</code> method in a fluent style.
   */
  public static class VirtualSwitchOrganizationsQueryParams extends HashMap<String, Object> {
    public VirtualSwitchOrganizationsQueryParams sessionId(final String value) {
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
   * @return VirtualSwitchPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualSwitchPersonGroupsResponseData virtualSwitchPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualSwitchPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>virtualSwitchPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualSwitchPersonGroupsResponseData> virtualSwitchPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualSwitchPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>virtualSwitchPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualSwitchPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualSwitchPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualSwitchPersonGroupsResponseData virtualSwitchPersonGroups(@Param("elid") String elid, VirtualSwitchPersonGroupsRequestData body, @QueryMap(encoded=true) VirtualSwitchPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>virtualSwitchPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualSwitchPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualSwitchPersonGroupsResponseData> virtualSwitchPersonGroupsWithHttpInfo(@Param("elid") String elid, VirtualSwitchPersonGroupsRequestData body, @QueryMap(encoded=true) VirtualSwitchPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualSwitchPersonGroups</code> method in a fluent style.
   */
  public static class VirtualSwitchPersonGroupsQueryParams extends HashMap<String, Object> {
    public VirtualSwitchPersonGroupsQueryParams sessionId(final String value) {
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
   * @return VirtualSwitchPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualSwitchPersonsResponseData virtualSwitchPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualSwitchPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>virtualSwitchPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualSwitchPersonsResponseData> virtualSwitchPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualSwitchPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>virtualSwitchPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualSwitchPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualSwitchPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualSwitchPersonsResponseData virtualSwitchPersons(@Param("elid") String elid, VirtualSwitchPersonsRequestData body, @QueryMap(encoded=true) VirtualSwitchPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>virtualSwitchPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualSwitchPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualSwitchPersonsResponseData> virtualSwitchPersonsWithHttpInfo(@Param("elid") String elid, VirtualSwitchPersonsRequestData body, @QueryMap(encoded=true) VirtualSwitchPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualSwitchPersons</code> method in a fluent style.
   */
  public static class VirtualSwitchPersonsQueryParams extends HashMap<String, Object> {
    public VirtualSwitchPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return VirtualSwitchQueryResponse
   */
  @RequestLine("POST /api/rest/entity/virtualSwitch/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualSwitchQueryResponse virtualSwitchQuery(@Param("sessionId") String sessionId, VirtualSwitchQueryRequest body);

  /**
   * Basic query
   * Similar to <code>virtualSwitchQuery</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualSwitch/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualSwitchQueryResponse> virtualSwitchQueryWithHttpInfo(@Param("sessionId") String sessionId, VirtualSwitchQueryRequest body);


  /**
   * Basic query
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>virtualSwitchQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualSwitchQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualSwitchQueryResponse
   */
  @RequestLine("POST /api/rest/entity/virtualSwitch/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualSwitchQueryResponse virtualSwitchQuery(VirtualSwitchQueryRequest body, @QueryMap(encoded=true) VirtualSwitchQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>virtualSwitchQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualSwitchQueryResponse
      */
      @RequestLine("POST /api/rest/entity/virtualSwitch/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualSwitchQueryResponse> virtualSwitchQueryWithHttpInfo(VirtualSwitchQueryRequest body, @QueryMap(encoded=true) VirtualSwitchQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualSwitchQuery</code> method in a fluent style.
   */
  public static class VirtualSwitchQueryQueryParams extends HashMap<String, Object> {
    public VirtualSwitchQueryQueryParams sessionId(final String value) {
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
   * @return VirtualSwitchSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualSwitchSystemAttributesResponse virtualSwitchSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualSwitchSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>virtualSwitchSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualSwitchSystemAttributesResponse> virtualSwitchSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualSwitchSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>virtualSwitchSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualSwitchSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualSwitchSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualSwitchSystemAttributesResponse virtualSwitchSystemAttributes(@Param("elid") String elid, VirtualSwitchSystemAttributesRequest body, @QueryMap(encoded=true) VirtualSwitchSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>virtualSwitchSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualSwitchSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualSwitchSystemAttributesResponse> virtualSwitchSystemAttributesWithHttpInfo(@Param("elid") String elid, VirtualSwitchSystemAttributesRequest body, @QueryMap(encoded=true) VirtualSwitchSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualSwitchSystemAttributes</code> method in a fluent style.
   */
  public static class VirtualSwitchSystemAttributesQueryParams extends HashMap<String, Object> {
    public VirtualSwitchSystemAttributesQueryParams sessionId(final String value) {
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
   * @return VirtualSwitchVlansResponse
   */
  @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualSwitchVlansResponse virtualSwitchVlans(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualSwitchVlansRequest body);

  /**
   * VLANs
   * Similar to <code>virtualSwitchVlans</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualSwitchVlansResponse> virtualSwitchVlansWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualSwitchVlansRequest body);


  /**
   * VLANs
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>virtualSwitchVlans</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualSwitchVlansQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualSwitchVlansResponse
   */
  @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualSwitchVlansResponse virtualSwitchVlans(@Param("elid") String elid, VirtualSwitchVlansRequest body, @QueryMap(encoded=true) VirtualSwitchVlansQueryParams queryParams);

  /**
  * VLANs
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>virtualSwitchVlans</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualSwitchVlansResponse
      */
      @RequestLine("POST /api/rest/entity/virtualSwitch/{elid}/Vlans?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualSwitchVlansResponse> virtualSwitchVlansWithHttpInfo(@Param("elid") String elid, VirtualSwitchVlansRequest body, @QueryMap(encoded=true) VirtualSwitchVlansQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualSwitchVlans</code> method in a fluent style.
   */
  public static class VirtualSwitchVlansQueryParams extends HashMap<String, Object> {
    public VirtualSwitchVlansQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
