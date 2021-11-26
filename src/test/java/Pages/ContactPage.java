package Pages;


import org.openqa.selenium.WebDriver;

public abstract class ContactPage extends BasePage {

    public ContactPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return false;
    }

    @Override
    public BasePage open() {
        driver.get(BASE_URL + "/lightning/o/Account/list?filterName=Recent");
        return this;
    }

    @Override
    public void clickNew() {

    }
}
