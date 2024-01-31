package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateNodeTypeRequestData;
import com.fntsoftware.businessgateway.entities.CreateNodeTypeResponse;
import com.fntsoftware.businessgateway.entities.DeleteNodeTypeRequestData;
import com.fntsoftware.businessgateway.entities.DeleteNodeTypeResponse;
import com.fntsoftware.businessgateway.entities.NodeTypeContractsRequestData;
import com.fntsoftware.businessgateway.entities.NodeTypeContractsResponseData;
import com.fntsoftware.businessgateway.entities.NodeTypeDeviceMasterRequestData;
import com.fntsoftware.businessgateway.entities.NodeTypeDeviceMasterResponseData;
import com.fntsoftware.businessgateway.entities.NodeTypeFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.NodeTypeFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.NodeTypeMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.NodeTypeMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.NodeTypeNodeTypeRequest;
import com.fntsoftware.businessgateway.entities.NodeTypeNodeTypeResponse;
import com.fntsoftware.businessgateway.entities.NodeTypeNodesRequestData;
import com.fntsoftware.businessgateway.entities.NodeTypeNodesResponseData;
import com.fntsoftware.businessgateway.entities.NodeTypeOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.NodeTypeOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.NodeTypePersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.NodeTypePersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.NodeTypePersonsRequestData;
import com.fntsoftware.businessgateway.entities.NodeTypePersonsResponseData;
import com.fntsoftware.businessgateway.entities.NodeTypeQueryRequest;
import com.fntsoftware.businessgateway.entities.NodeTypeQueryResponse;
import com.fntsoftware.businessgateway.entities.NodeTypeSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.NodeTypeSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateNodeTypeRequestData;
import com.fntsoftware.businessgateway.entities.UpdateNodeTypeResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesNodeTypeRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesNodeTypeResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface NodeTypeApi extends ApiClient.Api {


  /**
   * Create
   * Create Node type
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateNodeTypeResponse
   */
  @RequestLine("POST /api/rest/entity/nodeType/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateNodeTypeResponse createNodeType(@Param("sessionId") String sessionId, CreateNodeTypeRequestData body);

  /**
   * Create
   * Similar to <code>createNodeType</code> but it also returns the http response headers .
   * Create Node type
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nodeType/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateNodeTypeResponse> createNodeTypeWithHttpInfo(@Param("sessionId") String sessionId, CreateNodeTypeRequestData body);


  /**
   * Create
   * Create Node type
   * Note, this is equivalent to the other <code>createNodeType</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateNodeTypeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateNodeTypeResponse
   */
  @RequestLine("POST /api/rest/entity/nodeType/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateNodeTypeResponse createNodeType(CreateNodeTypeRequestData body, @QueryMap(encoded=true) CreateNodeTypeQueryParams queryParams);

  /**
  * Create
  * Create Node type
  * Note, this is equivalent to the other <code>createNodeType</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateNodeTypeResponse
      */
      @RequestLine("POST /api/rest/entity/nodeType/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateNodeTypeResponse> createNodeTypeWithHttpInfo(CreateNodeTypeRequestData body, @QueryMap(encoded=true) CreateNodeTypeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createNodeType</code> method in a fluent style.
   */
  public static class CreateNodeTypeQueryParams extends HashMap<String, Object> {
    public CreateNodeTypeQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Node type
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteNodeTypeResponse
   */
  @RequestLine("POST /api/rest/entity/nodeType/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteNodeTypeResponse deleteNodeType(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteNodeTypeRequestData body);

  /**
   * Delete
   * Similar to <code>deleteNodeType</code> but it also returns the http response headers .
   * Delete Node type
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nodeType/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteNodeTypeResponse> deleteNodeTypeWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteNodeTypeRequestData body);


  /**
   * Delete
   * Delete Node type
   * Note, this is equivalent to the other <code>deleteNodeType</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteNodeTypeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteNodeTypeResponse
   */
  @RequestLine("POST /api/rest/entity/nodeType/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteNodeTypeResponse deleteNodeType(@Param("elid") String elid, DeleteNodeTypeRequestData body, @QueryMap(encoded=true) DeleteNodeTypeQueryParams queryParams);

  /**
  * Delete
  * Delete Node type
  * Note, this is equivalent to the other <code>deleteNodeType</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteNodeTypeResponse
      */
      @RequestLine("POST /api/rest/entity/nodeType/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteNodeTypeResponse> deleteNodeTypeWithHttpInfo(@Param("elid") String elid, DeleteNodeTypeRequestData body, @QueryMap(encoded=true) DeleteNodeTypeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteNodeType</code> method in a fluent style.
   */
  public static class DeleteNodeTypeQueryParams extends HashMap<String, Object> {
    public DeleteNodeTypeQueryParams sessionId(final String value) {
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
   * @return NodeTypeContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/nodeType/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NodeTypeContractsResponseData nodeTypeContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, NodeTypeContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>nodeTypeContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nodeType/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NodeTypeContractsResponseData> nodeTypeContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NodeTypeContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>nodeTypeContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NodeTypeContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NodeTypeContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/nodeType/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NodeTypeContractsResponseData nodeTypeContracts(@Param("elid") String elid, NodeTypeContractsRequestData body, @QueryMap(encoded=true) NodeTypeContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>nodeTypeContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NodeTypeContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/nodeType/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NodeTypeContractsResponseData> nodeTypeContractsWithHttpInfo(@Param("elid") String elid, NodeTypeContractsRequestData body, @QueryMap(encoded=true) NodeTypeContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nodeTypeContracts</code> method in a fluent style.
   */
  public static class NodeTypeContractsQueryParams extends HashMap<String, Object> {
    public NodeTypeContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Device master entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return NodeTypeDeviceMasterResponseData
   */
  @RequestLine("POST /api/rest/entity/nodeType/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NodeTypeDeviceMasterResponseData nodeTypeDeviceMaster(@Param("sessionId") String sessionId, @Param("elid") String elid, NodeTypeDeviceMasterRequestData body);

  /**
   * Get relations to Device master entities
   * Similar to <code>nodeTypeDeviceMaster</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nodeType/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NodeTypeDeviceMasterResponseData> nodeTypeDeviceMasterWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NodeTypeDeviceMasterRequestData body);


  /**
   * Get relations to Device master entities
   * 
   * Note, this is equivalent to the other <code>nodeTypeDeviceMaster</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NodeTypeDeviceMasterQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NodeTypeDeviceMasterResponseData
   */
  @RequestLine("POST /api/rest/entity/nodeType/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NodeTypeDeviceMasterResponseData nodeTypeDeviceMaster(@Param("elid") String elid, NodeTypeDeviceMasterRequestData body, @QueryMap(encoded=true) NodeTypeDeviceMasterQueryParams queryParams);

  /**
  * Get relations to Device master entities
  * 
  * Note, this is equivalent to the other <code>nodeTypeDeviceMaster</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NodeTypeDeviceMasterResponseData
      */
      @RequestLine("POST /api/rest/entity/nodeType/{elid}/DeviceMaster?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NodeTypeDeviceMasterResponseData> nodeTypeDeviceMasterWithHttpInfo(@Param("elid") String elid, NodeTypeDeviceMasterRequestData body, @QueryMap(encoded=true) NodeTypeDeviceMasterQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nodeTypeDeviceMaster</code> method in a fluent style.
   */
  public static class NodeTypeDeviceMasterQueryParams extends HashMap<String, Object> {
    public NodeTypeDeviceMasterQueryParams sessionId(final String value) {
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
   * @return NodeTypeFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/nodeType/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NodeTypeFrameContractsResponseData nodeTypeFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, NodeTypeFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>nodeTypeFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nodeType/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NodeTypeFrameContractsResponseData> nodeTypeFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NodeTypeFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>nodeTypeFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NodeTypeFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NodeTypeFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/nodeType/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NodeTypeFrameContractsResponseData nodeTypeFrameContracts(@Param("elid") String elid, NodeTypeFrameContractsRequestData body, @QueryMap(encoded=true) NodeTypeFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>nodeTypeFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NodeTypeFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/nodeType/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NodeTypeFrameContractsResponseData> nodeTypeFrameContractsWithHttpInfo(@Param("elid") String elid, NodeTypeFrameContractsRequestData body, @QueryMap(encoded=true) NodeTypeFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nodeTypeFrameContracts</code> method in a fluent style.
   */
  public static class NodeTypeFrameContractsQueryParams extends HashMap<String, Object> {
    public NodeTypeFrameContractsQueryParams sessionId(final String value) {
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
   * @return NodeTypeMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/nodeType/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NodeTypeMaintenanceContractsResponseData nodeTypeMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, NodeTypeMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>nodeTypeMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nodeType/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NodeTypeMaintenanceContractsResponseData> nodeTypeMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NodeTypeMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>nodeTypeMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NodeTypeMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NodeTypeMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/nodeType/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NodeTypeMaintenanceContractsResponseData nodeTypeMaintenanceContracts(@Param("elid") String elid, NodeTypeMaintenanceContractsRequestData body, @QueryMap(encoded=true) NodeTypeMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>nodeTypeMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NodeTypeMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/nodeType/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NodeTypeMaintenanceContractsResponseData> nodeTypeMaintenanceContractsWithHttpInfo(@Param("elid") String elid, NodeTypeMaintenanceContractsRequestData body, @QueryMap(encoded=true) NodeTypeMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nodeTypeMaintenanceContracts</code> method in a fluent style.
   */
  public static class NodeTypeMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public NodeTypeMaintenanceContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query Node type
   * Query of the Node type
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return NodeTypeNodeTypeResponse
   */
  @RequestLine("POST /api/rest/entity/nodeType/{elid}?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NodeTypeNodeTypeResponse nodeTypeNodeType(@Param("sessionId") String sessionId, @Param("elid") String elid, NodeTypeNodeTypeRequest body);

  /**
   * Query Node type
   * Similar to <code>nodeTypeNodeType</code> but it also returns the http response headers .
   * Query of the Node type
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nodeType/{elid}?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NodeTypeNodeTypeResponse> nodeTypeNodeTypeWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NodeTypeNodeTypeRequest body);


  /**
   * Query Node type
   * Query of the Node type
   * Note, this is equivalent to the other <code>nodeTypeNodeType</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NodeTypeNodeTypeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NodeTypeNodeTypeResponse
   */
  @RequestLine("POST /api/rest/entity/nodeType/{elid}?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NodeTypeNodeTypeResponse nodeTypeNodeType(@Param("elid") String elid, NodeTypeNodeTypeRequest body, @QueryMap(encoded=true) NodeTypeNodeTypeQueryParams queryParams);

  /**
  * Query Node type
  * Query of the Node type
  * Note, this is equivalent to the other <code>nodeTypeNodeType</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NodeTypeNodeTypeResponse
      */
      @RequestLine("POST /api/rest/entity/nodeType/{elid}?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NodeTypeNodeTypeResponse> nodeTypeNodeTypeWithHttpInfo(@Param("elid") String elid, NodeTypeNodeTypeRequest body, @QueryMap(encoded=true) NodeTypeNodeTypeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nodeTypeNodeType</code> method in a fluent style.
   */
  public static class NodeTypeNodeTypeQueryParams extends HashMap<String, Object> {
    public NodeTypeNodeTypeQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Node entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return NodeTypeNodesResponseData
   */
  @RequestLine("POST /api/rest/entity/nodeType/{elid}/Nodes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NodeTypeNodesResponseData nodeTypeNodes(@Param("sessionId") String sessionId, @Param("elid") String elid, NodeTypeNodesRequestData body);

  /**
   * Get relations to Node entities
   * Similar to <code>nodeTypeNodes</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nodeType/{elid}/Nodes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NodeTypeNodesResponseData> nodeTypeNodesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NodeTypeNodesRequestData body);


  /**
   * Get relations to Node entities
   * 
   * Note, this is equivalent to the other <code>nodeTypeNodes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NodeTypeNodesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NodeTypeNodesResponseData
   */
  @RequestLine("POST /api/rest/entity/nodeType/{elid}/Nodes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NodeTypeNodesResponseData nodeTypeNodes(@Param("elid") String elid, NodeTypeNodesRequestData body, @QueryMap(encoded=true) NodeTypeNodesQueryParams queryParams);

  /**
  * Get relations to Node entities
  * 
  * Note, this is equivalent to the other <code>nodeTypeNodes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NodeTypeNodesResponseData
      */
      @RequestLine("POST /api/rest/entity/nodeType/{elid}/Nodes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NodeTypeNodesResponseData> nodeTypeNodesWithHttpInfo(@Param("elid") String elid, NodeTypeNodesRequestData body, @QueryMap(encoded=true) NodeTypeNodesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nodeTypeNodes</code> method in a fluent style.
   */
  public static class NodeTypeNodesQueryParams extends HashMap<String, Object> {
    public NodeTypeNodesQueryParams sessionId(final String value) {
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
   * @return NodeTypeOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/nodeType/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NodeTypeOrganizationsResponseData nodeTypeOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, NodeTypeOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>nodeTypeOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nodeType/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NodeTypeOrganizationsResponseData> nodeTypeOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NodeTypeOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>nodeTypeOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NodeTypeOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NodeTypeOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/nodeType/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NodeTypeOrganizationsResponseData nodeTypeOrganizations(@Param("elid") String elid, NodeTypeOrganizationsRequestData body, @QueryMap(encoded=true) NodeTypeOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>nodeTypeOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NodeTypeOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/nodeType/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NodeTypeOrganizationsResponseData> nodeTypeOrganizationsWithHttpInfo(@Param("elid") String elid, NodeTypeOrganizationsRequestData body, @QueryMap(encoded=true) NodeTypeOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nodeTypeOrganizations</code> method in a fluent style.
   */
  public static class NodeTypeOrganizationsQueryParams extends HashMap<String, Object> {
    public NodeTypeOrganizationsQueryParams sessionId(final String value) {
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
   * @return NodeTypePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/nodeType/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NodeTypePersonGroupsResponseData nodeTypePersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, NodeTypePersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>nodeTypePersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nodeType/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NodeTypePersonGroupsResponseData> nodeTypePersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NodeTypePersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>nodeTypePersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NodeTypePersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NodeTypePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/nodeType/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NodeTypePersonGroupsResponseData nodeTypePersonGroups(@Param("elid") String elid, NodeTypePersonGroupsRequestData body, @QueryMap(encoded=true) NodeTypePersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>nodeTypePersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NodeTypePersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/nodeType/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NodeTypePersonGroupsResponseData> nodeTypePersonGroupsWithHttpInfo(@Param("elid") String elid, NodeTypePersonGroupsRequestData body, @QueryMap(encoded=true) NodeTypePersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nodeTypePersonGroups</code> method in a fluent style.
   */
  public static class NodeTypePersonGroupsQueryParams extends HashMap<String, Object> {
    public NodeTypePersonGroupsQueryParams sessionId(final String value) {
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
   * @return NodeTypePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/nodeType/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NodeTypePersonsResponseData nodeTypePersons(@Param("sessionId") String sessionId, @Param("elid") String elid, NodeTypePersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>nodeTypePersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nodeType/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NodeTypePersonsResponseData> nodeTypePersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NodeTypePersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>nodeTypePersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NodeTypePersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NodeTypePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/nodeType/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NodeTypePersonsResponseData nodeTypePersons(@Param("elid") String elid, NodeTypePersonsRequestData body, @QueryMap(encoded=true) NodeTypePersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>nodeTypePersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NodeTypePersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/nodeType/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NodeTypePersonsResponseData> nodeTypePersonsWithHttpInfo(@Param("elid") String elid, NodeTypePersonsRequestData body, @QueryMap(encoded=true) NodeTypePersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nodeTypePersons</code> method in a fluent style.
   */
  public static class NodeTypePersonsQueryParams extends HashMap<String, Object> {
    public NodeTypePersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return NodeTypeQueryResponse
   */
  @RequestLine("POST /api/rest/entity/nodeType/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NodeTypeQueryResponse nodeTypeQuery(@Param("sessionId") String sessionId, NodeTypeQueryRequest body);

  /**
   * Basic query
   * Similar to <code>nodeTypeQuery</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nodeType/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NodeTypeQueryResponse> nodeTypeQueryWithHttpInfo(@Param("sessionId") String sessionId, NodeTypeQueryRequest body);


  /**
   * Basic query
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>nodeTypeQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NodeTypeQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NodeTypeQueryResponse
   */
  @RequestLine("POST /api/rest/entity/nodeType/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NodeTypeQueryResponse nodeTypeQuery(NodeTypeQueryRequest body, @QueryMap(encoded=true) NodeTypeQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>nodeTypeQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NodeTypeQueryResponse
      */
      @RequestLine("POST /api/rest/entity/nodeType/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NodeTypeQueryResponse> nodeTypeQueryWithHttpInfo(NodeTypeQueryRequest body, @QueryMap(encoded=true) NodeTypeQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nodeTypeQuery</code> method in a fluent style.
   */
  public static class NodeTypeQueryQueryParams extends HashMap<String, Object> {
    public NodeTypeQueryQueryParams sessionId(final String value) {
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
   * @return NodeTypeSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/nodeType/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NodeTypeSystemAttributesResponse nodeTypeSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, NodeTypeSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>nodeTypeSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nodeType/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NodeTypeSystemAttributesResponse> nodeTypeSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NodeTypeSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>nodeTypeSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NodeTypeSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NodeTypeSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/nodeType/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NodeTypeSystemAttributesResponse nodeTypeSystemAttributes(@Param("elid") String elid, NodeTypeSystemAttributesRequest body, @QueryMap(encoded=true) NodeTypeSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>nodeTypeSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NodeTypeSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/nodeType/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NodeTypeSystemAttributesResponse> nodeTypeSystemAttributesWithHttpInfo(@Param("elid") String elid, NodeTypeSystemAttributesRequest body, @QueryMap(encoded=true) NodeTypeSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nodeTypeSystemAttributes</code> method in a fluent style.
   */
  public static class NodeTypeSystemAttributesQueryParams extends HashMap<String, Object> {
    public NodeTypeSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Node type
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateNodeTypeResponse
   */
  @RequestLine("POST /api/rest/entity/nodeType/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateNodeTypeResponse updateNodeType(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateNodeTypeRequestData body);

  /**
   * Modify
   * Similar to <code>updateNodeType</code> but it also returns the http response headers .
   * Modify Node type
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nodeType/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateNodeTypeResponse> updateNodeTypeWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateNodeTypeRequestData body);


  /**
   * Modify
   * Modify Node type
   * Note, this is equivalent to the other <code>updateNodeType</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateNodeTypeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateNodeTypeResponse
   */
  @RequestLine("POST /api/rest/entity/nodeType/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateNodeTypeResponse updateNodeType(@Param("elid") String elid, UpdateNodeTypeRequestData body, @QueryMap(encoded=true) UpdateNodeTypeQueryParams queryParams);

  /**
  * Modify
  * Modify Node type
  * Note, this is equivalent to the other <code>updateNodeType</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateNodeTypeResponse
      */
      @RequestLine("POST /api/rest/entity/nodeType/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateNodeTypeResponse> updateNodeTypeWithHttpInfo(@Param("elid") String elid, UpdateNodeTypeRequestData body, @QueryMap(encoded=true) UpdateNodeTypeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateNodeType</code> method in a fluent style.
   */
  public static class UpdateNodeTypeQueryParams extends HashMap<String, Object> {
    public UpdateNodeTypeQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesNodeTypeResponse
   */
  @RequestLine("POST /api/rest/entity/nodeType/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesNodeTypeResponse updateSystemAttributesNodeType(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesNodeTypeRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesNodeType</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nodeType/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesNodeTypeResponse> updateSystemAttributesNodeTypeWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesNodeTypeRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesNodeType</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesNodeTypeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesNodeTypeResponse
   */
  @RequestLine("POST /api/rest/entity/nodeType/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesNodeTypeResponse updateSystemAttributesNodeType(@Param("elid") String elid, UpdateSystemAttributesNodeTypeRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesNodeTypeQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesNodeType</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesNodeTypeResponse
      */
      @RequestLine("POST /api/rest/entity/nodeType/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesNodeTypeResponse> updateSystemAttributesNodeTypeWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesNodeTypeRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesNodeTypeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesNodeType</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesNodeTypeQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesNodeTypeQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
