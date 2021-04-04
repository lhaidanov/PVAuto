package org;

import org.testng.annotations.*;

public class TestTest11 extends BaseTest1 {

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before method1" );
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After method1" );
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class1" );
    }

    @AfterClass
    public void AfterClass(){
        System.out.println("After Class1" );
    }


    @Test
    public void test11(){
        System.out.println("We are in test11");
    }
    @Test
    public void test21(){
        System.out.println("We are in test21");
    }

    @Test
    public void test31(){
        System.out.println("We are in test31");
    }

}
