package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.BlockPortPhysicalPortDataRequestData;
import com.fntsoftware.businessgateway.entities.BlockPortPhysicalPortDataResponse;
import com.fntsoftware.businessgateway.entities.PhysicalPortDataCustomPatchpointRequestData;
import com.fntsoftware.businessgateway.entities.PhysicalPortDataCustomPatchpointResponseData;
import com.fntsoftware.businessgateway.entities.PhysicalPortDataDeviceAllRequestData;
import com.fntsoftware.businessgateway.entities.PhysicalPortDataDeviceAllResponseData;
import com.fntsoftware.businessgateway.entities.PhysicalPortDataInterfacesRequestData;
import com.fntsoftware.businessgateway.entities.PhysicalPortDataInterfacesResponseData;
import com.fntsoftware.businessgateway.entities.PhysicalPortDataIpAddressesRequest;
import com.fntsoftware.businessgateway.entities.PhysicalPortDataIpAddressesResponse;
import com.fntsoftware.businessgateway.entities.PhysicalPortDataIpv4AddressesRequestData;
import com.fntsoftware.businessgateway.entities.PhysicalPortDataIpv4AddressesResponseData;
import com.fntsoftware.businessgateway.entities.PhysicalPortDataLogicalPortRequestData;
import com.fntsoftware.businessgateway.entities.PhysicalPortDataLogicalPortResponseData;
import com.fntsoftware.businessgateway.entities.PhysicalPortDataQueryRequest;
import com.fntsoftware.businessgateway.entities.PhysicalPortDataQueryResponse;
import com.fntsoftware.businessgateway.entities.PhysicalPortDataVlansRequest;
import com.fntsoftware.businessgateway.entities.PhysicalPortDataVlansResponse;
import com.fntsoftware.businessgateway.entities.ReservePortPhysicalPortDataRequestData;
import com.fntsoftware.businessgateway.entities.ReservePortPhysicalPortDataResponse;
import com.fntsoftware.businessgateway.entities.UnblockPortPhysicalPortDataResponse;
import com.fntsoftware.businessgateway.entities.UpdatePhysicalPortDataRequestData;
import com.fntsoftware.businessgateway.entities.UpdatePhysicalPortDataResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface PhysicalPortDataApi extends ApiClient.Api {


  /**
   * Block port
   * Block port
   * @param sessionId Session-ID (required)
   * @param portIdentifier  (required)
   * @param body  (required)
   * @return BlockPortPhysicalPortDataResponse
   */
  @RequestLine("POST /api/rest/entity/physicalPortData/{portIdentifier}/blockPort?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BlockPortPhysicalPortDataResponse blockPortPhysicalPortData(@Param("sessionId") String sessionId, @Param("portIdentifier") String portIdentifier, BlockPortPhysicalPortDataRequestData body);

  /**
   * Block port
   * Similar to <code>blockPortPhysicalPortData</code> but it also returns the http response headers .
   * Block port
   * @param sessionId Session-ID (required)
   * @param portIdentifier  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/physicalPortData/{portIdentifier}/blockPort?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BlockPortPhysicalPortDataResponse> blockPortPhysicalPortDataWithHttpInfo(@Param("sessionId") String sessionId, @Param("portIdentifier") String portIdentifier, BlockPortPhysicalPortDataRequestData body);


  /**
   * Block port
   * Block port
   * Note, this is equivalent to the other <code>blockPortPhysicalPortData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BlockPortPhysicalPortDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param portIdentifier  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return BlockPortPhysicalPortDataResponse
   */
  @RequestLine("POST /api/rest/entity/physicalPortData/{portIdentifier}/blockPort?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  BlockPortPhysicalPortDataResponse blockPortPhysicalPortData(@Param("portIdentifier") String portIdentifier, BlockPortPhysicalPortDataRequestData body, @QueryMap(encoded=true) BlockPortPhysicalPortDataQueryParams queryParams);

  /**
  * Block port
  * Block port
  * Note, this is equivalent to the other <code>blockPortPhysicalPortData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param portIdentifier  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return BlockPortPhysicalPortDataResponse
      */
      @RequestLine("POST /api/rest/entity/physicalPortData/{portIdentifier}/blockPort?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<BlockPortPhysicalPortDataResponse> blockPortPhysicalPortDataWithHttpInfo(@Param("portIdentifier") String portIdentifier, BlockPortPhysicalPortDataRequestData body, @QueryMap(encoded=true) BlockPortPhysicalPortDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>blockPortPhysicalPortData</code> method in a fluent style.
   */
  public static class BlockPortPhysicalPortDataQueryParams extends HashMap<String, Object> {
    public BlockPortPhysicalPortDataQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Patchpoint entities
   * 
   * @param sessionId Session-ID (required)
   * @param portIdentifier  (required)
   * @param body  (required)
   * @return PhysicalPortDataCustomPatchpointResponseData
   */
  @RequestLine("POST /api/rest/entity/physicalPortData/{portIdentifier}/CustomPatchpoint?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PhysicalPortDataCustomPatchpointResponseData physicalPortDataCustomPatchpoint(@Param("sessionId") String sessionId, @Param("portIdentifier") String portIdentifier, PhysicalPortDataCustomPatchpointRequestData body);

  /**
   * Get relations to Patchpoint entities
   * Similar to <code>physicalPortDataCustomPatchpoint</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param portIdentifier  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/physicalPortData/{portIdentifier}/CustomPatchpoint?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PhysicalPortDataCustomPatchpointResponseData> physicalPortDataCustomPatchpointWithHttpInfo(@Param("sessionId") String sessionId, @Param("portIdentifier") String portIdentifier, PhysicalPortDataCustomPatchpointRequestData body);


  /**
   * Get relations to Patchpoint entities
   * 
   * Note, this is equivalent to the other <code>physicalPortDataCustomPatchpoint</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PhysicalPortDataCustomPatchpointQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param portIdentifier  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PhysicalPortDataCustomPatchpointResponseData
   */
  @RequestLine("POST /api/rest/entity/physicalPortData/{portIdentifier}/CustomPatchpoint?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PhysicalPortDataCustomPatchpointResponseData physicalPortDataCustomPatchpoint(@Param("portIdentifier") String portIdentifier, PhysicalPortDataCustomPatchpointRequestData body, @QueryMap(encoded=true) PhysicalPortDataCustomPatchpointQueryParams queryParams);

  /**
  * Get relations to Patchpoint entities
  * 
  * Note, this is equivalent to the other <code>physicalPortDataCustomPatchpoint</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param portIdentifier  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PhysicalPortDataCustomPatchpointResponseData
      */
      @RequestLine("POST /api/rest/entity/physicalPortData/{portIdentifier}/CustomPatchpoint?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PhysicalPortDataCustomPatchpointResponseData> physicalPortDataCustomPatchpointWithHttpInfo(@Param("portIdentifier") String portIdentifier, PhysicalPortDataCustomPatchpointRequestData body, @QueryMap(encoded=true) PhysicalPortDataCustomPatchpointQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>physicalPortDataCustomPatchpoint</code> method in a fluent style.
   */
  public static class PhysicalPortDataCustomPatchpointQueryParams extends HashMap<String, Object> {
    public PhysicalPortDataCustomPatchpointQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Device (all) entities
   * 
   * @param sessionId Session-ID (required)
   * @param portIdentifier  (required)
   * @param body  (required)
   * @return PhysicalPortDataDeviceAllResponseData
   */
  @RequestLine("POST /api/rest/entity/physicalPortData/{portIdentifier}/DeviceAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PhysicalPortDataDeviceAllResponseData physicalPortDataDeviceAll(@Param("sessionId") String sessionId, @Param("portIdentifier") String portIdentifier, PhysicalPortDataDeviceAllRequestData body);

  /**
   * Get relations to Device (all) entities
   * Similar to <code>physicalPortDataDeviceAll</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param portIdentifier  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/physicalPortData/{portIdentifier}/DeviceAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PhysicalPortDataDeviceAllResponseData> physicalPortDataDeviceAllWithHttpInfo(@Param("sessionId") String sessionId, @Param("portIdentifier") String portIdentifier, PhysicalPortDataDeviceAllRequestData body);


  /**
   * Get relations to Device (all) entities
   * 
   * Note, this is equivalent to the other <code>physicalPortDataDeviceAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PhysicalPortDataDeviceAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param portIdentifier  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PhysicalPortDataDeviceAllResponseData
   */
  @RequestLine("POST /api/rest/entity/physicalPortData/{portIdentifier}/DeviceAll?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PhysicalPortDataDeviceAllResponseData physicalPortDataDeviceAll(@Param("portIdentifier") String portIdentifier, PhysicalPortDataDeviceAllRequestData body, @QueryMap(encoded=true) PhysicalPortDataDeviceAllQueryParams queryParams);

  /**
  * Get relations to Device (all) entities
  * 
  * Note, this is equivalent to the other <code>physicalPortDataDeviceAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param portIdentifier  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PhysicalPortDataDeviceAllResponseData
      */
      @RequestLine("POST /api/rest/entity/physicalPortData/{portIdentifier}/DeviceAll?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PhysicalPortDataDeviceAllResponseData> physicalPortDataDeviceAllWithHttpInfo(@Param("portIdentifier") String portIdentifier, PhysicalPortDataDeviceAllRequestData body, @QueryMap(encoded=true) PhysicalPortDataDeviceAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>physicalPortDataDeviceAll</code> method in a fluent style.
   */
  public static class PhysicalPortDataDeviceAllQueryParams extends HashMap<String, Object> {
    public PhysicalPortDataDeviceAllQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Interface entities
   * 
   * @param sessionId Session-ID (required)
   * @param portIdentifier  (required)
   * @param body  (required)
   * @return PhysicalPortDataInterfacesResponseData
   */
  @RequestLine("POST /api/rest/entity/physicalPortData/{portIdentifier}/Interfaces?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PhysicalPortDataInterfacesResponseData physicalPortDataInterfaces(@Param("sessionId") String sessionId, @Param("portIdentifier") String portIdentifier, PhysicalPortDataInterfacesRequestData body);

  /**
   * Get relations to Interface entities
   * Similar to <code>physicalPortDataInterfaces</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param portIdentifier  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/physicalPortData/{portIdentifier}/Interfaces?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PhysicalPortDataInterfacesResponseData> physicalPortDataInterfacesWithHttpInfo(@Param("sessionId") String sessionId, @Param("portIdentifier") String portIdentifier, PhysicalPortDataInterfacesRequestData body);


  /**
   * Get relations to Interface entities
   * 
   * Note, this is equivalent to the other <code>physicalPortDataInterfaces</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PhysicalPortDataInterfacesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param portIdentifier  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PhysicalPortDataInterfacesResponseData
   */
  @RequestLine("POST /api/rest/entity/physicalPortData/{portIdentifier}/Interfaces?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PhysicalPortDataInterfacesResponseData physicalPortDataInterfaces(@Param("portIdentifier") String portIdentifier, PhysicalPortDataInterfacesRequestData body, @QueryMap(encoded=true) PhysicalPortDataInterfacesQueryParams queryParams);

  /**
  * Get relations to Interface entities
  * 
  * Note, this is equivalent to the other <code>physicalPortDataInterfaces</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param portIdentifier  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PhysicalPortDataInterfacesResponseData
      */
      @RequestLine("POST /api/rest/entity/physicalPortData/{portIdentifier}/Interfaces?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PhysicalPortDataInterfacesResponseData> physicalPortDataInterfacesWithHttpInfo(@Param("portIdentifier") String portIdentifier, PhysicalPortDataInterfacesRequestData body, @QueryMap(encoded=true) PhysicalPortDataInterfacesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>physicalPortDataInterfaces</code> method in a fluent style.
   */
  public static class PhysicalPortDataInterfacesQueryParams extends HashMap<String, Object> {
    public PhysicalPortDataInterfacesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * IP addresses
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param portIdentifier  (required)
   * @param body  (required)
   * @return PhysicalPortDataIpAddressesResponse
   */
  @RequestLine("POST /api/rest/entity/physicalPortData/{portIdentifier}/IpAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PhysicalPortDataIpAddressesResponse physicalPortDataIpAddresses(@Param("sessionId") String sessionId, @Param("portIdentifier") String portIdentifier, PhysicalPortDataIpAddressesRequest body);

  /**
   * IP addresses
   * Similar to <code>physicalPortDataIpAddresses</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param portIdentifier  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/physicalPortData/{portIdentifier}/IpAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PhysicalPortDataIpAddressesResponse> physicalPortDataIpAddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("portIdentifier") String portIdentifier, PhysicalPortDataIpAddressesRequest body);


  /**
   * IP addresses
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>physicalPortDataIpAddresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PhysicalPortDataIpAddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param portIdentifier  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PhysicalPortDataIpAddressesResponse
   */
  @RequestLine("POST /api/rest/entity/physicalPortData/{portIdentifier}/IpAddresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PhysicalPortDataIpAddressesResponse physicalPortDataIpAddresses(@Param("portIdentifier") String portIdentifier, PhysicalPortDataIpAddressesRequest body, @QueryMap(encoded=true) PhysicalPortDataIpAddressesQueryParams queryParams);

  /**
  * IP addresses
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>physicalPortDataIpAddresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param portIdentifier  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PhysicalPortDataIpAddressesResponse
      */
      @RequestLine("POST /api/rest/entity/physicalPortData/{portIdentifier}/IpAddresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PhysicalPortDataIpAddressesResponse> physicalPortDataIpAddressesWithHttpInfo(@Param("portIdentifier") String portIdentifier, PhysicalPortDataIpAddressesRequest body, @QueryMap(encoded=true) PhysicalPortDataIpAddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>physicalPortDataIpAddresses</code> method in a fluent style.
   */
  public static class PhysicalPortDataIpAddressesQueryParams extends HashMap<String, Object> {
    public PhysicalPortDataIpAddressesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to IPv4 address entities
   * 
   * @param sessionId Session-ID (required)
   * @param portIdentifier  (required)
   * @param body  (required)
   * @return PhysicalPortDataIpv4AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/physicalPortData/{portIdentifier}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PhysicalPortDataIpv4AddressesResponseData physicalPortDataIpv4Addresses(@Param("sessionId") String sessionId, @Param("portIdentifier") String portIdentifier, PhysicalPortDataIpv4AddressesRequestData body);

  /**
   * Get relations to IPv4 address entities
   * Similar to <code>physicalPortDataIpv4Addresses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param portIdentifier  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/physicalPortData/{portIdentifier}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PhysicalPortDataIpv4AddressesResponseData> physicalPortDataIpv4AddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("portIdentifier") String portIdentifier, PhysicalPortDataIpv4AddressesRequestData body);


  /**
   * Get relations to IPv4 address entities
   * 
   * Note, this is equivalent to the other <code>physicalPortDataIpv4Addresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PhysicalPortDataIpv4AddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param portIdentifier  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PhysicalPortDataIpv4AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/physicalPortData/{portIdentifier}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PhysicalPortDataIpv4AddressesResponseData physicalPortDataIpv4Addresses(@Param("portIdentifier") String portIdentifier, PhysicalPortDataIpv4AddressesRequestData body, @QueryMap(encoded=true) PhysicalPortDataIpv4AddressesQueryParams queryParams);

  /**
  * Get relations to IPv4 address entities
  * 
  * Note, this is equivalent to the other <code>physicalPortDataIpv4Addresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param portIdentifier  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PhysicalPortDataIpv4AddressesResponseData
      */
      @RequestLine("POST /api/rest/entity/physicalPortData/{portIdentifier}/Ipv4Addresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PhysicalPortDataIpv4AddressesResponseData> physicalPortDataIpv4AddressesWithHttpInfo(@Param("portIdentifier") String portIdentifier, PhysicalPortDataIpv4AddressesRequestData body, @QueryMap(encoded=true) PhysicalPortDataIpv4AddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>physicalPortDataIpv4Addresses</code> method in a fluent style.
   */
  public static class PhysicalPortDataIpv4AddressesQueryParams extends HashMap<String, Object> {
    public PhysicalPortDataIpv4AddressesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Logical port entities
   * 
   * @param sessionId Session-ID (required)
   * @param portIdentifier  (required)
   * @param body  (required)
   * @return PhysicalPortDataLogicalPortResponseData
   */
  @RequestLine("POST /api/rest/entity/physicalPortData/{portIdentifier}/LogicalPort?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PhysicalPortDataLogicalPortResponseData physicalPortDataLogicalPort(@Param("sessionId") String sessionId, @Param("portIdentifier") String portIdentifier, PhysicalPortDataLogicalPortRequestData body);

  /**
   * Get relations to Logical port entities
   * Similar to <code>physicalPortDataLogicalPort</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param portIdentifier  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/physicalPortData/{portIdentifier}/LogicalPort?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PhysicalPortDataLogicalPortResponseData> physicalPortDataLogicalPortWithHttpInfo(@Param("sessionId") String sessionId, @Param("portIdentifier") String portIdentifier, PhysicalPortDataLogicalPortRequestData body);


  /**
   * Get relations to Logical port entities
   * 
   * Note, this is equivalent to the other <code>physicalPortDataLogicalPort</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PhysicalPortDataLogicalPortQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param portIdentifier  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PhysicalPortDataLogicalPortResponseData
   */
  @RequestLine("POST /api/rest/entity/physicalPortData/{portIdentifier}/LogicalPort?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PhysicalPortDataLogicalPortResponseData physicalPortDataLogicalPort(@Param("portIdentifier") String portIdentifier, PhysicalPortDataLogicalPortRequestData body, @QueryMap(encoded=true) PhysicalPortDataLogicalPortQueryParams queryParams);

  /**
  * Get relations to Logical port entities
  * 
  * Note, this is equivalent to the other <code>physicalPortDataLogicalPort</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param portIdentifier  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PhysicalPortDataLogicalPortResponseData
      */
      @RequestLine("POST /api/rest/entity/physicalPortData/{portIdentifier}/LogicalPort?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PhysicalPortDataLogicalPortResponseData> physicalPortDataLogicalPortWithHttpInfo(@Param("portIdentifier") String portIdentifier, PhysicalPortDataLogicalPortRequestData body, @QueryMap(encoded=true) PhysicalPortDataLogicalPortQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>physicalPortDataLogicalPort</code> method in a fluent style.
   */
  public static class PhysicalPortDataLogicalPortQueryParams extends HashMap<String, Object> {
    public PhysicalPortDataLogicalPortQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Queries port data for a device. Either the device ID, the device ELID or the port identifier has to be specified as a restriction.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PhysicalPortDataQueryResponse
   */
  @RequestLine("POST /api/rest/entity/physicalPortData/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PhysicalPortDataQueryResponse physicalPortDataQuery(@Param("sessionId") String sessionId, PhysicalPortDataQueryRequest body);

  /**
   * Basic query
   * Similar to <code>physicalPortDataQuery</code> but it also returns the http response headers .
   * Queries port data for a device. Either the device ID, the device ELID or the port identifier has to be specified as a restriction.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/physicalPortData/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PhysicalPortDataQueryResponse> physicalPortDataQueryWithHttpInfo(@Param("sessionId") String sessionId, PhysicalPortDataQueryRequest body);


  /**
   * Basic query
   * Queries port data for a device. Either the device ID, the device ELID or the port identifier has to be specified as a restriction.
   * Note, this is equivalent to the other <code>physicalPortDataQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PhysicalPortDataQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PhysicalPortDataQueryResponse
   */
  @RequestLine("POST /api/rest/entity/physicalPortData/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PhysicalPortDataQueryResponse physicalPortDataQuery(PhysicalPortDataQueryRequest body, @QueryMap(encoded=true) PhysicalPortDataQueryQueryParams queryParams);

  /**
  * Basic query
  * Queries port data for a device. Either the device ID, the device ELID or the port identifier has to be specified as a restriction.
  * Note, this is equivalent to the other <code>physicalPortDataQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PhysicalPortDataQueryResponse
      */
      @RequestLine("POST /api/rest/entity/physicalPortData/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PhysicalPortDataQueryResponse> physicalPortDataQueryWithHttpInfo(PhysicalPortDataQueryRequest body, @QueryMap(encoded=true) PhysicalPortDataQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>physicalPortDataQuery</code> method in a fluent style.
   */
  public static class PhysicalPortDataQueryQueryParams extends HashMap<String, Object> {
    public PhysicalPortDataQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * VLANs
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param portIdentifier  (required)
   * @param body  (required)
   * @return PhysicalPortDataVlansResponse
   */
  @RequestLine("POST /api/rest/entity/physicalPortData/{portIdentifier}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PhysicalPortDataVlansResponse physicalPortDataVlans(@Param("sessionId") String sessionId, @Param("portIdentifier") String portIdentifier, PhysicalPortDataVlansRequest body);

  /**
   * VLANs
   * Similar to <code>physicalPortDataVlans</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param portIdentifier  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/physicalPortData/{portIdentifier}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PhysicalPortDataVlansResponse> physicalPortDataVlansWithHttpInfo(@Param("sessionId") String sessionId, @Param("portIdentifier") String portIdentifier, PhysicalPortDataVlansRequest body);


  /**
   * VLANs
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>physicalPortDataVlans</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PhysicalPortDataVlansQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param portIdentifier  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PhysicalPortDataVlansResponse
   */
  @RequestLine("POST /api/rest/entity/physicalPortData/{portIdentifier}/Vlans?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PhysicalPortDataVlansResponse physicalPortDataVlans(@Param("portIdentifier") String portIdentifier, PhysicalPortDataVlansRequest body, @QueryMap(encoded=true) PhysicalPortDataVlansQueryParams queryParams);

  /**
  * VLANs
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>physicalPortDataVlans</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param portIdentifier  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PhysicalPortDataVlansResponse
      */
      @RequestLine("POST /api/rest/entity/physicalPortData/{portIdentifier}/Vlans?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PhysicalPortDataVlansResponse> physicalPortDataVlansWithHttpInfo(@Param("portIdentifier") String portIdentifier, PhysicalPortDataVlansRequest body, @QueryMap(encoded=true) PhysicalPortDataVlansQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>physicalPortDataVlans</code> method in a fluent style.
   */
  public static class PhysicalPortDataVlansQueryParams extends HashMap<String, Object> {
    public PhysicalPortDataVlansQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Reserve port
   * Reserve port
   * @param sessionId Session-ID (required)
   * @param portIdentifier  (required)
   * @param body  (required)
   * @return ReservePortPhysicalPortDataResponse
   */
  @RequestLine("POST /api/rest/entity/physicalPortData/{portIdentifier}/reservePort?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ReservePortPhysicalPortDataResponse reservePortPhysicalPortData(@Param("sessionId") String sessionId, @Param("portIdentifier") String portIdentifier, ReservePortPhysicalPortDataRequestData body);

  /**
   * Reserve port
   * Similar to <code>reservePortPhysicalPortData</code> but it also returns the http response headers .
   * Reserve port
   * @param sessionId Session-ID (required)
   * @param portIdentifier  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/physicalPortData/{portIdentifier}/reservePort?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ReservePortPhysicalPortDataResponse> reservePortPhysicalPortDataWithHttpInfo(@Param("sessionId") String sessionId, @Param("portIdentifier") String portIdentifier, ReservePortPhysicalPortDataRequestData body);


  /**
   * Reserve port
   * Reserve port
   * Note, this is equivalent to the other <code>reservePortPhysicalPortData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ReservePortPhysicalPortDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param portIdentifier  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ReservePortPhysicalPortDataResponse
   */
  @RequestLine("POST /api/rest/entity/physicalPortData/{portIdentifier}/reservePort?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ReservePortPhysicalPortDataResponse reservePortPhysicalPortData(@Param("portIdentifier") String portIdentifier, ReservePortPhysicalPortDataRequestData body, @QueryMap(encoded=true) ReservePortPhysicalPortDataQueryParams queryParams);

  /**
  * Reserve port
  * Reserve port
  * Note, this is equivalent to the other <code>reservePortPhysicalPortData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param portIdentifier  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ReservePortPhysicalPortDataResponse
      */
      @RequestLine("POST /api/rest/entity/physicalPortData/{portIdentifier}/reservePort?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ReservePortPhysicalPortDataResponse> reservePortPhysicalPortDataWithHttpInfo(@Param("portIdentifier") String portIdentifier, ReservePortPhysicalPortDataRequestData body, @QueryMap(encoded=true) ReservePortPhysicalPortDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>reservePortPhysicalPortData</code> method in a fluent style.
   */
  public static class ReservePortPhysicalPortDataQueryParams extends HashMap<String, Object> {
    public ReservePortPhysicalPortDataQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Unblock port
   * Unblock port
   * @param sessionId Session-ID (required)
   * @param portIdentifier  (required)
   * @param body  (optional)
   * @return UnblockPortPhysicalPortDataResponse
   */
  @RequestLine("POST /api/rest/entity/physicalPortData/{portIdentifier}/unblockPort?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UnblockPortPhysicalPortDataResponse unblockPortPhysicalPortData(@Param("sessionId") String sessionId, @Param("portIdentifier") String portIdentifier, Object body);

  /**
   * Unblock port
   * Similar to <code>unblockPortPhysicalPortData</code> but it also returns the http response headers .
   * Unblock port
   * @param sessionId Session-ID (required)
   * @param portIdentifier  (required)
   * @param body  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/physicalPortData/{portIdentifier}/unblockPort?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UnblockPortPhysicalPortDataResponse> unblockPortPhysicalPortDataWithHttpInfo(@Param("sessionId") String sessionId, @Param("portIdentifier") String portIdentifier, Object body);


  /**
   * Unblock port
   * Unblock port
   * Note, this is equivalent to the other <code>unblockPortPhysicalPortData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UnblockPortPhysicalPortDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param portIdentifier  (required)
   * @param body  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UnblockPortPhysicalPortDataResponse
   */
  @RequestLine("POST /api/rest/entity/physicalPortData/{portIdentifier}/unblockPort?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UnblockPortPhysicalPortDataResponse unblockPortPhysicalPortData(@Param("portIdentifier") String portIdentifier, Object body, @QueryMap(encoded=true) UnblockPortPhysicalPortDataQueryParams queryParams);

  /**
  * Unblock port
  * Unblock port
  * Note, this is equivalent to the other <code>unblockPortPhysicalPortData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param portIdentifier  (required)
              * @param body  (optional)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UnblockPortPhysicalPortDataResponse
      */
      @RequestLine("POST /api/rest/entity/physicalPortData/{portIdentifier}/unblockPort?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UnblockPortPhysicalPortDataResponse> unblockPortPhysicalPortDataWithHttpInfo(@Param("portIdentifier") String portIdentifier, Object body, @QueryMap(encoded=true) UnblockPortPhysicalPortDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>unblockPortPhysicalPortData</code> method in a fluent style.
   */
  public static class UnblockPortPhysicalPortDataQueryParams extends HashMap<String, Object> {
    public UnblockPortPhysicalPortDataQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify port data
   * @param sessionId Session-ID (required)
   * @param portIdentifier  (required)
   * @param body  (required)
   * @return UpdatePhysicalPortDataResponse
   */
  @RequestLine("POST /api/rest/entity/physicalPortData/{portIdentifier}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdatePhysicalPortDataResponse updatePhysicalPortData(@Param("sessionId") String sessionId, @Param("portIdentifier") String portIdentifier, UpdatePhysicalPortDataRequestData body);

  /**
   * Modify
   * Similar to <code>updatePhysicalPortData</code> but it also returns the http response headers .
   * Modify port data
   * @param sessionId Session-ID (required)
   * @param portIdentifier  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/physicalPortData/{portIdentifier}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdatePhysicalPortDataResponse> updatePhysicalPortDataWithHttpInfo(@Param("sessionId") String sessionId, @Param("portIdentifier") String portIdentifier, UpdatePhysicalPortDataRequestData body);


  /**
   * Modify
   * Modify port data
   * Note, this is equivalent to the other <code>updatePhysicalPortData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdatePhysicalPortDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param portIdentifier  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdatePhysicalPortDataResponse
   */
  @RequestLine("POST /api/rest/entity/physicalPortData/{portIdentifier}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdatePhysicalPortDataResponse updatePhysicalPortData(@Param("portIdentifier") String portIdentifier, UpdatePhysicalPortDataRequestData body, @QueryMap(encoded=true) UpdatePhysicalPortDataQueryParams queryParams);

  /**
  * Modify
  * Modify port data
  * Note, this is equivalent to the other <code>updatePhysicalPortData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param portIdentifier  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdatePhysicalPortDataResponse
      */
      @RequestLine("POST /api/rest/entity/physicalPortData/{portIdentifier}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdatePhysicalPortDataResponse> updatePhysicalPortDataWithHttpInfo(@Param("portIdentifier") String portIdentifier, UpdatePhysicalPortDataRequestData body, @QueryMap(encoded=true) UpdatePhysicalPortDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updatePhysicalPortData</code> method in a fluent style.
   */
  public static class UpdatePhysicalPortDataQueryParams extends HashMap<String, Object> {
    public UpdatePhysicalPortDataQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
