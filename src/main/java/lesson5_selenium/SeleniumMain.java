package lesson5_selenium;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import javafx.scene.input.InputMethodTextRun;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.Locale;

import static com.codeborne.selenide.Selenide.*;

public class SeleniumMain {
    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver","c:\\drivers\\chromedriver.exe"); /*if do not declare path to the driver, it will be tried to search it only incite of current project*/

//        WebDriverManager.chromedriver().forceDownload().setup();
//        WebDriver driver = new ChromeDriver();
//        WebDriverManager.firefoxdriver().setup();
//        WebDriver driver = new FirefoxDriver();
//
//        driver.manage().window().maximize();
//        driver.get("https://www.google.com/");
//
//        WebElement searchInputElement = driver.findElement(By.xpath("//input[@name='q']"));
//
//        String searchParameter = "provectus odessa";
//        searchInputElement.sendKeys(searchParameter, Keys.ENTER);
//        sleep(3_000);
//
//        List<WebElement> foundElements = driver.findElements(By.xpath("//a/h3"));
//
//        for (WebElement element:foundElements){
//          if (element.getText().toLowerCase().contains("provectus")) {
//              System.out.println(element.getText()+ "does not contain word \"provectus\"");
//            }
//        }
//
//        driver.quit();

        Configuration.timeout = 10000;
        Configuration.startMaximized = true;

        open("https://www.google.com/");
        String searchParameter = "provectus odessa";
        $("[name=q]").setValue(searchParameter).pressEnter();
        List<String> texts = $$x("//a/h3").texts();
        for (String text:texts) {
            if (text.toLowerCase().contains("provectus")) {
                System.out.println(text + "does not contain word \"provectus\"");
            }
        }
    }



    private static void sleep(long timeout) {
        try {
            Thread.sleep(timeout);
        }catch (InterruptedException e){
            e.printStackTrace();
        }


    }
}
