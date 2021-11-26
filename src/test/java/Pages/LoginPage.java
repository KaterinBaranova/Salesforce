package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    final static By EMAIL_INPUT = By.id("username");
    final static By PASSWORD_INPUT = By.id("password");
    final static By LOGIN_BUTTON = By.id("Login");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return false;
    }

    @Override
    public BasePage open() {
        driver.get(BASE_URL);
        return this;
    }

    @Override
    public void clickNew() {

    }

    public HomePage login(String email, String password) {
        driver.findElement(EMAIL_INPUT).sendKeys(email);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();
        return new HomePage(driver) {
            @Override
            public void clickNew() {

            }

            @Override
            public BasePage login(String username, String password) {
                return null;
            }
        };
    }
}
