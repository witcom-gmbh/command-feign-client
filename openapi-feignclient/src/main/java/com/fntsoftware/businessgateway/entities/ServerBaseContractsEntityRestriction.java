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
import com.fntsoftware.businessgateway.entities.RestrictionsDate;
import com.fntsoftware.businessgateway.entities.RestrictionsNumeric;
import com.fntsoftware.businessgateway.entities.RestrictionsString;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ServerBaseContractsEntityRestriction
 */
@JsonPropertyOrder({
  ServerBaseContractsEntityRestriction.JSON_PROPERTY_END_DATE,
  ServerBaseContractsEntityRestriction.JSON_PROPERTY_DESCRIPTION,
  ServerBaseContractsEntityRestriction.JSON_PROPERTY_C_DISMISSAL_DATE,
  ServerBaseContractsEntityRestriction.JSON_PROPERTY_C_AUTOMATIC_RENEWAL,
  ServerBaseContractsEntityRestriction.JSON_PROPERTY_C_DISMISSAL_RECEIVED_DATE,
  ServerBaseContractsEntityRestriction.JSON_PROPERTY_C_REFTYPE1,
  ServerBaseContractsEntityRestriction.JSON_PROPERTY_DISMISSAL_PROTECTION,
  ServerBaseContractsEntityRestriction.JSON_PROPERTY_ACCOUNT_NO,
  ServerBaseContractsEntityRestriction.JSON_PROPERTY_YEARLY_COSTS,
  ServerBaseContractsEntityRestriction.JSON_PROPERTY_C_REFVALUE1,
  ServerBaseContractsEntityRestriction.JSON_PROPERTY_CONTRACT_NAME,
  ServerBaseContractsEntityRestriction.JSON_PROPERTY_C_REFVALUE2,
  ServerBaseContractsEntityRestriction.JSON_PROPERTY_ID,
  ServerBaseContractsEntityRestriction.JSON_PROPERTY_C_REFTYPE2,
  ServerBaseContractsEntityRestriction.JSON_PROPERTY_C_DISMISSAL_PROTECTION_END,
  ServerBaseContractsEntityRestriction.JSON_PROPERTY_C_AUTO_RENEWAL_PERIOD,
  ServerBaseContractsEntityRestriction.JSON_PROPERTY_C_SUPPORT_SVC_SW,
  ServerBaseContractsEntityRestriction.JSON_PROPERTY_C_RENEWAL_DATE,
  ServerBaseContractsEntityRestriction.JSON_PROPERTY_RUNTIME,
  ServerBaseContractsEntityRestriction.JSON_PROPERTY_C_SUPPORT_TIME_SW,
  ServerBaseContractsEntityRestriction.JSON_PROPERTY_C_SUPPORT_REACTION_HW,
  ServerBaseContractsEntityRestriction.JSON_PROPERTY_ELID,
  ServerBaseContractsEntityRestriction.JSON_PROPERTY_C_SUPPORT_REACTION_SW,
  ServerBaseContractsEntityRestriction.JSON_PROPERTY_BEGIN_DATE,
  ServerBaseContractsEntityRestriction.JSON_PROPERTY_DISMISSAL,
  ServerBaseContractsEntityRestriction.JSON_PROPERTY_C_DISMISSAL_END_DATE,
  ServerBaseContractsEntityRestriction.JSON_PROPERTY_SERVICE_NO,
  ServerBaseContractsEntityRestriction.JSON_PROPERTY_C_SUPPORT_SVC_HW,
  ServerBaseContractsEntityRestriction.JSON_PROPERTY_C_RENEWAL,
  ServerBaseContractsEntityRestriction.JSON_PROPERTY_C_SUPPORT_TIME_HW
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class ServerBaseContractsEntityRestriction {
  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private RestrictionsDate endDate;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private RestrictionsString description;

  public static final String JSON_PROPERTY_C_DISMISSAL_DATE = "cDismissalDate";
  private RestrictionsDate cDismissalDate;

  public static final String JSON_PROPERTY_C_AUTOMATIC_RENEWAL = "cAutomaticRenewal";
  private RestrictionsString cAutomaticRenewal;

  public static final String JSON_PROPERTY_C_DISMISSAL_RECEIVED_DATE = "cDismissalReceivedDate";
  private RestrictionsDate cDismissalReceivedDate;

  public static final String JSON_PROPERTY_C_REFTYPE1 = "cReftype1";
  private RestrictionsString cReftype1;

  public static final String JSON_PROPERTY_DISMISSAL_PROTECTION = "dismissalProtection";
  private RestrictionsString dismissalProtection;

  public static final String JSON_PROPERTY_ACCOUNT_NO = "accountNo";
  private RestrictionsString accountNo;

  public static final String JSON_PROPERTY_YEARLY_COSTS = "yearlyCosts";
  private RestrictionsNumeric yearlyCosts;

  public static final String JSON_PROPERTY_C_REFVALUE1 = "cRefvalue1";
  private RestrictionsString cRefvalue1;

  public static final String JSON_PROPERTY_CONTRACT_NAME = "contractName";
  private RestrictionsString contractName;

  public static final String JSON_PROPERTY_C_REFVALUE2 = "cRefvalue2";
  private RestrictionsString cRefvalue2;

  public static final String JSON_PROPERTY_ID = "id";
  private RestrictionsString id;

  public static final String JSON_PROPERTY_C_REFTYPE2 = "cReftype2";
  private RestrictionsString cReftype2;

  public static final String JSON_PROPERTY_C_DISMISSAL_PROTECTION_END = "cDismissalProtectionEnd";
  private RestrictionsDate cDismissalProtectionEnd;

  public static final String JSON_PROPERTY_C_AUTO_RENEWAL_PERIOD = "cAutoRenewalPeriod";
  private RestrictionsString cAutoRenewalPeriod;

  public static final String JSON_PROPERTY_C_SUPPORT_SVC_SW = "cSupportSvcSw";
  private RestrictionsString cSupportSvcSw;

  public static final String JSON_PROPERTY_C_RENEWAL_DATE = "cRenewalDate";
  private RestrictionsDate cRenewalDate;

  public static final String JSON_PROPERTY_RUNTIME = "runtime";
  private RestrictionsString runtime;

  public static final String JSON_PROPERTY_C_SUPPORT_TIME_SW = "cSupportTimeSw";
  private RestrictionsString cSupportTimeSw;

  public static final String JSON_PROPERTY_C_SUPPORT_REACTION_HW = "cSupportReactionHw";
  private RestrictionsString cSupportReactionHw;

  public static final String JSON_PROPERTY_ELID = "elid";
  private RestrictionsString elid;

  public static final String JSON_PROPERTY_C_SUPPORT_REACTION_SW = "cSupportReactionSw";
  private RestrictionsString cSupportReactionSw;

  public static final String JSON_PROPERTY_BEGIN_DATE = "beginDate";
  private RestrictionsDate beginDate;

  public static final String JSON_PROPERTY_DISMISSAL = "dismissal";
  private RestrictionsString dismissal;

  public static final String JSON_PROPERTY_C_DISMISSAL_END_DATE = "cDismissalEndDate";
  private RestrictionsDate cDismissalEndDate;

  public static final String JSON_PROPERTY_SERVICE_NO = "serviceNo";
  private RestrictionsString serviceNo;

  public static final String JSON_PROPERTY_C_SUPPORT_SVC_HW = "cSupportSvcHw";
  private RestrictionsString cSupportSvcHw;

  public static final String JSON_PROPERTY_C_RENEWAL = "cRenewal";
  private RestrictionsString cRenewal;

  public static final String JSON_PROPERTY_C_SUPPORT_TIME_HW = "cSupportTimeHw";
  private RestrictionsString cSupportTimeHw;

  public ServerBaseContractsEntityRestriction() {
  }

  public ServerBaseContractsEntityRestriction endDate(RestrictionsDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsDate getEndDate() {
    return endDate;
  }


  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndDate(RestrictionsDate endDate) {
    this.endDate = endDate;
  }


  public ServerBaseContractsEntityRestriction description(RestrictionsString description) {
    
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


  public ServerBaseContractsEntityRestriction cDismissalDate(RestrictionsDate cDismissalDate) {
    
    this.cDismissalDate = cDismissalDate;
    return this;
  }

   /**
   * Get cDismissalDate
   * @return cDismissalDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_DISMISSAL_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsDate getcDismissalDate() {
    return cDismissalDate;
  }


  @JsonProperty(JSON_PROPERTY_C_DISMISSAL_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcDismissalDate(RestrictionsDate cDismissalDate) {
    this.cDismissalDate = cDismissalDate;
  }


  public ServerBaseContractsEntityRestriction cAutomaticRenewal(RestrictionsString cAutomaticRenewal) {
    
    this.cAutomaticRenewal = cAutomaticRenewal;
    return this;
  }

   /**
   * Get cAutomaticRenewal
   * @return cAutomaticRenewal
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_AUTOMATIC_RENEWAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getcAutomaticRenewal() {
    return cAutomaticRenewal;
  }


  @JsonProperty(JSON_PROPERTY_C_AUTOMATIC_RENEWAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcAutomaticRenewal(RestrictionsString cAutomaticRenewal) {
    this.cAutomaticRenewal = cAutomaticRenewal;
  }


  public ServerBaseContractsEntityRestriction cDismissalReceivedDate(RestrictionsDate cDismissalReceivedDate) {
    
    this.cDismissalReceivedDate = cDismissalReceivedDate;
    return this;
  }

   /**
   * Get cDismissalReceivedDate
   * @return cDismissalReceivedDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_DISMISSAL_RECEIVED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsDate getcDismissalReceivedDate() {
    return cDismissalReceivedDate;
  }


  @JsonProperty(JSON_PROPERTY_C_DISMISSAL_RECEIVED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcDismissalReceivedDate(RestrictionsDate cDismissalReceivedDate) {
    this.cDismissalReceivedDate = cDismissalReceivedDate;
  }


  public ServerBaseContractsEntityRestriction cReftype1(RestrictionsString cReftype1) {
    
    this.cReftype1 = cReftype1;
    return this;
  }

   /**
   * Get cReftype1
   * @return cReftype1
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_REFTYPE1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getcReftype1() {
    return cReftype1;
  }


  @JsonProperty(JSON_PROPERTY_C_REFTYPE1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcReftype1(RestrictionsString cReftype1) {
    this.cReftype1 = cReftype1;
  }


  public ServerBaseContractsEntityRestriction dismissalProtection(RestrictionsString dismissalProtection) {
    
    this.dismissalProtection = dismissalProtection;
    return this;
  }

   /**
   * Get dismissalProtection
   * @return dismissalProtection
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISMISSAL_PROTECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getDismissalProtection() {
    return dismissalProtection;
  }


  @JsonProperty(JSON_PROPERTY_DISMISSAL_PROTECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDismissalProtection(RestrictionsString dismissalProtection) {
    this.dismissalProtection = dismissalProtection;
  }


  public ServerBaseContractsEntityRestriction accountNo(RestrictionsString accountNo) {
    
    this.accountNo = accountNo;
    return this;
  }

   /**
   * Get accountNo
   * @return accountNo
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getAccountNo() {
    return accountNo;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountNo(RestrictionsString accountNo) {
    this.accountNo = accountNo;
  }


  public ServerBaseContractsEntityRestriction yearlyCosts(RestrictionsNumeric yearlyCosts) {
    
    this.yearlyCosts = yearlyCosts;
    return this;
  }

   /**
   * Get yearlyCosts
   * @return yearlyCosts
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_YEARLY_COSTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsNumeric getYearlyCosts() {
    return yearlyCosts;
  }


  @JsonProperty(JSON_PROPERTY_YEARLY_COSTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setYearlyCosts(RestrictionsNumeric yearlyCosts) {
    this.yearlyCosts = yearlyCosts;
  }


  public ServerBaseContractsEntityRestriction cRefvalue1(RestrictionsString cRefvalue1) {
    
    this.cRefvalue1 = cRefvalue1;
    return this;
  }

   /**
   * Get cRefvalue1
   * @return cRefvalue1
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_REFVALUE1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getcRefvalue1() {
    return cRefvalue1;
  }


  @JsonProperty(JSON_PROPERTY_C_REFVALUE1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcRefvalue1(RestrictionsString cRefvalue1) {
    this.cRefvalue1 = cRefvalue1;
  }


  public ServerBaseContractsEntityRestriction contractName(RestrictionsString contractName) {
    
    this.contractName = contractName;
    return this;
  }

   /**
   * Get contractName
   * @return contractName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTRACT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getContractName() {
    return contractName;
  }


  @JsonProperty(JSON_PROPERTY_CONTRACT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContractName(RestrictionsString contractName) {
    this.contractName = contractName;
  }


  public ServerBaseContractsEntityRestriction cRefvalue2(RestrictionsString cRefvalue2) {
    
    this.cRefvalue2 = cRefvalue2;
    return this;
  }

   /**
   * Get cRefvalue2
   * @return cRefvalue2
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_REFVALUE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getcRefvalue2() {
    return cRefvalue2;
  }


  @JsonProperty(JSON_PROPERTY_C_REFVALUE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcRefvalue2(RestrictionsString cRefvalue2) {
    this.cRefvalue2 = cRefvalue2;
  }


  public ServerBaseContractsEntityRestriction id(RestrictionsString id) {
    
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


  public ServerBaseContractsEntityRestriction cReftype2(RestrictionsString cReftype2) {
    
    this.cReftype2 = cReftype2;
    return this;
  }

   /**
   * Get cReftype2
   * @return cReftype2
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_REFTYPE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getcReftype2() {
    return cReftype2;
  }


  @JsonProperty(JSON_PROPERTY_C_REFTYPE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcReftype2(RestrictionsString cReftype2) {
    this.cReftype2 = cReftype2;
  }


  public ServerBaseContractsEntityRestriction cDismissalProtectionEnd(RestrictionsDate cDismissalProtectionEnd) {
    
    this.cDismissalProtectionEnd = cDismissalProtectionEnd;
    return this;
  }

   /**
   * Get cDismissalProtectionEnd
   * @return cDismissalProtectionEnd
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_DISMISSAL_PROTECTION_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsDate getcDismissalProtectionEnd() {
    return cDismissalProtectionEnd;
  }


  @JsonProperty(JSON_PROPERTY_C_DISMISSAL_PROTECTION_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcDismissalProtectionEnd(RestrictionsDate cDismissalProtectionEnd) {
    this.cDismissalProtectionEnd = cDismissalProtectionEnd;
  }


  public ServerBaseContractsEntityRestriction cAutoRenewalPeriod(RestrictionsString cAutoRenewalPeriod) {
    
    this.cAutoRenewalPeriod = cAutoRenewalPeriod;
    return this;
  }

   /**
   * Get cAutoRenewalPeriod
   * @return cAutoRenewalPeriod
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_AUTO_RENEWAL_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getcAutoRenewalPeriod() {
    return cAutoRenewalPeriod;
  }


  @JsonProperty(JSON_PROPERTY_C_AUTO_RENEWAL_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcAutoRenewalPeriod(RestrictionsString cAutoRenewalPeriod) {
    this.cAutoRenewalPeriod = cAutoRenewalPeriod;
  }


  public ServerBaseContractsEntityRestriction cSupportSvcSw(RestrictionsString cSupportSvcSw) {
    
    this.cSupportSvcSw = cSupportSvcSw;
    return this;
  }

   /**
   * Get cSupportSvcSw
   * @return cSupportSvcSw
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_SUPPORT_SVC_SW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getcSupportSvcSw() {
    return cSupportSvcSw;
  }


  @JsonProperty(JSON_PROPERTY_C_SUPPORT_SVC_SW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcSupportSvcSw(RestrictionsString cSupportSvcSw) {
    this.cSupportSvcSw = cSupportSvcSw;
  }


  public ServerBaseContractsEntityRestriction cRenewalDate(RestrictionsDate cRenewalDate) {
    
    this.cRenewalDate = cRenewalDate;
    return this;
  }

   /**
   * Get cRenewalDate
   * @return cRenewalDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_RENEWAL_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsDate getcRenewalDate() {
    return cRenewalDate;
  }


  @JsonProperty(JSON_PROPERTY_C_RENEWAL_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcRenewalDate(RestrictionsDate cRenewalDate) {
    this.cRenewalDate = cRenewalDate;
  }


  public ServerBaseContractsEntityRestriction runtime(RestrictionsString runtime) {
    
    this.runtime = runtime;
    return this;
  }

   /**
   * Get runtime
   * @return runtime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUNTIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getRuntime() {
    return runtime;
  }


  @JsonProperty(JSON_PROPERTY_RUNTIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRuntime(RestrictionsString runtime) {
    this.runtime = runtime;
  }


  public ServerBaseContractsEntityRestriction cSupportTimeSw(RestrictionsString cSupportTimeSw) {
    
    this.cSupportTimeSw = cSupportTimeSw;
    return this;
  }

   /**
   * Get cSupportTimeSw
   * @return cSupportTimeSw
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_SUPPORT_TIME_SW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getcSupportTimeSw() {
    return cSupportTimeSw;
  }


  @JsonProperty(JSON_PROPERTY_C_SUPPORT_TIME_SW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcSupportTimeSw(RestrictionsString cSupportTimeSw) {
    this.cSupportTimeSw = cSupportTimeSw;
  }


  public ServerBaseContractsEntityRestriction cSupportReactionHw(RestrictionsString cSupportReactionHw) {
    
    this.cSupportReactionHw = cSupportReactionHw;
    return this;
  }

   /**
   * Get cSupportReactionHw
   * @return cSupportReactionHw
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_SUPPORT_REACTION_HW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getcSupportReactionHw() {
    return cSupportReactionHw;
  }


  @JsonProperty(JSON_PROPERTY_C_SUPPORT_REACTION_HW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcSupportReactionHw(RestrictionsString cSupportReactionHw) {
    this.cSupportReactionHw = cSupportReactionHw;
  }


  public ServerBaseContractsEntityRestriction elid(RestrictionsString elid) {
    
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


  public ServerBaseContractsEntityRestriction cSupportReactionSw(RestrictionsString cSupportReactionSw) {
    
    this.cSupportReactionSw = cSupportReactionSw;
    return this;
  }

   /**
   * Get cSupportReactionSw
   * @return cSupportReactionSw
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_SUPPORT_REACTION_SW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getcSupportReactionSw() {
    return cSupportReactionSw;
  }


  @JsonProperty(JSON_PROPERTY_C_SUPPORT_REACTION_SW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcSupportReactionSw(RestrictionsString cSupportReactionSw) {
    this.cSupportReactionSw = cSupportReactionSw;
  }


  public ServerBaseContractsEntityRestriction beginDate(RestrictionsDate beginDate) {
    
    this.beginDate = beginDate;
    return this;
  }

   /**
   * Get beginDate
   * @return beginDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BEGIN_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsDate getBeginDate() {
    return beginDate;
  }


  @JsonProperty(JSON_PROPERTY_BEGIN_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBeginDate(RestrictionsDate beginDate) {
    this.beginDate = beginDate;
  }


  public ServerBaseContractsEntityRestriction dismissal(RestrictionsString dismissal) {
    
    this.dismissal = dismissal;
    return this;
  }

   /**
   * Get dismissal
   * @return dismissal
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISMISSAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getDismissal() {
    return dismissal;
  }


  @JsonProperty(JSON_PROPERTY_DISMISSAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDismissal(RestrictionsString dismissal) {
    this.dismissal = dismissal;
  }


  public ServerBaseContractsEntityRestriction cDismissalEndDate(RestrictionsDate cDismissalEndDate) {
    
    this.cDismissalEndDate = cDismissalEndDate;
    return this;
  }

   /**
   * Get cDismissalEndDate
   * @return cDismissalEndDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_DISMISSAL_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsDate getcDismissalEndDate() {
    return cDismissalEndDate;
  }


  @JsonProperty(JSON_PROPERTY_C_DISMISSAL_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcDismissalEndDate(RestrictionsDate cDismissalEndDate) {
    this.cDismissalEndDate = cDismissalEndDate;
  }


  public ServerBaseContractsEntityRestriction serviceNo(RestrictionsString serviceNo) {
    
    this.serviceNo = serviceNo;
    return this;
  }

   /**
   * Get serviceNo
   * @return serviceNo
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getServiceNo() {
    return serviceNo;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceNo(RestrictionsString serviceNo) {
    this.serviceNo = serviceNo;
  }


  public ServerBaseContractsEntityRestriction cSupportSvcHw(RestrictionsString cSupportSvcHw) {
    
    this.cSupportSvcHw = cSupportSvcHw;
    return this;
  }

   /**
   * Get cSupportSvcHw
   * @return cSupportSvcHw
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_SUPPORT_SVC_HW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getcSupportSvcHw() {
    return cSupportSvcHw;
  }


  @JsonProperty(JSON_PROPERTY_C_SUPPORT_SVC_HW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcSupportSvcHw(RestrictionsString cSupportSvcHw) {
    this.cSupportSvcHw = cSupportSvcHw;
  }


  public ServerBaseContractsEntityRestriction cRenewal(RestrictionsString cRenewal) {
    
    this.cRenewal = cRenewal;
    return this;
  }

   /**
   * Get cRenewal
   * @return cRenewal
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_RENEWAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getcRenewal() {
    return cRenewal;
  }


  @JsonProperty(JSON_PROPERTY_C_RENEWAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcRenewal(RestrictionsString cRenewal) {
    this.cRenewal = cRenewal;
  }


  public ServerBaseContractsEntityRestriction cSupportTimeHw(RestrictionsString cSupportTimeHw) {
    
    this.cSupportTimeHw = cSupportTimeHw;
    return this;
  }

   /**
   * Get cSupportTimeHw
   * @return cSupportTimeHw
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_SUPPORT_TIME_HW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getcSupportTimeHw() {
    return cSupportTimeHw;
  }


  @JsonProperty(JSON_PROPERTY_C_SUPPORT_TIME_HW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcSupportTimeHw(RestrictionsString cSupportTimeHw) {
    this.cSupportTimeHw = cSupportTimeHw;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerBaseContractsEntityRestriction serverBaseContractsEntityRestriction = (ServerBaseContractsEntityRestriction) o;
    return Objects.equals(this.endDate, serverBaseContractsEntityRestriction.endDate) &&
        Objects.equals(this.description, serverBaseContractsEntityRestriction.description) &&
        Objects.equals(this.cDismissalDate, serverBaseContractsEntityRestriction.cDismissalDate) &&
        Objects.equals(this.cAutomaticRenewal, serverBaseContractsEntityRestriction.cAutomaticRenewal) &&
        Objects.equals(this.cDismissalReceivedDate, serverBaseContractsEntityRestriction.cDismissalReceivedDate) &&
        Objects.equals(this.cReftype1, serverBaseContractsEntityRestriction.cReftype1) &&
        Objects.equals(this.dismissalProtection, serverBaseContractsEntityRestriction.dismissalProtection) &&
        Objects.equals(this.accountNo, serverBaseContractsEntityRestriction.accountNo) &&
        Objects.equals(this.yearlyCosts, serverBaseContractsEntityRestriction.yearlyCosts) &&
        Objects.equals(this.cRefvalue1, serverBaseContractsEntityRestriction.cRefvalue1) &&
        Objects.equals(this.contractName, serverBaseContractsEntityRestriction.contractName) &&
        Objects.equals(this.cRefvalue2, serverBaseContractsEntityRestriction.cRefvalue2) &&
        Objects.equals(this.id, serverBaseContractsEntityRestriction.id) &&
        Objects.equals(this.cReftype2, serverBaseContractsEntityRestriction.cReftype2) &&
        Objects.equals(this.cDismissalProtectionEnd, serverBaseContractsEntityRestriction.cDismissalProtectionEnd) &&
        Objects.equals(this.cAutoRenewalPeriod, serverBaseContractsEntityRestriction.cAutoRenewalPeriod) &&
        Objects.equals(this.cSupportSvcSw, serverBaseContractsEntityRestriction.cSupportSvcSw) &&
        Objects.equals(this.cRenewalDate, serverBaseContractsEntityRestriction.cRenewalDate) &&
        Objects.equals(this.runtime, serverBaseContractsEntityRestriction.runtime) &&
        Objects.equals(this.cSupportTimeSw, serverBaseContractsEntityRestriction.cSupportTimeSw) &&
        Objects.equals(this.cSupportReactionHw, serverBaseContractsEntityRestriction.cSupportReactionHw) &&
        Objects.equals(this.elid, serverBaseContractsEntityRestriction.elid) &&
        Objects.equals(this.cSupportReactionSw, serverBaseContractsEntityRestriction.cSupportReactionSw) &&
        Objects.equals(this.beginDate, serverBaseContractsEntityRestriction.beginDate) &&
        Objects.equals(this.dismissal, serverBaseContractsEntityRestriction.dismissal) &&
        Objects.equals(this.cDismissalEndDate, serverBaseContractsEntityRestriction.cDismissalEndDate) &&
        Objects.equals(this.serviceNo, serverBaseContractsEntityRestriction.serviceNo) &&
        Objects.equals(this.cSupportSvcHw, serverBaseContractsEntityRestriction.cSupportSvcHw) &&
        Objects.equals(this.cRenewal, serverBaseContractsEntityRestriction.cRenewal) &&
        Objects.equals(this.cSupportTimeHw, serverBaseContractsEntityRestriction.cSupportTimeHw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDate, description, cDismissalDate, cAutomaticRenewal, cDismissalReceivedDate, cReftype1, dismissalProtection, accountNo, yearlyCosts, cRefvalue1, contractName, cRefvalue2, id, cReftype2, cDismissalProtectionEnd, cAutoRenewalPeriod, cSupportSvcSw, cRenewalDate, runtime, cSupportTimeSw, cSupportReactionHw, elid, cSupportReactionSw, beginDate, dismissal, cDismissalEndDate, serviceNo, cSupportSvcHw, cRenewal, cSupportTimeHw);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerBaseContractsEntityRestriction {\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    cDismissalDate: ").append(toIndentedString(cDismissalDate)).append("\n");
    sb.append("    cAutomaticRenewal: ").append(toIndentedString(cAutomaticRenewal)).append("\n");
    sb.append("    cDismissalReceivedDate: ").append(toIndentedString(cDismissalReceivedDate)).append("\n");
    sb.append("    cReftype1: ").append(toIndentedString(cReftype1)).append("\n");
    sb.append("    dismissalProtection: ").append(toIndentedString(dismissalProtection)).append("\n");
    sb.append("    accountNo: ").append(toIndentedString(accountNo)).append("\n");
    sb.append("    yearlyCosts: ").append(toIndentedString(yearlyCosts)).append("\n");
    sb.append("    cRefvalue1: ").append(toIndentedString(cRefvalue1)).append("\n");
    sb.append("    contractName: ").append(toIndentedString(contractName)).append("\n");
    sb.append("    cRefvalue2: ").append(toIndentedString(cRefvalue2)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    cReftype2: ").append(toIndentedString(cReftype2)).append("\n");
    sb.append("    cDismissalProtectionEnd: ").append(toIndentedString(cDismissalProtectionEnd)).append("\n");
    sb.append("    cAutoRenewalPeriod: ").append(toIndentedString(cAutoRenewalPeriod)).append("\n");
    sb.append("    cSupportSvcSw: ").append(toIndentedString(cSupportSvcSw)).append("\n");
    sb.append("    cRenewalDate: ").append(toIndentedString(cRenewalDate)).append("\n");
    sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
    sb.append("    cSupportTimeSw: ").append(toIndentedString(cSupportTimeSw)).append("\n");
    sb.append("    cSupportReactionHw: ").append(toIndentedString(cSupportReactionHw)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    cSupportReactionSw: ").append(toIndentedString(cSupportReactionSw)).append("\n");
    sb.append("    beginDate: ").append(toIndentedString(beginDate)).append("\n");
    sb.append("    dismissal: ").append(toIndentedString(dismissal)).append("\n");
    sb.append("    cDismissalEndDate: ").append(toIndentedString(cDismissalEndDate)).append("\n");
    sb.append("    serviceNo: ").append(toIndentedString(serviceNo)).append("\n");
    sb.append("    cSupportSvcHw: ").append(toIndentedString(cSupportSvcHw)).append("\n");
    sb.append("    cRenewal: ").append(toIndentedString(cRenewal)).append("\n");
    sb.append("    cSupportTimeHw: ").append(toIndentedString(cSupportTimeHw)).append("\n");
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
