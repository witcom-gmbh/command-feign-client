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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * EasySearchClassesResponseData
 */
@JsonPropertyOrder({
  EasySearchClassesResponseData.JSON_PROPERTY_CLASSES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class EasySearchClassesResponseData {
  public static final String JSON_PROPERTY_CLASSES = "classes";
  private List<String> classes;

  public EasySearchClassesResponseData() {
  }

  public EasySearchClassesResponseData classes(List<String> classes) {
    
    this.classes = classes;
    return this;
  }

  public EasySearchClassesResponseData addClassesItem(String classesItem) {
    if (this.classes == null) {
      this.classes = new ArrayList<>();
    }
    this.classes.add(classesItem);
    return this;
  }

   /**
   * Get classes
   * @return classes
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLASSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getClasses() {
    return classes;
  }


  @JsonProperty(JSON_PROPERTY_CLASSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClasses(List<String> classes) {
    this.classes = classes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EasySearchClassesResponseData easySearchClassesResponseData = (EasySearchClassesResponseData) o;
    return Objects.equals(this.classes, easySearchClassesResponseData.classes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EasySearchClassesResponseData {\n");
    sb.append("    classes: ").append(toIndentedString(classes)).append("\n");
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
