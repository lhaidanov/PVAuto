package lesson7.org.lh.tests;

import lesson7.org.lh.app.Constants;
import lesson7.org.lh.webdriver.DriverHolder;
import lesson7.org.lh.webdriver.WebDriverEnum;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.IOException;


public class BaseTest {
//    line was commented, as we will not init driver anymore in this class
//    it was already init in class DriverHolder
//    protected static WebDriver driver = null;

    @BeforeSuite(alwaysRun = true)
    public void beforeSuite() throws IOException {
        DriverHolder.getInstance().initDriver(WebDriverEnum.CHROME_DRIVER_FOR_DOWNLOADS);
        FileUtils.cleanDirectory(Constants.screenshotsFolder);
//        driver = WebDriverFactory.initDriver(WebDriverEnum.CHROME);
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite() {
        if (DriverHolder.getInstance().getDriver() != null) {
            DriverHolder.getInstance().getDriver().quit();
        }
    }

    // was moved to listeners
    /*
    @AfterMethod(alwaysRun = true)
    public void afterMethod(ITestResult iTestResult) {
        if (!iTestResult.isSuccess()) {
            File screenShot = ((TakesScreenshot) DriverHolder.getInstance().getDriver())
                    .getScreenshotAs(OutputType.FILE);
            File distFile;
            distFile = new File(Constants.screenshotsFolder, iTestResult.getName() + ".png");
            try {
                FileUtils.copyFile(screenShot, distFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
*/
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
