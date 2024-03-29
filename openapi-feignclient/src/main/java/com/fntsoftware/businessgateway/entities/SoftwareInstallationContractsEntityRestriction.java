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
 * SoftwareInstallationContractsEntityRestriction
 */
@JsonPropertyOrder({
  SoftwareInstallationContractsEntityRestriction.JSON_PROPERTY_END_DATE,
  SoftwareInstallationContractsEntityRestriction.JSON_PROPERTY_DESCRIPTION,
  SoftwareInstallationContractsEntityRestriction.JSON_PROPERTY_C_DISMISSAL_DATE,
  SoftwareInstallationContractsEntityRestriction.JSON_PROPERTY_C_AUTOMATIC_RENEWAL,
  SoftwareInstallationContractsEntityRestriction.JSON_PROPERTY_C_DISMISSAL_RECEIVED_DATE,
  SoftwareInstallationContractsEntityRestriction.JSON_PROPERTY_C_REFTYPE1,
  SoftwareInstallationContractsEntityRestriction.JSON_PROPERTY_DISMISSAL_PROTECTION,
  SoftwareInstallationContractsEntityRestriction.JSON_PROPERTY_ACCOUNT_NO,
  SoftwareInstallationContractsEntityRestriction.JSON_PROPERTY_YEARLY_COSTS,
  SoftwareInstallationContractsEntityRestriction.JSON_PROPERTY_C_REFVALUE1,
  SoftwareInstallationContractsEntityRestriction.JSON_PROPERTY_CONTRACT_NAME,
  SoftwareInstallationContractsEntityRestriction.JSON_PROPERTY_C_REFVALUE2,
  SoftwareInstallationContractsEntityRestriction.JSON_PROPERTY_ID,
  SoftwareInstallationContractsEntityRestriction.JSON_PROPERTY_C_REFTYPE2,
  SoftwareInstallationContractsEntityRestriction.JSON_PROPERTY_C_DISMISSAL_PROTECTION_END,
  SoftwareInstallationContractsEntityRestriction.JSON_PROPERTY_C_AUTO_RENEWAL_PERIOD,
  SoftwareInstallationContractsEntityRestriction.JSON_PROPERTY_C_SUPPORT_SVC_SW,
  SoftwareInstallationContractsEntityRestriction.JSON_PROPERTY_C_RENEWAL_DATE,
  SoftwareInstallationContractsEntityRestriction.JSON_PROPERTY_RUNTIME,
  SoftwareInstallationContractsEntityRestriction.JSON_PROPERTY_C_SUPPORT_TIME_SW,
  SoftwareInstallationContractsEntityRestriction.JSON_PROPERTY_C_SUPPORT_REACTION_HW,
  SoftwareInstallationContractsEntityRestriction.JSON_PROPERTY_ELID,
  SoftwareInstallationContractsEntityRestriction.JSON_PROPERTY_C_SUPPORT_REACTION_SW,
  SoftwareInstallationContractsEntityRestriction.JSON_PROPERTY_BEGIN_DATE,
  SoftwareInstallationContractsEntityRestriction.JSON_PROPERTY_DISMISSAL,
  SoftwareInstallationContractsEntityRestriction.JSON_PROPERTY_C_DISMISSAL_END_DATE,
  SoftwareInstallationContractsEntityRestriction.JSON_PROPERTY_SERVICE_NO,
  SoftwareInstallationContractsEntityRestriction.JSON_PROPERTY_C_SUPPORT_SVC_HW,
  SoftwareInstallationContractsEntityRestriction.JSON_PROPERTY_C_RENEWAL,
  SoftwareInstallationContractsEntityRestriction.JSON_PROPERTY_C_SUPPORT_TIME_HW
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class SoftwareInstallationContractsEntityRestriction {
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

  public SoftwareInstallationContractsEntityRestriction() {
  }

  public SoftwareInstallationContractsEntityRestriction endDate(RestrictionsDate endDate) {
    
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


  public SoftwareInstallationContractsEntityRestriction description(RestrictionsString description) {
    
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


  public SoftwareInstallationContractsEntityRestriction cDismissalDate(RestrictionsDate cDismissalDate) {
    
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


  public SoftwareInstallationContractsEntityRestriction cAutomaticRenewal(RestrictionsString cAutomaticRenewal) {
    
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


  public SoftwareInstallationContractsEntityRestriction cDismissalReceivedDate(RestrictionsDate cDismissalReceivedDate) {
    
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


  public SoftwareInstallationContractsEntityRestriction cReftype1(RestrictionsString cReftype1) {
    
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


  public SoftwareInstallationContractsEntityRestriction dismissalProtection(RestrictionsString dismissalProtection) {
    
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


  public SoftwareInstallationContractsEntityRestriction accountNo(RestrictionsString accountNo) {
    
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


  public SoftwareInstallationContractsEntityRestriction yearlyCosts(RestrictionsNumeric yearlyCosts) {
    
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


  public SoftwareInstallationContractsEntityRestriction cRefvalue1(RestrictionsString cRefvalue1) {
    
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


  public SoftwareInstallationContractsEntityRestriction contractName(RestrictionsString contractName) {
    
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


  public SoftwareInstallationContractsEntityRestriction cRefvalue2(RestrictionsString cRefvalue2) {
    
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


  public SoftwareInstallationContractsEntityRestriction id(RestrictionsString id) {
    
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


  public SoftwareInstallationContractsEntityRestriction cReftype2(RestrictionsString cReftype2) {
    
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


  public SoftwareInstallationContractsEntityRestriction cDismissalProtectionEnd(RestrictionsDate cDismissalProtectionEnd) {
    
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


  public SoftwareInstallationContractsEntityRestriction cAutoRenewalPeriod(RestrictionsString cAutoRenewalPeriod) {
    
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


  public SoftwareInstallationContractsEntityRestriction cSupportSvcSw(RestrictionsString cSupportSvcSw) {
    
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


  public SoftwareInstallationContractsEntityRestriction cRenewalDate(RestrictionsDate cRenewalDate) {
    
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


  public SoftwareInstallationContractsEntityRestriction runtime(RestrictionsString runtime) {
    
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


  public SoftwareInstallationContractsEntityRestriction cSupportTimeSw(RestrictionsString cSupportTimeSw) {
    
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


  public SoftwareInstallationContractsEntityRestriction cSupportReactionHw(RestrictionsString cSupportReactionHw) {
    
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


  public SoftwareInstallationContractsEntityRestriction elid(RestrictionsString elid) {
    
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


  public SoftwareInstallationContractsEntityRestriction cSupportReactionSw(RestrictionsString cSupportReactionSw) {
    
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


  public SoftwareInstallationContractsEntityRestriction beginDate(RestrictionsDate beginDate) {
    
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


  public SoftwareInstallationContractsEntityRestriction dismissal(RestrictionsString dismissal) {
    
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


  public SoftwareInstallationContractsEntityRestriction cDismissalEndDate(RestrictionsDate cDismissalEndDate) {
    
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


  public SoftwareInstallationContractsEntityRestriction serviceNo(RestrictionsString serviceNo) {
    
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


  public SoftwareInstallationContractsEntityRestriction cSupportSvcHw(RestrictionsString cSupportSvcHw) {
    
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


  public SoftwareInstallationContractsEntityRestriction cRenewal(RestrictionsString cRenewal) {
    
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


  public SoftwareInstallationContractsEntityRestriction cSupportTimeHw(RestrictionsString cSupportTimeHw) {
    
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
    SoftwareInstallationContractsEntityRestriction softwareInstallationContractsEntityRestriction = (SoftwareInstallationContractsEntityRestriction) o;
    return Objects.equals(this.endDate, softwareInstallationContractsEntityRestriction.endDate) &&
        Objects.equals(this.description, softwareInstallationContractsEntityRestriction.description) &&
        Objects.equals(this.cDismissalDate, softwareInstallationContractsEntityRestriction.cDismissalDate) &&
        Objects.equals(this.cAutomaticRenewal, softwareInstallationContractsEntityRestriction.cAutomaticRenewal) &&
        Objects.equals(this.cDismissalReceivedDate, softwareInstallationContractsEntityRestriction.cDismissalReceivedDate) &&
        Objects.equals(this.cReftype1, softwareInstallationContractsEntityRestriction.cReftype1) &&
        Objects.equals(this.dismissalProtection, softwareInstallationContractsEntityRestriction.dismissalProtection) &&
        Objects.equals(this.accountNo, softwareInstallationContractsEntityRestriction.accountNo) &&
        Objects.equals(this.yearlyCosts, softwareInstallationContractsEntityRestriction.yearlyCosts) &&
        Objects.equals(this.cRefvalue1, softwareInstallationContractsEntityRestriction.cRefvalue1) &&
        Objects.equals(this.contractName, softwareInstallationContractsEntityRestriction.contractName) &&
        Objects.equals(this.cRefvalue2, softwareInstallationContractsEntityRestriction.cRefvalue2) &&
        Objects.equals(this.id, softwareInstallationContractsEntityRestriction.id) &&
        Objects.equals(this.cReftype2, softwareInstallationContractsEntityRestriction.cReftype2) &&
        Objects.equals(this.cDismissalProtectionEnd, softwareInstallationContractsEntityRestriction.cDismissalProtectionEnd) &&
        Objects.equals(this.cAutoRenewalPeriod, softwareInstallationContractsEntityRestriction.cAutoRenewalPeriod) &&
        Objects.equals(this.cSupportSvcSw, softwareInstallationContractsEntityRestriction.cSupportSvcSw) &&
        Objects.equals(this.cRenewalDate, softwareInstallationContractsEntityRestriction.cRenewalDate) &&
        Objects.equals(this.runtime, softwareInstallationContractsEntityRestriction.runtime) &&
        Objects.equals(this.cSupportTimeSw, softwareInstallationContractsEntityRestriction.cSupportTimeSw) &&
        Objects.equals(this.cSupportReactionHw, softwareInstallationContractsEntityRestriction.cSupportReactionHw) &&
        Objects.equals(this.elid, softwareInstallationContractsEntityRestriction.elid) &&
        Objects.equals(this.cSupportReactionSw, softwareInstallationContractsEntityRestriction.cSupportReactionSw) &&
        Objects.equals(this.beginDate, softwareInstallationContractsEntityRestriction.beginDate) &&
        Objects.equals(this.dismissal, softwareInstallationContractsEntityRestriction.dismissal) &&
        Objects.equals(this.cDismissalEndDate, softwareInstallationContractsEntityRestriction.cDismissalEndDate) &&
        Objects.equals(this.serviceNo, softwareInstallationContractsEntityRestriction.serviceNo) &&
        Objects.equals(this.cSupportSvcHw, softwareInstallationContractsEntityRestriction.cSupportSvcHw) &&
        Objects.equals(this.cRenewal, softwareInstallationContractsEntityRestriction.cRenewal) &&
        Objects.equals(this.cSupportTimeHw, softwareInstallationContractsEntityRestriction.cSupportTimeHw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDate, description, cDismissalDate, cAutomaticRenewal, cDismissalReceivedDate, cReftype1, dismissalProtection, accountNo, yearlyCosts, cRefvalue1, contractName, cRefvalue2, id, cReftype2, cDismissalProtectionEnd, cAutoRenewalPeriod, cSupportSvcSw, cRenewalDate, runtime, cSupportTimeSw, cSupportReactionHw, elid, cSupportReactionSw, beginDate, dismissal, cDismissalEndDate, serviceNo, cSupportSvcHw, cRenewal, cSupportTimeHw);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SoftwareInstallationContractsEntityRestriction {\n");
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

