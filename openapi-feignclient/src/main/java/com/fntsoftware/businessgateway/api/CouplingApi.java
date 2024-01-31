package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.ChangeTypeCouplingRequestData;
import com.fntsoftware.businessgateway.entities.ChangeTypeCouplingResponse;
import com.fntsoftware.businessgateway.entities.CouplingContractsRequestData;
import com.fntsoftware.businessgateway.entities.CouplingContractsResponseData;
import com.fntsoftware.businessgateway.entities.CouplingCouplingTypeRequestData;
import com.fntsoftware.businessgateway.entities.CouplingCouplingTypeResponseData;
import com.fntsoftware.businessgateway.entities.CouplingDuctTypesRequest;
import com.fntsoftware.businessgateway.entities.CouplingDuctTypesResponse;
import com.fntsoftware.businessgateway.entities.CouplingDuctsRequestData;
import com.fntsoftware.businessgateway.entities.CouplingDuctsResponseData;
import com.fntsoftware.businessgateway.entities.CouplingFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.CouplingFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.CouplingMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.CouplingMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.CouplingOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.CouplingOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.CouplingPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.CouplingPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.CouplingPersonsRequestData;
import com.fntsoftware.businessgateway.entities.CouplingPersonsResponseData;
import com.fntsoftware.businessgateway.entities.CouplingQueryGeolocationRequest;
import com.fntsoftware.businessgateway.entities.CouplingQueryGeolocationResponse;
import com.fntsoftware.businessgateway.entities.CouplingQueryRequest;
import com.fntsoftware.businessgateway.entities.CouplingQueryResponse;
import com.fntsoftware.businessgateway.entities.CouplingSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.CouplingSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.CouplingZoneRequestData;
import com.fntsoftware.businessgateway.entities.CouplingZoneResponseData;
import com.fntsoftware.businessgateway.entities.CreateCouplingRequestData;
import com.fntsoftware.businessgateway.entities.CreateCouplingResponse;
import com.fntsoftware.businessgateway.entities.DeleteCouplingRequestData;
import com.fntsoftware.businessgateway.entities.DeleteCouplingResponse;
import com.fntsoftware.businessgateway.entities.GenerateIdCouplingRequestData;
import com.fntsoftware.businessgateway.entities.GenerateIdCouplingResponse;
import com.fntsoftware.businessgateway.entities.UpdateCouplingRequestData;
import com.fntsoftware.businessgateway.entities.UpdateCouplingResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCouplingRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCouplingResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface CouplingApi extends ApiClient.Api {


  /**
   * Replace coupler type
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ChangeTypeCouplingResponse
   */
  @RequestLine("POST /api/rest/entity/coupling/{elid}/changeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeTypeCouplingResponse changeTypeCoupling(@Param("sessionId") String sessionId, @Param("elid") String elid, ChangeTypeCouplingRequestData body);

  /**
   * Replace coupler type
   * Similar to <code>changeTypeCoupling</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/coupling/{elid}/changeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeTypeCouplingResponse> changeTypeCouplingWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChangeTypeCouplingRequestData body);


  /**
   * Replace coupler type
   * 
   * Note, this is equivalent to the other <code>changeTypeCoupling</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChangeTypeCouplingQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChangeTypeCouplingResponse
   */
  @RequestLine("POST /api/rest/entity/coupling/{elid}/changeType?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChangeTypeCouplingResponse changeTypeCoupling(@Param("elid") String elid, ChangeTypeCouplingRequestData body, @QueryMap(encoded=true) ChangeTypeCouplingQueryParams queryParams);

  /**
  * Replace coupler type
  * 
  * Note, this is equivalent to the other <code>changeTypeCoupling</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChangeTypeCouplingResponse
      */
      @RequestLine("POST /api/rest/entity/coupling/{elid}/changeType?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChangeTypeCouplingResponse> changeTypeCouplingWithHttpInfo(@Param("elid") String elid, ChangeTypeCouplingRequestData body, @QueryMap(encoded=true) ChangeTypeCouplingQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>changeTypeCoupling</code> method in a fluent style.
   */
  public static class ChangeTypeCouplingQueryParams extends HashMap<String, Object> {
    public ChangeTypeCouplingQueryParams sessionId(final String value) {
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
   * @return CouplingContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/coupling/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CouplingContractsResponseData couplingContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, CouplingContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>couplingContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/coupling/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CouplingContractsResponseData> couplingContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CouplingContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>couplingContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CouplingContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CouplingContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/coupling/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CouplingContractsResponseData couplingContracts(@Param("elid") String elid, CouplingContractsRequestData body, @QueryMap(encoded=true) CouplingContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>couplingContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CouplingContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/coupling/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CouplingContractsResponseData> couplingContractsWithHttpInfo(@Param("elid") String elid, CouplingContractsRequestData body, @QueryMap(encoded=true) CouplingContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>couplingContracts</code> method in a fluent style.
   */
  public static class CouplingContractsQueryParams extends HashMap<String, Object> {
    public CouplingContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Coupler type entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CouplingCouplingTypeResponseData
   */
  @RequestLine("POST /api/rest/entity/coupling/{elid}/CouplingType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CouplingCouplingTypeResponseData couplingCouplingType(@Param("sessionId") String sessionId, @Param("elid") String elid, CouplingCouplingTypeRequestData body);

  /**
   * Get relations to Coupler type entities
   * Similar to <code>couplingCouplingType</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/coupling/{elid}/CouplingType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CouplingCouplingTypeResponseData> couplingCouplingTypeWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CouplingCouplingTypeRequestData body);


  /**
   * Get relations to Coupler type entities
   * 
   * Note, this is equivalent to the other <code>couplingCouplingType</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CouplingCouplingTypeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CouplingCouplingTypeResponseData
   */
  @RequestLine("POST /api/rest/entity/coupling/{elid}/CouplingType?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CouplingCouplingTypeResponseData couplingCouplingType(@Param("elid") String elid, CouplingCouplingTypeRequestData body, @QueryMap(encoded=true) CouplingCouplingTypeQueryParams queryParams);

  /**
  * Get relations to Coupler type entities
  * 
  * Note, this is equivalent to the other <code>couplingCouplingType</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CouplingCouplingTypeResponseData
      */
      @RequestLine("POST /api/rest/entity/coupling/{elid}/CouplingType?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CouplingCouplingTypeResponseData> couplingCouplingTypeWithHttpInfo(@Param("elid") String elid, CouplingCouplingTypeRequestData body, @QueryMap(encoded=true) CouplingCouplingTypeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>couplingCouplingType</code> method in a fluent style.
   */
  public static class CouplingCouplingTypeQueryParams extends HashMap<String, Object> {
    public CouplingCouplingTypeQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Duct Types
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CouplingDuctTypesResponse
   */
  @RequestLine("POST /api/rest/entity/coupling/{elid}/DuctTypes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CouplingDuctTypesResponse couplingDuctTypes(@Param("sessionId") String sessionId, @Param("elid") String elid, CouplingDuctTypesRequest body);

  /**
   * Duct Types
   * Similar to <code>couplingDuctTypes</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/coupling/{elid}/DuctTypes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CouplingDuctTypesResponse> couplingDuctTypesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CouplingDuctTypesRequest body);


  /**
   * Duct Types
   * 
   * Note, this is equivalent to the other <code>couplingDuctTypes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CouplingDuctTypesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CouplingDuctTypesResponse
   */
  @RequestLine("POST /api/rest/entity/coupling/{elid}/DuctTypes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CouplingDuctTypesResponse couplingDuctTypes(@Param("elid") String elid, CouplingDuctTypesRequest body, @QueryMap(encoded=true) CouplingDuctTypesQueryParams queryParams);

  /**
  * Duct Types
  * 
  * Note, this is equivalent to the other <code>couplingDuctTypes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CouplingDuctTypesResponse
      */
      @RequestLine("POST /api/rest/entity/coupling/{elid}/DuctTypes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CouplingDuctTypesResponse> couplingDuctTypesWithHttpInfo(@Param("elid") String elid, CouplingDuctTypesRequest body, @QueryMap(encoded=true) CouplingDuctTypesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>couplingDuctTypes</code> method in a fluent style.
   */
  public static class CouplingDuctTypesQueryParams extends HashMap<String, Object> {
    public CouplingDuctTypesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Duct entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CouplingDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/coupling/{elid}/Ducts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CouplingDuctsResponseData couplingDucts(@Param("sessionId") String sessionId, @Param("elid") String elid, CouplingDuctsRequestData body);

  /**
   * Get relations to Duct entities
   * Similar to <code>couplingDucts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/coupling/{elid}/Ducts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CouplingDuctsResponseData> couplingDuctsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CouplingDuctsRequestData body);


  /**
   * Get relations to Duct entities
   * 
   * Note, this is equivalent to the other <code>couplingDucts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CouplingDuctsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CouplingDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/coupling/{elid}/Ducts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CouplingDuctsResponseData couplingDucts(@Param("elid") String elid, CouplingDuctsRequestData body, @QueryMap(encoded=true) CouplingDuctsQueryParams queryParams);

  /**
  * Get relations to Duct entities
  * 
  * Note, this is equivalent to the other <code>couplingDucts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CouplingDuctsResponseData
      */
      @RequestLine("POST /api/rest/entity/coupling/{elid}/Ducts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CouplingDuctsResponseData> couplingDuctsWithHttpInfo(@Param("elid") String elid, CouplingDuctsRequestData body, @QueryMap(encoded=true) CouplingDuctsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>couplingDucts</code> method in a fluent style.
   */
  public static class CouplingDuctsQueryParams extends HashMap<String, Object> {
    public CouplingDuctsQueryParams sessionId(final String value) {
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
   * @return CouplingFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/coupling/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CouplingFrameContractsResponseData couplingFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, CouplingFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>couplingFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/coupling/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CouplingFrameContractsResponseData> couplingFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CouplingFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>couplingFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CouplingFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CouplingFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/coupling/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CouplingFrameContractsResponseData couplingFrameContracts(@Param("elid") String elid, CouplingFrameContractsRequestData body, @QueryMap(encoded=true) CouplingFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>couplingFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CouplingFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/coupling/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CouplingFrameContractsResponseData> couplingFrameContractsWithHttpInfo(@Param("elid") String elid, CouplingFrameContractsRequestData body, @QueryMap(encoded=true) CouplingFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>couplingFrameContracts</code> method in a fluent style.
   */
  public static class CouplingFrameContractsQueryParams extends HashMap<String, Object> {
    public CouplingFrameContractsQueryParams sessionId(final String value) {
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
   * @return CouplingMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/coupling/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CouplingMaintenanceContractsResponseData couplingMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, CouplingMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>couplingMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/coupling/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CouplingMaintenanceContractsResponseData> couplingMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CouplingMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>couplingMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CouplingMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CouplingMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/coupling/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CouplingMaintenanceContractsResponseData couplingMaintenanceContracts(@Param("elid") String elid, CouplingMaintenanceContractsRequestData body, @QueryMap(encoded=true) CouplingMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>couplingMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CouplingMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/coupling/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CouplingMaintenanceContractsResponseData> couplingMaintenanceContractsWithHttpInfo(@Param("elid") String elid, CouplingMaintenanceContractsRequestData body, @QueryMap(encoded=true) CouplingMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>couplingMaintenanceContracts</code> method in a fluent style.
   */
  public static class CouplingMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public CouplingMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return CouplingOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/coupling/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CouplingOrganizationsResponseData couplingOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, CouplingOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>couplingOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/coupling/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CouplingOrganizationsResponseData> couplingOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CouplingOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>couplingOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CouplingOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CouplingOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/coupling/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CouplingOrganizationsResponseData couplingOrganizations(@Param("elid") String elid, CouplingOrganizationsRequestData body, @QueryMap(encoded=true) CouplingOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>couplingOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CouplingOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/coupling/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CouplingOrganizationsResponseData> couplingOrganizationsWithHttpInfo(@Param("elid") String elid, CouplingOrganizationsRequestData body, @QueryMap(encoded=true) CouplingOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>couplingOrganizations</code> method in a fluent style.
   */
  public static class CouplingOrganizationsQueryParams extends HashMap<String, Object> {
    public CouplingOrganizationsQueryParams sessionId(final String value) {
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
   * @return CouplingPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/coupling/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CouplingPersonGroupsResponseData couplingPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, CouplingPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>couplingPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/coupling/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CouplingPersonGroupsResponseData> couplingPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CouplingPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>couplingPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CouplingPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CouplingPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/coupling/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CouplingPersonGroupsResponseData couplingPersonGroups(@Param("elid") String elid, CouplingPersonGroupsRequestData body, @QueryMap(encoded=true) CouplingPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>couplingPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CouplingPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/coupling/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CouplingPersonGroupsResponseData> couplingPersonGroupsWithHttpInfo(@Param("elid") String elid, CouplingPersonGroupsRequestData body, @QueryMap(encoded=true) CouplingPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>couplingPersonGroups</code> method in a fluent style.
   */
  public static class CouplingPersonGroupsQueryParams extends HashMap<String, Object> {
    public CouplingPersonGroupsQueryParams sessionId(final String value) {
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
   * @return CouplingPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/coupling/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CouplingPersonsResponseData couplingPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, CouplingPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>couplingPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/coupling/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CouplingPersonsResponseData> couplingPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CouplingPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>couplingPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CouplingPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CouplingPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/coupling/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CouplingPersonsResponseData couplingPersons(@Param("elid") String elid, CouplingPersonsRequestData body, @QueryMap(encoded=true) CouplingPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>couplingPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CouplingPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/coupling/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CouplingPersonsResponseData> couplingPersonsWithHttpInfo(@Param("elid") String elid, CouplingPersonsRequestData body, @QueryMap(encoded=true) CouplingPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>couplingPersons</code> method in a fluent style.
   */
  public static class CouplingPersonsQueryParams extends HashMap<String, Object> {
    public CouplingPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CouplingQueryResponse
   */
  @RequestLine("POST /api/rest/entity/coupling/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CouplingQueryResponse couplingQuery(@Param("sessionId") String sessionId, CouplingQueryRequest body);

  /**
   * Basic query
   * Similar to <code>couplingQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/coupling/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CouplingQueryResponse> couplingQueryWithHttpInfo(@Param("sessionId") String sessionId, CouplingQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>couplingQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CouplingQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CouplingQueryResponse
   */
  @RequestLine("POST /api/rest/entity/coupling/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CouplingQueryResponse couplingQuery(CouplingQueryRequest body, @QueryMap(encoded=true) CouplingQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>couplingQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CouplingQueryResponse
      */
      @RequestLine("POST /api/rest/entity/coupling/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CouplingQueryResponse> couplingQueryWithHttpInfo(CouplingQueryRequest body, @QueryMap(encoded=true) CouplingQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>couplingQuery</code> method in a fluent style.
   */
  public static class CouplingQueryQueryParams extends HashMap<String, Object> {
    public CouplingQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query geolocation
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CouplingQueryGeolocationResponse
   */
  @RequestLine("POST /api/rest/entity/coupling/{elid}/QueryGeolocation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CouplingQueryGeolocationResponse couplingQueryGeolocation(@Param("sessionId") String sessionId, @Param("elid") String elid, CouplingQueryGeolocationRequest body);

  /**
   * Query geolocation
   * Similar to <code>couplingQueryGeolocation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/coupling/{elid}/QueryGeolocation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CouplingQueryGeolocationResponse> couplingQueryGeolocationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CouplingQueryGeolocationRequest body);


  /**
   * Query geolocation
   * 
   * Note, this is equivalent to the other <code>couplingQueryGeolocation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CouplingQueryGeolocationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CouplingQueryGeolocationResponse
   */
  @RequestLine("POST /api/rest/entity/coupling/{elid}/QueryGeolocation?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CouplingQueryGeolocationResponse couplingQueryGeolocation(@Param("elid") String elid, CouplingQueryGeolocationRequest body, @QueryMap(encoded=true) CouplingQueryGeolocationQueryParams queryParams);

  /**
  * Query geolocation
  * 
  * Note, this is equivalent to the other <code>couplingQueryGeolocation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CouplingQueryGeolocationResponse
      */
      @RequestLine("POST /api/rest/entity/coupling/{elid}/QueryGeolocation?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CouplingQueryGeolocationResponse> couplingQueryGeolocationWithHttpInfo(@Param("elid") String elid, CouplingQueryGeolocationRequest body, @QueryMap(encoded=true) CouplingQueryGeolocationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>couplingQueryGeolocation</code> method in a fluent style.
   */
  public static class CouplingQueryGeolocationQueryParams extends HashMap<String, Object> {
    public CouplingQueryGeolocationQueryParams sessionId(final String value) {
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
   * @return CouplingSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/coupling/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CouplingSystemAttributesResponse couplingSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, CouplingSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>couplingSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/coupling/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CouplingSystemAttributesResponse> couplingSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CouplingSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>couplingSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CouplingSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CouplingSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/coupling/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CouplingSystemAttributesResponse couplingSystemAttributes(@Param("elid") String elid, CouplingSystemAttributesRequest body, @QueryMap(encoded=true) CouplingSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>couplingSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CouplingSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/coupling/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CouplingSystemAttributesResponse> couplingSystemAttributesWithHttpInfo(@Param("elid") String elid, CouplingSystemAttributesRequest body, @QueryMap(encoded=true) CouplingSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>couplingSystemAttributes</code> method in a fluent style.
   */
  public static class CouplingSystemAttributesQueryParams extends HashMap<String, Object> {
    public CouplingSystemAttributesQueryParams sessionId(final String value) {
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
   * @return CouplingZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/coupling/{elid}/Zone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CouplingZoneResponseData couplingZone(@Param("sessionId") String sessionId, @Param("elid") String elid, CouplingZoneRequestData body);

  /**
   * Get relations to Zone entities
   * Similar to <code>couplingZone</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/coupling/{elid}/Zone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CouplingZoneResponseData> couplingZoneWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CouplingZoneRequestData body);


  /**
   * Get relations to Zone entities
   * 
   * Note, this is equivalent to the other <code>couplingZone</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CouplingZoneQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CouplingZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/coupling/{elid}/Zone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CouplingZoneResponseData couplingZone(@Param("elid") String elid, CouplingZoneRequestData body, @QueryMap(encoded=true) CouplingZoneQueryParams queryParams);

  /**
  * Get relations to Zone entities
  * 
  * Note, this is equivalent to the other <code>couplingZone</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CouplingZoneResponseData
      */
      @RequestLine("POST /api/rest/entity/coupling/{elid}/Zone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CouplingZoneResponseData> couplingZoneWithHttpInfo(@Param("elid") String elid, CouplingZoneRequestData body, @QueryMap(encoded=true) CouplingZoneQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>couplingZone</code> method in a fluent style.
   */
  public static class CouplingZoneQueryParams extends HashMap<String, Object> {
    public CouplingZoneQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create
   * Create Coupler
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateCouplingResponse
   */
  @RequestLine("POST /api/rest/entity/coupling/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateCouplingResponse createCoupling(@Param("sessionId") String sessionId, CreateCouplingRequestData body);

  /**
   * Create
   * Similar to <code>createCoupling</code> but it also returns the http response headers .
   * Create Coupler
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/coupling/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateCouplingResponse> createCouplingWithHttpInfo(@Param("sessionId") String sessionId, CreateCouplingRequestData body);


  /**
   * Create
   * Create Coupler
   * Note, this is equivalent to the other <code>createCoupling</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateCouplingQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateCouplingResponse
   */
  @RequestLine("POST /api/rest/entity/coupling/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateCouplingResponse createCoupling(CreateCouplingRequestData body, @QueryMap(encoded=true) CreateCouplingQueryParams queryParams);

  /**
  * Create
  * Create Coupler
  * Note, this is equivalent to the other <code>createCoupling</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateCouplingResponse
      */
      @RequestLine("POST /api/rest/entity/coupling/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateCouplingResponse> createCouplingWithHttpInfo(CreateCouplingRequestData body, @QueryMap(encoded=true) CreateCouplingQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createCoupling</code> method in a fluent style.
   */
  public static class CreateCouplingQueryParams extends HashMap<String, Object> {
    public CreateCouplingQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Coupler
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteCouplingResponse
   */
  @RequestLine("POST /api/rest/entity/coupling/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteCouplingResponse deleteCoupling(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCouplingRequestData body);

  /**
   * Delete
   * Similar to <code>deleteCoupling</code> but it also returns the http response headers .
   * Delete Coupler
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/coupling/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteCouplingResponse> deleteCouplingWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCouplingRequestData body);


  /**
   * Delete
   * Delete Coupler
   * Note, this is equivalent to the other <code>deleteCoupling</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteCouplingQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteCouplingResponse
   */
  @RequestLine("POST /api/rest/entity/coupling/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteCouplingResponse deleteCoupling(@Param("elid") String elid, DeleteCouplingRequestData body, @QueryMap(encoded=true) DeleteCouplingQueryParams queryParams);

  /**
  * Delete
  * Delete Coupler
  * Note, this is equivalent to the other <code>deleteCoupling</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteCouplingResponse
      */
      @RequestLine("POST /api/rest/entity/coupling/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteCouplingResponse> deleteCouplingWithHttpInfo(@Param("elid") String elid, DeleteCouplingRequestData body, @QueryMap(encoded=true) DeleteCouplingQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteCoupling</code> method in a fluent style.
   */
  public static class DeleteCouplingQueryParams extends HashMap<String, Object> {
    public DeleteCouplingQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Generate Node-ID
   * Generates an ID that can be used for creating a new node.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return GenerateIdCouplingResponse
   */
  @RequestLine("POST /api/rest/entity/coupling/generateId?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  GenerateIdCouplingResponse generateIdCoupling(@Param("sessionId") String sessionId, GenerateIdCouplingRequestData body);

  /**
   * Generate Node-ID
   * Similar to <code>generateIdCoupling</code> but it also returns the http response headers .
   * Generates an ID that can be used for creating a new node.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/coupling/generateId?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<GenerateIdCouplingResponse> generateIdCouplingWithHttpInfo(@Param("sessionId") String sessionId, GenerateIdCouplingRequestData body);


  /**
   * Generate Node-ID
   * Generates an ID that can be used for creating a new node.
   * Note, this is equivalent to the other <code>generateIdCoupling</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GenerateIdCouplingQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return GenerateIdCouplingResponse
   */
  @RequestLine("POST /api/rest/entity/coupling/generateId?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  GenerateIdCouplingResponse generateIdCoupling(GenerateIdCouplingRequestData body, @QueryMap(encoded=true) GenerateIdCouplingQueryParams queryParams);

  /**
  * Generate Node-ID
  * Generates an ID that can be used for creating a new node.
  * Note, this is equivalent to the other <code>generateIdCoupling</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return GenerateIdCouplingResponse
      */
      @RequestLine("POST /api/rest/entity/coupling/generateId?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<GenerateIdCouplingResponse> generateIdCouplingWithHttpInfo(GenerateIdCouplingRequestData body, @QueryMap(encoded=true) GenerateIdCouplingQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>generateIdCoupling</code> method in a fluent style.
   */
  public static class GenerateIdCouplingQueryParams extends HashMap<String, Object> {
    public GenerateIdCouplingQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Coupler
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateCouplingResponse
   */
  @RequestLine("POST /api/rest/entity/coupling/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateCouplingResponse updateCoupling(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCouplingRequestData body);

  /**
   * Modify
   * Similar to <code>updateCoupling</code> but it also returns the http response headers .
   * Modify Coupler
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/coupling/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateCouplingResponse> updateCouplingWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCouplingRequestData body);


  /**
   * Modify
   * Modify Coupler
   * Note, this is equivalent to the other <code>updateCoupling</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateCouplingQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateCouplingResponse
   */
  @RequestLine("POST /api/rest/entity/coupling/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateCouplingResponse updateCoupling(@Param("elid") String elid, UpdateCouplingRequestData body, @QueryMap(encoded=true) UpdateCouplingQueryParams queryParams);

  /**
  * Modify
  * Modify Coupler
  * Note, this is equivalent to the other <code>updateCoupling</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateCouplingResponse
      */
      @RequestLine("POST /api/rest/entity/coupling/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateCouplingResponse> updateCouplingWithHttpInfo(@Param("elid") String elid, UpdateCouplingRequestData body, @QueryMap(encoded=true) UpdateCouplingQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateCoupling</code> method in a fluent style.
   */
  public static class UpdateCouplingQueryParams extends HashMap<String, Object> {
    public UpdateCouplingQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesCouplingResponse
   */
  @RequestLine("POST /api/rest/entity/coupling/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesCouplingResponse updateSystemAttributesCoupling(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCouplingRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesCoupling</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/coupling/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesCouplingResponse> updateSystemAttributesCouplingWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCouplingRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesCoupling</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesCouplingQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesCouplingResponse
   */
  @RequestLine("POST /api/rest/entity/coupling/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesCouplingResponse updateSystemAttributesCoupling(@Param("elid") String elid, UpdateSystemAttributesCouplingRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCouplingQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesCoupling</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesCouplingResponse
      */
      @RequestLine("POST /api/rest/entity/coupling/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesCouplingResponse> updateSystemAttributesCouplingWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesCouplingRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCouplingQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesCoupling</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesCouplingQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesCouplingQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
