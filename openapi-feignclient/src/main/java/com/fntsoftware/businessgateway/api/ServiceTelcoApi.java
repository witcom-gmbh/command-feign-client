package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.ServiceTelco100042RequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelco100042ResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoCustomCablesRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoCustomCablesResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoCustomDataCablesRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoCustomDataCablesResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoCustomIpaccessSvcRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoCustomIpaccessSvcResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoCustomPowerCablesRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoCustomPowerCablesResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPersonsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPersonsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoQueryRequest;
import com.fntsoftware.businessgateway.entities.ServiceTelcoQueryResponse;
import com.fntsoftware.businessgateway.entities.ServiceTelcoServiceAccessPointsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoServiceAccessPointsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoServiceTypeDefinitionRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoServiceTypeDefinitionResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.ServiceTelcoSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.ServiceTelcoVlansRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoVlansResponseData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesServiceTelcoRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesServiceTelcoResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface ServiceTelcoApi extends ApiClient.Api {


  /**
   * Get relations to OSPF-Area entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServiceTelco100042ResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/100042?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelco100042ResponseData serviceTelco100042(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelco100042RequestData body);

  /**
   * Get relations to OSPF-Area entities
   * Similar to <code>serviceTelco100042</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/100042?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelco100042ResponseData> serviceTelco100042WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelco100042RequestData body);


  /**
   * Get relations to OSPF-Area entities
   * 
   * Note, this is equivalent to the other <code>serviceTelco100042</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelco100042QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelco100042ResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/100042?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelco100042ResponseData serviceTelco100042(@Param("elid") String elid, ServiceTelco100042RequestData body, @QueryMap(encoded=true) ServiceTelco100042QueryParams queryParams);

  /**
  * Get relations to OSPF-Area entities
  * 
  * Note, this is equivalent to the other <code>serviceTelco100042</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelco100042ResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/100042?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelco100042ResponseData> serviceTelco100042WithHttpInfo(@Param("elid") String elid, ServiceTelco100042RequestData body, @QueryMap(encoded=true) ServiceTelco100042QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelco100042</code> method in a fluent style.
   */
  public static class ServiceTelco100042QueryParams extends HashMap<String, Object> {
    public ServiceTelco100042QueryParams sessionId(final String value) {
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
   * @return ServiceTelcoContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoContractsResponseData serviceTelcoContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>serviceTelcoContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoContractsResponseData> serviceTelcoContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoContractsResponseData serviceTelcoContracts(@Param("elid") String elid, ServiceTelcoContractsRequestData body, @QueryMap(encoded=true) ServiceTelcoContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoContractsResponseData> serviceTelcoContractsWithHttpInfo(@Param("elid") String elid, ServiceTelcoContractsRequestData body, @QueryMap(encoded=true) ServiceTelcoContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoContracts</code> method in a fluent style.
   */
  public static class ServiceTelcoContractsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoContractsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoCustomCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/CustomCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoCustomCablesResponseData serviceTelcoCustomCables(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoCustomCablesRequestData body);

  /**
   * Get relations to Leased line entities
   * Similar to <code>serviceTelcoCustomCables</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/CustomCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoCustomCablesResponseData> serviceTelcoCustomCablesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoCustomCablesRequestData body);


  /**
   * Get relations to Leased line entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoCustomCables</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoCustomCablesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoCustomCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/CustomCables?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoCustomCablesResponseData serviceTelcoCustomCables(@Param("elid") String elid, ServiceTelcoCustomCablesRequestData body, @QueryMap(encoded=true) ServiceTelcoCustomCablesQueryParams queryParams);

  /**
  * Get relations to Leased line entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoCustomCables</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoCustomCablesResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/CustomCables?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoCustomCablesResponseData> serviceTelcoCustomCablesWithHttpInfo(@Param("elid") String elid, ServiceTelcoCustomCablesRequestData body, @QueryMap(encoded=true) ServiceTelcoCustomCablesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoCustomCables</code> method in a fluent style.
   */
  public static class ServiceTelcoCustomCablesQueryParams extends HashMap<String, Object> {
    public ServiceTelcoCustomCablesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Data cable entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServiceTelcoCustomDataCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/CustomDataCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoCustomDataCablesResponseData serviceTelcoCustomDataCables(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoCustomDataCablesRequestData body);

  /**
   * Get relations to Data cable entities
   * Similar to <code>serviceTelcoCustomDataCables</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/CustomDataCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoCustomDataCablesResponseData> serviceTelcoCustomDataCablesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoCustomDataCablesRequestData body);


  /**
   * Get relations to Data cable entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoCustomDataCables</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoCustomDataCablesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoCustomDataCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/CustomDataCables?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoCustomDataCablesResponseData serviceTelcoCustomDataCables(@Param("elid") String elid, ServiceTelcoCustomDataCablesRequestData body, @QueryMap(encoded=true) ServiceTelcoCustomDataCablesQueryParams queryParams);

  /**
  * Get relations to Data cable entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoCustomDataCables</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoCustomDataCablesResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/CustomDataCables?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoCustomDataCablesResponseData> serviceTelcoCustomDataCablesWithHttpInfo(@Param("elid") String elid, ServiceTelcoCustomDataCablesRequestData body, @QueryMap(encoded=true) ServiceTelcoCustomDataCablesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoCustomDataCables</code> method in a fluent style.
   */
  public static class ServiceTelcoCustomDataCablesQueryParams extends HashMap<String, Object> {
    public ServiceTelcoCustomDataCablesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to IP-Access Service entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServiceTelcoCustomIpaccessSvcResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/CustomIpaccessSvc?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoCustomIpaccessSvcResponseData serviceTelcoCustomIpaccessSvc(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoCustomIpaccessSvcRequestData body);

  /**
   * Get relations to IP-Access Service entities
   * Similar to <code>serviceTelcoCustomIpaccessSvc</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/CustomIpaccessSvc?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoCustomIpaccessSvcResponseData> serviceTelcoCustomIpaccessSvcWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoCustomIpaccessSvcRequestData body);


  /**
   * Get relations to IP-Access Service entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoCustomIpaccessSvc</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoCustomIpaccessSvcQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoCustomIpaccessSvcResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/CustomIpaccessSvc?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoCustomIpaccessSvcResponseData serviceTelcoCustomIpaccessSvc(@Param("elid") String elid, ServiceTelcoCustomIpaccessSvcRequestData body, @QueryMap(encoded=true) ServiceTelcoCustomIpaccessSvcQueryParams queryParams);

  /**
  * Get relations to IP-Access Service entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoCustomIpaccessSvc</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoCustomIpaccessSvcResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/CustomIpaccessSvc?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoCustomIpaccessSvcResponseData> serviceTelcoCustomIpaccessSvcWithHttpInfo(@Param("elid") String elid, ServiceTelcoCustomIpaccessSvcRequestData body, @QueryMap(encoded=true) ServiceTelcoCustomIpaccessSvcQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoCustomIpaccessSvc</code> method in a fluent style.
   */
  public static class ServiceTelcoCustomIpaccessSvcQueryParams extends HashMap<String, Object> {
    public ServiceTelcoCustomIpaccessSvcQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Power cable entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServiceTelcoCustomPowerCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/CustomPowerCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoCustomPowerCablesResponseData serviceTelcoCustomPowerCables(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoCustomPowerCablesRequestData body);

  /**
   * Get relations to Power cable entities
   * Similar to <code>serviceTelcoCustomPowerCables</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/CustomPowerCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoCustomPowerCablesResponseData> serviceTelcoCustomPowerCablesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoCustomPowerCablesRequestData body);


  /**
   * Get relations to Power cable entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoCustomPowerCables</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoCustomPowerCablesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoCustomPowerCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/CustomPowerCables?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoCustomPowerCablesResponseData serviceTelcoCustomPowerCables(@Param("elid") String elid, ServiceTelcoCustomPowerCablesRequestData body, @QueryMap(encoded=true) ServiceTelcoCustomPowerCablesQueryParams queryParams);

  /**
  * Get relations to Power cable entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoCustomPowerCables</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoCustomPowerCablesResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/CustomPowerCables?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoCustomPowerCablesResponseData> serviceTelcoCustomPowerCablesWithHttpInfo(@Param("elid") String elid, ServiceTelcoCustomPowerCablesRequestData body, @QueryMap(encoded=true) ServiceTelcoCustomPowerCablesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoCustomPowerCables</code> method in a fluent style.
   */
  public static class ServiceTelcoCustomPowerCablesQueryParams extends HashMap<String, Object> {
    public ServiceTelcoCustomPowerCablesQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoFrameContractsResponseData serviceTelcoFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>serviceTelcoFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoFrameContractsResponseData> serviceTelcoFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoFrameContractsResponseData serviceTelcoFrameContracts(@Param("elid") String elid, ServiceTelcoFrameContractsRequestData body, @QueryMap(encoded=true) ServiceTelcoFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoFrameContractsResponseData> serviceTelcoFrameContractsWithHttpInfo(@Param("elid") String elid, ServiceTelcoFrameContractsRequestData body, @QueryMap(encoded=true) ServiceTelcoFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoFrameContracts</code> method in a fluent style.
   */
  public static class ServiceTelcoFrameContractsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoFrameContractsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoMaintenanceContractsResponseData serviceTelcoMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>serviceTelcoMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoMaintenanceContractsResponseData> serviceTelcoMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoMaintenanceContractsResponseData serviceTelcoMaintenanceContracts(@Param("elid") String elid, ServiceTelcoMaintenanceContractsRequestData body, @QueryMap(encoded=true) ServiceTelcoMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoMaintenanceContractsResponseData> serviceTelcoMaintenanceContractsWithHttpInfo(@Param("elid") String elid, ServiceTelcoMaintenanceContractsRequestData body, @QueryMap(encoded=true) ServiceTelcoMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoMaintenanceContracts</code> method in a fluent style.
   */
  public static class ServiceTelcoMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoOrganizationsResponseData serviceTelcoOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>serviceTelcoOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoOrganizationsResponseData> serviceTelcoOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoOrganizationsResponseData serviceTelcoOrganizations(@Param("elid") String elid, ServiceTelcoOrganizationsRequestData body, @QueryMap(encoded=true) ServiceTelcoOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoOrganizationsResponseData> serviceTelcoOrganizationsWithHttpInfo(@Param("elid") String elid, ServiceTelcoOrganizationsRequestData body, @QueryMap(encoded=true) ServiceTelcoOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoOrganizations</code> method in a fluent style.
   */
  public static class ServiceTelcoOrganizationsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoOrganizationsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPersonGroupsResponseData serviceTelcoPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>serviceTelcoPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPersonGroupsResponseData> serviceTelcoPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPersonGroupsResponseData serviceTelcoPersonGroups(@Param("elid") String elid, ServiceTelcoPersonGroupsRequestData body, @QueryMap(encoded=true) ServiceTelcoPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPersonGroupsResponseData> serviceTelcoPersonGroupsWithHttpInfo(@Param("elid") String elid, ServiceTelcoPersonGroupsRequestData body, @QueryMap(encoded=true) ServiceTelcoPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPersonGroups</code> method in a fluent style.
   */
  public static class ServiceTelcoPersonGroupsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPersonGroupsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPersonsResponseData serviceTelcoPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>serviceTelcoPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPersonsResponseData> serviceTelcoPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPersonsResponseData serviceTelcoPersons(@Param("elid") String elid, ServiceTelcoPersonsRequestData body, @QueryMap(encoded=true) ServiceTelcoPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPersonsResponseData> serviceTelcoPersonsWithHttpInfo(@Param("elid") String elid, ServiceTelcoPersonsRequestData body, @QueryMap(encoded=true) ServiceTelcoPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPersons</code> method in a fluent style.
   */
  public static class ServiceTelcoPersonsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ServiceTelcoQueryResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelco/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoQueryResponse serviceTelcoQuery(@Param("sessionId") String sessionId, ServiceTelcoQueryRequest body);

  /**
   * Basic query
   * Similar to <code>serviceTelcoQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelco/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoQueryResponse> serviceTelcoQueryWithHttpInfo(@Param("sessionId") String sessionId, ServiceTelcoQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>serviceTelcoQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoQueryResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelco/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoQueryResponse serviceTelcoQuery(ServiceTelcoQueryRequest body, @QueryMap(encoded=true) ServiceTelcoQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>serviceTelcoQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoQueryResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelco/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoQueryResponse> serviceTelcoQueryWithHttpInfo(ServiceTelcoQueryRequest body, @QueryMap(encoded=true) ServiceTelcoQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoQuery</code> method in a fluent style.
   */
  public static class ServiceTelcoQueryQueryParams extends HashMap<String, Object> {
    public ServiceTelcoQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Service Access Point entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServiceTelcoServiceAccessPointsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/ServiceAccessPoints?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoServiceAccessPointsResponseData serviceTelcoServiceAccessPoints(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoServiceAccessPointsRequestData body);

  /**
   * Get relations to Service Access Point entities
   * Similar to <code>serviceTelcoServiceAccessPoints</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/ServiceAccessPoints?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoServiceAccessPointsResponseData> serviceTelcoServiceAccessPointsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoServiceAccessPointsRequestData body);


  /**
   * Get relations to Service Access Point entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoServiceAccessPoints</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoServiceAccessPointsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoServiceAccessPointsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/ServiceAccessPoints?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoServiceAccessPointsResponseData serviceTelcoServiceAccessPoints(@Param("elid") String elid, ServiceTelcoServiceAccessPointsRequestData body, @QueryMap(encoded=true) ServiceTelcoServiceAccessPointsQueryParams queryParams);

  /**
  * Get relations to Service Access Point entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoServiceAccessPoints</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoServiceAccessPointsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/ServiceAccessPoints?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoServiceAccessPointsResponseData> serviceTelcoServiceAccessPointsWithHttpInfo(@Param("elid") String elid, ServiceTelcoServiceAccessPointsRequestData body, @QueryMap(encoded=true) ServiceTelcoServiceAccessPointsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoServiceAccessPoints</code> method in a fluent style.
   */
  public static class ServiceTelcoServiceAccessPointsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoServiceAccessPointsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Service type definition entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServiceTelcoServiceTypeDefinitionResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/ServiceTypeDefinition?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoServiceTypeDefinitionResponseData serviceTelcoServiceTypeDefinition(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoServiceTypeDefinitionRequestData body);

  /**
   * Get relations to Service type definition entities
   * Similar to <code>serviceTelcoServiceTypeDefinition</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/ServiceTypeDefinition?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoServiceTypeDefinitionResponseData> serviceTelcoServiceTypeDefinitionWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoServiceTypeDefinitionRequestData body);


  /**
   * Get relations to Service type definition entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoServiceTypeDefinition</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoServiceTypeDefinitionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoServiceTypeDefinitionResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/ServiceTypeDefinition?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoServiceTypeDefinitionResponseData serviceTelcoServiceTypeDefinition(@Param("elid") String elid, ServiceTelcoServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) ServiceTelcoServiceTypeDefinitionQueryParams queryParams);

  /**
  * Get relations to Service type definition entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoServiceTypeDefinition</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoServiceTypeDefinitionResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/ServiceTypeDefinition?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoServiceTypeDefinitionResponseData> serviceTelcoServiceTypeDefinitionWithHttpInfo(@Param("elid") String elid, ServiceTelcoServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) ServiceTelcoServiceTypeDefinitionQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoServiceTypeDefinition</code> method in a fluent style.
   */
  public static class ServiceTelcoServiceTypeDefinitionQueryParams extends HashMap<String, Object> {
    public ServiceTelcoServiceTypeDefinitionQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoSystemAttributesResponse serviceTelcoSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>serviceTelcoSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoSystemAttributesResponse> serviceTelcoSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>serviceTelcoSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoSystemAttributesResponse serviceTelcoSystemAttributes(@Param("elid") String elid, ServiceTelcoSystemAttributesRequest body, @QueryMap(encoded=true) ServiceTelcoSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>serviceTelcoSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoSystemAttributesResponse> serviceTelcoSystemAttributesWithHttpInfo(@Param("elid") String elid, ServiceTelcoSystemAttributesRequest body, @QueryMap(encoded=true) ServiceTelcoSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoSystemAttributes</code> method in a fluent style.
   */
  public static class ServiceTelcoSystemAttributesQueryParams extends HashMap<String, Object> {
    public ServiceTelcoSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to VLAN entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServiceTelcoVlansResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoVlansResponseData serviceTelcoVlans(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoVlansRequestData body);

  /**
   * Get relations to VLAN entities
   * Similar to <code>serviceTelcoVlans</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoVlansResponseData> serviceTelcoVlansWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoVlansRequestData body);


  /**
   * Get relations to VLAN entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoVlans</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoVlansQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoVlansResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoVlansResponseData serviceTelcoVlans(@Param("elid") String elid, ServiceTelcoVlansRequestData body, @QueryMap(encoded=true) ServiceTelcoVlansQueryParams queryParams);

  /**
  * Get relations to VLAN entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoVlans</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoVlansResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/Vlans?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoVlansResponseData> serviceTelcoVlansWithHttpInfo(@Param("elid") String elid, ServiceTelcoVlansRequestData body, @QueryMap(encoded=true) ServiceTelcoVlansQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoVlans</code> method in a fluent style.
   */
  public static class ServiceTelcoVlansQueryParams extends HashMap<String, Object> {
    public ServiceTelcoVlansQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesServiceTelcoResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesServiceTelcoResponse updateSystemAttributesServiceTelco(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesServiceTelcoRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesServiceTelco</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesServiceTelcoResponse> updateSystemAttributesServiceTelcoWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesServiceTelcoRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesServiceTelco</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesServiceTelcoQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesServiceTelcoResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesServiceTelcoResponse updateSystemAttributesServiceTelco(@Param("elid") String elid, UpdateSystemAttributesServiceTelcoRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesServiceTelcoQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesServiceTelco</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesServiceTelcoResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelco/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesServiceTelcoResponse> updateSystemAttributesServiceTelcoWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesServiceTelcoRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesServiceTelcoQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesServiceTelco</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesServiceTelcoQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesServiceTelcoQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
