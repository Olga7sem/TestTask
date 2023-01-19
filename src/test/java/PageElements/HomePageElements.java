package PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Pages.BasePage;

import java.util.List;

public class HomePageElements extends BasePage {
    public HomePageElements(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getRowFromTable() {
        return driver.findElements(By.xpath("//tr"));
    }

    public List<WebElement> getCellsFromRow(String rowNumber) {
        return driver.findElements(By.xpath(String.format("//tr[%s]//td", rowNumber)));
    }

    public WebElement getSettingSelection() {
        return driver.findElement(By.xpath("//select[contains(@class,'Select')]"));
    }

    public WebElement getClickEasy() {
        return driver.findElement(By.xpath(("//option[@value='Easy']")));
    }

    public WebElement getStart() {
        return driver.findElement(By.xpath(("//button[@class='Button_btn__sIYYr']")));
    }

    public WebElement getMoveCursor() {
        return driver.findElement(By.xpath(("//td[contains(@class,'FieldItem_squareItem')][1]")));
    }

    public WebElement getCheckBlue() {
        return driver.findElement(By.xpath(("//td[@class='FieldItem_squareItem__vIzI6 FieldItem_squareItemBlue__OvFhF']")));

    }

    public WebElement getCheckNoColor() {
        return driver.findElement(By.xpath(("//td[@class='FieldItem_squareItem__vIzI6 '][1]")));
    }

    public WebElement getCheckHoverSquares() {
        return driver.findElement(By.xpath(("(//p[text()='row 1 col 1'])")));

    }
}