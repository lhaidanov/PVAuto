package lesson7.org.lh.tests;

import lesson7.org.lh.webdriver.WebDriverEnum;
import lesson7.org.lh.webdriver.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    protected static WebDriver driver = null;

    @BeforeSuite(alwaysRun = true)
    public void beforeSuite() {
        driver = WebDriverFactory.initDriver(WebDriverEnum.CHROME);
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite(){
        if (driver !=null){
            driver.quit();
        }
    }

    protected void goToUrl(String url){
        driver.get(url);
    }

    protected String getHeaderText(){
        return driver.findElement(By.cssSelector("#content h3")).getText();
    }

    protected WebElement getElement(By element){
        return driver.findElement(element);
    }
    protected void closeCurrentWindow(){
        driver.close();
    }
}
