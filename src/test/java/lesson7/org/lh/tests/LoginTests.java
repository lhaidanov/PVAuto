package lesson7.org.lh.tests;

import lesson7.org.lh.app.Constants;
import lesson7.org.lh.pageobjects.login.AfterLoginPage;
import lesson7.org.lh.pageobjects.login.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {
    private String userName = "tomsmith";
    private String userPass = "SuperSecretPassword!";


    @BeforeClass
    public void beforeLoginTestsClass(){
        goToUrl(Constants.LOGIN_FORM);
    }

    @Test
    public void loginLogoutTest(){
        AfterLoginPage afterLoginPage =
                new LoginPage()
                .successLogin(userName, userPass)
                .waitTillPageLoaded();

        Assert.assertEquals(afterLoginPage.getHeaderText(),"Secure Area");
        LoginPage logoutPage =
                afterLoginPage
                        .logout();
        Assert.assertEquals(logoutPage.getHeaderText(),"Login Page");

    }
}
