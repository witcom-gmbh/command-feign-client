package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.AntennaContractsRequestData;
import com.fntsoftware.businessgateway.entities.AntennaContractsResponseData;
import com.fntsoftware.businessgateway.entities.AntennaDeviceMasterRequestData;
import com.fntsoftware.businessgateway.entities.AntennaDeviceMasterResponseData;
import com.fntsoftware.businessgateway.entities.AntennaDuctDataRequest;
import com.fntsoftware.businessgateway.entities.AntennaDuctDataResponse;
import com.fntsoftware.businessgateway.entities.AntennaDuctsRequestData;
import com.fntsoftware.businessgateway.entities.AntennaDuctsResponseData;
import com.fntsoftware.businessgateway.entities.AntennaFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.AntennaFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.AntennaInheritedGeoCoordinatesRequest;
import com.fntsoftware.businessgateway.entities.AntennaInheritedGeoCoordinatesResponse;
import com.fntsoftware.businessgateway.entities.AntennaInstalledSubCardsRecursiveRequest;
import com.fntsoftware.businessgateway.entities.AntennaInstalledSubCardsRecursiveResponse;
import com.fntsoftware.businessgateway.entities.AntennaInstalledSubCardsRequest;
import com.fntsoftware.businessgateway.entities.AntennaInstalledSubCardsResponse;
import com.fntsoftware.businessgateway.entities.AntennaInterfacesRequestData;
import com.fntsoftware.businessgateway.entities.AntennaInterfacesResponseData;
import com.fntsoftware.businessgateway.entities.AntennaIpAddressesRequest;
import com.fntsoftware.businessgateway.entities.AntennaIpAddressesResponse;
import com.fntsoftware.businessgateway.entities.AntennaIpv4AddressesRequestData;
import com.fntsoftware.businessgateway.entities.AntennaIpv4AddressesResponseData;
import com.fntsoftware.businessgateway.entities.AntennaIpv4NetrangesRequestData;
import com.fntsoftware.businessgateway.entities.AntennaIpv4NetrangesResponseData;
import com.fntsoftware.businessgateway.entities.AntennaIpv4NetworksRequestData;
import com.fntsoftware.businessgateway.entities.AntennaIpv4NetworksResponseData;
import com.fntsoftware.businessgateway.entities.AntennaLocationRequest;
import com.fntsoftware.businessgateway.entities.AntennaLocationResponse;
import com.fntsoftware.businessgateway.entities.AntennaLogicalPortsRequestData;
import com.fntsoftware.businessgateway.entities.AntennaLogicalPortsResponseData;
import com.fntsoftware.businessgateway.entities.AntennaMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.AntennaMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.AntennaMultiDuctsRequestData;
import com.fntsoftware.businessgateway.entities.AntennaMultiDuctsResponseData;
import com.fntsoftware.businessgateway.entities.AntennaNetworksAndNetrangesRequest;
import com.fntsoftware.businessgateway.entities.AntennaNetworksAndNetrangesResponse;
import com.fntsoftware.businessgateway.entities.AntennaOperatingSystemInstallationRequestData;
import com.fntsoftware.businessgateway.entities.AntennaOperatingSystemInstallationResponseData;
import com.fntsoftware.businessgateway.entities.AntennaOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.AntennaOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.AntennaPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.AntennaPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.AntennaPersonsRequestData;
import com.fntsoftware.businessgateway.entities.AntennaPersonsResponseData;
import com.fntsoftware.businessgateway.entities.AntennaPhysicalPortsDataExtendedRequest;
import com.fntsoftware.businessgateway.entities.AntennaPhysicalPortsDataExtendedResponse;
import com.fntsoftware.businessgateway.entities.AntennaPhysicalPortsDataRequestData;
import com.fntsoftware.businessgateway.entities.AntennaPhysicalPortsDataResponseData;
import com.fntsoftware.businessgateway.entities.AntennaPhysicalPortsPowerExtendedRequest;
import com.fntsoftware.businessgateway.entities.AntennaPhysicalPortsPowerExtendedResponse;
import com.fntsoftware.businessgateway.entities.AntennaPhysicalPortsPowerRequestData;
import com.fntsoftware.businessgateway.entities.AntennaPhysicalPortsPowerResponseData;
import com.fntsoftware.businessgateway.entities.AntennaQueryExtendedGeoCoordinatesRequest;
import com.fntsoftware.businessgateway.entities.AntennaQueryExtendedGeoCoordinatesResponse;
import com.fntsoftware.businessgateway.entities.AntennaQueryExtendedRequest;
import com.fntsoftware.businessgateway.entities.AntennaQueryExtendedResponse;
import com.fntsoftware.businessgateway.entities.AntennaQueryExtendedScrollFirstRequest;
import com.fntsoftware.businessgateway.entities.AntennaQueryExtendedScrollFirstResponse;
import com.fntsoftware.businessgateway.entities.AntennaQueryExtendedScrollMoreRequest;
import com.fntsoftware.businessgateway.entities.AntennaQueryExtendedScrollMoreResponse;
import com.fntsoftware.businessgateway.entities.AntennaQueryRequest;
import com.fntsoftware.businessgateway.entities.AntennaQueryResponse;
import com.fntsoftware.businessgateway.entities.AntennaServicesRequest;
import com.fntsoftware.businessgateway.entities.AntennaServicesResponse;
import com.fntsoftware.businessgateway.entities.AntennaSitesRequestData;
import com.fntsoftware.businessgateway.entities.AntennaSitesResponseData;
import com.fntsoftware.businessgateway.entities.AntennaSlotRequestData;
import com.fntsoftware.businessgateway.entities.AntennaSlotResponseData;
import com.fntsoftware.businessgateway.entities.AntennaSwitchCabinetRequestData;
import com.fntsoftware.businessgateway.entities.AntennaSwitchCabinetResponseData;
import com.fntsoftware.businessgateway.entities.AntennaSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.AntennaSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.AntennaVirtualSwitchesRequestData;
import com.fntsoftware.businessgateway.entities.AntennaVirtualSwitchesResponseData;
import com.fntsoftware.businessgateway.entities.AntennaVlansAtSlotRequest;
import com.fntsoftware.businessgateway.entities.AntennaVlansAtSlotResponse;
import com.fntsoftware.businessgateway.entities.AntennaVlansRequest;
import com.fntsoftware.businessgateway.entities.AntennaVlansResponse;
import com.fntsoftware.businessgateway.entities.AntennaWarehouseRequestData;
import com.fntsoftware.businessgateway.entities.AntennaWarehouseResponseData;
import com.fntsoftware.businessgateway.entities.AntennaZoneRequestData;
import com.fntsoftware.businessgateway.entities.AntennaZoneResponseData;
import com.fntsoftware.businessgateway.entities.ChangeTypeAntennaRequestData;
import com.fntsoftware.businessgateway.entities.ChangeTypeAntennaResponse;
import com.fntsoftware.businessgateway.entities.DeleteAntennaRequestData;
import com.fntsoftware.businessgateway.entities.DeleteAntennaResponse;
import com.fntsoftware.businessgateway.entities.MoveToCabinetAntennaRequestData;
import com.fntsoftware.businessgateway.entities.MoveToCabinetAntennaResponse;
import com.fntsoftware.businessgateway.entities.MoveToSlotAntennaRequestData;
import com.fntsoftware.businessgateway.entities.MoveToSlotAntennaResponse;
import com.fntsoftware.businessgateway.entities.MoveToWarehouseAntennaRequestData;
import com.fntsoftware.businessgateway.entities.MoveToWarehouseAntennaResponse;
import com.fntsoftware.businessgateway.entities.MoveToZoneAntennaRequestData;
import com.fntsoftware.businessgateway.entities.MoveToZoneAntennaResponse;
import com.fntsoftware.businessgateway.entities.PlaceInCabinetAntennaRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInCabinetAntennaResponse;
import com.fntsoftware.businessgateway.entities.PlaceInSlotAntennaRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInSlotAntennaResponse;
import com.fntsoftware.businessgateway.entities.PlaceInWarehouseAntennaRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInWarehouseAntennaResponse;
import com.fntsoftware.businessgateway.entities.PlaceInZoneAntennaRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInZoneAntennaResponse;
import com.fntsoftware.businessgateway.entities.ReplaceObjectAntennaRequestData;
import com.fntsoftware.businessgateway.entities.ReplaceObjectAntennaResponse;
import com.fntsoftware.businessgateway.entities.UpdateAntennaRequestData;
import com.fntsoftware.businessgateway.entities.UpdateAntennaResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesAntennaRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesAntennaResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface AntennaApi extends ApiClient.Api {


  /**
   * Get relations to Contract entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return AntennaContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AntennaContractsResponseData antennaContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>antennaContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AntennaContractsResponseData> antennaContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>antennaContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AntennaContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AntennaContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AntennaContractsResponseData antennaContracts(@Param("elid") String elid, AntennaContractsRequestData body, @QueryMap(encoded=true) AntennaContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>antennaContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AntennaContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/antenna/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AntennaContractsResponseData> antennaContractsWithHttpInfo(@Param("elid") String elid, AntennaContractsRequestData body, @QueryMap(encoded=true) AntennaContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>antennaContracts</code> method in a fluent style.
   */
  public static class AntennaContractsQueryParams extends HashMap<String, Object> {
    public AntennaContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Device master entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return AntennaDeviceMasterResponseData
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AntennaDeviceMasterResponseData antennaDeviceMaster(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaDeviceMasterRequestData body);

  /**
   * Get relations to Device master entities
   * Similar to <code>antennaDeviceMaster</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AntennaDeviceMasterResponseData> antennaDeviceMasterWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaDeviceMasterRequestData body);


  /**
   * Get relations to Device master entities
   * 
   * Note, this is equivalent to the other <code>antennaDeviceMaster</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AntennaDeviceMasterQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AntennaDeviceMasterResponseData
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AntennaDeviceMasterResponseData antennaDeviceMaster(@Param("elid") String elid, AntennaDeviceMasterRequestData body, @QueryMap(encoded=true) AntennaDeviceMasterQueryParams queryParams);

  /**
  * Get relations to Device master entities
  * 
  * Note, this is equivalent to the other <code>antennaDeviceMaster</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AntennaDeviceMasterResponseData
      */
      @RequestLine("POST /api/rest/entity/antenna/{elid}/DeviceMaster?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AntennaDeviceMasterResponseData> antennaDeviceMasterWithHttpInfo(@Param("elid") String elid, AntennaDeviceMasterRequestData body, @QueryMap(encoded=true) AntennaDeviceMasterQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>antennaDeviceMaster</code> method in a fluent style.
   */
  public static class AntennaDeviceMasterQueryParams extends HashMap<String, Object> {
    public AntennaDeviceMasterQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query duct data
   * Query associated ducts and multipipes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return AntennaDuctDataResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/DuctData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AntennaDuctDataResponse antennaDuctData(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaDuctDataRequest body);

  /**
   * Query duct data
   * Similar to <code>antennaDuctData</code> but it also returns the http response headers .
   * Query associated ducts and multipipes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/DuctData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AntennaDuctDataResponse> antennaDuctDataWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaDuctDataRequest body);


  /**
   * Query duct data
   * Query associated ducts and multipipes
   * Note, this is equivalent to the other <code>antennaDuctData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AntennaDuctDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AntennaDuctDataResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/DuctData?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AntennaDuctDataResponse antennaDuctData(@Param("elid") String elid, AntennaDuctDataRequest body, @QueryMap(encoded=true) AntennaDuctDataQueryParams queryParams);

  /**
  * Query duct data
  * Query associated ducts and multipipes
  * Note, this is equivalent to the other <code>antennaDuctData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AntennaDuctDataResponse
      */
      @RequestLine("POST /api/rest/entity/antenna/{elid}/DuctData?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AntennaDuctDataResponse> antennaDuctDataWithHttpInfo(@Param("elid") String elid, AntennaDuctDataRequest body, @QueryMap(encoded=true) AntennaDuctDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>antennaDuctData</code> method in a fluent style.
   */
  public static class AntennaDuctDataQueryParams extends HashMap<String, Object> {
    public AntennaDuctDataQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Duct entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return AntennaDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/Ducts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AntennaDuctsResponseData antennaDucts(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaDuctsRequestData body);

  /**
   * Get relations to Duct entities
   * Similar to <code>antennaDucts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/Ducts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AntennaDuctsResponseData> antennaDuctsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaDuctsRequestData body);


  /**
   * Get relations to Duct entities
   * 
   * Note, this is equivalent to the other <code>antennaDucts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AntennaDuctsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AntennaDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/Ducts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AntennaDuctsResponseData antennaDucts(@Param("elid") String elid, AntennaDuctsRequestData body, @QueryMap(encoded=true) AntennaDuctsQueryParams queryParams);

  /**
  * Get relations to Duct entities
  * 
  * Note, this is equivalent to the other <code>antennaDucts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AntennaDuctsResponseData
      */
      @RequestLine("POST /api/rest/entity/antenna/{elid}/Ducts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AntennaDuctsResponseData> antennaDuctsWithHttpInfo(@Param("elid") String elid, AntennaDuctsRequestData body, @QueryMap(encoded=true) AntennaDuctsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>antennaDucts</code> method in a fluent style.
   */
  public static class AntennaDuctsQueryParams extends HashMap<String, Object> {
    public AntennaDuctsQueryParams sessionId(final String value) {
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
   * @return AntennaFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AntennaFrameContractsResponseData antennaFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>antennaFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AntennaFrameContractsResponseData> antennaFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>antennaFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AntennaFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AntennaFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AntennaFrameContractsResponseData antennaFrameContracts(@Param("elid") String elid, AntennaFrameContractsRequestData body, @QueryMap(encoded=true) AntennaFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>antennaFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AntennaFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/antenna/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AntennaFrameContractsResponseData> antennaFrameContractsWithHttpInfo(@Param("elid") String elid, AntennaFrameContractsRequestData body, @QueryMap(encoded=true) AntennaFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>antennaFrameContracts</code> method in a fluent style.
   */
  public static class AntennaFrameContractsQueryParams extends HashMap<String, Object> {
    public AntennaFrameContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query inherited coordinates
   * Query the own coordinates of an object or inherit them from parents
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return AntennaInheritedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/inheritedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AntennaInheritedGeoCoordinatesResponse antennaInheritedGeoCoordinates(@Param("sessionId") String sessionId, AntennaInheritedGeoCoordinatesRequest body);

  /**
   * Query inherited coordinates
   * Similar to <code>antennaInheritedGeoCoordinates</code> but it also returns the http response headers .
   * Query the own coordinates of an object or inherit them from parents
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/inheritedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AntennaInheritedGeoCoordinatesResponse> antennaInheritedGeoCoordinatesWithHttpInfo(@Param("sessionId") String sessionId, AntennaInheritedGeoCoordinatesRequest body);


  /**
   * Query inherited coordinates
   * Query the own coordinates of an object or inherit them from parents
   * Note, this is equivalent to the other <code>antennaInheritedGeoCoordinates</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AntennaInheritedGeoCoordinatesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AntennaInheritedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/inheritedGeoCoordinates?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AntennaInheritedGeoCoordinatesResponse antennaInheritedGeoCoordinates(AntennaInheritedGeoCoordinatesRequest body, @QueryMap(encoded=true) AntennaInheritedGeoCoordinatesQueryParams queryParams);

  /**
  * Query inherited coordinates
  * Query the own coordinates of an object or inherit them from parents
  * Note, this is equivalent to the other <code>antennaInheritedGeoCoordinates</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AntennaInheritedGeoCoordinatesResponse
      */
      @RequestLine("POST /api/rest/entity/antenna/inheritedGeoCoordinates?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AntennaInheritedGeoCoordinatesResponse> antennaInheritedGeoCoordinatesWithHttpInfo(AntennaInheritedGeoCoordinatesRequest body, @QueryMap(encoded=true) AntennaInheritedGeoCoordinatesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>antennaInheritedGeoCoordinates</code> method in a fluent style.
   */
  public static class AntennaInheritedGeoCoordinatesQueryParams extends HashMap<String, Object> {
    public AntennaInheritedGeoCoordinatesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query installed subcards
   * Queries installed subcards. Only direct subcards will be returned. Free slot positions will not be returned.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return AntennaInstalledSubCardsResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/InstalledSubCards?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AntennaInstalledSubCardsResponse antennaInstalledSubCards(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaInstalledSubCardsRequest body);

  /**
   * Query installed subcards
   * Similar to <code>antennaInstalledSubCards</code> but it also returns the http response headers .
   * Queries installed subcards. Only direct subcards will be returned. Free slot positions will not be returned.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/InstalledSubCards?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AntennaInstalledSubCardsResponse> antennaInstalledSubCardsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaInstalledSubCardsRequest body);


  /**
   * Query installed subcards
   * Queries installed subcards. Only direct subcards will be returned. Free slot positions will not be returned.
   * Note, this is equivalent to the other <code>antennaInstalledSubCards</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AntennaInstalledSubCardsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AntennaInstalledSubCardsResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/InstalledSubCards?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AntennaInstalledSubCardsResponse antennaInstalledSubCards(@Param("elid") String elid, AntennaInstalledSubCardsRequest body, @QueryMap(encoded=true) AntennaInstalledSubCardsQueryParams queryParams);

  /**
  * Query installed subcards
  * Queries installed subcards. Only direct subcards will be returned. Free slot positions will not be returned.
  * Note, this is equivalent to the other <code>antennaInstalledSubCards</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AntennaInstalledSubCardsResponse
      */
      @RequestLine("POST /api/rest/entity/antenna/{elid}/InstalledSubCards?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AntennaInstalledSubCardsResponse> antennaInstalledSubCardsWithHttpInfo(@Param("elid") String elid, AntennaInstalledSubCardsRequest body, @QueryMap(encoded=true) AntennaInstalledSubCardsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>antennaInstalledSubCards</code> method in a fluent style.
   */
  public static class AntennaInstalledSubCardsQueryParams extends HashMap<String, Object> {
    public AntennaInstalledSubCardsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query installed sub-cards recursively
   * Queries installed sub-cards from a device. Free slot positions are not supplied.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return AntennaInstalledSubCardsRecursiveResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/InstalledSubCardsRecursive?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AntennaInstalledSubCardsRecursiveResponse antennaInstalledSubCardsRecursive(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaInstalledSubCardsRecursiveRequest body);

  /**
   * Query installed sub-cards recursively
   * Similar to <code>antennaInstalledSubCardsRecursive</code> but it also returns the http response headers .
   * Queries installed sub-cards from a device. Free slot positions are not supplied.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/InstalledSubCardsRecursive?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AntennaInstalledSubCardsRecursiveResponse> antennaInstalledSubCardsRecursiveWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaInstalledSubCardsRecursiveRequest body);


  /**
   * Query installed sub-cards recursively
   * Queries installed sub-cards from a device. Free slot positions are not supplied.
   * Note, this is equivalent to the other <code>antennaInstalledSubCardsRecursive</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AntennaInstalledSubCardsRecursiveQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AntennaInstalledSubCardsRecursiveResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/InstalledSubCardsRecursive?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AntennaInstalledSubCardsRecursiveResponse antennaInstalledSubCardsRecursive(@Param("elid") String elid, AntennaInstalledSubCardsRecursiveRequest body, @QueryMap(encoded=true) AntennaInstalledSubCardsRecursiveQueryParams queryParams);

  /**
  * Query installed sub-cards recursively
  * Queries installed sub-cards from a device. Free slot positions are not supplied.
  * Note, this is equivalent to the other <code>antennaInstalledSubCardsRecursive</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AntennaInstalledSubCardsRecursiveResponse
      */
      @RequestLine("POST /api/rest/entity/antenna/{elid}/InstalledSubCardsRecursive?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AntennaInstalledSubCardsRecursiveResponse> antennaInstalledSubCardsRecursiveWithHttpInfo(@Param("elid") String elid, AntennaInstalledSubCardsRecursiveRequest body, @QueryMap(encoded=true) AntennaInstalledSubCardsRecursiveQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>antennaInstalledSubCardsRecursive</code> method in a fluent style.
   */
  public static class AntennaInstalledSubCardsRecursiveQueryParams extends HashMap<String, Object> {
    public AntennaInstalledSubCardsRecursiveQueryParams sessionId(final String value) {
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
   * @return AntennaInterfacesResponseData
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AntennaInterfacesResponseData antennaInterfaces(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaInterfacesRequestData body);

  /**
   * Get relations to Interface entities
   * Similar to <code>antennaInterfaces</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AntennaInterfacesResponseData> antennaInterfacesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaInterfacesRequestData body);


  /**
   * Get relations to Interface entities
   * 
   * Note, this is equivalent to the other <code>antennaInterfaces</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AntennaInterfacesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AntennaInterfacesResponseData
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AntennaInterfacesResponseData antennaInterfaces(@Param("elid") String elid, AntennaInterfacesRequestData body, @QueryMap(encoded=true) AntennaInterfacesQueryParams queryParams);

  /**
  * Get relations to Interface entities
  * 
  * Note, this is equivalent to the other <code>antennaInterfaces</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AntennaInterfacesResponseData
      */
      @RequestLine("POST /api/rest/entity/antenna/{elid}/Interfaces?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AntennaInterfacesResponseData> antennaInterfacesWithHttpInfo(@Param("elid") String elid, AntennaInterfacesRequestData body, @QueryMap(encoded=true) AntennaInterfacesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>antennaInterfaces</code> method in a fluent style.
   */
  public static class AntennaInterfacesQueryParams extends HashMap<String, Object> {
    public AntennaInterfacesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * IP addresses
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return AntennaIpAddressesResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AntennaIpAddressesResponse antennaIpAddresses(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaIpAddressesRequest body);

  /**
   * IP addresses
   * Similar to <code>antennaIpAddresses</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AntennaIpAddressesResponse> antennaIpAddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaIpAddressesRequest body);


  /**
   * IP addresses
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>antennaIpAddresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AntennaIpAddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AntennaIpAddressesResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AntennaIpAddressesResponse antennaIpAddresses(@Param("elid") String elid, AntennaIpAddressesRequest body, @QueryMap(encoded=true) AntennaIpAddressesQueryParams queryParams);

  /**
  * IP addresses
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>antennaIpAddresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AntennaIpAddressesResponse
      */
      @RequestLine("POST /api/rest/entity/antenna/{elid}/IpAddresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AntennaIpAddressesResponse> antennaIpAddressesWithHttpInfo(@Param("elid") String elid, AntennaIpAddressesRequest body, @QueryMap(encoded=true) AntennaIpAddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>antennaIpAddresses</code> method in a fluent style.
   */
  public static class AntennaIpAddressesQueryParams extends HashMap<String, Object> {
    public AntennaIpAddressesQueryParams sessionId(final String value) {
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
   * @return AntennaIpv4AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AntennaIpv4AddressesResponseData antennaIpv4Addresses(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaIpv4AddressesRequestData body);

  /**
   * Get relations to IPv4 address entities
   * Similar to <code>antennaIpv4Addresses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AntennaIpv4AddressesResponseData> antennaIpv4AddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaIpv4AddressesRequestData body);


  /**
   * Get relations to IPv4 address entities
   * 
   * Note, this is equivalent to the other <code>antennaIpv4Addresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AntennaIpv4AddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AntennaIpv4AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AntennaIpv4AddressesResponseData antennaIpv4Addresses(@Param("elid") String elid, AntennaIpv4AddressesRequestData body, @QueryMap(encoded=true) AntennaIpv4AddressesQueryParams queryParams);

  /**
  * Get relations to IPv4 address entities
  * 
  * Note, this is equivalent to the other <code>antennaIpv4Addresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AntennaIpv4AddressesResponseData
      */
      @RequestLine("POST /api/rest/entity/antenna/{elid}/Ipv4Addresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AntennaIpv4AddressesResponseData> antennaIpv4AddressesWithHttpInfo(@Param("elid") String elid, AntennaIpv4AddressesRequestData body, @QueryMap(encoded=true) AntennaIpv4AddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>antennaIpv4Addresses</code> method in a fluent style.
   */
  public static class AntennaIpv4AddressesQueryParams extends HashMap<String, Object> {
    public AntennaIpv4AddressesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to IPv4 netrange entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return AntennaIpv4NetrangesResponseData
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AntennaIpv4NetrangesResponseData antennaIpv4Netranges(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaIpv4NetrangesRequestData body);

  /**
   * Get relations to IPv4 netrange entities
   * Similar to <code>antennaIpv4Netranges</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AntennaIpv4NetrangesResponseData> antennaIpv4NetrangesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaIpv4NetrangesRequestData body);


  /**
   * Get relations to IPv4 netrange entities
   * 
   * Note, this is equivalent to the other <code>antennaIpv4Netranges</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AntennaIpv4NetrangesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AntennaIpv4NetrangesResponseData
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AntennaIpv4NetrangesResponseData antennaIpv4Netranges(@Param("elid") String elid, AntennaIpv4NetrangesRequestData body, @QueryMap(encoded=true) AntennaIpv4NetrangesQueryParams queryParams);

  /**
  * Get relations to IPv4 netrange entities
  * 
  * Note, this is equivalent to the other <code>antennaIpv4Netranges</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AntennaIpv4NetrangesResponseData
      */
      @RequestLine("POST /api/rest/entity/antenna/{elid}/Ipv4Netranges?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AntennaIpv4NetrangesResponseData> antennaIpv4NetrangesWithHttpInfo(@Param("elid") String elid, AntennaIpv4NetrangesRequestData body, @QueryMap(encoded=true) AntennaIpv4NetrangesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>antennaIpv4Netranges</code> method in a fluent style.
   */
  public static class AntennaIpv4NetrangesQueryParams extends HashMap<String, Object> {
    public AntennaIpv4NetrangesQueryParams sessionId(final String value) {
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
   * @return AntennaIpv4NetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AntennaIpv4NetworksResponseData antennaIpv4Networks(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaIpv4NetworksRequestData body);

  /**
   * Get relations to IPv4 Network entities
   * Similar to <code>antennaIpv4Networks</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AntennaIpv4NetworksResponseData> antennaIpv4NetworksWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaIpv4NetworksRequestData body);


  /**
   * Get relations to IPv4 Network entities
   * 
   * Note, this is equivalent to the other <code>antennaIpv4Networks</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AntennaIpv4NetworksQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AntennaIpv4NetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AntennaIpv4NetworksResponseData antennaIpv4Networks(@Param("elid") String elid, AntennaIpv4NetworksRequestData body, @QueryMap(encoded=true) AntennaIpv4NetworksQueryParams queryParams);

  /**
  * Get relations to IPv4 Network entities
  * 
  * Note, this is equivalent to the other <code>antennaIpv4Networks</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AntennaIpv4NetworksResponseData
      */
      @RequestLine("POST /api/rest/entity/antenna/{elid}/Ipv4Networks?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AntennaIpv4NetworksResponseData> antennaIpv4NetworksWithHttpInfo(@Param("elid") String elid, AntennaIpv4NetworksRequestData body, @QueryMap(encoded=true) AntennaIpv4NetworksQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>antennaIpv4Networks</code> method in a fluent style.
   */
  public static class AntennaIpv4NetworksQueryParams extends HashMap<String, Object> {
    public AntennaIpv4NetworksQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Location
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return AntennaLocationResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/Location?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AntennaLocationResponse antennaLocation(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaLocationRequest body);

  /**
   * Location
   * Similar to <code>antennaLocation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/Location?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AntennaLocationResponse> antennaLocationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaLocationRequest body);


  /**
   * Location
   * 
   * Note, this is equivalent to the other <code>antennaLocation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AntennaLocationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AntennaLocationResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/Location?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AntennaLocationResponse antennaLocation(@Param("elid") String elid, AntennaLocationRequest body, @QueryMap(encoded=true) AntennaLocationQueryParams queryParams);

  /**
  * Location
  * 
  * Note, this is equivalent to the other <code>antennaLocation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AntennaLocationResponse
      */
      @RequestLine("POST /api/rest/entity/antenna/{elid}/Location?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AntennaLocationResponse> antennaLocationWithHttpInfo(@Param("elid") String elid, AntennaLocationRequest body, @QueryMap(encoded=true) AntennaLocationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>antennaLocation</code> method in a fluent style.
   */
  public static class AntennaLocationQueryParams extends HashMap<String, Object> {
    public AntennaLocationQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Logical port entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return AntennaLogicalPortsResponseData
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AntennaLogicalPortsResponseData antennaLogicalPorts(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaLogicalPortsRequestData body);

  /**
   * Get relations to Logical port entities
   * Similar to <code>antennaLogicalPorts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AntennaLogicalPortsResponseData> antennaLogicalPortsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaLogicalPortsRequestData body);


  /**
   * Get relations to Logical port entities
   * 
   * Note, this is equivalent to the other <code>antennaLogicalPorts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AntennaLogicalPortsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AntennaLogicalPortsResponseData
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AntennaLogicalPortsResponseData antennaLogicalPorts(@Param("elid") String elid, AntennaLogicalPortsRequestData body, @QueryMap(encoded=true) AntennaLogicalPortsQueryParams queryParams);

  /**
  * Get relations to Logical port entities
  * 
  * Note, this is equivalent to the other <code>antennaLogicalPorts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AntennaLogicalPortsResponseData
      */
      @RequestLine("POST /api/rest/entity/antenna/{elid}/LogicalPorts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AntennaLogicalPortsResponseData> antennaLogicalPortsWithHttpInfo(@Param("elid") String elid, AntennaLogicalPortsRequestData body, @QueryMap(encoded=true) AntennaLogicalPortsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>antennaLogicalPorts</code> method in a fluent style.
   */
  public static class AntennaLogicalPortsQueryParams extends HashMap<String, Object> {
    public AntennaLogicalPortsQueryParams sessionId(final String value) {
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
   * @return AntennaMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AntennaMaintenanceContractsResponseData antennaMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>antennaMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AntennaMaintenanceContractsResponseData> antennaMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>antennaMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AntennaMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AntennaMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AntennaMaintenanceContractsResponseData antennaMaintenanceContracts(@Param("elid") String elid, AntennaMaintenanceContractsRequestData body, @QueryMap(encoded=true) AntennaMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>antennaMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AntennaMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/antenna/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AntennaMaintenanceContractsResponseData> antennaMaintenanceContractsWithHttpInfo(@Param("elid") String elid, AntennaMaintenanceContractsRequestData body, @QueryMap(encoded=true) AntennaMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>antennaMaintenanceContracts</code> method in a fluent style.
   */
  public static class AntennaMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public AntennaMaintenanceContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Multiducts entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return AntennaMultiDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/MultiDucts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AntennaMultiDuctsResponseData antennaMultiDucts(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaMultiDuctsRequestData body);

  /**
   * Get relations to Multiducts entities
   * Similar to <code>antennaMultiDucts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/MultiDucts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AntennaMultiDuctsResponseData> antennaMultiDuctsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaMultiDuctsRequestData body);


  /**
   * Get relations to Multiducts entities
   * 
   * Note, this is equivalent to the other <code>antennaMultiDucts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AntennaMultiDuctsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AntennaMultiDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/MultiDucts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AntennaMultiDuctsResponseData antennaMultiDucts(@Param("elid") String elid, AntennaMultiDuctsRequestData body, @QueryMap(encoded=true) AntennaMultiDuctsQueryParams queryParams);

  /**
  * Get relations to Multiducts entities
  * 
  * Note, this is equivalent to the other <code>antennaMultiDucts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AntennaMultiDuctsResponseData
      */
      @RequestLine("POST /api/rest/entity/antenna/{elid}/MultiDucts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AntennaMultiDuctsResponseData> antennaMultiDuctsWithHttpInfo(@Param("elid") String elid, AntennaMultiDuctsRequestData body, @QueryMap(encoded=true) AntennaMultiDuctsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>antennaMultiDucts</code> method in a fluent style.
   */
  public static class AntennaMultiDuctsQueryParams extends HashMap<String, Object> {
    public AntennaMultiDuctsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Nets / Net ranges
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return AntennaNetworksAndNetrangesResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AntennaNetworksAndNetrangesResponse antennaNetworksAndNetranges(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaNetworksAndNetrangesRequest body);

  /**
   * Nets / Net ranges
   * Similar to <code>antennaNetworksAndNetranges</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AntennaNetworksAndNetrangesResponse> antennaNetworksAndNetrangesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaNetworksAndNetrangesRequest body);


  /**
   * Nets / Net ranges
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>antennaNetworksAndNetranges</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AntennaNetworksAndNetrangesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AntennaNetworksAndNetrangesResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AntennaNetworksAndNetrangesResponse antennaNetworksAndNetranges(@Param("elid") String elid, AntennaNetworksAndNetrangesRequest body, @QueryMap(encoded=true) AntennaNetworksAndNetrangesQueryParams queryParams);

  /**
  * Nets / Net ranges
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>antennaNetworksAndNetranges</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AntennaNetworksAndNetrangesResponse
      */
      @RequestLine("POST /api/rest/entity/antenna/{elid}/NetworksAndNetranges?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AntennaNetworksAndNetrangesResponse> antennaNetworksAndNetrangesWithHttpInfo(@Param("elid") String elid, AntennaNetworksAndNetrangesRequest body, @QueryMap(encoded=true) AntennaNetworksAndNetrangesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>antennaNetworksAndNetranges</code> method in a fluent style.
   */
  public static class AntennaNetworksAndNetrangesQueryParams extends HashMap<String, Object> {
    public AntennaNetworksAndNetrangesQueryParams sessionId(final String value) {
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
   * @return AntennaOperatingSystemInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AntennaOperatingSystemInstallationResponseData antennaOperatingSystemInstallation(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaOperatingSystemInstallationRequestData body);

  /**
   * Get relations to Operating system installation entities
   * Similar to <code>antennaOperatingSystemInstallation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AntennaOperatingSystemInstallationResponseData> antennaOperatingSystemInstallationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaOperatingSystemInstallationRequestData body);


  /**
   * Get relations to Operating system installation entities
   * 
   * Note, this is equivalent to the other <code>antennaOperatingSystemInstallation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AntennaOperatingSystemInstallationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AntennaOperatingSystemInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AntennaOperatingSystemInstallationResponseData antennaOperatingSystemInstallation(@Param("elid") String elid, AntennaOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) AntennaOperatingSystemInstallationQueryParams queryParams);

  /**
  * Get relations to Operating system installation entities
  * 
  * Note, this is equivalent to the other <code>antennaOperatingSystemInstallation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AntennaOperatingSystemInstallationResponseData
      */
      @RequestLine("POST /api/rest/entity/antenna/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AntennaOperatingSystemInstallationResponseData> antennaOperatingSystemInstallationWithHttpInfo(@Param("elid") String elid, AntennaOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) AntennaOperatingSystemInstallationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>antennaOperatingSystemInstallation</code> method in a fluent style.
   */
  public static class AntennaOperatingSystemInstallationQueryParams extends HashMap<String, Object> {
    public AntennaOperatingSystemInstallationQueryParams sessionId(final String value) {
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
   * @return AntennaOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AntennaOrganizationsResponseData antennaOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>antennaOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AntennaOrganizationsResponseData> antennaOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>antennaOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AntennaOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AntennaOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AntennaOrganizationsResponseData antennaOrganizations(@Param("elid") String elid, AntennaOrganizationsRequestData body, @QueryMap(encoded=true) AntennaOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>antennaOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AntennaOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/antenna/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AntennaOrganizationsResponseData> antennaOrganizationsWithHttpInfo(@Param("elid") String elid, AntennaOrganizationsRequestData body, @QueryMap(encoded=true) AntennaOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>antennaOrganizations</code> method in a fluent style.
   */
  public static class AntennaOrganizationsQueryParams extends HashMap<String, Object> {
    public AntennaOrganizationsQueryParams sessionId(final String value) {
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
   * @return AntennaPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AntennaPersonGroupsResponseData antennaPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>antennaPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AntennaPersonGroupsResponseData> antennaPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>antennaPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AntennaPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AntennaPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AntennaPersonGroupsResponseData antennaPersonGroups(@Param("elid") String elid, AntennaPersonGroupsRequestData body, @QueryMap(encoded=true) AntennaPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>antennaPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AntennaPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/antenna/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AntennaPersonGroupsResponseData> antennaPersonGroupsWithHttpInfo(@Param("elid") String elid, AntennaPersonGroupsRequestData body, @QueryMap(encoded=true) AntennaPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>antennaPersonGroups</code> method in a fluent style.
   */
  public static class AntennaPersonGroupsQueryParams extends HashMap<String, Object> {
    public AntennaPersonGroupsQueryParams sessionId(final String value) {
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
   * @return AntennaPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AntennaPersonsResponseData antennaPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>antennaPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AntennaPersonsResponseData> antennaPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>antennaPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AntennaPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AntennaPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AntennaPersonsResponseData antennaPersons(@Param("elid") String elid, AntennaPersonsRequestData body, @QueryMap(encoded=true) AntennaPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>antennaPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AntennaPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/antenna/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AntennaPersonsResponseData> antennaPersonsWithHttpInfo(@Param("elid") String elid, AntennaPersonsRequestData body, @QueryMap(encoded=true) AntennaPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>antennaPersons</code> method in a fluent style.
   */
  public static class AntennaPersonsQueryParams extends HashMap<String, Object> {
    public AntennaPersonsQueryParams sessionId(final String value) {
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
   * @return AntennaPhysicalPortsDataResponseData
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AntennaPhysicalPortsDataResponseData antennaPhysicalPortsData(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaPhysicalPortsDataRequestData body);

  /**
   * Get relations to Physical port (data) entities
   * Similar to <code>antennaPhysicalPortsData</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AntennaPhysicalPortsDataResponseData> antennaPhysicalPortsDataWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaPhysicalPortsDataRequestData body);


  /**
   * Get relations to Physical port (data) entities
   * 
   * Note, this is equivalent to the other <code>antennaPhysicalPortsData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AntennaPhysicalPortsDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AntennaPhysicalPortsDataResponseData
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AntennaPhysicalPortsDataResponseData antennaPhysicalPortsData(@Param("elid") String elid, AntennaPhysicalPortsDataRequestData body, @QueryMap(encoded=true) AntennaPhysicalPortsDataQueryParams queryParams);

  /**
  * Get relations to Physical port (data) entities
  * 
  * Note, this is equivalent to the other <code>antennaPhysicalPortsData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AntennaPhysicalPortsDataResponseData
      */
      @RequestLine("POST /api/rest/entity/antenna/{elid}/PhysicalPortsData?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AntennaPhysicalPortsDataResponseData> antennaPhysicalPortsDataWithHttpInfo(@Param("elid") String elid, AntennaPhysicalPortsDataRequestData body, @QueryMap(encoded=true) AntennaPhysicalPortsDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>antennaPhysicalPortsData</code> method in a fluent style.
   */
  public static class AntennaPhysicalPortsDataQueryParams extends HashMap<String, Object> {
    public AntennaPhysicalPortsDataQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query physical ports data extended
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return AntennaPhysicalPortsDataExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/PhysicalPortsDataExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AntennaPhysicalPortsDataExtendedResponse antennaPhysicalPortsDataExtended(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaPhysicalPortsDataExtendedRequest body);

  /**
   * Query physical ports data extended
   * Similar to <code>antennaPhysicalPortsDataExtended</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/PhysicalPortsDataExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AntennaPhysicalPortsDataExtendedResponse> antennaPhysicalPortsDataExtendedWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaPhysicalPortsDataExtendedRequest body);


  /**
   * Query physical ports data extended
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>antennaPhysicalPortsDataExtended</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AntennaPhysicalPortsDataExtendedQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AntennaPhysicalPortsDataExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/PhysicalPortsDataExtended?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AntennaPhysicalPortsDataExtendedResponse antennaPhysicalPortsDataExtended(@Param("elid") String elid, AntennaPhysicalPortsDataExtendedRequest body, @QueryMap(encoded=true) AntennaPhysicalPortsDataExtendedQueryParams queryParams);

  /**
  * Query physical ports data extended
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>antennaPhysicalPortsDataExtended</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AntennaPhysicalPortsDataExtendedResponse
      */
      @RequestLine("POST /api/rest/entity/antenna/{elid}/PhysicalPortsDataExtended?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AntennaPhysicalPortsDataExtendedResponse> antennaPhysicalPortsDataExtendedWithHttpInfo(@Param("elid") String elid, AntennaPhysicalPortsDataExtendedRequest body, @QueryMap(encoded=true) AntennaPhysicalPortsDataExtendedQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>antennaPhysicalPortsDataExtended</code> method in a fluent style.
   */
  public static class AntennaPhysicalPortsDataExtendedQueryParams extends HashMap<String, Object> {
    public AntennaPhysicalPortsDataExtendedQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Physical port (power) entities
   * For more information call the basic query of the power port entity
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return AntennaPhysicalPortsPowerResponseData
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AntennaPhysicalPortsPowerResponseData antennaPhysicalPortsPower(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaPhysicalPortsPowerRequestData body);

  /**
   * Get relations to Physical port (power) entities
   * Similar to <code>antennaPhysicalPortsPower</code> but it also returns the http response headers .
   * For more information call the basic query of the power port entity
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AntennaPhysicalPortsPowerResponseData> antennaPhysicalPortsPowerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaPhysicalPortsPowerRequestData body);


  /**
   * Get relations to Physical port (power) entities
   * For more information call the basic query of the power port entity
   * Note, this is equivalent to the other <code>antennaPhysicalPortsPower</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AntennaPhysicalPortsPowerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AntennaPhysicalPortsPowerResponseData
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AntennaPhysicalPortsPowerResponseData antennaPhysicalPortsPower(@Param("elid") String elid, AntennaPhysicalPortsPowerRequestData body, @QueryMap(encoded=true) AntennaPhysicalPortsPowerQueryParams queryParams);

  /**
  * Get relations to Physical port (power) entities
  * For more information call the basic query of the power port entity
  * Note, this is equivalent to the other <code>antennaPhysicalPortsPower</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AntennaPhysicalPortsPowerResponseData
      */
      @RequestLine("POST /api/rest/entity/antenna/{elid}/PhysicalPortsPower?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AntennaPhysicalPortsPowerResponseData> antennaPhysicalPortsPowerWithHttpInfo(@Param("elid") String elid, AntennaPhysicalPortsPowerRequestData body, @QueryMap(encoded=true) AntennaPhysicalPortsPowerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>antennaPhysicalPortsPower</code> method in a fluent style.
   */
  public static class AntennaPhysicalPortsPowerQueryParams extends HashMap<String, Object> {
    public AntennaPhysicalPortsPowerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query Power ports
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return AntennaPhysicalPortsPowerExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/PhysicalPortsPowerExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AntennaPhysicalPortsPowerExtendedResponse antennaPhysicalPortsPowerExtended(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaPhysicalPortsPowerExtendedRequest body);

  /**
   * Query Power ports
   * Similar to <code>antennaPhysicalPortsPowerExtended</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/PhysicalPortsPowerExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AntennaPhysicalPortsPowerExtendedResponse> antennaPhysicalPortsPowerExtendedWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaPhysicalPortsPowerExtendedRequest body);


  /**
   * Query Power ports
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>antennaPhysicalPortsPowerExtended</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AntennaPhysicalPortsPowerExtendedQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AntennaPhysicalPortsPowerExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/PhysicalPortsPowerExtended?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AntennaPhysicalPortsPowerExtendedResponse antennaPhysicalPortsPowerExtended(@Param("elid") String elid, AntennaPhysicalPortsPowerExtendedRequest body, @QueryMap(encoded=true) AntennaPhysicalPortsPowerExtendedQueryParams queryParams);

  /**
  * Query Power ports
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>antennaPhysicalPortsPowerExtended</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AntennaPhysicalPortsPowerExtendedResponse
      */
      @RequestLine("POST /api/rest/entity/antenna/{elid}/PhysicalPortsPowerExtended?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AntennaPhysicalPortsPowerExtendedResponse> antennaPhysicalPortsPowerExtendedWithHttpInfo(@Param("elid") String elid, AntennaPhysicalPortsPowerExtendedRequest body, @QueryMap(encoded=true) AntennaPhysicalPortsPowerExtendedQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>antennaPhysicalPortsPowerExtended</code> method in a fluent style.
   */
  public static class AntennaPhysicalPortsPowerExtendedQueryParams extends HashMap<String, Object> {
    public AntennaPhysicalPortsPowerExtendedQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return AntennaQueryResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AntennaQueryResponse antennaQuery(@Param("sessionId") String sessionId, AntennaQueryRequest body);

  /**
   * Basic query
   * Similar to <code>antennaQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AntennaQueryResponse> antennaQueryWithHttpInfo(@Param("sessionId") String sessionId, AntennaQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>antennaQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AntennaQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AntennaQueryResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AntennaQueryResponse antennaQuery(AntennaQueryRequest body, @QueryMap(encoded=true) AntennaQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>antennaQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AntennaQueryResponse
      */
      @RequestLine("POST /api/rest/entity/antenna/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AntennaQueryResponse> antennaQueryWithHttpInfo(AntennaQueryRequest body, @QueryMap(encoded=true) AntennaQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>antennaQuery</code> method in a fluent style.
   */
  public static class AntennaQueryQueryParams extends HashMap<String, Object> {
    public AntennaQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query
   * Queries linked master data and zone data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return AntennaQueryExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/queryExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AntennaQueryExtendedResponse antennaQueryExtended(@Param("sessionId") String sessionId, AntennaQueryExtendedRequest body);

  /**
   * Extended query
   * Similar to <code>antennaQueryExtended</code> but it also returns the http response headers .
   * Queries linked master data and zone data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/queryExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AntennaQueryExtendedResponse> antennaQueryExtendedWithHttpInfo(@Param("sessionId") String sessionId, AntennaQueryExtendedRequest body);


  /**
   * Extended query
   * Queries linked master data and zone data.
   * Note, this is equivalent to the other <code>antennaQueryExtended</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AntennaQueryExtendedQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AntennaQueryExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/queryExtended?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AntennaQueryExtendedResponse antennaQueryExtended(AntennaQueryExtendedRequest body, @QueryMap(encoded=true) AntennaQueryExtendedQueryParams queryParams);

  /**
  * Extended query
  * Queries linked master data and zone data.
  * Note, this is equivalent to the other <code>antennaQueryExtended</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AntennaQueryExtendedResponse
      */
      @RequestLine("POST /api/rest/entity/antenna/queryExtended?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AntennaQueryExtendedResponse> antennaQueryExtendedWithHttpInfo(AntennaQueryExtendedRequest body, @QueryMap(encoded=true) AntennaQueryExtendedQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>antennaQueryExtended</code> method in a fluent style.
   */
  public static class AntennaQueryExtendedQueryParams extends HashMap<String, Object> {
    public AntennaQueryExtendedQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended geo coordinates
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return AntennaQueryExtendedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/queryExtendedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AntennaQueryExtendedGeoCoordinatesResponse antennaQueryExtendedGeoCoordinates(@Param("sessionId") String sessionId, AntennaQueryExtendedGeoCoordinatesRequest body);

  /**
   * Extended geo coordinates
   * Similar to <code>antennaQueryExtendedGeoCoordinates</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/queryExtendedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AntennaQueryExtendedGeoCoordinatesResponse> antennaQueryExtendedGeoCoordinatesWithHttpInfo(@Param("sessionId") String sessionId, AntennaQueryExtendedGeoCoordinatesRequest body);


  /**
   * Extended geo coordinates
   * 
   * Note, this is equivalent to the other <code>antennaQueryExtendedGeoCoordinates</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AntennaQueryExtendedGeoCoordinatesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AntennaQueryExtendedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/queryExtendedGeoCoordinates?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AntennaQueryExtendedGeoCoordinatesResponse antennaQueryExtendedGeoCoordinates(AntennaQueryExtendedGeoCoordinatesRequest body, @QueryMap(encoded=true) AntennaQueryExtendedGeoCoordinatesQueryParams queryParams);

  /**
  * Extended geo coordinates
  * 
  * Note, this is equivalent to the other <code>antennaQueryExtendedGeoCoordinates</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AntennaQueryExtendedGeoCoordinatesResponse
      */
      @RequestLine("POST /api/rest/entity/antenna/queryExtendedGeoCoordinates?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AntennaQueryExtendedGeoCoordinatesResponse> antennaQueryExtendedGeoCoordinatesWithHttpInfo(AntennaQueryExtendedGeoCoordinatesRequest body, @QueryMap(encoded=true) AntennaQueryExtendedGeoCoordinatesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>antennaQueryExtendedGeoCoordinates</code> method in a fluent style.
   */
  public static class AntennaQueryExtendedGeoCoordinatesQueryParams extends HashMap<String, Object> {
    public AntennaQueryExtendedGeoCoordinatesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query scroll first
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return AntennaQueryExtendedScrollFirstResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AntennaQueryExtendedScrollFirstResponse antennaQueryExtendedScrollFirst(@Param("sessionId") String sessionId, AntennaQueryExtendedScrollFirstRequest body);

  /**
   * Extended query scroll first
   * Similar to <code>antennaQueryExtendedScrollFirst</code> but it also returns the http response headers .
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AntennaQueryExtendedScrollFirstResponse> antennaQueryExtendedScrollFirstWithHttpInfo(@Param("sessionId") String sessionId, AntennaQueryExtendedScrollFirstRequest body);


  /**
   * Extended query scroll first
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * Note, this is equivalent to the other <code>antennaQueryExtendedScrollFirst</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AntennaQueryExtendedScrollFirstQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AntennaQueryExtendedScrollFirstResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AntennaQueryExtendedScrollFirstResponse antennaQueryExtendedScrollFirst(AntennaQueryExtendedScrollFirstRequest body, @QueryMap(encoded=true) AntennaQueryExtendedScrollFirstQueryParams queryParams);

  /**
  * Extended query scroll first
  * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
  * Note, this is equivalent to the other <code>antennaQueryExtendedScrollFirst</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AntennaQueryExtendedScrollFirstResponse
      */
      @RequestLine("POST /api/rest/entity/antenna/queryExtendedScrollFirst?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AntennaQueryExtendedScrollFirstResponse> antennaQueryExtendedScrollFirstWithHttpInfo(AntennaQueryExtendedScrollFirstRequest body, @QueryMap(encoded=true) AntennaQueryExtendedScrollFirstQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>antennaQueryExtendedScrollFirst</code> method in a fluent style.
   */
  public static class AntennaQueryExtendedScrollFirstQueryParams extends HashMap<String, Object> {
    public AntennaQueryExtendedScrollFirstQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query scroll more
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return AntennaQueryExtendedScrollMoreResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AntennaQueryExtendedScrollMoreResponse antennaQueryExtendedScrollMore(@Param("sessionId") String sessionId, AntennaQueryExtendedScrollMoreRequest body);

  /**
   * Extended query scroll more
   * Similar to <code>antennaQueryExtendedScrollMore</code> but it also returns the http response headers .
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AntennaQueryExtendedScrollMoreResponse> antennaQueryExtendedScrollMoreWithHttpInfo(@Param("sessionId") String sessionId, AntennaQueryExtendedScrollMoreRequest body);


  /**
   * Extended query scroll more
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * Note, this is equivalent to the other <code>antennaQueryExtendedScrollMore</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AntennaQueryExtendedScrollMoreQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AntennaQueryExtendedScrollMoreResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AntennaQueryExtendedScrollMoreResponse antennaQueryExtendedScrollMore(AntennaQueryExtendedScrollMoreRequest body, @QueryMap(encoded=true) AntennaQueryExtendedScrollMoreQueryParams queryParams);

  /**
  * Extended query scroll more
  * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
  * Note, this is equivalent to the other <code>antennaQueryExtendedScrollMore</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AntennaQueryExtendedScrollMoreResponse
      */
      @RequestLine("POST /api/rest/entity/antenna/queryExtendedScrollMore?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AntennaQueryExtendedScrollMoreResponse> antennaQueryExtendedScrollMoreWithHttpInfo(AntennaQueryExtendedScrollMoreRequest body, @QueryMap(encoded=true) AntennaQueryExtendedScrollMoreQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>antennaQueryExtendedScrollMore</code> method in a fluent style.
   */
  public static class AntennaQueryExtendedScrollMoreQueryParams extends HashMap<String, Object> {
    public AntennaQueryExtendedScrollMoreQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query device services 
   * Query services for device 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return AntennaServicesResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/Services?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AntennaServicesResponse antennaServices(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaServicesRequest body);

  /**
   * Query device services 
   * Similar to <code>antennaServices</code> but it also returns the http response headers .
   * Query services for device 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/Services?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AntennaServicesResponse> antennaServicesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaServicesRequest body);


  /**
   * Query device services 
   * Query services for device 
   * Note, this is equivalent to the other <code>antennaServices</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AntennaServicesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AntennaServicesResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/Services?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AntennaServicesResponse antennaServices(@Param("elid") String elid, AntennaServicesRequest body, @QueryMap(encoded=true) AntennaServicesQueryParams queryParams);

  /**
  * Query device services 
  * Query services for device 
  * Note, this is equivalent to the other <code>antennaServices</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AntennaServicesResponse
      */
      @RequestLine("POST /api/rest/entity/antenna/{elid}/Services?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AntennaServicesResponse> antennaServicesWithHttpInfo(@Param("elid") String elid, AntennaServicesRequest body, @QueryMap(encoded=true) AntennaServicesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>antennaServices</code> method in a fluent style.
   */
  public static class AntennaServicesQueryParams extends HashMap<String, Object> {
    public AntennaServicesQueryParams sessionId(final String value) {
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
   * @return AntennaSitesResponseData
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/Sites?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AntennaSitesResponseData antennaSites(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaSitesRequestData body);

  /**
   * Get relations to Site entities
   * Similar to <code>antennaSites</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/Sites?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AntennaSitesResponseData> antennaSitesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaSitesRequestData body);


  /**
   * Get relations to Site entities
   * 
   * Note, this is equivalent to the other <code>antennaSites</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AntennaSitesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AntennaSitesResponseData
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/Sites?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AntennaSitesResponseData antennaSites(@Param("elid") String elid, AntennaSitesRequestData body, @QueryMap(encoded=true) AntennaSitesQueryParams queryParams);

  /**
  * Get relations to Site entities
  * 
  * Note, this is equivalent to the other <code>antennaSites</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AntennaSitesResponseData
      */
      @RequestLine("POST /api/rest/entity/antenna/{elid}/Sites?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AntennaSitesResponseData> antennaSitesWithHttpInfo(@Param("elid") String elid, AntennaSitesRequestData body, @QueryMap(encoded=true) AntennaSitesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>antennaSites</code> method in a fluent style.
   */
  public static class AntennaSitesQueryParams extends HashMap<String, Object> {
    public AntennaSitesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Slot entities
   * The relation query returns information about the slot position in which the device is installed.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return AntennaSlotResponseData
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/Slot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AntennaSlotResponseData antennaSlot(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaSlotRequestData body);

  /**
   * Get relations to Slot entities
   * Similar to <code>antennaSlot</code> but it also returns the http response headers .
   * The relation query returns information about the slot position in which the device is installed.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/Slot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AntennaSlotResponseData> antennaSlotWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaSlotRequestData body);


  /**
   * Get relations to Slot entities
   * The relation query returns information about the slot position in which the device is installed.
   * Note, this is equivalent to the other <code>antennaSlot</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AntennaSlotQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AntennaSlotResponseData
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/Slot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AntennaSlotResponseData antennaSlot(@Param("elid") String elid, AntennaSlotRequestData body, @QueryMap(encoded=true) AntennaSlotQueryParams queryParams);

  /**
  * Get relations to Slot entities
  * The relation query returns information about the slot position in which the device is installed.
  * Note, this is equivalent to the other <code>antennaSlot</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AntennaSlotResponseData
      */
      @RequestLine("POST /api/rest/entity/antenna/{elid}/Slot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AntennaSlotResponseData> antennaSlotWithHttpInfo(@Param("elid") String elid, AntennaSlotRequestData body, @QueryMap(encoded=true) AntennaSlotQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>antennaSlot</code> method in a fluent style.
   */
  public static class AntennaSlotQueryParams extends HashMap<String, Object> {
    public AntennaSlotQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Switch cabinet entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return AntennaSwitchCabinetResponseData
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/SwitchCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AntennaSwitchCabinetResponseData antennaSwitchCabinet(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaSwitchCabinetRequestData body);

  /**
   * Get relations to Switch cabinet entities
   * Similar to <code>antennaSwitchCabinet</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/SwitchCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AntennaSwitchCabinetResponseData> antennaSwitchCabinetWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaSwitchCabinetRequestData body);


  /**
   * Get relations to Switch cabinet entities
   * 
   * Note, this is equivalent to the other <code>antennaSwitchCabinet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AntennaSwitchCabinetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AntennaSwitchCabinetResponseData
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/SwitchCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AntennaSwitchCabinetResponseData antennaSwitchCabinet(@Param("elid") String elid, AntennaSwitchCabinetRequestData body, @QueryMap(encoded=true) AntennaSwitchCabinetQueryParams queryParams);

  /**
  * Get relations to Switch cabinet entities
  * 
  * Note, this is equivalent to the other <code>antennaSwitchCabinet</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AntennaSwitchCabinetResponseData
      */
      @RequestLine("POST /api/rest/entity/antenna/{elid}/SwitchCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AntennaSwitchCabinetResponseData> antennaSwitchCabinetWithHttpInfo(@Param("elid") String elid, AntennaSwitchCabinetRequestData body, @QueryMap(encoded=true) AntennaSwitchCabinetQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>antennaSwitchCabinet</code> method in a fluent style.
   */
  public static class AntennaSwitchCabinetQueryParams extends HashMap<String, Object> {
    public AntennaSwitchCabinetQueryParams sessionId(final String value) {
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
   * @return AntennaSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AntennaSystemAttributesResponse antennaSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>antennaSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AntennaSystemAttributesResponse> antennaSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>antennaSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AntennaSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AntennaSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AntennaSystemAttributesResponse antennaSystemAttributes(@Param("elid") String elid, AntennaSystemAttributesRequest body, @QueryMap(encoded=true) AntennaSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>antennaSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AntennaSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/antenna/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AntennaSystemAttributesResponse> antennaSystemAttributesWithHttpInfo(@Param("elid") String elid, AntennaSystemAttributesRequest body, @QueryMap(encoded=true) AntennaSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>antennaSystemAttributes</code> method in a fluent style.
   */
  public static class AntennaSystemAttributesQueryParams extends HashMap<String, Object> {
    public AntennaSystemAttributesQueryParams sessionId(final String value) {
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
   * @return AntennaVirtualSwitchesResponseData
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AntennaVirtualSwitchesResponseData antennaVirtualSwitches(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaVirtualSwitchesRequestData body);

  /**
   * Get relations to Virtual switch entities
   * Similar to <code>antennaVirtualSwitches</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AntennaVirtualSwitchesResponseData> antennaVirtualSwitchesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaVirtualSwitchesRequestData body);


  /**
   * Get relations to Virtual switch entities
   * 
   * Note, this is equivalent to the other <code>antennaVirtualSwitches</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AntennaVirtualSwitchesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AntennaVirtualSwitchesResponseData
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AntennaVirtualSwitchesResponseData antennaVirtualSwitches(@Param("elid") String elid, AntennaVirtualSwitchesRequestData body, @QueryMap(encoded=true) AntennaVirtualSwitchesQueryParams queryParams);

  /**
  * Get relations to Virtual switch entities
  * 
  * Note, this is equivalent to the other <code>antennaVirtualSwitches</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AntennaVirtualSwitchesResponseData
      */
      @RequestLine("POST /api/rest/entity/antenna/{elid}/VirtualSwitches?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AntennaVirtualSwitchesResponseData> antennaVirtualSwitchesWithHttpInfo(@Param("elid") String elid, AntennaVirtualSwitchesRequestData body, @QueryMap(encoded=true) AntennaVirtualSwitchesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>antennaVirtualSwitches</code> method in a fluent style.
   */
  public static class AntennaVirtualSwitchesQueryParams extends HashMap<String, Object> {
    public AntennaVirtualSwitchesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * VLANs
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return AntennaVlansResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AntennaVlansResponse antennaVlans(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaVlansRequest body);

  /**
   * VLANs
   * Similar to <code>antennaVlans</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AntennaVlansResponse> antennaVlansWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaVlansRequest body);


  /**
   * VLANs
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>antennaVlans</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AntennaVlansQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AntennaVlansResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AntennaVlansResponse antennaVlans(@Param("elid") String elid, AntennaVlansRequest body, @QueryMap(encoded=true) AntennaVlansQueryParams queryParams);

  /**
  * VLANs
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>antennaVlans</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AntennaVlansResponse
      */
      @RequestLine("POST /api/rest/entity/antenna/{elid}/Vlans?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AntennaVlansResponse> antennaVlansWithHttpInfo(@Param("elid") String elid, AntennaVlansRequest body, @QueryMap(encoded=true) AntennaVlansQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>antennaVlans</code> method in a fluent style.
   */
  public static class AntennaVlansQueryParams extends HashMap<String, Object> {
    public AntennaVlansQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * VLAN to slots
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return AntennaVlansAtSlotResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/VlansAtSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AntennaVlansAtSlotResponse antennaVlansAtSlot(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaVlansAtSlotRequest body);

  /**
   * VLAN to slots
   * Similar to <code>antennaVlansAtSlot</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/VlansAtSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AntennaVlansAtSlotResponse> antennaVlansAtSlotWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaVlansAtSlotRequest body);


  /**
   * VLAN to slots
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>antennaVlansAtSlot</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AntennaVlansAtSlotQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AntennaVlansAtSlotResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/VlansAtSlot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AntennaVlansAtSlotResponse antennaVlansAtSlot(@Param("elid") String elid, AntennaVlansAtSlotRequest body, @QueryMap(encoded=true) AntennaVlansAtSlotQueryParams queryParams);

  /**
  * VLAN to slots
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>antennaVlansAtSlot</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AntennaVlansAtSlotResponse
      */
      @RequestLine("POST /api/rest/entity/antenna/{elid}/VlansAtSlot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AntennaVlansAtSlotResponse> antennaVlansAtSlotWithHttpInfo(@Param("elid") String elid, AntennaVlansAtSlotRequest body, @QueryMap(encoded=true) AntennaVlansAtSlotQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>antennaVlansAtSlot</code> method in a fluent style.
   */
  public static class AntennaVlansAtSlotQueryParams extends HashMap<String, Object> {
    public AntennaVlansAtSlotQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Warehouse entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return AntennaWarehouseResponseData
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AntennaWarehouseResponseData antennaWarehouse(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaWarehouseRequestData body);

  /**
   * Get relations to Warehouse entities
   * Similar to <code>antennaWarehouse</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AntennaWarehouseResponseData> antennaWarehouseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaWarehouseRequestData body);


  /**
   * Get relations to Warehouse entities
   * 
   * Note, this is equivalent to the other <code>antennaWarehouse</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AntennaWarehouseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AntennaWarehouseResponseData
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AntennaWarehouseResponseData antennaWarehouse(@Param("elid") String elid, AntennaWarehouseRequestData body, @QueryMap(encoded=true) AntennaWarehouseQueryParams queryParams);

  /**
  * Get relations to Warehouse entities
  * 
  * Note, this is equivalent to the other <code>antennaWarehouse</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AntennaWarehouseResponseData
      */
      @RequestLine("POST /api/rest/entity/antenna/{elid}/Warehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AntennaWarehouseResponseData> antennaWarehouseWithHttpInfo(@Param("elid") String elid, AntennaWarehouseRequestData body, @QueryMap(encoded=true) AntennaWarehouseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>antennaWarehouse</code> method in a fluent style.
   */
  public static class AntennaWarehouseQueryParams extends HashMap<String, Object> {
    public AntennaWarehouseQueryParams sessionId(final String value) {
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
   * @return AntennaZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/Zone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AntennaZoneResponseData antennaZone(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaZoneRequestData body);

  /**
   * Get relations to Zone entities
   * Similar to <code>antennaZone</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/Zone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AntennaZoneResponseData> antennaZoneWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AntennaZoneRequestData body);


  /**
   * Get relations to Zone entities
   * 
   * Note, this is equivalent to the other <code>antennaZone</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AntennaZoneQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AntennaZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/Zone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AntennaZoneResponseData antennaZone(@Param("elid") String elid, AntennaZoneRequestData body, @QueryMap(encoded=true) AntennaZoneQueryParams queryParams);

  /**
  * Get relations to Zone entities
  * 
  * Note, this is equivalent to the other <code>antennaZone</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AntennaZoneResponseData
      */
      @RequestLine("POST /api/rest/entity/antenna/{elid}/Zone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AntennaZoneResponseData> antennaZoneWithHttpInfo(@Param("elid") String elid, AntennaZoneRequestData body, @QueryMap(encoded=true) AntennaZoneQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>antennaZone</code> method in a fluent style.
   */
  public static class AntennaZoneQueryParams extends HashMap<String, Object> {
    public AntennaZoneQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Change type
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ChangeTypeAntennaResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/changeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeTypeAntennaResponse changeTypeAntenna(@Param("sessionId") String sessionId, @Param("elid") String elid, ChangeTypeAntennaRequestData body);

  /**
   * Change type
   * Similar to <code>changeTypeAntenna</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/changeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeTypeAntennaResponse> changeTypeAntennaWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChangeTypeAntennaRequestData body);


  /**
   * Change type
   * 
   * Note, this is equivalent to the other <code>changeTypeAntenna</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChangeTypeAntennaQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChangeTypeAntennaResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/changeType?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChangeTypeAntennaResponse changeTypeAntenna(@Param("elid") String elid, ChangeTypeAntennaRequestData body, @QueryMap(encoded=true) ChangeTypeAntennaQueryParams queryParams);

  /**
  * Change type
  * 
  * Note, this is equivalent to the other <code>changeTypeAntenna</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChangeTypeAntennaResponse
      */
      @RequestLine("POST /api/rest/entity/antenna/{elid}/changeType?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChangeTypeAntennaResponse> changeTypeAntennaWithHttpInfo(@Param("elid") String elid, ChangeTypeAntennaRequestData body, @QueryMap(encoded=true) ChangeTypeAntennaQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>changeTypeAntenna</code> method in a fluent style.
   */
  public static class ChangeTypeAntennaQueryParams extends HashMap<String, Object> {
    public ChangeTypeAntennaQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Antenna
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteAntennaResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteAntennaResponse deleteAntenna(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteAntennaRequestData body);

  /**
   * Delete
   * Similar to <code>deleteAntenna</code> but it also returns the http response headers .
   * Delete Antenna
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteAntennaResponse> deleteAntennaWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteAntennaRequestData body);


  /**
   * Delete
   * Delete Antenna
   * Note, this is equivalent to the other <code>deleteAntenna</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteAntennaQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteAntennaResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteAntennaResponse deleteAntenna(@Param("elid") String elid, DeleteAntennaRequestData body, @QueryMap(encoded=true) DeleteAntennaQueryParams queryParams);

  /**
  * Delete
  * Delete Antenna
  * Note, this is equivalent to the other <code>deleteAntenna</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteAntennaResponse
      */
      @RequestLine("POST /api/rest/entity/antenna/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteAntennaResponse> deleteAntennaWithHttpInfo(@Param("elid") String elid, DeleteAntennaRequestData body, @QueryMap(encoded=true) DeleteAntennaQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteAntenna</code> method in a fluent style.
   */
  public static class DeleteAntennaQueryParams extends HashMap<String, Object> {
    public DeleteAntennaQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Move to cabinet
   * Move to cabinet
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return MoveToCabinetAntennaResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/moveToCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToCabinetAntennaResponse moveToCabinetAntenna(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToCabinetAntennaRequestData body);

  /**
   * Move to cabinet
   * Similar to <code>moveToCabinetAntenna</code> but it also returns the http response headers .
   * Move to cabinet
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/moveToCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToCabinetAntennaResponse> moveToCabinetAntennaWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToCabinetAntennaRequestData body);


  /**
   * Move to cabinet
   * Move to cabinet
   * Note, this is equivalent to the other <code>moveToCabinetAntenna</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToCabinetAntennaQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToCabinetAntennaResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/moveToCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToCabinetAntennaResponse moveToCabinetAntenna(@Param("elid") String elid, MoveToCabinetAntennaRequestData body, @QueryMap(encoded=true) MoveToCabinetAntennaQueryParams queryParams);

  /**
  * Move to cabinet
  * Move to cabinet
  * Note, this is equivalent to the other <code>moveToCabinetAntenna</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToCabinetAntennaResponse
      */
      @RequestLine("POST /api/rest/entity/antenna/{elid}/moveToCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToCabinetAntennaResponse> moveToCabinetAntennaWithHttpInfo(@Param("elid") String elid, MoveToCabinetAntennaRequestData body, @QueryMap(encoded=true) MoveToCabinetAntennaQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToCabinetAntenna</code> method in a fluent style.
   */
  public static class MoveToCabinetAntennaQueryParams extends HashMap<String, Object> {
    public MoveToCabinetAntennaQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Move to slot
   * Move to slot
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return MoveToSlotAntennaResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/moveToSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToSlotAntennaResponse moveToSlotAntenna(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToSlotAntennaRequestData body);

  /**
   * Move to slot
   * Similar to <code>moveToSlotAntenna</code> but it also returns the http response headers .
   * Move to slot
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/moveToSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToSlotAntennaResponse> moveToSlotAntennaWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToSlotAntennaRequestData body);


  /**
   * Move to slot
   * Move to slot
   * Note, this is equivalent to the other <code>moveToSlotAntenna</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToSlotAntennaQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToSlotAntennaResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/moveToSlot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToSlotAntennaResponse moveToSlotAntenna(@Param("elid") String elid, MoveToSlotAntennaRequestData body, @QueryMap(encoded=true) MoveToSlotAntennaQueryParams queryParams);

  /**
  * Move to slot
  * Move to slot
  * Note, this is equivalent to the other <code>moveToSlotAntenna</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToSlotAntennaResponse
      */
      @RequestLine("POST /api/rest/entity/antenna/{elid}/moveToSlot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToSlotAntennaResponse> moveToSlotAntennaWithHttpInfo(@Param("elid") String elid, MoveToSlotAntennaRequestData body, @QueryMap(encoded=true) MoveToSlotAntennaQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToSlotAntenna</code> method in a fluent style.
   */
  public static class MoveToSlotAntennaQueryParams extends HashMap<String, Object> {
    public MoveToSlotAntennaQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Move to warehouse
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return MoveToWarehouseAntennaResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToWarehouseAntennaResponse moveToWarehouseAntenna(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToWarehouseAntennaRequestData body);

  /**
   * Move to warehouse
   * Similar to <code>moveToWarehouseAntenna</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToWarehouseAntennaResponse> moveToWarehouseAntennaWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToWarehouseAntennaRequestData body);


  /**
   * Move to warehouse
   * 
   * Note, this is equivalent to the other <code>moveToWarehouseAntenna</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToWarehouseAntennaQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToWarehouseAntennaResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToWarehouseAntennaResponse moveToWarehouseAntenna(@Param("elid") String elid, MoveToWarehouseAntennaRequestData body, @QueryMap(encoded=true) MoveToWarehouseAntennaQueryParams queryParams);

  /**
  * Move to warehouse
  * 
  * Note, this is equivalent to the other <code>moveToWarehouseAntenna</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToWarehouseAntennaResponse
      */
      @RequestLine("POST /api/rest/entity/antenna/{elid}/moveToWarehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToWarehouseAntennaResponse> moveToWarehouseAntennaWithHttpInfo(@Param("elid") String elid, MoveToWarehouseAntennaRequestData body, @QueryMap(encoded=true) MoveToWarehouseAntennaQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToWarehouseAntenna</code> method in a fluent style.
   */
  public static class MoveToWarehouseAntennaQueryParams extends HashMap<String, Object> {
    public MoveToWarehouseAntennaQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Move to zone
   * Move to zone
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return MoveToZoneAntennaResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToZoneAntennaResponse moveToZoneAntenna(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToZoneAntennaRequestData body);

  /**
   * Move to zone
   * Similar to <code>moveToZoneAntenna</code> but it also returns the http response headers .
   * Move to zone
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToZoneAntennaResponse> moveToZoneAntennaWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToZoneAntennaRequestData body);


  /**
   * Move to zone
   * Move to zone
   * Note, this is equivalent to the other <code>moveToZoneAntenna</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToZoneAntennaQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToZoneAntennaResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToZoneAntennaResponse moveToZoneAntenna(@Param("elid") String elid, MoveToZoneAntennaRequestData body, @QueryMap(encoded=true) MoveToZoneAntennaQueryParams queryParams);

  /**
  * Move to zone
  * Move to zone
  * Note, this is equivalent to the other <code>moveToZoneAntenna</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToZoneAntennaResponse
      */
      @RequestLine("POST /api/rest/entity/antenna/{elid}/moveToZone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToZoneAntennaResponse> moveToZoneAntennaWithHttpInfo(@Param("elid") String elid, MoveToZoneAntennaRequestData body, @QueryMap(encoded=true) MoveToZoneAntennaQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToZoneAntenna</code> method in a fluent style.
   */
  public static class MoveToZoneAntennaQueryParams extends HashMap<String, Object> {
    public MoveToZoneAntennaQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in cabinet
   * Place in cabinet
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInCabinetAntennaResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/placeInCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInCabinetAntennaResponse placeInCabinetAntenna(@Param("sessionId") String sessionId, PlaceInCabinetAntennaRequestData body);

  /**
   * Place in cabinet
   * Similar to <code>placeInCabinetAntenna</code> but it also returns the http response headers .
   * Place in cabinet
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/placeInCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInCabinetAntennaResponse> placeInCabinetAntennaWithHttpInfo(@Param("sessionId") String sessionId, PlaceInCabinetAntennaRequestData body);


  /**
   * Place in cabinet
   * Place in cabinet
   * Note, this is equivalent to the other <code>placeInCabinetAntenna</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInCabinetAntennaQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInCabinetAntennaResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/placeInCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInCabinetAntennaResponse placeInCabinetAntenna(PlaceInCabinetAntennaRequestData body, @QueryMap(encoded=true) PlaceInCabinetAntennaQueryParams queryParams);

  /**
  * Place in cabinet
  * Place in cabinet
  * Note, this is equivalent to the other <code>placeInCabinetAntenna</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInCabinetAntennaResponse
      */
      @RequestLine("POST /api/rest/entity/antenna/placeInCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInCabinetAntennaResponse> placeInCabinetAntennaWithHttpInfo(PlaceInCabinetAntennaRequestData body, @QueryMap(encoded=true) PlaceInCabinetAntennaQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInCabinetAntenna</code> method in a fluent style.
   */
  public static class PlaceInCabinetAntennaQueryParams extends HashMap<String, Object> {
    public PlaceInCabinetAntennaQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in slot
   * Places a device (super) in a slot. The device to place has to be flagged as a card.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInSlotAntennaResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/placeInSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInSlotAntennaResponse placeInSlotAntenna(@Param("sessionId") String sessionId, PlaceInSlotAntennaRequestData body);

  /**
   * Place in slot
   * Similar to <code>placeInSlotAntenna</code> but it also returns the http response headers .
   * Places a device (super) in a slot. The device to place has to be flagged as a card.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/placeInSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInSlotAntennaResponse> placeInSlotAntennaWithHttpInfo(@Param("sessionId") String sessionId, PlaceInSlotAntennaRequestData body);


  /**
   * Place in slot
   * Places a device (super) in a slot. The device to place has to be flagged as a card.
   * Note, this is equivalent to the other <code>placeInSlotAntenna</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInSlotAntennaQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInSlotAntennaResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/placeInSlot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInSlotAntennaResponse placeInSlotAntenna(PlaceInSlotAntennaRequestData body, @QueryMap(encoded=true) PlaceInSlotAntennaQueryParams queryParams);

  /**
  * Place in slot
  * Places a device (super) in a slot. The device to place has to be flagged as a card.
  * Note, this is equivalent to the other <code>placeInSlotAntenna</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInSlotAntennaResponse
      */
      @RequestLine("POST /api/rest/entity/antenna/placeInSlot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInSlotAntennaResponse> placeInSlotAntennaWithHttpInfo(PlaceInSlotAntennaRequestData body, @QueryMap(encoded=true) PlaceInSlotAntennaQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInSlotAntenna</code> method in a fluent style.
   */
  public static class PlaceInSlotAntennaQueryParams extends HashMap<String, Object> {
    public PlaceInSlotAntennaQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in warehouse
   * Place in warehouse
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInWarehouseAntennaResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/placeInWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInWarehouseAntennaResponse placeInWarehouseAntenna(@Param("sessionId") String sessionId, PlaceInWarehouseAntennaRequestData body);

  /**
   * Place in warehouse
   * Similar to <code>placeInWarehouseAntenna</code> but it also returns the http response headers .
   * Place in warehouse
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/placeInWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInWarehouseAntennaResponse> placeInWarehouseAntennaWithHttpInfo(@Param("sessionId") String sessionId, PlaceInWarehouseAntennaRequestData body);


  /**
   * Place in warehouse
   * Place in warehouse
   * Note, this is equivalent to the other <code>placeInWarehouseAntenna</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInWarehouseAntennaQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInWarehouseAntennaResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/placeInWarehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInWarehouseAntennaResponse placeInWarehouseAntenna(PlaceInWarehouseAntennaRequestData body, @QueryMap(encoded=true) PlaceInWarehouseAntennaQueryParams queryParams);

  /**
  * Place in warehouse
  * Place in warehouse
  * Note, this is equivalent to the other <code>placeInWarehouseAntenna</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInWarehouseAntennaResponse
      */
      @RequestLine("POST /api/rest/entity/antenna/placeInWarehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInWarehouseAntennaResponse> placeInWarehouseAntennaWithHttpInfo(PlaceInWarehouseAntennaRequestData body, @QueryMap(encoded=true) PlaceInWarehouseAntennaQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInWarehouseAntenna</code> method in a fluent style.
   */
  public static class PlaceInWarehouseAntennaQueryParams extends HashMap<String, Object> {
    public PlaceInWarehouseAntennaQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in zone
   * Place in zone
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInZoneAntennaResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/placeInZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInZoneAntennaResponse placeInZoneAntenna(@Param("sessionId") String sessionId, PlaceInZoneAntennaRequestData body);

  /**
   * Place in zone
   * Similar to <code>placeInZoneAntenna</code> but it also returns the http response headers .
   * Place in zone
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/placeInZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInZoneAntennaResponse> placeInZoneAntennaWithHttpInfo(@Param("sessionId") String sessionId, PlaceInZoneAntennaRequestData body);


  /**
   * Place in zone
   * Place in zone
   * Note, this is equivalent to the other <code>placeInZoneAntenna</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInZoneAntennaQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInZoneAntennaResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/placeInZone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInZoneAntennaResponse placeInZoneAntenna(PlaceInZoneAntennaRequestData body, @QueryMap(encoded=true) PlaceInZoneAntennaQueryParams queryParams);

  /**
  * Place in zone
  * Place in zone
  * Note, this is equivalent to the other <code>placeInZoneAntenna</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInZoneAntennaResponse
      */
      @RequestLine("POST /api/rest/entity/antenna/placeInZone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInZoneAntennaResponse> placeInZoneAntennaWithHttpInfo(PlaceInZoneAntennaRequestData body, @QueryMap(encoded=true) PlaceInZoneAntennaQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInZoneAntenna</code> method in a fluent style.
   */
  public static class PlaceInZoneAntennaQueryParams extends HashMap<String, Object> {
    public PlaceInZoneAntennaQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Replace object
   * Replace object
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ReplaceObjectAntennaResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/replaceObject?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ReplaceObjectAntennaResponse replaceObjectAntenna(@Param("sessionId") String sessionId, @Param("elid") String elid, ReplaceObjectAntennaRequestData body);

  /**
   * Replace object
   * Similar to <code>replaceObjectAntenna</code> but it also returns the http response headers .
   * Replace object
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/replaceObject?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ReplaceObjectAntennaResponse> replaceObjectAntennaWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ReplaceObjectAntennaRequestData body);


  /**
   * Replace object
   * Replace object
   * Note, this is equivalent to the other <code>replaceObjectAntenna</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ReplaceObjectAntennaQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ReplaceObjectAntennaResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/replaceObject?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ReplaceObjectAntennaResponse replaceObjectAntenna(@Param("elid") String elid, ReplaceObjectAntennaRequestData body, @QueryMap(encoded=true) ReplaceObjectAntennaQueryParams queryParams);

  /**
  * Replace object
  * Replace object
  * Note, this is equivalent to the other <code>replaceObjectAntenna</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ReplaceObjectAntennaResponse
      */
      @RequestLine("POST /api/rest/entity/antenna/{elid}/replaceObject?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ReplaceObjectAntennaResponse> replaceObjectAntennaWithHttpInfo(@Param("elid") String elid, ReplaceObjectAntennaRequestData body, @QueryMap(encoded=true) ReplaceObjectAntennaQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>replaceObjectAntenna</code> method in a fluent style.
   */
  public static class ReplaceObjectAntennaQueryParams extends HashMap<String, Object> {
    public ReplaceObjectAntennaQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Antenna
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateAntennaResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateAntennaResponse updateAntenna(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateAntennaRequestData body);

  /**
   * Modify
   * Similar to <code>updateAntenna</code> but it also returns the http response headers .
   * Modify Antenna
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateAntennaResponse> updateAntennaWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateAntennaRequestData body);


  /**
   * Modify
   * Modify Antenna
   * Note, this is equivalent to the other <code>updateAntenna</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateAntennaQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateAntennaResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateAntennaResponse updateAntenna(@Param("elid") String elid, UpdateAntennaRequestData body, @QueryMap(encoded=true) UpdateAntennaQueryParams queryParams);

  /**
  * Modify
  * Modify Antenna
  * Note, this is equivalent to the other <code>updateAntenna</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateAntennaResponse
      */
      @RequestLine("POST /api/rest/entity/antenna/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateAntennaResponse> updateAntennaWithHttpInfo(@Param("elid") String elid, UpdateAntennaRequestData body, @QueryMap(encoded=true) UpdateAntennaQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateAntenna</code> method in a fluent style.
   */
  public static class UpdateAntennaQueryParams extends HashMap<String, Object> {
    public UpdateAntennaQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesAntennaResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesAntennaResponse updateSystemAttributesAntenna(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesAntennaRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesAntenna</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesAntennaResponse> updateSystemAttributesAntennaWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesAntennaRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesAntenna</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesAntennaQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesAntennaResponse
   */
  @RequestLine("POST /api/rest/entity/antenna/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesAntennaResponse updateSystemAttributesAntenna(@Param("elid") String elid, UpdateSystemAttributesAntennaRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesAntennaQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesAntenna</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesAntennaResponse
      */
      @RequestLine("POST /api/rest/entity/antenna/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesAntennaResponse> updateSystemAttributesAntennaWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesAntennaRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesAntennaQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesAntenna</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesAntennaQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesAntennaQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
