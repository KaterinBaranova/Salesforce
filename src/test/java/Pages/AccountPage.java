package Pages;

import Elements.Input;
import Models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class AccountPage extends BasePage{

    public AccountPage(WebDriver driver) {
        super(driver);

    }

    @Override
    public boolean isPageOpened() {
        return false;
    }

    @Override
    public BasePage open() {
        return null;
    }

    public void clickNew() {
        driver.findElement(By.cssSelector("[title=New]")).click();
    }


    public static void createAccount(Account account) {
        new Input(driver, "Account Name").write(account.getAccountName());
        new Input(driver, "Phone").write(account.getPhone());
        new Input(driver, "Fax").write(account.getFax());
        new Input(driver, "Website").write(account.getWebSite());
        new Input(driver, "Employees").write(account.getEmployees());
        new Input(driver, "Annual Revenue").write(account.getAnnualRevenue());
        new Input(driver, "Billing State/Province").write(account.getBillingStateProvince());
        new Input(driver, "Billing City").write(account.getBillingCity());
        new Input(driver, "Shipping City").write(account.getShippingCity());
        new Input(driver, "Shipping State/Province").write(account.getShippingStateProvince());
        new Input(driver, "Billing Zip/Postal Code").write(account.getBillingZipPostalCode());
        new Input(driver, "Billing Country").write(account.getBillingCountry());
        new Input(driver, "Shipping Zip/Postal Code").write(account.getShippingZipPostalCode());
        new Input(driver, "Shipping Country").write(account.getShippingCountry());

    }

    public void clickSave() {
        driver.findElement(By.xpath("//button[@title='Save']")).click();
    }
}





