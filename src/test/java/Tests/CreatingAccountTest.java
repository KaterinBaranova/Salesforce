package Tests;

import Models.Account;
import Pages.AccountPage;
import Pages.ContactPage;
import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class CreatingAccountTest extends BaseTest{

    protected Account account;
    protected AccountPage accountPage;
    protected LoginPage loginPage;
    protected ContactPage contactPage;

    @Test
    public void createAccount() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        loginPage.open().login(USERNAME,PASSWORD).isPageOpened();
        /*wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("span[title=Sales]")));*/
        contactPage.open().clickNew();
        AccountPage.createAccount(account);
        accountPage.clickSave();
        String addNewAccount = driver.findElement(By.xpath("//a[@aria-controls='tab-3']")).getText();
        assertEquals(addNewAccount, "Details", "Account didn't add");

    }
}
