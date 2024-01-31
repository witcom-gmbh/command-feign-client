package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateCustomTcoInterconnectRequestData;
import com.fntsoftware.businessgateway.entities.CreateCustomTcoInterconnectResponse;
import com.fntsoftware.businessgateway.entities.CustomTcoInterconnectCablesRequestData;
import com.fntsoftware.businessgateway.entities.CustomTcoInterconnectCablesResponseData;
import com.fntsoftware.businessgateway.entities.CustomTcoInterconnectDataCablesRequestData;
import com.fntsoftware.businessgateway.entities.CustomTcoInterconnectDataCablesResponseData;
import com.fntsoftware.businessgateway.entities.CustomTcoInterconnectLogicalPortsRequestData;
import com.fntsoftware.businessgateway.entities.CustomTcoInterconnectLogicalPortsResponseData;
import com.fntsoftware.businessgateway.entities.CustomTcoInterconnectOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.CustomTcoInterconnectOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.CustomTcoInterconnectPowerCablesRequestData;
import com.fntsoftware.businessgateway.entities.CustomTcoInterconnectPowerCablesResponseData;
import com.fntsoftware.businessgateway.entities.CustomTcoInterconnectQueryRequest;
import com.fntsoftware.businessgateway.entities.CustomTcoInterconnectQueryResponse;
import com.fntsoftware.businessgateway.entities.CustomTcoInterconnectSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.CustomTcoInterconnectSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.CustomTcoInterconnectVlanPoolRequestData;
import com.fntsoftware.businessgateway.entities.CustomTcoInterconnectVlanPoolResponseData;
import com.fntsoftware.businessgateway.entities.DeleteCustomTcoInterconnectRequestData;
import com.fntsoftware.businessgateway.entities.DeleteCustomTcoInterconnectResponse;
import com.fntsoftware.businessgateway.entities.UpdateCustomTcoInterconnectRequestData;
import com.fntsoftware.businessgateway.entities.UpdateCustomTcoInterconnectResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomTcoInterconnectRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomTcoInterconnectResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface CustomTcoInterconnectApi extends ApiClient.Api {


  /**
   * Create
   * Create Telco-Interconnect
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateCustomTcoInterconnectResponse
   */
  @RequestLine("POST /api/rest/entity/custom/tcoInterconnect/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateCustomTcoInterconnectResponse createCustomTcoInterconnect(@Param("sessionId") String sessionId, CreateCustomTcoInterconnectRequestData body);

  /**
   * Create
   * Similar to <code>createCustomTcoInterconnect</code> but it also returns the http response headers .
   * Create Telco-Interconnect
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/tcoInterconnect/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateCustomTcoInterconnectResponse> createCustomTcoInterconnectWithHttpInfo(@Param("sessionId") String sessionId, CreateCustomTcoInterconnectRequestData body);


  /**
   * Create
   * Create Telco-Interconnect
   * Note, this is equivalent to the other <code>createCustomTcoInterconnect</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateCustomTcoInterconnectQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateCustomTcoInterconnectResponse
   */
  @RequestLine("POST /api/rest/entity/custom/tcoInterconnect/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateCustomTcoInterconnectResponse createCustomTcoInterconnect(CreateCustomTcoInterconnectRequestData body, @QueryMap(encoded=true) CreateCustomTcoInterconnectQueryParams queryParams);

  /**
  * Create
  * Create Telco-Interconnect
  * Note, this is equivalent to the other <code>createCustomTcoInterconnect</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateCustomTcoInterconnectResponse
      */
      @RequestLine("POST /api/rest/entity/custom/tcoInterconnect/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateCustomTcoInterconnectResponse> createCustomTcoInterconnectWithHttpInfo(CreateCustomTcoInterconnectRequestData body, @QueryMap(encoded=true) CreateCustomTcoInterconnectQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createCustomTcoInterconnect</code> method in a fluent style.
   */
  public static class CreateCustomTcoInterconnectQueryParams extends HashMap<String, Object> {
    public CreateCustomTcoInterconnectQueryParams sessionId(final String value) {
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
   * @return CustomTcoInterconnectCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/tcoInterconnect/{elid}/Cables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomTcoInterconnectCablesResponseData customTcoInterconnectCables(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomTcoInterconnectCablesRequestData body);

  /**
   * Get relations to Leased line entities
   * Similar to <code>customTcoInterconnectCables</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/tcoInterconnect/{elid}/Cables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomTcoInterconnectCablesResponseData> customTcoInterconnectCablesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomTcoInterconnectCablesRequestData body);


  /**
   * Get relations to Leased line entities
   * 
   * Note, this is equivalent to the other <code>customTcoInterconnectCables</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomTcoInterconnectCablesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomTcoInterconnectCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/tcoInterconnect/{elid}/Cables?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomTcoInterconnectCablesResponseData customTcoInterconnectCables(@Param("elid") String elid, CustomTcoInterconnectCablesRequestData body, @QueryMap(encoded=true) CustomTcoInterconnectCablesQueryParams queryParams);

  /**
  * Get relations to Leased line entities
  * 
  * Note, this is equivalent to the other <code>customTcoInterconnectCables</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomTcoInterconnectCablesResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/tcoInterconnect/{elid}/Cables?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomTcoInterconnectCablesResponseData> customTcoInterconnectCablesWithHttpInfo(@Param("elid") String elid, CustomTcoInterconnectCablesRequestData body, @QueryMap(encoded=true) CustomTcoInterconnectCablesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customTcoInterconnectCables</code> method in a fluent style.
   */
  public static class CustomTcoInterconnectCablesQueryParams extends HashMap<String, Object> {
    public CustomTcoInterconnectCablesQueryParams sessionId(final String value) {
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
   * @return CustomTcoInterconnectDataCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/tcoInterconnect/{elid}/DataCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomTcoInterconnectDataCablesResponseData customTcoInterconnectDataCables(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomTcoInterconnectDataCablesRequestData body);

  /**
   * Get relations to Data cable entities
   * Similar to <code>customTcoInterconnectDataCables</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/tcoInterconnect/{elid}/DataCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomTcoInterconnectDataCablesResponseData> customTcoInterconnectDataCablesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomTcoInterconnectDataCablesRequestData body);


  /**
   * Get relations to Data cable entities
   * 
   * Note, this is equivalent to the other <code>customTcoInterconnectDataCables</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomTcoInterconnectDataCablesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomTcoInterconnectDataCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/tcoInterconnect/{elid}/DataCables?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomTcoInterconnectDataCablesResponseData customTcoInterconnectDataCables(@Param("elid") String elid, CustomTcoInterconnectDataCablesRequestData body, @QueryMap(encoded=true) CustomTcoInterconnectDataCablesQueryParams queryParams);

  /**
  * Get relations to Data cable entities
  * 
  * Note, this is equivalent to the other <code>customTcoInterconnectDataCables</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomTcoInterconnectDataCablesResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/tcoInterconnect/{elid}/DataCables?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomTcoInterconnectDataCablesResponseData> customTcoInterconnectDataCablesWithHttpInfo(@Param("elid") String elid, CustomTcoInterconnectDataCablesRequestData body, @QueryMap(encoded=true) CustomTcoInterconnectDataCablesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customTcoInterconnectDataCables</code> method in a fluent style.
   */
  public static class CustomTcoInterconnectDataCablesQueryParams extends HashMap<String, Object> {
    public CustomTcoInterconnectDataCablesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Logical port Carrier entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CustomTcoInterconnectLogicalPortsResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/tcoInterconnect/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomTcoInterconnectLogicalPortsResponseData customTcoInterconnectLogicalPorts(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomTcoInterconnectLogicalPortsRequestData body);

  /**
   * Get relations to Logical port Carrier entities
   * Similar to <code>customTcoInterconnectLogicalPorts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/tcoInterconnect/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomTcoInterconnectLogicalPortsResponseData> customTcoInterconnectLogicalPortsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomTcoInterconnectLogicalPortsRequestData body);


  /**
   * Get relations to Logical port Carrier entities
   * 
   * Note, this is equivalent to the other <code>customTcoInterconnectLogicalPorts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomTcoInterconnectLogicalPortsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomTcoInterconnectLogicalPortsResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/tcoInterconnect/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomTcoInterconnectLogicalPortsResponseData customTcoInterconnectLogicalPorts(@Param("elid") String elid, CustomTcoInterconnectLogicalPortsRequestData body, @QueryMap(encoded=true) CustomTcoInterconnectLogicalPortsQueryParams queryParams);

  /**
  * Get relations to Logical port Carrier entities
  * 
  * Note, this is equivalent to the other <code>customTcoInterconnectLogicalPorts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomTcoInterconnectLogicalPortsResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/tcoInterconnect/{elid}/LogicalPorts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomTcoInterconnectLogicalPortsResponseData> customTcoInterconnectLogicalPortsWithHttpInfo(@Param("elid") String elid, CustomTcoInterconnectLogicalPortsRequestData body, @QueryMap(encoded=true) CustomTcoInterconnectLogicalPortsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customTcoInterconnectLogicalPorts</code> method in a fluent style.
   */
  public static class CustomTcoInterconnectLogicalPortsQueryParams extends HashMap<String, Object> {
    public CustomTcoInterconnectLogicalPortsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Carrier entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CustomTcoInterconnectOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/tcoInterconnect/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomTcoInterconnectOrganizationsResponseData customTcoInterconnectOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomTcoInterconnectOrganizationsRequestData body);

  /**
   * Get relations to Carrier entities
   * Similar to <code>customTcoInterconnectOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/tcoInterconnect/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomTcoInterconnectOrganizationsResponseData> customTcoInterconnectOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomTcoInterconnectOrganizationsRequestData body);


  /**
   * Get relations to Carrier entities
   * 
   * Note, this is equivalent to the other <code>customTcoInterconnectOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomTcoInterconnectOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomTcoInterconnectOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/tcoInterconnect/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomTcoInterconnectOrganizationsResponseData customTcoInterconnectOrganizations(@Param("elid") String elid, CustomTcoInterconnectOrganizationsRequestData body, @QueryMap(encoded=true) CustomTcoInterconnectOrganizationsQueryParams queryParams);

  /**
  * Get relations to Carrier entities
  * 
  * Note, this is equivalent to the other <code>customTcoInterconnectOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomTcoInterconnectOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/tcoInterconnect/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomTcoInterconnectOrganizationsResponseData> customTcoInterconnectOrganizationsWithHttpInfo(@Param("elid") String elid, CustomTcoInterconnectOrganizationsRequestData body, @QueryMap(encoded=true) CustomTcoInterconnectOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customTcoInterconnectOrganizations</code> method in a fluent style.
   */
  public static class CustomTcoInterconnectOrganizationsQueryParams extends HashMap<String, Object> {
    public CustomTcoInterconnectOrganizationsQueryParams sessionId(final String value) {
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
   * @return CustomTcoInterconnectPowerCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/tcoInterconnect/{elid}/PowerCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomTcoInterconnectPowerCablesResponseData customTcoInterconnectPowerCables(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomTcoInterconnectPowerCablesRequestData body);

  /**
   * Get relations to Power cable entities
   * Similar to <code>customTcoInterconnectPowerCables</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/tcoInterconnect/{elid}/PowerCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomTcoInterconnectPowerCablesResponseData> customTcoInterconnectPowerCablesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomTcoInterconnectPowerCablesRequestData body);


  /**
   * Get relations to Power cable entities
   * 
   * Note, this is equivalent to the other <code>customTcoInterconnectPowerCables</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomTcoInterconnectPowerCablesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomTcoInterconnectPowerCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/tcoInterconnect/{elid}/PowerCables?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomTcoInterconnectPowerCablesResponseData customTcoInterconnectPowerCables(@Param("elid") String elid, CustomTcoInterconnectPowerCablesRequestData body, @QueryMap(encoded=true) CustomTcoInterconnectPowerCablesQueryParams queryParams);

  /**
  * Get relations to Power cable entities
  * 
  * Note, this is equivalent to the other <code>customTcoInterconnectPowerCables</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomTcoInterconnectPowerCablesResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/tcoInterconnect/{elid}/PowerCables?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomTcoInterconnectPowerCablesResponseData> customTcoInterconnectPowerCablesWithHttpInfo(@Param("elid") String elid, CustomTcoInterconnectPowerCablesRequestData body, @QueryMap(encoded=true) CustomTcoInterconnectPowerCablesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customTcoInterconnectPowerCables</code> method in a fluent style.
   */
  public static class CustomTcoInterconnectPowerCablesQueryParams extends HashMap<String, Object> {
    public CustomTcoInterconnectPowerCablesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CustomTcoInterconnectQueryResponse
   */
  @RequestLine("POST /api/rest/entity/custom/tcoInterconnect/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomTcoInterconnectQueryResponse customTcoInterconnectQuery(@Param("sessionId") String sessionId, CustomTcoInterconnectQueryRequest body);

  /**
   * Basic query
   * Similar to <code>customTcoInterconnectQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/tcoInterconnect/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomTcoInterconnectQueryResponse> customTcoInterconnectQueryWithHttpInfo(@Param("sessionId") String sessionId, CustomTcoInterconnectQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>customTcoInterconnectQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomTcoInterconnectQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomTcoInterconnectQueryResponse
   */
  @RequestLine("POST /api/rest/entity/custom/tcoInterconnect/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomTcoInterconnectQueryResponse customTcoInterconnectQuery(CustomTcoInterconnectQueryRequest body, @QueryMap(encoded=true) CustomTcoInterconnectQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>customTcoInterconnectQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomTcoInterconnectQueryResponse
      */
      @RequestLine("POST /api/rest/entity/custom/tcoInterconnect/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomTcoInterconnectQueryResponse> customTcoInterconnectQueryWithHttpInfo(CustomTcoInterconnectQueryRequest body, @QueryMap(encoded=true) CustomTcoInterconnectQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customTcoInterconnectQuery</code> method in a fluent style.
   */
  public static class CustomTcoInterconnectQueryQueryParams extends HashMap<String, Object> {
    public CustomTcoInterconnectQueryQueryParams sessionId(final String value) {
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
   * @return CustomTcoInterconnectSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/custom/tcoInterconnect/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomTcoInterconnectSystemAttributesResponse customTcoInterconnectSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomTcoInterconnectSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>customTcoInterconnectSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/tcoInterconnect/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomTcoInterconnectSystemAttributesResponse> customTcoInterconnectSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomTcoInterconnectSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>customTcoInterconnectSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomTcoInterconnectSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomTcoInterconnectSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/custom/tcoInterconnect/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomTcoInterconnectSystemAttributesResponse customTcoInterconnectSystemAttributes(@Param("elid") String elid, CustomTcoInterconnectSystemAttributesRequest body, @QueryMap(encoded=true) CustomTcoInterconnectSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>customTcoInterconnectSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomTcoInterconnectSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/custom/tcoInterconnect/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomTcoInterconnectSystemAttributesResponse> customTcoInterconnectSystemAttributesWithHttpInfo(@Param("elid") String elid, CustomTcoInterconnectSystemAttributesRequest body, @QueryMap(encoded=true) CustomTcoInterconnectSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customTcoInterconnectSystemAttributes</code> method in a fluent style.
   */
  public static class CustomTcoInterconnectSystemAttributesQueryParams extends HashMap<String, Object> {
    public CustomTcoInterconnectSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to VLAN pool entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CustomTcoInterconnectVlanPoolResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/tcoInterconnect/{elid}/VlanPool?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomTcoInterconnectVlanPoolResponseData customTcoInterconnectVlanPool(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomTcoInterconnectVlanPoolRequestData body);

  /**
   * Get relations to VLAN pool entities
   * Similar to <code>customTcoInterconnectVlanPool</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/tcoInterconnect/{elid}/VlanPool?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomTcoInterconnectVlanPoolResponseData> customTcoInterconnectVlanPoolWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomTcoInterconnectVlanPoolRequestData body);


  /**
   * Get relations to VLAN pool entities
   * 
   * Note, this is equivalent to the other <code>customTcoInterconnectVlanPool</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomTcoInterconnectVlanPoolQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomTcoInterconnectVlanPoolResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/tcoInterconnect/{elid}/VlanPool?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomTcoInterconnectVlanPoolResponseData customTcoInterconnectVlanPool(@Param("elid") String elid, CustomTcoInterconnectVlanPoolRequestData body, @QueryMap(encoded=true) CustomTcoInterconnectVlanPoolQueryParams queryParams);

  /**
  * Get relations to VLAN pool entities
  * 
  * Note, this is equivalent to the other <code>customTcoInterconnectVlanPool</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomTcoInterconnectVlanPoolResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/tcoInterconnect/{elid}/VlanPool?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomTcoInterconnectVlanPoolResponseData> customTcoInterconnectVlanPoolWithHttpInfo(@Param("elid") String elid, CustomTcoInterconnectVlanPoolRequestData body, @QueryMap(encoded=true) CustomTcoInterconnectVlanPoolQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customTcoInterconnectVlanPool</code> method in a fluent style.
   */
  public static class CustomTcoInterconnectVlanPoolQueryParams extends HashMap<String, Object> {
    public CustomTcoInterconnectVlanPoolQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Telco-Interconnect
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteCustomTcoInterconnectResponse
   */
  @RequestLine("POST /api/rest/entity/custom/tcoInterconnect/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteCustomTcoInterconnectResponse deleteCustomTcoInterconnect(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCustomTcoInterconnectRequestData body);

  /**
   * Delete
   * Similar to <code>deleteCustomTcoInterconnect</code> but it also returns the http response headers .
   * Delete Telco-Interconnect
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/tcoInterconnect/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteCustomTcoInterconnectResponse> deleteCustomTcoInterconnectWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCustomTcoInterconnectRequestData body);


  /**
   * Delete
   * Delete Telco-Interconnect
   * Note, this is equivalent to the other <code>deleteCustomTcoInterconnect</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteCustomTcoInterconnectQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteCustomTcoInterconnectResponse
   */
  @RequestLine("POST /api/rest/entity/custom/tcoInterconnect/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteCustomTcoInterconnectResponse deleteCustomTcoInterconnect(@Param("elid") String elid, DeleteCustomTcoInterconnectRequestData body, @QueryMap(encoded=true) DeleteCustomTcoInterconnectQueryParams queryParams);

  /**
  * Delete
  * Delete Telco-Interconnect
  * Note, this is equivalent to the other <code>deleteCustomTcoInterconnect</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteCustomTcoInterconnectResponse
      */
      @RequestLine("POST /api/rest/entity/custom/tcoInterconnect/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteCustomTcoInterconnectResponse> deleteCustomTcoInterconnectWithHttpInfo(@Param("elid") String elid, DeleteCustomTcoInterconnectRequestData body, @QueryMap(encoded=true) DeleteCustomTcoInterconnectQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteCustomTcoInterconnect</code> method in a fluent style.
   */
  public static class DeleteCustomTcoInterconnectQueryParams extends HashMap<String, Object> {
    public DeleteCustomTcoInterconnectQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Telco-Interconnect
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateCustomTcoInterconnectResponse
   */
  @RequestLine("POST /api/rest/entity/custom/tcoInterconnect/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateCustomTcoInterconnectResponse updateCustomTcoInterconnect(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCustomTcoInterconnectRequestData body);

  /**
   * Modify
   * Similar to <code>updateCustomTcoInterconnect</code> but it also returns the http response headers .
   * Modify Telco-Interconnect
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/tcoInterconnect/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateCustomTcoInterconnectResponse> updateCustomTcoInterconnectWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCustomTcoInterconnectRequestData body);


  /**
   * Modify
   * Modify Telco-Interconnect
   * Note, this is equivalent to the other <code>updateCustomTcoInterconnect</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateCustomTcoInterconnectQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateCustomTcoInterconnectResponse
   */
  @RequestLine("POST /api/rest/entity/custom/tcoInterconnect/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateCustomTcoInterconnectResponse updateCustomTcoInterconnect(@Param("elid") String elid, UpdateCustomTcoInterconnectRequestData body, @QueryMap(encoded=true) UpdateCustomTcoInterconnectQueryParams queryParams);

  /**
  * Modify
  * Modify Telco-Interconnect
  * Note, this is equivalent to the other <code>updateCustomTcoInterconnect</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateCustomTcoInterconnectResponse
      */
      @RequestLine("POST /api/rest/entity/custom/tcoInterconnect/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateCustomTcoInterconnectResponse> updateCustomTcoInterconnectWithHttpInfo(@Param("elid") String elid, UpdateCustomTcoInterconnectRequestData body, @QueryMap(encoded=true) UpdateCustomTcoInterconnectQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateCustomTcoInterconnect</code> method in a fluent style.
   */
  public static class UpdateCustomTcoInterconnectQueryParams extends HashMap<String, Object> {
    public UpdateCustomTcoInterconnectQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesCustomTcoInterconnectResponse
   */
  @RequestLine("POST /api/rest/entity/custom/tcoInterconnect/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesCustomTcoInterconnectResponse updateSystemAttributesCustomTcoInterconnect(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCustomTcoInterconnectRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesCustomTcoInterconnect</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/tcoInterconnect/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesCustomTcoInterconnectResponse> updateSystemAttributesCustomTcoInterconnectWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCustomTcoInterconnectRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesCustomTcoInterconnect</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesCustomTcoInterconnectQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesCustomTcoInterconnectResponse
   */
  @RequestLine("POST /api/rest/entity/custom/tcoInterconnect/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesCustomTcoInterconnectResponse updateSystemAttributesCustomTcoInterconnect(@Param("elid") String elid, UpdateSystemAttributesCustomTcoInterconnectRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCustomTcoInterconnectQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesCustomTcoInterconnect</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesCustomTcoInterconnectResponse
      */
      @RequestLine("POST /api/rest/entity/custom/tcoInterconnect/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesCustomTcoInterconnectResponse> updateSystemAttributesCustomTcoInterconnectWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesCustomTcoInterconnectRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCustomTcoInterconnectQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesCustomTcoInterconnect</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesCustomTcoInterconnectQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesCustomTcoInterconnectQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
