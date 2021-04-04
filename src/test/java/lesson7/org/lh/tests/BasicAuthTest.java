package lesson7.org.lh.tests;

import lesson7.org.lh.app.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicAuthTest extends BaseTest{

    @Test
    public void basicAuthTest (){
        goToUrl("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        Assert.assertEquals(getHeaderText(),"Basic Auth");


    }

}
