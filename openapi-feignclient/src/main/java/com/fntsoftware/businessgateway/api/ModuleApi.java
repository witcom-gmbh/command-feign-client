package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.ChangeTypeModuleRequestData;
import com.fntsoftware.businessgateway.entities.ChangeTypeModuleResponse;
import com.fntsoftware.businessgateway.entities.DeleteModuleRequestData;
import com.fntsoftware.businessgateway.entities.DeleteModuleResponse;
import com.fntsoftware.businessgateway.entities.ModuleContractsRequestData;
import com.fntsoftware.businessgateway.entities.ModuleContractsResponseData;
import com.fntsoftware.businessgateway.entities.ModuleDeviceMasterRequestData;
import com.fntsoftware.businessgateway.entities.ModuleDeviceMasterResponseData;
import com.fntsoftware.businessgateway.entities.ModuleDuctDataRequest;
import com.fntsoftware.businessgateway.entities.ModuleDuctDataResponse;
import com.fntsoftware.businessgateway.entities.ModuleDuctsRequestData;
import com.fntsoftware.businessgateway.entities.ModuleDuctsResponseData;
import com.fntsoftware.businessgateway.entities.ModuleFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.ModuleFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.ModuleInheritedGeoCoordinatesRequest;
import com.fntsoftware.businessgateway.entities.ModuleInheritedGeoCoordinatesResponse;
import com.fntsoftware.businessgateway.entities.ModuleInstalledSubCardsRecursiveRequest;
import com.fntsoftware.businessgateway.entities.ModuleInstalledSubCardsRecursiveResponse;
import com.fntsoftware.businessgateway.entities.ModuleInstalledSubCardsRequest;
import com.fntsoftware.businessgateway.entities.ModuleInstalledSubCardsResponse;
import com.fntsoftware.businessgateway.entities.ModuleInterfacesRequestData;
import com.fntsoftware.businessgateway.entities.ModuleInterfacesResponseData;
import com.fntsoftware.businessgateway.entities.ModuleIpAddressesRequest;
import com.fntsoftware.businessgateway.entities.ModuleIpAddressesResponse;
import com.fntsoftware.businessgateway.entities.ModuleIpv4AddressesRequestData;
import com.fntsoftware.businessgateway.entities.ModuleIpv4AddressesResponseData;
import com.fntsoftware.businessgateway.entities.ModuleIpv4NetrangesRequestData;
import com.fntsoftware.businessgateway.entities.ModuleIpv4NetrangesResponseData;
import com.fntsoftware.businessgateway.entities.ModuleIpv4NetworksRequestData;
import com.fntsoftware.businessgateway.entities.ModuleIpv4NetworksResponseData;
import com.fntsoftware.businessgateway.entities.ModuleLocationRequest;
import com.fntsoftware.businessgateway.entities.ModuleLocationResponse;
import com.fntsoftware.businessgateway.entities.ModuleLogicalPortsRequestData;
import com.fntsoftware.businessgateway.entities.ModuleLogicalPortsResponseData;
import com.fntsoftware.businessgateway.entities.ModuleMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.ModuleMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.ModuleMultiDuctsRequestData;
import com.fntsoftware.businessgateway.entities.ModuleMultiDuctsResponseData;
import com.fntsoftware.businessgateway.entities.ModuleNetworksAndNetrangesRequest;
import com.fntsoftware.businessgateway.entities.ModuleNetworksAndNetrangesResponse;
import com.fntsoftware.businessgateway.entities.ModuleOperatingSystemInstallationRequestData;
import com.fntsoftware.businessgateway.entities.ModuleOperatingSystemInstallationResponseData;
import com.fntsoftware.businessgateway.entities.ModuleOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.ModuleOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.ModulePersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.ModulePersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.ModulePersonsRequestData;
import com.fntsoftware.businessgateway.entities.ModulePersonsResponseData;
import com.fntsoftware.businessgateway.entities.ModulePhysicalPortsDataExtendedRequest;
import com.fntsoftware.businessgateway.entities.ModulePhysicalPortsDataExtendedResponse;
import com.fntsoftware.businessgateway.entities.ModulePhysicalPortsDataRequestData;
import com.fntsoftware.businessgateway.entities.ModulePhysicalPortsDataResponseData;
import com.fntsoftware.businessgateway.entities.ModulePhysicalPortsPowerExtendedRequest;
import com.fntsoftware.businessgateway.entities.ModulePhysicalPortsPowerExtendedResponse;
import com.fntsoftware.businessgateway.entities.ModulePhysicalPortsPowerRequestData;
import com.fntsoftware.businessgateway.entities.ModulePhysicalPortsPowerResponseData;
import com.fntsoftware.businessgateway.entities.ModuleQueryExtendedGeoCoordinatesRequest;
import com.fntsoftware.businessgateway.entities.ModuleQueryExtendedGeoCoordinatesResponse;
import com.fntsoftware.businessgateway.entities.ModuleQueryExtendedRequest;
import com.fntsoftware.businessgateway.entities.ModuleQueryExtendedResponse;
import com.fntsoftware.businessgateway.entities.ModuleQueryExtendedScrollFirstRequest;
import com.fntsoftware.businessgateway.entities.ModuleQueryExtendedScrollFirstResponse;
import com.fntsoftware.businessgateway.entities.ModuleQueryExtendedScrollMoreRequest;
import com.fntsoftware.businessgateway.entities.ModuleQueryExtendedScrollMoreResponse;
import com.fntsoftware.businessgateway.entities.ModuleQueryRequest;
import com.fntsoftware.businessgateway.entities.ModuleQueryResponse;
import com.fntsoftware.businessgateway.entities.ModuleServicesRequest;
import com.fntsoftware.businessgateway.entities.ModuleServicesResponse;
import com.fntsoftware.businessgateway.entities.ModuleSitesRequestData;
import com.fntsoftware.businessgateway.entities.ModuleSitesResponseData;
import com.fntsoftware.businessgateway.entities.ModuleSlotRequestData;
import com.fntsoftware.businessgateway.entities.ModuleSlotResponseData;
import com.fntsoftware.businessgateway.entities.ModuleSwitchCabinetRequestData;
import com.fntsoftware.businessgateway.entities.ModuleSwitchCabinetResponseData;
import com.fntsoftware.businessgateway.entities.ModuleSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.ModuleSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.ModuleVirtualSwitchesRequestData;
import com.fntsoftware.businessgateway.entities.ModuleVirtualSwitchesResponseData;
import com.fntsoftware.businessgateway.entities.ModuleVlansAtSlotRequest;
import com.fntsoftware.businessgateway.entities.ModuleVlansAtSlotResponse;
import com.fntsoftware.businessgateway.entities.ModuleVlansRequest;
import com.fntsoftware.businessgateway.entities.ModuleVlansResponse;
import com.fntsoftware.businessgateway.entities.ModuleWarehouseRequestData;
import com.fntsoftware.businessgateway.entities.ModuleWarehouseResponseData;
import com.fntsoftware.businessgateway.entities.ModuleZoneRequestData;
import com.fntsoftware.businessgateway.entities.ModuleZoneResponseData;
import com.fntsoftware.businessgateway.entities.MoveToCabinetModuleRequestData;
import com.fntsoftware.businessgateway.entities.MoveToCabinetModuleResponse;
import com.fntsoftware.businessgateway.entities.MoveToSlotModuleRequestData;
import com.fntsoftware.businessgateway.entities.MoveToSlotModuleResponse;
import com.fntsoftware.businessgateway.entities.MoveToWarehouseModuleRequestData;
import com.fntsoftware.businessgateway.entities.MoveToWarehouseModuleResponse;
import com.fntsoftware.businessgateway.entities.MoveToZoneModuleRequestData;
import com.fntsoftware.businessgateway.entities.MoveToZoneModuleResponse;
import com.fntsoftware.businessgateway.entities.PlaceInCabinetModuleRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInCabinetModuleResponse;
import com.fntsoftware.businessgateway.entities.PlaceInSlotModuleRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInSlotModuleResponse;
import com.fntsoftware.businessgateway.entities.PlaceInWarehouseModuleRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInWarehouseModuleResponse;
import com.fntsoftware.businessgateway.entities.PlaceInZoneModuleRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInZoneModuleResponse;
import com.fntsoftware.businessgateway.entities.ReplaceObjectModuleRequestData;
import com.fntsoftware.businessgateway.entities.ReplaceObjectModuleResponse;
import com.fntsoftware.businessgateway.entities.UpdateModuleRequestData;
import com.fntsoftware.businessgateway.entities.UpdateModuleResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesModuleRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesModuleResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface ModuleApi extends ApiClient.Api {


  /**
   * Change type
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ChangeTypeModuleResponse
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/changeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeTypeModuleResponse changeTypeModule(@Param("sessionId") String sessionId, @Param("elid") String elid, ChangeTypeModuleRequestData body);

  /**
   * Change type
   * Similar to <code>changeTypeModule</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/changeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeTypeModuleResponse> changeTypeModuleWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChangeTypeModuleRequestData body);


  /**
   * Change type
   * 
   * Note, this is equivalent to the other <code>changeTypeModule</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChangeTypeModuleQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChangeTypeModuleResponse
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/changeType?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChangeTypeModuleResponse changeTypeModule(@Param("elid") String elid, ChangeTypeModuleRequestData body, @QueryMap(encoded=true) ChangeTypeModuleQueryParams queryParams);

  /**
  * Change type
  * 
  * Note, this is equivalent to the other <code>changeTypeModule</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChangeTypeModuleResponse
      */
      @RequestLine("POST /api/rest/entity/module/{elid}/changeType?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChangeTypeModuleResponse> changeTypeModuleWithHttpInfo(@Param("elid") String elid, ChangeTypeModuleRequestData body, @QueryMap(encoded=true) ChangeTypeModuleQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>changeTypeModule</code> method in a fluent style.
   */
  public static class ChangeTypeModuleQueryParams extends HashMap<String, Object> {
    public ChangeTypeModuleQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete module
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteModuleResponse
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteModuleResponse deleteModule(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteModuleRequestData body);

  /**
   * Delete
   * Similar to <code>deleteModule</code> but it also returns the http response headers .
   * Delete module
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteModuleResponse> deleteModuleWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteModuleRequestData body);


  /**
   * Delete
   * Delete module
   * Note, this is equivalent to the other <code>deleteModule</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteModuleQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteModuleResponse
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteModuleResponse deleteModule(@Param("elid") String elid, DeleteModuleRequestData body, @QueryMap(encoded=true) DeleteModuleQueryParams queryParams);

  /**
  * Delete
  * Delete module
  * Note, this is equivalent to the other <code>deleteModule</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteModuleResponse
      */
      @RequestLine("POST /api/rest/entity/module/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteModuleResponse> deleteModuleWithHttpInfo(@Param("elid") String elid, DeleteModuleRequestData body, @QueryMap(encoded=true) DeleteModuleQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteModule</code> method in a fluent style.
   */
  public static class DeleteModuleQueryParams extends HashMap<String, Object> {
    public DeleteModuleQueryParams sessionId(final String value) {
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
   * @return ModuleContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ModuleContractsResponseData moduleContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>moduleContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ModuleContractsResponseData> moduleContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>moduleContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ModuleContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ModuleContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ModuleContractsResponseData moduleContracts(@Param("elid") String elid, ModuleContractsRequestData body, @QueryMap(encoded=true) ModuleContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>moduleContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ModuleContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/module/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ModuleContractsResponseData> moduleContractsWithHttpInfo(@Param("elid") String elid, ModuleContractsRequestData body, @QueryMap(encoded=true) ModuleContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moduleContracts</code> method in a fluent style.
   */
  public static class ModuleContractsQueryParams extends HashMap<String, Object> {
    public ModuleContractsQueryParams sessionId(final String value) {
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
   * @return ModuleDeviceMasterResponseData
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ModuleDeviceMasterResponseData moduleDeviceMaster(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleDeviceMasterRequestData body);

  /**
   * Get relations to Device master entities
   * Similar to <code>moduleDeviceMaster</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ModuleDeviceMasterResponseData> moduleDeviceMasterWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleDeviceMasterRequestData body);


  /**
   * Get relations to Device master entities
   * 
   * Note, this is equivalent to the other <code>moduleDeviceMaster</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ModuleDeviceMasterQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ModuleDeviceMasterResponseData
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ModuleDeviceMasterResponseData moduleDeviceMaster(@Param("elid") String elid, ModuleDeviceMasterRequestData body, @QueryMap(encoded=true) ModuleDeviceMasterQueryParams queryParams);

  /**
  * Get relations to Device master entities
  * 
  * Note, this is equivalent to the other <code>moduleDeviceMaster</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ModuleDeviceMasterResponseData
      */
      @RequestLine("POST /api/rest/entity/module/{elid}/DeviceMaster?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ModuleDeviceMasterResponseData> moduleDeviceMasterWithHttpInfo(@Param("elid") String elid, ModuleDeviceMasterRequestData body, @QueryMap(encoded=true) ModuleDeviceMasterQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moduleDeviceMaster</code> method in a fluent style.
   */
  public static class ModuleDeviceMasterQueryParams extends HashMap<String, Object> {
    public ModuleDeviceMasterQueryParams sessionId(final String value) {
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
   * @return ModuleDuctDataResponse
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/DuctData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ModuleDuctDataResponse moduleDuctData(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleDuctDataRequest body);

  /**
   * Query duct data
   * Similar to <code>moduleDuctData</code> but it also returns the http response headers .
   * Query associated ducts and multipipes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/DuctData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ModuleDuctDataResponse> moduleDuctDataWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleDuctDataRequest body);


  /**
   * Query duct data
   * Query associated ducts and multipipes
   * Note, this is equivalent to the other <code>moduleDuctData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ModuleDuctDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ModuleDuctDataResponse
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/DuctData?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ModuleDuctDataResponse moduleDuctData(@Param("elid") String elid, ModuleDuctDataRequest body, @QueryMap(encoded=true) ModuleDuctDataQueryParams queryParams);

  /**
  * Query duct data
  * Query associated ducts and multipipes
  * Note, this is equivalent to the other <code>moduleDuctData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ModuleDuctDataResponse
      */
      @RequestLine("POST /api/rest/entity/module/{elid}/DuctData?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ModuleDuctDataResponse> moduleDuctDataWithHttpInfo(@Param("elid") String elid, ModuleDuctDataRequest body, @QueryMap(encoded=true) ModuleDuctDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moduleDuctData</code> method in a fluent style.
   */
  public static class ModuleDuctDataQueryParams extends HashMap<String, Object> {
    public ModuleDuctDataQueryParams sessionId(final String value) {
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
   * @return ModuleDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/Ducts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ModuleDuctsResponseData moduleDucts(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleDuctsRequestData body);

  /**
   * Get relations to Duct entities
   * Similar to <code>moduleDucts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/Ducts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ModuleDuctsResponseData> moduleDuctsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleDuctsRequestData body);


  /**
   * Get relations to Duct entities
   * 
   * Note, this is equivalent to the other <code>moduleDucts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ModuleDuctsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ModuleDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/Ducts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ModuleDuctsResponseData moduleDucts(@Param("elid") String elid, ModuleDuctsRequestData body, @QueryMap(encoded=true) ModuleDuctsQueryParams queryParams);

  /**
  * Get relations to Duct entities
  * 
  * Note, this is equivalent to the other <code>moduleDucts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ModuleDuctsResponseData
      */
      @RequestLine("POST /api/rest/entity/module/{elid}/Ducts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ModuleDuctsResponseData> moduleDuctsWithHttpInfo(@Param("elid") String elid, ModuleDuctsRequestData body, @QueryMap(encoded=true) ModuleDuctsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moduleDucts</code> method in a fluent style.
   */
  public static class ModuleDuctsQueryParams extends HashMap<String, Object> {
    public ModuleDuctsQueryParams sessionId(final String value) {
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
   * @return ModuleFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ModuleFrameContractsResponseData moduleFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>moduleFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ModuleFrameContractsResponseData> moduleFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>moduleFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ModuleFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ModuleFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ModuleFrameContractsResponseData moduleFrameContracts(@Param("elid") String elid, ModuleFrameContractsRequestData body, @QueryMap(encoded=true) ModuleFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>moduleFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ModuleFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/module/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ModuleFrameContractsResponseData> moduleFrameContractsWithHttpInfo(@Param("elid") String elid, ModuleFrameContractsRequestData body, @QueryMap(encoded=true) ModuleFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moduleFrameContracts</code> method in a fluent style.
   */
  public static class ModuleFrameContractsQueryParams extends HashMap<String, Object> {
    public ModuleFrameContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query inherited coordinates
   * Query the own coordinates of an object or inherit them from parents
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ModuleInheritedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/module/inheritedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ModuleInheritedGeoCoordinatesResponse moduleInheritedGeoCoordinates(@Param("sessionId") String sessionId, ModuleInheritedGeoCoordinatesRequest body);

  /**
   * Query inherited coordinates
   * Similar to <code>moduleInheritedGeoCoordinates</code> but it also returns the http response headers .
   * Query the own coordinates of an object or inherit them from parents
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/inheritedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ModuleInheritedGeoCoordinatesResponse> moduleInheritedGeoCoordinatesWithHttpInfo(@Param("sessionId") String sessionId, ModuleInheritedGeoCoordinatesRequest body);


  /**
   * Query inherited coordinates
   * Query the own coordinates of an object or inherit them from parents
   * Note, this is equivalent to the other <code>moduleInheritedGeoCoordinates</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ModuleInheritedGeoCoordinatesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ModuleInheritedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/module/inheritedGeoCoordinates?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ModuleInheritedGeoCoordinatesResponse moduleInheritedGeoCoordinates(ModuleInheritedGeoCoordinatesRequest body, @QueryMap(encoded=true) ModuleInheritedGeoCoordinatesQueryParams queryParams);

  /**
  * Query inherited coordinates
  * Query the own coordinates of an object or inherit them from parents
  * Note, this is equivalent to the other <code>moduleInheritedGeoCoordinates</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ModuleInheritedGeoCoordinatesResponse
      */
      @RequestLine("POST /api/rest/entity/module/inheritedGeoCoordinates?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ModuleInheritedGeoCoordinatesResponse> moduleInheritedGeoCoordinatesWithHttpInfo(ModuleInheritedGeoCoordinatesRequest body, @QueryMap(encoded=true) ModuleInheritedGeoCoordinatesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moduleInheritedGeoCoordinates</code> method in a fluent style.
   */
  public static class ModuleInheritedGeoCoordinatesQueryParams extends HashMap<String, Object> {
    public ModuleInheritedGeoCoordinatesQueryParams sessionId(final String value) {
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
   * @return ModuleInstalledSubCardsResponse
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/InstalledSubCards?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ModuleInstalledSubCardsResponse moduleInstalledSubCards(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleInstalledSubCardsRequest body);

  /**
   * Query installed subcards
   * Similar to <code>moduleInstalledSubCards</code> but it also returns the http response headers .
   * Queries installed subcards. Only direct subcards will be returned. Free slot positions will not be returned.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/InstalledSubCards?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ModuleInstalledSubCardsResponse> moduleInstalledSubCardsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleInstalledSubCardsRequest body);


  /**
   * Query installed subcards
   * Queries installed subcards. Only direct subcards will be returned. Free slot positions will not be returned.
   * Note, this is equivalent to the other <code>moduleInstalledSubCards</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ModuleInstalledSubCardsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ModuleInstalledSubCardsResponse
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/InstalledSubCards?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ModuleInstalledSubCardsResponse moduleInstalledSubCards(@Param("elid") String elid, ModuleInstalledSubCardsRequest body, @QueryMap(encoded=true) ModuleInstalledSubCardsQueryParams queryParams);

  /**
  * Query installed subcards
  * Queries installed subcards. Only direct subcards will be returned. Free slot positions will not be returned.
  * Note, this is equivalent to the other <code>moduleInstalledSubCards</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ModuleInstalledSubCardsResponse
      */
      @RequestLine("POST /api/rest/entity/module/{elid}/InstalledSubCards?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ModuleInstalledSubCardsResponse> moduleInstalledSubCardsWithHttpInfo(@Param("elid") String elid, ModuleInstalledSubCardsRequest body, @QueryMap(encoded=true) ModuleInstalledSubCardsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moduleInstalledSubCards</code> method in a fluent style.
   */
  public static class ModuleInstalledSubCardsQueryParams extends HashMap<String, Object> {
    public ModuleInstalledSubCardsQueryParams sessionId(final String value) {
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
   * @return ModuleInstalledSubCardsRecursiveResponse
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/InstalledSubCardsRecursive?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ModuleInstalledSubCardsRecursiveResponse moduleInstalledSubCardsRecursive(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleInstalledSubCardsRecursiveRequest body);

  /**
   * Query installed sub-cards recursively
   * Similar to <code>moduleInstalledSubCardsRecursive</code> but it also returns the http response headers .
   * Queries installed sub-cards from a device. Free slot positions are not supplied.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/InstalledSubCardsRecursive?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ModuleInstalledSubCardsRecursiveResponse> moduleInstalledSubCardsRecursiveWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleInstalledSubCardsRecursiveRequest body);


  /**
   * Query installed sub-cards recursively
   * Queries installed sub-cards from a device. Free slot positions are not supplied.
   * Note, this is equivalent to the other <code>moduleInstalledSubCardsRecursive</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ModuleInstalledSubCardsRecursiveQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ModuleInstalledSubCardsRecursiveResponse
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/InstalledSubCardsRecursive?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ModuleInstalledSubCardsRecursiveResponse moduleInstalledSubCardsRecursive(@Param("elid") String elid, ModuleInstalledSubCardsRecursiveRequest body, @QueryMap(encoded=true) ModuleInstalledSubCardsRecursiveQueryParams queryParams);

  /**
  * Query installed sub-cards recursively
  * Queries installed sub-cards from a device. Free slot positions are not supplied.
  * Note, this is equivalent to the other <code>moduleInstalledSubCardsRecursive</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ModuleInstalledSubCardsRecursiveResponse
      */
      @RequestLine("POST /api/rest/entity/module/{elid}/InstalledSubCardsRecursive?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ModuleInstalledSubCardsRecursiveResponse> moduleInstalledSubCardsRecursiveWithHttpInfo(@Param("elid") String elid, ModuleInstalledSubCardsRecursiveRequest body, @QueryMap(encoded=true) ModuleInstalledSubCardsRecursiveQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moduleInstalledSubCardsRecursive</code> method in a fluent style.
   */
  public static class ModuleInstalledSubCardsRecursiveQueryParams extends HashMap<String, Object> {
    public ModuleInstalledSubCardsRecursiveQueryParams sessionId(final String value) {
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
   * @return ModuleInterfacesResponseData
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ModuleInterfacesResponseData moduleInterfaces(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleInterfacesRequestData body);

  /**
   * Get relations to Interface entities
   * Similar to <code>moduleInterfaces</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ModuleInterfacesResponseData> moduleInterfacesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleInterfacesRequestData body);


  /**
   * Get relations to Interface entities
   * 
   * Note, this is equivalent to the other <code>moduleInterfaces</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ModuleInterfacesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ModuleInterfacesResponseData
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ModuleInterfacesResponseData moduleInterfaces(@Param("elid") String elid, ModuleInterfacesRequestData body, @QueryMap(encoded=true) ModuleInterfacesQueryParams queryParams);

  /**
  * Get relations to Interface entities
  * 
  * Note, this is equivalent to the other <code>moduleInterfaces</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ModuleInterfacesResponseData
      */
      @RequestLine("POST /api/rest/entity/module/{elid}/Interfaces?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ModuleInterfacesResponseData> moduleInterfacesWithHttpInfo(@Param("elid") String elid, ModuleInterfacesRequestData body, @QueryMap(encoded=true) ModuleInterfacesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moduleInterfaces</code> method in a fluent style.
   */
  public static class ModuleInterfacesQueryParams extends HashMap<String, Object> {
    public ModuleInterfacesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * IP addresses
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ModuleIpAddressesResponse
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ModuleIpAddressesResponse moduleIpAddresses(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleIpAddressesRequest body);

  /**
   * IP addresses
   * Similar to <code>moduleIpAddresses</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ModuleIpAddressesResponse> moduleIpAddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleIpAddressesRequest body);


  /**
   * IP addresses
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>moduleIpAddresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ModuleIpAddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ModuleIpAddressesResponse
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ModuleIpAddressesResponse moduleIpAddresses(@Param("elid") String elid, ModuleIpAddressesRequest body, @QueryMap(encoded=true) ModuleIpAddressesQueryParams queryParams);

  /**
  * IP addresses
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>moduleIpAddresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ModuleIpAddressesResponse
      */
      @RequestLine("POST /api/rest/entity/module/{elid}/IpAddresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ModuleIpAddressesResponse> moduleIpAddressesWithHttpInfo(@Param("elid") String elid, ModuleIpAddressesRequest body, @QueryMap(encoded=true) ModuleIpAddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moduleIpAddresses</code> method in a fluent style.
   */
  public static class ModuleIpAddressesQueryParams extends HashMap<String, Object> {
    public ModuleIpAddressesQueryParams sessionId(final String value) {
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
   * @return ModuleIpv4AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ModuleIpv4AddressesResponseData moduleIpv4Addresses(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleIpv4AddressesRequestData body);

  /**
   * Get relations to IPv4 address entities
   * Similar to <code>moduleIpv4Addresses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ModuleIpv4AddressesResponseData> moduleIpv4AddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleIpv4AddressesRequestData body);


  /**
   * Get relations to IPv4 address entities
   * 
   * Note, this is equivalent to the other <code>moduleIpv4Addresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ModuleIpv4AddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ModuleIpv4AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ModuleIpv4AddressesResponseData moduleIpv4Addresses(@Param("elid") String elid, ModuleIpv4AddressesRequestData body, @QueryMap(encoded=true) ModuleIpv4AddressesQueryParams queryParams);

  /**
  * Get relations to IPv4 address entities
  * 
  * Note, this is equivalent to the other <code>moduleIpv4Addresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ModuleIpv4AddressesResponseData
      */
      @RequestLine("POST /api/rest/entity/module/{elid}/Ipv4Addresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ModuleIpv4AddressesResponseData> moduleIpv4AddressesWithHttpInfo(@Param("elid") String elid, ModuleIpv4AddressesRequestData body, @QueryMap(encoded=true) ModuleIpv4AddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moduleIpv4Addresses</code> method in a fluent style.
   */
  public static class ModuleIpv4AddressesQueryParams extends HashMap<String, Object> {
    public ModuleIpv4AddressesQueryParams sessionId(final String value) {
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
   * @return ModuleIpv4NetrangesResponseData
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ModuleIpv4NetrangesResponseData moduleIpv4Netranges(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleIpv4NetrangesRequestData body);

  /**
   * Get relations to IPv4 netrange entities
   * Similar to <code>moduleIpv4Netranges</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ModuleIpv4NetrangesResponseData> moduleIpv4NetrangesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleIpv4NetrangesRequestData body);


  /**
   * Get relations to IPv4 netrange entities
   * 
   * Note, this is equivalent to the other <code>moduleIpv4Netranges</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ModuleIpv4NetrangesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ModuleIpv4NetrangesResponseData
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ModuleIpv4NetrangesResponseData moduleIpv4Netranges(@Param("elid") String elid, ModuleIpv4NetrangesRequestData body, @QueryMap(encoded=true) ModuleIpv4NetrangesQueryParams queryParams);

  /**
  * Get relations to IPv4 netrange entities
  * 
  * Note, this is equivalent to the other <code>moduleIpv4Netranges</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ModuleIpv4NetrangesResponseData
      */
      @RequestLine("POST /api/rest/entity/module/{elid}/Ipv4Netranges?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ModuleIpv4NetrangesResponseData> moduleIpv4NetrangesWithHttpInfo(@Param("elid") String elid, ModuleIpv4NetrangesRequestData body, @QueryMap(encoded=true) ModuleIpv4NetrangesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moduleIpv4Netranges</code> method in a fluent style.
   */
  public static class ModuleIpv4NetrangesQueryParams extends HashMap<String, Object> {
    public ModuleIpv4NetrangesQueryParams sessionId(final String value) {
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
   * @return ModuleIpv4NetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ModuleIpv4NetworksResponseData moduleIpv4Networks(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleIpv4NetworksRequestData body);

  /**
   * Get relations to IPv4 Network entities
   * Similar to <code>moduleIpv4Networks</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ModuleIpv4NetworksResponseData> moduleIpv4NetworksWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleIpv4NetworksRequestData body);


  /**
   * Get relations to IPv4 Network entities
   * 
   * Note, this is equivalent to the other <code>moduleIpv4Networks</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ModuleIpv4NetworksQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ModuleIpv4NetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ModuleIpv4NetworksResponseData moduleIpv4Networks(@Param("elid") String elid, ModuleIpv4NetworksRequestData body, @QueryMap(encoded=true) ModuleIpv4NetworksQueryParams queryParams);

  /**
  * Get relations to IPv4 Network entities
  * 
  * Note, this is equivalent to the other <code>moduleIpv4Networks</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ModuleIpv4NetworksResponseData
      */
      @RequestLine("POST /api/rest/entity/module/{elid}/Ipv4Networks?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ModuleIpv4NetworksResponseData> moduleIpv4NetworksWithHttpInfo(@Param("elid") String elid, ModuleIpv4NetworksRequestData body, @QueryMap(encoded=true) ModuleIpv4NetworksQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moduleIpv4Networks</code> method in a fluent style.
   */
  public static class ModuleIpv4NetworksQueryParams extends HashMap<String, Object> {
    public ModuleIpv4NetworksQueryParams sessionId(final String value) {
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
   * @return ModuleLocationResponse
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/Location?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ModuleLocationResponse moduleLocation(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleLocationRequest body);

  /**
   * Location
   * Similar to <code>moduleLocation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/Location?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ModuleLocationResponse> moduleLocationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleLocationRequest body);


  /**
   * Location
   * 
   * Note, this is equivalent to the other <code>moduleLocation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ModuleLocationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ModuleLocationResponse
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/Location?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ModuleLocationResponse moduleLocation(@Param("elid") String elid, ModuleLocationRequest body, @QueryMap(encoded=true) ModuleLocationQueryParams queryParams);

  /**
  * Location
  * 
  * Note, this is equivalent to the other <code>moduleLocation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ModuleLocationResponse
      */
      @RequestLine("POST /api/rest/entity/module/{elid}/Location?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ModuleLocationResponse> moduleLocationWithHttpInfo(@Param("elid") String elid, ModuleLocationRequest body, @QueryMap(encoded=true) ModuleLocationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moduleLocation</code> method in a fluent style.
   */
  public static class ModuleLocationQueryParams extends HashMap<String, Object> {
    public ModuleLocationQueryParams sessionId(final String value) {
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
   * @return ModuleLogicalPortsResponseData
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ModuleLogicalPortsResponseData moduleLogicalPorts(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleLogicalPortsRequestData body);

  /**
   * Get relations to Logical port entities
   * Similar to <code>moduleLogicalPorts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ModuleLogicalPortsResponseData> moduleLogicalPortsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleLogicalPortsRequestData body);


  /**
   * Get relations to Logical port entities
   * 
   * Note, this is equivalent to the other <code>moduleLogicalPorts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ModuleLogicalPortsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ModuleLogicalPortsResponseData
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ModuleLogicalPortsResponseData moduleLogicalPorts(@Param("elid") String elid, ModuleLogicalPortsRequestData body, @QueryMap(encoded=true) ModuleLogicalPortsQueryParams queryParams);

  /**
  * Get relations to Logical port entities
  * 
  * Note, this is equivalent to the other <code>moduleLogicalPorts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ModuleLogicalPortsResponseData
      */
      @RequestLine("POST /api/rest/entity/module/{elid}/LogicalPorts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ModuleLogicalPortsResponseData> moduleLogicalPortsWithHttpInfo(@Param("elid") String elid, ModuleLogicalPortsRequestData body, @QueryMap(encoded=true) ModuleLogicalPortsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moduleLogicalPorts</code> method in a fluent style.
   */
  public static class ModuleLogicalPortsQueryParams extends HashMap<String, Object> {
    public ModuleLogicalPortsQueryParams sessionId(final String value) {
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
   * @return ModuleMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ModuleMaintenanceContractsResponseData moduleMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>moduleMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ModuleMaintenanceContractsResponseData> moduleMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>moduleMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ModuleMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ModuleMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ModuleMaintenanceContractsResponseData moduleMaintenanceContracts(@Param("elid") String elid, ModuleMaintenanceContractsRequestData body, @QueryMap(encoded=true) ModuleMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>moduleMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ModuleMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/module/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ModuleMaintenanceContractsResponseData> moduleMaintenanceContractsWithHttpInfo(@Param("elid") String elid, ModuleMaintenanceContractsRequestData body, @QueryMap(encoded=true) ModuleMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moduleMaintenanceContracts</code> method in a fluent style.
   */
  public static class ModuleMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public ModuleMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return ModuleMultiDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/MultiDucts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ModuleMultiDuctsResponseData moduleMultiDucts(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleMultiDuctsRequestData body);

  /**
   * Get relations to Multiducts entities
   * Similar to <code>moduleMultiDucts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/MultiDucts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ModuleMultiDuctsResponseData> moduleMultiDuctsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleMultiDuctsRequestData body);


  /**
   * Get relations to Multiducts entities
   * 
   * Note, this is equivalent to the other <code>moduleMultiDucts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ModuleMultiDuctsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ModuleMultiDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/MultiDucts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ModuleMultiDuctsResponseData moduleMultiDucts(@Param("elid") String elid, ModuleMultiDuctsRequestData body, @QueryMap(encoded=true) ModuleMultiDuctsQueryParams queryParams);

  /**
  * Get relations to Multiducts entities
  * 
  * Note, this is equivalent to the other <code>moduleMultiDucts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ModuleMultiDuctsResponseData
      */
      @RequestLine("POST /api/rest/entity/module/{elid}/MultiDucts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ModuleMultiDuctsResponseData> moduleMultiDuctsWithHttpInfo(@Param("elid") String elid, ModuleMultiDuctsRequestData body, @QueryMap(encoded=true) ModuleMultiDuctsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moduleMultiDucts</code> method in a fluent style.
   */
  public static class ModuleMultiDuctsQueryParams extends HashMap<String, Object> {
    public ModuleMultiDuctsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Nets / Net ranges
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ModuleNetworksAndNetrangesResponse
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ModuleNetworksAndNetrangesResponse moduleNetworksAndNetranges(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleNetworksAndNetrangesRequest body);

  /**
   * Nets / Net ranges
   * Similar to <code>moduleNetworksAndNetranges</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ModuleNetworksAndNetrangesResponse> moduleNetworksAndNetrangesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleNetworksAndNetrangesRequest body);


  /**
   * Nets / Net ranges
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>moduleNetworksAndNetranges</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ModuleNetworksAndNetrangesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ModuleNetworksAndNetrangesResponse
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ModuleNetworksAndNetrangesResponse moduleNetworksAndNetranges(@Param("elid") String elid, ModuleNetworksAndNetrangesRequest body, @QueryMap(encoded=true) ModuleNetworksAndNetrangesQueryParams queryParams);

  /**
  * Nets / Net ranges
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>moduleNetworksAndNetranges</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ModuleNetworksAndNetrangesResponse
      */
      @RequestLine("POST /api/rest/entity/module/{elid}/NetworksAndNetranges?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ModuleNetworksAndNetrangesResponse> moduleNetworksAndNetrangesWithHttpInfo(@Param("elid") String elid, ModuleNetworksAndNetrangesRequest body, @QueryMap(encoded=true) ModuleNetworksAndNetrangesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moduleNetworksAndNetranges</code> method in a fluent style.
   */
  public static class ModuleNetworksAndNetrangesQueryParams extends HashMap<String, Object> {
    public ModuleNetworksAndNetrangesQueryParams sessionId(final String value) {
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
   * @return ModuleOperatingSystemInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ModuleOperatingSystemInstallationResponseData moduleOperatingSystemInstallation(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleOperatingSystemInstallationRequestData body);

  /**
   * Get relations to Operating system installation entities
   * Similar to <code>moduleOperatingSystemInstallation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ModuleOperatingSystemInstallationResponseData> moduleOperatingSystemInstallationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleOperatingSystemInstallationRequestData body);


  /**
   * Get relations to Operating system installation entities
   * 
   * Note, this is equivalent to the other <code>moduleOperatingSystemInstallation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ModuleOperatingSystemInstallationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ModuleOperatingSystemInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ModuleOperatingSystemInstallationResponseData moduleOperatingSystemInstallation(@Param("elid") String elid, ModuleOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) ModuleOperatingSystemInstallationQueryParams queryParams);

  /**
  * Get relations to Operating system installation entities
  * 
  * Note, this is equivalent to the other <code>moduleOperatingSystemInstallation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ModuleOperatingSystemInstallationResponseData
      */
      @RequestLine("POST /api/rest/entity/module/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ModuleOperatingSystemInstallationResponseData> moduleOperatingSystemInstallationWithHttpInfo(@Param("elid") String elid, ModuleOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) ModuleOperatingSystemInstallationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moduleOperatingSystemInstallation</code> method in a fluent style.
   */
  public static class ModuleOperatingSystemInstallationQueryParams extends HashMap<String, Object> {
    public ModuleOperatingSystemInstallationQueryParams sessionId(final String value) {
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
   * @return ModuleOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ModuleOrganizationsResponseData moduleOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>moduleOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ModuleOrganizationsResponseData> moduleOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>moduleOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ModuleOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ModuleOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ModuleOrganizationsResponseData moduleOrganizations(@Param("elid") String elid, ModuleOrganizationsRequestData body, @QueryMap(encoded=true) ModuleOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>moduleOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ModuleOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/module/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ModuleOrganizationsResponseData> moduleOrganizationsWithHttpInfo(@Param("elid") String elid, ModuleOrganizationsRequestData body, @QueryMap(encoded=true) ModuleOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moduleOrganizations</code> method in a fluent style.
   */
  public static class ModuleOrganizationsQueryParams extends HashMap<String, Object> {
    public ModuleOrganizationsQueryParams sessionId(final String value) {
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
   * @return ModulePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ModulePersonGroupsResponseData modulePersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, ModulePersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>modulePersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ModulePersonGroupsResponseData> modulePersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ModulePersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>modulePersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ModulePersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ModulePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ModulePersonGroupsResponseData modulePersonGroups(@Param("elid") String elid, ModulePersonGroupsRequestData body, @QueryMap(encoded=true) ModulePersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>modulePersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ModulePersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/module/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ModulePersonGroupsResponseData> modulePersonGroupsWithHttpInfo(@Param("elid") String elid, ModulePersonGroupsRequestData body, @QueryMap(encoded=true) ModulePersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>modulePersonGroups</code> method in a fluent style.
   */
  public static class ModulePersonGroupsQueryParams extends HashMap<String, Object> {
    public ModulePersonGroupsQueryParams sessionId(final String value) {
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
   * @return ModulePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ModulePersonsResponseData modulePersons(@Param("sessionId") String sessionId, @Param("elid") String elid, ModulePersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>modulePersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ModulePersonsResponseData> modulePersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ModulePersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>modulePersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ModulePersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ModulePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ModulePersonsResponseData modulePersons(@Param("elid") String elid, ModulePersonsRequestData body, @QueryMap(encoded=true) ModulePersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>modulePersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ModulePersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/module/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ModulePersonsResponseData> modulePersonsWithHttpInfo(@Param("elid") String elid, ModulePersonsRequestData body, @QueryMap(encoded=true) ModulePersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>modulePersons</code> method in a fluent style.
   */
  public static class ModulePersonsQueryParams extends HashMap<String, Object> {
    public ModulePersonsQueryParams sessionId(final String value) {
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
   * @return ModulePhysicalPortsDataResponseData
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ModulePhysicalPortsDataResponseData modulePhysicalPortsData(@Param("sessionId") String sessionId, @Param("elid") String elid, ModulePhysicalPortsDataRequestData body);

  /**
   * Get relations to Physical port (data) entities
   * Similar to <code>modulePhysicalPortsData</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ModulePhysicalPortsDataResponseData> modulePhysicalPortsDataWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ModulePhysicalPortsDataRequestData body);


  /**
   * Get relations to Physical port (data) entities
   * 
   * Note, this is equivalent to the other <code>modulePhysicalPortsData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ModulePhysicalPortsDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ModulePhysicalPortsDataResponseData
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ModulePhysicalPortsDataResponseData modulePhysicalPortsData(@Param("elid") String elid, ModulePhysicalPortsDataRequestData body, @QueryMap(encoded=true) ModulePhysicalPortsDataQueryParams queryParams);

  /**
  * Get relations to Physical port (data) entities
  * 
  * Note, this is equivalent to the other <code>modulePhysicalPortsData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ModulePhysicalPortsDataResponseData
      */
      @RequestLine("POST /api/rest/entity/module/{elid}/PhysicalPortsData?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ModulePhysicalPortsDataResponseData> modulePhysicalPortsDataWithHttpInfo(@Param("elid") String elid, ModulePhysicalPortsDataRequestData body, @QueryMap(encoded=true) ModulePhysicalPortsDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>modulePhysicalPortsData</code> method in a fluent style.
   */
  public static class ModulePhysicalPortsDataQueryParams extends HashMap<String, Object> {
    public ModulePhysicalPortsDataQueryParams sessionId(final String value) {
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
   * @return ModulePhysicalPortsDataExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/PhysicalPortsDataExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ModulePhysicalPortsDataExtendedResponse modulePhysicalPortsDataExtended(@Param("sessionId") String sessionId, @Param("elid") String elid, ModulePhysicalPortsDataExtendedRequest body);

  /**
   * Query physical ports data extended
   * Similar to <code>modulePhysicalPortsDataExtended</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/PhysicalPortsDataExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ModulePhysicalPortsDataExtendedResponse> modulePhysicalPortsDataExtendedWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ModulePhysicalPortsDataExtendedRequest body);


  /**
   * Query physical ports data extended
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>modulePhysicalPortsDataExtended</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ModulePhysicalPortsDataExtendedQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ModulePhysicalPortsDataExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/PhysicalPortsDataExtended?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ModulePhysicalPortsDataExtendedResponse modulePhysicalPortsDataExtended(@Param("elid") String elid, ModulePhysicalPortsDataExtendedRequest body, @QueryMap(encoded=true) ModulePhysicalPortsDataExtendedQueryParams queryParams);

  /**
  * Query physical ports data extended
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>modulePhysicalPortsDataExtended</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ModulePhysicalPortsDataExtendedResponse
      */
      @RequestLine("POST /api/rest/entity/module/{elid}/PhysicalPortsDataExtended?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ModulePhysicalPortsDataExtendedResponse> modulePhysicalPortsDataExtendedWithHttpInfo(@Param("elid") String elid, ModulePhysicalPortsDataExtendedRequest body, @QueryMap(encoded=true) ModulePhysicalPortsDataExtendedQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>modulePhysicalPortsDataExtended</code> method in a fluent style.
   */
  public static class ModulePhysicalPortsDataExtendedQueryParams extends HashMap<String, Object> {
    public ModulePhysicalPortsDataExtendedQueryParams sessionId(final String value) {
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
   * @return ModulePhysicalPortsPowerResponseData
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ModulePhysicalPortsPowerResponseData modulePhysicalPortsPower(@Param("sessionId") String sessionId, @Param("elid") String elid, ModulePhysicalPortsPowerRequestData body);

  /**
   * Get relations to Physical port (power) entities
   * Similar to <code>modulePhysicalPortsPower</code> but it also returns the http response headers .
   * For more information call the basic query of the power port entity
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ModulePhysicalPortsPowerResponseData> modulePhysicalPortsPowerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ModulePhysicalPortsPowerRequestData body);


  /**
   * Get relations to Physical port (power) entities
   * For more information call the basic query of the power port entity
   * Note, this is equivalent to the other <code>modulePhysicalPortsPower</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ModulePhysicalPortsPowerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ModulePhysicalPortsPowerResponseData
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ModulePhysicalPortsPowerResponseData modulePhysicalPortsPower(@Param("elid") String elid, ModulePhysicalPortsPowerRequestData body, @QueryMap(encoded=true) ModulePhysicalPortsPowerQueryParams queryParams);

  /**
  * Get relations to Physical port (power) entities
  * For more information call the basic query of the power port entity
  * Note, this is equivalent to the other <code>modulePhysicalPortsPower</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ModulePhysicalPortsPowerResponseData
      */
      @RequestLine("POST /api/rest/entity/module/{elid}/PhysicalPortsPower?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ModulePhysicalPortsPowerResponseData> modulePhysicalPortsPowerWithHttpInfo(@Param("elid") String elid, ModulePhysicalPortsPowerRequestData body, @QueryMap(encoded=true) ModulePhysicalPortsPowerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>modulePhysicalPortsPower</code> method in a fluent style.
   */
  public static class ModulePhysicalPortsPowerQueryParams extends HashMap<String, Object> {
    public ModulePhysicalPortsPowerQueryParams sessionId(final String value) {
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
   * @return ModulePhysicalPortsPowerExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/PhysicalPortsPowerExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ModulePhysicalPortsPowerExtendedResponse modulePhysicalPortsPowerExtended(@Param("sessionId") String sessionId, @Param("elid") String elid, ModulePhysicalPortsPowerExtendedRequest body);

  /**
   * Query Power ports
   * Similar to <code>modulePhysicalPortsPowerExtended</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/PhysicalPortsPowerExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ModulePhysicalPortsPowerExtendedResponse> modulePhysicalPortsPowerExtendedWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ModulePhysicalPortsPowerExtendedRequest body);


  /**
   * Query Power ports
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>modulePhysicalPortsPowerExtended</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ModulePhysicalPortsPowerExtendedQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ModulePhysicalPortsPowerExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/PhysicalPortsPowerExtended?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ModulePhysicalPortsPowerExtendedResponse modulePhysicalPortsPowerExtended(@Param("elid") String elid, ModulePhysicalPortsPowerExtendedRequest body, @QueryMap(encoded=true) ModulePhysicalPortsPowerExtendedQueryParams queryParams);

  /**
  * Query Power ports
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>modulePhysicalPortsPowerExtended</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ModulePhysicalPortsPowerExtendedResponse
      */
      @RequestLine("POST /api/rest/entity/module/{elid}/PhysicalPortsPowerExtended?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ModulePhysicalPortsPowerExtendedResponse> modulePhysicalPortsPowerExtendedWithHttpInfo(@Param("elid") String elid, ModulePhysicalPortsPowerExtendedRequest body, @QueryMap(encoded=true) ModulePhysicalPortsPowerExtendedQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>modulePhysicalPortsPowerExtended</code> method in a fluent style.
   */
  public static class ModulePhysicalPortsPowerExtendedQueryParams extends HashMap<String, Object> {
    public ModulePhysicalPortsPowerExtendedQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ModuleQueryResponse
   */
  @RequestLine("POST /api/rest/entity/module/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ModuleQueryResponse moduleQuery(@Param("sessionId") String sessionId, ModuleQueryRequest body);

  /**
   * Basic query
   * Similar to <code>moduleQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ModuleQueryResponse> moduleQueryWithHttpInfo(@Param("sessionId") String sessionId, ModuleQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>moduleQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ModuleQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ModuleQueryResponse
   */
  @RequestLine("POST /api/rest/entity/module/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ModuleQueryResponse moduleQuery(ModuleQueryRequest body, @QueryMap(encoded=true) ModuleQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>moduleQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ModuleQueryResponse
      */
      @RequestLine("POST /api/rest/entity/module/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ModuleQueryResponse> moduleQueryWithHttpInfo(ModuleQueryRequest body, @QueryMap(encoded=true) ModuleQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moduleQuery</code> method in a fluent style.
   */
  public static class ModuleQueryQueryParams extends HashMap<String, Object> {
    public ModuleQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query
   * Queries linked master data and zone data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ModuleQueryExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/module/queryExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ModuleQueryExtendedResponse moduleQueryExtended(@Param("sessionId") String sessionId, ModuleQueryExtendedRequest body);

  /**
   * Extended query
   * Similar to <code>moduleQueryExtended</code> but it also returns the http response headers .
   * Queries linked master data and zone data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/queryExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ModuleQueryExtendedResponse> moduleQueryExtendedWithHttpInfo(@Param("sessionId") String sessionId, ModuleQueryExtendedRequest body);


  /**
   * Extended query
   * Queries linked master data and zone data
   * Note, this is equivalent to the other <code>moduleQueryExtended</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ModuleQueryExtendedQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ModuleQueryExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/module/queryExtended?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ModuleQueryExtendedResponse moduleQueryExtended(ModuleQueryExtendedRequest body, @QueryMap(encoded=true) ModuleQueryExtendedQueryParams queryParams);

  /**
  * Extended query
  * Queries linked master data and zone data
  * Note, this is equivalent to the other <code>moduleQueryExtended</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ModuleQueryExtendedResponse
      */
      @RequestLine("POST /api/rest/entity/module/queryExtended?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ModuleQueryExtendedResponse> moduleQueryExtendedWithHttpInfo(ModuleQueryExtendedRequest body, @QueryMap(encoded=true) ModuleQueryExtendedQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moduleQueryExtended</code> method in a fluent style.
   */
  public static class ModuleQueryExtendedQueryParams extends HashMap<String, Object> {
    public ModuleQueryExtendedQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended geo coordinates
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ModuleQueryExtendedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/module/queryExtendedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ModuleQueryExtendedGeoCoordinatesResponse moduleQueryExtendedGeoCoordinates(@Param("sessionId") String sessionId, ModuleQueryExtendedGeoCoordinatesRequest body);

  /**
   * Extended geo coordinates
   * Similar to <code>moduleQueryExtendedGeoCoordinates</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/queryExtendedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ModuleQueryExtendedGeoCoordinatesResponse> moduleQueryExtendedGeoCoordinatesWithHttpInfo(@Param("sessionId") String sessionId, ModuleQueryExtendedGeoCoordinatesRequest body);


  /**
   * Extended geo coordinates
   * 
   * Note, this is equivalent to the other <code>moduleQueryExtendedGeoCoordinates</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ModuleQueryExtendedGeoCoordinatesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ModuleQueryExtendedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/module/queryExtendedGeoCoordinates?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ModuleQueryExtendedGeoCoordinatesResponse moduleQueryExtendedGeoCoordinates(ModuleQueryExtendedGeoCoordinatesRequest body, @QueryMap(encoded=true) ModuleQueryExtendedGeoCoordinatesQueryParams queryParams);

  /**
  * Extended geo coordinates
  * 
  * Note, this is equivalent to the other <code>moduleQueryExtendedGeoCoordinates</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ModuleQueryExtendedGeoCoordinatesResponse
      */
      @RequestLine("POST /api/rest/entity/module/queryExtendedGeoCoordinates?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ModuleQueryExtendedGeoCoordinatesResponse> moduleQueryExtendedGeoCoordinatesWithHttpInfo(ModuleQueryExtendedGeoCoordinatesRequest body, @QueryMap(encoded=true) ModuleQueryExtendedGeoCoordinatesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moduleQueryExtendedGeoCoordinates</code> method in a fluent style.
   */
  public static class ModuleQueryExtendedGeoCoordinatesQueryParams extends HashMap<String, Object> {
    public ModuleQueryExtendedGeoCoordinatesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query scroll first
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ModuleQueryExtendedScrollFirstResponse
   */
  @RequestLine("POST /api/rest/entity/module/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ModuleQueryExtendedScrollFirstResponse moduleQueryExtendedScrollFirst(@Param("sessionId") String sessionId, ModuleQueryExtendedScrollFirstRequest body);

  /**
   * Extended query scroll first
   * Similar to <code>moduleQueryExtendedScrollFirst</code> but it also returns the http response headers .
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ModuleQueryExtendedScrollFirstResponse> moduleQueryExtendedScrollFirstWithHttpInfo(@Param("sessionId") String sessionId, ModuleQueryExtendedScrollFirstRequest body);


  /**
   * Extended query scroll first
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * Note, this is equivalent to the other <code>moduleQueryExtendedScrollFirst</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ModuleQueryExtendedScrollFirstQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ModuleQueryExtendedScrollFirstResponse
   */
  @RequestLine("POST /api/rest/entity/module/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ModuleQueryExtendedScrollFirstResponse moduleQueryExtendedScrollFirst(ModuleQueryExtendedScrollFirstRequest body, @QueryMap(encoded=true) ModuleQueryExtendedScrollFirstQueryParams queryParams);

  /**
  * Extended query scroll first
  * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
  * Note, this is equivalent to the other <code>moduleQueryExtendedScrollFirst</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ModuleQueryExtendedScrollFirstResponse
      */
      @RequestLine("POST /api/rest/entity/module/queryExtendedScrollFirst?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ModuleQueryExtendedScrollFirstResponse> moduleQueryExtendedScrollFirstWithHttpInfo(ModuleQueryExtendedScrollFirstRequest body, @QueryMap(encoded=true) ModuleQueryExtendedScrollFirstQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moduleQueryExtendedScrollFirst</code> method in a fluent style.
   */
  public static class ModuleQueryExtendedScrollFirstQueryParams extends HashMap<String, Object> {
    public ModuleQueryExtendedScrollFirstQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query scroll more
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ModuleQueryExtendedScrollMoreResponse
   */
  @RequestLine("POST /api/rest/entity/module/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ModuleQueryExtendedScrollMoreResponse moduleQueryExtendedScrollMore(@Param("sessionId") String sessionId, ModuleQueryExtendedScrollMoreRequest body);

  /**
   * Extended query scroll more
   * Similar to <code>moduleQueryExtendedScrollMore</code> but it also returns the http response headers .
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ModuleQueryExtendedScrollMoreResponse> moduleQueryExtendedScrollMoreWithHttpInfo(@Param("sessionId") String sessionId, ModuleQueryExtendedScrollMoreRequest body);


  /**
   * Extended query scroll more
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * Note, this is equivalent to the other <code>moduleQueryExtendedScrollMore</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ModuleQueryExtendedScrollMoreQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ModuleQueryExtendedScrollMoreResponse
   */
  @RequestLine("POST /api/rest/entity/module/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ModuleQueryExtendedScrollMoreResponse moduleQueryExtendedScrollMore(ModuleQueryExtendedScrollMoreRequest body, @QueryMap(encoded=true) ModuleQueryExtendedScrollMoreQueryParams queryParams);

  /**
  * Extended query scroll more
  * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
  * Note, this is equivalent to the other <code>moduleQueryExtendedScrollMore</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ModuleQueryExtendedScrollMoreResponse
      */
      @RequestLine("POST /api/rest/entity/module/queryExtendedScrollMore?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ModuleQueryExtendedScrollMoreResponse> moduleQueryExtendedScrollMoreWithHttpInfo(ModuleQueryExtendedScrollMoreRequest body, @QueryMap(encoded=true) ModuleQueryExtendedScrollMoreQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moduleQueryExtendedScrollMore</code> method in a fluent style.
   */
  public static class ModuleQueryExtendedScrollMoreQueryParams extends HashMap<String, Object> {
    public ModuleQueryExtendedScrollMoreQueryParams sessionId(final String value) {
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
   * @return ModuleServicesResponse
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/Services?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ModuleServicesResponse moduleServices(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleServicesRequest body);

  /**
   * Query device services 
   * Similar to <code>moduleServices</code> but it also returns the http response headers .
   * Query services for device 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/Services?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ModuleServicesResponse> moduleServicesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleServicesRequest body);


  /**
   * Query device services 
   * Query services for device 
   * Note, this is equivalent to the other <code>moduleServices</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ModuleServicesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ModuleServicesResponse
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/Services?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ModuleServicesResponse moduleServices(@Param("elid") String elid, ModuleServicesRequest body, @QueryMap(encoded=true) ModuleServicesQueryParams queryParams);

  /**
  * Query device services 
  * Query services for device 
  * Note, this is equivalent to the other <code>moduleServices</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ModuleServicesResponse
      */
      @RequestLine("POST /api/rest/entity/module/{elid}/Services?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ModuleServicesResponse> moduleServicesWithHttpInfo(@Param("elid") String elid, ModuleServicesRequest body, @QueryMap(encoded=true) ModuleServicesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moduleServices</code> method in a fluent style.
   */
  public static class ModuleServicesQueryParams extends HashMap<String, Object> {
    public ModuleServicesQueryParams sessionId(final String value) {
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
   * @return ModuleSitesResponseData
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/Sites?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ModuleSitesResponseData moduleSites(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleSitesRequestData body);

  /**
   * Get relations to Site entities
   * Similar to <code>moduleSites</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/Sites?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ModuleSitesResponseData> moduleSitesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleSitesRequestData body);


  /**
   * Get relations to Site entities
   * 
   * Note, this is equivalent to the other <code>moduleSites</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ModuleSitesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ModuleSitesResponseData
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/Sites?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ModuleSitesResponseData moduleSites(@Param("elid") String elid, ModuleSitesRequestData body, @QueryMap(encoded=true) ModuleSitesQueryParams queryParams);

  /**
  * Get relations to Site entities
  * 
  * Note, this is equivalent to the other <code>moduleSites</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ModuleSitesResponseData
      */
      @RequestLine("POST /api/rest/entity/module/{elid}/Sites?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ModuleSitesResponseData> moduleSitesWithHttpInfo(@Param("elid") String elid, ModuleSitesRequestData body, @QueryMap(encoded=true) ModuleSitesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moduleSites</code> method in a fluent style.
   */
  public static class ModuleSitesQueryParams extends HashMap<String, Object> {
    public ModuleSitesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Slot entities
   * Relation query returns information about the slot position in which the device is installed
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ModuleSlotResponseData
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/Slot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ModuleSlotResponseData moduleSlot(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleSlotRequestData body);

  /**
   * Get relations to Slot entities
   * Similar to <code>moduleSlot</code> but it also returns the http response headers .
   * Relation query returns information about the slot position in which the device is installed
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/Slot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ModuleSlotResponseData> moduleSlotWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleSlotRequestData body);


  /**
   * Get relations to Slot entities
   * Relation query returns information about the slot position in which the device is installed
   * Note, this is equivalent to the other <code>moduleSlot</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ModuleSlotQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ModuleSlotResponseData
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/Slot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ModuleSlotResponseData moduleSlot(@Param("elid") String elid, ModuleSlotRequestData body, @QueryMap(encoded=true) ModuleSlotQueryParams queryParams);

  /**
  * Get relations to Slot entities
  * Relation query returns information about the slot position in which the device is installed
  * Note, this is equivalent to the other <code>moduleSlot</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ModuleSlotResponseData
      */
      @RequestLine("POST /api/rest/entity/module/{elid}/Slot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ModuleSlotResponseData> moduleSlotWithHttpInfo(@Param("elid") String elid, ModuleSlotRequestData body, @QueryMap(encoded=true) ModuleSlotQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moduleSlot</code> method in a fluent style.
   */
  public static class ModuleSlotQueryParams extends HashMap<String, Object> {
    public ModuleSlotQueryParams sessionId(final String value) {
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
   * @return ModuleSwitchCabinetResponseData
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/SwitchCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ModuleSwitchCabinetResponseData moduleSwitchCabinet(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleSwitchCabinetRequestData body);

  /**
   * Get relations to Switch cabinet entities
   * Similar to <code>moduleSwitchCabinet</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/SwitchCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ModuleSwitchCabinetResponseData> moduleSwitchCabinetWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleSwitchCabinetRequestData body);


  /**
   * Get relations to Switch cabinet entities
   * 
   * Note, this is equivalent to the other <code>moduleSwitchCabinet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ModuleSwitchCabinetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ModuleSwitchCabinetResponseData
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/SwitchCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ModuleSwitchCabinetResponseData moduleSwitchCabinet(@Param("elid") String elid, ModuleSwitchCabinetRequestData body, @QueryMap(encoded=true) ModuleSwitchCabinetQueryParams queryParams);

  /**
  * Get relations to Switch cabinet entities
  * 
  * Note, this is equivalent to the other <code>moduleSwitchCabinet</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ModuleSwitchCabinetResponseData
      */
      @RequestLine("POST /api/rest/entity/module/{elid}/SwitchCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ModuleSwitchCabinetResponseData> moduleSwitchCabinetWithHttpInfo(@Param("elid") String elid, ModuleSwitchCabinetRequestData body, @QueryMap(encoded=true) ModuleSwitchCabinetQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moduleSwitchCabinet</code> method in a fluent style.
   */
  public static class ModuleSwitchCabinetQueryParams extends HashMap<String, Object> {
    public ModuleSwitchCabinetQueryParams sessionId(final String value) {
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
   * @return ModuleSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ModuleSystemAttributesResponse moduleSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>moduleSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ModuleSystemAttributesResponse> moduleSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>moduleSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ModuleSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ModuleSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ModuleSystemAttributesResponse moduleSystemAttributes(@Param("elid") String elid, ModuleSystemAttributesRequest body, @QueryMap(encoded=true) ModuleSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>moduleSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ModuleSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/module/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ModuleSystemAttributesResponse> moduleSystemAttributesWithHttpInfo(@Param("elid") String elid, ModuleSystemAttributesRequest body, @QueryMap(encoded=true) ModuleSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moduleSystemAttributes</code> method in a fluent style.
   */
  public static class ModuleSystemAttributesQueryParams extends HashMap<String, Object> {
    public ModuleSystemAttributesQueryParams sessionId(final String value) {
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
   * @return ModuleVirtualSwitchesResponseData
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ModuleVirtualSwitchesResponseData moduleVirtualSwitches(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleVirtualSwitchesRequestData body);

  /**
   * Get relations to Virtual switch entities
   * Similar to <code>moduleVirtualSwitches</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ModuleVirtualSwitchesResponseData> moduleVirtualSwitchesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleVirtualSwitchesRequestData body);


  /**
   * Get relations to Virtual switch entities
   * 
   * Note, this is equivalent to the other <code>moduleVirtualSwitches</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ModuleVirtualSwitchesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ModuleVirtualSwitchesResponseData
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ModuleVirtualSwitchesResponseData moduleVirtualSwitches(@Param("elid") String elid, ModuleVirtualSwitchesRequestData body, @QueryMap(encoded=true) ModuleVirtualSwitchesQueryParams queryParams);

  /**
  * Get relations to Virtual switch entities
  * 
  * Note, this is equivalent to the other <code>moduleVirtualSwitches</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ModuleVirtualSwitchesResponseData
      */
      @RequestLine("POST /api/rest/entity/module/{elid}/VirtualSwitches?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ModuleVirtualSwitchesResponseData> moduleVirtualSwitchesWithHttpInfo(@Param("elid") String elid, ModuleVirtualSwitchesRequestData body, @QueryMap(encoded=true) ModuleVirtualSwitchesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moduleVirtualSwitches</code> method in a fluent style.
   */
  public static class ModuleVirtualSwitchesQueryParams extends HashMap<String, Object> {
    public ModuleVirtualSwitchesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * VLANs
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ModuleVlansResponse
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ModuleVlansResponse moduleVlans(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleVlansRequest body);

  /**
   * VLANs
   * Similar to <code>moduleVlans</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ModuleVlansResponse> moduleVlansWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleVlansRequest body);


  /**
   * VLANs
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>moduleVlans</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ModuleVlansQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ModuleVlansResponse
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ModuleVlansResponse moduleVlans(@Param("elid") String elid, ModuleVlansRequest body, @QueryMap(encoded=true) ModuleVlansQueryParams queryParams);

  /**
  * VLANs
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>moduleVlans</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ModuleVlansResponse
      */
      @RequestLine("POST /api/rest/entity/module/{elid}/Vlans?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ModuleVlansResponse> moduleVlansWithHttpInfo(@Param("elid") String elid, ModuleVlansRequest body, @QueryMap(encoded=true) ModuleVlansQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moduleVlans</code> method in a fluent style.
   */
  public static class ModuleVlansQueryParams extends HashMap<String, Object> {
    public ModuleVlansQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * VLAN to slots
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ModuleVlansAtSlotResponse
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/VlansAtSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ModuleVlansAtSlotResponse moduleVlansAtSlot(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleVlansAtSlotRequest body);

  /**
   * VLAN to slots
   * Similar to <code>moduleVlansAtSlot</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/VlansAtSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ModuleVlansAtSlotResponse> moduleVlansAtSlotWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleVlansAtSlotRequest body);


  /**
   * VLAN to slots
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>moduleVlansAtSlot</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ModuleVlansAtSlotQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ModuleVlansAtSlotResponse
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/VlansAtSlot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ModuleVlansAtSlotResponse moduleVlansAtSlot(@Param("elid") String elid, ModuleVlansAtSlotRequest body, @QueryMap(encoded=true) ModuleVlansAtSlotQueryParams queryParams);

  /**
  * VLAN to slots
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>moduleVlansAtSlot</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ModuleVlansAtSlotResponse
      */
      @RequestLine("POST /api/rest/entity/module/{elid}/VlansAtSlot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ModuleVlansAtSlotResponse> moduleVlansAtSlotWithHttpInfo(@Param("elid") String elid, ModuleVlansAtSlotRequest body, @QueryMap(encoded=true) ModuleVlansAtSlotQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moduleVlansAtSlot</code> method in a fluent style.
   */
  public static class ModuleVlansAtSlotQueryParams extends HashMap<String, Object> {
    public ModuleVlansAtSlotQueryParams sessionId(final String value) {
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
   * @return ModuleWarehouseResponseData
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ModuleWarehouseResponseData moduleWarehouse(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleWarehouseRequestData body);

  /**
   * Get relations to Warehouse entities
   * Similar to <code>moduleWarehouse</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ModuleWarehouseResponseData> moduleWarehouseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleWarehouseRequestData body);


  /**
   * Get relations to Warehouse entities
   * 
   * Note, this is equivalent to the other <code>moduleWarehouse</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ModuleWarehouseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ModuleWarehouseResponseData
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ModuleWarehouseResponseData moduleWarehouse(@Param("elid") String elid, ModuleWarehouseRequestData body, @QueryMap(encoded=true) ModuleWarehouseQueryParams queryParams);

  /**
  * Get relations to Warehouse entities
  * 
  * Note, this is equivalent to the other <code>moduleWarehouse</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ModuleWarehouseResponseData
      */
      @RequestLine("POST /api/rest/entity/module/{elid}/Warehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ModuleWarehouseResponseData> moduleWarehouseWithHttpInfo(@Param("elid") String elid, ModuleWarehouseRequestData body, @QueryMap(encoded=true) ModuleWarehouseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moduleWarehouse</code> method in a fluent style.
   */
  public static class ModuleWarehouseQueryParams extends HashMap<String, Object> {
    public ModuleWarehouseQueryParams sessionId(final String value) {
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
   * @return ModuleZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/Zone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ModuleZoneResponseData moduleZone(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleZoneRequestData body);

  /**
   * Get relations to Zone entities
   * Similar to <code>moduleZone</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/Zone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ModuleZoneResponseData> moduleZoneWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ModuleZoneRequestData body);


  /**
   * Get relations to Zone entities
   * 
   * Note, this is equivalent to the other <code>moduleZone</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ModuleZoneQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ModuleZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/Zone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ModuleZoneResponseData moduleZone(@Param("elid") String elid, ModuleZoneRequestData body, @QueryMap(encoded=true) ModuleZoneQueryParams queryParams);

  /**
  * Get relations to Zone entities
  * 
  * Note, this is equivalent to the other <code>moduleZone</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ModuleZoneResponseData
      */
      @RequestLine("POST /api/rest/entity/module/{elid}/Zone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ModuleZoneResponseData> moduleZoneWithHttpInfo(@Param("elid") String elid, ModuleZoneRequestData body, @QueryMap(encoded=true) ModuleZoneQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moduleZone</code> method in a fluent style.
   */
  public static class ModuleZoneQueryParams extends HashMap<String, Object> {
    public ModuleZoneQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Move to cabinet
   * Move to switch cabinet
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return MoveToCabinetModuleResponse
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/moveToCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToCabinetModuleResponse moveToCabinetModule(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToCabinetModuleRequestData body);

  /**
   * Move to cabinet
   * Similar to <code>moveToCabinetModule</code> but it also returns the http response headers .
   * Move to switch cabinet
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/moveToCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToCabinetModuleResponse> moveToCabinetModuleWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToCabinetModuleRequestData body);


  /**
   * Move to cabinet
   * Move to switch cabinet
   * Note, this is equivalent to the other <code>moveToCabinetModule</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToCabinetModuleQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToCabinetModuleResponse
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/moveToCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToCabinetModuleResponse moveToCabinetModule(@Param("elid") String elid, MoveToCabinetModuleRequestData body, @QueryMap(encoded=true) MoveToCabinetModuleQueryParams queryParams);

  /**
  * Move to cabinet
  * Move to switch cabinet
  * Note, this is equivalent to the other <code>moveToCabinetModule</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToCabinetModuleResponse
      */
      @RequestLine("POST /api/rest/entity/module/{elid}/moveToCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToCabinetModuleResponse> moveToCabinetModuleWithHttpInfo(@Param("elid") String elid, MoveToCabinetModuleRequestData body, @QueryMap(encoded=true) MoveToCabinetModuleQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToCabinetModule</code> method in a fluent style.
   */
  public static class MoveToCabinetModuleQueryParams extends HashMap<String, Object> {
    public MoveToCabinetModuleQueryParams sessionId(final String value) {
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
   * @return MoveToSlotModuleResponse
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/moveToSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToSlotModuleResponse moveToSlotModule(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToSlotModuleRequestData body);

  /**
   * Move to slot
   * Similar to <code>moveToSlotModule</code> but it also returns the http response headers .
   * Move to slot
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/moveToSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToSlotModuleResponse> moveToSlotModuleWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToSlotModuleRequestData body);


  /**
   * Move to slot
   * Move to slot
   * Note, this is equivalent to the other <code>moveToSlotModule</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToSlotModuleQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToSlotModuleResponse
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/moveToSlot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToSlotModuleResponse moveToSlotModule(@Param("elid") String elid, MoveToSlotModuleRequestData body, @QueryMap(encoded=true) MoveToSlotModuleQueryParams queryParams);

  /**
  * Move to slot
  * Move to slot
  * Note, this is equivalent to the other <code>moveToSlotModule</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToSlotModuleResponse
      */
      @RequestLine("POST /api/rest/entity/module/{elid}/moveToSlot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToSlotModuleResponse> moveToSlotModuleWithHttpInfo(@Param("elid") String elid, MoveToSlotModuleRequestData body, @QueryMap(encoded=true) MoveToSlotModuleQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToSlotModule</code> method in a fluent style.
   */
  public static class MoveToSlotModuleQueryParams extends HashMap<String, Object> {
    public MoveToSlotModuleQueryParams sessionId(final String value) {
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
   * @return MoveToWarehouseModuleResponse
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToWarehouseModuleResponse moveToWarehouseModule(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToWarehouseModuleRequestData body);

  /**
   * Move to warehouse
   * Similar to <code>moveToWarehouseModule</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToWarehouseModuleResponse> moveToWarehouseModuleWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToWarehouseModuleRequestData body);


  /**
   * Move to warehouse
   * 
   * Note, this is equivalent to the other <code>moveToWarehouseModule</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToWarehouseModuleQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToWarehouseModuleResponse
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToWarehouseModuleResponse moveToWarehouseModule(@Param("elid") String elid, MoveToWarehouseModuleRequestData body, @QueryMap(encoded=true) MoveToWarehouseModuleQueryParams queryParams);

  /**
  * Move to warehouse
  * 
  * Note, this is equivalent to the other <code>moveToWarehouseModule</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToWarehouseModuleResponse
      */
      @RequestLine("POST /api/rest/entity/module/{elid}/moveToWarehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToWarehouseModuleResponse> moveToWarehouseModuleWithHttpInfo(@Param("elid") String elid, MoveToWarehouseModuleRequestData body, @QueryMap(encoded=true) MoveToWarehouseModuleQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToWarehouseModule</code> method in a fluent style.
   */
  public static class MoveToWarehouseModuleQueryParams extends HashMap<String, Object> {
    public MoveToWarehouseModuleQueryParams sessionId(final String value) {
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
   * @return MoveToZoneModuleResponse
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToZoneModuleResponse moveToZoneModule(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToZoneModuleRequestData body);

  /**
   * Move to zone
   * Similar to <code>moveToZoneModule</code> but it also returns the http response headers .
   * Move to zone
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToZoneModuleResponse> moveToZoneModuleWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToZoneModuleRequestData body);


  /**
   * Move to zone
   * Move to zone
   * Note, this is equivalent to the other <code>moveToZoneModule</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToZoneModuleQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToZoneModuleResponse
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToZoneModuleResponse moveToZoneModule(@Param("elid") String elid, MoveToZoneModuleRequestData body, @QueryMap(encoded=true) MoveToZoneModuleQueryParams queryParams);

  /**
  * Move to zone
  * Move to zone
  * Note, this is equivalent to the other <code>moveToZoneModule</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToZoneModuleResponse
      */
      @RequestLine("POST /api/rest/entity/module/{elid}/moveToZone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToZoneModuleResponse> moveToZoneModuleWithHttpInfo(@Param("elid") String elid, MoveToZoneModuleRequestData body, @QueryMap(encoded=true) MoveToZoneModuleQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToZoneModule</code> method in a fluent style.
   */
  public static class MoveToZoneModuleQueryParams extends HashMap<String, Object> {
    public MoveToZoneModuleQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in cabinet
   * Place in switch cabinet
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInCabinetModuleResponse
   */
  @RequestLine("POST /api/rest/entity/module/placeInCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInCabinetModuleResponse placeInCabinetModule(@Param("sessionId") String sessionId, PlaceInCabinetModuleRequestData body);

  /**
   * Place in cabinet
   * Similar to <code>placeInCabinetModule</code> but it also returns the http response headers .
   * Place in switch cabinet
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/placeInCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInCabinetModuleResponse> placeInCabinetModuleWithHttpInfo(@Param("sessionId") String sessionId, PlaceInCabinetModuleRequestData body);


  /**
   * Place in cabinet
   * Place in switch cabinet
   * Note, this is equivalent to the other <code>placeInCabinetModule</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInCabinetModuleQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInCabinetModuleResponse
   */
  @RequestLine("POST /api/rest/entity/module/placeInCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInCabinetModuleResponse placeInCabinetModule(PlaceInCabinetModuleRequestData body, @QueryMap(encoded=true) PlaceInCabinetModuleQueryParams queryParams);

  /**
  * Place in cabinet
  * Place in switch cabinet
  * Note, this is equivalent to the other <code>placeInCabinetModule</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInCabinetModuleResponse
      */
      @RequestLine("POST /api/rest/entity/module/placeInCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInCabinetModuleResponse> placeInCabinetModuleWithHttpInfo(PlaceInCabinetModuleRequestData body, @QueryMap(encoded=true) PlaceInCabinetModuleQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInCabinetModule</code> method in a fluent style.
   */
  public static class PlaceInCabinetModuleQueryParams extends HashMap<String, Object> {
    public PlaceInCabinetModuleQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in slot
   * Places a device (super) in a slot. The device to be placed must be flagged as a card.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInSlotModuleResponse
   */
  @RequestLine("POST /api/rest/entity/module/placeInSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInSlotModuleResponse placeInSlotModule(@Param("sessionId") String sessionId, PlaceInSlotModuleRequestData body);

  /**
   * Place in slot
   * Similar to <code>placeInSlotModule</code> but it also returns the http response headers .
   * Places a device (super) in a slot. The device to be placed must be flagged as a card.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/placeInSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInSlotModuleResponse> placeInSlotModuleWithHttpInfo(@Param("sessionId") String sessionId, PlaceInSlotModuleRequestData body);


  /**
   * Place in slot
   * Places a device (super) in a slot. The device to be placed must be flagged as a card.
   * Note, this is equivalent to the other <code>placeInSlotModule</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInSlotModuleQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInSlotModuleResponse
   */
  @RequestLine("POST /api/rest/entity/module/placeInSlot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInSlotModuleResponse placeInSlotModule(PlaceInSlotModuleRequestData body, @QueryMap(encoded=true) PlaceInSlotModuleQueryParams queryParams);

  /**
  * Place in slot
  * Places a device (super) in a slot. The device to be placed must be flagged as a card.
  * Note, this is equivalent to the other <code>placeInSlotModule</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInSlotModuleResponse
      */
      @RequestLine("POST /api/rest/entity/module/placeInSlot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInSlotModuleResponse> placeInSlotModuleWithHttpInfo(PlaceInSlotModuleRequestData body, @QueryMap(encoded=true) PlaceInSlotModuleQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInSlotModule</code> method in a fluent style.
   */
  public static class PlaceInSlotModuleQueryParams extends HashMap<String, Object> {
    public PlaceInSlotModuleQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in warehouse
   * Place in warehouse
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInWarehouseModuleResponse
   */
  @RequestLine("POST /api/rest/entity/module/placeInWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInWarehouseModuleResponse placeInWarehouseModule(@Param("sessionId") String sessionId, PlaceInWarehouseModuleRequestData body);

  /**
   * Place in warehouse
   * Similar to <code>placeInWarehouseModule</code> but it also returns the http response headers .
   * Place in warehouse
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/placeInWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInWarehouseModuleResponse> placeInWarehouseModuleWithHttpInfo(@Param("sessionId") String sessionId, PlaceInWarehouseModuleRequestData body);


  /**
   * Place in warehouse
   * Place in warehouse
   * Note, this is equivalent to the other <code>placeInWarehouseModule</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInWarehouseModuleQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInWarehouseModuleResponse
   */
  @RequestLine("POST /api/rest/entity/module/placeInWarehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInWarehouseModuleResponse placeInWarehouseModule(PlaceInWarehouseModuleRequestData body, @QueryMap(encoded=true) PlaceInWarehouseModuleQueryParams queryParams);

  /**
  * Place in warehouse
  * Place in warehouse
  * Note, this is equivalent to the other <code>placeInWarehouseModule</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInWarehouseModuleResponse
      */
      @RequestLine("POST /api/rest/entity/module/placeInWarehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInWarehouseModuleResponse> placeInWarehouseModuleWithHttpInfo(PlaceInWarehouseModuleRequestData body, @QueryMap(encoded=true) PlaceInWarehouseModuleQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInWarehouseModule</code> method in a fluent style.
   */
  public static class PlaceInWarehouseModuleQueryParams extends HashMap<String, Object> {
    public PlaceInWarehouseModuleQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in zone
   * Place in zone
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInZoneModuleResponse
   */
  @RequestLine("POST /api/rest/entity/module/placeInZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInZoneModuleResponse placeInZoneModule(@Param("sessionId") String sessionId, PlaceInZoneModuleRequestData body);

  /**
   * Place in zone
   * Similar to <code>placeInZoneModule</code> but it also returns the http response headers .
   * Place in zone
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/placeInZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInZoneModuleResponse> placeInZoneModuleWithHttpInfo(@Param("sessionId") String sessionId, PlaceInZoneModuleRequestData body);


  /**
   * Place in zone
   * Place in zone
   * Note, this is equivalent to the other <code>placeInZoneModule</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInZoneModuleQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInZoneModuleResponse
   */
  @RequestLine("POST /api/rest/entity/module/placeInZone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInZoneModuleResponse placeInZoneModule(PlaceInZoneModuleRequestData body, @QueryMap(encoded=true) PlaceInZoneModuleQueryParams queryParams);

  /**
  * Place in zone
  * Place in zone
  * Note, this is equivalent to the other <code>placeInZoneModule</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInZoneModuleResponse
      */
      @RequestLine("POST /api/rest/entity/module/placeInZone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInZoneModuleResponse> placeInZoneModuleWithHttpInfo(PlaceInZoneModuleRequestData body, @QueryMap(encoded=true) PlaceInZoneModuleQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInZoneModule</code> method in a fluent style.
   */
  public static class PlaceInZoneModuleQueryParams extends HashMap<String, Object> {
    public PlaceInZoneModuleQueryParams sessionId(final String value) {
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
   * @return ReplaceObjectModuleResponse
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/replaceObject?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ReplaceObjectModuleResponse replaceObjectModule(@Param("sessionId") String sessionId, @Param("elid") String elid, ReplaceObjectModuleRequestData body);

  /**
   * Replace object
   * Similar to <code>replaceObjectModule</code> but it also returns the http response headers .
   * Replace object
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/replaceObject?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ReplaceObjectModuleResponse> replaceObjectModuleWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ReplaceObjectModuleRequestData body);


  /**
   * Replace object
   * Replace object
   * Note, this is equivalent to the other <code>replaceObjectModule</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ReplaceObjectModuleQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ReplaceObjectModuleResponse
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/replaceObject?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ReplaceObjectModuleResponse replaceObjectModule(@Param("elid") String elid, ReplaceObjectModuleRequestData body, @QueryMap(encoded=true) ReplaceObjectModuleQueryParams queryParams);

  /**
  * Replace object
  * Replace object
  * Note, this is equivalent to the other <code>replaceObjectModule</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ReplaceObjectModuleResponse
      */
      @RequestLine("POST /api/rest/entity/module/{elid}/replaceObject?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ReplaceObjectModuleResponse> replaceObjectModuleWithHttpInfo(@Param("elid") String elid, ReplaceObjectModuleRequestData body, @QueryMap(encoded=true) ReplaceObjectModuleQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>replaceObjectModule</code> method in a fluent style.
   */
  public static class ReplaceObjectModuleQueryParams extends HashMap<String, Object> {
    public ReplaceObjectModuleQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify module
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateModuleResponse
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateModuleResponse updateModule(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateModuleRequestData body);

  /**
   * Modify
   * Similar to <code>updateModule</code> but it also returns the http response headers .
   * Modify module
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateModuleResponse> updateModuleWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateModuleRequestData body);


  /**
   * Modify
   * Modify module
   * Note, this is equivalent to the other <code>updateModule</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateModuleQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateModuleResponse
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateModuleResponse updateModule(@Param("elid") String elid, UpdateModuleRequestData body, @QueryMap(encoded=true) UpdateModuleQueryParams queryParams);

  /**
  * Modify
  * Modify module
  * Note, this is equivalent to the other <code>updateModule</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateModuleResponse
      */
      @RequestLine("POST /api/rest/entity/module/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateModuleResponse> updateModuleWithHttpInfo(@Param("elid") String elid, UpdateModuleRequestData body, @QueryMap(encoded=true) UpdateModuleQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateModule</code> method in a fluent style.
   */
  public static class UpdateModuleQueryParams extends HashMap<String, Object> {
    public UpdateModuleQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesModuleResponse
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesModuleResponse updateSystemAttributesModule(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesModuleRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesModule</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesModuleResponse> updateSystemAttributesModuleWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesModuleRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesModule</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesModuleQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesModuleResponse
   */
  @RequestLine("POST /api/rest/entity/module/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesModuleResponse updateSystemAttributesModule(@Param("elid") String elid, UpdateSystemAttributesModuleRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesModuleQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesModule</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesModuleResponse
      */
      @RequestLine("POST /api/rest/entity/module/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesModuleResponse> updateSystemAttributesModuleWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesModuleRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesModuleQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesModule</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesModuleQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesModuleQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
