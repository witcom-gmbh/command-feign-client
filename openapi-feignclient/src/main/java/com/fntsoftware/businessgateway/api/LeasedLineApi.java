package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.LeasedLineContractsRequestData;
import com.fntsoftware.businessgateway.entities.LeasedLineContractsResponseData;
import com.fntsoftware.businessgateway.entities.LeasedLineCustomServicesTelcoRequestData;
import com.fntsoftware.businessgateway.entities.LeasedLineCustomServicesTelcoResponseData;
import com.fntsoftware.businessgateway.entities.LeasedLineCustomTcoInterconnectRequestData;
import com.fntsoftware.businessgateway.entities.LeasedLineCustomTcoInterconnectResponseData;
import com.fntsoftware.businessgateway.entities.LeasedLineFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.LeasedLineFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.LeasedLineMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.LeasedLineMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.LeasedLineOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.LeasedLineOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.LeasedLinePersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.LeasedLinePersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.LeasedLinePersonsRequestData;
import com.fntsoftware.businessgateway.entities.LeasedLinePersonsResponseData;
import com.fntsoftware.businessgateway.entities.LeasedLineQueryRequest;
import com.fntsoftware.businessgateway.entities.LeasedLineQueryResponse;
import com.fntsoftware.businessgateway.entities.LeasedLineServicesRequest;
import com.fntsoftware.businessgateway.entities.LeasedLineServicesResponse;
import com.fntsoftware.businessgateway.entities.LeasedLineSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.LeasedLineSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateLeasedLineRequestData;
import com.fntsoftware.businessgateway.entities.UpdateLeasedLineResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesLeasedLineRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesLeasedLineResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface LeasedLineApi extends ApiClient.Api {


  /**
   * Get relations to Contract entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return LeasedLineContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/leasedLine/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LeasedLineContractsResponseData leasedLineContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, LeasedLineContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>leasedLineContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/leasedLine/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LeasedLineContractsResponseData> leasedLineContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LeasedLineContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>leasedLineContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LeasedLineContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LeasedLineContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/leasedLine/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LeasedLineContractsResponseData leasedLineContracts(@Param("elid") String elid, LeasedLineContractsRequestData body, @QueryMap(encoded=true) LeasedLineContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>leasedLineContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LeasedLineContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/leasedLine/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LeasedLineContractsResponseData> leasedLineContractsWithHttpInfo(@Param("elid") String elid, LeasedLineContractsRequestData body, @QueryMap(encoded=true) LeasedLineContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>leasedLineContracts</code> method in a fluent style.
   */
  public static class LeasedLineContractsQueryParams extends HashMap<String, Object> {
    public LeasedLineContractsQueryParams sessionId(final String value) {
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
   * @return LeasedLineCustomServicesTelcoResponseData
   */
  @RequestLine("POST /api/rest/entity/leasedLine/{elid}/CustomServicesTelco?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LeasedLineCustomServicesTelcoResponseData leasedLineCustomServicesTelco(@Param("sessionId") String sessionId, @Param("elid") String elid, LeasedLineCustomServicesTelcoRequestData body);

  /**
   * Get relations to Service (Telco) entities
   * Similar to <code>leasedLineCustomServicesTelco</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/leasedLine/{elid}/CustomServicesTelco?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LeasedLineCustomServicesTelcoResponseData> leasedLineCustomServicesTelcoWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LeasedLineCustomServicesTelcoRequestData body);


  /**
   * Get relations to Service (Telco) entities
   * 
   * Note, this is equivalent to the other <code>leasedLineCustomServicesTelco</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LeasedLineCustomServicesTelcoQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LeasedLineCustomServicesTelcoResponseData
   */
  @RequestLine("POST /api/rest/entity/leasedLine/{elid}/CustomServicesTelco?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LeasedLineCustomServicesTelcoResponseData leasedLineCustomServicesTelco(@Param("elid") String elid, LeasedLineCustomServicesTelcoRequestData body, @QueryMap(encoded=true) LeasedLineCustomServicesTelcoQueryParams queryParams);

  /**
  * Get relations to Service (Telco) entities
  * 
  * Note, this is equivalent to the other <code>leasedLineCustomServicesTelco</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LeasedLineCustomServicesTelcoResponseData
      */
      @RequestLine("POST /api/rest/entity/leasedLine/{elid}/CustomServicesTelco?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LeasedLineCustomServicesTelcoResponseData> leasedLineCustomServicesTelcoWithHttpInfo(@Param("elid") String elid, LeasedLineCustomServicesTelcoRequestData body, @QueryMap(encoded=true) LeasedLineCustomServicesTelcoQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>leasedLineCustomServicesTelco</code> method in a fluent style.
   */
  public static class LeasedLineCustomServicesTelcoQueryParams extends HashMap<String, Object> {
    public LeasedLineCustomServicesTelcoQueryParams sessionId(final String value) {
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
   * @return LeasedLineCustomTcoInterconnectResponseData
   */
  @RequestLine("POST /api/rest/entity/leasedLine/{elid}/CustomTcoInterconnect?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LeasedLineCustomTcoInterconnectResponseData leasedLineCustomTcoInterconnect(@Param("sessionId") String sessionId, @Param("elid") String elid, LeasedLineCustomTcoInterconnectRequestData body);

  /**
   * Get relations to Telco-Interconnect entities
   * Similar to <code>leasedLineCustomTcoInterconnect</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/leasedLine/{elid}/CustomTcoInterconnect?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LeasedLineCustomTcoInterconnectResponseData> leasedLineCustomTcoInterconnectWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LeasedLineCustomTcoInterconnectRequestData body);


  /**
   * Get relations to Telco-Interconnect entities
   * 
   * Note, this is equivalent to the other <code>leasedLineCustomTcoInterconnect</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LeasedLineCustomTcoInterconnectQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LeasedLineCustomTcoInterconnectResponseData
   */
  @RequestLine("POST /api/rest/entity/leasedLine/{elid}/CustomTcoInterconnect?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LeasedLineCustomTcoInterconnectResponseData leasedLineCustomTcoInterconnect(@Param("elid") String elid, LeasedLineCustomTcoInterconnectRequestData body, @QueryMap(encoded=true) LeasedLineCustomTcoInterconnectQueryParams queryParams);

  /**
  * Get relations to Telco-Interconnect entities
  * 
  * Note, this is equivalent to the other <code>leasedLineCustomTcoInterconnect</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LeasedLineCustomTcoInterconnectResponseData
      */
      @RequestLine("POST /api/rest/entity/leasedLine/{elid}/CustomTcoInterconnect?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LeasedLineCustomTcoInterconnectResponseData> leasedLineCustomTcoInterconnectWithHttpInfo(@Param("elid") String elid, LeasedLineCustomTcoInterconnectRequestData body, @QueryMap(encoded=true) LeasedLineCustomTcoInterconnectQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>leasedLineCustomTcoInterconnect</code> method in a fluent style.
   */
  public static class LeasedLineCustomTcoInterconnectQueryParams extends HashMap<String, Object> {
    public LeasedLineCustomTcoInterconnectQueryParams sessionId(final String value) {
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
   * @return LeasedLineFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/leasedLine/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LeasedLineFrameContractsResponseData leasedLineFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, LeasedLineFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>leasedLineFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/leasedLine/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LeasedLineFrameContractsResponseData> leasedLineFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LeasedLineFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>leasedLineFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LeasedLineFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LeasedLineFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/leasedLine/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LeasedLineFrameContractsResponseData leasedLineFrameContracts(@Param("elid") String elid, LeasedLineFrameContractsRequestData body, @QueryMap(encoded=true) LeasedLineFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>leasedLineFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LeasedLineFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/leasedLine/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LeasedLineFrameContractsResponseData> leasedLineFrameContractsWithHttpInfo(@Param("elid") String elid, LeasedLineFrameContractsRequestData body, @QueryMap(encoded=true) LeasedLineFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>leasedLineFrameContracts</code> method in a fluent style.
   */
  public static class LeasedLineFrameContractsQueryParams extends HashMap<String, Object> {
    public LeasedLineFrameContractsQueryParams sessionId(final String value) {
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
   * @return LeasedLineMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/leasedLine/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LeasedLineMaintenanceContractsResponseData leasedLineMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, LeasedLineMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>leasedLineMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/leasedLine/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LeasedLineMaintenanceContractsResponseData> leasedLineMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LeasedLineMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>leasedLineMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LeasedLineMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LeasedLineMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/leasedLine/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LeasedLineMaintenanceContractsResponseData leasedLineMaintenanceContracts(@Param("elid") String elid, LeasedLineMaintenanceContractsRequestData body, @QueryMap(encoded=true) LeasedLineMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>leasedLineMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LeasedLineMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/leasedLine/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LeasedLineMaintenanceContractsResponseData> leasedLineMaintenanceContractsWithHttpInfo(@Param("elid") String elid, LeasedLineMaintenanceContractsRequestData body, @QueryMap(encoded=true) LeasedLineMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>leasedLineMaintenanceContracts</code> method in a fluent style.
   */
  public static class LeasedLineMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public LeasedLineMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return LeasedLineOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/leasedLine/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LeasedLineOrganizationsResponseData leasedLineOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, LeasedLineOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>leasedLineOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/leasedLine/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LeasedLineOrganizationsResponseData> leasedLineOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LeasedLineOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>leasedLineOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LeasedLineOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LeasedLineOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/leasedLine/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LeasedLineOrganizationsResponseData leasedLineOrganizations(@Param("elid") String elid, LeasedLineOrganizationsRequestData body, @QueryMap(encoded=true) LeasedLineOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>leasedLineOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LeasedLineOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/leasedLine/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LeasedLineOrganizationsResponseData> leasedLineOrganizationsWithHttpInfo(@Param("elid") String elid, LeasedLineOrganizationsRequestData body, @QueryMap(encoded=true) LeasedLineOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>leasedLineOrganizations</code> method in a fluent style.
   */
  public static class LeasedLineOrganizationsQueryParams extends HashMap<String, Object> {
    public LeasedLineOrganizationsQueryParams sessionId(final String value) {
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
   * @return LeasedLinePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/leasedLine/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LeasedLinePersonGroupsResponseData leasedLinePersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, LeasedLinePersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>leasedLinePersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/leasedLine/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LeasedLinePersonGroupsResponseData> leasedLinePersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LeasedLinePersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>leasedLinePersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LeasedLinePersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LeasedLinePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/leasedLine/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LeasedLinePersonGroupsResponseData leasedLinePersonGroups(@Param("elid") String elid, LeasedLinePersonGroupsRequestData body, @QueryMap(encoded=true) LeasedLinePersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>leasedLinePersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LeasedLinePersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/leasedLine/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LeasedLinePersonGroupsResponseData> leasedLinePersonGroupsWithHttpInfo(@Param("elid") String elid, LeasedLinePersonGroupsRequestData body, @QueryMap(encoded=true) LeasedLinePersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>leasedLinePersonGroups</code> method in a fluent style.
   */
  public static class LeasedLinePersonGroupsQueryParams extends HashMap<String, Object> {
    public LeasedLinePersonGroupsQueryParams sessionId(final String value) {
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
   * @return LeasedLinePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/leasedLine/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LeasedLinePersonsResponseData leasedLinePersons(@Param("sessionId") String sessionId, @Param("elid") String elid, LeasedLinePersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>leasedLinePersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/leasedLine/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LeasedLinePersonsResponseData> leasedLinePersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LeasedLinePersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>leasedLinePersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LeasedLinePersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LeasedLinePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/leasedLine/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LeasedLinePersonsResponseData leasedLinePersons(@Param("elid") String elid, LeasedLinePersonsRequestData body, @QueryMap(encoded=true) LeasedLinePersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>leasedLinePersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LeasedLinePersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/leasedLine/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LeasedLinePersonsResponseData> leasedLinePersonsWithHttpInfo(@Param("elid") String elid, LeasedLinePersonsRequestData body, @QueryMap(encoded=true) LeasedLinePersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>leasedLinePersons</code> method in a fluent style.
   */
  public static class LeasedLinePersonsQueryParams extends HashMap<String, Object> {
    public LeasedLinePersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return LeasedLineQueryResponse
   */
  @RequestLine("POST /api/rest/entity/leasedLine/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LeasedLineQueryResponse leasedLineQuery(@Param("sessionId") String sessionId, LeasedLineQueryRequest body);

  /**
   * Basic query
   * Similar to <code>leasedLineQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/leasedLine/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LeasedLineQueryResponse> leasedLineQueryWithHttpInfo(@Param("sessionId") String sessionId, LeasedLineQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>leasedLineQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LeasedLineQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LeasedLineQueryResponse
   */
  @RequestLine("POST /api/rest/entity/leasedLine/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LeasedLineQueryResponse leasedLineQuery(LeasedLineQueryRequest body, @QueryMap(encoded=true) LeasedLineQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>leasedLineQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LeasedLineQueryResponse
      */
      @RequestLine("POST /api/rest/entity/leasedLine/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LeasedLineQueryResponse> leasedLineQueryWithHttpInfo(LeasedLineQueryRequest body, @QueryMap(encoded=true) LeasedLineQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>leasedLineQuery</code> method in a fluent style.
   */
  public static class LeasedLineQueryQueryParams extends HashMap<String, Object> {
    public LeasedLineQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Services
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return LeasedLineServicesResponse
   */
  @RequestLine("POST /api/rest/entity/leasedLine/services?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LeasedLineServicesResponse leasedLineServices(@Param("sessionId") String sessionId, LeasedLineServicesRequest body);

  /**
   * Services
   * Similar to <code>leasedLineServices</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/leasedLine/services?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LeasedLineServicesResponse> leasedLineServicesWithHttpInfo(@Param("sessionId") String sessionId, LeasedLineServicesRequest body);


  /**
   * Services
   * 
   * Note, this is equivalent to the other <code>leasedLineServices</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LeasedLineServicesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LeasedLineServicesResponse
   */
  @RequestLine("POST /api/rest/entity/leasedLine/services?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LeasedLineServicesResponse leasedLineServices(LeasedLineServicesRequest body, @QueryMap(encoded=true) LeasedLineServicesQueryParams queryParams);

  /**
  * Services
  * 
  * Note, this is equivalent to the other <code>leasedLineServices</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LeasedLineServicesResponse
      */
      @RequestLine("POST /api/rest/entity/leasedLine/services?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LeasedLineServicesResponse> leasedLineServicesWithHttpInfo(LeasedLineServicesRequest body, @QueryMap(encoded=true) LeasedLineServicesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>leasedLineServices</code> method in a fluent style.
   */
  public static class LeasedLineServicesQueryParams extends HashMap<String, Object> {
    public LeasedLineServicesQueryParams sessionId(final String value) {
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
   * @return LeasedLineSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/leasedLine/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LeasedLineSystemAttributesResponse leasedLineSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, LeasedLineSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>leasedLineSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/leasedLine/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LeasedLineSystemAttributesResponse> leasedLineSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LeasedLineSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>leasedLineSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LeasedLineSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LeasedLineSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/leasedLine/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LeasedLineSystemAttributesResponse leasedLineSystemAttributes(@Param("elid") String elid, LeasedLineSystemAttributesRequest body, @QueryMap(encoded=true) LeasedLineSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>leasedLineSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LeasedLineSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/leasedLine/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LeasedLineSystemAttributesResponse> leasedLineSystemAttributesWithHttpInfo(@Param("elid") String elid, LeasedLineSystemAttributesRequest body, @QueryMap(encoded=true) LeasedLineSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>leasedLineSystemAttributes</code> method in a fluent style.
   */
  public static class LeasedLineSystemAttributesQueryParams extends HashMap<String, Object> {
    public LeasedLineSystemAttributesQueryParams sessionId(final String value) {
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
   * @return UpdateLeasedLineResponse
   */
  @RequestLine("POST /api/rest/entity/leasedLine/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateLeasedLineResponse updateLeasedLine(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateLeasedLineRequestData body);

  /**
   * Modify
   * Similar to <code>updateLeasedLine</code> but it also returns the http response headers .
   * Modify Cable
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/leasedLine/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateLeasedLineResponse> updateLeasedLineWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateLeasedLineRequestData body);


  /**
   * Modify
   * Modify Cable
   * Note, this is equivalent to the other <code>updateLeasedLine</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateLeasedLineQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateLeasedLineResponse
   */
  @RequestLine("POST /api/rest/entity/leasedLine/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateLeasedLineResponse updateLeasedLine(@Param("elid") String elid, UpdateLeasedLineRequestData body, @QueryMap(encoded=true) UpdateLeasedLineQueryParams queryParams);

  /**
  * Modify
  * Modify Cable
  * Note, this is equivalent to the other <code>updateLeasedLine</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateLeasedLineResponse
      */
      @RequestLine("POST /api/rest/entity/leasedLine/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateLeasedLineResponse> updateLeasedLineWithHttpInfo(@Param("elid") String elid, UpdateLeasedLineRequestData body, @QueryMap(encoded=true) UpdateLeasedLineQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateLeasedLine</code> method in a fluent style.
   */
  public static class UpdateLeasedLineQueryParams extends HashMap<String, Object> {
    public UpdateLeasedLineQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesLeasedLineResponse
   */
  @RequestLine("POST /api/rest/entity/leasedLine/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesLeasedLineResponse updateSystemAttributesLeasedLine(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesLeasedLineRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesLeasedLine</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/leasedLine/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesLeasedLineResponse> updateSystemAttributesLeasedLineWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesLeasedLineRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesLeasedLine</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesLeasedLineQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesLeasedLineResponse
   */
  @RequestLine("POST /api/rest/entity/leasedLine/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesLeasedLineResponse updateSystemAttributesLeasedLine(@Param("elid") String elid, UpdateSystemAttributesLeasedLineRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesLeasedLineQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesLeasedLine</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesLeasedLineResponse
      */
      @RequestLine("POST /api/rest/entity/leasedLine/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesLeasedLineResponse> updateSystemAttributesLeasedLineWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesLeasedLineRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesLeasedLineQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesLeasedLine</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesLeasedLineQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesLeasedLineQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
