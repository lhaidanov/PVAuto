package lesson7.org.lh.tests;

import lesson7.org.lh.app.Constants;
import lesson7.org.lh.webdriver.DriverHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowsTests extends BaseTest {
    WebDriver driver;

    @BeforeMethod
    public void beforeWindowsTestClass() {
        goToUrl(Constants.WINDOWS_PAGE);
        driver = DriverHolder.getInstance().getDriver();

    }

    @Test
    public void windowTest() {
        getElement(By.linkText("Click Here")).click();
        switchToLastWindow();
        // check it we really open needed window
        Assert.assertEquals(getElement(By.tagName("h3")).getText(), "New Window");
        closeCurrentWindow();
        switchToDefaultWindow();

        // Check if we really switched
        Assert.assertEquals(getHeaderText(), "Opening a new window");
        // check if we exist only one window (current window)
        Assert.assertEquals(getNumberOfOpenedWindows(), 1);
    }

    public void switchToLastWindow() {
        // list of the opened tabs in the browser
        Object[] handles = driver.getWindowHandles().toArray();
        // select the last tab - 1 and take the last element
        driver.switchTo().window(handles[handles.length - 1].toString());
    }

    public void switchToDefaultWindow(){
        // list of the opened tabs in the browser
        Object[] handles = driver.getWindowHandles().toArray();
        // so needs to select needed window again and than switch to default content
        driver.switchTo().window(handles[0].toString());
        driver.switchTo().defaultContent();
    }

    public int getNumberOfOpenedWindows(){
        return driver.getWindowHandles().size();
    }

}
