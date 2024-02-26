package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CostcenterDevicesAllRequest;
import com.fntsoftware.businessgateway.entities.CostcenterDevicesAllResponse;
import com.fntsoftware.businessgateway.entities.CostcenterOrganizationsRequest;
import com.fntsoftware.businessgateway.entities.CostcenterOrganizationsResponse;
import com.fntsoftware.businessgateway.entities.CostcenterPersonsRequest;
import com.fntsoftware.businessgateway.entities.CostcenterPersonsResponse;
import com.fntsoftware.businessgateway.entities.CostcenterPhysicalPortsDataRequest;
import com.fntsoftware.businessgateway.entities.CostcenterPhysicalPortsDataResponse;
import com.fntsoftware.businessgateway.entities.CostcenterQueryRequest;
import com.fntsoftware.businessgateway.entities.CostcenterQueryResponse;
import com.fntsoftware.businessgateway.entities.CreateCostcenterRequestData;
import com.fntsoftware.businessgateway.entities.CreateCostcenterResponse;
import com.fntsoftware.businessgateway.entities.DeleteCostcenterRequestData;
import com.fntsoftware.businessgateway.entities.DeleteCostcenterResponse;
import com.fntsoftware.businessgateway.entities.UpdateCostcenterRequestData;
import com.fntsoftware.businessgateway.entities.UpdateCostcenterResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface CostcenterApi extends ApiClient.Api {


  /**
   * Query Device (all)
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CostcenterDevicesAllResponse
   */
  @RequestLine("POST /api/rest/entity/costcenter/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CostcenterDevicesAllResponse costcenterDevicesAll(@Param("sessionId") String sessionId, @Param("elid") String elid, CostcenterDevicesAllRequest body);

  /**
   * Query Device (all)
   * Similar to <code>costcenterDevicesAll</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/costcenter/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CostcenterDevicesAllResponse> costcenterDevicesAllWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CostcenterDevicesAllRequest body);


  /**
   * Query Device (all)
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>costcenterDevicesAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CostcenterDevicesAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CostcenterDevicesAllResponse
   */
  @RequestLine("POST /api/rest/entity/costcenter/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CostcenterDevicesAllResponse costcenterDevicesAll(@Param("elid") String elid, CostcenterDevicesAllRequest body, @QueryMap(encoded=true) CostcenterDevicesAllQueryParams queryParams);

  /**
  * Query Device (all)
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>costcenterDevicesAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CostcenterDevicesAllResponse
      */
      @RequestLine("POST /api/rest/entity/costcenter/{elid}/DevicesAll?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CostcenterDevicesAllResponse> costcenterDevicesAllWithHttpInfo(@Param("elid") String elid, CostcenterDevicesAllRequest body, @QueryMap(encoded=true) CostcenterDevicesAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>costcenterDevicesAll</code> method in a fluent style.
   */
  public static class CostcenterDevicesAllQueryParams extends HashMap<String, Object> {
    public CostcenterDevicesAllQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query Organization
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CostcenterOrganizationsResponse
   */
  @RequestLine("POST /api/rest/entity/costcenter/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CostcenterOrganizationsResponse costcenterOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, CostcenterOrganizationsRequest body);

  /**
   * Query Organization
   * Similar to <code>costcenterOrganizations</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/costcenter/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CostcenterOrganizationsResponse> costcenterOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CostcenterOrganizationsRequest body);


  /**
   * Query Organization
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>costcenterOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CostcenterOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CostcenterOrganizationsResponse
   */
  @RequestLine("POST /api/rest/entity/costcenter/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CostcenterOrganizationsResponse costcenterOrganizations(@Param("elid") String elid, CostcenterOrganizationsRequest body, @QueryMap(encoded=true) CostcenterOrganizationsQueryParams queryParams);

  /**
  * Query Organization
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>costcenterOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CostcenterOrganizationsResponse
      */
      @RequestLine("POST /api/rest/entity/costcenter/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CostcenterOrganizationsResponse> costcenterOrganizationsWithHttpInfo(@Param("elid") String elid, CostcenterOrganizationsRequest body, @QueryMap(encoded=true) CostcenterOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>costcenterOrganizations</code> method in a fluent style.
   */
  public static class CostcenterOrganizationsQueryParams extends HashMap<String, Object> {
    public CostcenterOrganizationsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query Person
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CostcenterPersonsResponse
   */
  @RequestLine("POST /api/rest/entity/costcenter/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CostcenterPersonsResponse costcenterPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, CostcenterPersonsRequest body);

  /**
   * Query Person
   * Similar to <code>costcenterPersons</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/costcenter/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CostcenterPersonsResponse> costcenterPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CostcenterPersonsRequest body);


  /**
   * Query Person
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>costcenterPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CostcenterPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CostcenterPersonsResponse
   */
  @RequestLine("POST /api/rest/entity/costcenter/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CostcenterPersonsResponse costcenterPersons(@Param("elid") String elid, CostcenterPersonsRequest body, @QueryMap(encoded=true) CostcenterPersonsQueryParams queryParams);

  /**
  * Query Person
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>costcenterPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CostcenterPersonsResponse
      */
      @RequestLine("POST /api/rest/entity/costcenter/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CostcenterPersonsResponse> costcenterPersonsWithHttpInfo(@Param("elid") String elid, CostcenterPersonsRequest body, @QueryMap(encoded=true) CostcenterPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>costcenterPersons</code> method in a fluent style.
   */
  public static class CostcenterPersonsQueryParams extends HashMap<String, Object> {
    public CostcenterPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query Physical port (data)
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CostcenterPhysicalPortsDataResponse
   */
  @RequestLine("POST /api/rest/entity/costcenter/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CostcenterPhysicalPortsDataResponse costcenterPhysicalPortsData(@Param("sessionId") String sessionId, @Param("elid") String elid, CostcenterPhysicalPortsDataRequest body);

  /**
   * Query Physical port (data)
   * Similar to <code>costcenterPhysicalPortsData</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/costcenter/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CostcenterPhysicalPortsDataResponse> costcenterPhysicalPortsDataWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CostcenterPhysicalPortsDataRequest body);


  /**
   * Query Physical port (data)
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>costcenterPhysicalPortsData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CostcenterPhysicalPortsDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CostcenterPhysicalPortsDataResponse
   */
  @RequestLine("POST /api/rest/entity/costcenter/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CostcenterPhysicalPortsDataResponse costcenterPhysicalPortsData(@Param("elid") String elid, CostcenterPhysicalPortsDataRequest body, @QueryMap(encoded=true) CostcenterPhysicalPortsDataQueryParams queryParams);

  /**
  * Query Physical port (data)
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>costcenterPhysicalPortsData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CostcenterPhysicalPortsDataResponse
      */
      @RequestLine("POST /api/rest/entity/costcenter/{elid}/PhysicalPortsData?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CostcenterPhysicalPortsDataResponse> costcenterPhysicalPortsDataWithHttpInfo(@Param("elid") String elid, CostcenterPhysicalPortsDataRequest body, @QueryMap(encoded=true) CostcenterPhysicalPortsDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>costcenterPhysicalPortsData</code> method in a fluent style.
   */
  public static class CostcenterPhysicalPortsDataQueryParams extends HashMap<String, Object> {
    public CostcenterPhysicalPortsDataQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CostcenterQueryResponse
   */
  @RequestLine("POST /api/rest/entity/costcenter/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CostcenterQueryResponse costcenterQuery(@Param("sessionId") String sessionId, CostcenterQueryRequest body);

  /**
   * Basic query
   * Similar to <code>costcenterQuery</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/costcenter/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CostcenterQueryResponse> costcenterQueryWithHttpInfo(@Param("sessionId") String sessionId, CostcenterQueryRequest body);


  /**
   * Basic query
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>costcenterQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CostcenterQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CostcenterQueryResponse
   */
  @RequestLine("POST /api/rest/entity/costcenter/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CostcenterQueryResponse costcenterQuery(CostcenterQueryRequest body, @QueryMap(encoded=true) CostcenterQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>costcenterQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CostcenterQueryResponse
      */
      @RequestLine("POST /api/rest/entity/costcenter/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CostcenterQueryResponse> costcenterQueryWithHttpInfo(CostcenterQueryRequest body, @QueryMap(encoded=true) CostcenterQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>costcenterQuery</code> method in a fluent style.
   */
  public static class CostcenterQueryQueryParams extends HashMap<String, Object> {
    public CostcenterQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create
   * Create Cost center
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateCostcenterResponse
   */
  @RequestLine("POST /api/rest/entity/costcenter/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateCostcenterResponse createCostcenter(@Param("sessionId") String sessionId, CreateCostcenterRequestData body);

  /**
   * Create
   * Similar to <code>createCostcenter</code> but it also returns the http response headers .
   * Create Cost center
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/costcenter/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateCostcenterResponse> createCostcenterWithHttpInfo(@Param("sessionId") String sessionId, CreateCostcenterRequestData body);


  /**
   * Create
   * Create Cost center
   * Note, this is equivalent to the other <code>createCostcenter</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateCostcenterQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateCostcenterResponse
   */
  @RequestLine("POST /api/rest/entity/costcenter/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateCostcenterResponse createCostcenter(CreateCostcenterRequestData body, @QueryMap(encoded=true) CreateCostcenterQueryParams queryParams);

  /**
  * Create
  * Create Cost center
  * Note, this is equivalent to the other <code>createCostcenter</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateCostcenterResponse
      */
      @RequestLine("POST /api/rest/entity/costcenter/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateCostcenterResponse> createCostcenterWithHttpInfo(CreateCostcenterRequestData body, @QueryMap(encoded=true) CreateCostcenterQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createCostcenter</code> method in a fluent style.
   */
  public static class CreateCostcenterQueryParams extends HashMap<String, Object> {
    public CreateCostcenterQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Cost center
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteCostcenterResponse
   */
  @RequestLine("POST /api/rest/entity/costcenter/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteCostcenterResponse deleteCostcenter(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCostcenterRequestData body);

  /**
   * Delete
   * Similar to <code>deleteCostcenter</code> but it also returns the http response headers .
   * Delete Cost center
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/costcenter/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteCostcenterResponse> deleteCostcenterWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCostcenterRequestData body);


  /**
   * Delete
   * Delete Cost center
   * Note, this is equivalent to the other <code>deleteCostcenter</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteCostcenterQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteCostcenterResponse
   */
  @RequestLine("POST /api/rest/entity/costcenter/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteCostcenterResponse deleteCostcenter(@Param("elid") String elid, DeleteCostcenterRequestData body, @QueryMap(encoded=true) DeleteCostcenterQueryParams queryParams);

  /**
  * Delete
  * Delete Cost center
  * Note, this is equivalent to the other <code>deleteCostcenter</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteCostcenterResponse
      */
      @RequestLine("POST /api/rest/entity/costcenter/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteCostcenterResponse> deleteCostcenterWithHttpInfo(@Param("elid") String elid, DeleteCostcenterRequestData body, @QueryMap(encoded=true) DeleteCostcenterQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteCostcenter</code> method in a fluent style.
   */
  public static class DeleteCostcenterQueryParams extends HashMap<String, Object> {
    public DeleteCostcenterQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Cost center
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateCostcenterResponse
   */
  @RequestLine("POST /api/rest/entity/costcenter/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateCostcenterResponse updateCostcenter(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCostcenterRequestData body);

  /**
   * Modify
   * Similar to <code>updateCostcenter</code> but it also returns the http response headers .
   * Modify Cost center
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/costcenter/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateCostcenterResponse> updateCostcenterWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCostcenterRequestData body);


  /**
   * Modify
   * Modify Cost center
   * Note, this is equivalent to the other <code>updateCostcenter</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateCostcenterQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateCostcenterResponse
   */
  @RequestLine("POST /api/rest/entity/costcenter/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateCostcenterResponse updateCostcenter(@Param("elid") String elid, UpdateCostcenterRequestData body, @QueryMap(encoded=true) UpdateCostcenterQueryParams queryParams);

  /**
  * Modify
  * Modify Cost center
  * Note, this is equivalent to the other <code>updateCostcenter</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateCostcenterResponse
      */
      @RequestLine("POST /api/rest/entity/costcenter/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateCostcenterResponse> updateCostcenterWithHttpInfo(@Param("elid") String elid, UpdateCostcenterRequestData body, @QueryMap(encoded=true) UpdateCostcenterQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateCostcenter</code> method in a fluent style.
   */
  public static class UpdateCostcenterQueryParams extends HashMap<String, Object> {
    public UpdateCostcenterQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
