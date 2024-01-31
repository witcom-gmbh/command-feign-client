package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateInterfaceRequestData;
import com.fntsoftware.businessgateway.entities.CreateInterfaceResponse;
import com.fntsoftware.businessgateway.entities.DeleteInterfaceRequestData;
import com.fntsoftware.businessgateway.entities.DeleteInterfaceResponse;
import com.fntsoftware.businessgateway.entities.Interface100043RequestData;
import com.fntsoftware.businessgateway.entities.Interface100043ResponseData;
import com.fntsoftware.businessgateway.entities.InterfaceContractsRequestData;
import com.fntsoftware.businessgateway.entities.InterfaceContractsResponseData;
import com.fntsoftware.businessgateway.entities.InterfaceCustomIpaccessSvcRequestData;
import com.fntsoftware.businessgateway.entities.InterfaceCustomIpaccessSvcResponseData;
import com.fntsoftware.businessgateway.entities.InterfaceCustomTcoSapRequestData;
import com.fntsoftware.businessgateway.entities.InterfaceCustomTcoSapResponseData;
import com.fntsoftware.businessgateway.entities.InterfaceDevicesAllRequestData;
import com.fntsoftware.businessgateway.entities.InterfaceDevicesAllResponseData;
import com.fntsoftware.businessgateway.entities.InterfaceFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.InterfaceFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.InterfaceIpv4AddressesRequestData;
import com.fntsoftware.businessgateway.entities.InterfaceIpv4AddressesResponseData;
import com.fntsoftware.businessgateway.entities.InterfaceMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.InterfaceMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.InterfaceObjectsRequest;
import com.fntsoftware.businessgateway.entities.InterfaceObjectsResponse;
import com.fntsoftware.businessgateway.entities.InterfaceOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.InterfaceOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.InterfacePersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.InterfacePersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.InterfacePersonsRequestData;
import com.fntsoftware.businessgateway.entities.InterfacePersonsResponseData;
import com.fntsoftware.businessgateway.entities.InterfacePhysicalPortsDataRequestData;
import com.fntsoftware.businessgateway.entities.InterfacePhysicalPortsDataResponseData;
import com.fntsoftware.businessgateway.entities.InterfaceQueryRequest;
import com.fntsoftware.businessgateway.entities.InterfaceQueryResponse;
import com.fntsoftware.businessgateway.entities.InterfaceSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.InterfaceSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.InterfaceVirtualNasServersRequestData;
import com.fntsoftware.businessgateway.entities.InterfaceVirtualNasServersResponseData;
import com.fntsoftware.businessgateway.entities.InterfaceVirtualServersRequestData;
import com.fntsoftware.businessgateway.entities.InterfaceVirtualServersResponseData;
import com.fntsoftware.businessgateway.entities.InterfaceVirtualSwitchesRequestData;
import com.fntsoftware.businessgateway.entities.InterfaceVirtualSwitchesResponseData;
import com.fntsoftware.businessgateway.entities.UpdateInterfaceRequestData;
import com.fntsoftware.businessgateway.entities.UpdateInterfaceResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesInterfaceRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesInterfaceResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface InterfaceApi extends ApiClient.Api {


  /**
   * Create
   * Create interface
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateInterfaceResponse
   */
  @RequestLine("POST /api/rest/entity/interface/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateInterfaceResponse createInterface(@Param("sessionId") String sessionId, CreateInterfaceRequestData body);

  /**
   * Create
   * Similar to <code>createInterface</code> but it also returns the http response headers .
   * Create interface
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/interface/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateInterfaceResponse> createInterfaceWithHttpInfo(@Param("sessionId") String sessionId, CreateInterfaceRequestData body);


  /**
   * Create
   * Create interface
   * Note, this is equivalent to the other <code>createInterface</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateInterfaceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateInterfaceResponse
   */
  @RequestLine("POST /api/rest/entity/interface/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateInterfaceResponse createInterface(CreateInterfaceRequestData body, @QueryMap(encoded=true) CreateInterfaceQueryParams queryParams);

  /**
  * Create
  * Create interface
  * Note, this is equivalent to the other <code>createInterface</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateInterfaceResponse
      */
      @RequestLine("POST /api/rest/entity/interface/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateInterfaceResponse> createInterfaceWithHttpInfo(CreateInterfaceRequestData body, @QueryMap(encoded=true) CreateInterfaceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createInterface</code> method in a fluent style.
   */
  public static class CreateInterfaceQueryParams extends HashMap<String, Object> {
    public CreateInterfaceQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete interface
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteInterfaceResponse
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteInterfaceResponse deleteInterface(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteInterfaceRequestData body);

  /**
   * Delete
   * Similar to <code>deleteInterface</code> but it also returns the http response headers .
   * Delete interface
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteInterfaceResponse> deleteInterfaceWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteInterfaceRequestData body);


  /**
   * Delete
   * Delete interface
   * Note, this is equivalent to the other <code>deleteInterface</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteInterfaceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteInterfaceResponse
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteInterfaceResponse deleteInterface(@Param("elid") String elid, DeleteInterfaceRequestData body, @QueryMap(encoded=true) DeleteInterfaceQueryParams queryParams);

  /**
  * Delete
  * Delete interface
  * Note, this is equivalent to the other <code>deleteInterface</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteInterfaceResponse
      */
      @RequestLine("POST /api/rest/entity/interface/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteInterfaceResponse> deleteInterfaceWithHttpInfo(@Param("elid") String elid, DeleteInterfaceRequestData body, @QueryMap(encoded=true) DeleteInterfaceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteInterface</code> method in a fluent style.
   */
  public static class DeleteInterfaceQueryParams extends HashMap<String, Object> {
    public DeleteInterfaceQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to OSPF-Area entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return Interface100043ResponseData
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/100043?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Interface100043ResponseData interface100043(@Param("sessionId") String sessionId, @Param("elid") String elid, Interface100043RequestData body);

  /**
   * Get relations to OSPF-Area entities
   * Similar to <code>interface100043</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/100043?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Interface100043ResponseData> interface100043WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Interface100043RequestData body);


  /**
   * Get relations to OSPF-Area entities
   * 
   * Note, this is equivalent to the other <code>interface100043</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Interface100043QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Interface100043ResponseData
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/100043?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Interface100043ResponseData interface100043(@Param("elid") String elid, Interface100043RequestData body, @QueryMap(encoded=true) Interface100043QueryParams queryParams);

  /**
  * Get relations to OSPF-Area entities
  * 
  * Note, this is equivalent to the other <code>interface100043</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Interface100043ResponseData
      */
      @RequestLine("POST /api/rest/entity/interface/{elid}/100043?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Interface100043ResponseData> interface100043WithHttpInfo(@Param("elid") String elid, Interface100043RequestData body, @QueryMap(encoded=true) Interface100043QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>interface100043</code> method in a fluent style.
   */
  public static class Interface100043QueryParams extends HashMap<String, Object> {
    public Interface100043QueryParams sessionId(final String value) {
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
   * @return InterfaceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  InterfaceContractsResponseData interfaceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, InterfaceContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>interfaceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<InterfaceContractsResponseData> interfaceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, InterfaceContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>interfaceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link InterfaceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return InterfaceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  InterfaceContractsResponseData interfaceContracts(@Param("elid") String elid, InterfaceContractsRequestData body, @QueryMap(encoded=true) InterfaceContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>interfaceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return InterfaceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/interface/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<InterfaceContractsResponseData> interfaceContractsWithHttpInfo(@Param("elid") String elid, InterfaceContractsRequestData body, @QueryMap(encoded=true) InterfaceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>interfaceContracts</code> method in a fluent style.
   */
  public static class InterfaceContractsQueryParams extends HashMap<String, Object> {
    public InterfaceContractsQueryParams sessionId(final String value) {
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
   * @return InterfaceCustomIpaccessSvcResponseData
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/CustomIpaccessSvc?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  InterfaceCustomIpaccessSvcResponseData interfaceCustomIpaccessSvc(@Param("sessionId") String sessionId, @Param("elid") String elid, InterfaceCustomIpaccessSvcRequestData body);

  /**
   * Get relations to IP-Access Service entities
   * Similar to <code>interfaceCustomIpaccessSvc</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/CustomIpaccessSvc?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<InterfaceCustomIpaccessSvcResponseData> interfaceCustomIpaccessSvcWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, InterfaceCustomIpaccessSvcRequestData body);


  /**
   * Get relations to IP-Access Service entities
   * 
   * Note, this is equivalent to the other <code>interfaceCustomIpaccessSvc</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link InterfaceCustomIpaccessSvcQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return InterfaceCustomIpaccessSvcResponseData
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/CustomIpaccessSvc?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  InterfaceCustomIpaccessSvcResponseData interfaceCustomIpaccessSvc(@Param("elid") String elid, InterfaceCustomIpaccessSvcRequestData body, @QueryMap(encoded=true) InterfaceCustomIpaccessSvcQueryParams queryParams);

  /**
  * Get relations to IP-Access Service entities
  * 
  * Note, this is equivalent to the other <code>interfaceCustomIpaccessSvc</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return InterfaceCustomIpaccessSvcResponseData
      */
      @RequestLine("POST /api/rest/entity/interface/{elid}/CustomIpaccessSvc?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<InterfaceCustomIpaccessSvcResponseData> interfaceCustomIpaccessSvcWithHttpInfo(@Param("elid") String elid, InterfaceCustomIpaccessSvcRequestData body, @QueryMap(encoded=true) InterfaceCustomIpaccessSvcQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>interfaceCustomIpaccessSvc</code> method in a fluent style.
   */
  public static class InterfaceCustomIpaccessSvcQueryParams extends HashMap<String, Object> {
    public InterfaceCustomIpaccessSvcQueryParams sessionId(final String value) {
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
   * @return InterfaceCustomTcoSapResponseData
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/CustomTcoSap?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  InterfaceCustomTcoSapResponseData interfaceCustomTcoSap(@Param("sessionId") String sessionId, @Param("elid") String elid, InterfaceCustomTcoSapRequestData body);

  /**
   * Get relations to Service Access Point entities
   * Similar to <code>interfaceCustomTcoSap</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/CustomTcoSap?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<InterfaceCustomTcoSapResponseData> interfaceCustomTcoSapWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, InterfaceCustomTcoSapRequestData body);


  /**
   * Get relations to Service Access Point entities
   * 
   * Note, this is equivalent to the other <code>interfaceCustomTcoSap</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link InterfaceCustomTcoSapQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return InterfaceCustomTcoSapResponseData
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/CustomTcoSap?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  InterfaceCustomTcoSapResponseData interfaceCustomTcoSap(@Param("elid") String elid, InterfaceCustomTcoSapRequestData body, @QueryMap(encoded=true) InterfaceCustomTcoSapQueryParams queryParams);

  /**
  * Get relations to Service Access Point entities
  * 
  * Note, this is equivalent to the other <code>interfaceCustomTcoSap</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return InterfaceCustomTcoSapResponseData
      */
      @RequestLine("POST /api/rest/entity/interface/{elid}/CustomTcoSap?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<InterfaceCustomTcoSapResponseData> interfaceCustomTcoSapWithHttpInfo(@Param("elid") String elid, InterfaceCustomTcoSapRequestData body, @QueryMap(encoded=true) InterfaceCustomTcoSapQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>interfaceCustomTcoSap</code> method in a fluent style.
   */
  public static class InterfaceCustomTcoSapQueryParams extends HashMap<String, Object> {
    public InterfaceCustomTcoSapQueryParams sessionId(final String value) {
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
   * @return InterfaceDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  InterfaceDevicesAllResponseData interfaceDevicesAll(@Param("sessionId") String sessionId, @Param("elid") String elid, InterfaceDevicesAllRequestData body);

  /**
   * Get relations to Device (all) entities
   * Similar to <code>interfaceDevicesAll</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<InterfaceDevicesAllResponseData> interfaceDevicesAllWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, InterfaceDevicesAllRequestData body);


  /**
   * Get relations to Device (all) entities
   * 
   * Note, this is equivalent to the other <code>interfaceDevicesAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link InterfaceDevicesAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return InterfaceDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  InterfaceDevicesAllResponseData interfaceDevicesAll(@Param("elid") String elid, InterfaceDevicesAllRequestData body, @QueryMap(encoded=true) InterfaceDevicesAllQueryParams queryParams);

  /**
  * Get relations to Device (all) entities
  * 
  * Note, this is equivalent to the other <code>interfaceDevicesAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return InterfaceDevicesAllResponseData
      */
      @RequestLine("POST /api/rest/entity/interface/{elid}/DevicesAll?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<InterfaceDevicesAllResponseData> interfaceDevicesAllWithHttpInfo(@Param("elid") String elid, InterfaceDevicesAllRequestData body, @QueryMap(encoded=true) InterfaceDevicesAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>interfaceDevicesAll</code> method in a fluent style.
   */
  public static class InterfaceDevicesAllQueryParams extends HashMap<String, Object> {
    public InterfaceDevicesAllQueryParams sessionId(final String value) {
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
   * @return InterfaceFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  InterfaceFrameContractsResponseData interfaceFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, InterfaceFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>interfaceFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<InterfaceFrameContractsResponseData> interfaceFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, InterfaceFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>interfaceFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link InterfaceFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return InterfaceFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  InterfaceFrameContractsResponseData interfaceFrameContracts(@Param("elid") String elid, InterfaceFrameContractsRequestData body, @QueryMap(encoded=true) InterfaceFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>interfaceFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return InterfaceFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/interface/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<InterfaceFrameContractsResponseData> interfaceFrameContractsWithHttpInfo(@Param("elid") String elid, InterfaceFrameContractsRequestData body, @QueryMap(encoded=true) InterfaceFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>interfaceFrameContracts</code> method in a fluent style.
   */
  public static class InterfaceFrameContractsQueryParams extends HashMap<String, Object> {
    public InterfaceFrameContractsQueryParams sessionId(final String value) {
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
   * @return InterfaceIpv4AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  InterfaceIpv4AddressesResponseData interfaceIpv4Addresses(@Param("sessionId") String sessionId, @Param("elid") String elid, InterfaceIpv4AddressesRequestData body);

  /**
   * Get relations to IPv4 address entities
   * Similar to <code>interfaceIpv4Addresses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<InterfaceIpv4AddressesResponseData> interfaceIpv4AddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, InterfaceIpv4AddressesRequestData body);


  /**
   * Get relations to IPv4 address entities
   * 
   * Note, this is equivalent to the other <code>interfaceIpv4Addresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link InterfaceIpv4AddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return InterfaceIpv4AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  InterfaceIpv4AddressesResponseData interfaceIpv4Addresses(@Param("elid") String elid, InterfaceIpv4AddressesRequestData body, @QueryMap(encoded=true) InterfaceIpv4AddressesQueryParams queryParams);

  /**
  * Get relations to IPv4 address entities
  * 
  * Note, this is equivalent to the other <code>interfaceIpv4Addresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return InterfaceIpv4AddressesResponseData
      */
      @RequestLine("POST /api/rest/entity/interface/{elid}/Ipv4Addresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<InterfaceIpv4AddressesResponseData> interfaceIpv4AddressesWithHttpInfo(@Param("elid") String elid, InterfaceIpv4AddressesRequestData body, @QueryMap(encoded=true) InterfaceIpv4AddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>interfaceIpv4Addresses</code> method in a fluent style.
   */
  public static class InterfaceIpv4AddressesQueryParams extends HashMap<String, Object> {
    public InterfaceIpv4AddressesQueryParams sessionId(final String value) {
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
   * @return InterfaceMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  InterfaceMaintenanceContractsResponseData interfaceMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, InterfaceMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>interfaceMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<InterfaceMaintenanceContractsResponseData> interfaceMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, InterfaceMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>interfaceMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link InterfaceMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return InterfaceMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  InterfaceMaintenanceContractsResponseData interfaceMaintenanceContracts(@Param("elid") String elid, InterfaceMaintenanceContractsRequestData body, @QueryMap(encoded=true) InterfaceMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>interfaceMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return InterfaceMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/interface/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<InterfaceMaintenanceContractsResponseData> interfaceMaintenanceContractsWithHttpInfo(@Param("elid") String elid, InterfaceMaintenanceContractsRequestData body, @QueryMap(encoded=true) InterfaceMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>interfaceMaintenanceContracts</code> method in a fluent style.
   */
  public static class InterfaceMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public InterfaceMaintenanceContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Objects
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return InterfaceObjectsResponse
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/Objects?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  InterfaceObjectsResponse interfaceObjects(@Param("sessionId") String sessionId, @Param("elid") String elid, InterfaceObjectsRequest body);

  /**
   * Objects
   * Similar to <code>interfaceObjects</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/Objects?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<InterfaceObjectsResponse> interfaceObjectsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, InterfaceObjectsRequest body);


  /**
   * Objects
   * 
   * Note, this is equivalent to the other <code>interfaceObjects</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link InterfaceObjectsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return InterfaceObjectsResponse
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/Objects?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  InterfaceObjectsResponse interfaceObjects(@Param("elid") String elid, InterfaceObjectsRequest body, @QueryMap(encoded=true) InterfaceObjectsQueryParams queryParams);

  /**
  * Objects
  * 
  * Note, this is equivalent to the other <code>interfaceObjects</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return InterfaceObjectsResponse
      */
      @RequestLine("POST /api/rest/entity/interface/{elid}/Objects?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<InterfaceObjectsResponse> interfaceObjectsWithHttpInfo(@Param("elid") String elid, InterfaceObjectsRequest body, @QueryMap(encoded=true) InterfaceObjectsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>interfaceObjects</code> method in a fluent style.
   */
  public static class InterfaceObjectsQueryParams extends HashMap<String, Object> {
    public InterfaceObjectsQueryParams sessionId(final String value) {
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
   * @return InterfaceOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  InterfaceOrganizationsResponseData interfaceOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, InterfaceOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>interfaceOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<InterfaceOrganizationsResponseData> interfaceOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, InterfaceOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>interfaceOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link InterfaceOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return InterfaceOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  InterfaceOrganizationsResponseData interfaceOrganizations(@Param("elid") String elid, InterfaceOrganizationsRequestData body, @QueryMap(encoded=true) InterfaceOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>interfaceOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return InterfaceOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/interface/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<InterfaceOrganizationsResponseData> interfaceOrganizationsWithHttpInfo(@Param("elid") String elid, InterfaceOrganizationsRequestData body, @QueryMap(encoded=true) InterfaceOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>interfaceOrganizations</code> method in a fluent style.
   */
  public static class InterfaceOrganizationsQueryParams extends HashMap<String, Object> {
    public InterfaceOrganizationsQueryParams sessionId(final String value) {
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
   * @return InterfacePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  InterfacePersonGroupsResponseData interfacePersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, InterfacePersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>interfacePersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<InterfacePersonGroupsResponseData> interfacePersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, InterfacePersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>interfacePersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link InterfacePersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return InterfacePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  InterfacePersonGroupsResponseData interfacePersonGroups(@Param("elid") String elid, InterfacePersonGroupsRequestData body, @QueryMap(encoded=true) InterfacePersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>interfacePersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return InterfacePersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/interface/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<InterfacePersonGroupsResponseData> interfacePersonGroupsWithHttpInfo(@Param("elid") String elid, InterfacePersonGroupsRequestData body, @QueryMap(encoded=true) InterfacePersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>interfacePersonGroups</code> method in a fluent style.
   */
  public static class InterfacePersonGroupsQueryParams extends HashMap<String, Object> {
    public InterfacePersonGroupsQueryParams sessionId(final String value) {
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
   * @return InterfacePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  InterfacePersonsResponseData interfacePersons(@Param("sessionId") String sessionId, @Param("elid") String elid, InterfacePersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>interfacePersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<InterfacePersonsResponseData> interfacePersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, InterfacePersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>interfacePersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link InterfacePersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return InterfacePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  InterfacePersonsResponseData interfacePersons(@Param("elid") String elid, InterfacePersonsRequestData body, @QueryMap(encoded=true) InterfacePersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>interfacePersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return InterfacePersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/interface/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<InterfacePersonsResponseData> interfacePersonsWithHttpInfo(@Param("elid") String elid, InterfacePersonsRequestData body, @QueryMap(encoded=true) InterfacePersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>interfacePersons</code> method in a fluent style.
   */
  public static class InterfacePersonsQueryParams extends HashMap<String, Object> {
    public InterfacePersonsQueryParams sessionId(final String value) {
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
   * @return InterfacePhysicalPortsDataResponseData
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  InterfacePhysicalPortsDataResponseData interfacePhysicalPortsData(@Param("sessionId") String sessionId, @Param("elid") String elid, InterfacePhysicalPortsDataRequestData body);

  /**
   * Get relations to Physical port (data) entities
   * Similar to <code>interfacePhysicalPortsData</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<InterfacePhysicalPortsDataResponseData> interfacePhysicalPortsDataWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, InterfacePhysicalPortsDataRequestData body);


  /**
   * Get relations to Physical port (data) entities
   * 
   * Note, this is equivalent to the other <code>interfacePhysicalPortsData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link InterfacePhysicalPortsDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return InterfacePhysicalPortsDataResponseData
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  InterfacePhysicalPortsDataResponseData interfacePhysicalPortsData(@Param("elid") String elid, InterfacePhysicalPortsDataRequestData body, @QueryMap(encoded=true) InterfacePhysicalPortsDataQueryParams queryParams);

  /**
  * Get relations to Physical port (data) entities
  * 
  * Note, this is equivalent to the other <code>interfacePhysicalPortsData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return InterfacePhysicalPortsDataResponseData
      */
      @RequestLine("POST /api/rest/entity/interface/{elid}/PhysicalPortsData?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<InterfacePhysicalPortsDataResponseData> interfacePhysicalPortsDataWithHttpInfo(@Param("elid") String elid, InterfacePhysicalPortsDataRequestData body, @QueryMap(encoded=true) InterfacePhysicalPortsDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>interfacePhysicalPortsData</code> method in a fluent style.
   */
  public static class InterfacePhysicalPortsDataQueryParams extends HashMap<String, Object> {
    public InterfacePhysicalPortsDataQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return InterfaceQueryResponse
   */
  @RequestLine("POST /api/rest/entity/interface/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  InterfaceQueryResponse interfaceQuery(@Param("sessionId") String sessionId, InterfaceQueryRequest body);

  /**
   * Basic query
   * Similar to <code>interfaceQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/interface/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<InterfaceQueryResponse> interfaceQueryWithHttpInfo(@Param("sessionId") String sessionId, InterfaceQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>interfaceQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link InterfaceQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return InterfaceQueryResponse
   */
  @RequestLine("POST /api/rest/entity/interface/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  InterfaceQueryResponse interfaceQuery(InterfaceQueryRequest body, @QueryMap(encoded=true) InterfaceQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>interfaceQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return InterfaceQueryResponse
      */
      @RequestLine("POST /api/rest/entity/interface/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<InterfaceQueryResponse> interfaceQueryWithHttpInfo(InterfaceQueryRequest body, @QueryMap(encoded=true) InterfaceQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>interfaceQuery</code> method in a fluent style.
   */
  public static class InterfaceQueryQueryParams extends HashMap<String, Object> {
    public InterfaceQueryQueryParams sessionId(final String value) {
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
   * @return InterfaceSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  InterfaceSystemAttributesResponse interfaceSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, InterfaceSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>interfaceSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<InterfaceSystemAttributesResponse> interfaceSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, InterfaceSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>interfaceSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link InterfaceSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return InterfaceSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  InterfaceSystemAttributesResponse interfaceSystemAttributes(@Param("elid") String elid, InterfaceSystemAttributesRequest body, @QueryMap(encoded=true) InterfaceSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>interfaceSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return InterfaceSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/interface/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<InterfaceSystemAttributesResponse> interfaceSystemAttributesWithHttpInfo(@Param("elid") String elid, InterfaceSystemAttributesRequest body, @QueryMap(encoded=true) InterfaceSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>interfaceSystemAttributes</code> method in a fluent style.
   */
  public static class InterfaceSystemAttributesQueryParams extends HashMap<String, Object> {
    public InterfaceSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Virtual NAS server entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return InterfaceVirtualNasServersResponseData
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/VirtualNasServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  InterfaceVirtualNasServersResponseData interfaceVirtualNasServers(@Param("sessionId") String sessionId, @Param("elid") String elid, InterfaceVirtualNasServersRequestData body);

  /**
   * Get relations to Virtual NAS server entities
   * Similar to <code>interfaceVirtualNasServers</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/VirtualNasServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<InterfaceVirtualNasServersResponseData> interfaceVirtualNasServersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, InterfaceVirtualNasServersRequestData body);


  /**
   * Get relations to Virtual NAS server entities
   * 
   * Note, this is equivalent to the other <code>interfaceVirtualNasServers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link InterfaceVirtualNasServersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return InterfaceVirtualNasServersResponseData
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/VirtualNasServers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  InterfaceVirtualNasServersResponseData interfaceVirtualNasServers(@Param("elid") String elid, InterfaceVirtualNasServersRequestData body, @QueryMap(encoded=true) InterfaceVirtualNasServersQueryParams queryParams);

  /**
  * Get relations to Virtual NAS server entities
  * 
  * Note, this is equivalent to the other <code>interfaceVirtualNasServers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return InterfaceVirtualNasServersResponseData
      */
      @RequestLine("POST /api/rest/entity/interface/{elid}/VirtualNasServers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<InterfaceVirtualNasServersResponseData> interfaceVirtualNasServersWithHttpInfo(@Param("elid") String elid, InterfaceVirtualNasServersRequestData body, @QueryMap(encoded=true) InterfaceVirtualNasServersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>interfaceVirtualNasServers</code> method in a fluent style.
   */
  public static class InterfaceVirtualNasServersQueryParams extends HashMap<String, Object> {
    public InterfaceVirtualNasServersQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Virtual server entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return InterfaceVirtualServersResponseData
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/VirtualServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  InterfaceVirtualServersResponseData interfaceVirtualServers(@Param("sessionId") String sessionId, @Param("elid") String elid, InterfaceVirtualServersRequestData body);

  /**
   * Get relations to Virtual server entities
   * Similar to <code>interfaceVirtualServers</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/VirtualServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<InterfaceVirtualServersResponseData> interfaceVirtualServersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, InterfaceVirtualServersRequestData body);


  /**
   * Get relations to Virtual server entities
   * 
   * Note, this is equivalent to the other <code>interfaceVirtualServers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link InterfaceVirtualServersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return InterfaceVirtualServersResponseData
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/VirtualServers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  InterfaceVirtualServersResponseData interfaceVirtualServers(@Param("elid") String elid, InterfaceVirtualServersRequestData body, @QueryMap(encoded=true) InterfaceVirtualServersQueryParams queryParams);

  /**
  * Get relations to Virtual server entities
  * 
  * Note, this is equivalent to the other <code>interfaceVirtualServers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return InterfaceVirtualServersResponseData
      */
      @RequestLine("POST /api/rest/entity/interface/{elid}/VirtualServers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<InterfaceVirtualServersResponseData> interfaceVirtualServersWithHttpInfo(@Param("elid") String elid, InterfaceVirtualServersRequestData body, @QueryMap(encoded=true) InterfaceVirtualServersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>interfaceVirtualServers</code> method in a fluent style.
   */
  public static class InterfaceVirtualServersQueryParams extends HashMap<String, Object> {
    public InterfaceVirtualServersQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Virtual switch entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return InterfaceVirtualSwitchesResponseData
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  InterfaceVirtualSwitchesResponseData interfaceVirtualSwitches(@Param("sessionId") String sessionId, @Param("elid") String elid, InterfaceVirtualSwitchesRequestData body);

  /**
   * Get relations to Virtual switch entities
   * Similar to <code>interfaceVirtualSwitches</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<InterfaceVirtualSwitchesResponseData> interfaceVirtualSwitchesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, InterfaceVirtualSwitchesRequestData body);


  /**
   * Get relations to Virtual switch entities
   * 
   * Note, this is equivalent to the other <code>interfaceVirtualSwitches</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link InterfaceVirtualSwitchesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return InterfaceVirtualSwitchesResponseData
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  InterfaceVirtualSwitchesResponseData interfaceVirtualSwitches(@Param("elid") String elid, InterfaceVirtualSwitchesRequestData body, @QueryMap(encoded=true) InterfaceVirtualSwitchesQueryParams queryParams);

  /**
  * Get relations to Virtual switch entities
  * 
  * Note, this is equivalent to the other <code>interfaceVirtualSwitches</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return InterfaceVirtualSwitchesResponseData
      */
      @RequestLine("POST /api/rest/entity/interface/{elid}/VirtualSwitches?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<InterfaceVirtualSwitchesResponseData> interfaceVirtualSwitchesWithHttpInfo(@Param("elid") String elid, InterfaceVirtualSwitchesRequestData body, @QueryMap(encoded=true) InterfaceVirtualSwitchesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>interfaceVirtualSwitches</code> method in a fluent style.
   */
  public static class InterfaceVirtualSwitchesQueryParams extends HashMap<String, Object> {
    public InterfaceVirtualSwitchesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify interface
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateInterfaceResponse
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateInterfaceResponse updateInterface(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateInterfaceRequestData body);

  /**
   * Modify
   * Similar to <code>updateInterface</code> but it also returns the http response headers .
   * Modify interface
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateInterfaceResponse> updateInterfaceWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateInterfaceRequestData body);


  /**
   * Modify
   * Modify interface
   * Note, this is equivalent to the other <code>updateInterface</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateInterfaceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateInterfaceResponse
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateInterfaceResponse updateInterface(@Param("elid") String elid, UpdateInterfaceRequestData body, @QueryMap(encoded=true) UpdateInterfaceQueryParams queryParams);

  /**
  * Modify
  * Modify interface
  * Note, this is equivalent to the other <code>updateInterface</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateInterfaceResponse
      */
      @RequestLine("POST /api/rest/entity/interface/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateInterfaceResponse> updateInterfaceWithHttpInfo(@Param("elid") String elid, UpdateInterfaceRequestData body, @QueryMap(encoded=true) UpdateInterfaceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateInterface</code> method in a fluent style.
   */
  public static class UpdateInterfaceQueryParams extends HashMap<String, Object> {
    public UpdateInterfaceQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesInterfaceResponse
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesInterfaceResponse updateSystemAttributesInterface(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesInterfaceRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesInterface</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesInterfaceResponse> updateSystemAttributesInterfaceWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesInterfaceRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesInterface</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesInterfaceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesInterfaceResponse
   */
  @RequestLine("POST /api/rest/entity/interface/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesInterfaceResponse updateSystemAttributesInterface(@Param("elid") String elid, UpdateSystemAttributesInterfaceRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesInterfaceQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesInterface</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesInterfaceResponse
      */
      @RequestLine("POST /api/rest/entity/interface/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesInterfaceResponse> updateSystemAttributesInterfaceWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesInterfaceRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesInterfaceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesInterface</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesInterfaceQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesInterfaceQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
