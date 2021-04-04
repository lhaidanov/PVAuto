package lesson7.org.lh.tests;

import lesson7.org.lh.app.Constants;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AlertsTests extends BaseTest{

    @BeforeClass
    public void beforeAlertsTestsClass(){
        goToUrl(Constants.ALERTS_PAGE);
    }

    @Test
    public void clickFoJSAlert() {
        clickAlertButtonAndOpenAlert();
        Assert.assertEquals(getTextFromAlertAndCloseIt(true),"I am a JS Alert");
        checkResultText("You successfully clicked an alert");
    }

    @Test
    public void clickFoJSAlertWithJS() {
        clickAlertButtonAndOpenAlertWithJS();
        Assert.assertEquals(getTextFromAlertAndCloseIt(true),"I am a JS Alert");
        checkResultText("You successfully clicked an alert");
    }

    @Test
    public void clickFoJSConfirmOk() {
        clickConfirmButton();
        Assert.assertEquals(getTextFromAlertAndCloseIt(true),"I am a JS Confirm");
        checkResultText("You clicked: Ok");
    }

    @Test
    public void clickFoJSConfirmDismiss(){
        clickConfirmButton();
        Assert.assertEquals(getTextFromAlertAndCloseIt(false),"I am a JS Confirm");
        checkResultText("You clicked: Cancel");
    }

    @Test
    public void clickFoJSPrompt(){
        clickPromptButton();
        Assert.assertEquals(getTextFromAlertAndCloseIt(true),"I am a JS prompt");
        checkResultText("You entered:");
    }


    private String getTextFromAlertAndCloseIt(boolean accept){
//        manage alert. Take the text
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();

//        close popup
        if (accept) {
            alert.accept();
        } else {
            alert.dismiss();
        }
//        switch to  default content (if was not already switched)
        driver.switchTo().defaultContent();
        return alertText;
    }

    private void checkResultText(String expectedText){
        String text = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(text,expectedText);

    }

    public void clickAlertButtonAndOpenAlert() {
        clickButton("Click for JS Alert");
    }

    public void clickAlertButtonAndOpenAlertWithJS() {
//        ((JavascriptExecutor)driver).executeScript("return jsAlert();");
        clickButtonWithJS("Click for JS Alert");
    }

    public void clickConfirmButton(){
        clickButton("Click for JS Confirm");
    }

    public void clickPromptButton(){
        clickButton("Click for JS Prompt");
    }


    public void clickButton(String buttonText){
        String buttonXPATH = String.format("//button[text()='%s']", buttonText);
        driver.findElement(By.xpath(buttonXPATH)).click();

    }

    public void clickButtonWithJS(String buttonText){
        String buttonXPATH = String.format("//button[text()='%s']", buttonText);
        WebElement element = driver.findElement(By.xpath(buttonXPATH));
        ((JavascriptExecutor)driver).executeScript("return arguments[0].click();",element);
    }

}
