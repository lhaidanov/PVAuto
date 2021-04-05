package lesson7.org.lh.tests;

import lesson7.org.lh.app.Constants;
import lesson7.org.lh.webdriver.DriverHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HoverTests extends BaseTest {
    WebDriver driver = DriverHolder.getInstance().getDriver();
    @BeforeClass
    public void beforeHoverTestsClass() {
        goToUrl(Constants.HOVER_PAGE);
    }


    @Test
    public void hoverTest() {
        List<WebElement> elements = driver.findElements(By.cssSelector(".figure"));
        Actions actions = new Actions(driver);
        for (int i = 0; i < elements.size(); i++) {
            actions.moveToElement(elements.get(i)).build().perform();
            String text = elements.get(i).findElement(By.cssSelector(".figcaption > h5")).getText();
            Assert.assertEquals(text, "name: user" + (i + 1));

        }


    }
}
