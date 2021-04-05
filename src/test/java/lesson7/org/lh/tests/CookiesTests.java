package lesson7.org.lh.tests;

import lesson7.org.lh.app.Constants;
import lesson7.org.lh.webdriver.DriverHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Set;

public class CookiesTests extends BaseTest {
    WebDriver driver = DriverHolder.getInstance().getDriver();
    private String userName = "tomsmith";
    private String userPass = "SuperSecretPassword!";

    @BeforeClass
    public void beforeCookiesTestsClass() {
        goToUrl(Constants.LOGIN_FORM);
    }

    @Test
    public void printCookies() {
        login(userName, userPass);
        sleep(3);
        printAllCookies();
    }


    @Test
    public void addRemoveCookies() {
        login(userName, userPass);
        sleep(3);
        Cookie cookie = new Cookie("MyCookie", "MyCookie");


        driver.manage().addCookie(cookie);
        printAllCookies();

        driver.manage().deleteCookieNamed(cookie.getName());
        printAllCookies();
    }

    @Test
    public void deleteAllCoolies(){
        login(userName,userPass);
        sleep(3);
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();
        sleep(3);
        Assert.assertTrue(getElement(By.id("username")).isDisplayed());
        Assert.assertTrue(getElement(By.id("password")).isDisplayed());
        WebElement element = getElement(By.cssSelector(".flash.error"));
        Assert.assertTrue(element.getText().
                contains("You must login to view the secure area!"));

    }


    private void login(String userName, String password) {
        getElement(By.id("username")).sendKeys(userName);
        getElement(By.id("password")).sendKeys(password);
        getElement(By.id("password")).submit();
    }

    protected void sleep(long secs) {
        try {
            Thread.sleep(secs * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private void printAllCookies() {
        Set<Cookie> cookies = driver.manage().getCookies();
        for (Cookie cookie : cookies) {
            System.out.println(cookie.getName() + "==>" + cookie.getValue());
        }

    }
}
