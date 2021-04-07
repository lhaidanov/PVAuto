package lesson7.org.lh.webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import lesson7.org.lh.app.Constants;
import lesson7.org.lh.webdriver.WebDriverEnum;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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

            case CHROME_DRIVER_FOR_DOWNLOADS:

                // clean directory for download
                try {
                    FileUtils.cleanDirectory(Constants.downloadFolder);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                // say that we will use chromedriver
                WebDriverManager.chromedriver().setup();
                //fill map for preferences
                Map <String, Object> prefsMap = new HashMap<>();
                // option "0" means >> do not show dialog window "do you want to save file?"
                prefsMap.put("profile.default_content_settings.popups",0);
                prefsMap.put("download.default_directory",Constants.downloadFolder.getAbsolutePath());


                // "keys" for running chrome (there is official documentation for that keys)
                ChromeOptions option = new ChromeOptions();
                option.setExperimentalOption("prefs", prefsMap);
                option.addArguments("--test-type");
                //disable all extensions, if they was enabled by default
                option.addArguments("--disable-extensions");

                driver = new ChromeDriver(option);
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + driverType);
        }
        driver.manage().window().maximize();
        return driver;
    }
}
