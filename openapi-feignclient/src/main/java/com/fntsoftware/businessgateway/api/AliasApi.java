package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.AliasContractsRequestData;
import com.fntsoftware.businessgateway.entities.AliasContractsResponseData;
import com.fntsoftware.businessgateway.entities.AliasDomainRequestData;
import com.fntsoftware.businessgateway.entities.AliasDomainResponseData;
import com.fntsoftware.businessgateway.entities.AliasFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.AliasFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.AliasHostnameRequestData;
import com.fntsoftware.businessgateway.entities.AliasHostnameResponseData;
import com.fntsoftware.businessgateway.entities.AliasMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.AliasMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.AliasOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.AliasOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.AliasPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.AliasPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.AliasPersonsRequestData;
import com.fntsoftware.businessgateway.entities.AliasPersonsResponseData;
import com.fntsoftware.businessgateway.entities.AliasQueryRequest;
import com.fntsoftware.businessgateway.entities.AliasQueryResponse;
import com.fntsoftware.businessgateway.entities.AliasSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.AliasSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.DeleteAliasRequestData;
import com.fntsoftware.businessgateway.entities.DeleteAliasResponse;
import com.fntsoftware.businessgateway.entities.UpdateAliasRequestData;
import com.fntsoftware.businessgateway.entities.UpdateAliasResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesAliasRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesAliasResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface AliasApi extends ApiClient.Api {


  /**
   * Get relations to Contract entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return AliasContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/alias/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AliasContractsResponseData aliasContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, AliasContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>aliasContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/alias/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AliasContractsResponseData> aliasContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AliasContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>aliasContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AliasContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AliasContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/alias/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AliasContractsResponseData aliasContracts(@Param("elid") String elid, AliasContractsRequestData body, @QueryMap(encoded=true) AliasContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>aliasContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AliasContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/alias/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AliasContractsResponseData> aliasContractsWithHttpInfo(@Param("elid") String elid, AliasContractsRequestData body, @QueryMap(encoded=true) AliasContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>aliasContracts</code> method in a fluent style.
   */
  public static class AliasContractsQueryParams extends HashMap<String, Object> {
    public AliasContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Domain entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return AliasDomainResponseData
   */
  @RequestLine("POST /api/rest/entity/alias/{elid}/Domain?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AliasDomainResponseData aliasDomain(@Param("sessionId") String sessionId, @Param("elid") String elid, AliasDomainRequestData body);

  /**
   * Get relations to Domain entities
   * Similar to <code>aliasDomain</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/alias/{elid}/Domain?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AliasDomainResponseData> aliasDomainWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AliasDomainRequestData body);


  /**
   * Get relations to Domain entities
   * 
   * Note, this is equivalent to the other <code>aliasDomain</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AliasDomainQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AliasDomainResponseData
   */
  @RequestLine("POST /api/rest/entity/alias/{elid}/Domain?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AliasDomainResponseData aliasDomain(@Param("elid") String elid, AliasDomainRequestData body, @QueryMap(encoded=true) AliasDomainQueryParams queryParams);

  /**
  * Get relations to Domain entities
  * 
  * Note, this is equivalent to the other <code>aliasDomain</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AliasDomainResponseData
      */
      @RequestLine("POST /api/rest/entity/alias/{elid}/Domain?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AliasDomainResponseData> aliasDomainWithHttpInfo(@Param("elid") String elid, AliasDomainRequestData body, @QueryMap(encoded=true) AliasDomainQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>aliasDomain</code> method in a fluent style.
   */
  public static class AliasDomainQueryParams extends HashMap<String, Object> {
    public AliasDomainQueryParams sessionId(final String value) {
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
   * @return AliasFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/alias/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AliasFrameContractsResponseData aliasFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, AliasFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>aliasFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/alias/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AliasFrameContractsResponseData> aliasFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AliasFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>aliasFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AliasFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AliasFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/alias/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AliasFrameContractsResponseData aliasFrameContracts(@Param("elid") String elid, AliasFrameContractsRequestData body, @QueryMap(encoded=true) AliasFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>aliasFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AliasFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/alias/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AliasFrameContractsResponseData> aliasFrameContractsWithHttpInfo(@Param("elid") String elid, AliasFrameContractsRequestData body, @QueryMap(encoded=true) AliasFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>aliasFrameContracts</code> method in a fluent style.
   */
  public static class AliasFrameContractsQueryParams extends HashMap<String, Object> {
    public AliasFrameContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Hostname entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return AliasHostnameResponseData
   */
  @RequestLine("POST /api/rest/entity/alias/{elid}/Hostname?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AliasHostnameResponseData aliasHostname(@Param("sessionId") String sessionId, @Param("elid") String elid, AliasHostnameRequestData body);

  /**
   * Get relations to Hostname entities
   * Similar to <code>aliasHostname</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/alias/{elid}/Hostname?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AliasHostnameResponseData> aliasHostnameWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AliasHostnameRequestData body);


  /**
   * Get relations to Hostname entities
   * 
   * Note, this is equivalent to the other <code>aliasHostname</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AliasHostnameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AliasHostnameResponseData
   */
  @RequestLine("POST /api/rest/entity/alias/{elid}/Hostname?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AliasHostnameResponseData aliasHostname(@Param("elid") String elid, AliasHostnameRequestData body, @QueryMap(encoded=true) AliasHostnameQueryParams queryParams);

  /**
  * Get relations to Hostname entities
  * 
  * Note, this is equivalent to the other <code>aliasHostname</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AliasHostnameResponseData
      */
      @RequestLine("POST /api/rest/entity/alias/{elid}/Hostname?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AliasHostnameResponseData> aliasHostnameWithHttpInfo(@Param("elid") String elid, AliasHostnameRequestData body, @QueryMap(encoded=true) AliasHostnameQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>aliasHostname</code> method in a fluent style.
   */
  public static class AliasHostnameQueryParams extends HashMap<String, Object> {
    public AliasHostnameQueryParams sessionId(final String value) {
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
   * @return AliasMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/alias/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AliasMaintenanceContractsResponseData aliasMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, AliasMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>aliasMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/alias/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AliasMaintenanceContractsResponseData> aliasMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AliasMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>aliasMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AliasMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AliasMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/alias/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AliasMaintenanceContractsResponseData aliasMaintenanceContracts(@Param("elid") String elid, AliasMaintenanceContractsRequestData body, @QueryMap(encoded=true) AliasMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>aliasMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AliasMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/alias/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AliasMaintenanceContractsResponseData> aliasMaintenanceContractsWithHttpInfo(@Param("elid") String elid, AliasMaintenanceContractsRequestData body, @QueryMap(encoded=true) AliasMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>aliasMaintenanceContracts</code> method in a fluent style.
   */
  public static class AliasMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public AliasMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return AliasOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/alias/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AliasOrganizationsResponseData aliasOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, AliasOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>aliasOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/alias/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AliasOrganizationsResponseData> aliasOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AliasOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>aliasOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AliasOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AliasOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/alias/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AliasOrganizationsResponseData aliasOrganizations(@Param("elid") String elid, AliasOrganizationsRequestData body, @QueryMap(encoded=true) AliasOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>aliasOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AliasOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/alias/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AliasOrganizationsResponseData> aliasOrganizationsWithHttpInfo(@Param("elid") String elid, AliasOrganizationsRequestData body, @QueryMap(encoded=true) AliasOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>aliasOrganizations</code> method in a fluent style.
   */
  public static class AliasOrganizationsQueryParams extends HashMap<String, Object> {
    public AliasOrganizationsQueryParams sessionId(final String value) {
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
   * @return AliasPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/alias/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AliasPersonGroupsResponseData aliasPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, AliasPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>aliasPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/alias/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AliasPersonGroupsResponseData> aliasPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AliasPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>aliasPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AliasPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AliasPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/alias/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AliasPersonGroupsResponseData aliasPersonGroups(@Param("elid") String elid, AliasPersonGroupsRequestData body, @QueryMap(encoded=true) AliasPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>aliasPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AliasPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/alias/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AliasPersonGroupsResponseData> aliasPersonGroupsWithHttpInfo(@Param("elid") String elid, AliasPersonGroupsRequestData body, @QueryMap(encoded=true) AliasPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>aliasPersonGroups</code> method in a fluent style.
   */
  public static class AliasPersonGroupsQueryParams extends HashMap<String, Object> {
    public AliasPersonGroupsQueryParams sessionId(final String value) {
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
   * @return AliasPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/alias/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AliasPersonsResponseData aliasPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, AliasPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>aliasPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/alias/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AliasPersonsResponseData> aliasPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AliasPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>aliasPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AliasPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AliasPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/alias/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AliasPersonsResponseData aliasPersons(@Param("elid") String elid, AliasPersonsRequestData body, @QueryMap(encoded=true) AliasPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>aliasPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AliasPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/alias/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AliasPersonsResponseData> aliasPersonsWithHttpInfo(@Param("elid") String elid, AliasPersonsRequestData body, @QueryMap(encoded=true) AliasPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>aliasPersons</code> method in a fluent style.
   */
  public static class AliasPersonsQueryParams extends HashMap<String, Object> {
    public AliasPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return AliasQueryResponse
   */
  @RequestLine("POST /api/rest/entity/alias/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AliasQueryResponse aliasQuery(@Param("sessionId") String sessionId, AliasQueryRequest body);

  /**
   * Basic query
   * Similar to <code>aliasQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/alias/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AliasQueryResponse> aliasQueryWithHttpInfo(@Param("sessionId") String sessionId, AliasQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data
   * Note, this is equivalent to the other <code>aliasQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AliasQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AliasQueryResponse
   */
  @RequestLine("POST /api/rest/entity/alias/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AliasQueryResponse aliasQuery(AliasQueryRequest body, @QueryMap(encoded=true) AliasQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data
  * Note, this is equivalent to the other <code>aliasQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AliasQueryResponse
      */
      @RequestLine("POST /api/rest/entity/alias/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AliasQueryResponse> aliasQueryWithHttpInfo(AliasQueryRequest body, @QueryMap(encoded=true) AliasQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>aliasQuery</code> method in a fluent style.
   */
  public static class AliasQueryQueryParams extends HashMap<String, Object> {
    public AliasQueryQueryParams sessionId(final String value) {
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
   * @return AliasSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/alias/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AliasSystemAttributesResponse aliasSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, AliasSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>aliasSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/alias/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AliasSystemAttributesResponse> aliasSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AliasSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>aliasSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AliasSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AliasSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/alias/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AliasSystemAttributesResponse aliasSystemAttributes(@Param("elid") String elid, AliasSystemAttributesRequest body, @QueryMap(encoded=true) AliasSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>aliasSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AliasSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/alias/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AliasSystemAttributesResponse> aliasSystemAttributesWithHttpInfo(@Param("elid") String elid, AliasSystemAttributesRequest body, @QueryMap(encoded=true) AliasSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>aliasSystemAttributes</code> method in a fluent style.
   */
  public static class AliasSystemAttributesQueryParams extends HashMap<String, Object> {
    public AliasSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Alias
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteAliasResponse
   */
  @RequestLine("POST /api/rest/entity/alias/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteAliasResponse deleteAlias(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteAliasRequestData body);

  /**
   * Delete
   * Similar to <code>deleteAlias</code> but it also returns the http response headers .
   * Delete Alias
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/alias/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteAliasResponse> deleteAliasWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteAliasRequestData body);


  /**
   * Delete
   * Delete Alias
   * Note, this is equivalent to the other <code>deleteAlias</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteAliasQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteAliasResponse
   */
  @RequestLine("POST /api/rest/entity/alias/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteAliasResponse deleteAlias(@Param("elid") String elid, DeleteAliasRequestData body, @QueryMap(encoded=true) DeleteAliasQueryParams queryParams);

  /**
  * Delete
  * Delete Alias
  * Note, this is equivalent to the other <code>deleteAlias</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteAliasResponse
      */
      @RequestLine("POST /api/rest/entity/alias/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteAliasResponse> deleteAliasWithHttpInfo(@Param("elid") String elid, DeleteAliasRequestData body, @QueryMap(encoded=true) DeleteAliasQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteAlias</code> method in a fluent style.
   */
  public static class DeleteAliasQueryParams extends HashMap<String, Object> {
    public DeleteAliasQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Alias
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateAliasResponse
   */
  @RequestLine("POST /api/rest/entity/alias/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateAliasResponse updateAlias(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateAliasRequestData body);

  /**
   * Modify
   * Similar to <code>updateAlias</code> but it also returns the http response headers .
   * Modify Alias
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/alias/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateAliasResponse> updateAliasWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateAliasRequestData body);


  /**
   * Modify
   * Modify Alias
   * Note, this is equivalent to the other <code>updateAlias</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateAliasQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateAliasResponse
   */
  @RequestLine("POST /api/rest/entity/alias/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateAliasResponse updateAlias(@Param("elid") String elid, UpdateAliasRequestData body, @QueryMap(encoded=true) UpdateAliasQueryParams queryParams);

  /**
  * Modify
  * Modify Alias
  * Note, this is equivalent to the other <code>updateAlias</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateAliasResponse
      */
      @RequestLine("POST /api/rest/entity/alias/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateAliasResponse> updateAliasWithHttpInfo(@Param("elid") String elid, UpdateAliasRequestData body, @QueryMap(encoded=true) UpdateAliasQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateAlias</code> method in a fluent style.
   */
  public static class UpdateAliasQueryParams extends HashMap<String, Object> {
    public UpdateAliasQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesAliasResponse
   */
  @RequestLine("POST /api/rest/entity/alias/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesAliasResponse updateSystemAttributesAlias(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesAliasRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesAlias</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/alias/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesAliasResponse> updateSystemAttributesAliasWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesAliasRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesAlias</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesAliasQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesAliasResponse
   */
  @RequestLine("POST /api/rest/entity/alias/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesAliasResponse updateSystemAttributesAlias(@Param("elid") String elid, UpdateSystemAttributesAliasRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesAliasQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesAlias</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesAliasResponse
      */
      @RequestLine("POST /api/rest/entity/alias/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesAliasResponse> updateSystemAttributesAliasWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesAliasRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesAliasQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesAlias</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesAliasQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesAliasQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
