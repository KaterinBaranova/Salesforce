package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class TextArea extends BaseElement{


    public TextArea(WebDriver driver, String label) {
        super(driver, label);
    }

    public String write() {
        String textAreaLocator = "//*[contains(text(), '%s')]/ancestor::div[contains(@class, 'uiInput')]//textarea";
        driver.findElement(By.xpath(String.format(textAreaLocator, label))).sendKeys(textAreaLocator);
        return textAreaLocator;
    }
}

