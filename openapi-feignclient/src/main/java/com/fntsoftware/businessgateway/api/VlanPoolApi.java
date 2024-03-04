package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateVlanPoolRequestData;
import com.fntsoftware.businessgateway.entities.CreateVlanPoolResponse;
import com.fntsoftware.businessgateway.entities.DeleteVlanPoolRequestData;
import com.fntsoftware.businessgateway.entities.DeleteVlanPoolResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesVlanPoolRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesVlanPoolResponse;
import com.fntsoftware.businessgateway.entities.UpdateVlanPoolRequestData;
import com.fntsoftware.businessgateway.entities.UpdateVlanPoolResponse;
import com.fntsoftware.businessgateway.entities.VlanPoolContractsRequestData;
import com.fntsoftware.businessgateway.entities.VlanPoolContractsResponseData;
import com.fntsoftware.businessgateway.entities.VlanPoolCustomTcoInterconnectRequestData;
import com.fntsoftware.businessgateway.entities.VlanPoolCustomTcoInterconnectResponseData;
import com.fntsoftware.businessgateway.entities.VlanPoolFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.VlanPoolFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.VlanPoolMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.VlanPoolMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.VlanPoolOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.VlanPoolOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.VlanPoolPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.VlanPoolPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.VlanPoolPersonsRequestData;
import com.fntsoftware.businessgateway.entities.VlanPoolPersonsResponseData;
import com.fntsoftware.businessgateway.entities.VlanPoolQueryRequest;
import com.fntsoftware.businessgateway.entities.VlanPoolQueryResponse;
import com.fntsoftware.businessgateway.entities.VlanPoolSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.VlanPoolSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.VlanPoolVlansRequestData;
import com.fntsoftware.businessgateway.entities.VlanPoolVlansResponseData;
import com.fntsoftware.businessgateway.entities.VlanPoolZonesRequestData;
import com.fntsoftware.businessgateway.entities.VlanPoolZonesResponseData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface VlanPoolApi extends ApiClient.Api {


  /**
   * Create
   * Create VLAN pool
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateVlanPoolResponse
   */
  @RequestLine("POST /api/rest/entity/vlanPool/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateVlanPoolResponse createVlanPool(@Param("sessionId") String sessionId, CreateVlanPoolRequestData body);

  /**
   * Create
   * Similar to <code>createVlanPool</code> but it also returns the http response headers .
   * Create VLAN pool
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlanPool/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateVlanPoolResponse> createVlanPoolWithHttpInfo(@Param("sessionId") String sessionId, CreateVlanPoolRequestData body);


  /**
   * Create
   * Create VLAN pool
   * Note, this is equivalent to the other <code>createVlanPool</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateVlanPoolQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateVlanPoolResponse
   */
  @RequestLine("POST /api/rest/entity/vlanPool/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateVlanPoolResponse createVlanPool(CreateVlanPoolRequestData body, @QueryMap(encoded=true) CreateVlanPoolQueryParams queryParams);

  /**
  * Create
  * Create VLAN pool
  * Note, this is equivalent to the other <code>createVlanPool</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateVlanPoolResponse
      */
      @RequestLine("POST /api/rest/entity/vlanPool/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateVlanPoolResponse> createVlanPoolWithHttpInfo(CreateVlanPoolRequestData body, @QueryMap(encoded=true) CreateVlanPoolQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createVlanPool</code> method in a fluent style.
   */
  public static class CreateVlanPoolQueryParams extends HashMap<String, Object> {
    public CreateVlanPoolQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete VLAN pool
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteVlanPoolResponse
   */
  @RequestLine("POST /api/rest/entity/vlanPool/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteVlanPoolResponse deleteVlanPool(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteVlanPoolRequestData body);

  /**
   * Delete
   * Similar to <code>deleteVlanPool</code> but it also returns the http response headers .
   * Delete VLAN pool
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlanPool/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteVlanPoolResponse> deleteVlanPoolWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteVlanPoolRequestData body);


  /**
   * Delete
   * Delete VLAN pool
   * Note, this is equivalent to the other <code>deleteVlanPool</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteVlanPoolQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteVlanPoolResponse
   */
  @RequestLine("POST /api/rest/entity/vlanPool/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteVlanPoolResponse deleteVlanPool(@Param("elid") String elid, DeleteVlanPoolRequestData body, @QueryMap(encoded=true) DeleteVlanPoolQueryParams queryParams);

  /**
  * Delete
  * Delete VLAN pool
  * Note, this is equivalent to the other <code>deleteVlanPool</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteVlanPoolResponse
      */
      @RequestLine("POST /api/rest/entity/vlanPool/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteVlanPoolResponse> deleteVlanPoolWithHttpInfo(@Param("elid") String elid, DeleteVlanPoolRequestData body, @QueryMap(encoded=true) DeleteVlanPoolQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteVlanPool</code> method in a fluent style.
   */
  public static class DeleteVlanPoolQueryParams extends HashMap<String, Object> {
    public DeleteVlanPoolQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesVlanPoolResponse
   */
  @RequestLine("POST /api/rest/entity/vlanPool/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesVlanPoolResponse updateSystemAttributesVlanPool(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesVlanPoolRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesVlanPool</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlanPool/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesVlanPoolResponse> updateSystemAttributesVlanPoolWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesVlanPoolRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesVlanPool</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesVlanPoolQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesVlanPoolResponse
   */
  @RequestLine("POST /api/rest/entity/vlanPool/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesVlanPoolResponse updateSystemAttributesVlanPool(@Param("elid") String elid, UpdateSystemAttributesVlanPoolRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesVlanPoolQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesVlanPool</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesVlanPoolResponse
      */
      @RequestLine("POST /api/rest/entity/vlanPool/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesVlanPoolResponse> updateSystemAttributesVlanPoolWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesVlanPoolRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesVlanPoolQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesVlanPool</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesVlanPoolQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesVlanPoolQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify VLAN pool
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateVlanPoolResponse
   */
  @RequestLine("POST /api/rest/entity/vlanPool/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateVlanPoolResponse updateVlanPool(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateVlanPoolRequestData body);

  /**
   * Modify
   * Similar to <code>updateVlanPool</code> but it also returns the http response headers .
   * Modify VLAN pool
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlanPool/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateVlanPoolResponse> updateVlanPoolWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateVlanPoolRequestData body);


  /**
   * Modify
   * Modify VLAN pool
   * Note, this is equivalent to the other <code>updateVlanPool</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateVlanPoolQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateVlanPoolResponse
   */
  @RequestLine("POST /api/rest/entity/vlanPool/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateVlanPoolResponse updateVlanPool(@Param("elid") String elid, UpdateVlanPoolRequestData body, @QueryMap(encoded=true) UpdateVlanPoolQueryParams queryParams);

  /**
  * Modify
  * Modify VLAN pool
  * Note, this is equivalent to the other <code>updateVlanPool</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateVlanPoolResponse
      */
      @RequestLine("POST /api/rest/entity/vlanPool/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateVlanPoolResponse> updateVlanPoolWithHttpInfo(@Param("elid") String elid, UpdateVlanPoolRequestData body, @QueryMap(encoded=true) UpdateVlanPoolQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateVlanPool</code> method in a fluent style.
   */
  public static class UpdateVlanPoolQueryParams extends HashMap<String, Object> {
    public UpdateVlanPoolQueryParams sessionId(final String value) {
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
   * @return VlanPoolContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/vlanPool/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VlanPoolContractsResponseData vlanPoolContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanPoolContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>vlanPoolContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlanPool/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VlanPoolContractsResponseData> vlanPoolContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanPoolContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>vlanPoolContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VlanPoolContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VlanPoolContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/vlanPool/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VlanPoolContractsResponseData vlanPoolContracts(@Param("elid") String elid, VlanPoolContractsRequestData body, @QueryMap(encoded=true) VlanPoolContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>vlanPoolContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VlanPoolContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/vlanPool/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VlanPoolContractsResponseData> vlanPoolContractsWithHttpInfo(@Param("elid") String elid, VlanPoolContractsRequestData body, @QueryMap(encoded=true) VlanPoolContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>vlanPoolContracts</code> method in a fluent style.
   */
  public static class VlanPoolContractsQueryParams extends HashMap<String, Object> {
    public VlanPoolContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Telco interconnects entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return VlanPoolCustomTcoInterconnectResponseData
   */
  @RequestLine("POST /api/rest/entity/vlanPool/{elid}/CustomTcoInterconnect?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VlanPoolCustomTcoInterconnectResponseData vlanPoolCustomTcoInterconnect(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanPoolCustomTcoInterconnectRequestData body);

  /**
   * Get relations to Telco interconnects entities
   * Similar to <code>vlanPoolCustomTcoInterconnect</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlanPool/{elid}/CustomTcoInterconnect?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VlanPoolCustomTcoInterconnectResponseData> vlanPoolCustomTcoInterconnectWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanPoolCustomTcoInterconnectRequestData body);


  /**
   * Get relations to Telco interconnects entities
   * 
   * Note, this is equivalent to the other <code>vlanPoolCustomTcoInterconnect</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VlanPoolCustomTcoInterconnectQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VlanPoolCustomTcoInterconnectResponseData
   */
  @RequestLine("POST /api/rest/entity/vlanPool/{elid}/CustomTcoInterconnect?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VlanPoolCustomTcoInterconnectResponseData vlanPoolCustomTcoInterconnect(@Param("elid") String elid, VlanPoolCustomTcoInterconnectRequestData body, @QueryMap(encoded=true) VlanPoolCustomTcoInterconnectQueryParams queryParams);

  /**
  * Get relations to Telco interconnects entities
  * 
  * Note, this is equivalent to the other <code>vlanPoolCustomTcoInterconnect</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VlanPoolCustomTcoInterconnectResponseData
      */
      @RequestLine("POST /api/rest/entity/vlanPool/{elid}/CustomTcoInterconnect?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VlanPoolCustomTcoInterconnectResponseData> vlanPoolCustomTcoInterconnectWithHttpInfo(@Param("elid") String elid, VlanPoolCustomTcoInterconnectRequestData body, @QueryMap(encoded=true) VlanPoolCustomTcoInterconnectQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>vlanPoolCustomTcoInterconnect</code> method in a fluent style.
   */
  public static class VlanPoolCustomTcoInterconnectQueryParams extends HashMap<String, Object> {
    public VlanPoolCustomTcoInterconnectQueryParams sessionId(final String value) {
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
   * @return VlanPoolFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/vlanPool/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VlanPoolFrameContractsResponseData vlanPoolFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanPoolFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>vlanPoolFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlanPool/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VlanPoolFrameContractsResponseData> vlanPoolFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanPoolFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>vlanPoolFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VlanPoolFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VlanPoolFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/vlanPool/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VlanPoolFrameContractsResponseData vlanPoolFrameContracts(@Param("elid") String elid, VlanPoolFrameContractsRequestData body, @QueryMap(encoded=true) VlanPoolFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>vlanPoolFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VlanPoolFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/vlanPool/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VlanPoolFrameContractsResponseData> vlanPoolFrameContractsWithHttpInfo(@Param("elid") String elid, VlanPoolFrameContractsRequestData body, @QueryMap(encoded=true) VlanPoolFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>vlanPoolFrameContracts</code> method in a fluent style.
   */
  public static class VlanPoolFrameContractsQueryParams extends HashMap<String, Object> {
    public VlanPoolFrameContractsQueryParams sessionId(final String value) {
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
   * @return VlanPoolMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/vlanPool/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VlanPoolMaintenanceContractsResponseData vlanPoolMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanPoolMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>vlanPoolMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlanPool/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VlanPoolMaintenanceContractsResponseData> vlanPoolMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanPoolMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>vlanPoolMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VlanPoolMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VlanPoolMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/vlanPool/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VlanPoolMaintenanceContractsResponseData vlanPoolMaintenanceContracts(@Param("elid") String elid, VlanPoolMaintenanceContractsRequestData body, @QueryMap(encoded=true) VlanPoolMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>vlanPoolMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VlanPoolMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/vlanPool/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VlanPoolMaintenanceContractsResponseData> vlanPoolMaintenanceContractsWithHttpInfo(@Param("elid") String elid, VlanPoolMaintenanceContractsRequestData body, @QueryMap(encoded=true) VlanPoolMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>vlanPoolMaintenanceContracts</code> method in a fluent style.
   */
  public static class VlanPoolMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public VlanPoolMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return VlanPoolOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/vlanPool/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VlanPoolOrganizationsResponseData vlanPoolOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanPoolOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>vlanPoolOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlanPool/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VlanPoolOrganizationsResponseData> vlanPoolOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanPoolOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>vlanPoolOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VlanPoolOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VlanPoolOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/vlanPool/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VlanPoolOrganizationsResponseData vlanPoolOrganizations(@Param("elid") String elid, VlanPoolOrganizationsRequestData body, @QueryMap(encoded=true) VlanPoolOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>vlanPoolOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VlanPoolOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/vlanPool/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VlanPoolOrganizationsResponseData> vlanPoolOrganizationsWithHttpInfo(@Param("elid") String elid, VlanPoolOrganizationsRequestData body, @QueryMap(encoded=true) VlanPoolOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>vlanPoolOrganizations</code> method in a fluent style.
   */
  public static class VlanPoolOrganizationsQueryParams extends HashMap<String, Object> {
    public VlanPoolOrganizationsQueryParams sessionId(final String value) {
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
   * @return VlanPoolPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/vlanPool/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VlanPoolPersonGroupsResponseData vlanPoolPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanPoolPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>vlanPoolPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlanPool/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VlanPoolPersonGroupsResponseData> vlanPoolPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanPoolPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>vlanPoolPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VlanPoolPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VlanPoolPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/vlanPool/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VlanPoolPersonGroupsResponseData vlanPoolPersonGroups(@Param("elid") String elid, VlanPoolPersonGroupsRequestData body, @QueryMap(encoded=true) VlanPoolPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>vlanPoolPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VlanPoolPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/vlanPool/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VlanPoolPersonGroupsResponseData> vlanPoolPersonGroupsWithHttpInfo(@Param("elid") String elid, VlanPoolPersonGroupsRequestData body, @QueryMap(encoded=true) VlanPoolPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>vlanPoolPersonGroups</code> method in a fluent style.
   */
  public static class VlanPoolPersonGroupsQueryParams extends HashMap<String, Object> {
    public VlanPoolPersonGroupsQueryParams sessionId(final String value) {
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
   * @return VlanPoolPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/vlanPool/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VlanPoolPersonsResponseData vlanPoolPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanPoolPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>vlanPoolPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlanPool/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VlanPoolPersonsResponseData> vlanPoolPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanPoolPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>vlanPoolPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VlanPoolPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VlanPoolPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/vlanPool/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VlanPoolPersonsResponseData vlanPoolPersons(@Param("elid") String elid, VlanPoolPersonsRequestData body, @QueryMap(encoded=true) VlanPoolPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>vlanPoolPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VlanPoolPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/vlanPool/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VlanPoolPersonsResponseData> vlanPoolPersonsWithHttpInfo(@Param("elid") String elid, VlanPoolPersonsRequestData body, @QueryMap(encoded=true) VlanPoolPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>vlanPoolPersons</code> method in a fluent style.
   */
  public static class VlanPoolPersonsQueryParams extends HashMap<String, Object> {
    public VlanPoolPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return VlanPoolQueryResponse
   */
  @RequestLine("POST /api/rest/entity/vlanPool/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VlanPoolQueryResponse vlanPoolQuery(@Param("sessionId") String sessionId, VlanPoolQueryRequest body);

  /**
   * Basic query
   * Similar to <code>vlanPoolQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlanPool/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VlanPoolQueryResponse> vlanPoolQueryWithHttpInfo(@Param("sessionId") String sessionId, VlanPoolQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>vlanPoolQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VlanPoolQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VlanPoolQueryResponse
   */
  @RequestLine("POST /api/rest/entity/vlanPool/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VlanPoolQueryResponse vlanPoolQuery(VlanPoolQueryRequest body, @QueryMap(encoded=true) VlanPoolQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>vlanPoolQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VlanPoolQueryResponse
      */
      @RequestLine("POST /api/rest/entity/vlanPool/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VlanPoolQueryResponse> vlanPoolQueryWithHttpInfo(VlanPoolQueryRequest body, @QueryMap(encoded=true) VlanPoolQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>vlanPoolQuery</code> method in a fluent style.
   */
  public static class VlanPoolQueryQueryParams extends HashMap<String, Object> {
    public VlanPoolQueryQueryParams sessionId(final String value) {
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
   * @return VlanPoolSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/vlanPool/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VlanPoolSystemAttributesResponse vlanPoolSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanPoolSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>vlanPoolSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlanPool/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VlanPoolSystemAttributesResponse> vlanPoolSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanPoolSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>vlanPoolSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VlanPoolSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VlanPoolSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/vlanPool/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VlanPoolSystemAttributesResponse vlanPoolSystemAttributes(@Param("elid") String elid, VlanPoolSystemAttributesRequest body, @QueryMap(encoded=true) VlanPoolSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>vlanPoolSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VlanPoolSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/vlanPool/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VlanPoolSystemAttributesResponse> vlanPoolSystemAttributesWithHttpInfo(@Param("elid") String elid, VlanPoolSystemAttributesRequest body, @QueryMap(encoded=true) VlanPoolSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>vlanPoolSystemAttributes</code> method in a fluent style.
   */
  public static class VlanPoolSystemAttributesQueryParams extends HashMap<String, Object> {
    public VlanPoolSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to VLAN entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return VlanPoolVlansResponseData
   */
  @RequestLine("POST /api/rest/entity/vlanPool/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VlanPoolVlansResponseData vlanPoolVlans(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanPoolVlansRequestData body);

  /**
   * Get relations to VLAN entities
   * Similar to <code>vlanPoolVlans</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlanPool/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VlanPoolVlansResponseData> vlanPoolVlansWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanPoolVlansRequestData body);


  /**
   * Get relations to VLAN entities
   * 
   * Note, this is equivalent to the other <code>vlanPoolVlans</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VlanPoolVlansQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VlanPoolVlansResponseData
   */
  @RequestLine("POST /api/rest/entity/vlanPool/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VlanPoolVlansResponseData vlanPoolVlans(@Param("elid") String elid, VlanPoolVlansRequestData body, @QueryMap(encoded=true) VlanPoolVlansQueryParams queryParams);

  /**
  * Get relations to VLAN entities
  * 
  * Note, this is equivalent to the other <code>vlanPoolVlans</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VlanPoolVlansResponseData
      */
      @RequestLine("POST /api/rest/entity/vlanPool/{elid}/Vlans?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VlanPoolVlansResponseData> vlanPoolVlansWithHttpInfo(@Param("elid") String elid, VlanPoolVlansRequestData body, @QueryMap(encoded=true) VlanPoolVlansQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>vlanPoolVlans</code> method in a fluent style.
   */
  public static class VlanPoolVlansQueryParams extends HashMap<String, Object> {
    public VlanPoolVlansQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Zone entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return VlanPoolZonesResponseData
   */
  @RequestLine("POST /api/rest/entity/vlanPool/{elid}/Zones?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VlanPoolZonesResponseData vlanPoolZones(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanPoolZonesRequestData body);

  /**
   * Get relations to Zone entities
   * Similar to <code>vlanPoolZones</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlanPool/{elid}/Zones?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VlanPoolZonesResponseData> vlanPoolZonesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanPoolZonesRequestData body);


  /**
   * Get relations to Zone entities
   * 
   * Note, this is equivalent to the other <code>vlanPoolZones</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VlanPoolZonesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VlanPoolZonesResponseData
   */
  @RequestLine("POST /api/rest/entity/vlanPool/{elid}/Zones?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VlanPoolZonesResponseData vlanPoolZones(@Param("elid") String elid, VlanPoolZonesRequestData body, @QueryMap(encoded=true) VlanPoolZonesQueryParams queryParams);

  /**
  * Get relations to Zone entities
  * 
  * Note, this is equivalent to the other <code>vlanPoolZones</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VlanPoolZonesResponseData
      */
      @RequestLine("POST /api/rest/entity/vlanPool/{elid}/Zones?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VlanPoolZonesResponseData> vlanPoolZonesWithHttpInfo(@Param("elid") String elid, VlanPoolZonesRequestData body, @QueryMap(encoded=true) VlanPoolZonesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>vlanPoolZones</code> method in a fluent style.
   */
  public static class VlanPoolZonesQueryParams extends HashMap<String, Object> {
    public VlanPoolZonesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
