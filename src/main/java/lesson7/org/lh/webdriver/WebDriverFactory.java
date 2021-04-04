package lesson7.org.lh.webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import lesson7.org.lh.webdriver.WebDriverEnum;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    public static WebDriver initDriver (WebDriverEnum driverType){
        WebDriver driver;
        switch (driverType){
            case FIREFOX:{
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;

            }
            case CHROME:{
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            }
            default:
                throw new IllegalStateException("Unexpected value: " + driverType);
        }
        driver.manage().window().maximize();
        return driver;
    }
}
