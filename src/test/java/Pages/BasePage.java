package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getBackgroundColor(WebElement element) {
        return element.getCssValue("background-color");
    }
}
