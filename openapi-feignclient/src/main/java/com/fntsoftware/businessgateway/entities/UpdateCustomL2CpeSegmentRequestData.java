/*
 * Swagger for Command BGE
 * Swagger API for FNT Command Business Gateway
 *
 * The version of the OpenAPI document: 20240131110751
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.fntsoftware.businessgateway.entities;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fntsoftware.businessgateway.entities.UpdateCustomL2CpeSegmentCreateLinkChassisRequestData;
import com.fntsoftware.businessgateway.entities.UpdateCustomL2CpeSegmentDeleteLinkChassisRequestData;
import com.fntsoftware.businessgateway.entities.UpdateCustomL2CpeSegmentSwapLinkIpv4NetworkRequestData;
import com.fntsoftware.businessgateway.entities.UpdateCustomL2CpeSegmentSwapLinkVlanRequestData;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UpdateCustomL2CpeSegmentRequestData
 */
@JsonPropertyOrder({
  UpdateCustomL2CpeSegmentRequestData.JSON_PROPERTY_SOURCE_ID,
  UpdateCustomL2CpeSegmentRequestData.JSON_PROPERTY_VLAN_ID,
  UpdateCustomL2CpeSegmentRequestData.JSON_PROPERTY_DATASOURCE,
  UpdateCustomL2CpeSegmentRequestData.JSON_PROPERTY_DATASOURCE_DELETED,
  UpdateCustomL2CpeSegmentRequestData.JSON_PROPERTY_SOURCE_SYSTEM,
  UpdateCustomL2CpeSegmentRequestData.JSON_PROPERTY_DATASOURCE_ID,
  UpdateCustomL2CpeSegmentRequestData.JSON_PROPERTY_CONTEXT_ID,
  UpdateCustomL2CpeSegmentRequestData.JSON_PROPERTY_VISIBLE_ID,
  UpdateCustomL2CpeSegmentRequestData.JSON_PROPERTY_ID,
  UpdateCustomL2CpeSegmentRequestData.JSON_PROPERTY_NETWORK,
  UpdateCustomL2CpeSegmentRequestData.JSON_PROPERTY_CREATE_LINK_CHASSIS,
  UpdateCustomL2CpeSegmentRequestData.JSON_PROPERTY_DELETE_LINK_CHASSIS,
  UpdateCustomL2CpeSegmentRequestData.JSON_PROPERTY_SWAP_LINK_IPV4_NETWORK,
  UpdateCustomL2CpeSegmentRequestData.JSON_PROPERTY_SWAP_LINK_VLAN
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class UpdateCustomL2CpeSegmentRequestData {
  public static final String JSON_PROPERTY_SOURCE_ID = "sourceId";
  private String sourceId;

  public static final String JSON_PROPERTY_VLAN_ID = "vlanId";
  private BigDecimal vlanId;

  public static final String JSON_PROPERTY_DATASOURCE = "datasource";
  private String datasource;

  public static final String JSON_PROPERTY_DATASOURCE_DELETED = "datasourceDeleted";
  private String datasourceDeleted;

  public static final String JSON_PROPERTY_SOURCE_SYSTEM = "sourceSystem";
  private String sourceSystem;

  public static final String JSON_PROPERTY_DATASOURCE_ID = "datasourceId";
  private String datasourceId;

  public static final String JSON_PROPERTY_CONTEXT_ID = "contextId";
  private String contextId;

  public static final String JSON_PROPERTY_VISIBLE_ID = "visibleId";
  private String visibleId;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NETWORK = "network";
  private String network;

  public static final String JSON_PROPERTY_CREATE_LINK_CHASSIS = "createLinkChassis";
  private List<UpdateCustomL2CpeSegmentCreateLinkChassisRequestData> createLinkChassis;

  public static final String JSON_PROPERTY_DELETE_LINK_CHASSIS = "deleteLinkChassis";
  private List<UpdateCustomL2CpeSegmentDeleteLinkChassisRequestData> deleteLinkChassis;

  public static final String JSON_PROPERTY_SWAP_LINK_IPV4_NETWORK = "swapLinkIpv4Network";
  private UpdateCustomL2CpeSegmentSwapLinkIpv4NetworkRequestData swapLinkIpv4Network;

  public static final String JSON_PROPERTY_SWAP_LINK_VLAN = "swapLinkVlan";
  private UpdateCustomL2CpeSegmentSwapLinkVlanRequestData swapLinkVlan;

  public UpdateCustomL2CpeSegmentRequestData() {
  }

  public UpdateCustomL2CpeSegmentRequestData sourceId(String sourceId) {
    
    this.sourceId = sourceId;
    return this;
  }

   /**
   * Get sourceId
   * @return sourceId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSourceId() {
    return sourceId;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }


  public UpdateCustomL2CpeSegmentRequestData vlanId(BigDecimal vlanId) {
    
    this.vlanId = vlanId;
    return this;
  }

   /**
   * Get vlanId
   * @return vlanId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VLAN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getVlanId() {
    return vlanId;
  }


  @JsonProperty(JSON_PROPERTY_VLAN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVlanId(BigDecimal vlanId) {
    this.vlanId = vlanId;
  }


  public UpdateCustomL2CpeSegmentRequestData datasource(String datasource) {
    
    this.datasource = datasource;
    return this;
  }

   /**
   * Get datasource
   * @return datasource
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATASOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDatasource() {
    return datasource;
  }


  @JsonProperty(JSON_PROPERTY_DATASOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatasource(String datasource) {
    this.datasource = datasource;
  }


  public UpdateCustomL2CpeSegmentRequestData datasourceDeleted(String datasourceDeleted) {
    
    this.datasourceDeleted = datasourceDeleted;
    return this;
  }

   /**
   * Get datasourceDeleted
   * @return datasourceDeleted
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATASOURCE_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDatasourceDeleted() {
    return datasourceDeleted;
  }


  @JsonProperty(JSON_PROPERTY_DATASOURCE_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatasourceDeleted(String datasourceDeleted) {
    this.datasourceDeleted = datasourceDeleted;
  }


  public UpdateCustomL2CpeSegmentRequestData sourceSystem(String sourceSystem) {
    
    this.sourceSystem = sourceSystem;
    return this;
  }

   /**
   * Get sourceSystem
   * @return sourceSystem
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_SYSTEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSourceSystem() {
    return sourceSystem;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_SYSTEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceSystem(String sourceSystem) {
    this.sourceSystem = sourceSystem;
  }


  public UpdateCustomL2CpeSegmentRequestData datasourceId(String datasourceId) {
    
    this.datasourceId = datasourceId;
    return this;
  }

   /**
   * Get datasourceId
   * @return datasourceId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATASOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDatasourceId() {
    return datasourceId;
  }


  @JsonProperty(JSON_PROPERTY_DATASOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatasourceId(String datasourceId) {
    this.datasourceId = datasourceId;
  }


  public UpdateCustomL2CpeSegmentRequestData contextId(String contextId) {
    
    this.contextId = contextId;
    return this;
  }

   /**
   * Get contextId
   * @return contextId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTEXT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContextId() {
    return contextId;
  }


  @JsonProperty(JSON_PROPERTY_CONTEXT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContextId(String contextId) {
    this.contextId = contextId;
  }


  public UpdateCustomL2CpeSegmentRequestData visibleId(String visibleId) {
    
    this.visibleId = visibleId;
    return this;
  }

   /**
   * Get visibleId
   * @return visibleId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VISIBLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVisibleId() {
    return visibleId;
  }


  @JsonProperty(JSON_PROPERTY_VISIBLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVisibleId(String visibleId) {
    this.visibleId = visibleId;
  }


  public UpdateCustomL2CpeSegmentRequestData id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public UpdateCustomL2CpeSegmentRequestData network(String network) {
    
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NETWORK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNetwork() {
    return network;
  }


  @JsonProperty(JSON_PROPERTY_NETWORK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetwork(String network) {
    this.network = network;
  }


  public UpdateCustomL2CpeSegmentRequestData createLinkChassis(List<UpdateCustomL2CpeSegmentCreateLinkChassisRequestData> createLinkChassis) {
    
    this.createLinkChassis = createLinkChassis;
    return this;
  }

  public UpdateCustomL2CpeSegmentRequestData addCreateLinkChassisItem(UpdateCustomL2CpeSegmentCreateLinkChassisRequestData createLinkChassisItem) {
    if (this.createLinkChassis == null) {
      this.createLinkChassis = new ArrayList<>();
    }
    this.createLinkChassis.add(createLinkChassisItem);
    return this;
  }

   /**
   * Get createLinkChassis
   * @return createLinkChassis
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE_LINK_CHASSIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UpdateCustomL2CpeSegmentCreateLinkChassisRequestData> getCreateLinkChassis() {
    return createLinkChassis;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_CHASSIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkChassis(List<UpdateCustomL2CpeSegmentCreateLinkChassisRequestData> createLinkChassis) {
    this.createLinkChassis = createLinkChassis;
  }


  public UpdateCustomL2CpeSegmentRequestData deleteLinkChassis(List<UpdateCustomL2CpeSegmentDeleteLinkChassisRequestData> deleteLinkChassis) {
    
    this.deleteLinkChassis = deleteLinkChassis;
    return this;
  }

  public UpdateCustomL2CpeSegmentRequestData addDeleteLinkChassisItem(UpdateCustomL2CpeSegmentDeleteLinkChassisRequestData deleteLinkChassisItem) {
    if (this.deleteLinkChassis == null) {
      this.deleteLinkChassis = new ArrayList<>();
    }
    this.deleteLinkChassis.add(deleteLinkChassisItem);
    return this;
  }

   /**
   * Get deleteLinkChassis
   * @return deleteLinkChassis
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETE_LINK_CHASSIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UpdateCustomL2CpeSegmentDeleteLinkChassisRequestData> getDeleteLinkChassis() {
    return deleteLinkChassis;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_LINK_CHASSIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteLinkChassis(List<UpdateCustomL2CpeSegmentDeleteLinkChassisRequestData> deleteLinkChassis) {
    this.deleteLinkChassis = deleteLinkChassis;
  }


  public UpdateCustomL2CpeSegmentRequestData swapLinkIpv4Network(UpdateCustomL2CpeSegmentSwapLinkIpv4NetworkRequestData swapLinkIpv4Network) {
    
    this.swapLinkIpv4Network = swapLinkIpv4Network;
    return this;
  }

   /**
   * Get swapLinkIpv4Network
   * @return swapLinkIpv4Network
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SWAP_LINK_IPV4_NETWORK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UpdateCustomL2CpeSegmentSwapLinkIpv4NetworkRequestData getSwapLinkIpv4Network() {
    return swapLinkIpv4Network;
  }


  @JsonProperty(JSON_PROPERTY_SWAP_LINK_IPV4_NETWORK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSwapLinkIpv4Network(UpdateCustomL2CpeSegmentSwapLinkIpv4NetworkRequestData swapLinkIpv4Network) {
    this.swapLinkIpv4Network = swapLinkIpv4Network;
  }


  public UpdateCustomL2CpeSegmentRequestData swapLinkVlan(UpdateCustomL2CpeSegmentSwapLinkVlanRequestData swapLinkVlan) {
    
    this.swapLinkVlan = swapLinkVlan;
    return this;
  }

   /**
   * Get swapLinkVlan
   * @return swapLinkVlan
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SWAP_LINK_VLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UpdateCustomL2CpeSegmentSwapLinkVlanRequestData getSwapLinkVlan() {
    return swapLinkVlan;
  }


  @JsonProperty(JSON_PROPERTY_SWAP_LINK_VLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSwapLinkVlan(UpdateCustomL2CpeSegmentSwapLinkVlanRequestData swapLinkVlan) {
    this.swapLinkVlan = swapLinkVlan;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCustomL2CpeSegmentRequestData updateCustomL2CpeSegmentRequestData = (UpdateCustomL2CpeSegmentRequestData) o;
    return Objects.equals(this.sourceId, updateCustomL2CpeSegmentRequestData.sourceId) &&
        Objects.equals(this.vlanId, updateCustomL2CpeSegmentRequestData.vlanId) &&
        Objects.equals(this.datasource, updateCustomL2CpeSegmentRequestData.datasource) &&
        Objects.equals(this.datasourceDeleted, updateCustomL2CpeSegmentRequestData.datasourceDeleted) &&
        Objects.equals(this.sourceSystem, updateCustomL2CpeSegmentRequestData.sourceSystem) &&
        Objects.equals(this.datasourceId, updateCustomL2CpeSegmentRequestData.datasourceId) &&
        Objects.equals(this.contextId, updateCustomL2CpeSegmentRequestData.contextId) &&
        Objects.equals(this.visibleId, updateCustomL2CpeSegmentRequestData.visibleId) &&
        Objects.equals(this.id, updateCustomL2CpeSegmentRequestData.id) &&
        Objects.equals(this.network, updateCustomL2CpeSegmentRequestData.network) &&
        Objects.equals(this.createLinkChassis, updateCustomL2CpeSegmentRequestData.createLinkChassis) &&
        Objects.equals(this.deleteLinkChassis, updateCustomL2CpeSegmentRequestData.deleteLinkChassis) &&
        Objects.equals(this.swapLinkIpv4Network, updateCustomL2CpeSegmentRequestData.swapLinkIpv4Network) &&
        Objects.equals(this.swapLinkVlan, updateCustomL2CpeSegmentRequestData.swapLinkVlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceId, vlanId, datasource, datasourceDeleted, sourceSystem, datasourceId, contextId, visibleId, id, network, createLinkChassis, deleteLinkChassis, swapLinkIpv4Network, swapLinkVlan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCustomL2CpeSegmentRequestData {\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    vlanId: ").append(toIndentedString(vlanId)).append("\n");
    sb.append("    datasource: ").append(toIndentedString(datasource)).append("\n");
    sb.append("    datasourceDeleted: ").append(toIndentedString(datasourceDeleted)).append("\n");
    sb.append("    sourceSystem: ").append(toIndentedString(sourceSystem)).append("\n");
    sb.append("    datasourceId: ").append(toIndentedString(datasourceId)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    visibleId: ").append(toIndentedString(visibleId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    createLinkChassis: ").append(toIndentedString(createLinkChassis)).append("\n");
    sb.append("    deleteLinkChassis: ").append(toIndentedString(deleteLinkChassis)).append("\n");
    sb.append("    swapLinkIpv4Network: ").append(toIndentedString(swapLinkIpv4Network)).append("\n");
    sb.append("    swapLinkVlan: ").append(toIndentedString(swapLinkVlan)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
