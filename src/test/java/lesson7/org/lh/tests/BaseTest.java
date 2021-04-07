package lesson7.org.lh.tests;

import lesson7.org.lh.webdriver.DriverHolder;
import lesson7.org.lh.webdriver.WebDriverEnum;
import lesson7.org.lh.webdriver.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
//    line was commented, as we will not init driver anymore in this class
//    it was already init in class DriverHolder
//    protected static WebDriver driver = null;

    @BeforeSuite(alwaysRun = true)
    public void beforeSuite() {
        DriverHolder.getInstance().initDriver(WebDriverEnum.CHROME_DRIVER_FOR_DOWNLOADS);
//        driver = WebDriverFactory.initDriver(WebDriverEnum.CHROME);
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite() {
        if (DriverHolder.getInstance().getDriver() != null) {
            DriverHolder.getInstance().getDriver().quit();
        }
    }

    protected void goToUrl(String url) {
        DriverHolder.getInstance().getDriver().get(url);
    }

    protected String getHeaderText() {
        return DriverHolder.getInstance().getDriver().findElement(By.cssSelector("#content h3")).getText();
    }

    protected WebElement getElement(By element) {
        return DriverHolder.getInstance().getDriver().findElement(element);
    }

    protected void closeCurrentWindow() {
        DriverHolder.getInstance().getDriver().close();
    }
}
