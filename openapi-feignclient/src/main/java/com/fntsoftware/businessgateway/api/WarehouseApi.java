package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateWarehouseRequestData;
import com.fntsoftware.businessgateway.entities.CreateWarehouseResponse;
import com.fntsoftware.businessgateway.entities.DeleteWarehouseRequestData;
import com.fntsoftware.businessgateway.entities.DeleteWarehouseResponse;
import com.fntsoftware.businessgateway.entities.InventoryAssemblyUnitWarehouseRequestData;
import com.fntsoftware.businessgateway.entities.InventoryAssemblyUnitWarehouseResponse;
import com.fntsoftware.businessgateway.entities.InventoryAssemblyUnitsFromOrderWarehouseRequestData;
import com.fntsoftware.businessgateway.entities.InventoryAssemblyUnitsFromOrderWarehouseResponse;
import com.fntsoftware.businessgateway.entities.InventoryObjectsFromOrderWarehouseRequestData;
import com.fntsoftware.businessgateway.entities.InventoryObjectsFromOrderWarehouseResponse;
import com.fntsoftware.businessgateway.entities.InventoryWarehouseRequestData;
import com.fntsoftware.businessgateway.entities.InventoryWarehouseResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesWarehouseRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesWarehouseResponse;
import com.fntsoftware.businessgateway.entities.UpdateWarehouseRequestData;
import com.fntsoftware.businessgateway.entities.UpdateWarehouseResponse;
import com.fntsoftware.businessgateway.entities.WarehouseObjectsInWarehouseRequest;
import com.fntsoftware.businessgateway.entities.WarehouseObjectsInWarehouseResponse;
import com.fntsoftware.businessgateway.entities.WarehouseQueryRequest;
import com.fntsoftware.businessgateway.entities.WarehouseQueryResponse;
import com.fntsoftware.businessgateway.entities.WarehouseSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.WarehouseSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.WarehouseZoneRequestData;
import com.fntsoftware.businessgateway.entities.WarehouseZoneResponseData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface WarehouseApi extends ApiClient.Api {


  /**
   * Create
   * Create warehouse
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateWarehouseResponse
   */
  @RequestLine("POST /api/rest/entity/warehouse/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateWarehouseResponse createWarehouse(@Param("sessionId") String sessionId, CreateWarehouseRequestData body);

  /**
   * Create
   * Similar to <code>createWarehouse</code> but it also returns the http response headers .
   * Create warehouse
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/warehouse/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateWarehouseResponse> createWarehouseWithHttpInfo(@Param("sessionId") String sessionId, CreateWarehouseRequestData body);


  /**
   * Create
   * Create warehouse
   * Note, this is equivalent to the other <code>createWarehouse</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateWarehouseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateWarehouseResponse
   */
  @RequestLine("POST /api/rest/entity/warehouse/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateWarehouseResponse createWarehouse(CreateWarehouseRequestData body, @QueryMap(encoded=true) CreateWarehouseQueryParams queryParams);

  /**
  * Create
  * Create warehouse
  * Note, this is equivalent to the other <code>createWarehouse</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateWarehouseResponse
      */
      @RequestLine("POST /api/rest/entity/warehouse/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateWarehouseResponse> createWarehouseWithHttpInfo(CreateWarehouseRequestData body, @QueryMap(encoded=true) CreateWarehouseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createWarehouse</code> method in a fluent style.
   */
  public static class CreateWarehouseQueryParams extends HashMap<String, Object> {
    public CreateWarehouseQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete warehouse
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteWarehouseResponse
   */
  @RequestLine("POST /api/rest/entity/warehouse/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteWarehouseResponse deleteWarehouse(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteWarehouseRequestData body);

  /**
   * Delete
   * Similar to <code>deleteWarehouse</code> but it also returns the http response headers .
   * Delete warehouse
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/warehouse/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteWarehouseResponse> deleteWarehouseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteWarehouseRequestData body);


  /**
   * Delete
   * Delete warehouse
   * Note, this is equivalent to the other <code>deleteWarehouse</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteWarehouseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteWarehouseResponse
   */
  @RequestLine("POST /api/rest/entity/warehouse/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteWarehouseResponse deleteWarehouse(@Param("elid") String elid, DeleteWarehouseRequestData body, @QueryMap(encoded=true) DeleteWarehouseQueryParams queryParams);

  /**
  * Delete
  * Delete warehouse
  * Note, this is equivalent to the other <code>deleteWarehouse</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteWarehouseResponse
      */
      @RequestLine("POST /api/rest/entity/warehouse/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteWarehouseResponse> deleteWarehouseWithHttpInfo(@Param("elid") String elid, DeleteWarehouseRequestData body, @QueryMap(encoded=true) DeleteWarehouseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteWarehouse</code> method in a fluent style.
   */
  public static class DeleteWarehouseQueryParams extends HashMap<String, Object> {
    public DeleteWarehouseQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Inventory assembly unit
   * Inventorize a new assembly unit in the warehouse
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return InventoryAssemblyUnitWarehouseResponse
   */
  @RequestLine("POST /api/rest/entity/warehouse/{elid}/inventoryAssemblyUnit?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  InventoryAssemblyUnitWarehouseResponse inventoryAssemblyUnitWarehouse(@Param("sessionId") String sessionId, @Param("elid") String elid, InventoryAssemblyUnitWarehouseRequestData body);

  /**
   * Inventory assembly unit
   * Similar to <code>inventoryAssemblyUnitWarehouse</code> but it also returns the http response headers .
   * Inventorize a new assembly unit in the warehouse
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/warehouse/{elid}/inventoryAssemblyUnit?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<InventoryAssemblyUnitWarehouseResponse> inventoryAssemblyUnitWarehouseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, InventoryAssemblyUnitWarehouseRequestData body);


  /**
   * Inventory assembly unit
   * Inventorize a new assembly unit in the warehouse
   * Note, this is equivalent to the other <code>inventoryAssemblyUnitWarehouse</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link InventoryAssemblyUnitWarehouseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return InventoryAssemblyUnitWarehouseResponse
   */
  @RequestLine("POST /api/rest/entity/warehouse/{elid}/inventoryAssemblyUnit?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  InventoryAssemblyUnitWarehouseResponse inventoryAssemblyUnitWarehouse(@Param("elid") String elid, InventoryAssemblyUnitWarehouseRequestData body, @QueryMap(encoded=true) InventoryAssemblyUnitWarehouseQueryParams queryParams);

  /**
  * Inventory assembly unit
  * Inventorize a new assembly unit in the warehouse
  * Note, this is equivalent to the other <code>inventoryAssemblyUnitWarehouse</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return InventoryAssemblyUnitWarehouseResponse
      */
      @RequestLine("POST /api/rest/entity/warehouse/{elid}/inventoryAssemblyUnit?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<InventoryAssemblyUnitWarehouseResponse> inventoryAssemblyUnitWarehouseWithHttpInfo(@Param("elid") String elid, InventoryAssemblyUnitWarehouseRequestData body, @QueryMap(encoded=true) InventoryAssemblyUnitWarehouseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>inventoryAssemblyUnitWarehouse</code> method in a fluent style.
   */
  public static class InventoryAssemblyUnitWarehouseQueryParams extends HashMap<String, Object> {
    public InventoryAssemblyUnitWarehouseQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Inventorize assembly units from order
   * Inventorize assembly units from order
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return InventoryAssemblyUnitsFromOrderWarehouseResponse
   */
  @RequestLine("POST /api/rest/entity/warehouse/{elid}/inventoryAssemblyUnitsFromOrder?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  InventoryAssemblyUnitsFromOrderWarehouseResponse inventoryAssemblyUnitsFromOrderWarehouse(@Param("sessionId") String sessionId, @Param("elid") String elid, InventoryAssemblyUnitsFromOrderWarehouseRequestData body);

  /**
   * Inventorize assembly units from order
   * Similar to <code>inventoryAssemblyUnitsFromOrderWarehouse</code> but it also returns the http response headers .
   * Inventorize assembly units from order
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/warehouse/{elid}/inventoryAssemblyUnitsFromOrder?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<InventoryAssemblyUnitsFromOrderWarehouseResponse> inventoryAssemblyUnitsFromOrderWarehouseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, InventoryAssemblyUnitsFromOrderWarehouseRequestData body);


  /**
   * Inventorize assembly units from order
   * Inventorize assembly units from order
   * Note, this is equivalent to the other <code>inventoryAssemblyUnitsFromOrderWarehouse</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link InventoryAssemblyUnitsFromOrderWarehouseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return InventoryAssemblyUnitsFromOrderWarehouseResponse
   */
  @RequestLine("POST /api/rest/entity/warehouse/{elid}/inventoryAssemblyUnitsFromOrder?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  InventoryAssemblyUnitsFromOrderWarehouseResponse inventoryAssemblyUnitsFromOrderWarehouse(@Param("elid") String elid, InventoryAssemblyUnitsFromOrderWarehouseRequestData body, @QueryMap(encoded=true) InventoryAssemblyUnitsFromOrderWarehouseQueryParams queryParams);

  /**
  * Inventorize assembly units from order
  * Inventorize assembly units from order
  * Note, this is equivalent to the other <code>inventoryAssemblyUnitsFromOrderWarehouse</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return InventoryAssemblyUnitsFromOrderWarehouseResponse
      */
      @RequestLine("POST /api/rest/entity/warehouse/{elid}/inventoryAssemblyUnitsFromOrder?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<InventoryAssemblyUnitsFromOrderWarehouseResponse> inventoryAssemblyUnitsFromOrderWarehouseWithHttpInfo(@Param("elid") String elid, InventoryAssemblyUnitsFromOrderWarehouseRequestData body, @QueryMap(encoded=true) InventoryAssemblyUnitsFromOrderWarehouseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>inventoryAssemblyUnitsFromOrderWarehouse</code> method in a fluent style.
   */
  public static class InventoryAssemblyUnitsFromOrderWarehouseQueryParams extends HashMap<String, Object> {
    public InventoryAssemblyUnitsFromOrderWarehouseQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Inventorize object from order
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return InventoryObjectsFromOrderWarehouseResponse
   */
  @RequestLine("POST /api/rest/entity/warehouse/{elid}/inventoryObjectsFromOrder?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  InventoryObjectsFromOrderWarehouseResponse inventoryObjectsFromOrderWarehouse(@Param("sessionId") String sessionId, @Param("elid") String elid, InventoryObjectsFromOrderWarehouseRequestData body);

  /**
   * Inventorize object from order
   * Similar to <code>inventoryObjectsFromOrderWarehouse</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/warehouse/{elid}/inventoryObjectsFromOrder?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<InventoryObjectsFromOrderWarehouseResponse> inventoryObjectsFromOrderWarehouseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, InventoryObjectsFromOrderWarehouseRequestData body);


  /**
   * Inventorize object from order
   * 
   * Note, this is equivalent to the other <code>inventoryObjectsFromOrderWarehouse</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link InventoryObjectsFromOrderWarehouseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return InventoryObjectsFromOrderWarehouseResponse
   */
  @RequestLine("POST /api/rest/entity/warehouse/{elid}/inventoryObjectsFromOrder?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  InventoryObjectsFromOrderWarehouseResponse inventoryObjectsFromOrderWarehouse(@Param("elid") String elid, InventoryObjectsFromOrderWarehouseRequestData body, @QueryMap(encoded=true) InventoryObjectsFromOrderWarehouseQueryParams queryParams);

  /**
  * Inventorize object from order
  * 
  * Note, this is equivalent to the other <code>inventoryObjectsFromOrderWarehouse</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return InventoryObjectsFromOrderWarehouseResponse
      */
      @RequestLine("POST /api/rest/entity/warehouse/{elid}/inventoryObjectsFromOrder?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<InventoryObjectsFromOrderWarehouseResponse> inventoryObjectsFromOrderWarehouseWithHttpInfo(@Param("elid") String elid, InventoryObjectsFromOrderWarehouseRequestData body, @QueryMap(encoded=true) InventoryObjectsFromOrderWarehouseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>inventoryObjectsFromOrderWarehouse</code> method in a fluent style.
   */
  public static class InventoryObjectsFromOrderWarehouseQueryParams extends HashMap<String, Object> {
    public InventoryObjectsFromOrderWarehouseQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Inventory
   * Inventory new object in warehouse
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return InventoryWarehouseResponse
   */
  @RequestLine("POST /api/rest/entity/warehouse/{elid}/inventory?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  InventoryWarehouseResponse inventoryWarehouse(@Param("sessionId") String sessionId, @Param("elid") String elid, InventoryWarehouseRequestData body);

  /**
   * Inventory
   * Similar to <code>inventoryWarehouse</code> but it also returns the http response headers .
   * Inventory new object in warehouse
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/warehouse/{elid}/inventory?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<InventoryWarehouseResponse> inventoryWarehouseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, InventoryWarehouseRequestData body);


  /**
   * Inventory
   * Inventory new object in warehouse
   * Note, this is equivalent to the other <code>inventoryWarehouse</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link InventoryWarehouseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return InventoryWarehouseResponse
   */
  @RequestLine("POST /api/rest/entity/warehouse/{elid}/inventory?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  InventoryWarehouseResponse inventoryWarehouse(@Param("elid") String elid, InventoryWarehouseRequestData body, @QueryMap(encoded=true) InventoryWarehouseQueryParams queryParams);

  /**
  * Inventory
  * Inventory new object in warehouse
  * Note, this is equivalent to the other <code>inventoryWarehouse</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return InventoryWarehouseResponse
      */
      @RequestLine("POST /api/rest/entity/warehouse/{elid}/inventory?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<InventoryWarehouseResponse> inventoryWarehouseWithHttpInfo(@Param("elid") String elid, InventoryWarehouseRequestData body, @QueryMap(encoded=true) InventoryWarehouseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>inventoryWarehouse</code> method in a fluent style.
   */
  public static class InventoryWarehouseQueryParams extends HashMap<String, Object> {
    public InventoryWarehouseQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesWarehouseResponse
   */
  @RequestLine("POST /api/rest/entity/warehouse/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesWarehouseResponse updateSystemAttributesWarehouse(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesWarehouseRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesWarehouse</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/warehouse/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesWarehouseResponse> updateSystemAttributesWarehouseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesWarehouseRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesWarehouse</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesWarehouseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesWarehouseResponse
   */
  @RequestLine("POST /api/rest/entity/warehouse/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesWarehouseResponse updateSystemAttributesWarehouse(@Param("elid") String elid, UpdateSystemAttributesWarehouseRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesWarehouseQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesWarehouse</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesWarehouseResponse
      */
      @RequestLine("POST /api/rest/entity/warehouse/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesWarehouseResponse> updateSystemAttributesWarehouseWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesWarehouseRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesWarehouseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesWarehouse</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesWarehouseQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesWarehouseQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify warehouse
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateWarehouseResponse
   */
  @RequestLine("POST /api/rest/entity/warehouse/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateWarehouseResponse updateWarehouse(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateWarehouseRequestData body);

  /**
   * Modify
   * Similar to <code>updateWarehouse</code> but it also returns the http response headers .
   * Modify warehouse
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/warehouse/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateWarehouseResponse> updateWarehouseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateWarehouseRequestData body);


  /**
   * Modify
   * Modify warehouse
   * Note, this is equivalent to the other <code>updateWarehouse</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateWarehouseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateWarehouseResponse
   */
  @RequestLine("POST /api/rest/entity/warehouse/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateWarehouseResponse updateWarehouse(@Param("elid") String elid, UpdateWarehouseRequestData body, @QueryMap(encoded=true) UpdateWarehouseQueryParams queryParams);

  /**
  * Modify
  * Modify warehouse
  * Note, this is equivalent to the other <code>updateWarehouse</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateWarehouseResponse
      */
      @RequestLine("POST /api/rest/entity/warehouse/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateWarehouseResponse> updateWarehouseWithHttpInfo(@Param("elid") String elid, UpdateWarehouseRequestData body, @QueryMap(encoded=true) UpdateWarehouseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateWarehouse</code> method in a fluent style.
   */
  public static class UpdateWarehouseQueryParams extends HashMap<String, Object> {
    public UpdateWarehouseQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Devices in warehouse
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return WarehouseObjectsInWarehouseResponse
   */
  @RequestLine("POST /api/rest/entity/warehouse/{elid}/ObjectsInWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  WarehouseObjectsInWarehouseResponse warehouseObjectsInWarehouse(@Param("sessionId") String sessionId, @Param("elid") String elid, WarehouseObjectsInWarehouseRequest body);

  /**
   * Devices in warehouse
   * Similar to <code>warehouseObjectsInWarehouse</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/warehouse/{elid}/ObjectsInWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<WarehouseObjectsInWarehouseResponse> warehouseObjectsInWarehouseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, WarehouseObjectsInWarehouseRequest body);


  /**
   * Devices in warehouse
   * 
   * Note, this is equivalent to the other <code>warehouseObjectsInWarehouse</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link WarehouseObjectsInWarehouseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return WarehouseObjectsInWarehouseResponse
   */
  @RequestLine("POST /api/rest/entity/warehouse/{elid}/ObjectsInWarehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  WarehouseObjectsInWarehouseResponse warehouseObjectsInWarehouse(@Param("elid") String elid, WarehouseObjectsInWarehouseRequest body, @QueryMap(encoded=true) WarehouseObjectsInWarehouseQueryParams queryParams);

  /**
  * Devices in warehouse
  * 
  * Note, this is equivalent to the other <code>warehouseObjectsInWarehouse</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return WarehouseObjectsInWarehouseResponse
      */
      @RequestLine("POST /api/rest/entity/warehouse/{elid}/ObjectsInWarehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<WarehouseObjectsInWarehouseResponse> warehouseObjectsInWarehouseWithHttpInfo(@Param("elid") String elid, WarehouseObjectsInWarehouseRequest body, @QueryMap(encoded=true) WarehouseObjectsInWarehouseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>warehouseObjectsInWarehouse</code> method in a fluent style.
   */
  public static class WarehouseObjectsInWarehouseQueryParams extends HashMap<String, Object> {
    public WarehouseObjectsInWarehouseQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return WarehouseQueryResponse
   */
  @RequestLine("POST /api/rest/entity/warehouse/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  WarehouseQueryResponse warehouseQuery(@Param("sessionId") String sessionId, WarehouseQueryRequest body);

  /**
   * Basic query
   * Similar to <code>warehouseQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/warehouse/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<WarehouseQueryResponse> warehouseQueryWithHttpInfo(@Param("sessionId") String sessionId, WarehouseQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>warehouseQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link WarehouseQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return WarehouseQueryResponse
   */
  @RequestLine("POST /api/rest/entity/warehouse/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  WarehouseQueryResponse warehouseQuery(WarehouseQueryRequest body, @QueryMap(encoded=true) WarehouseQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>warehouseQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return WarehouseQueryResponse
      */
      @RequestLine("POST /api/rest/entity/warehouse/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<WarehouseQueryResponse> warehouseQueryWithHttpInfo(WarehouseQueryRequest body, @QueryMap(encoded=true) WarehouseQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>warehouseQuery</code> method in a fluent style.
   */
  public static class WarehouseQueryQueryParams extends HashMap<String, Object> {
    public WarehouseQueryQueryParams sessionId(final String value) {
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
   * @return WarehouseSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/warehouse/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  WarehouseSystemAttributesResponse warehouseSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, WarehouseSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>warehouseSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/warehouse/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<WarehouseSystemAttributesResponse> warehouseSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, WarehouseSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>warehouseSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link WarehouseSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return WarehouseSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/warehouse/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  WarehouseSystemAttributesResponse warehouseSystemAttributes(@Param("elid") String elid, WarehouseSystemAttributesRequest body, @QueryMap(encoded=true) WarehouseSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>warehouseSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return WarehouseSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/warehouse/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<WarehouseSystemAttributesResponse> warehouseSystemAttributesWithHttpInfo(@Param("elid") String elid, WarehouseSystemAttributesRequest body, @QueryMap(encoded=true) WarehouseSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>warehouseSystemAttributes</code> method in a fluent style.
   */
  public static class WarehouseSystemAttributesQueryParams extends HashMap<String, Object> {
    public WarehouseSystemAttributesQueryParams sessionId(final String value) {
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
   * @return WarehouseZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/warehouse/{elid}/Zone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  WarehouseZoneResponseData warehouseZone(@Param("sessionId") String sessionId, @Param("elid") String elid, WarehouseZoneRequestData body);

  /**
   * Get relations to Zone entities
   * Similar to <code>warehouseZone</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/warehouse/{elid}/Zone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<WarehouseZoneResponseData> warehouseZoneWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, WarehouseZoneRequestData body);


  /**
   * Get relations to Zone entities
   * 
   * Note, this is equivalent to the other <code>warehouseZone</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link WarehouseZoneQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return WarehouseZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/warehouse/{elid}/Zone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  WarehouseZoneResponseData warehouseZone(@Param("elid") String elid, WarehouseZoneRequestData body, @QueryMap(encoded=true) WarehouseZoneQueryParams queryParams);

  /**
  * Get relations to Zone entities
  * 
  * Note, this is equivalent to the other <code>warehouseZone</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return WarehouseZoneResponseData
      */
      @RequestLine("POST /api/rest/entity/warehouse/{elid}/Zone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<WarehouseZoneResponseData> warehouseZoneWithHttpInfo(@Param("elid") String elid, WarehouseZoneRequestData body, @QueryMap(encoded=true) WarehouseZoneQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>warehouseZone</code> method in a fluent style.
   */
  public static class WarehouseZoneQueryParams extends HashMap<String, Object> {
    public WarehouseZoneQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
