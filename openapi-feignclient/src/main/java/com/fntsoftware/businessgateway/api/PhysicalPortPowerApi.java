package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.BlockPortPhysicalPortPowerRequestData;
import com.fntsoftware.businessgateway.entities.BlockPortPhysicalPortPowerResponse;
import com.fntsoftware.businessgateway.entities.PhysicalPortPowerCustomPatchpointRequestData;
import com.fntsoftware.businessgateway.entities.PhysicalPortPowerCustomPatchpointResponseData;
import com.fntsoftware.businessgateway.entities.PhysicalPortPowerDeviceAllRequestData;
import com.fntsoftware.businessgateway.entities.PhysicalPortPowerDeviceAllResponseData;
import com.fntsoftware.businessgateway.entities.PhysicalPortPowerFuseRequestData;
import com.fntsoftware.businessgateway.entities.PhysicalPortPowerFuseResponseData;
import com.fntsoftware.businessgateway.entities.PhysicalPortPowerGetGridInputPhaseRequest;
import com.fntsoftware.businessgateway.entities.PhysicalPortPowerGetGridInputPhaseResponse;
import com.fntsoftware.businessgateway.entities.PhysicalPortPowerGridInputPhaseRequestData;
import com.fntsoftware.businessgateway.entities.PhysicalPortPowerGridInputPhaseResponseData;
import com.fntsoftware.businessgateway.entities.PhysicalPortPowerLogicalConnectionsPowerRequestData;
import com.fntsoftware.businessgateway.entities.PhysicalPortPowerLogicalConnectionsPowerResponseData;
import com.fntsoftware.businessgateway.entities.PhysicalPortPowerPhysicalConnectionPowerRequestData;
import com.fntsoftware.businessgateway.entities.PhysicalPortPowerPhysicalConnectionPowerResponseData;
import com.fntsoftware.businessgateway.entities.PhysicalPortPowerPowerTerminalsRequestData;
import com.fntsoftware.businessgateway.entities.PhysicalPortPowerPowerTerminalsResponseData;
import com.fntsoftware.businessgateway.entities.PhysicalPortPowerQueryRequest;
import com.fntsoftware.businessgateway.entities.PhysicalPortPowerQueryResponse;
import com.fntsoftware.businessgateway.entities.PhysicalPortPowerSignalTraceEndRequest;
import com.fntsoftware.businessgateway.entities.PhysicalPortPowerSignalTraceEndResponse;
import com.fntsoftware.businessgateway.entities.ReservePortPhysicalPortPowerRequestData;
import com.fntsoftware.businessgateway.entities.ReservePortPhysicalPortPowerResponse;
import com.fntsoftware.businessgateway.entities.UnblockPortPhysicalPortPowerResponse;
import com.fntsoftware.businessgateway.entities.UpdatePhysicalPortPowerRequestData;
import com.fntsoftware.businessgateway.entities.UpdatePhysicalPortPowerResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface PhysicalPortPowerApi extends ApiClient.Api {


  /**
   * Block port
   * Block port
   * @param sessionId Session-ID (required)
   * @param portIdentifier  (required)
   * @param body  (required)
   * @return BlockPortPhysicalPortPowerResponse
   */
  @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/blockPort?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BlockPortPhysicalPortPowerResponse blockPortPhysicalPortPower(@Param("sessionId") String sessionId, @Param("portIdentifier") String portIdentifier, BlockPortPhysicalPortPowerRequestData body);

  /**
   * Block port
   * Similar to <code>blockPortPhysicalPortPower</code> but it also returns the http response headers .
   * Block port
   * @param sessionId Session-ID (required)
   * @param portIdentifier  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/blockPort?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BlockPortPhysicalPortPowerResponse> blockPortPhysicalPortPowerWithHttpInfo(@Param("sessionId") String sessionId, @Param("portIdentifier") String portIdentifier, BlockPortPhysicalPortPowerRequestData body);


  /**
   * Block port
   * Block port
   * Note, this is equivalent to the other <code>blockPortPhysicalPortPower</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BlockPortPhysicalPortPowerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param portIdentifier  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return BlockPortPhysicalPortPowerResponse
   */
  @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/blockPort?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  BlockPortPhysicalPortPowerResponse blockPortPhysicalPortPower(@Param("portIdentifier") String portIdentifier, BlockPortPhysicalPortPowerRequestData body, @QueryMap(encoded=true) BlockPortPhysicalPortPowerQueryParams queryParams);

  /**
  * Block port
  * Block port
  * Note, this is equivalent to the other <code>blockPortPhysicalPortPower</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param portIdentifier  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return BlockPortPhysicalPortPowerResponse
      */
      @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/blockPort?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<BlockPortPhysicalPortPowerResponse> blockPortPhysicalPortPowerWithHttpInfo(@Param("portIdentifier") String portIdentifier, BlockPortPhysicalPortPowerRequestData body, @QueryMap(encoded=true) BlockPortPhysicalPortPowerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>blockPortPhysicalPortPower</code> method in a fluent style.
   */
  public static class BlockPortPhysicalPortPowerQueryParams extends HashMap<String, Object> {
    public BlockPortPhysicalPortPowerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Patchpoint entities
   * 
   * @param sessionId Session-ID (required)
   * @param portIdentifier  (required)
   * @param body  (required)
   * @return PhysicalPortPowerCustomPatchpointResponseData
   */
  @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/CustomPatchpoint?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PhysicalPortPowerCustomPatchpointResponseData physicalPortPowerCustomPatchpoint(@Param("sessionId") String sessionId, @Param("portIdentifier") String portIdentifier, PhysicalPortPowerCustomPatchpointRequestData body);

  /**
   * Get relations to Patchpoint entities
   * Similar to <code>physicalPortPowerCustomPatchpoint</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param portIdentifier  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/CustomPatchpoint?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PhysicalPortPowerCustomPatchpointResponseData> physicalPortPowerCustomPatchpointWithHttpInfo(@Param("sessionId") String sessionId, @Param("portIdentifier") String portIdentifier, PhysicalPortPowerCustomPatchpointRequestData body);


  /**
   * Get relations to Patchpoint entities
   * 
   * Note, this is equivalent to the other <code>physicalPortPowerCustomPatchpoint</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PhysicalPortPowerCustomPatchpointQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param portIdentifier  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PhysicalPortPowerCustomPatchpointResponseData
   */
  @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/CustomPatchpoint?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PhysicalPortPowerCustomPatchpointResponseData physicalPortPowerCustomPatchpoint(@Param("portIdentifier") String portIdentifier, PhysicalPortPowerCustomPatchpointRequestData body, @QueryMap(encoded=true) PhysicalPortPowerCustomPatchpointQueryParams queryParams);

  /**
  * Get relations to Patchpoint entities
  * 
  * Note, this is equivalent to the other <code>physicalPortPowerCustomPatchpoint</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param portIdentifier  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PhysicalPortPowerCustomPatchpointResponseData
      */
      @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/CustomPatchpoint?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PhysicalPortPowerCustomPatchpointResponseData> physicalPortPowerCustomPatchpointWithHttpInfo(@Param("portIdentifier") String portIdentifier, PhysicalPortPowerCustomPatchpointRequestData body, @QueryMap(encoded=true) PhysicalPortPowerCustomPatchpointQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>physicalPortPowerCustomPatchpoint</code> method in a fluent style.
   */
  public static class PhysicalPortPowerCustomPatchpointQueryParams extends HashMap<String, Object> {
    public PhysicalPortPowerCustomPatchpointQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Device (all) entities
   * 
   * @param sessionId Session-ID (required)
   * @param portIdentifier  (required)
   * @param body  (required)
   * @return PhysicalPortPowerDeviceAllResponseData
   */
  @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/DeviceAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PhysicalPortPowerDeviceAllResponseData physicalPortPowerDeviceAll(@Param("sessionId") String sessionId, @Param("portIdentifier") String portIdentifier, PhysicalPortPowerDeviceAllRequestData body);

  /**
   * Get relations to Device (all) entities
   * Similar to <code>physicalPortPowerDeviceAll</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param portIdentifier  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/DeviceAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PhysicalPortPowerDeviceAllResponseData> physicalPortPowerDeviceAllWithHttpInfo(@Param("sessionId") String sessionId, @Param("portIdentifier") String portIdentifier, PhysicalPortPowerDeviceAllRequestData body);


  /**
   * Get relations to Device (all) entities
   * 
   * Note, this is equivalent to the other <code>physicalPortPowerDeviceAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PhysicalPortPowerDeviceAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param portIdentifier  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PhysicalPortPowerDeviceAllResponseData
   */
  @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/DeviceAll?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PhysicalPortPowerDeviceAllResponseData physicalPortPowerDeviceAll(@Param("portIdentifier") String portIdentifier, PhysicalPortPowerDeviceAllRequestData body, @QueryMap(encoded=true) PhysicalPortPowerDeviceAllQueryParams queryParams);

  /**
  * Get relations to Device (all) entities
  * 
  * Note, this is equivalent to the other <code>physicalPortPowerDeviceAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param portIdentifier  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PhysicalPortPowerDeviceAllResponseData
      */
      @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/DeviceAll?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PhysicalPortPowerDeviceAllResponseData> physicalPortPowerDeviceAllWithHttpInfo(@Param("portIdentifier") String portIdentifier, PhysicalPortPowerDeviceAllRequestData body, @QueryMap(encoded=true) PhysicalPortPowerDeviceAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>physicalPortPowerDeviceAll</code> method in a fluent style.
   */
  public static class PhysicalPortPowerDeviceAllQueryParams extends HashMap<String, Object> {
    public PhysicalPortPowerDeviceAllQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Fuse entities
   * 
   * @param sessionId Session-ID (required)
   * @param portIdentifier  (required)
   * @param body  (required)
   * @return PhysicalPortPowerFuseResponseData
   */
  @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/Fuse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PhysicalPortPowerFuseResponseData physicalPortPowerFuse(@Param("sessionId") String sessionId, @Param("portIdentifier") String portIdentifier, PhysicalPortPowerFuseRequestData body);

  /**
   * Get relations to Fuse entities
   * Similar to <code>physicalPortPowerFuse</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param portIdentifier  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/Fuse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PhysicalPortPowerFuseResponseData> physicalPortPowerFuseWithHttpInfo(@Param("sessionId") String sessionId, @Param("portIdentifier") String portIdentifier, PhysicalPortPowerFuseRequestData body);


  /**
   * Get relations to Fuse entities
   * 
   * Note, this is equivalent to the other <code>physicalPortPowerFuse</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PhysicalPortPowerFuseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param portIdentifier  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PhysicalPortPowerFuseResponseData
   */
  @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/Fuse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PhysicalPortPowerFuseResponseData physicalPortPowerFuse(@Param("portIdentifier") String portIdentifier, PhysicalPortPowerFuseRequestData body, @QueryMap(encoded=true) PhysicalPortPowerFuseQueryParams queryParams);

  /**
  * Get relations to Fuse entities
  * 
  * Note, this is equivalent to the other <code>physicalPortPowerFuse</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param portIdentifier  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PhysicalPortPowerFuseResponseData
      */
      @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/Fuse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PhysicalPortPowerFuseResponseData> physicalPortPowerFuseWithHttpInfo(@Param("portIdentifier") String portIdentifier, PhysicalPortPowerFuseRequestData body, @QueryMap(encoded=true) PhysicalPortPowerFuseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>physicalPortPowerFuse</code> method in a fluent style.
   */
  public static class PhysicalPortPowerFuseQueryParams extends HashMap<String, Object> {
    public PhysicalPortPowerFuseQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query Grid input phase
   * Queries the data of the grid input phase
   * @param sessionId Session-ID (required)
   * @param portIdentifier  (required)
   * @param body  (required)
   * @return PhysicalPortPowerGetGridInputPhaseResponse
   */
  @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/GetGridInputPhase?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PhysicalPortPowerGetGridInputPhaseResponse physicalPortPowerGetGridInputPhase(@Param("sessionId") String sessionId, @Param("portIdentifier") String portIdentifier, PhysicalPortPowerGetGridInputPhaseRequest body);

  /**
   * Query Grid input phase
   * Similar to <code>physicalPortPowerGetGridInputPhase</code> but it also returns the http response headers .
   * Queries the data of the grid input phase
   * @param sessionId Session-ID (required)
   * @param portIdentifier  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/GetGridInputPhase?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PhysicalPortPowerGetGridInputPhaseResponse> physicalPortPowerGetGridInputPhaseWithHttpInfo(@Param("sessionId") String sessionId, @Param("portIdentifier") String portIdentifier, PhysicalPortPowerGetGridInputPhaseRequest body);


  /**
   * Query Grid input phase
   * Queries the data of the grid input phase
   * Note, this is equivalent to the other <code>physicalPortPowerGetGridInputPhase</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PhysicalPortPowerGetGridInputPhaseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param portIdentifier  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PhysicalPortPowerGetGridInputPhaseResponse
   */
  @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/GetGridInputPhase?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PhysicalPortPowerGetGridInputPhaseResponse physicalPortPowerGetGridInputPhase(@Param("portIdentifier") String portIdentifier, PhysicalPortPowerGetGridInputPhaseRequest body, @QueryMap(encoded=true) PhysicalPortPowerGetGridInputPhaseQueryParams queryParams);

  /**
  * Query Grid input phase
  * Queries the data of the grid input phase
  * Note, this is equivalent to the other <code>physicalPortPowerGetGridInputPhase</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param portIdentifier  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PhysicalPortPowerGetGridInputPhaseResponse
      */
      @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/GetGridInputPhase?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PhysicalPortPowerGetGridInputPhaseResponse> physicalPortPowerGetGridInputPhaseWithHttpInfo(@Param("portIdentifier") String portIdentifier, PhysicalPortPowerGetGridInputPhaseRequest body, @QueryMap(encoded=true) PhysicalPortPowerGetGridInputPhaseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>physicalPortPowerGetGridInputPhase</code> method in a fluent style.
   */
  public static class PhysicalPortPowerGetGridInputPhaseQueryParams extends HashMap<String, Object> {
    public PhysicalPortPowerGetGridInputPhaseQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Grid input phase entities
   * 
   * @param sessionId Session-ID (required)
   * @param portIdentifier  (required)
   * @param body  (required)
   * @return PhysicalPortPowerGridInputPhaseResponseData
   */
  @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/GridInputPhase?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PhysicalPortPowerGridInputPhaseResponseData physicalPortPowerGridInputPhase(@Param("sessionId") String sessionId, @Param("portIdentifier") String portIdentifier, PhysicalPortPowerGridInputPhaseRequestData body);

  /**
   * Get relations to Grid input phase entities
   * Similar to <code>physicalPortPowerGridInputPhase</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param portIdentifier  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/GridInputPhase?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PhysicalPortPowerGridInputPhaseResponseData> physicalPortPowerGridInputPhaseWithHttpInfo(@Param("sessionId") String sessionId, @Param("portIdentifier") String portIdentifier, PhysicalPortPowerGridInputPhaseRequestData body);


  /**
   * Get relations to Grid input phase entities
   * 
   * Note, this is equivalent to the other <code>physicalPortPowerGridInputPhase</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PhysicalPortPowerGridInputPhaseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param portIdentifier  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PhysicalPortPowerGridInputPhaseResponseData
   */
  @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/GridInputPhase?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PhysicalPortPowerGridInputPhaseResponseData physicalPortPowerGridInputPhase(@Param("portIdentifier") String portIdentifier, PhysicalPortPowerGridInputPhaseRequestData body, @QueryMap(encoded=true) PhysicalPortPowerGridInputPhaseQueryParams queryParams);

  /**
  * Get relations to Grid input phase entities
  * 
  * Note, this is equivalent to the other <code>physicalPortPowerGridInputPhase</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param portIdentifier  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PhysicalPortPowerGridInputPhaseResponseData
      */
      @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/GridInputPhase?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PhysicalPortPowerGridInputPhaseResponseData> physicalPortPowerGridInputPhaseWithHttpInfo(@Param("portIdentifier") String portIdentifier, PhysicalPortPowerGridInputPhaseRequestData body, @QueryMap(encoded=true) PhysicalPortPowerGridInputPhaseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>physicalPortPowerGridInputPhase</code> method in a fluent style.
   */
  public static class PhysicalPortPowerGridInputPhaseQueryParams extends HashMap<String, Object> {
    public PhysicalPortPowerGridInputPhaseQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Logical connection (current) entities
   * 
   * @param sessionId Session-ID (required)
   * @param portIdentifier  (required)
   * @param body  (required)
   * @return PhysicalPortPowerLogicalConnectionsPowerResponseData
   */
  @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/LogicalConnectionsPower?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PhysicalPortPowerLogicalConnectionsPowerResponseData physicalPortPowerLogicalConnectionsPower(@Param("sessionId") String sessionId, @Param("portIdentifier") String portIdentifier, PhysicalPortPowerLogicalConnectionsPowerRequestData body);

  /**
   * Get relations to Logical connection (current) entities
   * Similar to <code>physicalPortPowerLogicalConnectionsPower</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param portIdentifier  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/LogicalConnectionsPower?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PhysicalPortPowerLogicalConnectionsPowerResponseData> physicalPortPowerLogicalConnectionsPowerWithHttpInfo(@Param("sessionId") String sessionId, @Param("portIdentifier") String portIdentifier, PhysicalPortPowerLogicalConnectionsPowerRequestData body);


  /**
   * Get relations to Logical connection (current) entities
   * 
   * Note, this is equivalent to the other <code>physicalPortPowerLogicalConnectionsPower</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PhysicalPortPowerLogicalConnectionsPowerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param portIdentifier  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PhysicalPortPowerLogicalConnectionsPowerResponseData
   */
  @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/LogicalConnectionsPower?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PhysicalPortPowerLogicalConnectionsPowerResponseData physicalPortPowerLogicalConnectionsPower(@Param("portIdentifier") String portIdentifier, PhysicalPortPowerLogicalConnectionsPowerRequestData body, @QueryMap(encoded=true) PhysicalPortPowerLogicalConnectionsPowerQueryParams queryParams);

  /**
  * Get relations to Logical connection (current) entities
  * 
  * Note, this is equivalent to the other <code>physicalPortPowerLogicalConnectionsPower</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param portIdentifier  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PhysicalPortPowerLogicalConnectionsPowerResponseData
      */
      @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/LogicalConnectionsPower?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PhysicalPortPowerLogicalConnectionsPowerResponseData> physicalPortPowerLogicalConnectionsPowerWithHttpInfo(@Param("portIdentifier") String portIdentifier, PhysicalPortPowerLogicalConnectionsPowerRequestData body, @QueryMap(encoded=true) PhysicalPortPowerLogicalConnectionsPowerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>physicalPortPowerLogicalConnectionsPower</code> method in a fluent style.
   */
  public static class PhysicalPortPowerLogicalConnectionsPowerQueryParams extends HashMap<String, Object> {
    public PhysicalPortPowerLogicalConnectionsPowerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Physical connection (current) entities
   * 
   * @param sessionId Session-ID (required)
   * @param portIdentifier  (required)
   * @param body  (required)
   * @return PhysicalPortPowerPhysicalConnectionPowerResponseData
   */
  @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/PhysicalConnectionPower?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PhysicalPortPowerPhysicalConnectionPowerResponseData physicalPortPowerPhysicalConnectionPower(@Param("sessionId") String sessionId, @Param("portIdentifier") String portIdentifier, PhysicalPortPowerPhysicalConnectionPowerRequestData body);

  /**
   * Get relations to Physical connection (current) entities
   * Similar to <code>physicalPortPowerPhysicalConnectionPower</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param portIdentifier  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/PhysicalConnectionPower?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PhysicalPortPowerPhysicalConnectionPowerResponseData> physicalPortPowerPhysicalConnectionPowerWithHttpInfo(@Param("sessionId") String sessionId, @Param("portIdentifier") String portIdentifier, PhysicalPortPowerPhysicalConnectionPowerRequestData body);


  /**
   * Get relations to Physical connection (current) entities
   * 
   * Note, this is equivalent to the other <code>physicalPortPowerPhysicalConnectionPower</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PhysicalPortPowerPhysicalConnectionPowerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param portIdentifier  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PhysicalPortPowerPhysicalConnectionPowerResponseData
   */
  @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/PhysicalConnectionPower?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PhysicalPortPowerPhysicalConnectionPowerResponseData physicalPortPowerPhysicalConnectionPower(@Param("portIdentifier") String portIdentifier, PhysicalPortPowerPhysicalConnectionPowerRequestData body, @QueryMap(encoded=true) PhysicalPortPowerPhysicalConnectionPowerQueryParams queryParams);

  /**
  * Get relations to Physical connection (current) entities
  * 
  * Note, this is equivalent to the other <code>physicalPortPowerPhysicalConnectionPower</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param portIdentifier  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PhysicalPortPowerPhysicalConnectionPowerResponseData
      */
      @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/PhysicalConnectionPower?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PhysicalPortPowerPhysicalConnectionPowerResponseData> physicalPortPowerPhysicalConnectionPowerWithHttpInfo(@Param("portIdentifier") String portIdentifier, PhysicalPortPowerPhysicalConnectionPowerRequestData body, @QueryMap(encoded=true) PhysicalPortPowerPhysicalConnectionPowerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>physicalPortPowerPhysicalConnectionPower</code> method in a fluent style.
   */
  public static class PhysicalPortPowerPhysicalConnectionPowerQueryParams extends HashMap<String, Object> {
    public PhysicalPortPowerPhysicalConnectionPowerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Power terminal entities
   * 
   * @param sessionId Session-ID (required)
   * @param portIdentifier  (required)
   * @param body  (required)
   * @return PhysicalPortPowerPowerTerminalsResponseData
   */
  @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/PowerTerminals?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PhysicalPortPowerPowerTerminalsResponseData physicalPortPowerPowerTerminals(@Param("sessionId") String sessionId, @Param("portIdentifier") String portIdentifier, PhysicalPortPowerPowerTerminalsRequestData body);

  /**
   * Get relations to Power terminal entities
   * Similar to <code>physicalPortPowerPowerTerminals</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param portIdentifier  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/PowerTerminals?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PhysicalPortPowerPowerTerminalsResponseData> physicalPortPowerPowerTerminalsWithHttpInfo(@Param("sessionId") String sessionId, @Param("portIdentifier") String portIdentifier, PhysicalPortPowerPowerTerminalsRequestData body);


  /**
   * Get relations to Power terminal entities
   * 
   * Note, this is equivalent to the other <code>physicalPortPowerPowerTerminals</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PhysicalPortPowerPowerTerminalsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param portIdentifier  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PhysicalPortPowerPowerTerminalsResponseData
   */
  @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/PowerTerminals?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PhysicalPortPowerPowerTerminalsResponseData physicalPortPowerPowerTerminals(@Param("portIdentifier") String portIdentifier, PhysicalPortPowerPowerTerminalsRequestData body, @QueryMap(encoded=true) PhysicalPortPowerPowerTerminalsQueryParams queryParams);

  /**
  * Get relations to Power terminal entities
  * 
  * Note, this is equivalent to the other <code>physicalPortPowerPowerTerminals</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param portIdentifier  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PhysicalPortPowerPowerTerminalsResponseData
      */
      @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/PowerTerminals?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PhysicalPortPowerPowerTerminalsResponseData> physicalPortPowerPowerTerminalsWithHttpInfo(@Param("portIdentifier") String portIdentifier, PhysicalPortPowerPowerTerminalsRequestData body, @QueryMap(encoded=true) PhysicalPortPowerPowerTerminalsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>physicalPortPowerPowerTerminals</code> method in a fluent style.
   */
  public static class PhysicalPortPowerPowerTerminalsQueryParams extends HashMap<String, Object> {
    public PhysicalPortPowerPowerTerminalsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Queries port data for a device. Either the device ID, the device ELID or the port identifier has to be specified as a restriction.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PhysicalPortPowerQueryResponse
   */
  @RequestLine("POST /api/rest/entity/physicalPortPower/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PhysicalPortPowerQueryResponse physicalPortPowerQuery(@Param("sessionId") String sessionId, PhysicalPortPowerQueryRequest body);

  /**
   * Basic query
   * Similar to <code>physicalPortPowerQuery</code> but it also returns the http response headers .
   * Queries port data for a device. Either the device ID, the device ELID or the port identifier has to be specified as a restriction.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/physicalPortPower/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PhysicalPortPowerQueryResponse> physicalPortPowerQueryWithHttpInfo(@Param("sessionId") String sessionId, PhysicalPortPowerQueryRequest body);


  /**
   * Basic query
   * Queries port data for a device. Either the device ID, the device ELID or the port identifier has to be specified as a restriction.
   * Note, this is equivalent to the other <code>physicalPortPowerQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PhysicalPortPowerQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PhysicalPortPowerQueryResponse
   */
  @RequestLine("POST /api/rest/entity/physicalPortPower/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PhysicalPortPowerQueryResponse physicalPortPowerQuery(PhysicalPortPowerQueryRequest body, @QueryMap(encoded=true) PhysicalPortPowerQueryQueryParams queryParams);

  /**
  * Basic query
  * Queries port data for a device. Either the device ID, the device ELID or the port identifier has to be specified as a restriction.
  * Note, this is equivalent to the other <code>physicalPortPowerQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PhysicalPortPowerQueryResponse
      */
      @RequestLine("POST /api/rest/entity/physicalPortPower/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PhysicalPortPowerQueryResponse> physicalPortPowerQueryWithHttpInfo(PhysicalPortPowerQueryRequest body, @QueryMap(encoded=true) PhysicalPortPowerQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>physicalPortPowerQuery</code> method in a fluent style.
   */
  public static class PhysicalPortPowerQueryQueryParams extends HashMap<String, Object> {
    public PhysicalPortPowerQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * End port of the signal tracing
   * 
   * @param sessionId Session-ID (required)
   * @param portIdentifier  (required)
   * @param body  (required)
   * @return PhysicalPortPowerSignalTraceEndResponse
   */
  @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/SignalTraceEnd?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PhysicalPortPowerSignalTraceEndResponse physicalPortPowerSignalTraceEnd(@Param("sessionId") String sessionId, @Param("portIdentifier") String portIdentifier, PhysicalPortPowerSignalTraceEndRequest body);

  /**
   * End port of the signal tracing
   * Similar to <code>physicalPortPowerSignalTraceEnd</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param portIdentifier  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/SignalTraceEnd?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PhysicalPortPowerSignalTraceEndResponse> physicalPortPowerSignalTraceEndWithHttpInfo(@Param("sessionId") String sessionId, @Param("portIdentifier") String portIdentifier, PhysicalPortPowerSignalTraceEndRequest body);


  /**
   * End port of the signal tracing
   * 
   * Note, this is equivalent to the other <code>physicalPortPowerSignalTraceEnd</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PhysicalPortPowerSignalTraceEndQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param portIdentifier  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PhysicalPortPowerSignalTraceEndResponse
   */
  @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/SignalTraceEnd?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PhysicalPortPowerSignalTraceEndResponse physicalPortPowerSignalTraceEnd(@Param("portIdentifier") String portIdentifier, PhysicalPortPowerSignalTraceEndRequest body, @QueryMap(encoded=true) PhysicalPortPowerSignalTraceEndQueryParams queryParams);

  /**
  * End port of the signal tracing
  * 
  * Note, this is equivalent to the other <code>physicalPortPowerSignalTraceEnd</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param portIdentifier  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PhysicalPortPowerSignalTraceEndResponse
      */
      @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/SignalTraceEnd?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PhysicalPortPowerSignalTraceEndResponse> physicalPortPowerSignalTraceEndWithHttpInfo(@Param("portIdentifier") String portIdentifier, PhysicalPortPowerSignalTraceEndRequest body, @QueryMap(encoded=true) PhysicalPortPowerSignalTraceEndQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>physicalPortPowerSignalTraceEnd</code> method in a fluent style.
   */
  public static class PhysicalPortPowerSignalTraceEndQueryParams extends HashMap<String, Object> {
    public PhysicalPortPowerSignalTraceEndQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Reserve port
   * Reserve port
   * @param sessionId Session-ID (required)
   * @param portIdentifier  (required)
   * @param body  (required)
   * @return ReservePortPhysicalPortPowerResponse
   */
  @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/reservePort?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ReservePortPhysicalPortPowerResponse reservePortPhysicalPortPower(@Param("sessionId") String sessionId, @Param("portIdentifier") String portIdentifier, ReservePortPhysicalPortPowerRequestData body);

  /**
   * Reserve port
   * Similar to <code>reservePortPhysicalPortPower</code> but it also returns the http response headers .
   * Reserve port
   * @param sessionId Session-ID (required)
   * @param portIdentifier  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/reservePort?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ReservePortPhysicalPortPowerResponse> reservePortPhysicalPortPowerWithHttpInfo(@Param("sessionId") String sessionId, @Param("portIdentifier") String portIdentifier, ReservePortPhysicalPortPowerRequestData body);


  /**
   * Reserve port
   * Reserve port
   * Note, this is equivalent to the other <code>reservePortPhysicalPortPower</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ReservePortPhysicalPortPowerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param portIdentifier  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ReservePortPhysicalPortPowerResponse
   */
  @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/reservePort?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ReservePortPhysicalPortPowerResponse reservePortPhysicalPortPower(@Param("portIdentifier") String portIdentifier, ReservePortPhysicalPortPowerRequestData body, @QueryMap(encoded=true) ReservePortPhysicalPortPowerQueryParams queryParams);

  /**
  * Reserve port
  * Reserve port
  * Note, this is equivalent to the other <code>reservePortPhysicalPortPower</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param portIdentifier  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ReservePortPhysicalPortPowerResponse
      */
      @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/reservePort?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ReservePortPhysicalPortPowerResponse> reservePortPhysicalPortPowerWithHttpInfo(@Param("portIdentifier") String portIdentifier, ReservePortPhysicalPortPowerRequestData body, @QueryMap(encoded=true) ReservePortPhysicalPortPowerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>reservePortPhysicalPortPower</code> method in a fluent style.
   */
  public static class ReservePortPhysicalPortPowerQueryParams extends HashMap<String, Object> {
    public ReservePortPhysicalPortPowerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Unblock port
   * Unblock port
   * @param sessionId Session-ID (required)
   * @param portIdentifier  (required)
   * @param body  (optional)
   * @return UnblockPortPhysicalPortPowerResponse
   */
  @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/unblockPort?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UnblockPortPhysicalPortPowerResponse unblockPortPhysicalPortPower(@Param("sessionId") String sessionId, @Param("portIdentifier") String portIdentifier, Object body);

  /**
   * Unblock port
   * Similar to <code>unblockPortPhysicalPortPower</code> but it also returns the http response headers .
   * Unblock port
   * @param sessionId Session-ID (required)
   * @param portIdentifier  (required)
   * @param body  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/unblockPort?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UnblockPortPhysicalPortPowerResponse> unblockPortPhysicalPortPowerWithHttpInfo(@Param("sessionId") String sessionId, @Param("portIdentifier") String portIdentifier, Object body);


  /**
   * Unblock port
   * Unblock port
   * Note, this is equivalent to the other <code>unblockPortPhysicalPortPower</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UnblockPortPhysicalPortPowerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param portIdentifier  (required)
   * @param body  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UnblockPortPhysicalPortPowerResponse
   */
  @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/unblockPort?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UnblockPortPhysicalPortPowerResponse unblockPortPhysicalPortPower(@Param("portIdentifier") String portIdentifier, Object body, @QueryMap(encoded=true) UnblockPortPhysicalPortPowerQueryParams queryParams);

  /**
  * Unblock port
  * Unblock port
  * Note, this is equivalent to the other <code>unblockPortPhysicalPortPower</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param portIdentifier  (required)
              * @param body  (optional)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UnblockPortPhysicalPortPowerResponse
      */
      @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/unblockPort?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UnblockPortPhysicalPortPowerResponse> unblockPortPhysicalPortPowerWithHttpInfo(@Param("portIdentifier") String portIdentifier, Object body, @QueryMap(encoded=true) UnblockPortPhysicalPortPowerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>unblockPortPhysicalPortPower</code> method in a fluent style.
   */
  public static class UnblockPortPhysicalPortPowerQueryParams extends HashMap<String, Object> {
    public UnblockPortPhysicalPortPowerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify port data
   * @param sessionId Session-ID (required)
   * @param portIdentifier  (required)
   * @param body  (required)
   * @return UpdatePhysicalPortPowerResponse
   */
  @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdatePhysicalPortPowerResponse updatePhysicalPortPower(@Param("sessionId") String sessionId, @Param("portIdentifier") String portIdentifier, UpdatePhysicalPortPowerRequestData body);

  /**
   * Modify
   * Similar to <code>updatePhysicalPortPower</code> but it also returns the http response headers .
   * Modify port data
   * @param sessionId Session-ID (required)
   * @param portIdentifier  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdatePhysicalPortPowerResponse> updatePhysicalPortPowerWithHttpInfo(@Param("sessionId") String sessionId, @Param("portIdentifier") String portIdentifier, UpdatePhysicalPortPowerRequestData body);


  /**
   * Modify
   * Modify port data
   * Note, this is equivalent to the other <code>updatePhysicalPortPower</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdatePhysicalPortPowerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param portIdentifier  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdatePhysicalPortPowerResponse
   */
  @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdatePhysicalPortPowerResponse updatePhysicalPortPower(@Param("portIdentifier") String portIdentifier, UpdatePhysicalPortPowerRequestData body, @QueryMap(encoded=true) UpdatePhysicalPortPowerQueryParams queryParams);

  /**
  * Modify
  * Modify port data
  * Note, this is equivalent to the other <code>updatePhysicalPortPower</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param portIdentifier  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdatePhysicalPortPowerResponse
      */
      @RequestLine("POST /api/rest/entity/physicalPortPower/{portIdentifier}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdatePhysicalPortPowerResponse> updatePhysicalPortPowerWithHttpInfo(@Param("portIdentifier") String portIdentifier, UpdatePhysicalPortPowerRequestData body, @QueryMap(encoded=true) UpdatePhysicalPortPowerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updatePhysicalPortPower</code> method in a fluent style.
   */
  public static class UpdatePhysicalPortPowerQueryParams extends HashMap<String, Object> {
    public UpdatePhysicalPortPowerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
