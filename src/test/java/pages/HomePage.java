package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    final static By SALES_LABEL = By.xpath("//*[@title='Sales']");
    final static By ACCOUNTS_MENU_LINK = By.xpath("//*[@title='Accounts']");


    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return isElementPresent(SALES_LABEL);
    }

    @Override
    public HomePage open() {
        driver.get(BASE_URL);
        return this;
    }

    public AccountsPage clickAccountMenuLink() {
        jsClick(driver.findElement(ACCOUNTS_MENU_LINK));
        return new AccountsPage(driver);
    }
}
