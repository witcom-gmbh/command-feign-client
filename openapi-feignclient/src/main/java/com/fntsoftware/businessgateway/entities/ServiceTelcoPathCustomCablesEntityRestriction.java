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
import com.fntsoftware.businessgateway.entities.RestrictionsDate;
import com.fntsoftware.businessgateway.entities.RestrictionsNumeric;
import com.fntsoftware.businessgateway.entities.RestrictionsString;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ServiceTelcoPathCustomCablesEntityRestriction
 */
@JsonPropertyOrder({
  ServiceTelcoPathCustomCablesEntityRestriction.JSON_PROPERTY_TCO_SERVICE_TYPE,
  ServiceTelcoPathCustomCablesEntityRestriction.JSON_PROPERTY_C_TCO_DATE_ORDERED,
  ServiceTelcoPathCustomCablesEntityRestriction.JSON_PROPERTY_C_TCO_REFERENCE_T2,
  ServiceTelcoPathCustomCablesEntityRestriction.JSON_PROPERTY_C_TCO_REFERENCE_V4,
  ServiceTelcoPathCustomCablesEntityRestriction.JSON_PROPERTY_LENGTH,
  ServiceTelcoPathCustomCablesEntityRestriction.JSON_PROPERTY_C_TCO_REFERENCE_T3,
  ServiceTelcoPathCustomCablesEntityRestriction.JSON_PROPERTY_C_TCO_REFERENCE_V5,
  ServiceTelcoPathCustomCablesEntityRestriction.JSON_PROPERTY_C_TCO_REFERENCE_T4,
  ServiceTelcoPathCustomCablesEntityRestriction.JSON_PROPERTY_REMARK,
  ServiceTelcoPathCustomCablesEntityRestriction.JSON_PROPERTY_C_TCO_REFERENCE_T5,
  ServiceTelcoPathCustomCablesEntityRestriction.JSON_PROPERTY_TCO_UNIBI,
  ServiceTelcoPathCustomCablesEntityRestriction.JSON_PROPERTY_TCO_LINENAME,
  ServiceTelcoPathCustomCablesEntityRestriction.JSON_PROPERTY_C_TCO_REFERENCE_V1,
  ServiceTelcoPathCustomCablesEntityRestriction.JSON_PROPERTY_ELID,
  ServiceTelcoPathCustomCablesEntityRestriction.JSON_PROPERTY_C_TCO_REFERENCE_V2,
  ServiceTelcoPathCustomCablesEntityRestriction.JSON_PROPERTY_C_TCO_REFERENCE_T1,
  ServiceTelcoPathCustomCablesEntityRestriction.JSON_PROPERTY_C_TCO_REFERENCE_V3,
  ServiceTelcoPathCustomCablesEntityRestriction.JSON_PROPERTY_C_TCO_STATUS_DATE,
  ServiceTelcoPathCustomCablesEntityRestriction.JSON_PROPERTY_TCO_STATUS,
  ServiceTelcoPathCustomCablesEntityRestriction.JSON_PROPERTY_C_TCO_DATE_CANCELLATION,
  ServiceTelcoPathCustomCablesEntityRestriction.JSON_PROPERTY_C_TCO_DATE_DELIVERY,
  ServiceTelcoPathCustomCablesEntityRestriction.JSON_PROPERTY_C_TCO_DATE_DELIVERYPLN,
  ServiceTelcoPathCustomCablesEntityRestriction.JSON_PROPERTY_TCO_LINETYPE,
  ServiceTelcoPathCustomCablesEntityRestriction.JSON_PROPERTY_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class ServiceTelcoPathCustomCablesEntityRestriction {
  public static final String JSON_PROPERTY_TCO_SERVICE_TYPE = "tcoServiceType";
  private RestrictionsString tcoServiceType;

  public static final String JSON_PROPERTY_C_TCO_DATE_ORDERED = "cTcoDateOrdered";
  private RestrictionsDate cTcoDateOrdered;

  public static final String JSON_PROPERTY_C_TCO_REFERENCE_T2 = "cTcoReferenceT2";
  private RestrictionsString cTcoReferenceT2;

  public static final String JSON_PROPERTY_C_TCO_REFERENCE_V4 = "cTcoReferenceV4";
  private RestrictionsString cTcoReferenceV4;

  public static final String JSON_PROPERTY_LENGTH = "length";
  private RestrictionsNumeric length;

  public static final String JSON_PROPERTY_C_TCO_REFERENCE_T3 = "cTcoReferenceT3";
  private RestrictionsString cTcoReferenceT3;

  public static final String JSON_PROPERTY_C_TCO_REFERENCE_V5 = "cTcoReferenceV5";
  private RestrictionsString cTcoReferenceV5;

  public static final String JSON_PROPERTY_C_TCO_REFERENCE_T4 = "cTcoReferenceT4";
  private RestrictionsString cTcoReferenceT4;

  public static final String JSON_PROPERTY_REMARK = "remark";
  private RestrictionsString remark;

  public static final String JSON_PROPERTY_C_TCO_REFERENCE_T5 = "cTcoReferenceT5";
  private RestrictionsString cTcoReferenceT5;

  public static final String JSON_PROPERTY_TCO_UNIBI = "tcoUnibi";
  private RestrictionsString tcoUnibi;

  public static final String JSON_PROPERTY_TCO_LINENAME = "tcoLinename";
  private RestrictionsString tcoLinename;

  public static final String JSON_PROPERTY_C_TCO_REFERENCE_V1 = "cTcoReferenceV1";
  private RestrictionsString cTcoReferenceV1;

  public static final String JSON_PROPERTY_ELID = "elid";
  private RestrictionsString elid;

  public static final String JSON_PROPERTY_C_TCO_REFERENCE_V2 = "cTcoReferenceV2";
  private RestrictionsString cTcoReferenceV2;

  public static final String JSON_PROPERTY_C_TCO_REFERENCE_T1 = "cTcoReferenceT1";
  private RestrictionsString cTcoReferenceT1;

  public static final String JSON_PROPERTY_C_TCO_REFERENCE_V3 = "cTcoReferenceV3";
  private RestrictionsString cTcoReferenceV3;

  public static final String JSON_PROPERTY_C_TCO_STATUS_DATE = "cTcoStatusDate";
  private RestrictionsDate cTcoStatusDate;

  public static final String JSON_PROPERTY_TCO_STATUS = "tcoStatus";
  private RestrictionsString tcoStatus;

  public static final String JSON_PROPERTY_C_TCO_DATE_CANCELLATION = "cTcoDateCancellation";
  private RestrictionsDate cTcoDateCancellation;

  public static final String JSON_PROPERTY_C_TCO_DATE_DELIVERY = "cTcoDateDelivery";
  private RestrictionsDate cTcoDateDelivery;

  public static final String JSON_PROPERTY_C_TCO_DATE_DELIVERYPLN = "cTcoDateDeliverypln";
  private RestrictionsDate cTcoDateDeliverypln;

  public static final String JSON_PROPERTY_TCO_LINETYPE = "tcoLinetype";
  private RestrictionsString tcoLinetype;

  public static final String JSON_PROPERTY_ID = "id";
  private RestrictionsString id;

  public ServiceTelcoPathCustomCablesEntityRestriction() {
  }

  public ServiceTelcoPathCustomCablesEntityRestriction tcoServiceType(RestrictionsString tcoServiceType) {
    
    this.tcoServiceType = tcoServiceType;
    return this;
  }

   /**
   * Get tcoServiceType
   * @return tcoServiceType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TCO_SERVICE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getTcoServiceType() {
    return tcoServiceType;
  }


  @JsonProperty(JSON_PROPERTY_TCO_SERVICE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTcoServiceType(RestrictionsString tcoServiceType) {
    this.tcoServiceType = tcoServiceType;
  }


  public ServiceTelcoPathCustomCablesEntityRestriction cTcoDateOrdered(RestrictionsDate cTcoDateOrdered) {
    
    this.cTcoDateOrdered = cTcoDateOrdered;
    return this;
  }

   /**
   * Get cTcoDateOrdered
   * @return cTcoDateOrdered
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_TCO_DATE_ORDERED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsDate getcTcoDateOrdered() {
    return cTcoDateOrdered;
  }


  @JsonProperty(JSON_PROPERTY_C_TCO_DATE_ORDERED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcTcoDateOrdered(RestrictionsDate cTcoDateOrdered) {
    this.cTcoDateOrdered = cTcoDateOrdered;
  }


  public ServiceTelcoPathCustomCablesEntityRestriction cTcoReferenceT2(RestrictionsString cTcoReferenceT2) {
    
    this.cTcoReferenceT2 = cTcoReferenceT2;
    return this;
  }

   /**
   * Get cTcoReferenceT2
   * @return cTcoReferenceT2
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_TCO_REFERENCE_T2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getcTcoReferenceT2() {
    return cTcoReferenceT2;
  }


  @JsonProperty(JSON_PROPERTY_C_TCO_REFERENCE_T2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcTcoReferenceT2(RestrictionsString cTcoReferenceT2) {
    this.cTcoReferenceT2 = cTcoReferenceT2;
  }


  public ServiceTelcoPathCustomCablesEntityRestriction cTcoReferenceV4(RestrictionsString cTcoReferenceV4) {
    
    this.cTcoReferenceV4 = cTcoReferenceV4;
    return this;
  }

   /**
   * Get cTcoReferenceV4
   * @return cTcoReferenceV4
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_TCO_REFERENCE_V4)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getcTcoReferenceV4() {
    return cTcoReferenceV4;
  }


  @JsonProperty(JSON_PROPERTY_C_TCO_REFERENCE_V4)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcTcoReferenceV4(RestrictionsString cTcoReferenceV4) {
    this.cTcoReferenceV4 = cTcoReferenceV4;
  }


  public ServiceTelcoPathCustomCablesEntityRestriction length(RestrictionsNumeric length) {
    
    this.length = length;
    return this;
  }

   /**
   * Get length
   * @return length
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsNumeric getLength() {
    return length;
  }


  @JsonProperty(JSON_PROPERTY_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLength(RestrictionsNumeric length) {
    this.length = length;
  }


  public ServiceTelcoPathCustomCablesEntityRestriction cTcoReferenceT3(RestrictionsString cTcoReferenceT3) {
    
    this.cTcoReferenceT3 = cTcoReferenceT3;
    return this;
  }

   /**
   * Get cTcoReferenceT3
   * @return cTcoReferenceT3
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_TCO_REFERENCE_T3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getcTcoReferenceT3() {
    return cTcoReferenceT3;
  }


  @JsonProperty(JSON_PROPERTY_C_TCO_REFERENCE_T3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcTcoReferenceT3(RestrictionsString cTcoReferenceT3) {
    this.cTcoReferenceT3 = cTcoReferenceT3;
  }


  public ServiceTelcoPathCustomCablesEntityRestriction cTcoReferenceV5(RestrictionsString cTcoReferenceV5) {
    
    this.cTcoReferenceV5 = cTcoReferenceV5;
    return this;
  }

   /**
   * Get cTcoReferenceV5
   * @return cTcoReferenceV5
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_TCO_REFERENCE_V5)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getcTcoReferenceV5() {
    return cTcoReferenceV5;
  }


  @JsonProperty(JSON_PROPERTY_C_TCO_REFERENCE_V5)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcTcoReferenceV5(RestrictionsString cTcoReferenceV5) {
    this.cTcoReferenceV5 = cTcoReferenceV5;
  }


  public ServiceTelcoPathCustomCablesEntityRestriction cTcoReferenceT4(RestrictionsString cTcoReferenceT4) {
    
    this.cTcoReferenceT4 = cTcoReferenceT4;
    return this;
  }

   /**
   * Get cTcoReferenceT4
   * @return cTcoReferenceT4
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_TCO_REFERENCE_T4)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getcTcoReferenceT4() {
    return cTcoReferenceT4;
  }


  @JsonProperty(JSON_PROPERTY_C_TCO_REFERENCE_T4)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcTcoReferenceT4(RestrictionsString cTcoReferenceT4) {
    this.cTcoReferenceT4 = cTcoReferenceT4;
  }


  public ServiceTelcoPathCustomCablesEntityRestriction remark(RestrictionsString remark) {
    
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


  public ServiceTelcoPathCustomCablesEntityRestriction cTcoReferenceT5(RestrictionsString cTcoReferenceT5) {
    
    this.cTcoReferenceT5 = cTcoReferenceT5;
    return this;
  }

   /**
   * Get cTcoReferenceT5
   * @return cTcoReferenceT5
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_TCO_REFERENCE_T5)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getcTcoReferenceT5() {
    return cTcoReferenceT5;
  }


  @JsonProperty(JSON_PROPERTY_C_TCO_REFERENCE_T5)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcTcoReferenceT5(RestrictionsString cTcoReferenceT5) {
    this.cTcoReferenceT5 = cTcoReferenceT5;
  }


  public ServiceTelcoPathCustomCablesEntityRestriction tcoUnibi(RestrictionsString tcoUnibi) {
    
    this.tcoUnibi = tcoUnibi;
    return this;
  }

   /**
   * Get tcoUnibi
   * @return tcoUnibi
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TCO_UNIBI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getTcoUnibi() {
    return tcoUnibi;
  }


  @JsonProperty(JSON_PROPERTY_TCO_UNIBI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTcoUnibi(RestrictionsString tcoUnibi) {
    this.tcoUnibi = tcoUnibi;
  }


  public ServiceTelcoPathCustomCablesEntityRestriction tcoLinename(RestrictionsString tcoLinename) {
    
    this.tcoLinename = tcoLinename;
    return this;
  }

   /**
   * Get tcoLinename
   * @return tcoLinename
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TCO_LINENAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getTcoLinename() {
    return tcoLinename;
  }


  @JsonProperty(JSON_PROPERTY_TCO_LINENAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTcoLinename(RestrictionsString tcoLinename) {
    this.tcoLinename = tcoLinename;
  }


  public ServiceTelcoPathCustomCablesEntityRestriction cTcoReferenceV1(RestrictionsString cTcoReferenceV1) {
    
    this.cTcoReferenceV1 = cTcoReferenceV1;
    return this;
  }

   /**
   * Get cTcoReferenceV1
   * @return cTcoReferenceV1
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_TCO_REFERENCE_V1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getcTcoReferenceV1() {
    return cTcoReferenceV1;
  }


  @JsonProperty(JSON_PROPERTY_C_TCO_REFERENCE_V1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcTcoReferenceV1(RestrictionsString cTcoReferenceV1) {
    this.cTcoReferenceV1 = cTcoReferenceV1;
  }


  public ServiceTelcoPathCustomCablesEntityRestriction elid(RestrictionsString elid) {
    
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


  public ServiceTelcoPathCustomCablesEntityRestriction cTcoReferenceV2(RestrictionsString cTcoReferenceV2) {
    
    this.cTcoReferenceV2 = cTcoReferenceV2;
    return this;
  }

   /**
   * Get cTcoReferenceV2
   * @return cTcoReferenceV2
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_TCO_REFERENCE_V2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getcTcoReferenceV2() {
    return cTcoReferenceV2;
  }


  @JsonProperty(JSON_PROPERTY_C_TCO_REFERENCE_V2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcTcoReferenceV2(RestrictionsString cTcoReferenceV2) {
    this.cTcoReferenceV2 = cTcoReferenceV2;
  }


  public ServiceTelcoPathCustomCablesEntityRestriction cTcoReferenceT1(RestrictionsString cTcoReferenceT1) {
    
    this.cTcoReferenceT1 = cTcoReferenceT1;
    return this;
  }

   /**
   * Get cTcoReferenceT1
   * @return cTcoReferenceT1
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_TCO_REFERENCE_T1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getcTcoReferenceT1() {
    return cTcoReferenceT1;
  }


  @JsonProperty(JSON_PROPERTY_C_TCO_REFERENCE_T1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcTcoReferenceT1(RestrictionsString cTcoReferenceT1) {
    this.cTcoReferenceT1 = cTcoReferenceT1;
  }


  public ServiceTelcoPathCustomCablesEntityRestriction cTcoReferenceV3(RestrictionsString cTcoReferenceV3) {
    
    this.cTcoReferenceV3 = cTcoReferenceV3;
    return this;
  }

   /**
   * Get cTcoReferenceV3
   * @return cTcoReferenceV3
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_TCO_REFERENCE_V3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getcTcoReferenceV3() {
    return cTcoReferenceV3;
  }


  @JsonProperty(JSON_PROPERTY_C_TCO_REFERENCE_V3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcTcoReferenceV3(RestrictionsString cTcoReferenceV3) {
    this.cTcoReferenceV3 = cTcoReferenceV3;
  }


  public ServiceTelcoPathCustomCablesEntityRestriction cTcoStatusDate(RestrictionsDate cTcoStatusDate) {
    
    this.cTcoStatusDate = cTcoStatusDate;
    return this;
  }

   /**
   * Get cTcoStatusDate
   * @return cTcoStatusDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_TCO_STATUS_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsDate getcTcoStatusDate() {
    return cTcoStatusDate;
  }


  @JsonProperty(JSON_PROPERTY_C_TCO_STATUS_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcTcoStatusDate(RestrictionsDate cTcoStatusDate) {
    this.cTcoStatusDate = cTcoStatusDate;
  }


  public ServiceTelcoPathCustomCablesEntityRestriction tcoStatus(RestrictionsString tcoStatus) {
    
    this.tcoStatus = tcoStatus;
    return this;
  }

   /**
   * Get tcoStatus
   * @return tcoStatus
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TCO_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getTcoStatus() {
    return tcoStatus;
  }


  @JsonProperty(JSON_PROPERTY_TCO_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTcoStatus(RestrictionsString tcoStatus) {
    this.tcoStatus = tcoStatus;
  }


  public ServiceTelcoPathCustomCablesEntityRestriction cTcoDateCancellation(RestrictionsDate cTcoDateCancellation) {
    
    this.cTcoDateCancellation = cTcoDateCancellation;
    return this;
  }

   /**
   * Get cTcoDateCancellation
   * @return cTcoDateCancellation
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_TCO_DATE_CANCELLATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsDate getcTcoDateCancellation() {
    return cTcoDateCancellation;
  }


  @JsonProperty(JSON_PROPERTY_C_TCO_DATE_CANCELLATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcTcoDateCancellation(RestrictionsDate cTcoDateCancellation) {
    this.cTcoDateCancellation = cTcoDateCancellation;
  }


  public ServiceTelcoPathCustomCablesEntityRestriction cTcoDateDelivery(RestrictionsDate cTcoDateDelivery) {
    
    this.cTcoDateDelivery = cTcoDateDelivery;
    return this;
  }

   /**
   * Get cTcoDateDelivery
   * @return cTcoDateDelivery
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_TCO_DATE_DELIVERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsDate getcTcoDateDelivery() {
    return cTcoDateDelivery;
  }


  @JsonProperty(JSON_PROPERTY_C_TCO_DATE_DELIVERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcTcoDateDelivery(RestrictionsDate cTcoDateDelivery) {
    this.cTcoDateDelivery = cTcoDateDelivery;
  }


  public ServiceTelcoPathCustomCablesEntityRestriction cTcoDateDeliverypln(RestrictionsDate cTcoDateDeliverypln) {
    
    this.cTcoDateDeliverypln = cTcoDateDeliverypln;
    return this;
  }

   /**
   * Get cTcoDateDeliverypln
   * @return cTcoDateDeliverypln
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_TCO_DATE_DELIVERYPLN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsDate getcTcoDateDeliverypln() {
    return cTcoDateDeliverypln;
  }


  @JsonProperty(JSON_PROPERTY_C_TCO_DATE_DELIVERYPLN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcTcoDateDeliverypln(RestrictionsDate cTcoDateDeliverypln) {
    this.cTcoDateDeliverypln = cTcoDateDeliverypln;
  }


  public ServiceTelcoPathCustomCablesEntityRestriction tcoLinetype(RestrictionsString tcoLinetype) {
    
    this.tcoLinetype = tcoLinetype;
    return this;
  }

   /**
   * Get tcoLinetype
   * @return tcoLinetype
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TCO_LINETYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getTcoLinetype() {
    return tcoLinetype;
  }


  @JsonProperty(JSON_PROPERTY_TCO_LINETYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTcoLinetype(RestrictionsString tcoLinetype) {
    this.tcoLinetype = tcoLinetype;
  }


  public ServiceTelcoPathCustomCablesEntityRestriction id(RestrictionsString id) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceTelcoPathCustomCablesEntityRestriction serviceTelcoPathCustomCablesEntityRestriction = (ServiceTelcoPathCustomCablesEntityRestriction) o;
    return Objects.equals(this.tcoServiceType, serviceTelcoPathCustomCablesEntityRestriction.tcoServiceType) &&
        Objects.equals(this.cTcoDateOrdered, serviceTelcoPathCustomCablesEntityRestriction.cTcoDateOrdered) &&
        Objects.equals(this.cTcoReferenceT2, serviceTelcoPathCustomCablesEntityRestriction.cTcoReferenceT2) &&
        Objects.equals(this.cTcoReferenceV4, serviceTelcoPathCustomCablesEntityRestriction.cTcoReferenceV4) &&
        Objects.equals(this.length, serviceTelcoPathCustomCablesEntityRestriction.length) &&
        Objects.equals(this.cTcoReferenceT3, serviceTelcoPathCustomCablesEntityRestriction.cTcoReferenceT3) &&
        Objects.equals(this.cTcoReferenceV5, serviceTelcoPathCustomCablesEntityRestriction.cTcoReferenceV5) &&
        Objects.equals(this.cTcoReferenceT4, serviceTelcoPathCustomCablesEntityRestriction.cTcoReferenceT4) &&
        Objects.equals(this.remark, serviceTelcoPathCustomCablesEntityRestriction.remark) &&
        Objects.equals(this.cTcoReferenceT5, serviceTelcoPathCustomCablesEntityRestriction.cTcoReferenceT5) &&
        Objects.equals(this.tcoUnibi, serviceTelcoPathCustomCablesEntityRestriction.tcoUnibi) &&
        Objects.equals(this.tcoLinename, serviceTelcoPathCustomCablesEntityRestriction.tcoLinename) &&
        Objects.equals(this.cTcoReferenceV1, serviceTelcoPathCustomCablesEntityRestriction.cTcoReferenceV1) &&
        Objects.equals(this.elid, serviceTelcoPathCustomCablesEntityRestriction.elid) &&
        Objects.equals(this.cTcoReferenceV2, serviceTelcoPathCustomCablesEntityRestriction.cTcoReferenceV2) &&
        Objects.equals(this.cTcoReferenceT1, serviceTelcoPathCustomCablesEntityRestriction.cTcoReferenceT1) &&
        Objects.equals(this.cTcoReferenceV3, serviceTelcoPathCustomCablesEntityRestriction.cTcoReferenceV3) &&
        Objects.equals(this.cTcoStatusDate, serviceTelcoPathCustomCablesEntityRestriction.cTcoStatusDate) &&
        Objects.equals(this.tcoStatus, serviceTelcoPathCustomCablesEntityRestriction.tcoStatus) &&
        Objects.equals(this.cTcoDateCancellation, serviceTelcoPathCustomCablesEntityRestriction.cTcoDateCancellation) &&
        Objects.equals(this.cTcoDateDelivery, serviceTelcoPathCustomCablesEntityRestriction.cTcoDateDelivery) &&
        Objects.equals(this.cTcoDateDeliverypln, serviceTelcoPathCustomCablesEntityRestriction.cTcoDateDeliverypln) &&
        Objects.equals(this.tcoLinetype, serviceTelcoPathCustomCablesEntityRestriction.tcoLinetype) &&
        Objects.equals(this.id, serviceTelcoPathCustomCablesEntityRestriction.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tcoServiceType, cTcoDateOrdered, cTcoReferenceT2, cTcoReferenceV4, length, cTcoReferenceT3, cTcoReferenceV5, cTcoReferenceT4, remark, cTcoReferenceT5, tcoUnibi, tcoLinename, cTcoReferenceV1, elid, cTcoReferenceV2, cTcoReferenceT1, cTcoReferenceV3, cTcoStatusDate, tcoStatus, cTcoDateCancellation, cTcoDateDelivery, cTcoDateDeliverypln, tcoLinetype, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceTelcoPathCustomCablesEntityRestriction {\n");
    sb.append("    tcoServiceType: ").append(toIndentedString(tcoServiceType)).append("\n");
    sb.append("    cTcoDateOrdered: ").append(toIndentedString(cTcoDateOrdered)).append("\n");
    sb.append("    cTcoReferenceT2: ").append(toIndentedString(cTcoReferenceT2)).append("\n");
    sb.append("    cTcoReferenceV4: ").append(toIndentedString(cTcoReferenceV4)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    cTcoReferenceT3: ").append(toIndentedString(cTcoReferenceT3)).append("\n");
    sb.append("    cTcoReferenceV5: ").append(toIndentedString(cTcoReferenceV5)).append("\n");
    sb.append("    cTcoReferenceT4: ").append(toIndentedString(cTcoReferenceT4)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    cTcoReferenceT5: ").append(toIndentedString(cTcoReferenceT5)).append("\n");
    sb.append("    tcoUnibi: ").append(toIndentedString(tcoUnibi)).append("\n");
    sb.append("    tcoLinename: ").append(toIndentedString(tcoLinename)).append("\n");
    sb.append("    cTcoReferenceV1: ").append(toIndentedString(cTcoReferenceV1)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    cTcoReferenceV2: ").append(toIndentedString(cTcoReferenceV2)).append("\n");
    sb.append("    cTcoReferenceT1: ").append(toIndentedString(cTcoReferenceT1)).append("\n");
    sb.append("    cTcoReferenceV3: ").append(toIndentedString(cTcoReferenceV3)).append("\n");
    sb.append("    cTcoStatusDate: ").append(toIndentedString(cTcoStatusDate)).append("\n");
    sb.append("    tcoStatus: ").append(toIndentedString(tcoStatus)).append("\n");
    sb.append("    cTcoDateCancellation: ").append(toIndentedString(cTcoDateCancellation)).append("\n");
    sb.append("    cTcoDateDelivery: ").append(toIndentedString(cTcoDateDelivery)).append("\n");
    sb.append("    cTcoDateDeliverypln: ").append(toIndentedString(cTcoDateDeliverypln)).append("\n");
    sb.append("    tcoLinetype: ").append(toIndentedString(tcoLinetype)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
