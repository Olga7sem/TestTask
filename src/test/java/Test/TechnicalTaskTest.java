package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import PageElements.HomePage;

import java.time.Duration;

public class TechnicalTaskTest extends TestInit {
    @Test
    public void Check() {
        HomePage homePage = new HomePage(driver);
        goToReactApp();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//select[contains(@class,'Select')]")));

        homePage.getSettingSelection().click();
        homePage.getClickEasy().click();
        homePage.getStart().click();
        homePage.checkTableSize(5);

        String blueColor = "rgba(70, 130, 180, 1)";

        moveCursor(homePage.getMoveCursor());
        homePage.getMoveCursor().getCssValue("color");
        Assert.assertEquals(homePage.getBackgroundColorOfSquare(), blueColor);
        Assert.assertTrue(homePage.getCheckBlue().isDisplayed());
        moveCursor(homePage.getMoveCursor());
        Assert.assertTrue(homePage.getCheckNoColor().isDisplayed());
        Assert.assertTrue(homePage.getCheckHoverSquares().isDisplayed());
    }
}


