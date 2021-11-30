package pages;

import modals.AccountModal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountsPage extends BasePage {

    final By NEW_BUTTON = By.cssSelector("a[title=New]");
    final By DETAILS_TAB = By.xpath("//div[contains(@class,'active')]//*[@id='detailTab__item']");
    final By SUCCESS_MESSAGE = By.xpath("//div[@class='forceVisualMessageQueue']//*[contains(@class,'slds-theme--succes')]");

    public AccountsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return false;
    }

    @Override
    public AccountsPage open() {
        driver.get(BASE_URL + "/lightning/o/Account/list");
        return this;
    }

    public AccountModal clickNewButton() {
        driver.findElement(NEW_BUTTON).click();
        return new AccountModal(driver);
    }

    public AccountDetailsPage openDetailsTab() {
        driver.findElement(DETAILS_TAB).click();
        return new AccountDetailsPage(driver);
    }
    public boolean notificationMessage() {
        WebElement successMessage = driver.findElement(SUCCESS_MESSAGE);
        return successMessage.isDisplayed();
    }

}

