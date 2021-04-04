package org;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestTest {

//    @BeforeMethod
//    public void beforeMethod(){
//        System.out.println("Before method" );
//    }
//
//    @AfterMethod
//    public void afterMethod(){
//        System.out.println("After method" );
//    }
//
//    @BeforeClass
//    public void beforeClass(){
//        System.out.println("Before Class" );
//    }
//
//    @AfterClass
//    public void AfterClass(){
//        System.out.println("After Class" );
//    }


    @Test(dependsOnMethods = {"test2","test3"})
    public void test1(){
        System.out.println("We are in test1");
    }
    @Test(priority = 1)
    public void test2(){
        System.out.println("We are in test2");
    }

    @Test(priority = 5,invocationCount = 3)
    public void test3(){
        System.out.println("We are in test3");
    }

    @Test(dataProvider = "dataProvider")
    public void calcTest(double o1, String operation,
                         double o2, double result){
    double res;
    switch (operation){
        case "+":
            res = o1 + o2;
            break;
        case "-":
            res = o1 - o2;
            break;
        case "*":
            res = o1 * o2;
            break;
        case "/":
            res = o1 / o2;
            break;

        default:
            throw new IllegalStateException("Unexpected value: " + operation);
    }
        System.out.println(o1 + operation + o2 + "=" + res);
        Assert.assertEquals(res,result);

    }




    @DataProvider
    public Object[][] dataProvider(){
        return new Object[][]{
            {5, "+", 5, 10},
            {5, "%", 2, 1},
            {6,"*", 6, 36},
            {8, "/", 2, 4}
        };
    }

}
