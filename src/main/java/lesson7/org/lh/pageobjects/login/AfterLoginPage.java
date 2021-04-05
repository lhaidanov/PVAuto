package lesson7.org.lh.pageobjects.login;

import lesson7.org.lh.webdriver.DriverHolder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AfterLoginPage {


    @FindBy(css = ".flash.success")
    private WebElement successBanner;

    @FindBy(tagName = "h2")
    private WebElement header;

    @FindBy(css = "a.radius")
    private WebElement logoutButton;

    public AfterLoginPage () {
        PageFactory.initElements(DriverHolder.getInstance().getDriver(),this);
    }

    public LoginPage logout() {
        logoutButton.click();
        return new LoginPage();
    }

    public boolean isSuccessBannerVisible() {
        return successBanner.isDisplayed();
    }

    public String getHeaderText() {
        return header.getText();
    }

    public AfterLoginPage waitTillPageLoaded() {
        new WebDriverWait(DriverHolder.getInstance().getDriver(),20)
                .until(ExpectedConditions
                .visibilityOfAllElements(
                        logoutButton,
                        successBanner,
                        header)
                );
        return new AfterLoginPage();
    }


}
