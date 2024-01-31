package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateSiteSharingRequestData;
import com.fntsoftware.businessgateway.entities.CreateSiteSharingResponse;
import com.fntsoftware.businessgateway.entities.DeleteSiteSharingRequestData;
import com.fntsoftware.businessgateway.entities.DeleteSiteSharingResponse;
import com.fntsoftware.businessgateway.entities.SiteSharingContractsRequestData;
import com.fntsoftware.businessgateway.entities.SiteSharingContractsResponseData;
import com.fntsoftware.businessgateway.entities.SiteSharingFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.SiteSharingFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.SiteSharingOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.SiteSharingOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.SiteSharingPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.SiteSharingPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.SiteSharingPersonsRequestData;
import com.fntsoftware.businessgateway.entities.SiteSharingPersonsResponseData;
import com.fntsoftware.businessgateway.entities.SiteSharingQueryRequest;
import com.fntsoftware.businessgateway.entities.SiteSharingQueryResponse;
import com.fntsoftware.businessgateway.entities.SiteSharingSiteRequestData;
import com.fntsoftware.businessgateway.entities.SiteSharingSiteResponseData;
import com.fntsoftware.businessgateway.entities.SiteSharingSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.SiteSharingSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateSiteSharingRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSiteSharingResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSiteSharingRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSiteSharingResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface SiteSharingApi extends ApiClient.Api {


  /**
   * Create
   * Create Site sharing
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateSiteSharingResponse
   */
  @RequestLine("POST /api/rest/entity/siteSharing/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateSiteSharingResponse createSiteSharing(@Param("sessionId") String sessionId, CreateSiteSharingRequestData body);

  /**
   * Create
   * Similar to <code>createSiteSharing</code> but it also returns the http response headers .
   * Create Site sharing
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/siteSharing/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateSiteSharingResponse> createSiteSharingWithHttpInfo(@Param("sessionId") String sessionId, CreateSiteSharingRequestData body);


  /**
   * Create
   * Create Site sharing
   * Note, this is equivalent to the other <code>createSiteSharing</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateSiteSharingQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateSiteSharingResponse
   */
  @RequestLine("POST /api/rest/entity/siteSharing/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateSiteSharingResponse createSiteSharing(CreateSiteSharingRequestData body, @QueryMap(encoded=true) CreateSiteSharingQueryParams queryParams);

  /**
  * Create
  * Create Site sharing
  * Note, this is equivalent to the other <code>createSiteSharing</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateSiteSharingResponse
      */
      @RequestLine("POST /api/rest/entity/siteSharing/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateSiteSharingResponse> createSiteSharingWithHttpInfo(CreateSiteSharingRequestData body, @QueryMap(encoded=true) CreateSiteSharingQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createSiteSharing</code> method in a fluent style.
   */
  public static class CreateSiteSharingQueryParams extends HashMap<String, Object> {
    public CreateSiteSharingQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Site sharing
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteSiteSharingResponse
   */
  @RequestLine("POST /api/rest/entity/siteSharing/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteSiteSharingResponse deleteSiteSharing(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteSiteSharingRequestData body);

  /**
   * Delete
   * Similar to <code>deleteSiteSharing</code> but it also returns the http response headers .
   * Delete Site sharing
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/siteSharing/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteSiteSharingResponse> deleteSiteSharingWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteSiteSharingRequestData body);


  /**
   * Delete
   * Delete Site sharing
   * Note, this is equivalent to the other <code>deleteSiteSharing</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteSiteSharingQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteSiteSharingResponse
   */
  @RequestLine("POST /api/rest/entity/siteSharing/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteSiteSharingResponse deleteSiteSharing(@Param("elid") String elid, DeleteSiteSharingRequestData body, @QueryMap(encoded=true) DeleteSiteSharingQueryParams queryParams);

  /**
  * Delete
  * Delete Site sharing
  * Note, this is equivalent to the other <code>deleteSiteSharing</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteSiteSharingResponse
      */
      @RequestLine("POST /api/rest/entity/siteSharing/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteSiteSharingResponse> deleteSiteSharingWithHttpInfo(@Param("elid") String elid, DeleteSiteSharingRequestData body, @QueryMap(encoded=true) DeleteSiteSharingQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteSiteSharing</code> method in a fluent style.
   */
  public static class DeleteSiteSharingQueryParams extends HashMap<String, Object> {
    public DeleteSiteSharingQueryParams sessionId(final String value) {
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
   * @return SiteSharingContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/siteSharing/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SiteSharingContractsResponseData siteSharingContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, SiteSharingContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>siteSharingContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/siteSharing/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SiteSharingContractsResponseData> siteSharingContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SiteSharingContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>siteSharingContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SiteSharingContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SiteSharingContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/siteSharing/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SiteSharingContractsResponseData siteSharingContracts(@Param("elid") String elid, SiteSharingContractsRequestData body, @QueryMap(encoded=true) SiteSharingContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>siteSharingContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SiteSharingContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/siteSharing/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SiteSharingContractsResponseData> siteSharingContractsWithHttpInfo(@Param("elid") String elid, SiteSharingContractsRequestData body, @QueryMap(encoded=true) SiteSharingContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>siteSharingContracts</code> method in a fluent style.
   */
  public static class SiteSharingContractsQueryParams extends HashMap<String, Object> {
    public SiteSharingContractsQueryParams sessionId(final String value) {
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
   * @return SiteSharingFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/siteSharing/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SiteSharingFrameContractsResponseData siteSharingFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, SiteSharingFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>siteSharingFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/siteSharing/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SiteSharingFrameContractsResponseData> siteSharingFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SiteSharingFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>siteSharingFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SiteSharingFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SiteSharingFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/siteSharing/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SiteSharingFrameContractsResponseData siteSharingFrameContracts(@Param("elid") String elid, SiteSharingFrameContractsRequestData body, @QueryMap(encoded=true) SiteSharingFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>siteSharingFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SiteSharingFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/siteSharing/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SiteSharingFrameContractsResponseData> siteSharingFrameContractsWithHttpInfo(@Param("elid") String elid, SiteSharingFrameContractsRequestData body, @QueryMap(encoded=true) SiteSharingFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>siteSharingFrameContracts</code> method in a fluent style.
   */
  public static class SiteSharingFrameContractsQueryParams extends HashMap<String, Object> {
    public SiteSharingFrameContractsQueryParams sessionId(final String value) {
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
   * @return SiteSharingOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/siteSharing/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SiteSharingOrganizationsResponseData siteSharingOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, SiteSharingOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>siteSharingOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/siteSharing/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SiteSharingOrganizationsResponseData> siteSharingOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SiteSharingOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>siteSharingOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SiteSharingOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SiteSharingOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/siteSharing/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SiteSharingOrganizationsResponseData siteSharingOrganizations(@Param("elid") String elid, SiteSharingOrganizationsRequestData body, @QueryMap(encoded=true) SiteSharingOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>siteSharingOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SiteSharingOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/siteSharing/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SiteSharingOrganizationsResponseData> siteSharingOrganizationsWithHttpInfo(@Param("elid") String elid, SiteSharingOrganizationsRequestData body, @QueryMap(encoded=true) SiteSharingOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>siteSharingOrganizations</code> method in a fluent style.
   */
  public static class SiteSharingOrganizationsQueryParams extends HashMap<String, Object> {
    public SiteSharingOrganizationsQueryParams sessionId(final String value) {
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
   * @return SiteSharingPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/siteSharing/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SiteSharingPersonGroupsResponseData siteSharingPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, SiteSharingPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>siteSharingPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/siteSharing/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SiteSharingPersonGroupsResponseData> siteSharingPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SiteSharingPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>siteSharingPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SiteSharingPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SiteSharingPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/siteSharing/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SiteSharingPersonGroupsResponseData siteSharingPersonGroups(@Param("elid") String elid, SiteSharingPersonGroupsRequestData body, @QueryMap(encoded=true) SiteSharingPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>siteSharingPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SiteSharingPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/siteSharing/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SiteSharingPersonGroupsResponseData> siteSharingPersonGroupsWithHttpInfo(@Param("elid") String elid, SiteSharingPersonGroupsRequestData body, @QueryMap(encoded=true) SiteSharingPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>siteSharingPersonGroups</code> method in a fluent style.
   */
  public static class SiteSharingPersonGroupsQueryParams extends HashMap<String, Object> {
    public SiteSharingPersonGroupsQueryParams sessionId(final String value) {
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
   * @return SiteSharingPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/siteSharing/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SiteSharingPersonsResponseData siteSharingPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, SiteSharingPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>siteSharingPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/siteSharing/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SiteSharingPersonsResponseData> siteSharingPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SiteSharingPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>siteSharingPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SiteSharingPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SiteSharingPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/siteSharing/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SiteSharingPersonsResponseData siteSharingPersons(@Param("elid") String elid, SiteSharingPersonsRequestData body, @QueryMap(encoded=true) SiteSharingPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>siteSharingPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SiteSharingPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/siteSharing/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SiteSharingPersonsResponseData> siteSharingPersonsWithHttpInfo(@Param("elid") String elid, SiteSharingPersonsRequestData body, @QueryMap(encoded=true) SiteSharingPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>siteSharingPersons</code> method in a fluent style.
   */
  public static class SiteSharingPersonsQueryParams extends HashMap<String, Object> {
    public SiteSharingPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return SiteSharingQueryResponse
   */
  @RequestLine("POST /api/rest/entity/siteSharing/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SiteSharingQueryResponse siteSharingQuery(@Param("sessionId") String sessionId, SiteSharingQueryRequest body);

  /**
   * Basic query
   * Similar to <code>siteSharingQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/siteSharing/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SiteSharingQueryResponse> siteSharingQueryWithHttpInfo(@Param("sessionId") String sessionId, SiteSharingQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>siteSharingQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SiteSharingQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SiteSharingQueryResponse
   */
  @RequestLine("POST /api/rest/entity/siteSharing/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SiteSharingQueryResponse siteSharingQuery(SiteSharingQueryRequest body, @QueryMap(encoded=true) SiteSharingQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>siteSharingQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SiteSharingQueryResponse
      */
      @RequestLine("POST /api/rest/entity/siteSharing/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SiteSharingQueryResponse> siteSharingQueryWithHttpInfo(SiteSharingQueryRequest body, @QueryMap(encoded=true) SiteSharingQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>siteSharingQuery</code> method in a fluent style.
   */
  public static class SiteSharingQueryQueryParams extends HashMap<String, Object> {
    public SiteSharingQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Site entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return SiteSharingSiteResponseData
   */
  @RequestLine("POST /api/rest/entity/siteSharing/{elid}/Site?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SiteSharingSiteResponseData siteSharingSite(@Param("sessionId") String sessionId, @Param("elid") String elid, SiteSharingSiteRequestData body);

  /**
   * Get relations to Site entities
   * Similar to <code>siteSharingSite</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/siteSharing/{elid}/Site?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SiteSharingSiteResponseData> siteSharingSiteWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SiteSharingSiteRequestData body);


  /**
   * Get relations to Site entities
   * 
   * Note, this is equivalent to the other <code>siteSharingSite</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SiteSharingSiteQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SiteSharingSiteResponseData
   */
  @RequestLine("POST /api/rest/entity/siteSharing/{elid}/Site?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SiteSharingSiteResponseData siteSharingSite(@Param("elid") String elid, SiteSharingSiteRequestData body, @QueryMap(encoded=true) SiteSharingSiteQueryParams queryParams);

  /**
  * Get relations to Site entities
  * 
  * Note, this is equivalent to the other <code>siteSharingSite</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SiteSharingSiteResponseData
      */
      @RequestLine("POST /api/rest/entity/siteSharing/{elid}/Site?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SiteSharingSiteResponseData> siteSharingSiteWithHttpInfo(@Param("elid") String elid, SiteSharingSiteRequestData body, @QueryMap(encoded=true) SiteSharingSiteQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>siteSharingSite</code> method in a fluent style.
   */
  public static class SiteSharingSiteQueryParams extends HashMap<String, Object> {
    public SiteSharingSiteQueryParams sessionId(final String value) {
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
   * @return SiteSharingSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/siteSharing/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SiteSharingSystemAttributesResponse siteSharingSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, SiteSharingSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>siteSharingSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/siteSharing/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SiteSharingSystemAttributesResponse> siteSharingSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SiteSharingSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>siteSharingSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SiteSharingSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SiteSharingSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/siteSharing/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SiteSharingSystemAttributesResponse siteSharingSystemAttributes(@Param("elid") String elid, SiteSharingSystemAttributesRequest body, @QueryMap(encoded=true) SiteSharingSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>siteSharingSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SiteSharingSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/siteSharing/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SiteSharingSystemAttributesResponse> siteSharingSystemAttributesWithHttpInfo(@Param("elid") String elid, SiteSharingSystemAttributesRequest body, @QueryMap(encoded=true) SiteSharingSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>siteSharingSystemAttributes</code> method in a fluent style.
   */
  public static class SiteSharingSystemAttributesQueryParams extends HashMap<String, Object> {
    public SiteSharingSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Site sharing
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateSiteSharingResponse
   */
  @RequestLine("POST /api/rest/entity/siteSharing/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSiteSharingResponse updateSiteSharing(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSiteSharingRequestData body);

  /**
   * Modify
   * Similar to <code>updateSiteSharing</code> but it also returns the http response headers .
   * Modify Site sharing
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/siteSharing/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSiteSharingResponse> updateSiteSharingWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSiteSharingRequestData body);


  /**
   * Modify
   * Modify Site sharing
   * Note, this is equivalent to the other <code>updateSiteSharing</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSiteSharingQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSiteSharingResponse
   */
  @RequestLine("POST /api/rest/entity/siteSharing/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSiteSharingResponse updateSiteSharing(@Param("elid") String elid, UpdateSiteSharingRequestData body, @QueryMap(encoded=true) UpdateSiteSharingQueryParams queryParams);

  /**
  * Modify
  * Modify Site sharing
  * Note, this is equivalent to the other <code>updateSiteSharing</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSiteSharingResponse
      */
      @RequestLine("POST /api/rest/entity/siteSharing/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSiteSharingResponse> updateSiteSharingWithHttpInfo(@Param("elid") String elid, UpdateSiteSharingRequestData body, @QueryMap(encoded=true) UpdateSiteSharingQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSiteSharing</code> method in a fluent style.
   */
  public static class UpdateSiteSharingQueryParams extends HashMap<String, Object> {
    public UpdateSiteSharingQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesSiteSharingResponse
   */
  @RequestLine("POST /api/rest/entity/siteSharing/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesSiteSharingResponse updateSystemAttributesSiteSharing(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesSiteSharingRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesSiteSharing</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/siteSharing/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesSiteSharingResponse> updateSystemAttributesSiteSharingWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesSiteSharingRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesSiteSharing</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesSiteSharingQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesSiteSharingResponse
   */
  @RequestLine("POST /api/rest/entity/siteSharing/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesSiteSharingResponse updateSystemAttributesSiteSharing(@Param("elid") String elid, UpdateSystemAttributesSiteSharingRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesSiteSharingQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesSiteSharing</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesSiteSharingResponse
      */
      @RequestLine("POST /api/rest/entity/siteSharing/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesSiteSharingResponse> updateSystemAttributesSiteSharingWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesSiteSharingRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesSiteSharingQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesSiteSharing</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesSiteSharingQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesSiteSharingQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
