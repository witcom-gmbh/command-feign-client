package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.ContractAssignmentsRequest;
import com.fntsoftware.businessgateway.entities.ContractAssignmentsResponse;
import com.fntsoftware.businessgateway.entities.ContractBuildingsRequestData;
import com.fntsoftware.businessgateway.entities.ContractBuildingsResponseData;
import com.fntsoftware.businessgateway.entities.ContractCampusesRequestData;
import com.fntsoftware.businessgateway.entities.ContractCampusesResponseData;
import com.fntsoftware.businessgateway.entities.ContractChassisRequestData;
import com.fntsoftware.businessgateway.entities.ContractChassisResponseData;
import com.fntsoftware.businessgateway.entities.ContractCustomIpaccessSvcRequestData;
import com.fntsoftware.businessgateway.entities.ContractCustomIpaccessSvcResponseData;
import com.fntsoftware.businessgateway.entities.ContractFloorsRequestData;
import com.fntsoftware.businessgateway.entities.ContractFloorsResponseData;
import com.fntsoftware.businessgateway.entities.ContractFrameContractRequestData;
import com.fntsoftware.businessgateway.entities.ContractFrameContractResponseData;
import com.fntsoftware.businessgateway.entities.ContractOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.ContractOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.ContractPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.ContractPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.ContractPersonsRequestData;
import com.fntsoftware.businessgateway.entities.ContractPersonsResponseData;
import com.fntsoftware.businessgateway.entities.ContractQueryRequest;
import com.fntsoftware.businessgateway.entities.ContractQueryResponse;
import com.fntsoftware.businessgateway.entities.ContractQueryScrollFirstRequest;
import com.fntsoftware.businessgateway.entities.ContractQueryScrollFirstResponse;
import com.fntsoftware.businessgateway.entities.ContractQueryScrollMoreRequest;
import com.fntsoftware.businessgateway.entities.ContractQueryScrollMoreResponse;
import com.fntsoftware.businessgateway.entities.ContractRoomsRequestData;
import com.fntsoftware.businessgateway.entities.ContractRoomsResponseData;
import com.fntsoftware.businessgateway.entities.ContractSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.ContractSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.ContractTerminalsRequestData;
import com.fntsoftware.businessgateway.entities.ContractTerminalsResponseData;
import com.fntsoftware.businessgateway.entities.ContractTopzonesRequestData;
import com.fntsoftware.businessgateway.entities.ContractTopzonesResponseData;
import com.fntsoftware.businessgateway.entities.CreateContractRequestData;
import com.fntsoftware.businessgateway.entities.CreateContractResponse;
import com.fntsoftware.businessgateway.entities.DeleteContractRequestData;
import com.fntsoftware.businessgateway.entities.DeleteContractResponse;
import com.fntsoftware.businessgateway.entities.ReassignAllAssignmentsContractRequestData;
import com.fntsoftware.businessgateway.entities.ReassignAllAssignmentsContractResponse;
import com.fntsoftware.businessgateway.entities.ReassignAssignmentsPartiallyContractRequestData;
import com.fntsoftware.businessgateway.entities.ReassignAssignmentsPartiallyContractResponse;
import com.fntsoftware.businessgateway.entities.UpdateContractRequestData;
import com.fntsoftware.businessgateway.entities.UpdateContractResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesContractRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesContractResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface ContractApi extends ApiClient.Api {


  /**
   * Query Assignments
   * Query of the Assignments
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ContractAssignmentsResponse
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/Assignments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ContractAssignmentsResponse contractAssignments(@Param("sessionId") String sessionId, @Param("elid") String elid, ContractAssignmentsRequest body);

  /**
   * Query Assignments
   * Similar to <code>contractAssignments</code> but it also returns the http response headers .
   * Query of the Assignments
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/Assignments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ContractAssignmentsResponse> contractAssignmentsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ContractAssignmentsRequest body);


  /**
   * Query Assignments
   * Query of the Assignments
   * Note, this is equivalent to the other <code>contractAssignments</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ContractAssignmentsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ContractAssignmentsResponse
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/Assignments?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ContractAssignmentsResponse contractAssignments(@Param("elid") String elid, ContractAssignmentsRequest body, @QueryMap(encoded=true) ContractAssignmentsQueryParams queryParams);

  /**
  * Query Assignments
  * Query of the Assignments
  * Note, this is equivalent to the other <code>contractAssignments</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ContractAssignmentsResponse
      */
      @RequestLine("POST /api/rest/entity/contract/{elid}/Assignments?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ContractAssignmentsResponse> contractAssignmentsWithHttpInfo(@Param("elid") String elid, ContractAssignmentsRequest body, @QueryMap(encoded=true) ContractAssignmentsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>contractAssignments</code> method in a fluent style.
   */
  public static class ContractAssignmentsQueryParams extends HashMap<String, Object> {
    public ContractAssignmentsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Building entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ContractBuildingsResponseData
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/Buildings?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ContractBuildingsResponseData contractBuildings(@Param("sessionId") String sessionId, @Param("elid") String elid, ContractBuildingsRequestData body);

  /**
   * Get relations to Building entities
   * Similar to <code>contractBuildings</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/Buildings?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ContractBuildingsResponseData> contractBuildingsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ContractBuildingsRequestData body);


  /**
   * Get relations to Building entities
   * 
   * Note, this is equivalent to the other <code>contractBuildings</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ContractBuildingsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ContractBuildingsResponseData
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/Buildings?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ContractBuildingsResponseData contractBuildings(@Param("elid") String elid, ContractBuildingsRequestData body, @QueryMap(encoded=true) ContractBuildingsQueryParams queryParams);

  /**
  * Get relations to Building entities
  * 
  * Note, this is equivalent to the other <code>contractBuildings</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ContractBuildingsResponseData
      */
      @RequestLine("POST /api/rest/entity/contract/{elid}/Buildings?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ContractBuildingsResponseData> contractBuildingsWithHttpInfo(@Param("elid") String elid, ContractBuildingsRequestData body, @QueryMap(encoded=true) ContractBuildingsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>contractBuildings</code> method in a fluent style.
   */
  public static class ContractBuildingsQueryParams extends HashMap<String, Object> {
    public ContractBuildingsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Campus entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ContractCampusesResponseData
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/Campuses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ContractCampusesResponseData contractCampuses(@Param("sessionId") String sessionId, @Param("elid") String elid, ContractCampusesRequestData body);

  /**
   * Get relations to Campus entities
   * Similar to <code>contractCampuses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/Campuses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ContractCampusesResponseData> contractCampusesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ContractCampusesRequestData body);


  /**
   * Get relations to Campus entities
   * 
   * Note, this is equivalent to the other <code>contractCampuses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ContractCampusesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ContractCampusesResponseData
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/Campuses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ContractCampusesResponseData contractCampuses(@Param("elid") String elid, ContractCampusesRequestData body, @QueryMap(encoded=true) ContractCampusesQueryParams queryParams);

  /**
  * Get relations to Campus entities
  * 
  * Note, this is equivalent to the other <code>contractCampuses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ContractCampusesResponseData
      */
      @RequestLine("POST /api/rest/entity/contract/{elid}/Campuses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ContractCampusesResponseData> contractCampusesWithHttpInfo(@Param("elid") String elid, ContractCampusesRequestData body, @QueryMap(encoded=true) ContractCampusesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>contractCampuses</code> method in a fluent style.
   */
  public static class ContractCampusesQueryParams extends HashMap<String, Object> {
    public ContractCampusesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Chassis entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ContractChassisResponseData
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/Chassis?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ContractChassisResponseData contractChassis(@Param("sessionId") String sessionId, @Param("elid") String elid, ContractChassisRequestData body);

  /**
   * Get relations to Chassis entities
   * Similar to <code>contractChassis</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/Chassis?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ContractChassisResponseData> contractChassisWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ContractChassisRequestData body);


  /**
   * Get relations to Chassis entities
   * 
   * Note, this is equivalent to the other <code>contractChassis</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ContractChassisQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ContractChassisResponseData
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/Chassis?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ContractChassisResponseData contractChassis(@Param("elid") String elid, ContractChassisRequestData body, @QueryMap(encoded=true) ContractChassisQueryParams queryParams);

  /**
  * Get relations to Chassis entities
  * 
  * Note, this is equivalent to the other <code>contractChassis</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ContractChassisResponseData
      */
      @RequestLine("POST /api/rest/entity/contract/{elid}/Chassis?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ContractChassisResponseData> contractChassisWithHttpInfo(@Param("elid") String elid, ContractChassisRequestData body, @QueryMap(encoded=true) ContractChassisQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>contractChassis</code> method in a fluent style.
   */
  public static class ContractChassisQueryParams extends HashMap<String, Object> {
    public ContractChassisQueryParams sessionId(final String value) {
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
   * @return ContractCustomIpaccessSvcResponseData
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/CustomIpaccessSvc?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ContractCustomIpaccessSvcResponseData contractCustomIpaccessSvc(@Param("sessionId") String sessionId, @Param("elid") String elid, ContractCustomIpaccessSvcRequestData body);

  /**
   * Get relations to IP-Access Service entities
   * Similar to <code>contractCustomIpaccessSvc</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/CustomIpaccessSvc?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ContractCustomIpaccessSvcResponseData> contractCustomIpaccessSvcWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ContractCustomIpaccessSvcRequestData body);


  /**
   * Get relations to IP-Access Service entities
   * 
   * Note, this is equivalent to the other <code>contractCustomIpaccessSvc</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ContractCustomIpaccessSvcQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ContractCustomIpaccessSvcResponseData
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/CustomIpaccessSvc?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ContractCustomIpaccessSvcResponseData contractCustomIpaccessSvc(@Param("elid") String elid, ContractCustomIpaccessSvcRequestData body, @QueryMap(encoded=true) ContractCustomIpaccessSvcQueryParams queryParams);

  /**
  * Get relations to IP-Access Service entities
  * 
  * Note, this is equivalent to the other <code>contractCustomIpaccessSvc</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ContractCustomIpaccessSvcResponseData
      */
      @RequestLine("POST /api/rest/entity/contract/{elid}/CustomIpaccessSvc?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ContractCustomIpaccessSvcResponseData> contractCustomIpaccessSvcWithHttpInfo(@Param("elid") String elid, ContractCustomIpaccessSvcRequestData body, @QueryMap(encoded=true) ContractCustomIpaccessSvcQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>contractCustomIpaccessSvc</code> method in a fluent style.
   */
  public static class ContractCustomIpaccessSvcQueryParams extends HashMap<String, Object> {
    public ContractCustomIpaccessSvcQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Floor entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ContractFloorsResponseData
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/Floors?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ContractFloorsResponseData contractFloors(@Param("sessionId") String sessionId, @Param("elid") String elid, ContractFloorsRequestData body);

  /**
   * Get relations to Floor entities
   * Similar to <code>contractFloors</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/Floors?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ContractFloorsResponseData> contractFloorsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ContractFloorsRequestData body);


  /**
   * Get relations to Floor entities
   * 
   * Note, this is equivalent to the other <code>contractFloors</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ContractFloorsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ContractFloorsResponseData
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/Floors?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ContractFloorsResponseData contractFloors(@Param("elid") String elid, ContractFloorsRequestData body, @QueryMap(encoded=true) ContractFloorsQueryParams queryParams);

  /**
  * Get relations to Floor entities
  * 
  * Note, this is equivalent to the other <code>contractFloors</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ContractFloorsResponseData
      */
      @RequestLine("POST /api/rest/entity/contract/{elid}/Floors?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ContractFloorsResponseData> contractFloorsWithHttpInfo(@Param("elid") String elid, ContractFloorsRequestData body, @QueryMap(encoded=true) ContractFloorsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>contractFloors</code> method in a fluent style.
   */
  public static class ContractFloorsQueryParams extends HashMap<String, Object> {
    public ContractFloorsQueryParams sessionId(final String value) {
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
   * @return ContractFrameContractResponseData
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/FrameContract?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ContractFrameContractResponseData contractFrameContract(@Param("sessionId") String sessionId, @Param("elid") String elid, ContractFrameContractRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>contractFrameContract</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/FrameContract?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ContractFrameContractResponseData> contractFrameContractWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ContractFrameContractRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>contractFrameContract</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ContractFrameContractQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ContractFrameContractResponseData
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/FrameContract?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ContractFrameContractResponseData contractFrameContract(@Param("elid") String elid, ContractFrameContractRequestData body, @QueryMap(encoded=true) ContractFrameContractQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>contractFrameContract</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ContractFrameContractResponseData
      */
      @RequestLine("POST /api/rest/entity/contract/{elid}/FrameContract?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ContractFrameContractResponseData> contractFrameContractWithHttpInfo(@Param("elid") String elid, ContractFrameContractRequestData body, @QueryMap(encoded=true) ContractFrameContractQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>contractFrameContract</code> method in a fluent style.
   */
  public static class ContractFrameContractQueryParams extends HashMap<String, Object> {
    public ContractFrameContractQueryParams sessionId(final String value) {
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
   * @return ContractOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ContractOrganizationsResponseData contractOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, ContractOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>contractOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ContractOrganizationsResponseData> contractOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ContractOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>contractOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ContractOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ContractOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ContractOrganizationsResponseData contractOrganizations(@Param("elid") String elid, ContractOrganizationsRequestData body, @QueryMap(encoded=true) ContractOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>contractOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ContractOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/contract/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ContractOrganizationsResponseData> contractOrganizationsWithHttpInfo(@Param("elid") String elid, ContractOrganizationsRequestData body, @QueryMap(encoded=true) ContractOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>contractOrganizations</code> method in a fluent style.
   */
  public static class ContractOrganizationsQueryParams extends HashMap<String, Object> {
    public ContractOrganizationsQueryParams sessionId(final String value) {
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
   * @return ContractPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ContractPersonGroupsResponseData contractPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, ContractPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>contractPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ContractPersonGroupsResponseData> contractPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ContractPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>contractPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ContractPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ContractPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ContractPersonGroupsResponseData contractPersonGroups(@Param("elid") String elid, ContractPersonGroupsRequestData body, @QueryMap(encoded=true) ContractPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>contractPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ContractPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/contract/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ContractPersonGroupsResponseData> contractPersonGroupsWithHttpInfo(@Param("elid") String elid, ContractPersonGroupsRequestData body, @QueryMap(encoded=true) ContractPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>contractPersonGroups</code> method in a fluent style.
   */
  public static class ContractPersonGroupsQueryParams extends HashMap<String, Object> {
    public ContractPersonGroupsQueryParams sessionId(final String value) {
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
   * @return ContractPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ContractPersonsResponseData contractPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, ContractPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>contractPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ContractPersonsResponseData> contractPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ContractPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>contractPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ContractPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ContractPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ContractPersonsResponseData contractPersons(@Param("elid") String elid, ContractPersonsRequestData body, @QueryMap(encoded=true) ContractPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>contractPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ContractPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/contract/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ContractPersonsResponseData> contractPersonsWithHttpInfo(@Param("elid") String elid, ContractPersonsRequestData body, @QueryMap(encoded=true) ContractPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>contractPersons</code> method in a fluent style.
   */
  public static class ContractPersonsQueryParams extends HashMap<String, Object> {
    public ContractPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ContractQueryResponse
   */
  @RequestLine("POST /api/rest/entity/contract/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ContractQueryResponse contractQuery(@Param("sessionId") String sessionId, ContractQueryRequest body);

  /**
   * Basic query
   * Similar to <code>contractQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/contract/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ContractQueryResponse> contractQueryWithHttpInfo(@Param("sessionId") String sessionId, ContractQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>contractQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ContractQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ContractQueryResponse
   */
  @RequestLine("POST /api/rest/entity/contract/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ContractQueryResponse contractQuery(ContractQueryRequest body, @QueryMap(encoded=true) ContractQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>contractQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ContractQueryResponse
      */
      @RequestLine("POST /api/rest/entity/contract/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ContractQueryResponse> contractQueryWithHttpInfo(ContractQueryRequest body, @QueryMap(encoded=true) ContractQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>contractQuery</code> method in a fluent style.
   */
  public static class ContractQueryQueryParams extends HashMap<String, Object> {
    public ContractQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query scroll first
   * Query for fetching all basic target entity data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ContractQueryScrollFirstResponse
   */
  @RequestLine("POST /api/rest/entity/contract/queryScrollFirst?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ContractQueryScrollFirstResponse contractQueryScrollFirst(@Param("sessionId") String sessionId, ContractQueryScrollFirstRequest body);

  /**
   * Basic query scroll first
   * Similar to <code>contractQueryScrollFirst</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/contract/queryScrollFirst?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ContractQueryScrollFirstResponse> contractQueryScrollFirstWithHttpInfo(@Param("sessionId") String sessionId, ContractQueryScrollFirstRequest body);


  /**
   * Basic query scroll first
   * Query for fetching all basic target entity data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * Note, this is equivalent to the other <code>contractQueryScrollFirst</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ContractQueryScrollFirstQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ContractQueryScrollFirstResponse
   */
  @RequestLine("POST /api/rest/entity/contract/queryScrollFirst?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ContractQueryScrollFirstResponse contractQueryScrollFirst(ContractQueryScrollFirstRequest body, @QueryMap(encoded=true) ContractQueryScrollFirstQueryParams queryParams);

  /**
  * Basic query scroll first
  * Query for fetching all basic target entity data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
  * Note, this is equivalent to the other <code>contractQueryScrollFirst</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ContractQueryScrollFirstResponse
      */
      @RequestLine("POST /api/rest/entity/contract/queryScrollFirst?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ContractQueryScrollFirstResponse> contractQueryScrollFirstWithHttpInfo(ContractQueryScrollFirstRequest body, @QueryMap(encoded=true) ContractQueryScrollFirstQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>contractQueryScrollFirst</code> method in a fluent style.
   */
  public static class ContractQueryScrollFirstQueryParams extends HashMap<String, Object> {
    public ContractQueryScrollFirstQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query scroll more
   * Query for fetching all basic target entity data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ContractQueryScrollMoreResponse
   */
  @RequestLine("POST /api/rest/entity/contract/queryScrollMore?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ContractQueryScrollMoreResponse contractQueryScrollMore(@Param("sessionId") String sessionId, ContractQueryScrollMoreRequest body);

  /**
   * Basic query scroll more
   * Similar to <code>contractQueryScrollMore</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/contract/queryScrollMore?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ContractQueryScrollMoreResponse> contractQueryScrollMoreWithHttpInfo(@Param("sessionId") String sessionId, ContractQueryScrollMoreRequest body);


  /**
   * Basic query scroll more
   * Query for fetching all basic target entity data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * Note, this is equivalent to the other <code>contractQueryScrollMore</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ContractQueryScrollMoreQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ContractQueryScrollMoreResponse
   */
  @RequestLine("POST /api/rest/entity/contract/queryScrollMore?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ContractQueryScrollMoreResponse contractQueryScrollMore(ContractQueryScrollMoreRequest body, @QueryMap(encoded=true) ContractQueryScrollMoreQueryParams queryParams);

  /**
  * Basic query scroll more
  * Query for fetching all basic target entity data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
  * Note, this is equivalent to the other <code>contractQueryScrollMore</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ContractQueryScrollMoreResponse
      */
      @RequestLine("POST /api/rest/entity/contract/queryScrollMore?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ContractQueryScrollMoreResponse> contractQueryScrollMoreWithHttpInfo(ContractQueryScrollMoreRequest body, @QueryMap(encoded=true) ContractQueryScrollMoreQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>contractQueryScrollMore</code> method in a fluent style.
   */
  public static class ContractQueryScrollMoreQueryParams extends HashMap<String, Object> {
    public ContractQueryScrollMoreQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Room entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ContractRoomsResponseData
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/Rooms?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ContractRoomsResponseData contractRooms(@Param("sessionId") String sessionId, @Param("elid") String elid, ContractRoomsRequestData body);

  /**
   * Get relations to Room entities
   * Similar to <code>contractRooms</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/Rooms?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ContractRoomsResponseData> contractRoomsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ContractRoomsRequestData body);


  /**
   * Get relations to Room entities
   * 
   * Note, this is equivalent to the other <code>contractRooms</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ContractRoomsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ContractRoomsResponseData
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/Rooms?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ContractRoomsResponseData contractRooms(@Param("elid") String elid, ContractRoomsRequestData body, @QueryMap(encoded=true) ContractRoomsQueryParams queryParams);

  /**
  * Get relations to Room entities
  * 
  * Note, this is equivalent to the other <code>contractRooms</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ContractRoomsResponseData
      */
      @RequestLine("POST /api/rest/entity/contract/{elid}/Rooms?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ContractRoomsResponseData> contractRoomsWithHttpInfo(@Param("elid") String elid, ContractRoomsRequestData body, @QueryMap(encoded=true) ContractRoomsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>contractRooms</code> method in a fluent style.
   */
  public static class ContractRoomsQueryParams extends HashMap<String, Object> {
    public ContractRoomsQueryParams sessionId(final String value) {
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
   * @return ContractSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ContractSystemAttributesResponse contractSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, ContractSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>contractSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ContractSystemAttributesResponse> contractSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ContractSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>contractSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ContractSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ContractSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ContractSystemAttributesResponse contractSystemAttributes(@Param("elid") String elid, ContractSystemAttributesRequest body, @QueryMap(encoded=true) ContractSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>contractSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ContractSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/contract/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ContractSystemAttributesResponse> contractSystemAttributesWithHttpInfo(@Param("elid") String elid, ContractSystemAttributesRequest body, @QueryMap(encoded=true) ContractSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>contractSystemAttributes</code> method in a fluent style.
   */
  public static class ContractSystemAttributesQueryParams extends HashMap<String, Object> {
    public ContractSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Terminal entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ContractTerminalsResponseData
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/Terminals?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ContractTerminalsResponseData contractTerminals(@Param("sessionId") String sessionId, @Param("elid") String elid, ContractTerminalsRequestData body);

  /**
   * Get relations to Terminal entities
   * Similar to <code>contractTerminals</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/Terminals?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ContractTerminalsResponseData> contractTerminalsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ContractTerminalsRequestData body);


  /**
   * Get relations to Terminal entities
   * 
   * Note, this is equivalent to the other <code>contractTerminals</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ContractTerminalsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ContractTerminalsResponseData
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/Terminals?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ContractTerminalsResponseData contractTerminals(@Param("elid") String elid, ContractTerminalsRequestData body, @QueryMap(encoded=true) ContractTerminalsQueryParams queryParams);

  /**
  * Get relations to Terminal entities
  * 
  * Note, this is equivalent to the other <code>contractTerminals</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ContractTerminalsResponseData
      */
      @RequestLine("POST /api/rest/entity/contract/{elid}/Terminals?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ContractTerminalsResponseData> contractTerminalsWithHttpInfo(@Param("elid") String elid, ContractTerminalsRequestData body, @QueryMap(encoded=true) ContractTerminalsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>contractTerminals</code> method in a fluent style.
   */
  public static class ContractTerminalsQueryParams extends HashMap<String, Object> {
    public ContractTerminalsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Topzone entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ContractTopzonesResponseData
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/Topzones?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ContractTopzonesResponseData contractTopzones(@Param("sessionId") String sessionId, @Param("elid") String elid, ContractTopzonesRequestData body);

  /**
   * Get relations to Topzone entities
   * Similar to <code>contractTopzones</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/Topzones?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ContractTopzonesResponseData> contractTopzonesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ContractTopzonesRequestData body);


  /**
   * Get relations to Topzone entities
   * 
   * Note, this is equivalent to the other <code>contractTopzones</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ContractTopzonesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ContractTopzonesResponseData
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/Topzones?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ContractTopzonesResponseData contractTopzones(@Param("elid") String elid, ContractTopzonesRequestData body, @QueryMap(encoded=true) ContractTopzonesQueryParams queryParams);

  /**
  * Get relations to Topzone entities
  * 
  * Note, this is equivalent to the other <code>contractTopzones</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ContractTopzonesResponseData
      */
      @RequestLine("POST /api/rest/entity/contract/{elid}/Topzones?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ContractTopzonesResponseData> contractTopzonesWithHttpInfo(@Param("elid") String elid, ContractTopzonesRequestData body, @QueryMap(encoded=true) ContractTopzonesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>contractTopzones</code> method in a fluent style.
   */
  public static class ContractTopzonesQueryParams extends HashMap<String, Object> {
    public ContractTopzonesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create
   * Create contract / maintenance contract
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateContractResponse
   */
  @RequestLine("POST /api/rest/entity/contract/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateContractResponse createContract(@Param("sessionId") String sessionId, CreateContractRequestData body);

  /**
   * Create
   * Similar to <code>createContract</code> but it also returns the http response headers .
   * Create contract / maintenance contract
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/contract/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateContractResponse> createContractWithHttpInfo(@Param("sessionId") String sessionId, CreateContractRequestData body);


  /**
   * Create
   * Create contract / maintenance contract
   * Note, this is equivalent to the other <code>createContract</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateContractQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateContractResponse
   */
  @RequestLine("POST /api/rest/entity/contract/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateContractResponse createContract(CreateContractRequestData body, @QueryMap(encoded=true) CreateContractQueryParams queryParams);

  /**
  * Create
  * Create contract / maintenance contract
  * Note, this is equivalent to the other <code>createContract</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateContractResponse
      */
      @RequestLine("POST /api/rest/entity/contract/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateContractResponse> createContractWithHttpInfo(CreateContractRequestData body, @QueryMap(encoded=true) CreateContractQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createContract</code> method in a fluent style.
   */
  public static class CreateContractQueryParams extends HashMap<String, Object> {
    public CreateContractQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete contract / maintenance contract
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteContractResponse
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteContractResponse deleteContract(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteContractRequestData body);

  /**
   * Delete
   * Similar to <code>deleteContract</code> but it also returns the http response headers .
   * Delete contract / maintenance contract
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteContractResponse> deleteContractWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteContractRequestData body);


  /**
   * Delete
   * Delete contract / maintenance contract
   * Note, this is equivalent to the other <code>deleteContract</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteContractQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteContractResponse
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteContractResponse deleteContract(@Param("elid") String elid, DeleteContractRequestData body, @QueryMap(encoded=true) DeleteContractQueryParams queryParams);

  /**
  * Delete
  * Delete contract / maintenance contract
  * Note, this is equivalent to the other <code>deleteContract</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteContractResponse
      */
      @RequestLine("POST /api/rest/entity/contract/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteContractResponse> deleteContractWithHttpInfo(@Param("elid") String elid, DeleteContractRequestData body, @QueryMap(encoded=true) DeleteContractQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteContract</code> method in a fluent style.
   */
  public static class DeleteContractQueryParams extends HashMap<String, Object> {
    public DeleteContractQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Reassign all assignments
   * Reassign all assignments
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ReassignAllAssignmentsContractResponse
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/reassignAllAssignments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ReassignAllAssignmentsContractResponse reassignAllAssignmentsContract(@Param("sessionId") String sessionId, @Param("elid") String elid, ReassignAllAssignmentsContractRequestData body);

  /**
   * Reassign all assignments
   * Similar to <code>reassignAllAssignmentsContract</code> but it also returns the http response headers .
   * Reassign all assignments
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/reassignAllAssignments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ReassignAllAssignmentsContractResponse> reassignAllAssignmentsContractWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ReassignAllAssignmentsContractRequestData body);


  /**
   * Reassign all assignments
   * Reassign all assignments
   * Note, this is equivalent to the other <code>reassignAllAssignmentsContract</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ReassignAllAssignmentsContractQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ReassignAllAssignmentsContractResponse
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/reassignAllAssignments?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ReassignAllAssignmentsContractResponse reassignAllAssignmentsContract(@Param("elid") String elid, ReassignAllAssignmentsContractRequestData body, @QueryMap(encoded=true) ReassignAllAssignmentsContractQueryParams queryParams);

  /**
  * Reassign all assignments
  * Reassign all assignments
  * Note, this is equivalent to the other <code>reassignAllAssignmentsContract</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ReassignAllAssignmentsContractResponse
      */
      @RequestLine("POST /api/rest/entity/contract/{elid}/reassignAllAssignments?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ReassignAllAssignmentsContractResponse> reassignAllAssignmentsContractWithHttpInfo(@Param("elid") String elid, ReassignAllAssignmentsContractRequestData body, @QueryMap(encoded=true) ReassignAllAssignmentsContractQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>reassignAllAssignmentsContract</code> method in a fluent style.
   */
  public static class ReassignAllAssignmentsContractQueryParams extends HashMap<String, Object> {
    public ReassignAllAssignmentsContractQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Reassign assignments partially
   * Reassign assignments partially
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ReassignAssignmentsPartiallyContractResponse
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/reassignAssignmentsPartially?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ReassignAssignmentsPartiallyContractResponse reassignAssignmentsPartiallyContract(@Param("sessionId") String sessionId, @Param("elid") String elid, ReassignAssignmentsPartiallyContractRequestData body);

  /**
   * Reassign assignments partially
   * Similar to <code>reassignAssignmentsPartiallyContract</code> but it also returns the http response headers .
   * Reassign assignments partially
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/reassignAssignmentsPartially?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ReassignAssignmentsPartiallyContractResponse> reassignAssignmentsPartiallyContractWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ReassignAssignmentsPartiallyContractRequestData body);


  /**
   * Reassign assignments partially
   * Reassign assignments partially
   * Note, this is equivalent to the other <code>reassignAssignmentsPartiallyContract</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ReassignAssignmentsPartiallyContractQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ReassignAssignmentsPartiallyContractResponse
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/reassignAssignmentsPartially?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ReassignAssignmentsPartiallyContractResponse reassignAssignmentsPartiallyContract(@Param("elid") String elid, ReassignAssignmentsPartiallyContractRequestData body, @QueryMap(encoded=true) ReassignAssignmentsPartiallyContractQueryParams queryParams);

  /**
  * Reassign assignments partially
  * Reassign assignments partially
  * Note, this is equivalent to the other <code>reassignAssignmentsPartiallyContract</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ReassignAssignmentsPartiallyContractResponse
      */
      @RequestLine("POST /api/rest/entity/contract/{elid}/reassignAssignmentsPartially?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ReassignAssignmentsPartiallyContractResponse> reassignAssignmentsPartiallyContractWithHttpInfo(@Param("elid") String elid, ReassignAssignmentsPartiallyContractRequestData body, @QueryMap(encoded=true) ReassignAssignmentsPartiallyContractQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>reassignAssignmentsPartiallyContract</code> method in a fluent style.
   */
  public static class ReassignAssignmentsPartiallyContractQueryParams extends HashMap<String, Object> {
    public ReassignAssignmentsPartiallyContractQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify contract / maintenance contract
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateContractResponse
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateContractResponse updateContract(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateContractRequestData body);

  /**
   * Modify
   * Similar to <code>updateContract</code> but it also returns the http response headers .
   * Modify contract / maintenance contract
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateContractResponse> updateContractWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateContractRequestData body);


  /**
   * Modify
   * Modify contract / maintenance contract
   * Note, this is equivalent to the other <code>updateContract</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateContractQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateContractResponse
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateContractResponse updateContract(@Param("elid") String elid, UpdateContractRequestData body, @QueryMap(encoded=true) UpdateContractQueryParams queryParams);

  /**
  * Modify
  * Modify contract / maintenance contract
  * Note, this is equivalent to the other <code>updateContract</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateContractResponse
      */
      @RequestLine("POST /api/rest/entity/contract/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateContractResponse> updateContractWithHttpInfo(@Param("elid") String elid, UpdateContractRequestData body, @QueryMap(encoded=true) UpdateContractQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateContract</code> method in a fluent style.
   */
  public static class UpdateContractQueryParams extends HashMap<String, Object> {
    public UpdateContractQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesContractResponse
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesContractResponse updateSystemAttributesContract(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesContractRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesContract</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesContractResponse> updateSystemAttributesContractWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesContractRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesContract</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesContractQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesContractResponse
   */
  @RequestLine("POST /api/rest/entity/contract/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesContractResponse updateSystemAttributesContract(@Param("elid") String elid, UpdateSystemAttributesContractRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesContractQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesContract</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesContractResponse
      */
      @RequestLine("POST /api/rest/entity/contract/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesContractResponse> updateSystemAttributesContractWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesContractRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesContractQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesContract</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesContractQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesContractQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
