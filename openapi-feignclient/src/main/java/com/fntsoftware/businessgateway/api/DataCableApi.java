package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.BlockFiberDataCableRequestData;
import com.fntsoftware.businessgateway.entities.BlockFiberDataCableResponse;
import com.fntsoftware.businessgateway.entities.ChangeCableTypeDataCableRequestData;
import com.fntsoftware.businessgateway.entities.ChangeCableTypeDataCableResponse;
import com.fntsoftware.businessgateway.entities.ConnectDataCableRequestData;
import com.fntsoftware.businessgateway.entities.ConnectDataCableResponse;
import com.fntsoftware.businessgateway.entities.DataCableCableMasterDataCableRequestData;
import com.fntsoftware.businessgateway.entities.DataCableCableMasterDataCableResponseData;
import com.fntsoftware.businessgateway.entities.DataCableConnectionsRequestData;
import com.fntsoftware.businessgateway.entities.DataCableConnectionsResponseData;
import com.fntsoftware.businessgateway.entities.DataCableContractsRequestData;
import com.fntsoftware.businessgateway.entities.DataCableContractsResponseData;
import com.fntsoftware.businessgateway.entities.DataCableCustomServicesTelcoRequestData;
import com.fntsoftware.businessgateway.entities.DataCableCustomServicesTelcoResponseData;
import com.fntsoftware.businessgateway.entities.DataCableCustomTcoInterconnectRequestData;
import com.fntsoftware.businessgateway.entities.DataCableCustomTcoInterconnectResponseData;
import com.fntsoftware.businessgateway.entities.DataCableEndPortRequest;
import com.fntsoftware.businessgateway.entities.DataCableEndPortResponse;
import com.fntsoftware.businessgateway.entities.DataCableFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.DataCableFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.DataCableMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.DataCableMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.DataCableOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.DataCableOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.DataCablePersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.DataCablePersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.DataCablePersonsRequestData;
import com.fntsoftware.businessgateway.entities.DataCablePersonsResponseData;
import com.fntsoftware.businessgateway.entities.DataCablePhysicalPortsDataRequestData;
import com.fntsoftware.businessgateway.entities.DataCablePhysicalPortsDataResponseData;
import com.fntsoftware.businessgateway.entities.DataCableQueryRequest;
import com.fntsoftware.businessgateway.entities.DataCableQueryResponse;
import com.fntsoftware.businessgateway.entities.DataCableStartPortRequest;
import com.fntsoftware.businessgateway.entities.DataCableStartPortResponse;
import com.fntsoftware.businessgateway.entities.DataCableSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.DataCableSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.DeleteDataCableRequestData;
import com.fntsoftware.businessgateway.entities.DeleteDataCableResponse;
import com.fntsoftware.businessgateway.entities.ModifyConnectDataCableRequestData;
import com.fntsoftware.businessgateway.entities.ModifyConnectDataCableResponse;
import com.fntsoftware.businessgateway.entities.PatchDataCableRequestData;
import com.fntsoftware.businessgateway.entities.PatchDataCableResponse;
import com.fntsoftware.businessgateway.entities.ReserveFiberDataCableRequestData;
import com.fntsoftware.businessgateway.entities.ReserveFiberDataCableResponse;
import com.fntsoftware.businessgateway.entities.UnblockFiberDataCableRequestData;
import com.fntsoftware.businessgateway.entities.UnblockFiberDataCableResponse;
import com.fntsoftware.businessgateway.entities.UpdateDataCableRequestData;
import com.fntsoftware.businessgateway.entities.UpdateDataCableResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesDataCableRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesDataCableResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface DataCableApi extends ApiClient.Api {


  /**
   * Lock fiber
   * Lock fiber
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return BlockFiberDataCableResponse
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/blockFiber?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BlockFiberDataCableResponse blockFiberDataCable(@Param("sessionId") String sessionId, @Param("elid") String elid, BlockFiberDataCableRequestData body);

  /**
   * Lock fiber
   * Similar to <code>blockFiberDataCable</code> but it also returns the http response headers .
   * Lock fiber
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/blockFiber?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BlockFiberDataCableResponse> blockFiberDataCableWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, BlockFiberDataCableRequestData body);


  /**
   * Lock fiber
   * Lock fiber
   * Note, this is equivalent to the other <code>blockFiberDataCable</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BlockFiberDataCableQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return BlockFiberDataCableResponse
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/blockFiber?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  BlockFiberDataCableResponse blockFiberDataCable(@Param("elid") String elid, BlockFiberDataCableRequestData body, @QueryMap(encoded=true) BlockFiberDataCableQueryParams queryParams);

  /**
  * Lock fiber
  * Lock fiber
  * Note, this is equivalent to the other <code>blockFiberDataCable</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return BlockFiberDataCableResponse
      */
      @RequestLine("POST /api/rest/entity/dataCable/{elid}/blockFiber?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<BlockFiberDataCableResponse> blockFiberDataCableWithHttpInfo(@Param("elid") String elid, BlockFiberDataCableRequestData body, @QueryMap(encoded=true) BlockFiberDataCableQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>blockFiberDataCable</code> method in a fluent style.
   */
  public static class BlockFiberDataCableQueryParams extends HashMap<String, Object> {
    public BlockFiberDataCableQueryParams sessionId(final String value) {
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
   * @return ChangeCableTypeDataCableResponse
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/changeCableType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeCableTypeDataCableResponse changeCableTypeDataCable(@Param("sessionId") String sessionId, @Param("elid") String elid, ChangeCableTypeDataCableRequestData body);

  /**
   * Modify cable type
   * Similar to <code>changeCableTypeDataCable</code> but it also returns the http response headers .
   * Modify cable type
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/changeCableType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeCableTypeDataCableResponse> changeCableTypeDataCableWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChangeCableTypeDataCableRequestData body);


  /**
   * Modify cable type
   * Modify cable type
   * Note, this is equivalent to the other <code>changeCableTypeDataCable</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChangeCableTypeDataCableQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChangeCableTypeDataCableResponse
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/changeCableType?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChangeCableTypeDataCableResponse changeCableTypeDataCable(@Param("elid") String elid, ChangeCableTypeDataCableRequestData body, @QueryMap(encoded=true) ChangeCableTypeDataCableQueryParams queryParams);

  /**
  * Modify cable type
  * Modify cable type
  * Note, this is equivalent to the other <code>changeCableTypeDataCable</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChangeCableTypeDataCableResponse
      */
      @RequestLine("POST /api/rest/entity/dataCable/{elid}/changeCableType?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChangeCableTypeDataCableResponse> changeCableTypeDataCableWithHttpInfo(@Param("elid") String elid, ChangeCableTypeDataCableRequestData body, @QueryMap(encoded=true) ChangeCableTypeDataCableQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>changeCableTypeDataCable</code> method in a fluent style.
   */
  public static class ChangeCableTypeDataCableQueryParams extends HashMap<String, Object> {
    public ChangeCableTypeDataCableQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Connect cable
   * Connect cable
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ConnectDataCableResponse
   */
  @RequestLine("POST /api/rest/entity/dataCable/connect?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ConnectDataCableResponse connectDataCable(@Param("sessionId") String sessionId, ConnectDataCableRequestData body);

  /**
   * Connect cable
   * Similar to <code>connectDataCable</code> but it also returns the http response headers .
   * Connect cable
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataCable/connect?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ConnectDataCableResponse> connectDataCableWithHttpInfo(@Param("sessionId") String sessionId, ConnectDataCableRequestData body);


  /**
   * Connect cable
   * Connect cable
   * Note, this is equivalent to the other <code>connectDataCable</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ConnectDataCableQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ConnectDataCableResponse
   */
  @RequestLine("POST /api/rest/entity/dataCable/connect?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ConnectDataCableResponse connectDataCable(ConnectDataCableRequestData body, @QueryMap(encoded=true) ConnectDataCableQueryParams queryParams);

  /**
  * Connect cable
  * Connect cable
  * Note, this is equivalent to the other <code>connectDataCable</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ConnectDataCableResponse
      */
      @RequestLine("POST /api/rest/entity/dataCable/connect?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ConnectDataCableResponse> connectDataCableWithHttpInfo(ConnectDataCableRequestData body, @QueryMap(encoded=true) ConnectDataCableQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>connectDataCable</code> method in a fluent style.
   */
  public static class ConnectDataCableQueryParams extends HashMap<String, Object> {
    public ConnectDataCableQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Cable master Data cable entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DataCableCableMasterDataCableResponseData
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/CableMasterDataCable?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DataCableCableMasterDataCableResponseData dataCableCableMasterDataCable(@Param("sessionId") String sessionId, @Param("elid") String elid, DataCableCableMasterDataCableRequestData body);

  /**
   * Get relations to Cable master Data cable entities
   * Similar to <code>dataCableCableMasterDataCable</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/CableMasterDataCable?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DataCableCableMasterDataCableResponseData> dataCableCableMasterDataCableWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DataCableCableMasterDataCableRequestData body);


  /**
   * Get relations to Cable master Data cable entities
   * 
   * Note, this is equivalent to the other <code>dataCableCableMasterDataCable</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DataCableCableMasterDataCableQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DataCableCableMasterDataCableResponseData
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/CableMasterDataCable?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DataCableCableMasterDataCableResponseData dataCableCableMasterDataCable(@Param("elid") String elid, DataCableCableMasterDataCableRequestData body, @QueryMap(encoded=true) DataCableCableMasterDataCableQueryParams queryParams);

  /**
  * Get relations to Cable master Data cable entities
  * 
  * Note, this is equivalent to the other <code>dataCableCableMasterDataCable</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DataCableCableMasterDataCableResponseData
      */
      @RequestLine("POST /api/rest/entity/dataCable/{elid}/CableMasterDataCable?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DataCableCableMasterDataCableResponseData> dataCableCableMasterDataCableWithHttpInfo(@Param("elid") String elid, DataCableCableMasterDataCableRequestData body, @QueryMap(encoded=true) DataCableCableMasterDataCableQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>dataCableCableMasterDataCable</code> method in a fluent style.
   */
  public static class DataCableCableMasterDataCableQueryParams extends HashMap<String, Object> {
    public DataCableCableMasterDataCableQueryParams sessionId(final String value) {
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
   * @return DataCableConnectionsResponseData
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/Connections?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DataCableConnectionsResponseData dataCableConnections(@Param("sessionId") String sessionId, @Param("elid") String elid, DataCableConnectionsRequestData body);

  /**
   * Get relations to Connections entities
   * Similar to <code>dataCableConnections</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/Connections?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DataCableConnectionsResponseData> dataCableConnectionsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DataCableConnectionsRequestData body);


  /**
   * Get relations to Connections entities
   * 
   * Note, this is equivalent to the other <code>dataCableConnections</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DataCableConnectionsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DataCableConnectionsResponseData
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/Connections?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DataCableConnectionsResponseData dataCableConnections(@Param("elid") String elid, DataCableConnectionsRequestData body, @QueryMap(encoded=true) DataCableConnectionsQueryParams queryParams);

  /**
  * Get relations to Connections entities
  * 
  * Note, this is equivalent to the other <code>dataCableConnections</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DataCableConnectionsResponseData
      */
      @RequestLine("POST /api/rest/entity/dataCable/{elid}/Connections?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DataCableConnectionsResponseData> dataCableConnectionsWithHttpInfo(@Param("elid") String elid, DataCableConnectionsRequestData body, @QueryMap(encoded=true) DataCableConnectionsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>dataCableConnections</code> method in a fluent style.
   */
  public static class DataCableConnectionsQueryParams extends HashMap<String, Object> {
    public DataCableConnectionsQueryParams sessionId(final String value) {
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
   * @return DataCableContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DataCableContractsResponseData dataCableContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, DataCableContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>dataCableContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DataCableContractsResponseData> dataCableContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DataCableContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>dataCableContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DataCableContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DataCableContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DataCableContractsResponseData dataCableContracts(@Param("elid") String elid, DataCableContractsRequestData body, @QueryMap(encoded=true) DataCableContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>dataCableContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DataCableContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/dataCable/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DataCableContractsResponseData> dataCableContractsWithHttpInfo(@Param("elid") String elid, DataCableContractsRequestData body, @QueryMap(encoded=true) DataCableContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>dataCableContracts</code> method in a fluent style.
   */
  public static class DataCableContractsQueryParams extends HashMap<String, Object> {
    public DataCableContractsQueryParams sessionId(final String value) {
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
   * @return DataCableCustomServicesTelcoResponseData
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/CustomServicesTelco?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DataCableCustomServicesTelcoResponseData dataCableCustomServicesTelco(@Param("sessionId") String sessionId, @Param("elid") String elid, DataCableCustomServicesTelcoRequestData body);

  /**
   * Get relations to Service (Telco) entities
   * Similar to <code>dataCableCustomServicesTelco</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/CustomServicesTelco?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DataCableCustomServicesTelcoResponseData> dataCableCustomServicesTelcoWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DataCableCustomServicesTelcoRequestData body);


  /**
   * Get relations to Service (Telco) entities
   * 
   * Note, this is equivalent to the other <code>dataCableCustomServicesTelco</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DataCableCustomServicesTelcoQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DataCableCustomServicesTelcoResponseData
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/CustomServicesTelco?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DataCableCustomServicesTelcoResponseData dataCableCustomServicesTelco(@Param("elid") String elid, DataCableCustomServicesTelcoRequestData body, @QueryMap(encoded=true) DataCableCustomServicesTelcoQueryParams queryParams);

  /**
  * Get relations to Service (Telco) entities
  * 
  * Note, this is equivalent to the other <code>dataCableCustomServicesTelco</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DataCableCustomServicesTelcoResponseData
      */
      @RequestLine("POST /api/rest/entity/dataCable/{elid}/CustomServicesTelco?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DataCableCustomServicesTelcoResponseData> dataCableCustomServicesTelcoWithHttpInfo(@Param("elid") String elid, DataCableCustomServicesTelcoRequestData body, @QueryMap(encoded=true) DataCableCustomServicesTelcoQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>dataCableCustomServicesTelco</code> method in a fluent style.
   */
  public static class DataCableCustomServicesTelcoQueryParams extends HashMap<String, Object> {
    public DataCableCustomServicesTelcoQueryParams sessionId(final String value) {
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
   * @return DataCableCustomTcoInterconnectResponseData
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/CustomTcoInterconnect?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DataCableCustomTcoInterconnectResponseData dataCableCustomTcoInterconnect(@Param("sessionId") String sessionId, @Param("elid") String elid, DataCableCustomTcoInterconnectRequestData body);

  /**
   * Get relations to Telco-Interconnect entities
   * Similar to <code>dataCableCustomTcoInterconnect</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/CustomTcoInterconnect?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DataCableCustomTcoInterconnectResponseData> dataCableCustomTcoInterconnectWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DataCableCustomTcoInterconnectRequestData body);


  /**
   * Get relations to Telco-Interconnect entities
   * 
   * Note, this is equivalent to the other <code>dataCableCustomTcoInterconnect</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DataCableCustomTcoInterconnectQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DataCableCustomTcoInterconnectResponseData
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/CustomTcoInterconnect?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DataCableCustomTcoInterconnectResponseData dataCableCustomTcoInterconnect(@Param("elid") String elid, DataCableCustomTcoInterconnectRequestData body, @QueryMap(encoded=true) DataCableCustomTcoInterconnectQueryParams queryParams);

  /**
  * Get relations to Telco-Interconnect entities
  * 
  * Note, this is equivalent to the other <code>dataCableCustomTcoInterconnect</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DataCableCustomTcoInterconnectResponseData
      */
      @RequestLine("POST /api/rest/entity/dataCable/{elid}/CustomTcoInterconnect?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DataCableCustomTcoInterconnectResponseData> dataCableCustomTcoInterconnectWithHttpInfo(@Param("elid") String elid, DataCableCustomTcoInterconnectRequestData body, @QueryMap(encoded=true) DataCableCustomTcoInterconnectQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>dataCableCustomTcoInterconnect</code> method in a fluent style.
   */
  public static class DataCableCustomTcoInterconnectQueryParams extends HashMap<String, Object> {
    public DataCableCustomTcoInterconnectQueryParams sessionId(final String value) {
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
   * @return DataCableEndPortResponse
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/EndPort?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DataCableEndPortResponse dataCableEndPort(@Param("sessionId") String sessionId, @Param("elid") String elid, DataCableEndPortRequest body);

  /**
   * Query End port
   * Similar to <code>dataCableEndPort</code> but it also returns the http response headers .
   * Queries the end port
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/EndPort?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DataCableEndPortResponse> dataCableEndPortWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DataCableEndPortRequest body);


  /**
   * Query End port
   * Queries the end port
   * Note, this is equivalent to the other <code>dataCableEndPort</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DataCableEndPortQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DataCableEndPortResponse
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/EndPort?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DataCableEndPortResponse dataCableEndPort(@Param("elid") String elid, DataCableEndPortRequest body, @QueryMap(encoded=true) DataCableEndPortQueryParams queryParams);

  /**
  * Query End port
  * Queries the end port
  * Note, this is equivalent to the other <code>dataCableEndPort</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DataCableEndPortResponse
      */
      @RequestLine("POST /api/rest/entity/dataCable/{elid}/EndPort?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DataCableEndPortResponse> dataCableEndPortWithHttpInfo(@Param("elid") String elid, DataCableEndPortRequest body, @QueryMap(encoded=true) DataCableEndPortQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>dataCableEndPort</code> method in a fluent style.
   */
  public static class DataCableEndPortQueryParams extends HashMap<String, Object> {
    public DataCableEndPortQueryParams sessionId(final String value) {
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
   * @return DataCableFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DataCableFrameContractsResponseData dataCableFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, DataCableFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>dataCableFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DataCableFrameContractsResponseData> dataCableFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DataCableFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>dataCableFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DataCableFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DataCableFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DataCableFrameContractsResponseData dataCableFrameContracts(@Param("elid") String elid, DataCableFrameContractsRequestData body, @QueryMap(encoded=true) DataCableFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>dataCableFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DataCableFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/dataCable/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DataCableFrameContractsResponseData> dataCableFrameContractsWithHttpInfo(@Param("elid") String elid, DataCableFrameContractsRequestData body, @QueryMap(encoded=true) DataCableFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>dataCableFrameContracts</code> method in a fluent style.
   */
  public static class DataCableFrameContractsQueryParams extends HashMap<String, Object> {
    public DataCableFrameContractsQueryParams sessionId(final String value) {
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
   * @return DataCableMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DataCableMaintenanceContractsResponseData dataCableMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, DataCableMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>dataCableMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DataCableMaintenanceContractsResponseData> dataCableMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DataCableMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>dataCableMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DataCableMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DataCableMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DataCableMaintenanceContractsResponseData dataCableMaintenanceContracts(@Param("elid") String elid, DataCableMaintenanceContractsRequestData body, @QueryMap(encoded=true) DataCableMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>dataCableMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DataCableMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/dataCable/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DataCableMaintenanceContractsResponseData> dataCableMaintenanceContractsWithHttpInfo(@Param("elid") String elid, DataCableMaintenanceContractsRequestData body, @QueryMap(encoded=true) DataCableMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>dataCableMaintenanceContracts</code> method in a fluent style.
   */
  public static class DataCableMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public DataCableMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return DataCableOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DataCableOrganizationsResponseData dataCableOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, DataCableOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>dataCableOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DataCableOrganizationsResponseData> dataCableOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DataCableOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>dataCableOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DataCableOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DataCableOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DataCableOrganizationsResponseData dataCableOrganizations(@Param("elid") String elid, DataCableOrganizationsRequestData body, @QueryMap(encoded=true) DataCableOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>dataCableOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DataCableOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/dataCable/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DataCableOrganizationsResponseData> dataCableOrganizationsWithHttpInfo(@Param("elid") String elid, DataCableOrganizationsRequestData body, @QueryMap(encoded=true) DataCableOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>dataCableOrganizations</code> method in a fluent style.
   */
  public static class DataCableOrganizationsQueryParams extends HashMap<String, Object> {
    public DataCableOrganizationsQueryParams sessionId(final String value) {
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
   * @return DataCablePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DataCablePersonGroupsResponseData dataCablePersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, DataCablePersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>dataCablePersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DataCablePersonGroupsResponseData> dataCablePersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DataCablePersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>dataCablePersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DataCablePersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DataCablePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DataCablePersonGroupsResponseData dataCablePersonGroups(@Param("elid") String elid, DataCablePersonGroupsRequestData body, @QueryMap(encoded=true) DataCablePersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>dataCablePersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DataCablePersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/dataCable/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DataCablePersonGroupsResponseData> dataCablePersonGroupsWithHttpInfo(@Param("elid") String elid, DataCablePersonGroupsRequestData body, @QueryMap(encoded=true) DataCablePersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>dataCablePersonGroups</code> method in a fluent style.
   */
  public static class DataCablePersonGroupsQueryParams extends HashMap<String, Object> {
    public DataCablePersonGroupsQueryParams sessionId(final String value) {
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
   * @return DataCablePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DataCablePersonsResponseData dataCablePersons(@Param("sessionId") String sessionId, @Param("elid") String elid, DataCablePersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>dataCablePersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DataCablePersonsResponseData> dataCablePersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DataCablePersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>dataCablePersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DataCablePersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DataCablePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DataCablePersonsResponseData dataCablePersons(@Param("elid") String elid, DataCablePersonsRequestData body, @QueryMap(encoded=true) DataCablePersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>dataCablePersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DataCablePersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/dataCable/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DataCablePersonsResponseData> dataCablePersonsWithHttpInfo(@Param("elid") String elid, DataCablePersonsRequestData body, @QueryMap(encoded=true) DataCablePersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>dataCablePersons</code> method in a fluent style.
   */
  public static class DataCablePersonsQueryParams extends HashMap<String, Object> {
    public DataCablePersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Physical port (data) entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DataCablePhysicalPortsDataResponseData
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DataCablePhysicalPortsDataResponseData dataCablePhysicalPortsData(@Param("sessionId") String sessionId, @Param("elid") String elid, DataCablePhysicalPortsDataRequestData body);

  /**
   * Get relations to Physical port (data) entities
   * Similar to <code>dataCablePhysicalPortsData</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DataCablePhysicalPortsDataResponseData> dataCablePhysicalPortsDataWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DataCablePhysicalPortsDataRequestData body);


  /**
   * Get relations to Physical port (data) entities
   * 
   * Note, this is equivalent to the other <code>dataCablePhysicalPortsData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DataCablePhysicalPortsDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DataCablePhysicalPortsDataResponseData
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DataCablePhysicalPortsDataResponseData dataCablePhysicalPortsData(@Param("elid") String elid, DataCablePhysicalPortsDataRequestData body, @QueryMap(encoded=true) DataCablePhysicalPortsDataQueryParams queryParams);

  /**
  * Get relations to Physical port (data) entities
  * 
  * Note, this is equivalent to the other <code>dataCablePhysicalPortsData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DataCablePhysicalPortsDataResponseData
      */
      @RequestLine("POST /api/rest/entity/dataCable/{elid}/PhysicalPortsData?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DataCablePhysicalPortsDataResponseData> dataCablePhysicalPortsDataWithHttpInfo(@Param("elid") String elid, DataCablePhysicalPortsDataRequestData body, @QueryMap(encoded=true) DataCablePhysicalPortsDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>dataCablePhysicalPortsData</code> method in a fluent style.
   */
  public static class DataCablePhysicalPortsDataQueryParams extends HashMap<String, Object> {
    public DataCablePhysicalPortsDataQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return DataCableQueryResponse
   */
  @RequestLine("POST /api/rest/entity/dataCable/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DataCableQueryResponse dataCableQuery(@Param("sessionId") String sessionId, DataCableQueryRequest body);

  /**
   * Basic query
   * Similar to <code>dataCableQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataCable/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DataCableQueryResponse> dataCableQueryWithHttpInfo(@Param("sessionId") String sessionId, DataCableQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>dataCableQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DataCableQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DataCableQueryResponse
   */
  @RequestLine("POST /api/rest/entity/dataCable/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DataCableQueryResponse dataCableQuery(DataCableQueryRequest body, @QueryMap(encoded=true) DataCableQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>dataCableQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DataCableQueryResponse
      */
      @RequestLine("POST /api/rest/entity/dataCable/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DataCableQueryResponse> dataCableQueryWithHttpInfo(DataCableQueryRequest body, @QueryMap(encoded=true) DataCableQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>dataCableQuery</code> method in a fluent style.
   */
  public static class DataCableQueryQueryParams extends HashMap<String, Object> {
    public DataCableQueryQueryParams sessionId(final String value) {
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
   * @return DataCableStartPortResponse
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/StartPort?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DataCableStartPortResponse dataCableStartPort(@Param("sessionId") String sessionId, @Param("elid") String elid, DataCableStartPortRequest body);

  /**
   * Query Start port
   * Similar to <code>dataCableStartPort</code> but it also returns the http response headers .
   * Queries the start port
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/StartPort?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DataCableStartPortResponse> dataCableStartPortWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DataCableStartPortRequest body);


  /**
   * Query Start port
   * Queries the start port
   * Note, this is equivalent to the other <code>dataCableStartPort</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DataCableStartPortQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DataCableStartPortResponse
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/StartPort?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DataCableStartPortResponse dataCableStartPort(@Param("elid") String elid, DataCableStartPortRequest body, @QueryMap(encoded=true) DataCableStartPortQueryParams queryParams);

  /**
  * Query Start port
  * Queries the start port
  * Note, this is equivalent to the other <code>dataCableStartPort</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DataCableStartPortResponse
      */
      @RequestLine("POST /api/rest/entity/dataCable/{elid}/StartPort?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DataCableStartPortResponse> dataCableStartPortWithHttpInfo(@Param("elid") String elid, DataCableStartPortRequest body, @QueryMap(encoded=true) DataCableStartPortQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>dataCableStartPort</code> method in a fluent style.
   */
  public static class DataCableStartPortQueryParams extends HashMap<String, Object> {
    public DataCableStartPortQueryParams sessionId(final String value) {
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
   * @return DataCableSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DataCableSystemAttributesResponse dataCableSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, DataCableSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>dataCableSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DataCableSystemAttributesResponse> dataCableSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DataCableSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>dataCableSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DataCableSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DataCableSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DataCableSystemAttributesResponse dataCableSystemAttributes(@Param("elid") String elid, DataCableSystemAttributesRequest body, @QueryMap(encoded=true) DataCableSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>dataCableSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DataCableSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/dataCable/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DataCableSystemAttributesResponse> dataCableSystemAttributesWithHttpInfo(@Param("elid") String elid, DataCableSystemAttributesRequest body, @QueryMap(encoded=true) DataCableSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>dataCableSystemAttributes</code> method in a fluent style.
   */
  public static class DataCableSystemAttributesQueryParams extends HashMap<String, Object> {
    public DataCableSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete cable
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteDataCableResponse
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteDataCableResponse deleteDataCable(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteDataCableRequestData body);

  /**
   * Delete
   * Similar to <code>deleteDataCable</code> but it also returns the http response headers .
   * Delete cable
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteDataCableResponse> deleteDataCableWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteDataCableRequestData body);


  /**
   * Delete
   * Delete cable
   * Note, this is equivalent to the other <code>deleteDataCable</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteDataCableQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteDataCableResponse
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteDataCableResponse deleteDataCable(@Param("elid") String elid, DeleteDataCableRequestData body, @QueryMap(encoded=true) DeleteDataCableQueryParams queryParams);

  /**
  * Delete
  * Delete cable
  * Note, this is equivalent to the other <code>deleteDataCable</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteDataCableResponse
      */
      @RequestLine("POST /api/rest/entity/dataCable/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteDataCableResponse> deleteDataCableWithHttpInfo(@Param("elid") String elid, DeleteDataCableRequestData body, @QueryMap(encoded=true) DeleteDataCableQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteDataCable</code> method in a fluent style.
   */
  public static class DeleteDataCableQueryParams extends HashMap<String, Object> {
    public DeleteDataCableQueryParams sessionId(final String value) {
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
   * @return ModifyConnectDataCableResponse
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/modifyConnect?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ModifyConnectDataCableResponse modifyConnectDataCable(@Param("sessionId") String sessionId, @Param("elid") String elid, ModifyConnectDataCableRequestData body);

  /**
   * Edit connection
   * Similar to <code>modifyConnectDataCable</code> but it also returns the http response headers .
   * Edit connection
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/modifyConnect?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ModifyConnectDataCableResponse> modifyConnectDataCableWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ModifyConnectDataCableRequestData body);


  /**
   * Edit connection
   * Edit connection
   * Note, this is equivalent to the other <code>modifyConnectDataCable</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ModifyConnectDataCableQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ModifyConnectDataCableResponse
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/modifyConnect?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ModifyConnectDataCableResponse modifyConnectDataCable(@Param("elid") String elid, ModifyConnectDataCableRequestData body, @QueryMap(encoded=true) ModifyConnectDataCableQueryParams queryParams);

  /**
  * Edit connection
  * Edit connection
  * Note, this is equivalent to the other <code>modifyConnectDataCable</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ModifyConnectDataCableResponse
      */
      @RequestLine("POST /api/rest/entity/dataCable/{elid}/modifyConnect?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ModifyConnectDataCableResponse> modifyConnectDataCableWithHttpInfo(@Param("elid") String elid, ModifyConnectDataCableRequestData body, @QueryMap(encoded=true) ModifyConnectDataCableQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>modifyConnectDataCable</code> method in a fluent style.
   */
  public static class ModifyConnectDataCableQueryParams extends HashMap<String, Object> {
    public ModifyConnectDataCableQueryParams sessionId(final String value) {
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
   * @return PatchDataCableResponse
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/patch?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PatchDataCableResponse patchDataCable(@Param("sessionId") String sessionId, @Param("elid") String elid, PatchDataCableRequestData body);

  /**
   * Repatch cable
   * Similar to <code>patchDataCable</code> but it also returns the http response headers .
   * Repatch cable
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/patch?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PatchDataCableResponse> patchDataCableWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PatchDataCableRequestData body);


  /**
   * Repatch cable
   * Repatch cable
   * Note, this is equivalent to the other <code>patchDataCable</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PatchDataCableQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PatchDataCableResponse
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/patch?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PatchDataCableResponse patchDataCable(@Param("elid") String elid, PatchDataCableRequestData body, @QueryMap(encoded=true) PatchDataCableQueryParams queryParams);

  /**
  * Repatch cable
  * Repatch cable
  * Note, this is equivalent to the other <code>patchDataCable</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PatchDataCableResponse
      */
      @RequestLine("POST /api/rest/entity/dataCable/{elid}/patch?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PatchDataCableResponse> patchDataCableWithHttpInfo(@Param("elid") String elid, PatchDataCableRequestData body, @QueryMap(encoded=true) PatchDataCableQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>patchDataCable</code> method in a fluent style.
   */
  public static class PatchDataCableQueryParams extends HashMap<String, Object> {
    public PatchDataCableQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Reserve fiber
   * Reserve fiber
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ReserveFiberDataCableResponse
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/reserveFiber?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ReserveFiberDataCableResponse reserveFiberDataCable(@Param("sessionId") String sessionId, @Param("elid") String elid, ReserveFiberDataCableRequestData body);

  /**
   * Reserve fiber
   * Similar to <code>reserveFiberDataCable</code> but it also returns the http response headers .
   * Reserve fiber
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/reserveFiber?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ReserveFiberDataCableResponse> reserveFiberDataCableWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ReserveFiberDataCableRequestData body);


  /**
   * Reserve fiber
   * Reserve fiber
   * Note, this is equivalent to the other <code>reserveFiberDataCable</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ReserveFiberDataCableQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ReserveFiberDataCableResponse
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/reserveFiber?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ReserveFiberDataCableResponse reserveFiberDataCable(@Param("elid") String elid, ReserveFiberDataCableRequestData body, @QueryMap(encoded=true) ReserveFiberDataCableQueryParams queryParams);

  /**
  * Reserve fiber
  * Reserve fiber
  * Note, this is equivalent to the other <code>reserveFiberDataCable</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ReserveFiberDataCableResponse
      */
      @RequestLine("POST /api/rest/entity/dataCable/{elid}/reserveFiber?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ReserveFiberDataCableResponse> reserveFiberDataCableWithHttpInfo(@Param("elid") String elid, ReserveFiberDataCableRequestData body, @QueryMap(encoded=true) ReserveFiberDataCableQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>reserveFiberDataCable</code> method in a fluent style.
   */
  public static class ReserveFiberDataCableQueryParams extends HashMap<String, Object> {
    public ReserveFiberDataCableQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Release fiber
   * Release fiber
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UnblockFiberDataCableResponse
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/unblockFiber?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UnblockFiberDataCableResponse unblockFiberDataCable(@Param("sessionId") String sessionId, @Param("elid") String elid, UnblockFiberDataCableRequestData body);

  /**
   * Release fiber
   * Similar to <code>unblockFiberDataCable</code> but it also returns the http response headers .
   * Release fiber
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/unblockFiber?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UnblockFiberDataCableResponse> unblockFiberDataCableWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UnblockFiberDataCableRequestData body);


  /**
   * Release fiber
   * Release fiber
   * Note, this is equivalent to the other <code>unblockFiberDataCable</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UnblockFiberDataCableQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UnblockFiberDataCableResponse
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/unblockFiber?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UnblockFiberDataCableResponse unblockFiberDataCable(@Param("elid") String elid, UnblockFiberDataCableRequestData body, @QueryMap(encoded=true) UnblockFiberDataCableQueryParams queryParams);

  /**
  * Release fiber
  * Release fiber
  * Note, this is equivalent to the other <code>unblockFiberDataCable</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UnblockFiberDataCableResponse
      */
      @RequestLine("POST /api/rest/entity/dataCable/{elid}/unblockFiber?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UnblockFiberDataCableResponse> unblockFiberDataCableWithHttpInfo(@Param("elid") String elid, UnblockFiberDataCableRequestData body, @QueryMap(encoded=true) UnblockFiberDataCableQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>unblockFiberDataCable</code> method in a fluent style.
   */
  public static class UnblockFiberDataCableQueryParams extends HashMap<String, Object> {
    public UnblockFiberDataCableQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify cable
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateDataCableResponse
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateDataCableResponse updateDataCable(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateDataCableRequestData body);

  /**
   * Modify
   * Similar to <code>updateDataCable</code> but it also returns the http response headers .
   * Modify cable
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateDataCableResponse> updateDataCableWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateDataCableRequestData body);


  /**
   * Modify
   * Modify cable
   * Note, this is equivalent to the other <code>updateDataCable</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateDataCableQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateDataCableResponse
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateDataCableResponse updateDataCable(@Param("elid") String elid, UpdateDataCableRequestData body, @QueryMap(encoded=true) UpdateDataCableQueryParams queryParams);

  /**
  * Modify
  * Modify cable
  * Note, this is equivalent to the other <code>updateDataCable</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateDataCableResponse
      */
      @RequestLine("POST /api/rest/entity/dataCable/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateDataCableResponse> updateDataCableWithHttpInfo(@Param("elid") String elid, UpdateDataCableRequestData body, @QueryMap(encoded=true) UpdateDataCableQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateDataCable</code> method in a fluent style.
   */
  public static class UpdateDataCableQueryParams extends HashMap<String, Object> {
    public UpdateDataCableQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesDataCableResponse
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesDataCableResponse updateSystemAttributesDataCable(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesDataCableRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesDataCable</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesDataCableResponse> updateSystemAttributesDataCableWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesDataCableRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesDataCable</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesDataCableQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesDataCableResponse
   */
  @RequestLine("POST /api/rest/entity/dataCable/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesDataCableResponse updateSystemAttributesDataCable(@Param("elid") String elid, UpdateSystemAttributesDataCableRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesDataCableQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesDataCable</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesDataCableResponse
      */
      @RequestLine("POST /api/rest/entity/dataCable/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesDataCableResponse> updateSystemAttributesDataCableWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesDataCableRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesDataCableQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesDataCable</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesDataCableQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesDataCableQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
