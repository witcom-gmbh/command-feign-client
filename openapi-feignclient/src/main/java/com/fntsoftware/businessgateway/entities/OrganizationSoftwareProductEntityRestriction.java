/*
 * Swagger for Command BGE
 * Swagger API for FNT Command Business Gateway
 *
 * The version of the OpenAPI document: 20240304133000
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
import com.fntsoftware.businessgateway.entities.RestrictionsString;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * OrganizationSoftwareProductEntityRestriction
 */
@JsonPropertyOrder({
  OrganizationSoftwareProductEntityRestriction.JSON_PROPERTY_SOFTWARE,
  OrganizationSoftwareProductEntityRestriction.JSON_PROPERTY_SUPPLIER,
  OrganizationSoftwareProductEntityRestriction.JSON_PROPERTY_DESCRIPTION,
  OrganizationSoftwareProductEntityRestriction.JSON_PROPERTY_LANGUAGE,
  OrganizationSoftwareProductEntityRestriction.JSON_PROPERTY_REMARK,
  OrganizationSoftwareProductEntityRestriction.JSON_PROPERTY_ID,
  OrganizationSoftwareProductEntityRestriction.JSON_PROPERTY_CATEGORY,
  OrganizationSoftwareProductEntityRestriction.JSON_PROPERTY_ELID,
  OrganizationSoftwareProductEntityRestriction.JSON_PROPERTY_OPERATING_SYSTEM,
  OrganizationSoftwareProductEntityRestriction.JSON_PROPERTY_VERSION,
  OrganizationSoftwareProductEntityRestriction.JSON_PROPERTY_MANUFACTURER
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class OrganizationSoftwareProductEntityRestriction {
  public static final String JSON_PROPERTY_SOFTWARE = "software";
  private RestrictionsString software;

  public static final String JSON_PROPERTY_SUPPLIER = "supplier";
  private RestrictionsString supplier;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private RestrictionsString description;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private RestrictionsString language;

  public static final String JSON_PROPERTY_REMARK = "remark";
  private RestrictionsString remark;

  public static final String JSON_PROPERTY_ID = "id";
  private RestrictionsString id;

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private RestrictionsString category;

  public static final String JSON_PROPERTY_ELID = "elid";
  private RestrictionsString elid;

  public static final String JSON_PROPERTY_OPERATING_SYSTEM = "operatingSystem";
  private RestrictionsString operatingSystem;

  public static final String JSON_PROPERTY_VERSION = "version";
  private RestrictionsString version;

  public static final String JSON_PROPERTY_MANUFACTURER = "manufacturer";
  private RestrictionsString manufacturer;

  public OrganizationSoftwareProductEntityRestriction() {
  }

  public OrganizationSoftwareProductEntityRestriction software(RestrictionsString software) {
    
    this.software = software;
    return this;
  }

   /**
   * Get software
   * @return software
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOFTWARE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getSoftware() {
    return software;
  }


  @JsonProperty(JSON_PROPERTY_SOFTWARE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSoftware(RestrictionsString software) {
    this.software = software;
  }


  public OrganizationSoftwareProductEntityRestriction supplier(RestrictionsString supplier) {
    
    this.supplier = supplier;
    return this;
  }

   /**
   * Get supplier
   * @return supplier
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUPPLIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getSupplier() {
    return supplier;
  }


  @JsonProperty(JSON_PROPERTY_SUPPLIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSupplier(RestrictionsString supplier) {
    this.supplier = supplier;
  }


  public OrganizationSoftwareProductEntityRestriction description(RestrictionsString description) {
    
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


  public OrganizationSoftwareProductEntityRestriction language(RestrictionsString language) {
    
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getLanguage() {
    return language;
  }


  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLanguage(RestrictionsString language) {
    this.language = language;
  }


  public OrganizationSoftwareProductEntityRestriction remark(RestrictionsString remark) {
    
    this.remark = remark;
    return this;
  }

   /**
   * Get remark
   * @return remark
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getRemark() {
    return remark;
  }


  @JsonProperty(JSON_PROPERTY_REMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemark(RestrictionsString remark) {
    this.remark = remark;
  }


  public OrganizationSoftwareProductEntityRestriction id(RestrictionsString id) {
    
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


  public OrganizationSoftwareProductEntityRestriction category(RestrictionsString category) {
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getCategory() {
    return category;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategory(RestrictionsString category) {
    this.category = category;
  }


  public OrganizationSoftwareProductEntityRestriction elid(RestrictionsString elid) {
    
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


  public OrganizationSoftwareProductEntityRestriction operatingSystem(RestrictionsString operatingSystem) {
    
    this.operatingSystem = operatingSystem;
    return this;
  }

   /**
   * Get operatingSystem
   * @return operatingSystem
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPERATING_SYSTEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getOperatingSystem() {
    return operatingSystem;
  }


  @JsonProperty(JSON_PROPERTY_OPERATING_SYSTEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperatingSystem(RestrictionsString operatingSystem) {
    this.operatingSystem = operatingSystem;
  }


  public OrganizationSoftwareProductEntityRestriction version(RestrictionsString version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(RestrictionsString version) {
    this.version = version;
  }


  public OrganizationSoftwareProductEntityRestriction manufacturer(RestrictionsString manufacturer) {
    
    this.manufacturer = manufacturer;
    return this;
  }

   /**
   * Get manufacturer
   * @return manufacturer
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MANUFACTURER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getManufacturer() {
    return manufacturer;
  }


  @JsonProperty(JSON_PROPERTY_MANUFACTURER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setManufacturer(RestrictionsString manufacturer) {
    this.manufacturer = manufacturer;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationSoftwareProductEntityRestriction organizationSoftwareProductEntityRestriction = (OrganizationSoftwareProductEntityRestriction) o;
    return Objects.equals(this.software, organizationSoftwareProductEntityRestriction.software) &&
        Objects.equals(this.supplier, organizationSoftwareProductEntityRestriction.supplier) &&
        Objects.equals(this.description, organizationSoftwareProductEntityRestriction.description) &&
        Objects.equals(this.language, organizationSoftwareProductEntityRestriction.language) &&
        Objects.equals(this.remark, organizationSoftwareProductEntityRestriction.remark) &&
        Objects.equals(this.id, organizationSoftwareProductEntityRestriction.id) &&
        Objects.equals(this.category, organizationSoftwareProductEntityRestriction.category) &&
        Objects.equals(this.elid, organizationSoftwareProductEntityRestriction.elid) &&
        Objects.equals(this.operatingSystem, organizationSoftwareProductEntityRestriction.operatingSystem) &&
        Objects.equals(this.version, organizationSoftwareProductEntityRestriction.version) &&
        Objects.equals(this.manufacturer, organizationSoftwareProductEntityRestriction.manufacturer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(software, supplier, description, language, remark, id, category, elid, operatingSystem, version, manufacturer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationSoftwareProductEntityRestriction {\n");
    sb.append("    software: ").append(toIndentedString(software)).append("\n");
    sb.append("    supplier: ").append(toIndentedString(supplier)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    operatingSystem: ").append(toIndentedString(operatingSystem)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
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

