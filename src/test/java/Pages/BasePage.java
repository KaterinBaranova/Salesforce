package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public abstract class BasePage {

    protected final static String BASE_URL = "https://tms-1d.lightning.force.com/";

    static WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public abstract boolean isPageOpened();

    protected boolean isElementPresent() {
        try {
            driver.findElement(HomePage.SALES_LABEL);
            return true;
        } catch (NoSuchElementException exception) {
            System.out.println(exception.getMessage());
            return false;
        }
    }

    public abstract BasePage open();

    public abstract void clickNew();

    public abstract BasePage login(String username, String password);
}


