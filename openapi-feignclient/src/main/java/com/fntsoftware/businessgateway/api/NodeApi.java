package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateNodeRequestData;
import com.fntsoftware.businessgateway.entities.CreateNodeResponse;
import com.fntsoftware.businessgateway.entities.DeleteNodeRequestData;
import com.fntsoftware.businessgateway.entities.DeleteNodeResponse;
import com.fntsoftware.businessgateway.entities.NodeContractsRequestData;
import com.fntsoftware.businessgateway.entities.NodeContractsResponseData;
import com.fntsoftware.businessgateway.entities.NodeDevicesAllRequestData;
import com.fntsoftware.businessgateway.entities.NodeDevicesAllResponseData;
import com.fntsoftware.businessgateway.entities.NodeFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.NodeFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.NodeMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.NodeMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.NodeNodeTypeRequestData;
import com.fntsoftware.businessgateway.entities.NodeNodeTypeResponseData;
import com.fntsoftware.businessgateway.entities.NodeOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.NodeOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.NodePersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.NodePersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.NodePersonsRequestData;
import com.fntsoftware.businessgateway.entities.NodePersonsResponseData;
import com.fntsoftware.businessgateway.entities.NodeQueryRequest;
import com.fntsoftware.businessgateway.entities.NodeQueryResponse;
import com.fntsoftware.businessgateway.entities.NodeSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.NodeSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.NodeTraySectionsRequestData;
import com.fntsoftware.businessgateway.entities.NodeTraySectionsResponseData;
import com.fntsoftware.businessgateway.entities.NodeZoneRequestData;
import com.fntsoftware.businessgateway.entities.NodeZoneResponseData;
import com.fntsoftware.businessgateway.entities.UpdateNodeRequestData;
import com.fntsoftware.businessgateway.entities.UpdateNodeResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesNodeRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesNodeResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface NodeApi extends ApiClient.Api {


  /**
   * Create
   * Create Node
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateNodeResponse
   */
  @RequestLine("POST /api/rest/entity/node/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateNodeResponse createNode(@Param("sessionId") String sessionId, CreateNodeRequestData body);

  /**
   * Create
   * Similar to <code>createNode</code> but it also returns the http response headers .
   * Create Node
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/node/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateNodeResponse> createNodeWithHttpInfo(@Param("sessionId") String sessionId, CreateNodeRequestData body);


  /**
   * Create
   * Create Node
   * Note, this is equivalent to the other <code>createNode</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateNodeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateNodeResponse
   */
  @RequestLine("POST /api/rest/entity/node/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateNodeResponse createNode(CreateNodeRequestData body, @QueryMap(encoded=true) CreateNodeQueryParams queryParams);

  /**
  * Create
  * Create Node
  * Note, this is equivalent to the other <code>createNode</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateNodeResponse
      */
      @RequestLine("POST /api/rest/entity/node/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateNodeResponse> createNodeWithHttpInfo(CreateNodeRequestData body, @QueryMap(encoded=true) CreateNodeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createNode</code> method in a fluent style.
   */
  public static class CreateNodeQueryParams extends HashMap<String, Object> {
    public CreateNodeQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Node
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteNodeResponse
   */
  @RequestLine("POST /api/rest/entity/node/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteNodeResponse deleteNode(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteNodeRequestData body);

  /**
   * Delete
   * Similar to <code>deleteNode</code> but it also returns the http response headers .
   * Delete Node
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/node/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteNodeResponse> deleteNodeWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteNodeRequestData body);


  /**
   * Delete
   * Delete Node
   * Note, this is equivalent to the other <code>deleteNode</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteNodeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteNodeResponse
   */
  @RequestLine("POST /api/rest/entity/node/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteNodeResponse deleteNode(@Param("elid") String elid, DeleteNodeRequestData body, @QueryMap(encoded=true) DeleteNodeQueryParams queryParams);

  /**
  * Delete
  * Delete Node
  * Note, this is equivalent to the other <code>deleteNode</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteNodeResponse
      */
      @RequestLine("POST /api/rest/entity/node/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteNodeResponse> deleteNodeWithHttpInfo(@Param("elid") String elid, DeleteNodeRequestData body, @QueryMap(encoded=true) DeleteNodeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteNode</code> method in a fluent style.
   */
  public static class DeleteNodeQueryParams extends HashMap<String, Object> {
    public DeleteNodeQueryParams sessionId(final String value) {
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
   * @return NodeContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/node/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NodeContractsResponseData nodeContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, NodeContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>nodeContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/node/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NodeContractsResponseData> nodeContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NodeContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>nodeContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NodeContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NodeContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/node/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NodeContractsResponseData nodeContracts(@Param("elid") String elid, NodeContractsRequestData body, @QueryMap(encoded=true) NodeContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>nodeContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NodeContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/node/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NodeContractsResponseData> nodeContractsWithHttpInfo(@Param("elid") String elid, NodeContractsRequestData body, @QueryMap(encoded=true) NodeContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nodeContracts</code> method in a fluent style.
   */
  public static class NodeContractsQueryParams extends HashMap<String, Object> {
    public NodeContractsQueryParams sessionId(final String value) {
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
   * @return NodeDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/node/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NodeDevicesAllResponseData nodeDevicesAll(@Param("sessionId") String sessionId, @Param("elid") String elid, NodeDevicesAllRequestData body);

  /**
   * Get relations to Device (all) entities
   * Similar to <code>nodeDevicesAll</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/node/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NodeDevicesAllResponseData> nodeDevicesAllWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NodeDevicesAllRequestData body);


  /**
   * Get relations to Device (all) entities
   * 
   * Note, this is equivalent to the other <code>nodeDevicesAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NodeDevicesAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NodeDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/node/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NodeDevicesAllResponseData nodeDevicesAll(@Param("elid") String elid, NodeDevicesAllRequestData body, @QueryMap(encoded=true) NodeDevicesAllQueryParams queryParams);

  /**
  * Get relations to Device (all) entities
  * 
  * Note, this is equivalent to the other <code>nodeDevicesAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NodeDevicesAllResponseData
      */
      @RequestLine("POST /api/rest/entity/node/{elid}/DevicesAll?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NodeDevicesAllResponseData> nodeDevicesAllWithHttpInfo(@Param("elid") String elid, NodeDevicesAllRequestData body, @QueryMap(encoded=true) NodeDevicesAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nodeDevicesAll</code> method in a fluent style.
   */
  public static class NodeDevicesAllQueryParams extends HashMap<String, Object> {
    public NodeDevicesAllQueryParams sessionId(final String value) {
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
   * @return NodeFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/node/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NodeFrameContractsResponseData nodeFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, NodeFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>nodeFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/node/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NodeFrameContractsResponseData> nodeFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NodeFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>nodeFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NodeFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NodeFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/node/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NodeFrameContractsResponseData nodeFrameContracts(@Param("elid") String elid, NodeFrameContractsRequestData body, @QueryMap(encoded=true) NodeFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>nodeFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NodeFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/node/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NodeFrameContractsResponseData> nodeFrameContractsWithHttpInfo(@Param("elid") String elid, NodeFrameContractsRequestData body, @QueryMap(encoded=true) NodeFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nodeFrameContracts</code> method in a fluent style.
   */
  public static class NodeFrameContractsQueryParams extends HashMap<String, Object> {
    public NodeFrameContractsQueryParams sessionId(final String value) {
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
   * @return NodeMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/node/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NodeMaintenanceContractsResponseData nodeMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, NodeMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>nodeMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/node/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NodeMaintenanceContractsResponseData> nodeMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NodeMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>nodeMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NodeMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NodeMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/node/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NodeMaintenanceContractsResponseData nodeMaintenanceContracts(@Param("elid") String elid, NodeMaintenanceContractsRequestData body, @QueryMap(encoded=true) NodeMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>nodeMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NodeMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/node/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NodeMaintenanceContractsResponseData> nodeMaintenanceContractsWithHttpInfo(@Param("elid") String elid, NodeMaintenanceContractsRequestData body, @QueryMap(encoded=true) NodeMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nodeMaintenanceContracts</code> method in a fluent style.
   */
  public static class NodeMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public NodeMaintenanceContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Node type entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return NodeNodeTypeResponseData
   */
  @RequestLine("POST /api/rest/entity/node/{elid}/NodeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NodeNodeTypeResponseData nodeNodeType(@Param("sessionId") String sessionId, @Param("elid") String elid, NodeNodeTypeRequestData body);

  /**
   * Get relations to Node type entities
   * Similar to <code>nodeNodeType</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/node/{elid}/NodeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NodeNodeTypeResponseData> nodeNodeTypeWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NodeNodeTypeRequestData body);


  /**
   * Get relations to Node type entities
   * 
   * Note, this is equivalent to the other <code>nodeNodeType</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NodeNodeTypeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NodeNodeTypeResponseData
   */
  @RequestLine("POST /api/rest/entity/node/{elid}/NodeType?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NodeNodeTypeResponseData nodeNodeType(@Param("elid") String elid, NodeNodeTypeRequestData body, @QueryMap(encoded=true) NodeNodeTypeQueryParams queryParams);

  /**
  * Get relations to Node type entities
  * 
  * Note, this is equivalent to the other <code>nodeNodeType</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NodeNodeTypeResponseData
      */
      @RequestLine("POST /api/rest/entity/node/{elid}/NodeType?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NodeNodeTypeResponseData> nodeNodeTypeWithHttpInfo(@Param("elid") String elid, NodeNodeTypeRequestData body, @QueryMap(encoded=true) NodeNodeTypeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nodeNodeType</code> method in a fluent style.
   */
  public static class NodeNodeTypeQueryParams extends HashMap<String, Object> {
    public NodeNodeTypeQueryParams sessionId(final String value) {
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
   * @return NodeOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/node/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NodeOrganizationsResponseData nodeOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, NodeOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>nodeOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/node/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NodeOrganizationsResponseData> nodeOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NodeOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>nodeOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NodeOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NodeOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/node/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NodeOrganizationsResponseData nodeOrganizations(@Param("elid") String elid, NodeOrganizationsRequestData body, @QueryMap(encoded=true) NodeOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>nodeOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NodeOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/node/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NodeOrganizationsResponseData> nodeOrganizationsWithHttpInfo(@Param("elid") String elid, NodeOrganizationsRequestData body, @QueryMap(encoded=true) NodeOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nodeOrganizations</code> method in a fluent style.
   */
  public static class NodeOrganizationsQueryParams extends HashMap<String, Object> {
    public NodeOrganizationsQueryParams sessionId(final String value) {
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
   * @return NodePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/node/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NodePersonGroupsResponseData nodePersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, NodePersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>nodePersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/node/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NodePersonGroupsResponseData> nodePersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NodePersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>nodePersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NodePersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NodePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/node/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NodePersonGroupsResponseData nodePersonGroups(@Param("elid") String elid, NodePersonGroupsRequestData body, @QueryMap(encoded=true) NodePersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>nodePersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NodePersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/node/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NodePersonGroupsResponseData> nodePersonGroupsWithHttpInfo(@Param("elid") String elid, NodePersonGroupsRequestData body, @QueryMap(encoded=true) NodePersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nodePersonGroups</code> method in a fluent style.
   */
  public static class NodePersonGroupsQueryParams extends HashMap<String, Object> {
    public NodePersonGroupsQueryParams sessionId(final String value) {
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
   * @return NodePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/node/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NodePersonsResponseData nodePersons(@Param("sessionId") String sessionId, @Param("elid") String elid, NodePersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>nodePersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/node/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NodePersonsResponseData> nodePersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NodePersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>nodePersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NodePersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NodePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/node/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NodePersonsResponseData nodePersons(@Param("elid") String elid, NodePersonsRequestData body, @QueryMap(encoded=true) NodePersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>nodePersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NodePersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/node/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NodePersonsResponseData> nodePersonsWithHttpInfo(@Param("elid") String elid, NodePersonsRequestData body, @QueryMap(encoded=true) NodePersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nodePersons</code> method in a fluent style.
   */
  public static class NodePersonsQueryParams extends HashMap<String, Object> {
    public NodePersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return NodeQueryResponse
   */
  @RequestLine("POST /api/rest/entity/node/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NodeQueryResponse nodeQuery(@Param("sessionId") String sessionId, NodeQueryRequest body);

  /**
   * Basic query
   * Similar to <code>nodeQuery</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/node/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NodeQueryResponse> nodeQueryWithHttpInfo(@Param("sessionId") String sessionId, NodeQueryRequest body);


  /**
   * Basic query
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>nodeQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NodeQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NodeQueryResponse
   */
  @RequestLine("POST /api/rest/entity/node/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NodeQueryResponse nodeQuery(NodeQueryRequest body, @QueryMap(encoded=true) NodeQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>nodeQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NodeQueryResponse
      */
      @RequestLine("POST /api/rest/entity/node/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NodeQueryResponse> nodeQueryWithHttpInfo(NodeQueryRequest body, @QueryMap(encoded=true) NodeQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nodeQuery</code> method in a fluent style.
   */
  public static class NodeQueryQueryParams extends HashMap<String, Object> {
    public NodeQueryQueryParams sessionId(final String value) {
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
   * @return NodeSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/node/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NodeSystemAttributesResponse nodeSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, NodeSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>nodeSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/node/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NodeSystemAttributesResponse> nodeSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NodeSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>nodeSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NodeSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NodeSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/node/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NodeSystemAttributesResponse nodeSystemAttributes(@Param("elid") String elid, NodeSystemAttributesRequest body, @QueryMap(encoded=true) NodeSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>nodeSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NodeSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/node/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NodeSystemAttributesResponse> nodeSystemAttributesWithHttpInfo(@Param("elid") String elid, NodeSystemAttributesRequest body, @QueryMap(encoded=true) NodeSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nodeSystemAttributes</code> method in a fluent style.
   */
  public static class NodeSystemAttributesQueryParams extends HashMap<String, Object> {
    public NodeSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Tray section entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return NodeTraySectionsResponseData
   */
  @RequestLine("POST /api/rest/entity/node/{elid}/TraySections?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NodeTraySectionsResponseData nodeTraySections(@Param("sessionId") String sessionId, @Param("elid") String elid, NodeTraySectionsRequestData body);

  /**
   * Get relations to Tray section entities
   * Similar to <code>nodeTraySections</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/node/{elid}/TraySections?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NodeTraySectionsResponseData> nodeTraySectionsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NodeTraySectionsRequestData body);


  /**
   * Get relations to Tray section entities
   * 
   * Note, this is equivalent to the other <code>nodeTraySections</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NodeTraySectionsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NodeTraySectionsResponseData
   */
  @RequestLine("POST /api/rest/entity/node/{elid}/TraySections?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NodeTraySectionsResponseData nodeTraySections(@Param("elid") String elid, NodeTraySectionsRequestData body, @QueryMap(encoded=true) NodeTraySectionsQueryParams queryParams);

  /**
  * Get relations to Tray section entities
  * 
  * Note, this is equivalent to the other <code>nodeTraySections</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NodeTraySectionsResponseData
      */
      @RequestLine("POST /api/rest/entity/node/{elid}/TraySections?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NodeTraySectionsResponseData> nodeTraySectionsWithHttpInfo(@Param("elid") String elid, NodeTraySectionsRequestData body, @QueryMap(encoded=true) NodeTraySectionsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nodeTraySections</code> method in a fluent style.
   */
  public static class NodeTraySectionsQueryParams extends HashMap<String, Object> {
    public NodeTraySectionsQueryParams sessionId(final String value) {
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
   * @return NodeZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/node/{elid}/Zone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NodeZoneResponseData nodeZone(@Param("sessionId") String sessionId, @Param("elid") String elid, NodeZoneRequestData body);

  /**
   * Get relations to Zone entities
   * Similar to <code>nodeZone</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/node/{elid}/Zone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NodeZoneResponseData> nodeZoneWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NodeZoneRequestData body);


  /**
   * Get relations to Zone entities
   * 
   * Note, this is equivalent to the other <code>nodeZone</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NodeZoneQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NodeZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/node/{elid}/Zone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NodeZoneResponseData nodeZone(@Param("elid") String elid, NodeZoneRequestData body, @QueryMap(encoded=true) NodeZoneQueryParams queryParams);

  /**
  * Get relations to Zone entities
  * 
  * Note, this is equivalent to the other <code>nodeZone</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NodeZoneResponseData
      */
      @RequestLine("POST /api/rest/entity/node/{elid}/Zone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NodeZoneResponseData> nodeZoneWithHttpInfo(@Param("elid") String elid, NodeZoneRequestData body, @QueryMap(encoded=true) NodeZoneQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nodeZone</code> method in a fluent style.
   */
  public static class NodeZoneQueryParams extends HashMap<String, Object> {
    public NodeZoneQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Node
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateNodeResponse
   */
  @RequestLine("POST /api/rest/entity/node/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateNodeResponse updateNode(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateNodeRequestData body);

  /**
   * Modify
   * Similar to <code>updateNode</code> but it also returns the http response headers .
   * Modify Node
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/node/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateNodeResponse> updateNodeWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateNodeRequestData body);


  /**
   * Modify
   * Modify Node
   * Note, this is equivalent to the other <code>updateNode</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateNodeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateNodeResponse
   */
  @RequestLine("POST /api/rest/entity/node/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateNodeResponse updateNode(@Param("elid") String elid, UpdateNodeRequestData body, @QueryMap(encoded=true) UpdateNodeQueryParams queryParams);

  /**
  * Modify
  * Modify Node
  * Note, this is equivalent to the other <code>updateNode</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateNodeResponse
      */
      @RequestLine("POST /api/rest/entity/node/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateNodeResponse> updateNodeWithHttpInfo(@Param("elid") String elid, UpdateNodeRequestData body, @QueryMap(encoded=true) UpdateNodeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateNode</code> method in a fluent style.
   */
  public static class UpdateNodeQueryParams extends HashMap<String, Object> {
    public UpdateNodeQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesNodeResponse
   */
  @RequestLine("POST /api/rest/entity/node/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesNodeResponse updateSystemAttributesNode(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesNodeRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesNode</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/node/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesNodeResponse> updateSystemAttributesNodeWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesNodeRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesNode</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesNodeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesNodeResponse
   */
  @RequestLine("POST /api/rest/entity/node/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesNodeResponse updateSystemAttributesNode(@Param("elid") String elid, UpdateSystemAttributesNodeRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesNodeQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesNode</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesNodeResponse
      */
      @RequestLine("POST /api/rest/entity/node/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesNodeResponse> updateSystemAttributesNodeWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesNodeRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesNodeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesNode</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesNodeQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesNodeQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
