package modals;

import elements.Dropdown;
import elements.Input;
import elements.TextArea;
import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AccountsPage;

public class AccountModal extends BaseModal {

    final static By SAVE_BUTTON = By.cssSelector("button[title=Save]");
    private final static By ACCOUNT_INFORMATION = By.xpath("//span[text()='Account Information']");


    public AccountModal(WebDriver driver) {
        super(driver);
    }

    public AccountModal fillForm(Account account) {
        if (account.getAccountName() != null) {
            new Input(driver, "Account Name").write(account.getAccountName());
        }
        new Input(driver, "Phone").write(account.getPhone());
        new Input(driver, "Parent Account").write(account.getParentAccount());
        new Input(driver, "Fax").write(account.getFax());
        new Input(driver, "Website").write(account.getWebsite());
        new Dropdown(driver, "Type").selectOption(account.getType().getText());
        new Dropdown(driver, "Industry").selectOption(account.getIndustry().getName());
        new Input(driver, "Employees").write(account.getEmployees());
        new Input(driver, "Annual Revenue").write(account.getAnnualRevenue());
        new TextArea(driver, "Description").write();
        new TextArea(driver, "Billing Street").write();
        new TextArea(driver, "Shipping Street").write();
        new Input(driver, "Billing City").write(account.getBillingCity());
        new Input(driver, "Shipping City").write(account.getShippingCity());
        new Input(driver, "Billing State/Province").write(account.getBillingStateProvince());
        new Input(driver, "Shipping State/Province").write(account.getShippingStateProvince());
        new Input(driver, "Billing Zip/Postal Code").write(account.getBillingZipPostalCode());
        new Input(driver, "Shipping Zip/Postal Code").write(account.getShippingZipPostalCode());
        new Input(driver, "Billing Country").write(account.getBillingCountry());
        new Input(driver, "Shipping Country").write(account.getShippingCountry());
        return this;

    }

    public AccountsPage clickSaveButton() {
        driver.findElement(SAVE_BUTTON).click();
        return new AccountsPage(driver);
    }
    public void waitUntilElementVisible() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(ACCOUNT_INFORMATION));
    }

}
