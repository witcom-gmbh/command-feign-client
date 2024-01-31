package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateSiteRequestData;
import com.fntsoftware.businessgateway.entities.CreateSiteResponse;
import com.fntsoftware.businessgateway.entities.DeleteSiteRequestData;
import com.fntsoftware.businessgateway.entities.DeleteSiteResponse;
import com.fntsoftware.businessgateway.entities.SiteContractsRequestData;
import com.fntsoftware.businessgateway.entities.SiteContractsResponseData;
import com.fntsoftware.businessgateway.entities.SiteDevicesAllRequestData;
import com.fntsoftware.businessgateway.entities.SiteDevicesAllResponseData;
import com.fntsoftware.businessgateway.entities.SiteFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.SiteFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.SiteNominalRequestData;
import com.fntsoftware.businessgateway.entities.SiteNominalResponseData;
import com.fntsoftware.businessgateway.entities.SiteOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.SiteOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.SitePersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.SitePersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.SitePersonsRequestData;
import com.fntsoftware.businessgateway.entities.SitePersonsResponseData;
import com.fntsoftware.businessgateway.entities.SitePostalAddressesRequestData;
import com.fntsoftware.businessgateway.entities.SitePostalAddressesResponseData;
import com.fntsoftware.businessgateway.entities.SiteQueryGeolocationRequest;
import com.fntsoftware.businessgateway.entities.SiteQueryGeolocationResponse;
import com.fntsoftware.businessgateway.entities.SiteQueryRequest;
import com.fntsoftware.businessgateway.entities.SiteQueryResponse;
import com.fntsoftware.businessgateway.entities.SiteSiteSharingsRequestData;
import com.fntsoftware.businessgateway.entities.SiteSiteSharingsResponseData;
import com.fntsoftware.businessgateway.entities.SiteSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.SiteSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.SiteZoneRequestData;
import com.fntsoftware.businessgateway.entities.SiteZoneResponseData;
import com.fntsoftware.businessgateway.entities.UpdateSiteRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSiteResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSiteRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSiteResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface SiteApi extends ApiClient.Api {


  /**
   * Create
   * Create Site
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateSiteResponse
   */
  @RequestLine("POST /api/rest/entity/site/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateSiteResponse createSite(@Param("sessionId") String sessionId, CreateSiteRequestData body);

  /**
   * Create
   * Similar to <code>createSite</code> but it also returns the http response headers .
   * Create Site
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/site/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateSiteResponse> createSiteWithHttpInfo(@Param("sessionId") String sessionId, CreateSiteRequestData body);


  /**
   * Create
   * Create Site
   * Note, this is equivalent to the other <code>createSite</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateSiteQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateSiteResponse
   */
  @RequestLine("POST /api/rest/entity/site/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateSiteResponse createSite(CreateSiteRequestData body, @QueryMap(encoded=true) CreateSiteQueryParams queryParams);

  /**
  * Create
  * Create Site
  * Note, this is equivalent to the other <code>createSite</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateSiteResponse
      */
      @RequestLine("POST /api/rest/entity/site/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateSiteResponse> createSiteWithHttpInfo(CreateSiteRequestData body, @QueryMap(encoded=true) CreateSiteQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createSite</code> method in a fluent style.
   */
  public static class CreateSiteQueryParams extends HashMap<String, Object> {
    public CreateSiteQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Site
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteSiteResponse
   */
  @RequestLine("POST /api/rest/entity/site/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteSiteResponse deleteSite(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteSiteRequestData body);

  /**
   * Delete
   * Similar to <code>deleteSite</code> but it also returns the http response headers .
   * Delete Site
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/site/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteSiteResponse> deleteSiteWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteSiteRequestData body);


  /**
   * Delete
   * Delete Site
   * Note, this is equivalent to the other <code>deleteSite</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteSiteQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteSiteResponse
   */
  @RequestLine("POST /api/rest/entity/site/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteSiteResponse deleteSite(@Param("elid") String elid, DeleteSiteRequestData body, @QueryMap(encoded=true) DeleteSiteQueryParams queryParams);

  /**
  * Delete
  * Delete Site
  * Note, this is equivalent to the other <code>deleteSite</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteSiteResponse
      */
      @RequestLine("POST /api/rest/entity/site/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteSiteResponse> deleteSiteWithHttpInfo(@Param("elid") String elid, DeleteSiteRequestData body, @QueryMap(encoded=true) DeleteSiteQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteSite</code> method in a fluent style.
   */
  public static class DeleteSiteQueryParams extends HashMap<String, Object> {
    public DeleteSiteQueryParams sessionId(final String value) {
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
   * @return SiteContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/site/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SiteContractsResponseData siteContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, SiteContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>siteContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/site/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SiteContractsResponseData> siteContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SiteContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>siteContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SiteContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SiteContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/site/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SiteContractsResponseData siteContracts(@Param("elid") String elid, SiteContractsRequestData body, @QueryMap(encoded=true) SiteContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>siteContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SiteContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/site/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SiteContractsResponseData> siteContractsWithHttpInfo(@Param("elid") String elid, SiteContractsRequestData body, @QueryMap(encoded=true) SiteContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>siteContracts</code> method in a fluent style.
   */
  public static class SiteContractsQueryParams extends HashMap<String, Object> {
    public SiteContractsQueryParams sessionId(final String value) {
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
   * @return SiteDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/site/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SiteDevicesAllResponseData siteDevicesAll(@Param("sessionId") String sessionId, @Param("elid") String elid, SiteDevicesAllRequestData body);

  /**
   * Get relations to Device (all) entities
   * Similar to <code>siteDevicesAll</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/site/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SiteDevicesAllResponseData> siteDevicesAllWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SiteDevicesAllRequestData body);


  /**
   * Get relations to Device (all) entities
   * 
   * Note, this is equivalent to the other <code>siteDevicesAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SiteDevicesAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SiteDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/site/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SiteDevicesAllResponseData siteDevicesAll(@Param("elid") String elid, SiteDevicesAllRequestData body, @QueryMap(encoded=true) SiteDevicesAllQueryParams queryParams);

  /**
  * Get relations to Device (all) entities
  * 
  * Note, this is equivalent to the other <code>siteDevicesAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SiteDevicesAllResponseData
      */
      @RequestLine("POST /api/rest/entity/site/{elid}/DevicesAll?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SiteDevicesAllResponseData> siteDevicesAllWithHttpInfo(@Param("elid") String elid, SiteDevicesAllRequestData body, @QueryMap(encoded=true) SiteDevicesAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>siteDevicesAll</code> method in a fluent style.
   */
  public static class SiteDevicesAllQueryParams extends HashMap<String, Object> {
    public SiteDevicesAllQueryParams sessionId(final String value) {
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
   * @return SiteFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/site/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SiteFrameContractsResponseData siteFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, SiteFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>siteFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/site/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SiteFrameContractsResponseData> siteFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SiteFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>siteFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SiteFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SiteFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/site/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SiteFrameContractsResponseData siteFrameContracts(@Param("elid") String elid, SiteFrameContractsRequestData body, @QueryMap(encoded=true) SiteFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>siteFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SiteFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/site/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SiteFrameContractsResponseData> siteFrameContractsWithHttpInfo(@Param("elid") String elid, SiteFrameContractsRequestData body, @QueryMap(encoded=true) SiteFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>siteFrameContracts</code> method in a fluent style.
   */
  public static class SiteFrameContractsQueryParams extends HashMap<String, Object> {
    public SiteFrameContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Site (nominal) entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return SiteNominalResponseData
   */
  @RequestLine("POST /api/rest/entity/site/{elid}/Nominal?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SiteNominalResponseData siteNominal(@Param("sessionId") String sessionId, @Param("elid") String elid, SiteNominalRequestData body);

  /**
   * Get relations to Site (nominal) entities
   * Similar to <code>siteNominal</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/site/{elid}/Nominal?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SiteNominalResponseData> siteNominalWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SiteNominalRequestData body);


  /**
   * Get relations to Site (nominal) entities
   * 
   * Note, this is equivalent to the other <code>siteNominal</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SiteNominalQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SiteNominalResponseData
   */
  @RequestLine("POST /api/rest/entity/site/{elid}/Nominal?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SiteNominalResponseData siteNominal(@Param("elid") String elid, SiteNominalRequestData body, @QueryMap(encoded=true) SiteNominalQueryParams queryParams);

  /**
  * Get relations to Site (nominal) entities
  * 
  * Note, this is equivalent to the other <code>siteNominal</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SiteNominalResponseData
      */
      @RequestLine("POST /api/rest/entity/site/{elid}/Nominal?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SiteNominalResponseData> siteNominalWithHttpInfo(@Param("elid") String elid, SiteNominalRequestData body, @QueryMap(encoded=true) SiteNominalQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>siteNominal</code> method in a fluent style.
   */
  public static class SiteNominalQueryParams extends HashMap<String, Object> {
    public SiteNominalQueryParams sessionId(final String value) {
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
   * @return SiteOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/site/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SiteOrganizationsResponseData siteOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, SiteOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>siteOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/site/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SiteOrganizationsResponseData> siteOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SiteOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>siteOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SiteOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SiteOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/site/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SiteOrganizationsResponseData siteOrganizations(@Param("elid") String elid, SiteOrganizationsRequestData body, @QueryMap(encoded=true) SiteOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>siteOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SiteOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/site/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SiteOrganizationsResponseData> siteOrganizationsWithHttpInfo(@Param("elid") String elid, SiteOrganizationsRequestData body, @QueryMap(encoded=true) SiteOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>siteOrganizations</code> method in a fluent style.
   */
  public static class SiteOrganizationsQueryParams extends HashMap<String, Object> {
    public SiteOrganizationsQueryParams sessionId(final String value) {
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
   * @return SitePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/site/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SitePersonGroupsResponseData sitePersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, SitePersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>sitePersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/site/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SitePersonGroupsResponseData> sitePersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SitePersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>sitePersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SitePersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SitePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/site/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SitePersonGroupsResponseData sitePersonGroups(@Param("elid") String elid, SitePersonGroupsRequestData body, @QueryMap(encoded=true) SitePersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>sitePersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SitePersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/site/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SitePersonGroupsResponseData> sitePersonGroupsWithHttpInfo(@Param("elid") String elid, SitePersonGroupsRequestData body, @QueryMap(encoded=true) SitePersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>sitePersonGroups</code> method in a fluent style.
   */
  public static class SitePersonGroupsQueryParams extends HashMap<String, Object> {
    public SitePersonGroupsQueryParams sessionId(final String value) {
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
   * @return SitePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/site/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SitePersonsResponseData sitePersons(@Param("sessionId") String sessionId, @Param("elid") String elid, SitePersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>sitePersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/site/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SitePersonsResponseData> sitePersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SitePersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>sitePersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SitePersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SitePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/site/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SitePersonsResponseData sitePersons(@Param("elid") String elid, SitePersonsRequestData body, @QueryMap(encoded=true) SitePersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>sitePersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SitePersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/site/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SitePersonsResponseData> sitePersonsWithHttpInfo(@Param("elid") String elid, SitePersonsRequestData body, @QueryMap(encoded=true) SitePersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>sitePersons</code> method in a fluent style.
   */
  public static class SitePersonsQueryParams extends HashMap<String, Object> {
    public SitePersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Postal address entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return SitePostalAddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/site/{elid}/PostalAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SitePostalAddressesResponseData sitePostalAddresses(@Param("sessionId") String sessionId, @Param("elid") String elid, SitePostalAddressesRequestData body);

  /**
   * Get relations to Postal address entities
   * Similar to <code>sitePostalAddresses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/site/{elid}/PostalAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SitePostalAddressesResponseData> sitePostalAddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SitePostalAddressesRequestData body);


  /**
   * Get relations to Postal address entities
   * 
   * Note, this is equivalent to the other <code>sitePostalAddresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SitePostalAddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SitePostalAddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/site/{elid}/PostalAddresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SitePostalAddressesResponseData sitePostalAddresses(@Param("elid") String elid, SitePostalAddressesRequestData body, @QueryMap(encoded=true) SitePostalAddressesQueryParams queryParams);

  /**
  * Get relations to Postal address entities
  * 
  * Note, this is equivalent to the other <code>sitePostalAddresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SitePostalAddressesResponseData
      */
      @RequestLine("POST /api/rest/entity/site/{elid}/PostalAddresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SitePostalAddressesResponseData> sitePostalAddressesWithHttpInfo(@Param("elid") String elid, SitePostalAddressesRequestData body, @QueryMap(encoded=true) SitePostalAddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>sitePostalAddresses</code> method in a fluent style.
   */
  public static class SitePostalAddressesQueryParams extends HashMap<String, Object> {
    public SitePostalAddressesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return SiteQueryResponse
   */
  @RequestLine("POST /api/rest/entity/site/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SiteQueryResponse siteQuery(@Param("sessionId") String sessionId, SiteQueryRequest body);

  /**
   * Basic query
   * Similar to <code>siteQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/site/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SiteQueryResponse> siteQueryWithHttpInfo(@Param("sessionId") String sessionId, SiteQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>siteQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SiteQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SiteQueryResponse
   */
  @RequestLine("POST /api/rest/entity/site/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SiteQueryResponse siteQuery(SiteQueryRequest body, @QueryMap(encoded=true) SiteQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>siteQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SiteQueryResponse
      */
      @RequestLine("POST /api/rest/entity/site/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SiteQueryResponse> siteQueryWithHttpInfo(SiteQueryRequest body, @QueryMap(encoded=true) SiteQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>siteQuery</code> method in a fluent style.
   */
  public static class SiteQueryQueryParams extends HashMap<String, Object> {
    public SiteQueryQueryParams sessionId(final String value) {
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
   * @return SiteQueryGeolocationResponse
   */
  @RequestLine("POST /api/rest/entity/site/{elid}/QueryGeolocation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SiteQueryGeolocationResponse siteQueryGeolocation(@Param("sessionId") String sessionId, @Param("elid") String elid, SiteQueryGeolocationRequest body);

  /**
   * Query geolocation
   * Similar to <code>siteQueryGeolocation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/site/{elid}/QueryGeolocation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SiteQueryGeolocationResponse> siteQueryGeolocationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SiteQueryGeolocationRequest body);


  /**
   * Query geolocation
   * 
   * Note, this is equivalent to the other <code>siteQueryGeolocation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SiteQueryGeolocationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SiteQueryGeolocationResponse
   */
  @RequestLine("POST /api/rest/entity/site/{elid}/QueryGeolocation?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SiteQueryGeolocationResponse siteQueryGeolocation(@Param("elid") String elid, SiteQueryGeolocationRequest body, @QueryMap(encoded=true) SiteQueryGeolocationQueryParams queryParams);

  /**
  * Query geolocation
  * 
  * Note, this is equivalent to the other <code>siteQueryGeolocation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SiteQueryGeolocationResponse
      */
      @RequestLine("POST /api/rest/entity/site/{elid}/QueryGeolocation?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SiteQueryGeolocationResponse> siteQueryGeolocationWithHttpInfo(@Param("elid") String elid, SiteQueryGeolocationRequest body, @QueryMap(encoded=true) SiteQueryGeolocationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>siteQueryGeolocation</code> method in a fluent style.
   */
  public static class SiteQueryGeolocationQueryParams extends HashMap<String, Object> {
    public SiteQueryGeolocationQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Site sharing entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return SiteSiteSharingsResponseData
   */
  @RequestLine("POST /api/rest/entity/site/{elid}/SiteSharings?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SiteSiteSharingsResponseData siteSiteSharings(@Param("sessionId") String sessionId, @Param("elid") String elid, SiteSiteSharingsRequestData body);

  /**
   * Get relations to Site sharing entities
   * Similar to <code>siteSiteSharings</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/site/{elid}/SiteSharings?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SiteSiteSharingsResponseData> siteSiteSharingsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SiteSiteSharingsRequestData body);


  /**
   * Get relations to Site sharing entities
   * 
   * Note, this is equivalent to the other <code>siteSiteSharings</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SiteSiteSharingsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SiteSiteSharingsResponseData
   */
  @RequestLine("POST /api/rest/entity/site/{elid}/SiteSharings?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SiteSiteSharingsResponseData siteSiteSharings(@Param("elid") String elid, SiteSiteSharingsRequestData body, @QueryMap(encoded=true) SiteSiteSharingsQueryParams queryParams);

  /**
  * Get relations to Site sharing entities
  * 
  * Note, this is equivalent to the other <code>siteSiteSharings</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SiteSiteSharingsResponseData
      */
      @RequestLine("POST /api/rest/entity/site/{elid}/SiteSharings?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SiteSiteSharingsResponseData> siteSiteSharingsWithHttpInfo(@Param("elid") String elid, SiteSiteSharingsRequestData body, @QueryMap(encoded=true) SiteSiteSharingsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>siteSiteSharings</code> method in a fluent style.
   */
  public static class SiteSiteSharingsQueryParams extends HashMap<String, Object> {
    public SiteSiteSharingsQueryParams sessionId(final String value) {
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
   * @return SiteSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/site/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SiteSystemAttributesResponse siteSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, SiteSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>siteSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/site/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SiteSystemAttributesResponse> siteSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SiteSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>siteSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SiteSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SiteSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/site/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SiteSystemAttributesResponse siteSystemAttributes(@Param("elid") String elid, SiteSystemAttributesRequest body, @QueryMap(encoded=true) SiteSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>siteSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SiteSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/site/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SiteSystemAttributesResponse> siteSystemAttributesWithHttpInfo(@Param("elid") String elid, SiteSystemAttributesRequest body, @QueryMap(encoded=true) SiteSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>siteSystemAttributes</code> method in a fluent style.
   */
  public static class SiteSystemAttributesQueryParams extends HashMap<String, Object> {
    public SiteSystemAttributesQueryParams sessionId(final String value) {
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
   * @return SiteZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/site/{elid}/Zone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SiteZoneResponseData siteZone(@Param("sessionId") String sessionId, @Param("elid") String elid, SiteZoneRequestData body);

  /**
   * Get relations to Zone entities
   * Similar to <code>siteZone</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/site/{elid}/Zone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SiteZoneResponseData> siteZoneWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SiteZoneRequestData body);


  /**
   * Get relations to Zone entities
   * 
   * Note, this is equivalent to the other <code>siteZone</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SiteZoneQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SiteZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/site/{elid}/Zone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SiteZoneResponseData siteZone(@Param("elid") String elid, SiteZoneRequestData body, @QueryMap(encoded=true) SiteZoneQueryParams queryParams);

  /**
  * Get relations to Zone entities
  * 
  * Note, this is equivalent to the other <code>siteZone</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SiteZoneResponseData
      */
      @RequestLine("POST /api/rest/entity/site/{elid}/Zone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SiteZoneResponseData> siteZoneWithHttpInfo(@Param("elid") String elid, SiteZoneRequestData body, @QueryMap(encoded=true) SiteZoneQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>siteZone</code> method in a fluent style.
   */
  public static class SiteZoneQueryParams extends HashMap<String, Object> {
    public SiteZoneQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Site
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateSiteResponse
   */
  @RequestLine("POST /api/rest/entity/site/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSiteResponse updateSite(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSiteRequestData body);

  /**
   * Modify
   * Similar to <code>updateSite</code> but it also returns the http response headers .
   * Modify Site
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/site/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSiteResponse> updateSiteWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSiteRequestData body);


  /**
   * Modify
   * Modify Site
   * Note, this is equivalent to the other <code>updateSite</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSiteQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSiteResponse
   */
  @RequestLine("POST /api/rest/entity/site/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSiteResponse updateSite(@Param("elid") String elid, UpdateSiteRequestData body, @QueryMap(encoded=true) UpdateSiteQueryParams queryParams);

  /**
  * Modify
  * Modify Site
  * Note, this is equivalent to the other <code>updateSite</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSiteResponse
      */
      @RequestLine("POST /api/rest/entity/site/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSiteResponse> updateSiteWithHttpInfo(@Param("elid") String elid, UpdateSiteRequestData body, @QueryMap(encoded=true) UpdateSiteQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSite</code> method in a fluent style.
   */
  public static class UpdateSiteQueryParams extends HashMap<String, Object> {
    public UpdateSiteQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesSiteResponse
   */
  @RequestLine("POST /api/rest/entity/site/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesSiteResponse updateSystemAttributesSite(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesSiteRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesSite</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/site/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesSiteResponse> updateSystemAttributesSiteWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesSiteRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesSite</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesSiteQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesSiteResponse
   */
  @RequestLine("POST /api/rest/entity/site/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesSiteResponse updateSystemAttributesSite(@Param("elid") String elid, UpdateSystemAttributesSiteRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesSiteQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesSite</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesSiteResponse
      */
      @RequestLine("POST /api/rest/entity/site/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesSiteResponse> updateSystemAttributesSiteWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesSiteRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesSiteQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesSite</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesSiteQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesSiteQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
