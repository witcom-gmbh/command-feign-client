package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateHostnameRequestData;
import com.fntsoftware.businessgateway.entities.CreateHostnameResponse;
import com.fntsoftware.businessgateway.entities.DeleteHostnameRequestData;
import com.fntsoftware.businessgateway.entities.DeleteHostnameResponse;
import com.fntsoftware.businessgateway.entities.HostnameAliasRequestData;
import com.fntsoftware.businessgateway.entities.HostnameAliasResponseData;
import com.fntsoftware.businessgateway.entities.HostnameContractsRequestData;
import com.fntsoftware.businessgateway.entities.HostnameContractsResponseData;
import com.fntsoftware.businessgateway.entities.HostnameDomainRequestData;
import com.fntsoftware.businessgateway.entities.HostnameDomainResponseData;
import com.fntsoftware.businessgateway.entities.HostnameFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.HostnameFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.HostnameIpv4AddressesRequestData;
import com.fntsoftware.businessgateway.entities.HostnameIpv4AddressesResponseData;
import com.fntsoftware.businessgateway.entities.HostnameIpv6AddressesRequestData;
import com.fntsoftware.businessgateway.entities.HostnameIpv6AddressesResponseData;
import com.fntsoftware.businessgateway.entities.HostnameMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.HostnameMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.HostnameNetMandatorRequestData;
import com.fntsoftware.businessgateway.entities.HostnameNetMandatorResponseData;
import com.fntsoftware.businessgateway.entities.HostnameOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.HostnameOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.HostnamePersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.HostnamePersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.HostnamePersonsRequestData;
import com.fntsoftware.businessgateway.entities.HostnamePersonsResponseData;
import com.fntsoftware.businessgateway.entities.HostnameQueryRequest;
import com.fntsoftware.businessgateway.entities.HostnameQueryResponse;
import com.fntsoftware.businessgateway.entities.HostnameSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.HostnameSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateHostnameRequestData;
import com.fntsoftware.businessgateway.entities.UpdateHostnameResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesHostnameRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesHostnameResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface HostnameApi extends ApiClient.Api {


  /**
   * Create
   * Create Hostname
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateHostnameResponse
   */
  @RequestLine("POST /api/rest/entity/hostname/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateHostnameResponse createHostname(@Param("sessionId") String sessionId, CreateHostnameRequestData body);

  /**
   * Create
   * Similar to <code>createHostname</code> but it also returns the http response headers .
   * Create Hostname
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/hostname/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateHostnameResponse> createHostnameWithHttpInfo(@Param("sessionId") String sessionId, CreateHostnameRequestData body);


  /**
   * Create
   * Create Hostname
   * Note, this is equivalent to the other <code>createHostname</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateHostnameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateHostnameResponse
   */
  @RequestLine("POST /api/rest/entity/hostname/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateHostnameResponse createHostname(CreateHostnameRequestData body, @QueryMap(encoded=true) CreateHostnameQueryParams queryParams);

  /**
  * Create
  * Create Hostname
  * Note, this is equivalent to the other <code>createHostname</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateHostnameResponse
      */
      @RequestLine("POST /api/rest/entity/hostname/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateHostnameResponse> createHostnameWithHttpInfo(CreateHostnameRequestData body, @QueryMap(encoded=true) CreateHostnameQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createHostname</code> method in a fluent style.
   */
  public static class CreateHostnameQueryParams extends HashMap<String, Object> {
    public CreateHostnameQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Hostname
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteHostnameResponse
   */
  @RequestLine("POST /api/rest/entity/hostname/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteHostnameResponse deleteHostname(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteHostnameRequestData body);

  /**
   * Delete
   * Similar to <code>deleteHostname</code> but it also returns the http response headers .
   * Delete Hostname
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/hostname/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteHostnameResponse> deleteHostnameWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteHostnameRequestData body);


  /**
   * Delete
   * Delete Hostname
   * Note, this is equivalent to the other <code>deleteHostname</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteHostnameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteHostnameResponse
   */
  @RequestLine("POST /api/rest/entity/hostname/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteHostnameResponse deleteHostname(@Param("elid") String elid, DeleteHostnameRequestData body, @QueryMap(encoded=true) DeleteHostnameQueryParams queryParams);

  /**
  * Delete
  * Delete Hostname
  * Note, this is equivalent to the other <code>deleteHostname</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteHostnameResponse
      */
      @RequestLine("POST /api/rest/entity/hostname/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteHostnameResponse> deleteHostnameWithHttpInfo(@Param("elid") String elid, DeleteHostnameRequestData body, @QueryMap(encoded=true) DeleteHostnameQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteHostname</code> method in a fluent style.
   */
  public static class DeleteHostnameQueryParams extends HashMap<String, Object> {
    public DeleteHostnameQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Alias entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return HostnameAliasResponseData
   */
  @RequestLine("POST /api/rest/entity/hostname/{elid}/Alias?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  HostnameAliasResponseData hostnameAlias(@Param("sessionId") String sessionId, @Param("elid") String elid, HostnameAliasRequestData body);

  /**
   * Get relations to Alias entities
   * Similar to <code>hostnameAlias</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/hostname/{elid}/Alias?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<HostnameAliasResponseData> hostnameAliasWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, HostnameAliasRequestData body);


  /**
   * Get relations to Alias entities
   * 
   * Note, this is equivalent to the other <code>hostnameAlias</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link HostnameAliasQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return HostnameAliasResponseData
   */
  @RequestLine("POST /api/rest/entity/hostname/{elid}/Alias?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  HostnameAliasResponseData hostnameAlias(@Param("elid") String elid, HostnameAliasRequestData body, @QueryMap(encoded=true) HostnameAliasQueryParams queryParams);

  /**
  * Get relations to Alias entities
  * 
  * Note, this is equivalent to the other <code>hostnameAlias</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return HostnameAliasResponseData
      */
      @RequestLine("POST /api/rest/entity/hostname/{elid}/Alias?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<HostnameAliasResponseData> hostnameAliasWithHttpInfo(@Param("elid") String elid, HostnameAliasRequestData body, @QueryMap(encoded=true) HostnameAliasQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>hostnameAlias</code> method in a fluent style.
   */
  public static class HostnameAliasQueryParams extends HashMap<String, Object> {
    public HostnameAliasQueryParams sessionId(final String value) {
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
   * @return HostnameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/hostname/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  HostnameContractsResponseData hostnameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, HostnameContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>hostnameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/hostname/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<HostnameContractsResponseData> hostnameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, HostnameContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>hostnameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link HostnameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return HostnameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/hostname/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  HostnameContractsResponseData hostnameContracts(@Param("elid") String elid, HostnameContractsRequestData body, @QueryMap(encoded=true) HostnameContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>hostnameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return HostnameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/hostname/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<HostnameContractsResponseData> hostnameContractsWithHttpInfo(@Param("elid") String elid, HostnameContractsRequestData body, @QueryMap(encoded=true) HostnameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>hostnameContracts</code> method in a fluent style.
   */
  public static class HostnameContractsQueryParams extends HashMap<String, Object> {
    public HostnameContractsQueryParams sessionId(final String value) {
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
   * @return HostnameDomainResponseData
   */
  @RequestLine("POST /api/rest/entity/hostname/{elid}/Domain?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  HostnameDomainResponseData hostnameDomain(@Param("sessionId") String sessionId, @Param("elid") String elid, HostnameDomainRequestData body);

  /**
   * Get relations to Domain entities
   * Similar to <code>hostnameDomain</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/hostname/{elid}/Domain?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<HostnameDomainResponseData> hostnameDomainWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, HostnameDomainRequestData body);


  /**
   * Get relations to Domain entities
   * 
   * Note, this is equivalent to the other <code>hostnameDomain</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link HostnameDomainQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return HostnameDomainResponseData
   */
  @RequestLine("POST /api/rest/entity/hostname/{elid}/Domain?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  HostnameDomainResponseData hostnameDomain(@Param("elid") String elid, HostnameDomainRequestData body, @QueryMap(encoded=true) HostnameDomainQueryParams queryParams);

  /**
  * Get relations to Domain entities
  * 
  * Note, this is equivalent to the other <code>hostnameDomain</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return HostnameDomainResponseData
      */
      @RequestLine("POST /api/rest/entity/hostname/{elid}/Domain?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<HostnameDomainResponseData> hostnameDomainWithHttpInfo(@Param("elid") String elid, HostnameDomainRequestData body, @QueryMap(encoded=true) HostnameDomainQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>hostnameDomain</code> method in a fluent style.
   */
  public static class HostnameDomainQueryParams extends HashMap<String, Object> {
    public HostnameDomainQueryParams sessionId(final String value) {
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
   * @return HostnameFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/hostname/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  HostnameFrameContractsResponseData hostnameFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, HostnameFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>hostnameFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/hostname/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<HostnameFrameContractsResponseData> hostnameFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, HostnameFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>hostnameFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link HostnameFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return HostnameFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/hostname/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  HostnameFrameContractsResponseData hostnameFrameContracts(@Param("elid") String elid, HostnameFrameContractsRequestData body, @QueryMap(encoded=true) HostnameFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>hostnameFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return HostnameFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/hostname/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<HostnameFrameContractsResponseData> hostnameFrameContractsWithHttpInfo(@Param("elid") String elid, HostnameFrameContractsRequestData body, @QueryMap(encoded=true) HostnameFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>hostnameFrameContracts</code> method in a fluent style.
   */
  public static class HostnameFrameContractsQueryParams extends HashMap<String, Object> {
    public HostnameFrameContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to IPv4 address entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return HostnameIpv4AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/hostname/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  HostnameIpv4AddressesResponseData hostnameIpv4Addresses(@Param("sessionId") String sessionId, @Param("elid") String elid, HostnameIpv4AddressesRequestData body);

  /**
   * Get relations to IPv4 address entities
   * Similar to <code>hostnameIpv4Addresses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/hostname/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<HostnameIpv4AddressesResponseData> hostnameIpv4AddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, HostnameIpv4AddressesRequestData body);


  /**
   * Get relations to IPv4 address entities
   * 
   * Note, this is equivalent to the other <code>hostnameIpv4Addresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link HostnameIpv4AddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return HostnameIpv4AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/hostname/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  HostnameIpv4AddressesResponseData hostnameIpv4Addresses(@Param("elid") String elid, HostnameIpv4AddressesRequestData body, @QueryMap(encoded=true) HostnameIpv4AddressesQueryParams queryParams);

  /**
  * Get relations to IPv4 address entities
  * 
  * Note, this is equivalent to the other <code>hostnameIpv4Addresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return HostnameIpv4AddressesResponseData
      */
      @RequestLine("POST /api/rest/entity/hostname/{elid}/Ipv4Addresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<HostnameIpv4AddressesResponseData> hostnameIpv4AddressesWithHttpInfo(@Param("elid") String elid, HostnameIpv4AddressesRequestData body, @QueryMap(encoded=true) HostnameIpv4AddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>hostnameIpv4Addresses</code> method in a fluent style.
   */
  public static class HostnameIpv4AddressesQueryParams extends HashMap<String, Object> {
    public HostnameIpv4AddressesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to IPv6 address entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return HostnameIpv6AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/hostname/{elid}/Ipv6Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  HostnameIpv6AddressesResponseData hostnameIpv6Addresses(@Param("sessionId") String sessionId, @Param("elid") String elid, HostnameIpv6AddressesRequestData body);

  /**
   * Get relations to IPv6 address entities
   * Similar to <code>hostnameIpv6Addresses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/hostname/{elid}/Ipv6Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<HostnameIpv6AddressesResponseData> hostnameIpv6AddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, HostnameIpv6AddressesRequestData body);


  /**
   * Get relations to IPv6 address entities
   * 
   * Note, this is equivalent to the other <code>hostnameIpv6Addresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link HostnameIpv6AddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return HostnameIpv6AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/hostname/{elid}/Ipv6Addresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  HostnameIpv6AddressesResponseData hostnameIpv6Addresses(@Param("elid") String elid, HostnameIpv6AddressesRequestData body, @QueryMap(encoded=true) HostnameIpv6AddressesQueryParams queryParams);

  /**
  * Get relations to IPv6 address entities
  * 
  * Note, this is equivalent to the other <code>hostnameIpv6Addresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return HostnameIpv6AddressesResponseData
      */
      @RequestLine("POST /api/rest/entity/hostname/{elid}/Ipv6Addresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<HostnameIpv6AddressesResponseData> hostnameIpv6AddressesWithHttpInfo(@Param("elid") String elid, HostnameIpv6AddressesRequestData body, @QueryMap(encoded=true) HostnameIpv6AddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>hostnameIpv6Addresses</code> method in a fluent style.
   */
  public static class HostnameIpv6AddressesQueryParams extends HashMap<String, Object> {
    public HostnameIpv6AddressesQueryParams sessionId(final String value) {
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
   * @return HostnameMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/hostname/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  HostnameMaintenanceContractsResponseData hostnameMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, HostnameMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>hostnameMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/hostname/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<HostnameMaintenanceContractsResponseData> hostnameMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, HostnameMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>hostnameMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link HostnameMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return HostnameMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/hostname/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  HostnameMaintenanceContractsResponseData hostnameMaintenanceContracts(@Param("elid") String elid, HostnameMaintenanceContractsRequestData body, @QueryMap(encoded=true) HostnameMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>hostnameMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return HostnameMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/hostname/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<HostnameMaintenanceContractsResponseData> hostnameMaintenanceContractsWithHttpInfo(@Param("elid") String elid, HostnameMaintenanceContractsRequestData body, @QueryMap(encoded=true) HostnameMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>hostnameMaintenanceContracts</code> method in a fluent style.
   */
  public static class HostnameMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public HostnameMaintenanceContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Net mandator entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return HostnameNetMandatorResponseData
   */
  @RequestLine("POST /api/rest/entity/hostname/{elid}/NetMandator?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  HostnameNetMandatorResponseData hostnameNetMandator(@Param("sessionId") String sessionId, @Param("elid") String elid, HostnameNetMandatorRequestData body);

  /**
   * Get relations to Net mandator entities
   * Similar to <code>hostnameNetMandator</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/hostname/{elid}/NetMandator?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<HostnameNetMandatorResponseData> hostnameNetMandatorWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, HostnameNetMandatorRequestData body);


  /**
   * Get relations to Net mandator entities
   * 
   * Note, this is equivalent to the other <code>hostnameNetMandator</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link HostnameNetMandatorQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return HostnameNetMandatorResponseData
   */
  @RequestLine("POST /api/rest/entity/hostname/{elid}/NetMandator?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  HostnameNetMandatorResponseData hostnameNetMandator(@Param("elid") String elid, HostnameNetMandatorRequestData body, @QueryMap(encoded=true) HostnameNetMandatorQueryParams queryParams);

  /**
  * Get relations to Net mandator entities
  * 
  * Note, this is equivalent to the other <code>hostnameNetMandator</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return HostnameNetMandatorResponseData
      */
      @RequestLine("POST /api/rest/entity/hostname/{elid}/NetMandator?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<HostnameNetMandatorResponseData> hostnameNetMandatorWithHttpInfo(@Param("elid") String elid, HostnameNetMandatorRequestData body, @QueryMap(encoded=true) HostnameNetMandatorQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>hostnameNetMandator</code> method in a fluent style.
   */
  public static class HostnameNetMandatorQueryParams extends HashMap<String, Object> {
    public HostnameNetMandatorQueryParams sessionId(final String value) {
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
   * @return HostnameOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/hostname/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  HostnameOrganizationsResponseData hostnameOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, HostnameOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>hostnameOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/hostname/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<HostnameOrganizationsResponseData> hostnameOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, HostnameOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>hostnameOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link HostnameOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return HostnameOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/hostname/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  HostnameOrganizationsResponseData hostnameOrganizations(@Param("elid") String elid, HostnameOrganizationsRequestData body, @QueryMap(encoded=true) HostnameOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>hostnameOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return HostnameOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/hostname/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<HostnameOrganizationsResponseData> hostnameOrganizationsWithHttpInfo(@Param("elid") String elid, HostnameOrganizationsRequestData body, @QueryMap(encoded=true) HostnameOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>hostnameOrganizations</code> method in a fluent style.
   */
  public static class HostnameOrganizationsQueryParams extends HashMap<String, Object> {
    public HostnameOrganizationsQueryParams sessionId(final String value) {
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
   * @return HostnamePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/hostname/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  HostnamePersonGroupsResponseData hostnamePersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, HostnamePersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>hostnamePersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/hostname/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<HostnamePersonGroupsResponseData> hostnamePersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, HostnamePersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>hostnamePersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link HostnamePersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return HostnamePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/hostname/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  HostnamePersonGroupsResponseData hostnamePersonGroups(@Param("elid") String elid, HostnamePersonGroupsRequestData body, @QueryMap(encoded=true) HostnamePersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>hostnamePersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return HostnamePersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/hostname/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<HostnamePersonGroupsResponseData> hostnamePersonGroupsWithHttpInfo(@Param("elid") String elid, HostnamePersonGroupsRequestData body, @QueryMap(encoded=true) HostnamePersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>hostnamePersonGroups</code> method in a fluent style.
   */
  public static class HostnamePersonGroupsQueryParams extends HashMap<String, Object> {
    public HostnamePersonGroupsQueryParams sessionId(final String value) {
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
   * @return HostnamePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/hostname/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  HostnamePersonsResponseData hostnamePersons(@Param("sessionId") String sessionId, @Param("elid") String elid, HostnamePersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>hostnamePersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/hostname/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<HostnamePersonsResponseData> hostnamePersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, HostnamePersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>hostnamePersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link HostnamePersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return HostnamePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/hostname/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  HostnamePersonsResponseData hostnamePersons(@Param("elid") String elid, HostnamePersonsRequestData body, @QueryMap(encoded=true) HostnamePersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>hostnamePersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return HostnamePersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/hostname/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<HostnamePersonsResponseData> hostnamePersonsWithHttpInfo(@Param("elid") String elid, HostnamePersonsRequestData body, @QueryMap(encoded=true) HostnamePersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>hostnamePersons</code> method in a fluent style.
   */
  public static class HostnamePersonsQueryParams extends HashMap<String, Object> {
    public HostnamePersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return HostnameQueryResponse
   */
  @RequestLine("POST /api/rest/entity/hostname/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  HostnameQueryResponse hostnameQuery(@Param("sessionId") String sessionId, HostnameQueryRequest body);

  /**
   * Basic query
   * Similar to <code>hostnameQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/hostname/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<HostnameQueryResponse> hostnameQueryWithHttpInfo(@Param("sessionId") String sessionId, HostnameQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>hostnameQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link HostnameQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return HostnameQueryResponse
   */
  @RequestLine("POST /api/rest/entity/hostname/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  HostnameQueryResponse hostnameQuery(HostnameQueryRequest body, @QueryMap(encoded=true) HostnameQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>hostnameQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return HostnameQueryResponse
      */
      @RequestLine("POST /api/rest/entity/hostname/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<HostnameQueryResponse> hostnameQueryWithHttpInfo(HostnameQueryRequest body, @QueryMap(encoded=true) HostnameQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>hostnameQuery</code> method in a fluent style.
   */
  public static class HostnameQueryQueryParams extends HashMap<String, Object> {
    public HostnameQueryQueryParams sessionId(final String value) {
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
   * @return HostnameSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/hostname/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  HostnameSystemAttributesResponse hostnameSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, HostnameSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>hostnameSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/hostname/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<HostnameSystemAttributesResponse> hostnameSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, HostnameSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>hostnameSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link HostnameSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return HostnameSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/hostname/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  HostnameSystemAttributesResponse hostnameSystemAttributes(@Param("elid") String elid, HostnameSystemAttributesRequest body, @QueryMap(encoded=true) HostnameSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>hostnameSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return HostnameSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/hostname/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<HostnameSystemAttributesResponse> hostnameSystemAttributesWithHttpInfo(@Param("elid") String elid, HostnameSystemAttributesRequest body, @QueryMap(encoded=true) HostnameSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>hostnameSystemAttributes</code> method in a fluent style.
   */
  public static class HostnameSystemAttributesQueryParams extends HashMap<String, Object> {
    public HostnameSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify hostname
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateHostnameResponse
   */
  @RequestLine("POST /api/rest/entity/hostname/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateHostnameResponse updateHostname(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateHostnameRequestData body);

  /**
   * Modify
   * Similar to <code>updateHostname</code> but it also returns the http response headers .
   * Modify hostname
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/hostname/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateHostnameResponse> updateHostnameWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateHostnameRequestData body);


  /**
   * Modify
   * Modify hostname
   * Note, this is equivalent to the other <code>updateHostname</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateHostnameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateHostnameResponse
   */
  @RequestLine("POST /api/rest/entity/hostname/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateHostnameResponse updateHostname(@Param("elid") String elid, UpdateHostnameRequestData body, @QueryMap(encoded=true) UpdateHostnameQueryParams queryParams);

  /**
  * Modify
  * Modify hostname
  * Note, this is equivalent to the other <code>updateHostname</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateHostnameResponse
      */
      @RequestLine("POST /api/rest/entity/hostname/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateHostnameResponse> updateHostnameWithHttpInfo(@Param("elid") String elid, UpdateHostnameRequestData body, @QueryMap(encoded=true) UpdateHostnameQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateHostname</code> method in a fluent style.
   */
  public static class UpdateHostnameQueryParams extends HashMap<String, Object> {
    public UpdateHostnameQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesHostnameResponse
   */
  @RequestLine("POST /api/rest/entity/hostname/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesHostnameResponse updateSystemAttributesHostname(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesHostnameRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesHostname</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/hostname/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesHostnameResponse> updateSystemAttributesHostnameWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesHostnameRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesHostname</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesHostnameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesHostnameResponse
   */
  @RequestLine("POST /api/rest/entity/hostname/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesHostnameResponse updateSystemAttributesHostname(@Param("elid") String elid, UpdateSystemAttributesHostnameRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesHostnameQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesHostname</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesHostnameResponse
      */
      @RequestLine("POST /api/rest/entity/hostname/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesHostnameResponse> updateSystemAttributesHostnameWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesHostnameRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesHostnameQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesHostname</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesHostnameQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesHostnameQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
