package lesson7.org.lh.tests;

import lesson7.org.lh.webdriver.DriverHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ActionsTests extends BaseTest{


    @Test
    public void sendKeysTest(){
        goToUrl("https://the-internet.herokuapp.com/forgot_password");
        WebElement email = getElement(By.id("email"));
        Actions actions = new Actions(DriverHolder.getInstance().getDriver());

        actions
                .sendKeys(email,"Testtext")
                .pause(Duration.ofSeconds(3))
                .keyDown(email, Keys.CONTROL)
                .sendKeys(email,"A")
                .keyUp(email,Keys.CONTROL)
                .pause(Duration.ofSeconds(3))
                .keyDown(email, Keys.CONTROL)
                .sendKeys(email,"C")
                .keyUp(email,Keys.CONTROL)
                .pause(Duration.ofSeconds(3))
                .sendKeys(Keys.DELETE)
                .pause(Duration.ofSeconds(3))
                .keyDown(email, Keys.CONTROL)
                .sendKeys(email,"V")
                .keyUp(email,Keys.CONTROL)
                .pause(Duration.ofSeconds(3))
                .build()
                .perform();

    }

    @Test
    public void dragAndDropTest(){
        goToUrl("http://www.pureexample.com/jquery-ui/basic-droppable.html");

//        WebDriverWait wait = new WebDriverWait(driver,15);
//        wait.until(ExpectedConditions
//                .visibilityOfAllElementsLocatedBy(By.cssSelector(".square.ui-draggable")));
        DriverHolder.getInstance().getDriver().switchTo().frame("ExampleFrame-94");

        WebElement draggableElement = getElement(By.cssSelector(".square.ui-draggable"));
        WebElement dragToElement = getElement(By.cssSelector(".squaredotted.ui-droppable"));



        Actions actions = new Actions(DriverHolder.getInstance().getDriver());
//        actions.dragAndDrop(draggableElement,dragToElement).build().perform();

        actions
                .moveToElement(draggableElement)
                .pause(Duration.ofSeconds(3))
                .clickAndHold()
                .pause(Duration.ofSeconds(3))
                .moveToElement(dragToElement,20,20)
                .pause(Duration.ofSeconds(3))
                .release()
                .pause(Duration.ofSeconds(3))
                .build()
                .perform();
        Assert.assertEquals(getElement(By.id("info")).getText(),"dropped!");

    }
}
