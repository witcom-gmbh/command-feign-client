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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * HealthCheckGetFileListResponseData
 */
@JsonPropertyOrder({
  HealthCheckGetFileListResponseData.JSON_PROPERTY_FILE_NAME,
  HealthCheckGetFileListResponseData.JSON_PROPERTY_MD5_HASH,
  HealthCheckGetFileListResponseData.JSON_PROPERTY_CRC32_CHECKSUM
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class HealthCheckGetFileListResponseData {
  public static final String JSON_PROPERTY_FILE_NAME = "fileName";
  private String fileName;

  public static final String JSON_PROPERTY_MD5_HASH = "md5Hash";
  private String md5Hash;

  public static final String JSON_PROPERTY_CRC32_CHECKSUM = "crc32Checksum";
  private String crc32Checksum;

  public HealthCheckGetFileListResponseData() {
  }

  public HealthCheckGetFileListResponseData fileName(String fileName) {
    
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFileName() {
    return fileName;
  }


  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public HealthCheckGetFileListResponseData md5Hash(String md5Hash) {
    
    this.md5Hash = md5Hash;
    return this;
  }

   /**
   * Get md5Hash
   * @return md5Hash
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MD5_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMd5Hash() {
    return md5Hash;
  }


  @JsonProperty(JSON_PROPERTY_MD5_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMd5Hash(String md5Hash) {
    this.md5Hash = md5Hash;
  }


  public HealthCheckGetFileListResponseData crc32Checksum(String crc32Checksum) {
    
    this.crc32Checksum = crc32Checksum;
    return this;
  }

   /**
   * Get crc32Checksum
   * @return crc32Checksum
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CRC32_CHECKSUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCrc32Checksum() {
    return crc32Checksum;
  }


  @JsonProperty(JSON_PROPERTY_CRC32_CHECKSUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCrc32Checksum(String crc32Checksum) {
    this.crc32Checksum = crc32Checksum;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthCheckGetFileListResponseData healthCheckGetFileListResponseData = (HealthCheckGetFileListResponseData) o;
    return Objects.equals(this.fileName, healthCheckGetFileListResponseData.fileName) &&
        Objects.equals(this.md5Hash, healthCheckGetFileListResponseData.md5Hash) &&
        Objects.equals(this.crc32Checksum, healthCheckGetFileListResponseData.crc32Checksum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, md5Hash, crc32Checksum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthCheckGetFileListResponseData {\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    md5Hash: ").append(toIndentedString(md5Hash)).append("\n");
    sb.append("    crc32Checksum: ").append(toIndentedString(crc32Checksum)).append("\n");
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
