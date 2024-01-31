package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateSoftwareInstanceRequestData;
import com.fntsoftware.businessgateway.entities.CreateSoftwareInstanceResponse;
import com.fntsoftware.businessgateway.entities.DeleteSoftwareInstanceRequestData;
import com.fntsoftware.businessgateway.entities.DeleteSoftwareInstanceResponse;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceOperatingSystemInstallationRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceOperatingSystemInstallationResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstancePersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstancePersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstancePersonsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstancePersonsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceQueryRequest;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceQueryResponse;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceSoftwareInstallationRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceSoftwareInstallationResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateSoftwareInstanceRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSoftwareInstanceResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSoftwareInstanceRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSoftwareInstanceResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface SoftwareInstanceApi extends ApiClient.Api {


  /**
   * Create
   * Create software instance
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateSoftwareInstanceResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstance/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateSoftwareInstanceResponse createSoftwareInstance(@Param("sessionId") String sessionId, CreateSoftwareInstanceRequestData body);

  /**
   * Create
   * Similar to <code>createSoftwareInstance</code> but it also returns the http response headers .
   * Create software instance
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstance/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateSoftwareInstanceResponse> createSoftwareInstanceWithHttpInfo(@Param("sessionId") String sessionId, CreateSoftwareInstanceRequestData body);


  /**
   * Create
   * Create software instance
   * Note, this is equivalent to the other <code>createSoftwareInstance</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateSoftwareInstanceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateSoftwareInstanceResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstance/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateSoftwareInstanceResponse createSoftwareInstance(CreateSoftwareInstanceRequestData body, @QueryMap(encoded=true) CreateSoftwareInstanceQueryParams queryParams);

  /**
  * Create
  * Create software instance
  * Note, this is equivalent to the other <code>createSoftwareInstance</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateSoftwareInstanceResponse
      */
      @RequestLine("POST /api/rest/entity/softwareInstance/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateSoftwareInstanceResponse> createSoftwareInstanceWithHttpInfo(CreateSoftwareInstanceRequestData body, @QueryMap(encoded=true) CreateSoftwareInstanceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createSoftwareInstance</code> method in a fluent style.
   */
  public static class CreateSoftwareInstanceQueryParams extends HashMap<String, Object> {
    public CreateSoftwareInstanceQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Software instance
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteSoftwareInstanceResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstance/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteSoftwareInstanceResponse deleteSoftwareInstance(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteSoftwareInstanceRequestData body);

  /**
   * Delete
   * Similar to <code>deleteSoftwareInstance</code> but it also returns the http response headers .
   * Delete Software instance
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstance/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteSoftwareInstanceResponse> deleteSoftwareInstanceWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteSoftwareInstanceRequestData body);


  /**
   * Delete
   * Delete Software instance
   * Note, this is equivalent to the other <code>deleteSoftwareInstance</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteSoftwareInstanceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteSoftwareInstanceResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstance/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteSoftwareInstanceResponse deleteSoftwareInstance(@Param("elid") String elid, DeleteSoftwareInstanceRequestData body, @QueryMap(encoded=true) DeleteSoftwareInstanceQueryParams queryParams);

  /**
  * Delete
  * Delete Software instance
  * Note, this is equivalent to the other <code>deleteSoftwareInstance</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteSoftwareInstanceResponse
      */
      @RequestLine("POST /api/rest/entity/softwareInstance/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteSoftwareInstanceResponse> deleteSoftwareInstanceWithHttpInfo(@Param("elid") String elid, DeleteSoftwareInstanceRequestData body, @QueryMap(encoded=true) DeleteSoftwareInstanceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteSoftwareInstance</code> method in a fluent style.
   */
  public static class DeleteSoftwareInstanceQueryParams extends HashMap<String, Object> {
    public DeleteSoftwareInstanceQueryParams sessionId(final String value) {
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
   * @return SoftwareInstanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstance/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceContractsResponseData softwareInstanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>softwareInstanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstance/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceContractsResponseData> softwareInstanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>softwareInstanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstance/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceContractsResponseData softwareInstanceContracts(@Param("elid") String elid, SoftwareInstanceContractsRequestData body, @QueryMap(encoded=true) SoftwareInstanceContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>softwareInstanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstance/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceContractsResponseData> softwareInstanceContractsWithHttpInfo(@Param("elid") String elid, SoftwareInstanceContractsRequestData body, @QueryMap(encoded=true) SoftwareInstanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceContracts</code> method in a fluent style.
   */
  public static class SoftwareInstanceContractsQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceContractsQueryParams sessionId(final String value) {
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
   * @return SoftwareInstanceFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstance/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceFrameContractsResponseData softwareInstanceFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>softwareInstanceFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstance/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceFrameContractsResponseData> softwareInstanceFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>softwareInstanceFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstance/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceFrameContractsResponseData softwareInstanceFrameContracts(@Param("elid") String elid, SoftwareInstanceFrameContractsRequestData body, @QueryMap(encoded=true) SoftwareInstanceFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>softwareInstanceFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstance/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceFrameContractsResponseData> softwareInstanceFrameContractsWithHttpInfo(@Param("elid") String elid, SoftwareInstanceFrameContractsRequestData body, @QueryMap(encoded=true) SoftwareInstanceFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceFrameContracts</code> method in a fluent style.
   */
  public static class SoftwareInstanceFrameContractsQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceFrameContractsQueryParams sessionId(final String value) {
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
   * @return SoftwareInstanceMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstance/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceMaintenanceContractsResponseData softwareInstanceMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>softwareInstanceMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstance/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceMaintenanceContractsResponseData> softwareInstanceMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>softwareInstanceMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstance/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceMaintenanceContractsResponseData softwareInstanceMaintenanceContracts(@Param("elid") String elid, SoftwareInstanceMaintenanceContractsRequestData body, @QueryMap(encoded=true) SoftwareInstanceMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>softwareInstanceMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstance/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceMaintenanceContractsResponseData> softwareInstanceMaintenanceContractsWithHttpInfo(@Param("elid") String elid, SoftwareInstanceMaintenanceContractsRequestData body, @QueryMap(encoded=true) SoftwareInstanceMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceMaintenanceContracts</code> method in a fluent style.
   */
  public static class SoftwareInstanceMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return SoftwareInstanceOperatingSystemInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstance/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceOperatingSystemInstallationResponseData softwareInstanceOperatingSystemInstallation(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceOperatingSystemInstallationRequestData body);

  /**
   * Get relations to Operating system installation entities
   * Similar to <code>softwareInstanceOperatingSystemInstallation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstance/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceOperatingSystemInstallationResponseData> softwareInstanceOperatingSystemInstallationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceOperatingSystemInstallationRequestData body);


  /**
   * Get relations to Operating system installation entities
   * 
   * Note, this is equivalent to the other <code>softwareInstanceOperatingSystemInstallation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceOperatingSystemInstallationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceOperatingSystemInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstance/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceOperatingSystemInstallationResponseData softwareInstanceOperatingSystemInstallation(@Param("elid") String elid, SoftwareInstanceOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) SoftwareInstanceOperatingSystemInstallationQueryParams queryParams);

  /**
  * Get relations to Operating system installation entities
  * 
  * Note, this is equivalent to the other <code>softwareInstanceOperatingSystemInstallation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceOperatingSystemInstallationResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstance/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceOperatingSystemInstallationResponseData> softwareInstanceOperatingSystemInstallationWithHttpInfo(@Param("elid") String elid, SoftwareInstanceOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) SoftwareInstanceOperatingSystemInstallationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceOperatingSystemInstallation</code> method in a fluent style.
   */
  public static class SoftwareInstanceOperatingSystemInstallationQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceOperatingSystemInstallationQueryParams sessionId(final String value) {
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
   * @return SoftwareInstanceOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstance/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceOrganizationsResponseData softwareInstanceOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>softwareInstanceOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstance/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceOrganizationsResponseData> softwareInstanceOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>softwareInstanceOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstance/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceOrganizationsResponseData softwareInstanceOrganizations(@Param("elid") String elid, SoftwareInstanceOrganizationsRequestData body, @QueryMap(encoded=true) SoftwareInstanceOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>softwareInstanceOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstance/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceOrganizationsResponseData> softwareInstanceOrganizationsWithHttpInfo(@Param("elid") String elid, SoftwareInstanceOrganizationsRequestData body, @QueryMap(encoded=true) SoftwareInstanceOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceOrganizations</code> method in a fluent style.
   */
  public static class SoftwareInstanceOrganizationsQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceOrganizationsQueryParams sessionId(final String value) {
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
   * @return SoftwareInstancePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstance/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstancePersonGroupsResponseData softwareInstancePersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstancePersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>softwareInstancePersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstance/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstancePersonGroupsResponseData> softwareInstancePersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstancePersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>softwareInstancePersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstancePersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstancePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstance/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstancePersonGroupsResponseData softwareInstancePersonGroups(@Param("elid") String elid, SoftwareInstancePersonGroupsRequestData body, @QueryMap(encoded=true) SoftwareInstancePersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>softwareInstancePersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstancePersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstance/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstancePersonGroupsResponseData> softwareInstancePersonGroupsWithHttpInfo(@Param("elid") String elid, SoftwareInstancePersonGroupsRequestData body, @QueryMap(encoded=true) SoftwareInstancePersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstancePersonGroups</code> method in a fluent style.
   */
  public static class SoftwareInstancePersonGroupsQueryParams extends HashMap<String, Object> {
    public SoftwareInstancePersonGroupsQueryParams sessionId(final String value) {
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
   * @return SoftwareInstancePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstance/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstancePersonsResponseData softwareInstancePersons(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstancePersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>softwareInstancePersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstance/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstancePersonsResponseData> softwareInstancePersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstancePersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>softwareInstancePersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstancePersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstancePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstance/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstancePersonsResponseData softwareInstancePersons(@Param("elid") String elid, SoftwareInstancePersonsRequestData body, @QueryMap(encoded=true) SoftwareInstancePersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>softwareInstancePersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstancePersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstance/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstancePersonsResponseData> softwareInstancePersonsWithHttpInfo(@Param("elid") String elid, SoftwareInstancePersonsRequestData body, @QueryMap(encoded=true) SoftwareInstancePersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstancePersons</code> method in a fluent style.
   */
  public static class SoftwareInstancePersonsQueryParams extends HashMap<String, Object> {
    public SoftwareInstancePersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data. Possible values for attribute &#39;Target sub entity&#39; (Alias of the target sub entity which specifies the target entity in detail.) are: #NO_SUBTYPE, SOFTWARE_INSTANCE_ORACLEDB, SOFTWARE_INSTANCE_MSSQLDB, SOFTWARE_INSTANCE_WEB, SOFTWARE_INSTANCE_SAP, SOFTWARE_INSTANCE_WINDOWSSERVICE
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return SoftwareInstanceQueryResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstance/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceQueryResponse softwareInstanceQuery(@Param("sessionId") String sessionId, SoftwareInstanceQueryRequest body);

  /**
   * Basic query
   * Similar to <code>softwareInstanceQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data. Possible values for attribute &#39;Target sub entity&#39; (Alias of the target sub entity which specifies the target entity in detail.) are: #NO_SUBTYPE, SOFTWARE_INSTANCE_ORACLEDB, SOFTWARE_INSTANCE_MSSQLDB, SOFTWARE_INSTANCE_WEB, SOFTWARE_INSTANCE_SAP, SOFTWARE_INSTANCE_WINDOWSSERVICE
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstance/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceQueryResponse> softwareInstanceQueryWithHttpInfo(@Param("sessionId") String sessionId, SoftwareInstanceQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data. Possible values for attribute &#39;Target sub entity&#39; (Alias of the target sub entity which specifies the target entity in detail.) are: #NO_SUBTYPE, SOFTWARE_INSTANCE_ORACLEDB, SOFTWARE_INSTANCE_MSSQLDB, SOFTWARE_INSTANCE_WEB, SOFTWARE_INSTANCE_SAP, SOFTWARE_INSTANCE_WINDOWSSERVICE
   * Note, this is equivalent to the other <code>softwareInstanceQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceQueryResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstance/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceQueryResponse softwareInstanceQuery(SoftwareInstanceQueryRequest body, @QueryMap(encoded=true) SoftwareInstanceQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data. Possible values for attribute &#39;Target sub entity&#39; (Alias of the target sub entity which specifies the target entity in detail.) are: #NO_SUBTYPE, SOFTWARE_INSTANCE_ORACLEDB, SOFTWARE_INSTANCE_MSSQLDB, SOFTWARE_INSTANCE_WEB, SOFTWARE_INSTANCE_SAP, SOFTWARE_INSTANCE_WINDOWSSERVICE
  * Note, this is equivalent to the other <code>softwareInstanceQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceQueryResponse
      */
      @RequestLine("POST /api/rest/entity/softwareInstance/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceQueryResponse> softwareInstanceQueryWithHttpInfo(SoftwareInstanceQueryRequest body, @QueryMap(encoded=true) SoftwareInstanceQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceQuery</code> method in a fluent style.
   */
  public static class SoftwareInstanceQueryQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceQueryQueryParams sessionId(final String value) {
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
   * @return SoftwareInstanceSoftwareInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstance/{elid}/SoftwareInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceSoftwareInstallationResponseData softwareInstanceSoftwareInstallation(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceSoftwareInstallationRequestData body);

  /**
   * Get relations to Software installation entities
   * Similar to <code>softwareInstanceSoftwareInstallation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstance/{elid}/SoftwareInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceSoftwareInstallationResponseData> softwareInstanceSoftwareInstallationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceSoftwareInstallationRequestData body);


  /**
   * Get relations to Software installation entities
   * 
   * Note, this is equivalent to the other <code>softwareInstanceSoftwareInstallation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceSoftwareInstallationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceSoftwareInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstance/{elid}/SoftwareInstallation?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceSoftwareInstallationResponseData softwareInstanceSoftwareInstallation(@Param("elid") String elid, SoftwareInstanceSoftwareInstallationRequestData body, @QueryMap(encoded=true) SoftwareInstanceSoftwareInstallationQueryParams queryParams);

  /**
  * Get relations to Software installation entities
  * 
  * Note, this is equivalent to the other <code>softwareInstanceSoftwareInstallation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceSoftwareInstallationResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstance/{elid}/SoftwareInstallation?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceSoftwareInstallationResponseData> softwareInstanceSoftwareInstallationWithHttpInfo(@Param("elid") String elid, SoftwareInstanceSoftwareInstallationRequestData body, @QueryMap(encoded=true) SoftwareInstanceSoftwareInstallationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceSoftwareInstallation</code> method in a fluent style.
   */
  public static class SoftwareInstanceSoftwareInstallationQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceSoftwareInstallationQueryParams sessionId(final String value) {
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
   * @return SoftwareInstanceSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstance/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceSystemAttributesResponse softwareInstanceSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>softwareInstanceSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstance/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceSystemAttributesResponse> softwareInstanceSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>softwareInstanceSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstance/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceSystemAttributesResponse softwareInstanceSystemAttributes(@Param("elid") String elid, SoftwareInstanceSystemAttributesRequest body, @QueryMap(encoded=true) SoftwareInstanceSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>softwareInstanceSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/softwareInstance/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceSystemAttributesResponse> softwareInstanceSystemAttributesWithHttpInfo(@Param("elid") String elid, SoftwareInstanceSystemAttributesRequest body, @QueryMap(encoded=true) SoftwareInstanceSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceSystemAttributes</code> method in a fluent style.
   */
  public static class SoftwareInstanceSystemAttributesQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceSystemAttributesQueryParams sessionId(final String value) {
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
   * @return UpdateSoftwareInstanceResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstance/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSoftwareInstanceResponse updateSoftwareInstance(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSoftwareInstanceRequestData body);

  /**
   * Modify
   * Similar to <code>updateSoftwareInstance</code> but it also returns the http response headers .
   * Modify software instance
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstance/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSoftwareInstanceResponse> updateSoftwareInstanceWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSoftwareInstanceRequestData body);


  /**
   * Modify
   * Modify software instance
   * Note, this is equivalent to the other <code>updateSoftwareInstance</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSoftwareInstanceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSoftwareInstanceResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstance/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSoftwareInstanceResponse updateSoftwareInstance(@Param("elid") String elid, UpdateSoftwareInstanceRequestData body, @QueryMap(encoded=true) UpdateSoftwareInstanceQueryParams queryParams);

  /**
  * Modify
  * Modify software instance
  * Note, this is equivalent to the other <code>updateSoftwareInstance</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSoftwareInstanceResponse
      */
      @RequestLine("POST /api/rest/entity/softwareInstance/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSoftwareInstanceResponse> updateSoftwareInstanceWithHttpInfo(@Param("elid") String elid, UpdateSoftwareInstanceRequestData body, @QueryMap(encoded=true) UpdateSoftwareInstanceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSoftwareInstance</code> method in a fluent style.
   */
  public static class UpdateSoftwareInstanceQueryParams extends HashMap<String, Object> {
    public UpdateSoftwareInstanceQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesSoftwareInstanceResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstance/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesSoftwareInstanceResponse updateSystemAttributesSoftwareInstance(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesSoftwareInstanceRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesSoftwareInstance</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstance/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesSoftwareInstanceResponse> updateSystemAttributesSoftwareInstanceWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesSoftwareInstanceRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesSoftwareInstance</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesSoftwareInstanceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesSoftwareInstanceResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstance/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesSoftwareInstanceResponse updateSystemAttributesSoftwareInstance(@Param("elid") String elid, UpdateSystemAttributesSoftwareInstanceRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesSoftwareInstanceQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesSoftwareInstance</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesSoftwareInstanceResponse
      */
      @RequestLine("POST /api/rest/entity/softwareInstance/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesSoftwareInstanceResponse> updateSystemAttributesSoftwareInstanceWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesSoftwareInstanceRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesSoftwareInstanceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesSoftwareInstance</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesSoftwareInstanceQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesSoftwareInstanceQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
