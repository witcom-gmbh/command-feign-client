/*
 * Swagger for Command BGE
 * Swagger API for FNT Command Business Gateway
 *
 * The version of the OpenAPI document: 20240131102312
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
 * PersonData
 */
@JsonPropertyOrder({
  PersonData.JSON_PROPERTY_ZIP_CODE,
  PersonData.JSON_PROPERTY_C_DEPARTMENT,
  PersonData.JSON_PROPERTY_CITY,
  PersonData.JSON_PROPERTY_C_DATA_SOURCE_ID,
  PersonData.JSON_PROPERTY_REMARK,
  PersonData.JSON_PROPERTY_AVAILABILITY,
  PersonData.JSON_PROPERTY_TEAM_LEADER,
  PersonData.JSON_PROPERTY_E_MAIL,
  PersonData.JSON_PROPERTY_STREET,
  PersonData.JSON_PROPERTY_FUNCTION,
  PersonData.JSON_PROPERTY_PERSONAL_NO,
  PersonData.JSON_PROPERTY_COMPANY,
  PersonData.JSON_PROPERTY_ID,
  PersonData.JSON_PROPERTY_DEPARTMENT,
  PersonData.JSON_PROPERTY_FAX,
  PersonData.JSON_PROPERTY_C_DATA_SOURCE_DELETED,
  PersonData.JSON_PROPERTY_C_IDENTITY_TYPE1,
  PersonData.JSON_PROPERTY_C_IDENTITY_NO2,
  PersonData.JSON_PROPERTY_C_IDENTITY_TYPE2,
  PersonData.JSON_PROPERTY_COST_CENTER,
  PersonData.JSON_PROPERTY_MOBILE,
  PersonData.JSON_PROPERTY_ELID,
  PersonData.JSON_PROPERTY_FIRST_NAME,
  PersonData.JSON_PROPERTY_C_DATA_SOURCE,
  PersonData.JSON_PROPERTY_PHONE,
  PersonData.JSON_PROPERTY_ORGANIZATION,
  PersonData.JSON_PROPERTY_NAME,
  PersonData.JSON_PROPERTY_C_IDENTITY_NO1,
  PersonData.JSON_PROPERTY_CUSTOMER
})
@JsonTypeName("personData")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:00:24.721128812Z[Etc/UTC]")
public class PersonData {
  public static final String JSON_PROPERTY_ZIP_CODE = "zipCode";
  private String zipCode;

  public static final String JSON_PROPERTY_C_DEPARTMENT = "cDepartment";
  private String cDepartment;

  public static final String JSON_PROPERTY_CITY = "city";
  private String city;

  public static final String JSON_PROPERTY_C_DATA_SOURCE_ID = "cDataSourceId";
  private String cDataSourceId;

  public static final String JSON_PROPERTY_REMARK = "remark";
  private String remark;

  public static final String JSON_PROPERTY_AVAILABILITY = "availability";
  private String availability;

  public static final String JSON_PROPERTY_TEAM_LEADER = "teamLeader";
  private Boolean teamLeader;

  public static final String JSON_PROPERTY_E_MAIL = "eMail";
  private String eMail;

  public static final String JSON_PROPERTY_STREET = "street";
  private String street;

  public static final String JSON_PROPERTY_FUNCTION = "function";
  private String function;

  public static final String JSON_PROPERTY_PERSONAL_NO = "personalNo";
  private String personalNo;

  public static final String JSON_PROPERTY_COMPANY = "company";
  private String company;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_DEPARTMENT = "department";
  private String department;

  public static final String JSON_PROPERTY_FAX = "fax";
  private String fax;

  public static final String JSON_PROPERTY_C_DATA_SOURCE_DELETED = "cDataSourceDeleted";
  private String cDataSourceDeleted;

  public static final String JSON_PROPERTY_C_IDENTITY_TYPE1 = "cIdentityType1";
  private String cIdentityType1;

  public static final String JSON_PROPERTY_C_IDENTITY_NO2 = "cIdentityNo2";
  private String cIdentityNo2;

  public static final String JSON_PROPERTY_C_IDENTITY_TYPE2 = "cIdentityType2";
  private String cIdentityType2;

  public static final String JSON_PROPERTY_COST_CENTER = "costCenter";
  private String costCenter;

  public static final String JSON_PROPERTY_MOBILE = "mobile";
  private String mobile;

  public static final String JSON_PROPERTY_ELID = "elid";
  private String elid;

  public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
  private String firstName;

  public static final String JSON_PROPERTY_C_DATA_SOURCE = "cDataSource";
  private String cDataSource;

  public static final String JSON_PROPERTY_PHONE = "phone";
  private String phone;

  public static final String JSON_PROPERTY_ORGANIZATION = "organization";
  private String organization;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_C_IDENTITY_NO1 = "cIdentityNo1";
  private String cIdentityNo1;

  public static final String JSON_PROPERTY_CUSTOMER = "customer";
  private String customer;

  public PersonData() {
  }

  public PersonData zipCode(String zipCode) {
    
    this.zipCode = zipCode;
    return this;
  }

   /**
   * Get zipCode
   * @return zipCode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ZIP_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getZipCode() {
    return zipCode;
  }


  @JsonProperty(JSON_PROPERTY_ZIP_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }


  public PersonData cDepartment(String cDepartment) {
    
    this.cDepartment = cDepartment;
    return this;
  }

   /**
   * Get cDepartment
   * @return cDepartment
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_DEPARTMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getcDepartment() {
    return cDepartment;
  }


  @JsonProperty(JSON_PROPERTY_C_DEPARTMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcDepartment(String cDepartment) {
    this.cDepartment = cDepartment;
  }


  public PersonData city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCity() {
    return city;
  }


  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCity(String city) {
    this.city = city;
  }


  public PersonData cDataSourceId(String cDataSourceId) {
    
    this.cDataSourceId = cDataSourceId;
    return this;
  }

   /**
   * Get cDataSourceId
   * @return cDataSourceId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_DATA_SOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getcDataSourceId() {
    return cDataSourceId;
  }


  @JsonProperty(JSON_PROPERTY_C_DATA_SOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcDataSourceId(String cDataSourceId) {
    this.cDataSourceId = cDataSourceId;
  }


  public PersonData remark(String remark) {
    
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

  public String getRemark() {
    return remark;
  }


  @JsonProperty(JSON_PROPERTY_REMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemark(String remark) {
    this.remark = remark;
  }


  public PersonData availability(String availability) {
    
    this.availability = availability;
    return this;
  }

   /**
   * Get availability
   * @return availability
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVAILABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAvailability() {
    return availability;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvailability(String availability) {
    this.availability = availability;
  }


  public PersonData teamLeader(Boolean teamLeader) {
    
    this.teamLeader = teamLeader;
    return this;
  }

   /**
   * Get teamLeader
   * @return teamLeader
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEAM_LEADER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTeamLeader() {
    return teamLeader;
  }


  @JsonProperty(JSON_PROPERTY_TEAM_LEADER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTeamLeader(Boolean teamLeader) {
    this.teamLeader = teamLeader;
  }


  public PersonData eMail(String eMail) {
    
    this.eMail = eMail;
    return this;
  }

   /**
   * Get eMail
   * @return eMail
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_E_MAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String geteMail() {
    return eMail;
  }


  @JsonProperty(JSON_PROPERTY_E_MAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void seteMail(String eMail) {
    this.eMail = eMail;
  }


  public PersonData street(String street) {
    
    this.street = street;
    return this;
  }

   /**
   * Get street
   * @return street
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STREET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStreet() {
    return street;
  }


  @JsonProperty(JSON_PROPERTY_STREET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStreet(String street) {
    this.street = street;
  }


  public PersonData function(String function) {
    
    this.function = function;
    return this;
  }

   /**
   * Get function
   * @return function
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FUNCTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFunction() {
    return function;
  }


  @JsonProperty(JSON_PROPERTY_FUNCTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFunction(String function) {
    this.function = function;
  }


  public PersonData personalNo(String personalNo) {
    
    this.personalNo = personalNo;
    return this;
  }

   /**
   * Get personalNo
   * @return personalNo
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERSONAL_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPersonalNo() {
    return personalNo;
  }


  @JsonProperty(JSON_PROPERTY_PERSONAL_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPersonalNo(String personalNo) {
    this.personalNo = personalNo;
  }


  public PersonData company(String company) {
    
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPANY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompany() {
    return company;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompany(String company) {
    this.company = company;
  }


  public PersonData id(String id) {
    
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


  public PersonData department(String department) {
    
    this.department = department;
    return this;
  }

   /**
   * Get department
   * @return department
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEPARTMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDepartment() {
    return department;
  }


  @JsonProperty(JSON_PROPERTY_DEPARTMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDepartment(String department) {
    this.department = department;
  }


  public PersonData fax(String fax) {
    
    this.fax = fax;
    return this;
  }

   /**
   * Get fax
   * @return fax
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFax() {
    return fax;
  }


  @JsonProperty(JSON_PROPERTY_FAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFax(String fax) {
    this.fax = fax;
  }


  public PersonData cDataSourceDeleted(String cDataSourceDeleted) {
    
    this.cDataSourceDeleted = cDataSourceDeleted;
    return this;
  }

   /**
   * Get cDataSourceDeleted
   * @return cDataSourceDeleted
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_DATA_SOURCE_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getcDataSourceDeleted() {
    return cDataSourceDeleted;
  }


  @JsonProperty(JSON_PROPERTY_C_DATA_SOURCE_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcDataSourceDeleted(String cDataSourceDeleted) {
    this.cDataSourceDeleted = cDataSourceDeleted;
  }


  public PersonData cIdentityType1(String cIdentityType1) {
    
    this.cIdentityType1 = cIdentityType1;
    return this;
  }

   /**
   * Get cIdentityType1
   * @return cIdentityType1
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_IDENTITY_TYPE1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getcIdentityType1() {
    return cIdentityType1;
  }


  @JsonProperty(JSON_PROPERTY_C_IDENTITY_TYPE1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcIdentityType1(String cIdentityType1) {
    this.cIdentityType1 = cIdentityType1;
  }


  public PersonData cIdentityNo2(String cIdentityNo2) {
    
    this.cIdentityNo2 = cIdentityNo2;
    return this;
  }

   /**
   * Get cIdentityNo2
   * @return cIdentityNo2
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_IDENTITY_NO2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getcIdentityNo2() {
    return cIdentityNo2;
  }


  @JsonProperty(JSON_PROPERTY_C_IDENTITY_NO2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcIdentityNo2(String cIdentityNo2) {
    this.cIdentityNo2 = cIdentityNo2;
  }


  public PersonData cIdentityType2(String cIdentityType2) {
    
    this.cIdentityType2 = cIdentityType2;
    return this;
  }

   /**
   * Get cIdentityType2
   * @return cIdentityType2
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_IDENTITY_TYPE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getcIdentityType2() {
    return cIdentityType2;
  }


  @JsonProperty(JSON_PROPERTY_C_IDENTITY_TYPE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcIdentityType2(String cIdentityType2) {
    this.cIdentityType2 = cIdentityType2;
  }


  public PersonData costCenter(String costCenter) {
    
    this.costCenter = costCenter;
    return this;
  }

   /**
   * Get costCenter
   * @return costCenter
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COST_CENTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCostCenter() {
    return costCenter;
  }


  @JsonProperty(JSON_PROPERTY_COST_CENTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCostCenter(String costCenter) {
    this.costCenter = costCenter;
  }


  public PersonData mobile(String mobile) {
    
    this.mobile = mobile;
    return this;
  }

   /**
   * Get mobile
   * @return mobile
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOBILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMobile() {
    return mobile;
  }


  @JsonProperty(JSON_PROPERTY_MOBILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMobile(String mobile) {
    this.mobile = mobile;
  }


  public PersonData elid(String elid) {
    
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

  public String getElid() {
    return elid;
  }


  @JsonProperty(JSON_PROPERTY_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setElid(String elid) {
    this.elid = elid;
  }


  public PersonData firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFirstName() {
    return firstName;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public PersonData cDataSource(String cDataSource) {
    
    this.cDataSource = cDataSource;
    return this;
  }

   /**
   * Get cDataSource
   * @return cDataSource
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getcDataSource() {
    return cDataSource;
  }


  @JsonProperty(JSON_PROPERTY_C_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcDataSource(String cDataSource) {
    this.cDataSource = cDataSource;
  }


  public PersonData phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhone() {
    return phone;
  }


  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhone(String phone) {
    this.phone = phone;
  }


  public PersonData organization(String organization) {
    
    this.organization = organization;
    return this;
  }

   /**
   * Get organization
   * @return organization
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORGANIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrganization() {
    return organization;
  }


  @JsonProperty(JSON_PROPERTY_ORGANIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrganization(String organization) {
    this.organization = organization;
  }


  public PersonData name(String name) {
    
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

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public PersonData cIdentityNo1(String cIdentityNo1) {
    
    this.cIdentityNo1 = cIdentityNo1;
    return this;
  }

   /**
   * Get cIdentityNo1
   * @return cIdentityNo1
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_IDENTITY_NO1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getcIdentityNo1() {
    return cIdentityNo1;
  }


  @JsonProperty(JSON_PROPERTY_C_IDENTITY_NO1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcIdentityNo1(String cIdentityNo1) {
    this.cIdentityNo1 = cIdentityNo1;
  }


  public PersonData customer(String customer) {
    
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomer() {
    return customer;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomer(String customer) {
    this.customer = customer;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonData personData = (PersonData) o;
    return Objects.equals(this.zipCode, personData.zipCode) &&
        Objects.equals(this.cDepartment, personData.cDepartment) &&
        Objects.equals(this.city, personData.city) &&
        Objects.equals(this.cDataSourceId, personData.cDataSourceId) &&
        Objects.equals(this.remark, personData.remark) &&
        Objects.equals(this.availability, personData.availability) &&
        Objects.equals(this.teamLeader, personData.teamLeader) &&
        Objects.equals(this.eMail, personData.eMail) &&
        Objects.equals(this.street, personData.street) &&
        Objects.equals(this.function, personData.function) &&
        Objects.equals(this.personalNo, personData.personalNo) &&
        Objects.equals(this.company, personData.company) &&
        Objects.equals(this.id, personData.id) &&
        Objects.equals(this.department, personData.department) &&
        Objects.equals(this.fax, personData.fax) &&
        Objects.equals(this.cDataSourceDeleted, personData.cDataSourceDeleted) &&
        Objects.equals(this.cIdentityType1, personData.cIdentityType1) &&
        Objects.equals(this.cIdentityNo2, personData.cIdentityNo2) &&
        Objects.equals(this.cIdentityType2, personData.cIdentityType2) &&
        Objects.equals(this.costCenter, personData.costCenter) &&
        Objects.equals(this.mobile, personData.mobile) &&
        Objects.equals(this.elid, personData.elid) &&
        Objects.equals(this.firstName, personData.firstName) &&
        Objects.equals(this.cDataSource, personData.cDataSource) &&
        Objects.equals(this.phone, personData.phone) &&
        Objects.equals(this.organization, personData.organization) &&
        Objects.equals(this.name, personData.name) &&
        Objects.equals(this.cIdentityNo1, personData.cIdentityNo1) &&
        Objects.equals(this.customer, personData.customer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zipCode, cDepartment, city, cDataSourceId, remark, availability, teamLeader, eMail, street, function, personalNo, company, id, department, fax, cDataSourceDeleted, cIdentityType1, cIdentityNo2, cIdentityType2, costCenter, mobile, elid, firstName, cDataSource, phone, organization, name, cIdentityNo1, customer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonData {\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    cDepartment: ").append(toIndentedString(cDepartment)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    cDataSourceId: ").append(toIndentedString(cDataSourceId)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    teamLeader: ").append(toIndentedString(teamLeader)).append("\n");
    sb.append("    eMail: ").append(toIndentedString(eMail)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
    sb.append("    personalNo: ").append(toIndentedString(personalNo)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    cDataSourceDeleted: ").append(toIndentedString(cDataSourceDeleted)).append("\n");
    sb.append("    cIdentityType1: ").append(toIndentedString(cIdentityType1)).append("\n");
    sb.append("    cIdentityNo2: ").append(toIndentedString(cIdentityNo2)).append("\n");
    sb.append("    cIdentityType2: ").append(toIndentedString(cIdentityType2)).append("\n");
    sb.append("    costCenter: ").append(toIndentedString(costCenter)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    cDataSource: ").append(toIndentedString(cDataSource)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    cIdentityNo1: ").append(toIndentedString(cIdentityNo1)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
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
