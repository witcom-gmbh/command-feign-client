package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.BlockConductorPowerCableRequestData;
import com.fntsoftware.businessgateway.entities.BlockConductorPowerCableResponse;
import com.fntsoftware.businessgateway.entities.ChangeCableTypePowerCableRequestData;
import com.fntsoftware.businessgateway.entities.ChangeCableTypePowerCableResponse;
import com.fntsoftware.businessgateway.entities.ConnectPowerCableRequestData;
import com.fntsoftware.businessgateway.entities.ConnectPowerCableResponse;
import com.fntsoftware.businessgateway.entities.DeletePowerCableRequestData;
import com.fntsoftware.businessgateway.entities.DeletePowerCableResponse;
import com.fntsoftware.businessgateway.entities.ModifyConnectPowerCableRequestData;
import com.fntsoftware.businessgateway.entities.ModifyConnectPowerCableResponse;
import com.fntsoftware.businessgateway.entities.PatchPowerCableRequestData;
import com.fntsoftware.businessgateway.entities.PatchPowerCableResponse;
import com.fntsoftware.businessgateway.entities.PowerCableCableMasterPowerCableRequestData;
import com.fntsoftware.businessgateway.entities.PowerCableCableMasterPowerCableResponseData;
import com.fntsoftware.businessgateway.entities.PowerCableConnectionsRequestData;
import com.fntsoftware.businessgateway.entities.PowerCableConnectionsResponseData;
import com.fntsoftware.businessgateway.entities.PowerCableContractsRequestData;
import com.fntsoftware.businessgateway.entities.PowerCableContractsResponseData;
import com.fntsoftware.businessgateway.entities.PowerCableCustomServicesTelcoRequestData;
import com.fntsoftware.businessgateway.entities.PowerCableCustomServicesTelcoResponseData;
import com.fntsoftware.businessgateway.entities.PowerCableCustomTcoInterconnectRequestData;
import com.fntsoftware.businessgateway.entities.PowerCableCustomTcoInterconnectResponseData;
import com.fntsoftware.businessgateway.entities.PowerCableEndPortRequest;
import com.fntsoftware.businessgateway.entities.PowerCableEndPortResponse;
import com.fntsoftware.businessgateway.entities.PowerCableFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.PowerCableFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.PowerCableMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.PowerCableMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.PowerCableOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.PowerCableOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.PowerCablePersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.PowerCablePersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.PowerCablePersonsRequestData;
import com.fntsoftware.businessgateway.entities.PowerCablePersonsResponseData;
import com.fntsoftware.businessgateway.entities.PowerCablePhysicalPortsPowerRequestData;
import com.fntsoftware.businessgateway.entities.PowerCablePhysicalPortsPowerResponseData;
import com.fntsoftware.businessgateway.entities.PowerCableQueryRequest;
import com.fntsoftware.businessgateway.entities.PowerCableQueryResponse;
import com.fntsoftware.businessgateway.entities.PowerCableStartPortRequest;
import com.fntsoftware.businessgateway.entities.PowerCableStartPortResponse;
import com.fntsoftware.businessgateway.entities.PowerCableSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.PowerCableSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.ReserveConductorPowerCableRequestData;
import com.fntsoftware.businessgateway.entities.ReserveConductorPowerCableResponse;
import com.fntsoftware.businessgateway.entities.UnblockConductorPowerCableRequestData;
import com.fntsoftware.businessgateway.entities.UnblockConductorPowerCableResponse;
import com.fntsoftware.businessgateway.entities.UpdatePowerCableRequestData;
import com.fntsoftware.businessgateway.entities.UpdatePowerCableResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesPowerCableRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesPowerCableResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface PowerCableApi extends ApiClient.Api {


  /**
   * Block conductor
   * Block conductor
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return BlockConductorPowerCableResponse
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/blockConductor?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BlockConductorPowerCableResponse blockConductorPowerCable(@Param("sessionId") String sessionId, @Param("elid") String elid, BlockConductorPowerCableRequestData body);

  /**
   * Block conductor
   * Similar to <code>blockConductorPowerCable</code> but it also returns the http response headers .
   * Block conductor
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/blockConductor?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BlockConductorPowerCableResponse> blockConductorPowerCableWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, BlockConductorPowerCableRequestData body);


  /**
   * Block conductor
   * Block conductor
   * Note, this is equivalent to the other <code>blockConductorPowerCable</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BlockConductorPowerCableQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return BlockConductorPowerCableResponse
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/blockConductor?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  BlockConductorPowerCableResponse blockConductorPowerCable(@Param("elid") String elid, BlockConductorPowerCableRequestData body, @QueryMap(encoded=true) BlockConductorPowerCableQueryParams queryParams);

  /**
  * Block conductor
  * Block conductor
  * Note, this is equivalent to the other <code>blockConductorPowerCable</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return BlockConductorPowerCableResponse
      */
      @RequestLine("POST /api/rest/entity/powerCable/{elid}/blockConductor?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<BlockConductorPowerCableResponse> blockConductorPowerCableWithHttpInfo(@Param("elid") String elid, BlockConductorPowerCableRequestData body, @QueryMap(encoded=true) BlockConductorPowerCableQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>blockConductorPowerCable</code> method in a fluent style.
   */
  public static class BlockConductorPowerCableQueryParams extends HashMap<String, Object> {
    public BlockConductorPowerCableQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify cable type
   * Modify cable type
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ChangeCableTypePowerCableResponse
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/changeCableType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeCableTypePowerCableResponse changeCableTypePowerCable(@Param("sessionId") String sessionId, @Param("elid") String elid, ChangeCableTypePowerCableRequestData body);

  /**
   * Modify cable type
   * Similar to <code>changeCableTypePowerCable</code> but it also returns the http response headers .
   * Modify cable type
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/changeCableType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeCableTypePowerCableResponse> changeCableTypePowerCableWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChangeCableTypePowerCableRequestData body);


  /**
   * Modify cable type
   * Modify cable type
   * Note, this is equivalent to the other <code>changeCableTypePowerCable</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChangeCableTypePowerCableQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChangeCableTypePowerCableResponse
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/changeCableType?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChangeCableTypePowerCableResponse changeCableTypePowerCable(@Param("elid") String elid, ChangeCableTypePowerCableRequestData body, @QueryMap(encoded=true) ChangeCableTypePowerCableQueryParams queryParams);

  /**
  * Modify cable type
  * Modify cable type
  * Note, this is equivalent to the other <code>changeCableTypePowerCable</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChangeCableTypePowerCableResponse
      */
      @RequestLine("POST /api/rest/entity/powerCable/{elid}/changeCableType?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChangeCableTypePowerCableResponse> changeCableTypePowerCableWithHttpInfo(@Param("elid") String elid, ChangeCableTypePowerCableRequestData body, @QueryMap(encoded=true) ChangeCableTypePowerCableQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>changeCableTypePowerCable</code> method in a fluent style.
   */
  public static class ChangeCableTypePowerCableQueryParams extends HashMap<String, Object> {
    public ChangeCableTypePowerCableQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Connect cable
   * Connect cable
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ConnectPowerCableResponse
   */
  @RequestLine("POST /api/rest/entity/powerCable/connect?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ConnectPowerCableResponse connectPowerCable(@Param("sessionId") String sessionId, ConnectPowerCableRequestData body);

  /**
   * Connect cable
   * Similar to <code>connectPowerCable</code> but it also returns the http response headers .
   * Connect cable
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/powerCable/connect?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ConnectPowerCableResponse> connectPowerCableWithHttpInfo(@Param("sessionId") String sessionId, ConnectPowerCableRequestData body);


  /**
   * Connect cable
   * Connect cable
   * Note, this is equivalent to the other <code>connectPowerCable</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ConnectPowerCableQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ConnectPowerCableResponse
   */
  @RequestLine("POST /api/rest/entity/powerCable/connect?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ConnectPowerCableResponse connectPowerCable(ConnectPowerCableRequestData body, @QueryMap(encoded=true) ConnectPowerCableQueryParams queryParams);

  /**
  * Connect cable
  * Connect cable
  * Note, this is equivalent to the other <code>connectPowerCable</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ConnectPowerCableResponse
      */
      @RequestLine("POST /api/rest/entity/powerCable/connect?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ConnectPowerCableResponse> connectPowerCableWithHttpInfo(ConnectPowerCableRequestData body, @QueryMap(encoded=true) ConnectPowerCableQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>connectPowerCable</code> method in a fluent style.
   */
  public static class ConnectPowerCableQueryParams extends HashMap<String, Object> {
    public ConnectPowerCableQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Cable
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeletePowerCableResponse
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeletePowerCableResponse deletePowerCable(@Param("sessionId") String sessionId, @Param("elid") String elid, DeletePowerCableRequestData body);

  /**
   * Delete
   * Similar to <code>deletePowerCable</code> but it also returns the http response headers .
   * Delete Cable
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeletePowerCableResponse> deletePowerCableWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeletePowerCableRequestData body);


  /**
   * Delete
   * Delete Cable
   * Note, this is equivalent to the other <code>deletePowerCable</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeletePowerCableQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeletePowerCableResponse
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeletePowerCableResponse deletePowerCable(@Param("elid") String elid, DeletePowerCableRequestData body, @QueryMap(encoded=true) DeletePowerCableQueryParams queryParams);

  /**
  * Delete
  * Delete Cable
  * Note, this is equivalent to the other <code>deletePowerCable</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeletePowerCableResponse
      */
      @RequestLine("POST /api/rest/entity/powerCable/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeletePowerCableResponse> deletePowerCableWithHttpInfo(@Param("elid") String elid, DeletePowerCableRequestData body, @QueryMap(encoded=true) DeletePowerCableQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deletePowerCable</code> method in a fluent style.
   */
  public static class DeletePowerCableQueryParams extends HashMap<String, Object> {
    public DeletePowerCableQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Edit connection
   * Edit connection
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ModifyConnectPowerCableResponse
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/modifyConnect?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ModifyConnectPowerCableResponse modifyConnectPowerCable(@Param("sessionId") String sessionId, @Param("elid") String elid, ModifyConnectPowerCableRequestData body);

  /**
   * Edit connection
   * Similar to <code>modifyConnectPowerCable</code> but it also returns the http response headers .
   * Edit connection
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/modifyConnect?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ModifyConnectPowerCableResponse> modifyConnectPowerCableWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ModifyConnectPowerCableRequestData body);


  /**
   * Edit connection
   * Edit connection
   * Note, this is equivalent to the other <code>modifyConnectPowerCable</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ModifyConnectPowerCableQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ModifyConnectPowerCableResponse
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/modifyConnect?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ModifyConnectPowerCableResponse modifyConnectPowerCable(@Param("elid") String elid, ModifyConnectPowerCableRequestData body, @QueryMap(encoded=true) ModifyConnectPowerCableQueryParams queryParams);

  /**
  * Edit connection
  * Edit connection
  * Note, this is equivalent to the other <code>modifyConnectPowerCable</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ModifyConnectPowerCableResponse
      */
      @RequestLine("POST /api/rest/entity/powerCable/{elid}/modifyConnect?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ModifyConnectPowerCableResponse> modifyConnectPowerCableWithHttpInfo(@Param("elid") String elid, ModifyConnectPowerCableRequestData body, @QueryMap(encoded=true) ModifyConnectPowerCableQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>modifyConnectPowerCable</code> method in a fluent style.
   */
  public static class ModifyConnectPowerCableQueryParams extends HashMap<String, Object> {
    public ModifyConnectPowerCableQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Repatch cable
   * Repatch cable
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return PatchPowerCableResponse
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/patch?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PatchPowerCableResponse patchPowerCable(@Param("sessionId") String sessionId, @Param("elid") String elid, PatchPowerCableRequestData body);

  /**
   * Repatch cable
   * Similar to <code>patchPowerCable</code> but it also returns the http response headers .
   * Repatch cable
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/patch?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PatchPowerCableResponse> patchPowerCableWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PatchPowerCableRequestData body);


  /**
   * Repatch cable
   * Repatch cable
   * Note, this is equivalent to the other <code>patchPowerCable</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PatchPowerCableQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PatchPowerCableResponse
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/patch?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PatchPowerCableResponse patchPowerCable(@Param("elid") String elid, PatchPowerCableRequestData body, @QueryMap(encoded=true) PatchPowerCableQueryParams queryParams);

  /**
  * Repatch cable
  * Repatch cable
  * Note, this is equivalent to the other <code>patchPowerCable</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PatchPowerCableResponse
      */
      @RequestLine("POST /api/rest/entity/powerCable/{elid}/patch?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PatchPowerCableResponse> patchPowerCableWithHttpInfo(@Param("elid") String elid, PatchPowerCableRequestData body, @QueryMap(encoded=true) PatchPowerCableQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>patchPowerCable</code> method in a fluent style.
   */
  public static class PatchPowerCableQueryParams extends HashMap<String, Object> {
    public PatchPowerCableQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Cable master Power cable entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return PowerCableCableMasterPowerCableResponseData
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/CableMasterPowerCable?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PowerCableCableMasterPowerCableResponseData powerCableCableMasterPowerCable(@Param("sessionId") String sessionId, @Param("elid") String elid, PowerCableCableMasterPowerCableRequestData body);

  /**
   * Get relations to Cable master Power cable entities
   * Similar to <code>powerCableCableMasterPowerCable</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/CableMasterPowerCable?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PowerCableCableMasterPowerCableResponseData> powerCableCableMasterPowerCableWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PowerCableCableMasterPowerCableRequestData body);


  /**
   * Get relations to Cable master Power cable entities
   * 
   * Note, this is equivalent to the other <code>powerCableCableMasterPowerCable</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PowerCableCableMasterPowerCableQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PowerCableCableMasterPowerCableResponseData
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/CableMasterPowerCable?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PowerCableCableMasterPowerCableResponseData powerCableCableMasterPowerCable(@Param("elid") String elid, PowerCableCableMasterPowerCableRequestData body, @QueryMap(encoded=true) PowerCableCableMasterPowerCableQueryParams queryParams);

  /**
  * Get relations to Cable master Power cable entities
  * 
  * Note, this is equivalent to the other <code>powerCableCableMasterPowerCable</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PowerCableCableMasterPowerCableResponseData
      */
      @RequestLine("POST /api/rest/entity/powerCable/{elid}/CableMasterPowerCable?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PowerCableCableMasterPowerCableResponseData> powerCableCableMasterPowerCableWithHttpInfo(@Param("elid") String elid, PowerCableCableMasterPowerCableRequestData body, @QueryMap(encoded=true) PowerCableCableMasterPowerCableQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>powerCableCableMasterPowerCable</code> method in a fluent style.
   */
  public static class PowerCableCableMasterPowerCableQueryParams extends HashMap<String, Object> {
    public PowerCableCableMasterPowerCableQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Connections entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return PowerCableConnectionsResponseData
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/Connections?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PowerCableConnectionsResponseData powerCableConnections(@Param("sessionId") String sessionId, @Param("elid") String elid, PowerCableConnectionsRequestData body);

  /**
   * Get relations to Connections entities
   * Similar to <code>powerCableConnections</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/Connections?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PowerCableConnectionsResponseData> powerCableConnectionsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PowerCableConnectionsRequestData body);


  /**
   * Get relations to Connections entities
   * 
   * Note, this is equivalent to the other <code>powerCableConnections</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PowerCableConnectionsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PowerCableConnectionsResponseData
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/Connections?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PowerCableConnectionsResponseData powerCableConnections(@Param("elid") String elid, PowerCableConnectionsRequestData body, @QueryMap(encoded=true) PowerCableConnectionsQueryParams queryParams);

  /**
  * Get relations to Connections entities
  * 
  * Note, this is equivalent to the other <code>powerCableConnections</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PowerCableConnectionsResponseData
      */
      @RequestLine("POST /api/rest/entity/powerCable/{elid}/Connections?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PowerCableConnectionsResponseData> powerCableConnectionsWithHttpInfo(@Param("elid") String elid, PowerCableConnectionsRequestData body, @QueryMap(encoded=true) PowerCableConnectionsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>powerCableConnections</code> method in a fluent style.
   */
  public static class PowerCableConnectionsQueryParams extends HashMap<String, Object> {
    public PowerCableConnectionsQueryParams sessionId(final String value) {
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
   * @return PowerCableContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PowerCableContractsResponseData powerCableContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, PowerCableContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>powerCableContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PowerCableContractsResponseData> powerCableContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PowerCableContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>powerCableContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PowerCableContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PowerCableContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PowerCableContractsResponseData powerCableContracts(@Param("elid") String elid, PowerCableContractsRequestData body, @QueryMap(encoded=true) PowerCableContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>powerCableContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PowerCableContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/powerCable/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PowerCableContractsResponseData> powerCableContractsWithHttpInfo(@Param("elid") String elid, PowerCableContractsRequestData body, @QueryMap(encoded=true) PowerCableContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>powerCableContracts</code> method in a fluent style.
   */
  public static class PowerCableContractsQueryParams extends HashMap<String, Object> {
    public PowerCableContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Service (Telco) entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return PowerCableCustomServicesTelcoResponseData
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/CustomServicesTelco?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PowerCableCustomServicesTelcoResponseData powerCableCustomServicesTelco(@Param("sessionId") String sessionId, @Param("elid") String elid, PowerCableCustomServicesTelcoRequestData body);

  /**
   * Get relations to Service (Telco) entities
   * Similar to <code>powerCableCustomServicesTelco</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/CustomServicesTelco?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PowerCableCustomServicesTelcoResponseData> powerCableCustomServicesTelcoWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PowerCableCustomServicesTelcoRequestData body);


  /**
   * Get relations to Service (Telco) entities
   * 
   * Note, this is equivalent to the other <code>powerCableCustomServicesTelco</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PowerCableCustomServicesTelcoQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PowerCableCustomServicesTelcoResponseData
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/CustomServicesTelco?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PowerCableCustomServicesTelcoResponseData powerCableCustomServicesTelco(@Param("elid") String elid, PowerCableCustomServicesTelcoRequestData body, @QueryMap(encoded=true) PowerCableCustomServicesTelcoQueryParams queryParams);

  /**
  * Get relations to Service (Telco) entities
  * 
  * Note, this is equivalent to the other <code>powerCableCustomServicesTelco</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PowerCableCustomServicesTelcoResponseData
      */
      @RequestLine("POST /api/rest/entity/powerCable/{elid}/CustomServicesTelco?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PowerCableCustomServicesTelcoResponseData> powerCableCustomServicesTelcoWithHttpInfo(@Param("elid") String elid, PowerCableCustomServicesTelcoRequestData body, @QueryMap(encoded=true) PowerCableCustomServicesTelcoQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>powerCableCustomServicesTelco</code> method in a fluent style.
   */
  public static class PowerCableCustomServicesTelcoQueryParams extends HashMap<String, Object> {
    public PowerCableCustomServicesTelcoQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Telco-Interconnect entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return PowerCableCustomTcoInterconnectResponseData
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/CustomTcoInterconnect?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PowerCableCustomTcoInterconnectResponseData powerCableCustomTcoInterconnect(@Param("sessionId") String sessionId, @Param("elid") String elid, PowerCableCustomTcoInterconnectRequestData body);

  /**
   * Get relations to Telco-Interconnect entities
   * Similar to <code>powerCableCustomTcoInterconnect</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/CustomTcoInterconnect?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PowerCableCustomTcoInterconnectResponseData> powerCableCustomTcoInterconnectWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PowerCableCustomTcoInterconnectRequestData body);


  /**
   * Get relations to Telco-Interconnect entities
   * 
   * Note, this is equivalent to the other <code>powerCableCustomTcoInterconnect</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PowerCableCustomTcoInterconnectQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PowerCableCustomTcoInterconnectResponseData
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/CustomTcoInterconnect?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PowerCableCustomTcoInterconnectResponseData powerCableCustomTcoInterconnect(@Param("elid") String elid, PowerCableCustomTcoInterconnectRequestData body, @QueryMap(encoded=true) PowerCableCustomTcoInterconnectQueryParams queryParams);

  /**
  * Get relations to Telco-Interconnect entities
  * 
  * Note, this is equivalent to the other <code>powerCableCustomTcoInterconnect</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PowerCableCustomTcoInterconnectResponseData
      */
      @RequestLine("POST /api/rest/entity/powerCable/{elid}/CustomTcoInterconnect?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PowerCableCustomTcoInterconnectResponseData> powerCableCustomTcoInterconnectWithHttpInfo(@Param("elid") String elid, PowerCableCustomTcoInterconnectRequestData body, @QueryMap(encoded=true) PowerCableCustomTcoInterconnectQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>powerCableCustomTcoInterconnect</code> method in a fluent style.
   */
  public static class PowerCableCustomTcoInterconnectQueryParams extends HashMap<String, Object> {
    public PowerCableCustomTcoInterconnectQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query End port
   * Queries the end port
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return PowerCableEndPortResponse
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/EndPort?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PowerCableEndPortResponse powerCableEndPort(@Param("sessionId") String sessionId, @Param("elid") String elid, PowerCableEndPortRequest body);

  /**
   * Query End port
   * Similar to <code>powerCableEndPort</code> but it also returns the http response headers .
   * Queries the end port
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/EndPort?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PowerCableEndPortResponse> powerCableEndPortWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PowerCableEndPortRequest body);


  /**
   * Query End port
   * Queries the end port
   * Note, this is equivalent to the other <code>powerCableEndPort</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PowerCableEndPortQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PowerCableEndPortResponse
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/EndPort?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PowerCableEndPortResponse powerCableEndPort(@Param("elid") String elid, PowerCableEndPortRequest body, @QueryMap(encoded=true) PowerCableEndPortQueryParams queryParams);

  /**
  * Query End port
  * Queries the end port
  * Note, this is equivalent to the other <code>powerCableEndPort</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PowerCableEndPortResponse
      */
      @RequestLine("POST /api/rest/entity/powerCable/{elid}/EndPort?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PowerCableEndPortResponse> powerCableEndPortWithHttpInfo(@Param("elid") String elid, PowerCableEndPortRequest body, @QueryMap(encoded=true) PowerCableEndPortQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>powerCableEndPort</code> method in a fluent style.
   */
  public static class PowerCableEndPortQueryParams extends HashMap<String, Object> {
    public PowerCableEndPortQueryParams sessionId(final String value) {
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
   * @return PowerCableFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PowerCableFrameContractsResponseData powerCableFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, PowerCableFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>powerCableFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PowerCableFrameContractsResponseData> powerCableFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PowerCableFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>powerCableFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PowerCableFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PowerCableFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PowerCableFrameContractsResponseData powerCableFrameContracts(@Param("elid") String elid, PowerCableFrameContractsRequestData body, @QueryMap(encoded=true) PowerCableFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>powerCableFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PowerCableFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/powerCable/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PowerCableFrameContractsResponseData> powerCableFrameContractsWithHttpInfo(@Param("elid") String elid, PowerCableFrameContractsRequestData body, @QueryMap(encoded=true) PowerCableFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>powerCableFrameContracts</code> method in a fluent style.
   */
  public static class PowerCableFrameContractsQueryParams extends HashMap<String, Object> {
    public PowerCableFrameContractsQueryParams sessionId(final String value) {
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
   * @return PowerCableMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PowerCableMaintenanceContractsResponseData powerCableMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, PowerCableMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>powerCableMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PowerCableMaintenanceContractsResponseData> powerCableMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PowerCableMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>powerCableMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PowerCableMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PowerCableMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PowerCableMaintenanceContractsResponseData powerCableMaintenanceContracts(@Param("elid") String elid, PowerCableMaintenanceContractsRequestData body, @QueryMap(encoded=true) PowerCableMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>powerCableMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PowerCableMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/powerCable/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PowerCableMaintenanceContractsResponseData> powerCableMaintenanceContractsWithHttpInfo(@Param("elid") String elid, PowerCableMaintenanceContractsRequestData body, @QueryMap(encoded=true) PowerCableMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>powerCableMaintenanceContracts</code> method in a fluent style.
   */
  public static class PowerCableMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public PowerCableMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return PowerCableOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PowerCableOrganizationsResponseData powerCableOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, PowerCableOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>powerCableOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PowerCableOrganizationsResponseData> powerCableOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PowerCableOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>powerCableOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PowerCableOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PowerCableOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PowerCableOrganizationsResponseData powerCableOrganizations(@Param("elid") String elid, PowerCableOrganizationsRequestData body, @QueryMap(encoded=true) PowerCableOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>powerCableOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PowerCableOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/powerCable/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PowerCableOrganizationsResponseData> powerCableOrganizationsWithHttpInfo(@Param("elid") String elid, PowerCableOrganizationsRequestData body, @QueryMap(encoded=true) PowerCableOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>powerCableOrganizations</code> method in a fluent style.
   */
  public static class PowerCableOrganizationsQueryParams extends HashMap<String, Object> {
    public PowerCableOrganizationsQueryParams sessionId(final String value) {
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
   * @return PowerCablePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PowerCablePersonGroupsResponseData powerCablePersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, PowerCablePersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>powerCablePersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PowerCablePersonGroupsResponseData> powerCablePersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PowerCablePersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>powerCablePersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PowerCablePersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PowerCablePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PowerCablePersonGroupsResponseData powerCablePersonGroups(@Param("elid") String elid, PowerCablePersonGroupsRequestData body, @QueryMap(encoded=true) PowerCablePersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>powerCablePersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PowerCablePersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/powerCable/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PowerCablePersonGroupsResponseData> powerCablePersonGroupsWithHttpInfo(@Param("elid") String elid, PowerCablePersonGroupsRequestData body, @QueryMap(encoded=true) PowerCablePersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>powerCablePersonGroups</code> method in a fluent style.
   */
  public static class PowerCablePersonGroupsQueryParams extends HashMap<String, Object> {
    public PowerCablePersonGroupsQueryParams sessionId(final String value) {
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
   * @return PowerCablePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PowerCablePersonsResponseData powerCablePersons(@Param("sessionId") String sessionId, @Param("elid") String elid, PowerCablePersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>powerCablePersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PowerCablePersonsResponseData> powerCablePersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PowerCablePersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>powerCablePersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PowerCablePersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PowerCablePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PowerCablePersonsResponseData powerCablePersons(@Param("elid") String elid, PowerCablePersonsRequestData body, @QueryMap(encoded=true) PowerCablePersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>powerCablePersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PowerCablePersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/powerCable/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PowerCablePersonsResponseData> powerCablePersonsWithHttpInfo(@Param("elid") String elid, PowerCablePersonsRequestData body, @QueryMap(encoded=true) PowerCablePersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>powerCablePersons</code> method in a fluent style.
   */
  public static class PowerCablePersonsQueryParams extends HashMap<String, Object> {
    public PowerCablePersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Physical port (power) entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return PowerCablePhysicalPortsPowerResponseData
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PowerCablePhysicalPortsPowerResponseData powerCablePhysicalPortsPower(@Param("sessionId") String sessionId, @Param("elid") String elid, PowerCablePhysicalPortsPowerRequestData body);

  /**
   * Get relations to Physical port (power) entities
   * Similar to <code>powerCablePhysicalPortsPower</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PowerCablePhysicalPortsPowerResponseData> powerCablePhysicalPortsPowerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PowerCablePhysicalPortsPowerRequestData body);


  /**
   * Get relations to Physical port (power) entities
   * 
   * Note, this is equivalent to the other <code>powerCablePhysicalPortsPower</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PowerCablePhysicalPortsPowerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PowerCablePhysicalPortsPowerResponseData
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PowerCablePhysicalPortsPowerResponseData powerCablePhysicalPortsPower(@Param("elid") String elid, PowerCablePhysicalPortsPowerRequestData body, @QueryMap(encoded=true) PowerCablePhysicalPortsPowerQueryParams queryParams);

  /**
  * Get relations to Physical port (power) entities
  * 
  * Note, this is equivalent to the other <code>powerCablePhysicalPortsPower</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PowerCablePhysicalPortsPowerResponseData
      */
      @RequestLine("POST /api/rest/entity/powerCable/{elid}/PhysicalPortsPower?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PowerCablePhysicalPortsPowerResponseData> powerCablePhysicalPortsPowerWithHttpInfo(@Param("elid") String elid, PowerCablePhysicalPortsPowerRequestData body, @QueryMap(encoded=true) PowerCablePhysicalPortsPowerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>powerCablePhysicalPortsPower</code> method in a fluent style.
   */
  public static class PowerCablePhysicalPortsPowerQueryParams extends HashMap<String, Object> {
    public PowerCablePhysicalPortsPowerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PowerCableQueryResponse
   */
  @RequestLine("POST /api/rest/entity/powerCable/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PowerCableQueryResponse powerCableQuery(@Param("sessionId") String sessionId, PowerCableQueryRequest body);

  /**
   * Basic query
   * Similar to <code>powerCableQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/powerCable/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PowerCableQueryResponse> powerCableQueryWithHttpInfo(@Param("sessionId") String sessionId, PowerCableQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>powerCableQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PowerCableQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PowerCableQueryResponse
   */
  @RequestLine("POST /api/rest/entity/powerCable/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PowerCableQueryResponse powerCableQuery(PowerCableQueryRequest body, @QueryMap(encoded=true) PowerCableQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>powerCableQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PowerCableQueryResponse
      */
      @RequestLine("POST /api/rest/entity/powerCable/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PowerCableQueryResponse> powerCableQueryWithHttpInfo(PowerCableQueryRequest body, @QueryMap(encoded=true) PowerCableQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>powerCableQuery</code> method in a fluent style.
   */
  public static class PowerCableQueryQueryParams extends HashMap<String, Object> {
    public PowerCableQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query Start port
   * Queries the start port
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return PowerCableStartPortResponse
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/StartPort?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PowerCableStartPortResponse powerCableStartPort(@Param("sessionId") String sessionId, @Param("elid") String elid, PowerCableStartPortRequest body);

  /**
   * Query Start port
   * Similar to <code>powerCableStartPort</code> but it also returns the http response headers .
   * Queries the start port
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/StartPort?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PowerCableStartPortResponse> powerCableStartPortWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PowerCableStartPortRequest body);


  /**
   * Query Start port
   * Queries the start port
   * Note, this is equivalent to the other <code>powerCableStartPort</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PowerCableStartPortQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PowerCableStartPortResponse
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/StartPort?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PowerCableStartPortResponse powerCableStartPort(@Param("elid") String elid, PowerCableStartPortRequest body, @QueryMap(encoded=true) PowerCableStartPortQueryParams queryParams);

  /**
  * Query Start port
  * Queries the start port
  * Note, this is equivalent to the other <code>powerCableStartPort</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PowerCableStartPortResponse
      */
      @RequestLine("POST /api/rest/entity/powerCable/{elid}/StartPort?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PowerCableStartPortResponse> powerCableStartPortWithHttpInfo(@Param("elid") String elid, PowerCableStartPortRequest body, @QueryMap(encoded=true) PowerCableStartPortQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>powerCableStartPort</code> method in a fluent style.
   */
  public static class PowerCableStartPortQueryParams extends HashMap<String, Object> {
    public PowerCableStartPortQueryParams sessionId(final String value) {
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
   * @return PowerCableSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PowerCableSystemAttributesResponse powerCableSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, PowerCableSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>powerCableSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PowerCableSystemAttributesResponse> powerCableSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PowerCableSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>powerCableSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PowerCableSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PowerCableSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PowerCableSystemAttributesResponse powerCableSystemAttributes(@Param("elid") String elid, PowerCableSystemAttributesRequest body, @QueryMap(encoded=true) PowerCableSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>powerCableSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PowerCableSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/powerCable/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PowerCableSystemAttributesResponse> powerCableSystemAttributesWithHttpInfo(@Param("elid") String elid, PowerCableSystemAttributesRequest body, @QueryMap(encoded=true) PowerCableSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>powerCableSystemAttributes</code> method in a fluent style.
   */
  public static class PowerCableSystemAttributesQueryParams extends HashMap<String, Object> {
    public PowerCableSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Reserve conductor
   * Reserve conductor
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ReserveConductorPowerCableResponse
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/reserveConductor?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ReserveConductorPowerCableResponse reserveConductorPowerCable(@Param("sessionId") String sessionId, @Param("elid") String elid, ReserveConductorPowerCableRequestData body);

  /**
   * Reserve conductor
   * Similar to <code>reserveConductorPowerCable</code> but it also returns the http response headers .
   * Reserve conductor
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/reserveConductor?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ReserveConductorPowerCableResponse> reserveConductorPowerCableWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ReserveConductorPowerCableRequestData body);


  /**
   * Reserve conductor
   * Reserve conductor
   * Note, this is equivalent to the other <code>reserveConductorPowerCable</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ReserveConductorPowerCableQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ReserveConductorPowerCableResponse
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/reserveConductor?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ReserveConductorPowerCableResponse reserveConductorPowerCable(@Param("elid") String elid, ReserveConductorPowerCableRequestData body, @QueryMap(encoded=true) ReserveConductorPowerCableQueryParams queryParams);

  /**
  * Reserve conductor
  * Reserve conductor
  * Note, this is equivalent to the other <code>reserveConductorPowerCable</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ReserveConductorPowerCableResponse
      */
      @RequestLine("POST /api/rest/entity/powerCable/{elid}/reserveConductor?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ReserveConductorPowerCableResponse> reserveConductorPowerCableWithHttpInfo(@Param("elid") String elid, ReserveConductorPowerCableRequestData body, @QueryMap(encoded=true) ReserveConductorPowerCableQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>reserveConductorPowerCable</code> method in a fluent style.
   */
  public static class ReserveConductorPowerCableQueryParams extends HashMap<String, Object> {
    public ReserveConductorPowerCableQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Unblock conductor
   * Unblock conductor
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UnblockConductorPowerCableResponse
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/unblockConductor?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UnblockConductorPowerCableResponse unblockConductorPowerCable(@Param("sessionId") String sessionId, @Param("elid") String elid, UnblockConductorPowerCableRequestData body);

  /**
   * Unblock conductor
   * Similar to <code>unblockConductorPowerCable</code> but it also returns the http response headers .
   * Unblock conductor
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/unblockConductor?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UnblockConductorPowerCableResponse> unblockConductorPowerCableWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UnblockConductorPowerCableRequestData body);


  /**
   * Unblock conductor
   * Unblock conductor
   * Note, this is equivalent to the other <code>unblockConductorPowerCable</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UnblockConductorPowerCableQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UnblockConductorPowerCableResponse
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/unblockConductor?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UnblockConductorPowerCableResponse unblockConductorPowerCable(@Param("elid") String elid, UnblockConductorPowerCableRequestData body, @QueryMap(encoded=true) UnblockConductorPowerCableQueryParams queryParams);

  /**
  * Unblock conductor
  * Unblock conductor
  * Note, this is equivalent to the other <code>unblockConductorPowerCable</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UnblockConductorPowerCableResponse
      */
      @RequestLine("POST /api/rest/entity/powerCable/{elid}/unblockConductor?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UnblockConductorPowerCableResponse> unblockConductorPowerCableWithHttpInfo(@Param("elid") String elid, UnblockConductorPowerCableRequestData body, @QueryMap(encoded=true) UnblockConductorPowerCableQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>unblockConductorPowerCable</code> method in a fluent style.
   */
  public static class UnblockConductorPowerCableQueryParams extends HashMap<String, Object> {
    public UnblockConductorPowerCableQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Cable
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdatePowerCableResponse
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdatePowerCableResponse updatePowerCable(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdatePowerCableRequestData body);

  /**
   * Modify
   * Similar to <code>updatePowerCable</code> but it also returns the http response headers .
   * Modify Cable
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdatePowerCableResponse> updatePowerCableWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdatePowerCableRequestData body);


  /**
   * Modify
   * Modify Cable
   * Note, this is equivalent to the other <code>updatePowerCable</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdatePowerCableQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdatePowerCableResponse
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdatePowerCableResponse updatePowerCable(@Param("elid") String elid, UpdatePowerCableRequestData body, @QueryMap(encoded=true) UpdatePowerCableQueryParams queryParams);

  /**
  * Modify
  * Modify Cable
  * Note, this is equivalent to the other <code>updatePowerCable</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdatePowerCableResponse
      */
      @RequestLine("POST /api/rest/entity/powerCable/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdatePowerCableResponse> updatePowerCableWithHttpInfo(@Param("elid") String elid, UpdatePowerCableRequestData body, @QueryMap(encoded=true) UpdatePowerCableQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updatePowerCable</code> method in a fluent style.
   */
  public static class UpdatePowerCableQueryParams extends HashMap<String, Object> {
    public UpdatePowerCableQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesPowerCableResponse
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesPowerCableResponse updateSystemAttributesPowerCable(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesPowerCableRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesPowerCable</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesPowerCableResponse> updateSystemAttributesPowerCableWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesPowerCableRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesPowerCable</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesPowerCableQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesPowerCableResponse
   */
  @RequestLine("POST /api/rest/entity/powerCable/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesPowerCableResponse updateSystemAttributesPowerCable(@Param("elid") String elid, UpdateSystemAttributesPowerCableRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesPowerCableQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesPowerCable</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesPowerCableResponse
      */
      @RequestLine("POST /api/rest/entity/powerCable/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesPowerCableResponse> updateSystemAttributesPowerCableWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesPowerCableRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesPowerCableQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesPowerCable</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesPowerCableQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesPowerCableQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
