package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.ServiceTypeDefinitionBearersRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTypeDefinitionBearersResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTypeDefinitionContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTypeDefinitionContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTypeDefinitionFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTypeDefinitionFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTypeDefinitionMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTypeDefinitionMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTypeDefinitionOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTypeDefinitionOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTypeDefinitionPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTypeDefinitionPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTypeDefinitionPersonsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTypeDefinitionPersonsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTypeDefinitionQueryRequest;
import com.fntsoftware.businessgateway.entities.ServiceTypeDefinitionQueryResponse;
import com.fntsoftware.businessgateway.entities.ServiceTypeDefinitionServicesTelcoRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTypeDefinitionServicesTelcoResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTypeDefinitionSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.ServiceTypeDefinitionSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesServiceTypeDefinitionRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesServiceTypeDefinitionResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface ServiceTypeDefinitionApi extends ApiClient.Api {


  /**
   * Get relations to Bearer entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServiceTypeDefinitionBearersResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/Bearers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTypeDefinitionBearersResponseData serviceTypeDefinitionBearers(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTypeDefinitionBearersRequestData body);

  /**
   * Get relations to Bearer entities
   * Similar to <code>serviceTypeDefinitionBearers</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/Bearers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTypeDefinitionBearersResponseData> serviceTypeDefinitionBearersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTypeDefinitionBearersRequestData body);


  /**
   * Get relations to Bearer entities
   * 
   * Note, this is equivalent to the other <code>serviceTypeDefinitionBearers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTypeDefinitionBearersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTypeDefinitionBearersResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/Bearers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTypeDefinitionBearersResponseData serviceTypeDefinitionBearers(@Param("elid") String elid, ServiceTypeDefinitionBearersRequestData body, @QueryMap(encoded=true) ServiceTypeDefinitionBearersQueryParams queryParams);

  /**
  * Get relations to Bearer entities
  * 
  * Note, this is equivalent to the other <code>serviceTypeDefinitionBearers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTypeDefinitionBearersResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/Bearers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTypeDefinitionBearersResponseData> serviceTypeDefinitionBearersWithHttpInfo(@Param("elid") String elid, ServiceTypeDefinitionBearersRequestData body, @QueryMap(encoded=true) ServiceTypeDefinitionBearersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTypeDefinitionBearers</code> method in a fluent style.
   */
  public static class ServiceTypeDefinitionBearersQueryParams extends HashMap<String, Object> {
    public ServiceTypeDefinitionBearersQueryParams sessionId(final String value) {
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
   * @return ServiceTypeDefinitionContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTypeDefinitionContractsResponseData serviceTypeDefinitionContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTypeDefinitionContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>serviceTypeDefinitionContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTypeDefinitionContractsResponseData> serviceTypeDefinitionContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTypeDefinitionContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>serviceTypeDefinitionContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTypeDefinitionContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTypeDefinitionContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTypeDefinitionContractsResponseData serviceTypeDefinitionContracts(@Param("elid") String elid, ServiceTypeDefinitionContractsRequestData body, @QueryMap(encoded=true) ServiceTypeDefinitionContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>serviceTypeDefinitionContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTypeDefinitionContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTypeDefinitionContractsResponseData> serviceTypeDefinitionContractsWithHttpInfo(@Param("elid") String elid, ServiceTypeDefinitionContractsRequestData body, @QueryMap(encoded=true) ServiceTypeDefinitionContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTypeDefinitionContracts</code> method in a fluent style.
   */
  public static class ServiceTypeDefinitionContractsQueryParams extends HashMap<String, Object> {
    public ServiceTypeDefinitionContractsQueryParams sessionId(final String value) {
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
   * @return ServiceTypeDefinitionFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTypeDefinitionFrameContractsResponseData serviceTypeDefinitionFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTypeDefinitionFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>serviceTypeDefinitionFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTypeDefinitionFrameContractsResponseData> serviceTypeDefinitionFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTypeDefinitionFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>serviceTypeDefinitionFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTypeDefinitionFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTypeDefinitionFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTypeDefinitionFrameContractsResponseData serviceTypeDefinitionFrameContracts(@Param("elid") String elid, ServiceTypeDefinitionFrameContractsRequestData body, @QueryMap(encoded=true) ServiceTypeDefinitionFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>serviceTypeDefinitionFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTypeDefinitionFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTypeDefinitionFrameContractsResponseData> serviceTypeDefinitionFrameContractsWithHttpInfo(@Param("elid") String elid, ServiceTypeDefinitionFrameContractsRequestData body, @QueryMap(encoded=true) ServiceTypeDefinitionFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTypeDefinitionFrameContracts</code> method in a fluent style.
   */
  public static class ServiceTypeDefinitionFrameContractsQueryParams extends HashMap<String, Object> {
    public ServiceTypeDefinitionFrameContractsQueryParams sessionId(final String value) {
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
   * @return ServiceTypeDefinitionMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTypeDefinitionMaintenanceContractsResponseData serviceTypeDefinitionMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTypeDefinitionMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>serviceTypeDefinitionMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTypeDefinitionMaintenanceContractsResponseData> serviceTypeDefinitionMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTypeDefinitionMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>serviceTypeDefinitionMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTypeDefinitionMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTypeDefinitionMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTypeDefinitionMaintenanceContractsResponseData serviceTypeDefinitionMaintenanceContracts(@Param("elid") String elid, ServiceTypeDefinitionMaintenanceContractsRequestData body, @QueryMap(encoded=true) ServiceTypeDefinitionMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>serviceTypeDefinitionMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTypeDefinitionMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTypeDefinitionMaintenanceContractsResponseData> serviceTypeDefinitionMaintenanceContractsWithHttpInfo(@Param("elid") String elid, ServiceTypeDefinitionMaintenanceContractsRequestData body, @QueryMap(encoded=true) ServiceTypeDefinitionMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTypeDefinitionMaintenanceContracts</code> method in a fluent style.
   */
  public static class ServiceTypeDefinitionMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public ServiceTypeDefinitionMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return ServiceTypeDefinitionOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTypeDefinitionOrganizationsResponseData serviceTypeDefinitionOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTypeDefinitionOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>serviceTypeDefinitionOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTypeDefinitionOrganizationsResponseData> serviceTypeDefinitionOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTypeDefinitionOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>serviceTypeDefinitionOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTypeDefinitionOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTypeDefinitionOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTypeDefinitionOrganizationsResponseData serviceTypeDefinitionOrganizations(@Param("elid") String elid, ServiceTypeDefinitionOrganizationsRequestData body, @QueryMap(encoded=true) ServiceTypeDefinitionOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>serviceTypeDefinitionOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTypeDefinitionOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTypeDefinitionOrganizationsResponseData> serviceTypeDefinitionOrganizationsWithHttpInfo(@Param("elid") String elid, ServiceTypeDefinitionOrganizationsRequestData body, @QueryMap(encoded=true) ServiceTypeDefinitionOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTypeDefinitionOrganizations</code> method in a fluent style.
   */
  public static class ServiceTypeDefinitionOrganizationsQueryParams extends HashMap<String, Object> {
    public ServiceTypeDefinitionOrganizationsQueryParams sessionId(final String value) {
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
   * @return ServiceTypeDefinitionPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTypeDefinitionPersonGroupsResponseData serviceTypeDefinitionPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTypeDefinitionPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>serviceTypeDefinitionPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTypeDefinitionPersonGroupsResponseData> serviceTypeDefinitionPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTypeDefinitionPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>serviceTypeDefinitionPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTypeDefinitionPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTypeDefinitionPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTypeDefinitionPersonGroupsResponseData serviceTypeDefinitionPersonGroups(@Param("elid") String elid, ServiceTypeDefinitionPersonGroupsRequestData body, @QueryMap(encoded=true) ServiceTypeDefinitionPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>serviceTypeDefinitionPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTypeDefinitionPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTypeDefinitionPersonGroupsResponseData> serviceTypeDefinitionPersonGroupsWithHttpInfo(@Param("elid") String elid, ServiceTypeDefinitionPersonGroupsRequestData body, @QueryMap(encoded=true) ServiceTypeDefinitionPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTypeDefinitionPersonGroups</code> method in a fluent style.
   */
  public static class ServiceTypeDefinitionPersonGroupsQueryParams extends HashMap<String, Object> {
    public ServiceTypeDefinitionPersonGroupsQueryParams sessionId(final String value) {
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
   * @return ServiceTypeDefinitionPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTypeDefinitionPersonsResponseData serviceTypeDefinitionPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTypeDefinitionPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>serviceTypeDefinitionPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTypeDefinitionPersonsResponseData> serviceTypeDefinitionPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTypeDefinitionPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>serviceTypeDefinitionPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTypeDefinitionPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTypeDefinitionPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTypeDefinitionPersonsResponseData serviceTypeDefinitionPersons(@Param("elid") String elid, ServiceTypeDefinitionPersonsRequestData body, @QueryMap(encoded=true) ServiceTypeDefinitionPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>serviceTypeDefinitionPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTypeDefinitionPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTypeDefinitionPersonsResponseData> serviceTypeDefinitionPersonsWithHttpInfo(@Param("elid") String elid, ServiceTypeDefinitionPersonsRequestData body, @QueryMap(encoded=true) ServiceTypeDefinitionPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTypeDefinitionPersons</code> method in a fluent style.
   */
  public static class ServiceTypeDefinitionPersonsQueryParams extends HashMap<String, Object> {
    public ServiceTypeDefinitionPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ServiceTypeDefinitionQueryResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTypeDefinitionQueryResponse serviceTypeDefinitionQuery(@Param("sessionId") String sessionId, ServiceTypeDefinitionQueryRequest body);

  /**
   * Basic query
   * Similar to <code>serviceTypeDefinitionQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTypeDefinitionQueryResponse> serviceTypeDefinitionQueryWithHttpInfo(@Param("sessionId") String sessionId, ServiceTypeDefinitionQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>serviceTypeDefinitionQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTypeDefinitionQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTypeDefinitionQueryResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTypeDefinitionQueryResponse serviceTypeDefinitionQuery(ServiceTypeDefinitionQueryRequest body, @QueryMap(encoded=true) ServiceTypeDefinitionQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>serviceTypeDefinitionQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTypeDefinitionQueryResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTypeDefinition/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTypeDefinitionQueryResponse> serviceTypeDefinitionQueryWithHttpInfo(ServiceTypeDefinitionQueryRequest body, @QueryMap(encoded=true) ServiceTypeDefinitionQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTypeDefinitionQuery</code> method in a fluent style.
   */
  public static class ServiceTypeDefinitionQueryQueryParams extends HashMap<String, Object> {
    public ServiceTypeDefinitionQueryQueryParams sessionId(final String value) {
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
   * @return ServiceTypeDefinitionServicesTelcoResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/ServicesTelco?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTypeDefinitionServicesTelcoResponseData serviceTypeDefinitionServicesTelco(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTypeDefinitionServicesTelcoRequestData body);

  /**
   * Get relations to Service (Telco) entities
   * Similar to <code>serviceTypeDefinitionServicesTelco</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/ServicesTelco?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTypeDefinitionServicesTelcoResponseData> serviceTypeDefinitionServicesTelcoWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTypeDefinitionServicesTelcoRequestData body);


  /**
   * Get relations to Service (Telco) entities
   * 
   * Note, this is equivalent to the other <code>serviceTypeDefinitionServicesTelco</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTypeDefinitionServicesTelcoQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTypeDefinitionServicesTelcoResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/ServicesTelco?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTypeDefinitionServicesTelcoResponseData serviceTypeDefinitionServicesTelco(@Param("elid") String elid, ServiceTypeDefinitionServicesTelcoRequestData body, @QueryMap(encoded=true) ServiceTypeDefinitionServicesTelcoQueryParams queryParams);

  /**
  * Get relations to Service (Telco) entities
  * 
  * Note, this is equivalent to the other <code>serviceTypeDefinitionServicesTelco</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTypeDefinitionServicesTelcoResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/ServicesTelco?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTypeDefinitionServicesTelcoResponseData> serviceTypeDefinitionServicesTelcoWithHttpInfo(@Param("elid") String elid, ServiceTypeDefinitionServicesTelcoRequestData body, @QueryMap(encoded=true) ServiceTypeDefinitionServicesTelcoQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTypeDefinitionServicesTelco</code> method in a fluent style.
   */
  public static class ServiceTypeDefinitionServicesTelcoQueryParams extends HashMap<String, Object> {
    public ServiceTypeDefinitionServicesTelcoQueryParams sessionId(final String value) {
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
   * @return ServiceTypeDefinitionSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTypeDefinitionSystemAttributesResponse serviceTypeDefinitionSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTypeDefinitionSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>serviceTypeDefinitionSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTypeDefinitionSystemAttributesResponse> serviceTypeDefinitionSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTypeDefinitionSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>serviceTypeDefinitionSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTypeDefinitionSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTypeDefinitionSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTypeDefinitionSystemAttributesResponse serviceTypeDefinitionSystemAttributes(@Param("elid") String elid, ServiceTypeDefinitionSystemAttributesRequest body, @QueryMap(encoded=true) ServiceTypeDefinitionSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>serviceTypeDefinitionSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTypeDefinitionSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTypeDefinitionSystemAttributesResponse> serviceTypeDefinitionSystemAttributesWithHttpInfo(@Param("elid") String elid, ServiceTypeDefinitionSystemAttributesRequest body, @QueryMap(encoded=true) ServiceTypeDefinitionSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTypeDefinitionSystemAttributes</code> method in a fluent style.
   */
  public static class ServiceTypeDefinitionSystemAttributesQueryParams extends HashMap<String, Object> {
    public ServiceTypeDefinitionSystemAttributesQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesServiceTypeDefinitionResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesServiceTypeDefinitionResponse updateSystemAttributesServiceTypeDefinition(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesServiceTypeDefinitionRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesServiceTypeDefinition</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesServiceTypeDefinitionResponse> updateSystemAttributesServiceTypeDefinitionWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesServiceTypeDefinitionRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesServiceTypeDefinition</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesServiceTypeDefinitionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesServiceTypeDefinitionResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesServiceTypeDefinitionResponse updateSystemAttributesServiceTypeDefinition(@Param("elid") String elid, UpdateSystemAttributesServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesServiceTypeDefinitionQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesServiceTypeDefinition</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesServiceTypeDefinitionResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesServiceTypeDefinitionResponse> updateSystemAttributesServiceTypeDefinitionWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesServiceTypeDefinitionQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesServiceTypeDefinition</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesServiceTypeDefinitionQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesServiceTypeDefinitionQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
