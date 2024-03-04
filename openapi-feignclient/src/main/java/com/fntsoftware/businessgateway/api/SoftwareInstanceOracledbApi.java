package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateSoftwareInstanceOracledbRequestData;
import com.fntsoftware.businessgateway.entities.CreateSoftwareInstanceOracledbResponse;
import com.fntsoftware.businessgateway.entities.DeleteSoftwareInstanceOracledbRequestData;
import com.fntsoftware.businessgateway.entities.DeleteSoftwareInstanceOracledbResponse;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceOracledbContractsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceOracledbContractsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceOracledbFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceOracledbFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceOracledbMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceOracledbMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceOracledbOperatingSystemInstallationRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceOracledbOperatingSystemInstallationResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceOracledbOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceOracledbOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceOracledbPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceOracledbPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceOracledbPersonsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceOracledbPersonsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceOracledbQueryRequest;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceOracledbQueryResponse;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceOracledbSoftwareInstallationRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceOracledbSoftwareInstallationResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceOracledbSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceOracledbSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateSoftwareInstanceOracledbRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSoftwareInstanceOracledbResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSoftwareInstanceOracledbRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSoftwareInstanceOracledbResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface SoftwareInstanceOracledbApi extends ApiClient.Api {


  /**
   * Create
   * Create software instance
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateSoftwareInstanceOracledbResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateSoftwareInstanceOracledbResponse createSoftwareInstanceOracledb(@Param("sessionId") String sessionId, CreateSoftwareInstanceOracledbRequestData body);

  /**
   * Create
   * Similar to <code>createSoftwareInstanceOracledb</code> but it also returns the http response headers .
   * Create software instance
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateSoftwareInstanceOracledbResponse> createSoftwareInstanceOracledbWithHttpInfo(@Param("sessionId") String sessionId, CreateSoftwareInstanceOracledbRequestData body);


  /**
   * Create
   * Create software instance
   * Note, this is equivalent to the other <code>createSoftwareInstanceOracledb</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateSoftwareInstanceOracledbQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateSoftwareInstanceOracledbResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateSoftwareInstanceOracledbResponse createSoftwareInstanceOracledb(CreateSoftwareInstanceOracledbRequestData body, @QueryMap(encoded=true) CreateSoftwareInstanceOracledbQueryParams queryParams);

  /**
  * Create
  * Create software instance
  * Note, this is equivalent to the other <code>createSoftwareInstanceOracledb</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateSoftwareInstanceOracledbResponse
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateSoftwareInstanceOracledbResponse> createSoftwareInstanceOracledbWithHttpInfo(CreateSoftwareInstanceOracledbRequestData body, @QueryMap(encoded=true) CreateSoftwareInstanceOracledbQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createSoftwareInstanceOracledb</code> method in a fluent style.
   */
  public static class CreateSoftwareInstanceOracledbQueryParams extends HashMap<String, Object> {
    public CreateSoftwareInstanceOracledbQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete software instance
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteSoftwareInstanceOracledbResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteSoftwareInstanceOracledbResponse deleteSoftwareInstanceOracledb(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteSoftwareInstanceOracledbRequestData body);

  /**
   * Delete
   * Similar to <code>deleteSoftwareInstanceOracledb</code> but it also returns the http response headers .
   * Delete software instance
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteSoftwareInstanceOracledbResponse> deleteSoftwareInstanceOracledbWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteSoftwareInstanceOracledbRequestData body);


  /**
   * Delete
   * Delete software instance
   * Note, this is equivalent to the other <code>deleteSoftwareInstanceOracledb</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteSoftwareInstanceOracledbQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteSoftwareInstanceOracledbResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteSoftwareInstanceOracledbResponse deleteSoftwareInstanceOracledb(@Param("elid") String elid, DeleteSoftwareInstanceOracledbRequestData body, @QueryMap(encoded=true) DeleteSoftwareInstanceOracledbQueryParams queryParams);

  /**
  * Delete
  * Delete software instance
  * Note, this is equivalent to the other <code>deleteSoftwareInstanceOracledb</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteSoftwareInstanceOracledbResponse
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteSoftwareInstanceOracledbResponse> deleteSoftwareInstanceOracledbWithHttpInfo(@Param("elid") String elid, DeleteSoftwareInstanceOracledbRequestData body, @QueryMap(encoded=true) DeleteSoftwareInstanceOracledbQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteSoftwareInstanceOracledb</code> method in a fluent style.
   */
  public static class DeleteSoftwareInstanceOracledbQueryParams extends HashMap<String, Object> {
    public DeleteSoftwareInstanceOracledbQueryParams sessionId(final String value) {
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
   * @return SoftwareInstanceOracledbContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceOracledbContractsResponseData softwareInstanceOracledbContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceOracledbContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>softwareInstanceOracledbContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceOracledbContractsResponseData> softwareInstanceOracledbContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceOracledbContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>softwareInstanceOracledbContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceOracledbContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceOracledbContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceOracledbContractsResponseData softwareInstanceOracledbContracts(@Param("elid") String elid, SoftwareInstanceOracledbContractsRequestData body, @QueryMap(encoded=true) SoftwareInstanceOracledbContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>softwareInstanceOracledbContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceOracledbContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceOracledbContractsResponseData> softwareInstanceOracledbContractsWithHttpInfo(@Param("elid") String elid, SoftwareInstanceOracledbContractsRequestData body, @QueryMap(encoded=true) SoftwareInstanceOracledbContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceOracledbContracts</code> method in a fluent style.
   */
  public static class SoftwareInstanceOracledbContractsQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceOracledbContractsQueryParams sessionId(final String value) {
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
   * @return SoftwareInstanceOracledbFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceOracledbFrameContractsResponseData softwareInstanceOracledbFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceOracledbFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>softwareInstanceOracledbFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceOracledbFrameContractsResponseData> softwareInstanceOracledbFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceOracledbFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>softwareInstanceOracledbFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceOracledbFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceOracledbFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceOracledbFrameContractsResponseData softwareInstanceOracledbFrameContracts(@Param("elid") String elid, SoftwareInstanceOracledbFrameContractsRequestData body, @QueryMap(encoded=true) SoftwareInstanceOracledbFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>softwareInstanceOracledbFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceOracledbFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceOracledbFrameContractsResponseData> softwareInstanceOracledbFrameContractsWithHttpInfo(@Param("elid") String elid, SoftwareInstanceOracledbFrameContractsRequestData body, @QueryMap(encoded=true) SoftwareInstanceOracledbFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceOracledbFrameContracts</code> method in a fluent style.
   */
  public static class SoftwareInstanceOracledbFrameContractsQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceOracledbFrameContractsQueryParams sessionId(final String value) {
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
   * @return SoftwareInstanceOracledbMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceOracledbMaintenanceContractsResponseData softwareInstanceOracledbMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceOracledbMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>softwareInstanceOracledbMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceOracledbMaintenanceContractsResponseData> softwareInstanceOracledbMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceOracledbMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>softwareInstanceOracledbMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceOracledbMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceOracledbMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceOracledbMaintenanceContractsResponseData softwareInstanceOracledbMaintenanceContracts(@Param("elid") String elid, SoftwareInstanceOracledbMaintenanceContractsRequestData body, @QueryMap(encoded=true) SoftwareInstanceOracledbMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>softwareInstanceOracledbMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceOracledbMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceOracledbMaintenanceContractsResponseData> softwareInstanceOracledbMaintenanceContractsWithHttpInfo(@Param("elid") String elid, SoftwareInstanceOracledbMaintenanceContractsRequestData body, @QueryMap(encoded=true) SoftwareInstanceOracledbMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceOracledbMaintenanceContracts</code> method in a fluent style.
   */
  public static class SoftwareInstanceOracledbMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceOracledbMaintenanceContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Operating system installation entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return SoftwareInstanceOracledbOperatingSystemInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceOracledbOperatingSystemInstallationResponseData softwareInstanceOracledbOperatingSystemInstallation(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceOracledbOperatingSystemInstallationRequestData body);

  /**
   * Get relations to Operating system installation entities
   * Similar to <code>softwareInstanceOracledbOperatingSystemInstallation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceOracledbOperatingSystemInstallationResponseData> softwareInstanceOracledbOperatingSystemInstallationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceOracledbOperatingSystemInstallationRequestData body);


  /**
   * Get relations to Operating system installation entities
   * 
   * Note, this is equivalent to the other <code>softwareInstanceOracledbOperatingSystemInstallation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceOracledbOperatingSystemInstallationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceOracledbOperatingSystemInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceOracledbOperatingSystemInstallationResponseData softwareInstanceOracledbOperatingSystemInstallation(@Param("elid") String elid, SoftwareInstanceOracledbOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) SoftwareInstanceOracledbOperatingSystemInstallationQueryParams queryParams);

  /**
  * Get relations to Operating system installation entities
  * 
  * Note, this is equivalent to the other <code>softwareInstanceOracledbOperatingSystemInstallation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceOracledbOperatingSystemInstallationResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceOracledbOperatingSystemInstallationResponseData> softwareInstanceOracledbOperatingSystemInstallationWithHttpInfo(@Param("elid") String elid, SoftwareInstanceOracledbOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) SoftwareInstanceOracledbOperatingSystemInstallationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceOracledbOperatingSystemInstallation</code> method in a fluent style.
   */
  public static class SoftwareInstanceOracledbOperatingSystemInstallationQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceOracledbOperatingSystemInstallationQueryParams sessionId(final String value) {
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
   * @return SoftwareInstanceOracledbOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceOracledbOrganizationsResponseData softwareInstanceOracledbOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceOracledbOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>softwareInstanceOracledbOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceOracledbOrganizationsResponseData> softwareInstanceOracledbOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceOracledbOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>softwareInstanceOracledbOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceOracledbOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceOracledbOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceOracledbOrganizationsResponseData softwareInstanceOracledbOrganizations(@Param("elid") String elid, SoftwareInstanceOracledbOrganizationsRequestData body, @QueryMap(encoded=true) SoftwareInstanceOracledbOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>softwareInstanceOracledbOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceOracledbOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceOracledbOrganizationsResponseData> softwareInstanceOracledbOrganizationsWithHttpInfo(@Param("elid") String elid, SoftwareInstanceOracledbOrganizationsRequestData body, @QueryMap(encoded=true) SoftwareInstanceOracledbOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceOracledbOrganizations</code> method in a fluent style.
   */
  public static class SoftwareInstanceOracledbOrganizationsQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceOracledbOrganizationsQueryParams sessionId(final String value) {
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
   * @return SoftwareInstanceOracledbPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceOracledbPersonGroupsResponseData softwareInstanceOracledbPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceOracledbPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>softwareInstanceOracledbPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceOracledbPersonGroupsResponseData> softwareInstanceOracledbPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceOracledbPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>softwareInstanceOracledbPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceOracledbPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceOracledbPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceOracledbPersonGroupsResponseData softwareInstanceOracledbPersonGroups(@Param("elid") String elid, SoftwareInstanceOracledbPersonGroupsRequestData body, @QueryMap(encoded=true) SoftwareInstanceOracledbPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>softwareInstanceOracledbPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceOracledbPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceOracledbPersonGroupsResponseData> softwareInstanceOracledbPersonGroupsWithHttpInfo(@Param("elid") String elid, SoftwareInstanceOracledbPersonGroupsRequestData body, @QueryMap(encoded=true) SoftwareInstanceOracledbPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceOracledbPersonGroups</code> method in a fluent style.
   */
  public static class SoftwareInstanceOracledbPersonGroupsQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceOracledbPersonGroupsQueryParams sessionId(final String value) {
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
   * @return SoftwareInstanceOracledbPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceOracledbPersonsResponseData softwareInstanceOracledbPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceOracledbPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>softwareInstanceOracledbPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceOracledbPersonsResponseData> softwareInstanceOracledbPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceOracledbPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>softwareInstanceOracledbPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceOracledbPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceOracledbPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceOracledbPersonsResponseData softwareInstanceOracledbPersons(@Param("elid") String elid, SoftwareInstanceOracledbPersonsRequestData body, @QueryMap(encoded=true) SoftwareInstanceOracledbPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>softwareInstanceOracledbPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceOracledbPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceOracledbPersonsResponseData> softwareInstanceOracledbPersonsWithHttpInfo(@Param("elid") String elid, SoftwareInstanceOracledbPersonsRequestData body, @QueryMap(encoded=true) SoftwareInstanceOracledbPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceOracledbPersons</code> method in a fluent style.
   */
  public static class SoftwareInstanceOracledbPersonsQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceOracledbPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return SoftwareInstanceOracledbQueryResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceOracledbQueryResponse softwareInstanceOracledbQuery(@Param("sessionId") String sessionId, SoftwareInstanceOracledbQueryRequest body);

  /**
   * Basic query
   * Similar to <code>softwareInstanceOracledbQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceOracledbQueryResponse> softwareInstanceOracledbQueryWithHttpInfo(@Param("sessionId") String sessionId, SoftwareInstanceOracledbQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>softwareInstanceOracledbQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceOracledbQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceOracledbQueryResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceOracledbQueryResponse softwareInstanceOracledbQuery(SoftwareInstanceOracledbQueryRequest body, @QueryMap(encoded=true) SoftwareInstanceOracledbQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>softwareInstanceOracledbQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceOracledbQueryResponse
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceOracledbQueryResponse> softwareInstanceOracledbQueryWithHttpInfo(SoftwareInstanceOracledbQueryRequest body, @QueryMap(encoded=true) SoftwareInstanceOracledbQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceOracledbQuery</code> method in a fluent style.
   */
  public static class SoftwareInstanceOracledbQueryQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceOracledbQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Software installation entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return SoftwareInstanceOracledbSoftwareInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/{elid}/SoftwareInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceOracledbSoftwareInstallationResponseData softwareInstanceOracledbSoftwareInstallation(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceOracledbSoftwareInstallationRequestData body);

  /**
   * Get relations to Software installation entities
   * Similar to <code>softwareInstanceOracledbSoftwareInstallation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/{elid}/SoftwareInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceOracledbSoftwareInstallationResponseData> softwareInstanceOracledbSoftwareInstallationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceOracledbSoftwareInstallationRequestData body);


  /**
   * Get relations to Software installation entities
   * 
   * Note, this is equivalent to the other <code>softwareInstanceOracledbSoftwareInstallation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceOracledbSoftwareInstallationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceOracledbSoftwareInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/{elid}/SoftwareInstallation?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceOracledbSoftwareInstallationResponseData softwareInstanceOracledbSoftwareInstallation(@Param("elid") String elid, SoftwareInstanceOracledbSoftwareInstallationRequestData body, @QueryMap(encoded=true) SoftwareInstanceOracledbSoftwareInstallationQueryParams queryParams);

  /**
  * Get relations to Software installation entities
  * 
  * Note, this is equivalent to the other <code>softwareInstanceOracledbSoftwareInstallation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceOracledbSoftwareInstallationResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/{elid}/SoftwareInstallation?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceOracledbSoftwareInstallationResponseData> softwareInstanceOracledbSoftwareInstallationWithHttpInfo(@Param("elid") String elid, SoftwareInstanceOracledbSoftwareInstallationRequestData body, @QueryMap(encoded=true) SoftwareInstanceOracledbSoftwareInstallationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceOracledbSoftwareInstallation</code> method in a fluent style.
   */
  public static class SoftwareInstanceOracledbSoftwareInstallationQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceOracledbSoftwareInstallationQueryParams sessionId(final String value) {
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
   * @return SoftwareInstanceOracledbSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceOracledbSystemAttributesResponse softwareInstanceOracledbSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceOracledbSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>softwareInstanceOracledbSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceOracledbSystemAttributesResponse> softwareInstanceOracledbSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceOracledbSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>softwareInstanceOracledbSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceOracledbSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceOracledbSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceOracledbSystemAttributesResponse softwareInstanceOracledbSystemAttributes(@Param("elid") String elid, SoftwareInstanceOracledbSystemAttributesRequest body, @QueryMap(encoded=true) SoftwareInstanceOracledbSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>softwareInstanceOracledbSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceOracledbSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceOracledbSystemAttributesResponse> softwareInstanceOracledbSystemAttributesWithHttpInfo(@Param("elid") String elid, SoftwareInstanceOracledbSystemAttributesRequest body, @QueryMap(encoded=true) SoftwareInstanceOracledbSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceOracledbSystemAttributes</code> method in a fluent style.
   */
  public static class SoftwareInstanceOracledbSystemAttributesQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceOracledbSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify software instance
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateSoftwareInstanceOracledbResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSoftwareInstanceOracledbResponse updateSoftwareInstanceOracledb(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSoftwareInstanceOracledbRequestData body);

  /**
   * Modify
   * Similar to <code>updateSoftwareInstanceOracledb</code> but it also returns the http response headers .
   * Modify software instance
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSoftwareInstanceOracledbResponse> updateSoftwareInstanceOracledbWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSoftwareInstanceOracledbRequestData body);


  /**
   * Modify
   * Modify software instance
   * Note, this is equivalent to the other <code>updateSoftwareInstanceOracledb</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSoftwareInstanceOracledbQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSoftwareInstanceOracledbResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSoftwareInstanceOracledbResponse updateSoftwareInstanceOracledb(@Param("elid") String elid, UpdateSoftwareInstanceOracledbRequestData body, @QueryMap(encoded=true) UpdateSoftwareInstanceOracledbQueryParams queryParams);

  /**
  * Modify
  * Modify software instance
  * Note, this is equivalent to the other <code>updateSoftwareInstanceOracledb</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSoftwareInstanceOracledbResponse
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSoftwareInstanceOracledbResponse> updateSoftwareInstanceOracledbWithHttpInfo(@Param("elid") String elid, UpdateSoftwareInstanceOracledbRequestData body, @QueryMap(encoded=true) UpdateSoftwareInstanceOracledbQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSoftwareInstanceOracledb</code> method in a fluent style.
   */
  public static class UpdateSoftwareInstanceOracledbQueryParams extends HashMap<String, Object> {
    public UpdateSoftwareInstanceOracledbQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesSoftwareInstanceOracledbResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesSoftwareInstanceOracledbResponse updateSystemAttributesSoftwareInstanceOracledb(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesSoftwareInstanceOracledbRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesSoftwareInstanceOracledb</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesSoftwareInstanceOracledbResponse> updateSystemAttributesSoftwareInstanceOracledbWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesSoftwareInstanceOracledbRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesSoftwareInstanceOracledb</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesSoftwareInstanceOracledbQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesSoftwareInstanceOracledbResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesSoftwareInstanceOracledbResponse updateSystemAttributesSoftwareInstanceOracledb(@Param("elid") String elid, UpdateSystemAttributesSoftwareInstanceOracledbRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesSoftwareInstanceOracledbQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesSoftwareInstanceOracledb</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesSoftwareInstanceOracledbResponse
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceOracledb/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesSoftwareInstanceOracledbResponse> updateSystemAttributesSoftwareInstanceOracledbWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesSoftwareInstanceOracledbRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesSoftwareInstanceOracledbQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesSoftwareInstanceOracledb</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesSoftwareInstanceOracledbQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesSoftwareInstanceOracledbQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
