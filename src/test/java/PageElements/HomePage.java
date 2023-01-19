package PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class HomePage extends HomePageElements {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    HomePageElements homePageElements = new HomePageElements(driver);

    public void checkTableSize(int expectedTableSize) {
        List<WebElement> rows = getRowFromTable();
        Assert.assertEquals(rows.size(), expectedTableSize);
        for (int i = 1; i < expectedTableSize; i++) {
            List<WebElement> cells = getCellsFromRow(String.valueOf(i));
            Assert.assertEquals(cells.size(), expectedTableSize);
        }
    }
    public String getBackgroundColorOfSquare() {
        return getBackgroundColor(getMoveCursor());
    }
}
