package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateTelcoProductRequestData;
import com.fntsoftware.businessgateway.entities.CreateTelcoProductResponse;
import com.fntsoftware.businessgateway.entities.DeleteTelcoProductRequestData;
import com.fntsoftware.businessgateway.entities.DeleteTelcoProductResponse;
import com.fntsoftware.businessgateway.entities.TelcoProductBearersRequestData;
import com.fntsoftware.businessgateway.entities.TelcoProductBearersResponseData;
import com.fntsoftware.businessgateway.entities.TelcoProductCablesRequestData;
import com.fntsoftware.businessgateway.entities.TelcoProductCablesResponseData;
import com.fntsoftware.businessgateway.entities.TelcoProductContractsRequestData;
import com.fntsoftware.businessgateway.entities.TelcoProductContractsResponseData;
import com.fntsoftware.businessgateway.entities.TelcoProductDevicesAllRequestData;
import com.fntsoftware.businessgateway.entities.TelcoProductDevicesAllResponseData;
import com.fntsoftware.businessgateway.entities.TelcoProductFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.TelcoProductFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.TelcoProductMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.TelcoProductMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.TelcoProductNetworkElementsRequestData;
import com.fntsoftware.businessgateway.entities.TelcoProductNetworkElementsResponseData;
import com.fntsoftware.businessgateway.entities.TelcoProductOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.TelcoProductOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.TelcoProductPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.TelcoProductPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.TelcoProductPersonsRequestData;
import com.fntsoftware.businessgateway.entities.TelcoProductPersonsResponseData;
import com.fntsoftware.businessgateway.entities.TelcoProductProductAssignmentsRequest;
import com.fntsoftware.businessgateway.entities.TelcoProductProductAssignmentsResponse;
import com.fntsoftware.businessgateway.entities.TelcoProductQueryRequest;
import com.fntsoftware.businessgateway.entities.TelcoProductQueryResponse;
import com.fntsoftware.businessgateway.entities.TelcoProductServicesTelcoRequestData;
import com.fntsoftware.businessgateway.entities.TelcoProductServicesTelcoResponseData;
import com.fntsoftware.businessgateway.entities.TelcoProductSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.TelcoProductSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesTelcoProductRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesTelcoProductResponse;
import com.fntsoftware.businessgateway.entities.UpdateTelcoProductRequestData;
import com.fntsoftware.businessgateway.entities.UpdateTelcoProductResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface TelcoProductApi extends ApiClient.Api {


  /**
   * Create
   * Create Telco product
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateTelcoProductResponse
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateTelcoProductResponse createTelcoProduct(@Param("sessionId") String sessionId, CreateTelcoProductRequestData body);

  /**
   * Create
   * Similar to <code>createTelcoProduct</code> but it also returns the http response headers .
   * Create Telco product
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateTelcoProductResponse> createTelcoProductWithHttpInfo(@Param("sessionId") String sessionId, CreateTelcoProductRequestData body);


  /**
   * Create
   * Create Telco product
   * Note, this is equivalent to the other <code>createTelcoProduct</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateTelcoProductQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateTelcoProductResponse
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateTelcoProductResponse createTelcoProduct(CreateTelcoProductRequestData body, @QueryMap(encoded=true) CreateTelcoProductQueryParams queryParams);

  /**
  * Create
  * Create Telco product
  * Note, this is equivalent to the other <code>createTelcoProduct</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateTelcoProductResponse
      */
      @RequestLine("POST /api/rest/entity/telcoProduct/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateTelcoProductResponse> createTelcoProductWithHttpInfo(CreateTelcoProductRequestData body, @QueryMap(encoded=true) CreateTelcoProductQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createTelcoProduct</code> method in a fluent style.
   */
  public static class CreateTelcoProductQueryParams extends HashMap<String, Object> {
    public CreateTelcoProductQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Telco product
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteTelcoProductResponse
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteTelcoProductResponse deleteTelcoProduct(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteTelcoProductRequestData body);

  /**
   * Delete
   * Similar to <code>deleteTelcoProduct</code> but it also returns the http response headers .
   * Delete Telco product
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteTelcoProductResponse> deleteTelcoProductWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteTelcoProductRequestData body);


  /**
   * Delete
   * Delete Telco product
   * Note, this is equivalent to the other <code>deleteTelcoProduct</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteTelcoProductQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteTelcoProductResponse
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteTelcoProductResponse deleteTelcoProduct(@Param("elid") String elid, DeleteTelcoProductRequestData body, @QueryMap(encoded=true) DeleteTelcoProductQueryParams queryParams);

  /**
  * Delete
  * Delete Telco product
  * Note, this is equivalent to the other <code>deleteTelcoProduct</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteTelcoProductResponse
      */
      @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteTelcoProductResponse> deleteTelcoProductWithHttpInfo(@Param("elid") String elid, DeleteTelcoProductRequestData body, @QueryMap(encoded=true) DeleteTelcoProductQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteTelcoProduct</code> method in a fluent style.
   */
  public static class DeleteTelcoProductQueryParams extends HashMap<String, Object> {
    public DeleteTelcoProductQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Bearer entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return TelcoProductBearersResponseData
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/Bearers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TelcoProductBearersResponseData telcoProductBearers(@Param("sessionId") String sessionId, @Param("elid") String elid, TelcoProductBearersRequestData body);

  /**
   * Get relations to Bearer entities
   * Similar to <code>telcoProductBearers</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/Bearers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TelcoProductBearersResponseData> telcoProductBearersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TelcoProductBearersRequestData body);


  /**
   * Get relations to Bearer entities
   * 
   * Note, this is equivalent to the other <code>telcoProductBearers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TelcoProductBearersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TelcoProductBearersResponseData
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/Bearers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TelcoProductBearersResponseData telcoProductBearers(@Param("elid") String elid, TelcoProductBearersRequestData body, @QueryMap(encoded=true) TelcoProductBearersQueryParams queryParams);

  /**
  * Get relations to Bearer entities
  * 
  * Note, this is equivalent to the other <code>telcoProductBearers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TelcoProductBearersResponseData
      */
      @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/Bearers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TelcoProductBearersResponseData> telcoProductBearersWithHttpInfo(@Param("elid") String elid, TelcoProductBearersRequestData body, @QueryMap(encoded=true) TelcoProductBearersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>telcoProductBearers</code> method in a fluent style.
   */
  public static class TelcoProductBearersQueryParams extends HashMap<String, Object> {
    public TelcoProductBearersQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Leased line entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return TelcoProductCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/Cables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TelcoProductCablesResponseData telcoProductCables(@Param("sessionId") String sessionId, @Param("elid") String elid, TelcoProductCablesRequestData body);

  /**
   * Get relations to Leased line entities
   * Similar to <code>telcoProductCables</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/Cables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TelcoProductCablesResponseData> telcoProductCablesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TelcoProductCablesRequestData body);


  /**
   * Get relations to Leased line entities
   * 
   * Note, this is equivalent to the other <code>telcoProductCables</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TelcoProductCablesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TelcoProductCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/Cables?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TelcoProductCablesResponseData telcoProductCables(@Param("elid") String elid, TelcoProductCablesRequestData body, @QueryMap(encoded=true) TelcoProductCablesQueryParams queryParams);

  /**
  * Get relations to Leased line entities
  * 
  * Note, this is equivalent to the other <code>telcoProductCables</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TelcoProductCablesResponseData
      */
      @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/Cables?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TelcoProductCablesResponseData> telcoProductCablesWithHttpInfo(@Param("elid") String elid, TelcoProductCablesRequestData body, @QueryMap(encoded=true) TelcoProductCablesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>telcoProductCables</code> method in a fluent style.
   */
  public static class TelcoProductCablesQueryParams extends HashMap<String, Object> {
    public TelcoProductCablesQueryParams sessionId(final String value) {
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
   * @return TelcoProductContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TelcoProductContractsResponseData telcoProductContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, TelcoProductContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>telcoProductContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TelcoProductContractsResponseData> telcoProductContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TelcoProductContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>telcoProductContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TelcoProductContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TelcoProductContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TelcoProductContractsResponseData telcoProductContracts(@Param("elid") String elid, TelcoProductContractsRequestData body, @QueryMap(encoded=true) TelcoProductContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>telcoProductContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TelcoProductContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TelcoProductContractsResponseData> telcoProductContractsWithHttpInfo(@Param("elid") String elid, TelcoProductContractsRequestData body, @QueryMap(encoded=true) TelcoProductContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>telcoProductContracts</code> method in a fluent style.
   */
  public static class TelcoProductContractsQueryParams extends HashMap<String, Object> {
    public TelcoProductContractsQueryParams sessionId(final String value) {
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
   * @return TelcoProductDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TelcoProductDevicesAllResponseData telcoProductDevicesAll(@Param("sessionId") String sessionId, @Param("elid") String elid, TelcoProductDevicesAllRequestData body);

  /**
   * Get relations to Device (all) entities
   * Similar to <code>telcoProductDevicesAll</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TelcoProductDevicesAllResponseData> telcoProductDevicesAllWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TelcoProductDevicesAllRequestData body);


  /**
   * Get relations to Device (all) entities
   * 
   * Note, this is equivalent to the other <code>telcoProductDevicesAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TelcoProductDevicesAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TelcoProductDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TelcoProductDevicesAllResponseData telcoProductDevicesAll(@Param("elid") String elid, TelcoProductDevicesAllRequestData body, @QueryMap(encoded=true) TelcoProductDevicesAllQueryParams queryParams);

  /**
  * Get relations to Device (all) entities
  * 
  * Note, this is equivalent to the other <code>telcoProductDevicesAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TelcoProductDevicesAllResponseData
      */
      @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/DevicesAll?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TelcoProductDevicesAllResponseData> telcoProductDevicesAllWithHttpInfo(@Param("elid") String elid, TelcoProductDevicesAllRequestData body, @QueryMap(encoded=true) TelcoProductDevicesAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>telcoProductDevicesAll</code> method in a fluent style.
   */
  public static class TelcoProductDevicesAllQueryParams extends HashMap<String, Object> {
    public TelcoProductDevicesAllQueryParams sessionId(final String value) {
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
   * @return TelcoProductFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TelcoProductFrameContractsResponseData telcoProductFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, TelcoProductFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>telcoProductFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TelcoProductFrameContractsResponseData> telcoProductFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TelcoProductFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>telcoProductFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TelcoProductFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TelcoProductFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TelcoProductFrameContractsResponseData telcoProductFrameContracts(@Param("elid") String elid, TelcoProductFrameContractsRequestData body, @QueryMap(encoded=true) TelcoProductFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>telcoProductFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TelcoProductFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TelcoProductFrameContractsResponseData> telcoProductFrameContractsWithHttpInfo(@Param("elid") String elid, TelcoProductFrameContractsRequestData body, @QueryMap(encoded=true) TelcoProductFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>telcoProductFrameContracts</code> method in a fluent style.
   */
  public static class TelcoProductFrameContractsQueryParams extends HashMap<String, Object> {
    public TelcoProductFrameContractsQueryParams sessionId(final String value) {
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
   * @return TelcoProductMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TelcoProductMaintenanceContractsResponseData telcoProductMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, TelcoProductMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>telcoProductMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TelcoProductMaintenanceContractsResponseData> telcoProductMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TelcoProductMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>telcoProductMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TelcoProductMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TelcoProductMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TelcoProductMaintenanceContractsResponseData telcoProductMaintenanceContracts(@Param("elid") String elid, TelcoProductMaintenanceContractsRequestData body, @QueryMap(encoded=true) TelcoProductMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>telcoProductMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TelcoProductMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TelcoProductMaintenanceContractsResponseData> telcoProductMaintenanceContractsWithHttpInfo(@Param("elid") String elid, TelcoProductMaintenanceContractsRequestData body, @QueryMap(encoded=true) TelcoProductMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>telcoProductMaintenanceContracts</code> method in a fluent style.
   */
  public static class TelcoProductMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public TelcoProductMaintenanceContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Network element entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return TelcoProductNetworkElementsResponseData
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/NetworkElements?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TelcoProductNetworkElementsResponseData telcoProductNetworkElements(@Param("sessionId") String sessionId, @Param("elid") String elid, TelcoProductNetworkElementsRequestData body);

  /**
   * Get relations to Network element entities
   * Similar to <code>telcoProductNetworkElements</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/NetworkElements?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TelcoProductNetworkElementsResponseData> telcoProductNetworkElementsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TelcoProductNetworkElementsRequestData body);


  /**
   * Get relations to Network element entities
   * 
   * Note, this is equivalent to the other <code>telcoProductNetworkElements</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TelcoProductNetworkElementsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TelcoProductNetworkElementsResponseData
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/NetworkElements?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TelcoProductNetworkElementsResponseData telcoProductNetworkElements(@Param("elid") String elid, TelcoProductNetworkElementsRequestData body, @QueryMap(encoded=true) TelcoProductNetworkElementsQueryParams queryParams);

  /**
  * Get relations to Network element entities
  * 
  * Note, this is equivalent to the other <code>telcoProductNetworkElements</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TelcoProductNetworkElementsResponseData
      */
      @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/NetworkElements?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TelcoProductNetworkElementsResponseData> telcoProductNetworkElementsWithHttpInfo(@Param("elid") String elid, TelcoProductNetworkElementsRequestData body, @QueryMap(encoded=true) TelcoProductNetworkElementsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>telcoProductNetworkElements</code> method in a fluent style.
   */
  public static class TelcoProductNetworkElementsQueryParams extends HashMap<String, Object> {
    public TelcoProductNetworkElementsQueryParams sessionId(final String value) {
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
   * @return TelcoProductOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TelcoProductOrganizationsResponseData telcoProductOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, TelcoProductOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>telcoProductOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TelcoProductOrganizationsResponseData> telcoProductOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TelcoProductOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>telcoProductOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TelcoProductOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TelcoProductOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TelcoProductOrganizationsResponseData telcoProductOrganizations(@Param("elid") String elid, TelcoProductOrganizationsRequestData body, @QueryMap(encoded=true) TelcoProductOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>telcoProductOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TelcoProductOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TelcoProductOrganizationsResponseData> telcoProductOrganizationsWithHttpInfo(@Param("elid") String elid, TelcoProductOrganizationsRequestData body, @QueryMap(encoded=true) TelcoProductOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>telcoProductOrganizations</code> method in a fluent style.
   */
  public static class TelcoProductOrganizationsQueryParams extends HashMap<String, Object> {
    public TelcoProductOrganizationsQueryParams sessionId(final String value) {
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
   * @return TelcoProductPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TelcoProductPersonGroupsResponseData telcoProductPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, TelcoProductPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>telcoProductPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TelcoProductPersonGroupsResponseData> telcoProductPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TelcoProductPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>telcoProductPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TelcoProductPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TelcoProductPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TelcoProductPersonGroupsResponseData telcoProductPersonGroups(@Param("elid") String elid, TelcoProductPersonGroupsRequestData body, @QueryMap(encoded=true) TelcoProductPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>telcoProductPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TelcoProductPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TelcoProductPersonGroupsResponseData> telcoProductPersonGroupsWithHttpInfo(@Param("elid") String elid, TelcoProductPersonGroupsRequestData body, @QueryMap(encoded=true) TelcoProductPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>telcoProductPersonGroups</code> method in a fluent style.
   */
  public static class TelcoProductPersonGroupsQueryParams extends HashMap<String, Object> {
    public TelcoProductPersonGroupsQueryParams sessionId(final String value) {
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
   * @return TelcoProductPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TelcoProductPersonsResponseData telcoProductPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, TelcoProductPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>telcoProductPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TelcoProductPersonsResponseData> telcoProductPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TelcoProductPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>telcoProductPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TelcoProductPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TelcoProductPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TelcoProductPersonsResponseData telcoProductPersons(@Param("elid") String elid, TelcoProductPersonsRequestData body, @QueryMap(encoded=true) TelcoProductPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>telcoProductPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TelcoProductPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TelcoProductPersonsResponseData> telcoProductPersonsWithHttpInfo(@Param("elid") String elid, TelcoProductPersonsRequestData body, @QueryMap(encoded=true) TelcoProductPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>telcoProductPersons</code> method in a fluent style.
   */
  public static class TelcoProductPersonsQueryParams extends HashMap<String, Object> {
    public TelcoProductPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Product assignments
   * Query for the product assignments
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return TelcoProductProductAssignmentsResponse
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/ProductAssignments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TelcoProductProductAssignmentsResponse telcoProductProductAssignments(@Param("sessionId") String sessionId, @Param("elid") String elid, TelcoProductProductAssignmentsRequest body);

  /**
   * Product assignments
   * Similar to <code>telcoProductProductAssignments</code> but it also returns the http response headers .
   * Query for the product assignments
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/ProductAssignments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TelcoProductProductAssignmentsResponse> telcoProductProductAssignmentsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TelcoProductProductAssignmentsRequest body);


  /**
   * Product assignments
   * Query for the product assignments
   * Note, this is equivalent to the other <code>telcoProductProductAssignments</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TelcoProductProductAssignmentsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TelcoProductProductAssignmentsResponse
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/ProductAssignments?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TelcoProductProductAssignmentsResponse telcoProductProductAssignments(@Param("elid") String elid, TelcoProductProductAssignmentsRequest body, @QueryMap(encoded=true) TelcoProductProductAssignmentsQueryParams queryParams);

  /**
  * Product assignments
  * Query for the product assignments
  * Note, this is equivalent to the other <code>telcoProductProductAssignments</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TelcoProductProductAssignmentsResponse
      */
      @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/ProductAssignments?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TelcoProductProductAssignmentsResponse> telcoProductProductAssignmentsWithHttpInfo(@Param("elid") String elid, TelcoProductProductAssignmentsRequest body, @QueryMap(encoded=true) TelcoProductProductAssignmentsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>telcoProductProductAssignments</code> method in a fluent style.
   */
  public static class TelcoProductProductAssignmentsQueryParams extends HashMap<String, Object> {
    public TelcoProductProductAssignmentsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return TelcoProductQueryResponse
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TelcoProductQueryResponse telcoProductQuery(@Param("sessionId") String sessionId, TelcoProductQueryRequest body);

  /**
   * Basic query
   * Similar to <code>telcoProductQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TelcoProductQueryResponse> telcoProductQueryWithHttpInfo(@Param("sessionId") String sessionId, TelcoProductQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>telcoProductQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TelcoProductQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TelcoProductQueryResponse
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TelcoProductQueryResponse telcoProductQuery(TelcoProductQueryRequest body, @QueryMap(encoded=true) TelcoProductQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>telcoProductQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TelcoProductQueryResponse
      */
      @RequestLine("POST /api/rest/entity/telcoProduct/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TelcoProductQueryResponse> telcoProductQueryWithHttpInfo(TelcoProductQueryRequest body, @QueryMap(encoded=true) TelcoProductQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>telcoProductQuery</code> method in a fluent style.
   */
  public static class TelcoProductQueryQueryParams extends HashMap<String, Object> {
    public TelcoProductQueryQueryParams sessionId(final String value) {
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
   * @return TelcoProductServicesTelcoResponseData
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/ServicesTelco?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TelcoProductServicesTelcoResponseData telcoProductServicesTelco(@Param("sessionId") String sessionId, @Param("elid") String elid, TelcoProductServicesTelcoRequestData body);

  /**
   * Get relations to Service (Telco) entities
   * Similar to <code>telcoProductServicesTelco</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/ServicesTelco?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TelcoProductServicesTelcoResponseData> telcoProductServicesTelcoWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TelcoProductServicesTelcoRequestData body);


  /**
   * Get relations to Service (Telco) entities
   * 
   * Note, this is equivalent to the other <code>telcoProductServicesTelco</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TelcoProductServicesTelcoQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TelcoProductServicesTelcoResponseData
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/ServicesTelco?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TelcoProductServicesTelcoResponseData telcoProductServicesTelco(@Param("elid") String elid, TelcoProductServicesTelcoRequestData body, @QueryMap(encoded=true) TelcoProductServicesTelcoQueryParams queryParams);

  /**
  * Get relations to Service (Telco) entities
  * 
  * Note, this is equivalent to the other <code>telcoProductServicesTelco</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TelcoProductServicesTelcoResponseData
      */
      @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/ServicesTelco?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TelcoProductServicesTelcoResponseData> telcoProductServicesTelcoWithHttpInfo(@Param("elid") String elid, TelcoProductServicesTelcoRequestData body, @QueryMap(encoded=true) TelcoProductServicesTelcoQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>telcoProductServicesTelco</code> method in a fluent style.
   */
  public static class TelcoProductServicesTelcoQueryParams extends HashMap<String, Object> {
    public TelcoProductServicesTelcoQueryParams sessionId(final String value) {
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
   * @return TelcoProductSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TelcoProductSystemAttributesResponse telcoProductSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, TelcoProductSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>telcoProductSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TelcoProductSystemAttributesResponse> telcoProductSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TelcoProductSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>telcoProductSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TelcoProductSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TelcoProductSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TelcoProductSystemAttributesResponse telcoProductSystemAttributes(@Param("elid") String elid, TelcoProductSystemAttributesRequest body, @QueryMap(encoded=true) TelcoProductSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>telcoProductSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TelcoProductSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TelcoProductSystemAttributesResponse> telcoProductSystemAttributesWithHttpInfo(@Param("elid") String elid, TelcoProductSystemAttributesRequest body, @QueryMap(encoded=true) TelcoProductSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>telcoProductSystemAttributes</code> method in a fluent style.
   */
  public static class TelcoProductSystemAttributesQueryParams extends HashMap<String, Object> {
    public TelcoProductSystemAttributesQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesTelcoProductResponse
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesTelcoProductResponse updateSystemAttributesTelcoProduct(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesTelcoProductRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesTelcoProduct</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesTelcoProductResponse> updateSystemAttributesTelcoProductWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesTelcoProductRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesTelcoProduct</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesTelcoProductQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesTelcoProductResponse
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesTelcoProductResponse updateSystemAttributesTelcoProduct(@Param("elid") String elid, UpdateSystemAttributesTelcoProductRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesTelcoProductQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesTelcoProduct</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesTelcoProductResponse
      */
      @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesTelcoProductResponse> updateSystemAttributesTelcoProductWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesTelcoProductRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesTelcoProductQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesTelcoProduct</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesTelcoProductQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesTelcoProductQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Telco product
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateTelcoProductResponse
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateTelcoProductResponse updateTelcoProduct(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateTelcoProductRequestData body);

  /**
   * Modify
   * Similar to <code>updateTelcoProduct</code> but it also returns the http response headers .
   * Modify Telco product
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateTelcoProductResponse> updateTelcoProductWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateTelcoProductRequestData body);


  /**
   * Modify
   * Modify Telco product
   * Note, this is equivalent to the other <code>updateTelcoProduct</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateTelcoProductQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateTelcoProductResponse
   */
  @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateTelcoProductResponse updateTelcoProduct(@Param("elid") String elid, UpdateTelcoProductRequestData body, @QueryMap(encoded=true) UpdateTelcoProductQueryParams queryParams);

  /**
  * Modify
  * Modify Telco product
  * Note, this is equivalent to the other <code>updateTelcoProduct</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateTelcoProductResponse
      */
      @RequestLine("POST /api/rest/entity/telcoProduct/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateTelcoProductResponse> updateTelcoProductWithHttpInfo(@Param("elid") String elid, UpdateTelcoProductRequestData body, @QueryMap(encoded=true) UpdateTelcoProductQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateTelcoProduct</code> method in a fluent style.
   */
  public static class UpdateTelcoProductQueryParams extends HashMap<String, Object> {
    public UpdateTelcoProductQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
