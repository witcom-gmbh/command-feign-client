package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateCustomIpaccessSvcRequestData;
import com.fntsoftware.businessgateway.entities.CreateCustomIpaccessSvcResponse;
import com.fntsoftware.businessgateway.entities.CustomIpaccessSvcContractRequestData;
import com.fntsoftware.businessgateway.entities.CustomIpaccessSvcContractResponseData;
import com.fntsoftware.businessgateway.entities.CustomIpaccessSvcCustomIpAccessChildRequestData;
import com.fntsoftware.businessgateway.entities.CustomIpaccessSvcCustomIpAccessChildResponseData;
import com.fntsoftware.businessgateway.entities.CustomIpaccessSvcCustomIpAccessParentRequestData;
import com.fntsoftware.businessgateway.entities.CustomIpaccessSvcCustomIpAccessParentResponseData;
import com.fntsoftware.businessgateway.entities.CustomIpaccessSvcInterfacesRequestData;
import com.fntsoftware.businessgateway.entities.CustomIpaccessSvcInterfacesResponseData;
import com.fntsoftware.businessgateway.entities.CustomIpaccessSvcIpv4NetworksRequestData;
import com.fntsoftware.businessgateway.entities.CustomIpaccessSvcIpv4NetworksResponseData;
import com.fntsoftware.businessgateway.entities.CustomIpaccessSvcIpv6NetworksRequestData;
import com.fntsoftware.businessgateway.entities.CustomIpaccessSvcIpv6NetworksResponseData;
import com.fntsoftware.businessgateway.entities.CustomIpaccessSvcLogicalPortsRequestData;
import com.fntsoftware.businessgateway.entities.CustomIpaccessSvcLogicalPortsResponseData;
import com.fntsoftware.businessgateway.entities.CustomIpaccessSvcMaintenanceContractRequestData;
import com.fntsoftware.businessgateway.entities.CustomIpaccessSvcMaintenanceContractResponseData;
import com.fntsoftware.businessgateway.entities.CustomIpaccessSvcOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.CustomIpaccessSvcOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.CustomIpaccessSvcQueryRequest;
import com.fntsoftware.businessgateway.entities.CustomIpaccessSvcQueryResponse;
import com.fntsoftware.businessgateway.entities.CustomIpaccessSvcServiceTelcoRequestData;
import com.fntsoftware.businessgateway.entities.CustomIpaccessSvcServiceTelcoResponseData;
import com.fntsoftware.businessgateway.entities.CustomIpaccessSvcSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.CustomIpaccessSvcSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.DeleteCustomIpaccessSvcRequestData;
import com.fntsoftware.businessgateway.entities.DeleteCustomIpaccessSvcResponse;
import com.fntsoftware.businessgateway.entities.UpdateCustomIpaccessSvcRequestData;
import com.fntsoftware.businessgateway.entities.UpdateCustomIpaccessSvcResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomIpaccessSvcRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomIpaccessSvcResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface CustomIpaccessSvcApi extends ApiClient.Api {


  /**
   * Create
   * Create IP-Access Service
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateCustomIpaccessSvcResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateCustomIpaccessSvcResponse createCustomIpaccessSvc(@Param("sessionId") String sessionId, CreateCustomIpaccessSvcRequestData body);

  /**
   * Create
   * Similar to <code>createCustomIpaccessSvc</code> but it also returns the http response headers .
   * Create IP-Access Service
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateCustomIpaccessSvcResponse> createCustomIpaccessSvcWithHttpInfo(@Param("sessionId") String sessionId, CreateCustomIpaccessSvcRequestData body);


  /**
   * Create
   * Create IP-Access Service
   * Note, this is equivalent to the other <code>createCustomIpaccessSvc</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateCustomIpaccessSvcQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateCustomIpaccessSvcResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateCustomIpaccessSvcResponse createCustomIpaccessSvc(CreateCustomIpaccessSvcRequestData body, @QueryMap(encoded=true) CreateCustomIpaccessSvcQueryParams queryParams);

  /**
  * Create
  * Create IP-Access Service
  * Note, this is equivalent to the other <code>createCustomIpaccessSvc</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateCustomIpaccessSvcResponse
      */
      @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateCustomIpaccessSvcResponse> createCustomIpaccessSvcWithHttpInfo(CreateCustomIpaccessSvcRequestData body, @QueryMap(encoded=true) CreateCustomIpaccessSvcQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createCustomIpaccessSvc</code> method in a fluent style.
   */
  public static class CreateCustomIpaccessSvcQueryParams extends HashMap<String, Object> {
    public CreateCustomIpaccessSvcQueryParams sessionId(final String value) {
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
   * @return CustomIpaccessSvcContractResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/Contract?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomIpaccessSvcContractResponseData customIpaccessSvcContract(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomIpaccessSvcContractRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>customIpaccessSvcContract</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/Contract?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomIpaccessSvcContractResponseData> customIpaccessSvcContractWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomIpaccessSvcContractRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>customIpaccessSvcContract</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomIpaccessSvcContractQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomIpaccessSvcContractResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/Contract?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomIpaccessSvcContractResponseData customIpaccessSvcContract(@Param("elid") String elid, CustomIpaccessSvcContractRequestData body, @QueryMap(encoded=true) CustomIpaccessSvcContractQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>customIpaccessSvcContract</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomIpaccessSvcContractResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/Contract?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomIpaccessSvcContractResponseData> customIpaccessSvcContractWithHttpInfo(@Param("elid") String elid, CustomIpaccessSvcContractRequestData body, @QueryMap(encoded=true) CustomIpaccessSvcContractQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customIpaccessSvcContract</code> method in a fluent style.
   */
  public static class CustomIpaccessSvcContractQueryParams extends HashMap<String, Object> {
    public CustomIpaccessSvcContractQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Belongs to entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CustomIpaccessSvcCustomIpAccessChildResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/CustomIpAccessChild?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomIpaccessSvcCustomIpAccessChildResponseData customIpaccessSvcCustomIpAccessChild(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomIpaccessSvcCustomIpAccessChildRequestData body);

  /**
   * Get relations to Belongs to entities
   * Similar to <code>customIpaccessSvcCustomIpAccessChild</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/CustomIpAccessChild?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomIpaccessSvcCustomIpAccessChildResponseData> customIpaccessSvcCustomIpAccessChildWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomIpaccessSvcCustomIpAccessChildRequestData body);


  /**
   * Get relations to Belongs to entities
   * 
   * Note, this is equivalent to the other <code>customIpaccessSvcCustomIpAccessChild</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomIpaccessSvcCustomIpAccessChildQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomIpaccessSvcCustomIpAccessChildResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/CustomIpAccessChild?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomIpaccessSvcCustomIpAccessChildResponseData customIpaccessSvcCustomIpAccessChild(@Param("elid") String elid, CustomIpaccessSvcCustomIpAccessChildRequestData body, @QueryMap(encoded=true) CustomIpaccessSvcCustomIpAccessChildQueryParams queryParams);

  /**
  * Get relations to Belongs to entities
  * 
  * Note, this is equivalent to the other <code>customIpaccessSvcCustomIpAccessChild</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomIpaccessSvcCustomIpAccessChildResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/CustomIpAccessChild?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomIpaccessSvcCustomIpAccessChildResponseData> customIpaccessSvcCustomIpAccessChildWithHttpInfo(@Param("elid") String elid, CustomIpaccessSvcCustomIpAccessChildRequestData body, @QueryMap(encoded=true) CustomIpaccessSvcCustomIpAccessChildQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customIpaccessSvcCustomIpAccessChild</code> method in a fluent style.
   */
  public static class CustomIpaccessSvcCustomIpAccessChildQueryParams extends HashMap<String, Object> {
    public CustomIpaccessSvcCustomIpAccessChildQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Redundancy for entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CustomIpaccessSvcCustomIpAccessParentResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/CustomIpAccessParent?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomIpaccessSvcCustomIpAccessParentResponseData customIpaccessSvcCustomIpAccessParent(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomIpaccessSvcCustomIpAccessParentRequestData body);

  /**
   * Get relations to Redundancy for entities
   * Similar to <code>customIpaccessSvcCustomIpAccessParent</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/CustomIpAccessParent?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomIpaccessSvcCustomIpAccessParentResponseData> customIpaccessSvcCustomIpAccessParentWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomIpaccessSvcCustomIpAccessParentRequestData body);


  /**
   * Get relations to Redundancy for entities
   * 
   * Note, this is equivalent to the other <code>customIpaccessSvcCustomIpAccessParent</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomIpaccessSvcCustomIpAccessParentQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomIpaccessSvcCustomIpAccessParentResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/CustomIpAccessParent?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomIpaccessSvcCustomIpAccessParentResponseData customIpaccessSvcCustomIpAccessParent(@Param("elid") String elid, CustomIpaccessSvcCustomIpAccessParentRequestData body, @QueryMap(encoded=true) CustomIpaccessSvcCustomIpAccessParentQueryParams queryParams);

  /**
  * Get relations to Redundancy for entities
  * 
  * Note, this is equivalent to the other <code>customIpaccessSvcCustomIpAccessParent</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomIpaccessSvcCustomIpAccessParentResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/CustomIpAccessParent?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomIpaccessSvcCustomIpAccessParentResponseData> customIpaccessSvcCustomIpAccessParentWithHttpInfo(@Param("elid") String elid, CustomIpaccessSvcCustomIpAccessParentRequestData body, @QueryMap(encoded=true) CustomIpaccessSvcCustomIpAccessParentQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customIpaccessSvcCustomIpAccessParent</code> method in a fluent style.
   */
  public static class CustomIpaccessSvcCustomIpAccessParentQueryParams extends HashMap<String, Object> {
    public CustomIpaccessSvcCustomIpAccessParentQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Interface entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CustomIpaccessSvcInterfacesResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomIpaccessSvcInterfacesResponseData customIpaccessSvcInterfaces(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomIpaccessSvcInterfacesRequestData body);

  /**
   * Get relations to Interface entities
   * Similar to <code>customIpaccessSvcInterfaces</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomIpaccessSvcInterfacesResponseData> customIpaccessSvcInterfacesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomIpaccessSvcInterfacesRequestData body);


  /**
   * Get relations to Interface entities
   * 
   * Note, this is equivalent to the other <code>customIpaccessSvcInterfaces</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomIpaccessSvcInterfacesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomIpaccessSvcInterfacesResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomIpaccessSvcInterfacesResponseData customIpaccessSvcInterfaces(@Param("elid") String elid, CustomIpaccessSvcInterfacesRequestData body, @QueryMap(encoded=true) CustomIpaccessSvcInterfacesQueryParams queryParams);

  /**
  * Get relations to Interface entities
  * 
  * Note, this is equivalent to the other <code>customIpaccessSvcInterfaces</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomIpaccessSvcInterfacesResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/Interfaces?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomIpaccessSvcInterfacesResponseData> customIpaccessSvcInterfacesWithHttpInfo(@Param("elid") String elid, CustomIpaccessSvcInterfacesRequestData body, @QueryMap(encoded=true) CustomIpaccessSvcInterfacesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customIpaccessSvcInterfaces</code> method in a fluent style.
   */
  public static class CustomIpaccessSvcInterfacesQueryParams extends HashMap<String, Object> {
    public CustomIpaccessSvcInterfacesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to IPv4 Network entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CustomIpaccessSvcIpv4NetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomIpaccessSvcIpv4NetworksResponseData customIpaccessSvcIpv4Networks(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomIpaccessSvcIpv4NetworksRequestData body);

  /**
   * Get relations to IPv4 Network entities
   * Similar to <code>customIpaccessSvcIpv4Networks</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomIpaccessSvcIpv4NetworksResponseData> customIpaccessSvcIpv4NetworksWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomIpaccessSvcIpv4NetworksRequestData body);


  /**
   * Get relations to IPv4 Network entities
   * 
   * Note, this is equivalent to the other <code>customIpaccessSvcIpv4Networks</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomIpaccessSvcIpv4NetworksQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomIpaccessSvcIpv4NetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomIpaccessSvcIpv4NetworksResponseData customIpaccessSvcIpv4Networks(@Param("elid") String elid, CustomIpaccessSvcIpv4NetworksRequestData body, @QueryMap(encoded=true) CustomIpaccessSvcIpv4NetworksQueryParams queryParams);

  /**
  * Get relations to IPv4 Network entities
  * 
  * Note, this is equivalent to the other <code>customIpaccessSvcIpv4Networks</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomIpaccessSvcIpv4NetworksResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/Ipv4Networks?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomIpaccessSvcIpv4NetworksResponseData> customIpaccessSvcIpv4NetworksWithHttpInfo(@Param("elid") String elid, CustomIpaccessSvcIpv4NetworksRequestData body, @QueryMap(encoded=true) CustomIpaccessSvcIpv4NetworksQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customIpaccessSvcIpv4Networks</code> method in a fluent style.
   */
  public static class CustomIpaccessSvcIpv4NetworksQueryParams extends HashMap<String, Object> {
    public CustomIpaccessSvcIpv4NetworksQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to IPv6 network entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CustomIpaccessSvcIpv6NetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/Ipv6Networks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomIpaccessSvcIpv6NetworksResponseData customIpaccessSvcIpv6Networks(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomIpaccessSvcIpv6NetworksRequestData body);

  /**
   * Get relations to IPv6 network entities
   * Similar to <code>customIpaccessSvcIpv6Networks</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/Ipv6Networks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomIpaccessSvcIpv6NetworksResponseData> customIpaccessSvcIpv6NetworksWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomIpaccessSvcIpv6NetworksRequestData body);


  /**
   * Get relations to IPv6 network entities
   * 
   * Note, this is equivalent to the other <code>customIpaccessSvcIpv6Networks</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomIpaccessSvcIpv6NetworksQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomIpaccessSvcIpv6NetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/Ipv6Networks?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomIpaccessSvcIpv6NetworksResponseData customIpaccessSvcIpv6Networks(@Param("elid") String elid, CustomIpaccessSvcIpv6NetworksRequestData body, @QueryMap(encoded=true) CustomIpaccessSvcIpv6NetworksQueryParams queryParams);

  /**
  * Get relations to IPv6 network entities
  * 
  * Note, this is equivalent to the other <code>customIpaccessSvcIpv6Networks</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomIpaccessSvcIpv6NetworksResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/Ipv6Networks?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomIpaccessSvcIpv6NetworksResponseData> customIpaccessSvcIpv6NetworksWithHttpInfo(@Param("elid") String elid, CustomIpaccessSvcIpv6NetworksRequestData body, @QueryMap(encoded=true) CustomIpaccessSvcIpv6NetworksQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customIpaccessSvcIpv6Networks</code> method in a fluent style.
   */
  public static class CustomIpaccessSvcIpv6NetworksQueryParams extends HashMap<String, Object> {
    public CustomIpaccessSvcIpv6NetworksQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Anschaltung entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CustomIpaccessSvcLogicalPortsResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomIpaccessSvcLogicalPortsResponseData customIpaccessSvcLogicalPorts(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomIpaccessSvcLogicalPortsRequestData body);

  /**
   * Get relations to Anschaltung entities
   * Similar to <code>customIpaccessSvcLogicalPorts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomIpaccessSvcLogicalPortsResponseData> customIpaccessSvcLogicalPortsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomIpaccessSvcLogicalPortsRequestData body);


  /**
   * Get relations to Anschaltung entities
   * 
   * Note, this is equivalent to the other <code>customIpaccessSvcLogicalPorts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomIpaccessSvcLogicalPortsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomIpaccessSvcLogicalPortsResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomIpaccessSvcLogicalPortsResponseData customIpaccessSvcLogicalPorts(@Param("elid") String elid, CustomIpaccessSvcLogicalPortsRequestData body, @QueryMap(encoded=true) CustomIpaccessSvcLogicalPortsQueryParams queryParams);

  /**
  * Get relations to Anschaltung entities
  * 
  * Note, this is equivalent to the other <code>customIpaccessSvcLogicalPorts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomIpaccessSvcLogicalPortsResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/LogicalPorts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomIpaccessSvcLogicalPortsResponseData> customIpaccessSvcLogicalPortsWithHttpInfo(@Param("elid") String elid, CustomIpaccessSvcLogicalPortsRequestData body, @QueryMap(encoded=true) CustomIpaccessSvcLogicalPortsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customIpaccessSvcLogicalPorts</code> method in a fluent style.
   */
  public static class CustomIpaccessSvcLogicalPortsQueryParams extends HashMap<String, Object> {
    public CustomIpaccessSvcLogicalPortsQueryParams sessionId(final String value) {
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
   * @return CustomIpaccessSvcMaintenanceContractResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/MaintenanceContract?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomIpaccessSvcMaintenanceContractResponseData customIpaccessSvcMaintenanceContract(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomIpaccessSvcMaintenanceContractRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>customIpaccessSvcMaintenanceContract</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/MaintenanceContract?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomIpaccessSvcMaintenanceContractResponseData> customIpaccessSvcMaintenanceContractWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomIpaccessSvcMaintenanceContractRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>customIpaccessSvcMaintenanceContract</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomIpaccessSvcMaintenanceContractQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomIpaccessSvcMaintenanceContractResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/MaintenanceContract?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomIpaccessSvcMaintenanceContractResponseData customIpaccessSvcMaintenanceContract(@Param("elid") String elid, CustomIpaccessSvcMaintenanceContractRequestData body, @QueryMap(encoded=true) CustomIpaccessSvcMaintenanceContractQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>customIpaccessSvcMaintenanceContract</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomIpaccessSvcMaintenanceContractResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/MaintenanceContract?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomIpaccessSvcMaintenanceContractResponseData> customIpaccessSvcMaintenanceContractWithHttpInfo(@Param("elid") String elid, CustomIpaccessSvcMaintenanceContractRequestData body, @QueryMap(encoded=true) CustomIpaccessSvcMaintenanceContractQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customIpaccessSvcMaintenanceContract</code> method in a fluent style.
   */
  public static class CustomIpaccessSvcMaintenanceContractQueryParams extends HashMap<String, Object> {
    public CustomIpaccessSvcMaintenanceContractQueryParams sessionId(final String value) {
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
   * @return CustomIpaccessSvcOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomIpaccessSvcOrganizationsResponseData customIpaccessSvcOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomIpaccessSvcOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>customIpaccessSvcOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomIpaccessSvcOrganizationsResponseData> customIpaccessSvcOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomIpaccessSvcOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>customIpaccessSvcOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomIpaccessSvcOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomIpaccessSvcOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomIpaccessSvcOrganizationsResponseData customIpaccessSvcOrganizations(@Param("elid") String elid, CustomIpaccessSvcOrganizationsRequestData body, @QueryMap(encoded=true) CustomIpaccessSvcOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>customIpaccessSvcOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomIpaccessSvcOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomIpaccessSvcOrganizationsResponseData> customIpaccessSvcOrganizationsWithHttpInfo(@Param("elid") String elid, CustomIpaccessSvcOrganizationsRequestData body, @QueryMap(encoded=true) CustomIpaccessSvcOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customIpaccessSvcOrganizations</code> method in a fluent style.
   */
  public static class CustomIpaccessSvcOrganizationsQueryParams extends HashMap<String, Object> {
    public CustomIpaccessSvcOrganizationsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CustomIpaccessSvcQueryResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomIpaccessSvcQueryResponse customIpaccessSvcQuery(@Param("sessionId") String sessionId, CustomIpaccessSvcQueryRequest body);

  /**
   * Basic query
   * Similar to <code>customIpaccessSvcQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomIpaccessSvcQueryResponse> customIpaccessSvcQueryWithHttpInfo(@Param("sessionId") String sessionId, CustomIpaccessSvcQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>customIpaccessSvcQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomIpaccessSvcQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomIpaccessSvcQueryResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomIpaccessSvcQueryResponse customIpaccessSvcQuery(CustomIpaccessSvcQueryRequest body, @QueryMap(encoded=true) CustomIpaccessSvcQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>customIpaccessSvcQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomIpaccessSvcQueryResponse
      */
      @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomIpaccessSvcQueryResponse> customIpaccessSvcQueryWithHttpInfo(CustomIpaccessSvcQueryRequest body, @QueryMap(encoded=true) CustomIpaccessSvcQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customIpaccessSvcQuery</code> method in a fluent style.
   */
  public static class CustomIpaccessSvcQueryQueryParams extends HashMap<String, Object> {
    public CustomIpaccessSvcQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Transport-Service entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CustomIpaccessSvcServiceTelcoResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/ServiceTelco?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomIpaccessSvcServiceTelcoResponseData customIpaccessSvcServiceTelco(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomIpaccessSvcServiceTelcoRequestData body);

  /**
   * Get relations to Transport-Service entities
   * Similar to <code>customIpaccessSvcServiceTelco</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/ServiceTelco?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomIpaccessSvcServiceTelcoResponseData> customIpaccessSvcServiceTelcoWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomIpaccessSvcServiceTelcoRequestData body);


  /**
   * Get relations to Transport-Service entities
   * 
   * Note, this is equivalent to the other <code>customIpaccessSvcServiceTelco</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomIpaccessSvcServiceTelcoQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomIpaccessSvcServiceTelcoResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/ServiceTelco?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomIpaccessSvcServiceTelcoResponseData customIpaccessSvcServiceTelco(@Param("elid") String elid, CustomIpaccessSvcServiceTelcoRequestData body, @QueryMap(encoded=true) CustomIpaccessSvcServiceTelcoQueryParams queryParams);

  /**
  * Get relations to Transport-Service entities
  * 
  * Note, this is equivalent to the other <code>customIpaccessSvcServiceTelco</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomIpaccessSvcServiceTelcoResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/ServiceTelco?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomIpaccessSvcServiceTelcoResponseData> customIpaccessSvcServiceTelcoWithHttpInfo(@Param("elid") String elid, CustomIpaccessSvcServiceTelcoRequestData body, @QueryMap(encoded=true) CustomIpaccessSvcServiceTelcoQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customIpaccessSvcServiceTelco</code> method in a fluent style.
   */
  public static class CustomIpaccessSvcServiceTelcoQueryParams extends HashMap<String, Object> {
    public CustomIpaccessSvcServiceTelcoQueryParams sessionId(final String value) {
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
   * @return CustomIpaccessSvcSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomIpaccessSvcSystemAttributesResponse customIpaccessSvcSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomIpaccessSvcSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>customIpaccessSvcSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomIpaccessSvcSystemAttributesResponse> customIpaccessSvcSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomIpaccessSvcSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>customIpaccessSvcSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomIpaccessSvcSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomIpaccessSvcSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomIpaccessSvcSystemAttributesResponse customIpaccessSvcSystemAttributes(@Param("elid") String elid, CustomIpaccessSvcSystemAttributesRequest body, @QueryMap(encoded=true) CustomIpaccessSvcSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>customIpaccessSvcSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomIpaccessSvcSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomIpaccessSvcSystemAttributesResponse> customIpaccessSvcSystemAttributesWithHttpInfo(@Param("elid") String elid, CustomIpaccessSvcSystemAttributesRequest body, @QueryMap(encoded=true) CustomIpaccessSvcSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customIpaccessSvcSystemAttributes</code> method in a fluent style.
   */
  public static class CustomIpaccessSvcSystemAttributesQueryParams extends HashMap<String, Object> {
    public CustomIpaccessSvcSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete IP-Access Service
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteCustomIpaccessSvcResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteCustomIpaccessSvcResponse deleteCustomIpaccessSvc(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCustomIpaccessSvcRequestData body);

  /**
   * Delete
   * Similar to <code>deleteCustomIpaccessSvc</code> but it also returns the http response headers .
   * Delete IP-Access Service
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteCustomIpaccessSvcResponse> deleteCustomIpaccessSvcWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCustomIpaccessSvcRequestData body);


  /**
   * Delete
   * Delete IP-Access Service
   * Note, this is equivalent to the other <code>deleteCustomIpaccessSvc</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteCustomIpaccessSvcQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteCustomIpaccessSvcResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteCustomIpaccessSvcResponse deleteCustomIpaccessSvc(@Param("elid") String elid, DeleteCustomIpaccessSvcRequestData body, @QueryMap(encoded=true) DeleteCustomIpaccessSvcQueryParams queryParams);

  /**
  * Delete
  * Delete IP-Access Service
  * Note, this is equivalent to the other <code>deleteCustomIpaccessSvc</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteCustomIpaccessSvcResponse
      */
      @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteCustomIpaccessSvcResponse> deleteCustomIpaccessSvcWithHttpInfo(@Param("elid") String elid, DeleteCustomIpaccessSvcRequestData body, @QueryMap(encoded=true) DeleteCustomIpaccessSvcQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteCustomIpaccessSvc</code> method in a fluent style.
   */
  public static class DeleteCustomIpaccessSvcQueryParams extends HashMap<String, Object> {
    public DeleteCustomIpaccessSvcQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify IP-Access Service
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateCustomIpaccessSvcResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateCustomIpaccessSvcResponse updateCustomIpaccessSvc(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCustomIpaccessSvcRequestData body);

  /**
   * Modify
   * Similar to <code>updateCustomIpaccessSvc</code> but it also returns the http response headers .
   * Modify IP-Access Service
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateCustomIpaccessSvcResponse> updateCustomIpaccessSvcWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCustomIpaccessSvcRequestData body);


  /**
   * Modify
   * Modify IP-Access Service
   * Note, this is equivalent to the other <code>updateCustomIpaccessSvc</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateCustomIpaccessSvcQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateCustomIpaccessSvcResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateCustomIpaccessSvcResponse updateCustomIpaccessSvc(@Param("elid") String elid, UpdateCustomIpaccessSvcRequestData body, @QueryMap(encoded=true) UpdateCustomIpaccessSvcQueryParams queryParams);

  /**
  * Modify
  * Modify IP-Access Service
  * Note, this is equivalent to the other <code>updateCustomIpaccessSvc</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateCustomIpaccessSvcResponse
      */
      @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateCustomIpaccessSvcResponse> updateCustomIpaccessSvcWithHttpInfo(@Param("elid") String elid, UpdateCustomIpaccessSvcRequestData body, @QueryMap(encoded=true) UpdateCustomIpaccessSvcQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateCustomIpaccessSvc</code> method in a fluent style.
   */
  public static class UpdateCustomIpaccessSvcQueryParams extends HashMap<String, Object> {
    public UpdateCustomIpaccessSvcQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesCustomIpaccessSvcResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesCustomIpaccessSvcResponse updateSystemAttributesCustomIpaccessSvc(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCustomIpaccessSvcRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesCustomIpaccessSvc</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesCustomIpaccessSvcResponse> updateSystemAttributesCustomIpaccessSvcWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCustomIpaccessSvcRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesCustomIpaccessSvc</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesCustomIpaccessSvcQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesCustomIpaccessSvcResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesCustomIpaccessSvcResponse updateSystemAttributesCustomIpaccessSvc(@Param("elid") String elid, UpdateSystemAttributesCustomIpaccessSvcRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCustomIpaccessSvcQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesCustomIpaccessSvc</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesCustomIpaccessSvcResponse
      */
      @RequestLine("POST /api/rest/entity/custom/ipaccessSvc/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesCustomIpaccessSvcResponse> updateSystemAttributesCustomIpaccessSvcWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesCustomIpaccessSvcRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCustomIpaccessSvcQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesCustomIpaccessSvc</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesCustomIpaccessSvcQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesCustomIpaccessSvcQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
