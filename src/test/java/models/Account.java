package models;

import enums.AccountIndustry;
import enums.AccountType;

import java.util.Objects;

public class Account {

    private String accountName;
    private String phone;
    private String parentAccount;
    private String fax;
    private String website;
    private AccountType type;
    private AccountIndustry industry;
    private String employees;
    private String annualRevenue;
    private String billingStreet;
    private String shippingStreet;
    private String billingCity;
    private String shippingCity;
    private String billingStateProvince;
    private String shippingStateProvince;
    private String billingZipPostalCode;
    private String shippingZipPostalCode;
    private String billingCountry;
    private String shippingCountry;
    private String description;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(accountName, account.accountName) && Objects.equals(phone, account.phone) && Objects.equals(parentAccount, account.parentAccount) && Objects.equals(fax, account.fax) && Objects.equals(website, account.website) && type == account.type && industry == account.industry && Objects.equals(employees, account.employees) && Objects.equals(annualRevenue, account.annualRevenue) && Objects.equals(billingStreet, account.billingStreet) && Objects.equals(shippingStreet, account.shippingStreet) && Objects.equals(billingCity, account.billingCity) && Objects.equals(shippingCity, account.shippingCity) && Objects.equals(billingStateProvince, account.billingStateProvince) && Objects.equals(shippingStateProvince, account.shippingStateProvince) && Objects.equals(billingZipPostalCode, account.billingZipPostalCode) && Objects.equals(shippingZipPostalCode, account.shippingZipPostalCode) && Objects.equals(billingCountry, account.billingCountry) && Objects.equals(shippingCountry, account.shippingCountry) && Objects.equals(description, account.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountName, phone, parentAccount, fax, website, type, industry, employees, annualRevenue, billingStreet, shippingStreet, billingCity, shippingCity, billingStateProvince, shippingStateProvince, billingZipPostalCode, shippingZipPostalCode, billingCountry, shippingCountry, description);
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getParentAccount() {
        return parentAccount;
    }

    public void setParentAccount(String parentAccount) {
        this.parentAccount = parentAccount;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public AccountIndustry getIndustry() {
        return industry;
    }

    public void setIndustry(AccountIndustry industry) {
        this.industry = industry;
    }

    public String getEmployees() {
        return employees;
    }

    public void setEmployees(String employees) {
        this.employees = employees;
    }

    public String getAnnualRevenue() {
        return annualRevenue;
    }

    public void setAnnualRevenue(String annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    public String getBillingStreet() {
        return billingStreet;
    }

    public void setBillingStreet(String billingStreet) {
        this.billingStreet = billingStreet;
    }

    public String getShippingStreet() {
        return shippingStreet;
    }

    public void setShippingStreet(String shippingStreet) {
        this.shippingStreet = shippingStreet;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    public String getShippingCity() {
        return shippingCity;
    }

    public void setShippingCity(String shippingCity) {
        this.shippingCity = shippingCity;
    }

    public String getBillingStateProvince() {
        return billingStateProvince;
    }

    public void setBillingStateProvince(String billingStateProvince) {
        this.billingStateProvince = billingStateProvince;
    }

    public String getShippingStateProvince() {
        return shippingStateProvince;
    }

    public void setShippingStateProvince(String shippingStateProvince) {
        this.shippingStateProvince = shippingStateProvince;
    }

    public String getBillingZipPostalCode() {
        return billingZipPostalCode;
    }

    public void setBillingZipPostalCode(String billingZipPostalCode) {
        this.billingZipPostalCode = billingZipPostalCode;
    }

    public String getShippingZipPostalCode() {
        return shippingZipPostalCode;
    }

    public void setShippingZipPostalCode(String shippingZipPostalCode) {
        this.shippingZipPostalCode = shippingZipPostalCode;
    }

    public String getBillingCountry() {
        return billingCountry;
    }

    public void setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry;
    }

    public String getShippingCountry() {
        return shippingCountry;
    }

    public void setShippingCountry(String shippingCountry) {
        this.shippingCountry = shippingCountry;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
