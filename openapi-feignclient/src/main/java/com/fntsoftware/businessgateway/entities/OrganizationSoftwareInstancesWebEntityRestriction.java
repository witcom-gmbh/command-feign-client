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
import com.fntsoftware.businessgateway.entities.RestrictionsBoolean;
import com.fntsoftware.businessgateway.entities.RestrictionsString;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * OrganizationSoftwareInstancesWebEntityRestriction
 */
@JsonPropertyOrder({
  OrganizationSoftwareInstancesWebEntityRestriction.JSON_PROPERTY_LOADBALANCED,
  OrganizationSoftwareInstancesWebEntityRestriction.JSON_PROPERTY_DESCRIPTION,
  OrganizationSoftwareInstancesWebEntityRestriction.JSON_PROPERTY_DOC_ROOT,
  OrganizationSoftwareInstancesWebEntityRestriction.JSON_PROPERTY_SSL_PORT,
  OrganizationSoftwareInstancesWebEntityRestriction.JSON_PROPERTY_ELID,
  OrganizationSoftwareInstancesWebEntityRestriction.JSON_PROPERTY_URL,
  OrganizationSoftwareInstancesWebEntityRestriction.JSON_PROPERTY_PORT,
  OrganizationSoftwareInstancesWebEntityRestriction.JSON_PROPERTY_NAME,
  OrganizationSoftwareInstancesWebEntityRestriction.JSON_PROPERTY_ADMIN_SERVER,
  OrganizationSoftwareInstancesWebEntityRestriction.JSON_PROPERTY_ADMIN_PORT,
  OrganizationSoftwareInstancesWebEntityRestriction.JSON_PROPERTY_ID,
  OrganizationSoftwareInstancesWebEntityRestriction.JSON_PROPERTY_REDIRECTION,
  OrganizationSoftwareInstancesWebEntityRestriction.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class OrganizationSoftwareInstancesWebEntityRestriction {
  public static final String JSON_PROPERTY_LOADBALANCED = "loadbalanced";
  private RestrictionsBoolean loadbalanced;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private RestrictionsString description;

  public static final String JSON_PROPERTY_DOC_ROOT = "docRoot";
  private RestrictionsString docRoot;

  public static final String JSON_PROPERTY_SSL_PORT = "sslPort";
  private RestrictionsString sslPort;

  public static final String JSON_PROPERTY_ELID = "elid";
  private RestrictionsString elid;

  public static final String JSON_PROPERTY_URL = "url";
  private RestrictionsString url;

  public static final String JSON_PROPERTY_PORT = "port";
  private RestrictionsString port;

  public static final String JSON_PROPERTY_NAME = "name";
  private RestrictionsString name;

  public static final String JSON_PROPERTY_ADMIN_SERVER = "adminServer";
  private RestrictionsString adminServer;

  public static final String JSON_PROPERTY_ADMIN_PORT = "adminPort";
  private RestrictionsString adminPort;

  public static final String JSON_PROPERTY_ID = "id";
  private RestrictionsString id;

  public static final String JSON_PROPERTY_REDIRECTION = "redirection";
  private RestrictionsString redirection;

  public static final String JSON_PROPERTY_STATUS = "status";
  private RestrictionsString status;

  public OrganizationSoftwareInstancesWebEntityRestriction() {
  }

  public OrganizationSoftwareInstancesWebEntityRestriction loadbalanced(RestrictionsBoolean loadbalanced) {
    
    this.loadbalanced = loadbalanced;
    return this;
  }

   /**
   * Get loadbalanced
   * @return loadbalanced
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOADBALANCED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsBoolean getLoadbalanced() {
    return loadbalanced;
  }


  @JsonProperty(JSON_PROPERTY_LOADBALANCED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLoadbalanced(RestrictionsBoolean loadbalanced) {
    this.loadbalanced = loadbalanced;
  }


  public OrganizationSoftwareInstancesWebEntityRestriction description(RestrictionsString description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(RestrictionsString description) {
    this.description = description;
  }


  public OrganizationSoftwareInstancesWebEntityRestriction docRoot(RestrictionsString docRoot) {
    
    this.docRoot = docRoot;
    return this;
  }

   /**
   * Get docRoot
   * @return docRoot
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOC_ROOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getDocRoot() {
    return docRoot;
  }


  @JsonProperty(JSON_PROPERTY_DOC_ROOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDocRoot(RestrictionsString docRoot) {
    this.docRoot = docRoot;
  }


  public OrganizationSoftwareInstancesWebEntityRestriction sslPort(RestrictionsString sslPort) {
    
    this.sslPort = sslPort;
    return this;
  }

   /**
   * Get sslPort
   * @return sslPort
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SSL_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getSslPort() {
    return sslPort;
  }


  @JsonProperty(JSON_PROPERTY_SSL_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSslPort(RestrictionsString sslPort) {
    this.sslPort = sslPort;
  }


  public OrganizationSoftwareInstancesWebEntityRestriction elid(RestrictionsString elid) {
    
    this.elid = elid;
    return this;
  }

   /**
   * Get elid
   * @return elid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getElid() {
    return elid;
  }


  @JsonProperty(JSON_PROPERTY_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setElid(RestrictionsString elid) {
    this.elid = elid;
  }


  public OrganizationSoftwareInstancesWebEntityRestriction url(RestrictionsString url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(RestrictionsString url) {
    this.url = url;
  }


  public OrganizationSoftwareInstancesWebEntityRestriction port(RestrictionsString port) {
    
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getPort() {
    return port;
  }


  @JsonProperty(JSON_PROPERTY_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPort(RestrictionsString port) {
    this.port = port;
  }


  public OrganizationSoftwareInstancesWebEntityRestriction name(RestrictionsString name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(RestrictionsString name) {
    this.name = name;
  }


  public OrganizationSoftwareInstancesWebEntityRestriction adminServer(RestrictionsString adminServer) {
    
    this.adminServer = adminServer;
    return this;
  }

   /**
   * Get adminServer
   * @return adminServer
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADMIN_SERVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getAdminServer() {
    return adminServer;
  }


  @JsonProperty(JSON_PROPERTY_ADMIN_SERVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdminServer(RestrictionsString adminServer) {
    this.adminServer = adminServer;
  }


  public OrganizationSoftwareInstancesWebEntityRestriction adminPort(RestrictionsString adminPort) {
    
    this.adminPort = adminPort;
    return this;
  }

   /**
   * Get adminPort
   * @return adminPort
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADMIN_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getAdminPort() {
    return adminPort;
  }


  @JsonProperty(JSON_PROPERTY_ADMIN_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdminPort(RestrictionsString adminPort) {
    this.adminPort = adminPort;
  }


  public OrganizationSoftwareInstancesWebEntityRestriction id(RestrictionsString id) {
    
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

  public RestrictionsString getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(RestrictionsString id) {
    this.id = id;
  }


  public OrganizationSoftwareInstancesWebEntityRestriction redirection(RestrictionsString redirection) {
    
    this.redirection = redirection;
    return this;
  }

   /**
   * Get redirection
   * @return redirection
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REDIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getRedirection() {
    return redirection;
  }


  @JsonProperty(JSON_PROPERTY_REDIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRedirection(RestrictionsString redirection) {
    this.redirection = redirection;
  }


  public OrganizationSoftwareInstancesWebEntityRestriction status(RestrictionsString status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(RestrictionsString status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationSoftwareInstancesWebEntityRestriction organizationSoftwareInstancesWebEntityRestriction = (OrganizationSoftwareInstancesWebEntityRestriction) o;
    return Objects.equals(this.loadbalanced, organizationSoftwareInstancesWebEntityRestriction.loadbalanced) &&
        Objects.equals(this.description, organizationSoftwareInstancesWebEntityRestriction.description) &&
        Objects.equals(this.docRoot, organizationSoftwareInstancesWebEntityRestriction.docRoot) &&
        Objects.equals(this.sslPort, organizationSoftwareInstancesWebEntityRestriction.sslPort) &&
        Objects.equals(this.elid, organizationSoftwareInstancesWebEntityRestriction.elid) &&
        Objects.equals(this.url, organizationSoftwareInstancesWebEntityRestriction.url) &&
        Objects.equals(this.port, organizationSoftwareInstancesWebEntityRestriction.port) &&
        Objects.equals(this.name, organizationSoftwareInstancesWebEntityRestriction.name) &&
        Objects.equals(this.adminServer, organizationSoftwareInstancesWebEntityRestriction.adminServer) &&
        Objects.equals(this.adminPort, organizationSoftwareInstancesWebEntityRestriction.adminPort) &&
        Objects.equals(this.id, organizationSoftwareInstancesWebEntityRestriction.id) &&
        Objects.equals(this.redirection, organizationSoftwareInstancesWebEntityRestriction.redirection) &&
        Objects.equals(this.status, organizationSoftwareInstancesWebEntityRestriction.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadbalanced, description, docRoot, sslPort, elid, url, port, name, adminServer, adminPort, id, redirection, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationSoftwareInstancesWebEntityRestriction {\n");
    sb.append("    loadbalanced: ").append(toIndentedString(loadbalanced)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    docRoot: ").append(toIndentedString(docRoot)).append("\n");
    sb.append("    sslPort: ").append(toIndentedString(sslPort)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    adminServer: ").append(toIndentedString(adminServer)).append("\n");
    sb.append("    adminPort: ").append(toIndentedString(adminPort)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    redirection: ").append(toIndentedString(redirection)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
