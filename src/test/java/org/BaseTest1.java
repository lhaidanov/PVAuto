package org;

import org.testng.annotations.*;

public class BaseTest1 {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite" );
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite" );
    }

    @AfterMethod
    public void afterBaseClassMethod(){
        System.out.println("afterBaseClassMethod");
    }

    @BeforeTest
    @Parameters ("parameter1")
    public void beforeTest(String pare){
        System.out.println(pare);
    }

}
