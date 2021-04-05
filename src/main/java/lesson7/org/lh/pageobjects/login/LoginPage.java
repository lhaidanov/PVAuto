package lesson7.org.lh.pageobjects.login;

import lesson7.org.lh.pageobjects.BasePage;
import lesson7.org.lh.webdriver.DriverHolder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

    @FindBy(id = "username")
    private WebElement userNameInput;

    @FindBy(id = "password")
    private WebElement userPassInput;

    @FindBy(css = "button.radius")
    private WebElement submitButton;

    @FindBy(css = ".flash.success")
    private WebElement successBanner;

    @FindBy(css = ".flash.error")
    private WebElement errorBanner;

    @FindBy(tagName = "h2")
    private WebElement header;


    public LoginPage inputName(String name) {
        userNameInput.sendKeys(name);
        return this;
    }

    public LoginPage inputPass(String pass) {
        userPassInput.sendKeys(pass);
        return this;
    }

    public AfterLoginPage successLogin(String userName, String userPass) {
        inputName(userName)
                .inputPass(userPass)
                .submitButton.click();
        return new AfterLoginPage();
    }

    public LoginPage unSuccessLogin(String userName, String userPass) {
        inputName(userName)
                .inputPass(userPass)
                .submitButton.click();
        return new LoginPage();
    }

    public boolean isSuccessBannerVisible() {
        return successBanner.isDisplayed();
    }

    public boolean isErrorBannerVisible() {
        return errorBanner.isDisplayed();
    }

    public String getHeaderText() {
        return header.getText();
    }


    public LoginPage waitTillPageLoaded() {
        new WebDriverWait(DriverHolder.getInstance().getDriver(),20)
                .until(ExpectedConditions
                        .visibilityOfAllElements(
                                submitButton,
                                header)
                );
        return new LoginPage();
    }


}
