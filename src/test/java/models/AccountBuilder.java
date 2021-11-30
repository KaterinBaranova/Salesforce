package models;

import enums.*;

public class AccountBuilder {
    private Account account = new Account();

    public AccountBuilder withAccountName(String accountName) {
        account.setAccountName(accountName);
        return this;
    }

    public AccountBuilder withWebsite(String website) {
        account.setWebsite(website);
        return this;
    }

    public AccountBuilder withPhone(String phone) {
        account.setPhone(phone);
        return this;
    }

    public AccountBuilder withParentAccount(String parentAccount) {
        account.setParentAccount(parentAccount);
        return this;
    }

    public AccountBuilder withIndustry(AccountIndustry industry) {
        account.setIndustry(industry);
        return this;
    }

    public AccountBuilder withType(AccountType type) {
        account.setType(type);
        return this;
    }

    public AccountBuilder withFax(String fax) {
        account.setFax(fax);
        return this;
    }

    public AccountBuilder withEmployees(String employees) {
        account.setEmployees(employees);
        return this;
    }

    public AccountBuilder withAnnualRevenue(String annualRevenue) {
        account.setAnnualRevenue(annualRevenue);
        return this;
    }

    public AccountBuilder withBillingStreet(String billingStreet) {
        account.setBillingStreet(billingStreet);
        return this;
    }

    public AccountBuilder withShippingStreet(String shippingStreet) {
        account.setShippingStreet(shippingStreet);
        return this;
    }

    public AccountBuilder withBillingCity(String billingCity) {
        account.setBillingCity(billingCity);
        return this;
    }

    public AccountBuilder withBillingStateProvince(String billingStateProvince) {
        account.setBillingStateProvince(billingStateProvince);
        return this;
    }

    public AccountBuilder withShippingCity(String shippingCity) {
        account.setShippingCity(shippingCity);
        return this;
    }

    public AccountBuilder withShippingStateProvince(String shippingStateProvince) {
        account.setShippingStateProvince(shippingStateProvince);
        return this;
    }

    public AccountBuilder withBillingZipPostalCode(String billingZipPostalCode) {
        account.setBillingZipPostalCode(billingZipPostalCode);
        return this;
    }

    public AccountBuilder withBillingCountry(String billingCountry) {
        account.setBillingCountry(billingCountry);
        return this;
    }

    public AccountBuilder withShippingZipPostalCode(String shippingZipPostalCode) {
        account.setShippingZipPostalCode(shippingZipPostalCode);
        return this;
    }

    public AccountBuilder withShippingCountry(String shippingCountry) {
        account.setShippingCountry(shippingCountry);
        return this;
    }

    public AccountBuilder withDescription(String description) {
        account.setDescription(description);
        return this;
    }

    public Account build() {
        return this.account;
    }
}
