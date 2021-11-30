package test;


import enums.AccountIndustry;
import enums.AccountType;
import modals.AccountModal;
import models.Account;
import models.AccountBuilder;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AccountDetailsPage;
import pages.AccountsPage;
import pages.HomePage;

import static org.testng.Assert.*;


public class CreateAccountTest extends test.BaseTest {

    HomePage homePage;
    AccountsPage accountsPage;
    AccountDetailsPage accountDetailsPage;
    AccountModal accountModal;


    @BeforeClass
    public void initializePages() {
        homePage = new HomePage(driver);
        accountsPage = new AccountsPage(driver);
        accountDetailsPage = new AccountDetailsPage(driver);
        accountModal = new AccountModal(driver);

    }

    @Test
    public void createAccountWithAllData() {
        Account testAccount = new AccountBuilder()
                .withAccountName("My Account")
                .withPhone("+375297076690")
                .withParentAccount("MyAccount")
                .withFax("80293847539")
                .withWebsite("website")
                .withType(AccountType.CUSTOMER)
                .withIndustry(AccountIndustry.UTILITIES)
                .withEmployees("2500")
                .withAnnualRevenue("37500")
                .withBillingStreet("351-353 Getty Ave")
                .withShippingStreet("123 Melrose")
                .withBillingCity("New York")
                .withShippingCity("Bronex")
                .withBillingStateProvince("1223")
                .withShippingStateProvince("4322")
                .withBillingZipPostalCode("100200")
                .withShippingZipPostalCode("988399")
                .withBillingCountry("USA")
                .withShippingCountry("USA")
                .withDescription("1223qwerty")
                .build();
        boolean isloggedIn = loginPage.open().login(USERNAME, PASSWORD).isPageOpened();
        assertTrue(isloggedIn);
        boolean isHomePageOpened = homePage.open().isPageOpened();
        assertTrue(isHomePageOpened);
        homePage.clickAccountMenuLink()
                .clickNewButton();
        accountModal.waitUntilElementVisible();
        accountModal.fillForm(testAccount)
                .clickSaveButton();
        assertTrue(accountsPage.notificationMessage());
        accountDetailsPage.waitUntilElementVisible();
        Account actualAccountDetailsInfo = accountsPage.openDetailsTab()
                .getAccountDetailsInfo();
        assertEquals(actualAccountDetailsInfo, testAccount, "Account details don't match test account data");
    }
}


