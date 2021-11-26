package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class HomePage extends BasePage {

    final static By SALES_LABEL = By.xpath("//*[@title='Sales']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return isElementPresent();
    }

    @Override
    public BasePage open() {
        driver.get(BASE_URL);
        return this;
    }
}
