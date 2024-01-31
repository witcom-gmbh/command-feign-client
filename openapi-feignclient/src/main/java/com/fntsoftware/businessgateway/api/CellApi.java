package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CellAntennasRequestData;
import com.fntsoftware.businessgateway.entities.CellAntennasResponseData;
import com.fntsoftware.businessgateway.entities.CellCellEnhancerRequestData;
import com.fntsoftware.businessgateway.entities.CellCellEnhancerResponseData;
import com.fntsoftware.businessgateway.entities.CellCellsRequestData;
import com.fntsoftware.businessgateway.entities.CellCellsResponseData;
import com.fntsoftware.businessgateway.entities.CellContractsRequestData;
import com.fntsoftware.businessgateway.entities.CellContractsResponseData;
import com.fntsoftware.businessgateway.entities.CellFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.CellFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.CellMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.CellMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.CellNetworkFunctionRequestData;
import com.fntsoftware.businessgateway.entities.CellNetworkFunctionResponseData;
import com.fntsoftware.businessgateway.entities.CellOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.CellOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.CellPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.CellPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.CellPersonsRequestData;
import com.fntsoftware.businessgateway.entities.CellPersonsResponseData;
import com.fntsoftware.businessgateway.entities.CellQueryRequest;
import com.fntsoftware.businessgateway.entities.CellQueryResponse;
import com.fntsoftware.businessgateway.entities.CellRadioUnitRequestData;
import com.fntsoftware.businessgateway.entities.CellRadioUnitResponseData;
import com.fntsoftware.businessgateway.entities.CellSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.CellSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.CreateCellRequestData;
import com.fntsoftware.businessgateway.entities.CreateCellResponse;
import com.fntsoftware.businessgateway.entities.DeleteCellRequestData;
import com.fntsoftware.businessgateway.entities.DeleteCellResponse;
import com.fntsoftware.businessgateway.entities.UpdateCellRequestData;
import com.fntsoftware.businessgateway.entities.UpdateCellResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCellRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCellResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface CellApi extends ApiClient.Api {


  /**
   * Get relations to Antenna entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CellAntennasResponseData
   */
  @RequestLine("POST /api/rest/entity/cell/{elid}/Antennas?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CellAntennasResponseData cellAntennas(@Param("sessionId") String sessionId, @Param("elid") String elid, CellAntennasRequestData body);

  /**
   * Get relations to Antenna entities
   * Similar to <code>cellAntennas</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cell/{elid}/Antennas?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CellAntennasResponseData> cellAntennasWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CellAntennasRequestData body);


  /**
   * Get relations to Antenna entities
   * 
   * Note, this is equivalent to the other <code>cellAntennas</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CellAntennasQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CellAntennasResponseData
   */
  @RequestLine("POST /api/rest/entity/cell/{elid}/Antennas?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CellAntennasResponseData cellAntennas(@Param("elid") String elid, CellAntennasRequestData body, @QueryMap(encoded=true) CellAntennasQueryParams queryParams);

  /**
  * Get relations to Antenna entities
  * 
  * Note, this is equivalent to the other <code>cellAntennas</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CellAntennasResponseData
      */
      @RequestLine("POST /api/rest/entity/cell/{elid}/Antennas?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CellAntennasResponseData> cellAntennasWithHttpInfo(@Param("elid") String elid, CellAntennasRequestData body, @QueryMap(encoded=true) CellAntennasQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cellAntennas</code> method in a fluent style.
   */
  public static class CellAntennasQueryParams extends HashMap<String, Object> {
    public CellAntennasQueryParams sessionId(final String value) {
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
   * @return CellCellEnhancerResponseData
   */
  @RequestLine("POST /api/rest/entity/cell/{elid}/CellEnhancer?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CellCellEnhancerResponseData cellCellEnhancer(@Param("sessionId") String sessionId, @Param("elid") String elid, CellCellEnhancerRequestData body);

  /**
   * Get relations to Device (all) entities
   * Similar to <code>cellCellEnhancer</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cell/{elid}/CellEnhancer?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CellCellEnhancerResponseData> cellCellEnhancerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CellCellEnhancerRequestData body);


  /**
   * Get relations to Device (all) entities
   * 
   * Note, this is equivalent to the other <code>cellCellEnhancer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CellCellEnhancerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CellCellEnhancerResponseData
   */
  @RequestLine("POST /api/rest/entity/cell/{elid}/CellEnhancer?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CellCellEnhancerResponseData cellCellEnhancer(@Param("elid") String elid, CellCellEnhancerRequestData body, @QueryMap(encoded=true) CellCellEnhancerQueryParams queryParams);

  /**
  * Get relations to Device (all) entities
  * 
  * Note, this is equivalent to the other <code>cellCellEnhancer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CellCellEnhancerResponseData
      */
      @RequestLine("POST /api/rest/entity/cell/{elid}/CellEnhancer?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CellCellEnhancerResponseData> cellCellEnhancerWithHttpInfo(@Param("elid") String elid, CellCellEnhancerRequestData body, @QueryMap(encoded=true) CellCellEnhancerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cellCellEnhancer</code> method in a fluent style.
   */
  public static class CellCellEnhancerQueryParams extends HashMap<String, Object> {
    public CellCellEnhancerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Cell entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CellCellsResponseData
   */
  @RequestLine("POST /api/rest/entity/cell/{elid}/Cells?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CellCellsResponseData cellCells(@Param("sessionId") String sessionId, @Param("elid") String elid, CellCellsRequestData body);

  /**
   * Get relations to Cell entities
   * Similar to <code>cellCells</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cell/{elid}/Cells?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CellCellsResponseData> cellCellsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CellCellsRequestData body);


  /**
   * Get relations to Cell entities
   * 
   * Note, this is equivalent to the other <code>cellCells</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CellCellsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CellCellsResponseData
   */
  @RequestLine("POST /api/rest/entity/cell/{elid}/Cells?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CellCellsResponseData cellCells(@Param("elid") String elid, CellCellsRequestData body, @QueryMap(encoded=true) CellCellsQueryParams queryParams);

  /**
  * Get relations to Cell entities
  * 
  * Note, this is equivalent to the other <code>cellCells</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CellCellsResponseData
      */
      @RequestLine("POST /api/rest/entity/cell/{elid}/Cells?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CellCellsResponseData> cellCellsWithHttpInfo(@Param("elid") String elid, CellCellsRequestData body, @QueryMap(encoded=true) CellCellsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cellCells</code> method in a fluent style.
   */
  public static class CellCellsQueryParams extends HashMap<String, Object> {
    public CellCellsQueryParams sessionId(final String value) {
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
   * @return CellContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/cell/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CellContractsResponseData cellContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, CellContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>cellContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cell/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CellContractsResponseData> cellContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CellContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>cellContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CellContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CellContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/cell/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CellContractsResponseData cellContracts(@Param("elid") String elid, CellContractsRequestData body, @QueryMap(encoded=true) CellContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>cellContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CellContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/cell/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CellContractsResponseData> cellContractsWithHttpInfo(@Param("elid") String elid, CellContractsRequestData body, @QueryMap(encoded=true) CellContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cellContracts</code> method in a fluent style.
   */
  public static class CellContractsQueryParams extends HashMap<String, Object> {
    public CellContractsQueryParams sessionId(final String value) {
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
   * @return CellFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/cell/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CellFrameContractsResponseData cellFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, CellFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>cellFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cell/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CellFrameContractsResponseData> cellFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CellFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>cellFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CellFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CellFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/cell/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CellFrameContractsResponseData cellFrameContracts(@Param("elid") String elid, CellFrameContractsRequestData body, @QueryMap(encoded=true) CellFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>cellFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CellFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/cell/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CellFrameContractsResponseData> cellFrameContractsWithHttpInfo(@Param("elid") String elid, CellFrameContractsRequestData body, @QueryMap(encoded=true) CellFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cellFrameContracts</code> method in a fluent style.
   */
  public static class CellFrameContractsQueryParams extends HashMap<String, Object> {
    public CellFrameContractsQueryParams sessionId(final String value) {
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
   * @return CellMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/cell/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CellMaintenanceContractsResponseData cellMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, CellMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>cellMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cell/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CellMaintenanceContractsResponseData> cellMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CellMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>cellMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CellMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CellMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/cell/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CellMaintenanceContractsResponseData cellMaintenanceContracts(@Param("elid") String elid, CellMaintenanceContractsRequestData body, @QueryMap(encoded=true) CellMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>cellMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CellMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/cell/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CellMaintenanceContractsResponseData> cellMaintenanceContractsWithHttpInfo(@Param("elid") String elid, CellMaintenanceContractsRequestData body, @QueryMap(encoded=true) CellMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cellMaintenanceContracts</code> method in a fluent style.
   */
  public static class CellMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public CellMaintenanceContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Network function entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CellNetworkFunctionResponseData
   */
  @RequestLine("POST /api/rest/entity/cell/{elid}/NetworkFunction?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CellNetworkFunctionResponseData cellNetworkFunction(@Param("sessionId") String sessionId, @Param("elid") String elid, CellNetworkFunctionRequestData body);

  /**
   * Get relations to Network function entities
   * Similar to <code>cellNetworkFunction</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cell/{elid}/NetworkFunction?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CellNetworkFunctionResponseData> cellNetworkFunctionWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CellNetworkFunctionRequestData body);


  /**
   * Get relations to Network function entities
   * 
   * Note, this is equivalent to the other <code>cellNetworkFunction</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CellNetworkFunctionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CellNetworkFunctionResponseData
   */
  @RequestLine("POST /api/rest/entity/cell/{elid}/NetworkFunction?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CellNetworkFunctionResponseData cellNetworkFunction(@Param("elid") String elid, CellNetworkFunctionRequestData body, @QueryMap(encoded=true) CellNetworkFunctionQueryParams queryParams);

  /**
  * Get relations to Network function entities
  * 
  * Note, this is equivalent to the other <code>cellNetworkFunction</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CellNetworkFunctionResponseData
      */
      @RequestLine("POST /api/rest/entity/cell/{elid}/NetworkFunction?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CellNetworkFunctionResponseData> cellNetworkFunctionWithHttpInfo(@Param("elid") String elid, CellNetworkFunctionRequestData body, @QueryMap(encoded=true) CellNetworkFunctionQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cellNetworkFunction</code> method in a fluent style.
   */
  public static class CellNetworkFunctionQueryParams extends HashMap<String, Object> {
    public CellNetworkFunctionQueryParams sessionId(final String value) {
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
   * @return CellOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/cell/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CellOrganizationsResponseData cellOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, CellOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>cellOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cell/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CellOrganizationsResponseData> cellOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CellOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>cellOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CellOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CellOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/cell/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CellOrganizationsResponseData cellOrganizations(@Param("elid") String elid, CellOrganizationsRequestData body, @QueryMap(encoded=true) CellOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>cellOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CellOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/cell/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CellOrganizationsResponseData> cellOrganizationsWithHttpInfo(@Param("elid") String elid, CellOrganizationsRequestData body, @QueryMap(encoded=true) CellOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cellOrganizations</code> method in a fluent style.
   */
  public static class CellOrganizationsQueryParams extends HashMap<String, Object> {
    public CellOrganizationsQueryParams sessionId(final String value) {
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
   * @return CellPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/cell/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CellPersonGroupsResponseData cellPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, CellPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>cellPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cell/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CellPersonGroupsResponseData> cellPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CellPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>cellPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CellPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CellPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/cell/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CellPersonGroupsResponseData cellPersonGroups(@Param("elid") String elid, CellPersonGroupsRequestData body, @QueryMap(encoded=true) CellPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>cellPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CellPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/cell/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CellPersonGroupsResponseData> cellPersonGroupsWithHttpInfo(@Param("elid") String elid, CellPersonGroupsRequestData body, @QueryMap(encoded=true) CellPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cellPersonGroups</code> method in a fluent style.
   */
  public static class CellPersonGroupsQueryParams extends HashMap<String, Object> {
    public CellPersonGroupsQueryParams sessionId(final String value) {
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
   * @return CellPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/cell/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CellPersonsResponseData cellPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, CellPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>cellPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cell/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CellPersonsResponseData> cellPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CellPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>cellPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CellPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CellPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/cell/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CellPersonsResponseData cellPersons(@Param("elid") String elid, CellPersonsRequestData body, @QueryMap(encoded=true) CellPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>cellPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CellPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/cell/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CellPersonsResponseData> cellPersonsWithHttpInfo(@Param("elid") String elid, CellPersonsRequestData body, @QueryMap(encoded=true) CellPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cellPersons</code> method in a fluent style.
   */
  public static class CellPersonsQueryParams extends HashMap<String, Object> {
    public CellPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CellQueryResponse
   */
  @RequestLine("POST /api/rest/entity/cell/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CellQueryResponse cellQuery(@Param("sessionId") String sessionId, CellQueryRequest body);

  /**
   * Basic query
   * Similar to <code>cellQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cell/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CellQueryResponse> cellQueryWithHttpInfo(@Param("sessionId") String sessionId, CellQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>cellQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CellQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CellQueryResponse
   */
  @RequestLine("POST /api/rest/entity/cell/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CellQueryResponse cellQuery(CellQueryRequest body, @QueryMap(encoded=true) CellQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>cellQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CellQueryResponse
      */
      @RequestLine("POST /api/rest/entity/cell/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CellQueryResponse> cellQueryWithHttpInfo(CellQueryRequest body, @QueryMap(encoded=true) CellQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cellQuery</code> method in a fluent style.
   */
  public static class CellQueryQueryParams extends HashMap<String, Object> {
    public CellQueryQueryParams sessionId(final String value) {
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
   * @return CellRadioUnitResponseData
   */
  @RequestLine("POST /api/rest/entity/cell/{elid}/RadioUnit?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CellRadioUnitResponseData cellRadioUnit(@Param("sessionId") String sessionId, @Param("elid") String elid, CellRadioUnitRequestData body);

  /**
   * Get relations to Device (all) entities
   * Similar to <code>cellRadioUnit</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cell/{elid}/RadioUnit?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CellRadioUnitResponseData> cellRadioUnitWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CellRadioUnitRequestData body);


  /**
   * Get relations to Device (all) entities
   * 
   * Note, this is equivalent to the other <code>cellRadioUnit</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CellRadioUnitQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CellRadioUnitResponseData
   */
  @RequestLine("POST /api/rest/entity/cell/{elid}/RadioUnit?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CellRadioUnitResponseData cellRadioUnit(@Param("elid") String elid, CellRadioUnitRequestData body, @QueryMap(encoded=true) CellRadioUnitQueryParams queryParams);

  /**
  * Get relations to Device (all) entities
  * 
  * Note, this is equivalent to the other <code>cellRadioUnit</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CellRadioUnitResponseData
      */
      @RequestLine("POST /api/rest/entity/cell/{elid}/RadioUnit?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CellRadioUnitResponseData> cellRadioUnitWithHttpInfo(@Param("elid") String elid, CellRadioUnitRequestData body, @QueryMap(encoded=true) CellRadioUnitQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cellRadioUnit</code> method in a fluent style.
   */
  public static class CellRadioUnitQueryParams extends HashMap<String, Object> {
    public CellRadioUnitQueryParams sessionId(final String value) {
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
   * @return CellSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/cell/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CellSystemAttributesResponse cellSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, CellSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>cellSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cell/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CellSystemAttributesResponse> cellSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CellSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>cellSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CellSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CellSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/cell/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CellSystemAttributesResponse cellSystemAttributes(@Param("elid") String elid, CellSystemAttributesRequest body, @QueryMap(encoded=true) CellSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>cellSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CellSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/cell/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CellSystemAttributesResponse> cellSystemAttributesWithHttpInfo(@Param("elid") String elid, CellSystemAttributesRequest body, @QueryMap(encoded=true) CellSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cellSystemAttributes</code> method in a fluent style.
   */
  public static class CellSystemAttributesQueryParams extends HashMap<String, Object> {
    public CellSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create
   * Create Cell
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateCellResponse
   */
  @RequestLine("POST /api/rest/entity/cell/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateCellResponse createCell(@Param("sessionId") String sessionId, CreateCellRequestData body);

  /**
   * Create
   * Similar to <code>createCell</code> but it also returns the http response headers .
   * Create Cell
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cell/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateCellResponse> createCellWithHttpInfo(@Param("sessionId") String sessionId, CreateCellRequestData body);


  /**
   * Create
   * Create Cell
   * Note, this is equivalent to the other <code>createCell</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateCellQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateCellResponse
   */
  @RequestLine("POST /api/rest/entity/cell/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateCellResponse createCell(CreateCellRequestData body, @QueryMap(encoded=true) CreateCellQueryParams queryParams);

  /**
  * Create
  * Create Cell
  * Note, this is equivalent to the other <code>createCell</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateCellResponse
      */
      @RequestLine("POST /api/rest/entity/cell/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateCellResponse> createCellWithHttpInfo(CreateCellRequestData body, @QueryMap(encoded=true) CreateCellQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createCell</code> method in a fluent style.
   */
  public static class CreateCellQueryParams extends HashMap<String, Object> {
    public CreateCellQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Cell
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteCellResponse
   */
  @RequestLine("POST /api/rest/entity/cell/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteCellResponse deleteCell(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCellRequestData body);

  /**
   * Delete
   * Similar to <code>deleteCell</code> but it also returns the http response headers .
   * Delete Cell
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cell/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteCellResponse> deleteCellWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCellRequestData body);


  /**
   * Delete
   * Delete Cell
   * Note, this is equivalent to the other <code>deleteCell</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteCellQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteCellResponse
   */
  @RequestLine("POST /api/rest/entity/cell/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteCellResponse deleteCell(@Param("elid") String elid, DeleteCellRequestData body, @QueryMap(encoded=true) DeleteCellQueryParams queryParams);

  /**
  * Delete
  * Delete Cell
  * Note, this is equivalent to the other <code>deleteCell</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteCellResponse
      */
      @RequestLine("POST /api/rest/entity/cell/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteCellResponse> deleteCellWithHttpInfo(@Param("elid") String elid, DeleteCellRequestData body, @QueryMap(encoded=true) DeleteCellQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteCell</code> method in a fluent style.
   */
  public static class DeleteCellQueryParams extends HashMap<String, Object> {
    public DeleteCellQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Cell
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateCellResponse
   */
  @RequestLine("POST /api/rest/entity/cell/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateCellResponse updateCell(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCellRequestData body);

  /**
   * Modify
   * Similar to <code>updateCell</code> but it also returns the http response headers .
   * Modify Cell
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cell/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateCellResponse> updateCellWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCellRequestData body);


  /**
   * Modify
   * Modify Cell
   * Note, this is equivalent to the other <code>updateCell</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateCellQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateCellResponse
   */
  @RequestLine("POST /api/rest/entity/cell/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateCellResponse updateCell(@Param("elid") String elid, UpdateCellRequestData body, @QueryMap(encoded=true) UpdateCellQueryParams queryParams);

  /**
  * Modify
  * Modify Cell
  * Note, this is equivalent to the other <code>updateCell</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateCellResponse
      */
      @RequestLine("POST /api/rest/entity/cell/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateCellResponse> updateCellWithHttpInfo(@Param("elid") String elid, UpdateCellRequestData body, @QueryMap(encoded=true) UpdateCellQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateCell</code> method in a fluent style.
   */
  public static class UpdateCellQueryParams extends HashMap<String, Object> {
    public UpdateCellQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesCellResponse
   */
  @RequestLine("POST /api/rest/entity/cell/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesCellResponse updateSystemAttributesCell(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCellRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesCell</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cell/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesCellResponse> updateSystemAttributesCellWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCellRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesCell</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesCellQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesCellResponse
   */
  @RequestLine("POST /api/rest/entity/cell/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesCellResponse updateSystemAttributesCell(@Param("elid") String elid, UpdateSystemAttributesCellRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCellQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesCell</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesCellResponse
      */
      @RequestLine("POST /api/rest/entity/cell/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesCellResponse> updateSystemAttributesCellWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesCellRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCellQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesCell</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesCellQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesCellQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
