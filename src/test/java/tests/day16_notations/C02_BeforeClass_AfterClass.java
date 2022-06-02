package tests.day16_notations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C02_BeforeClass_AfterClass extends TestBase {
    @BeforeClass
    public void beforeClass(){
        System.out.println("before class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("after class");
    }


    @Test
    public  void amazon(){
        driver.get("https://www.amazon.com");

    }
    @Test
    public  void bestBuy(){
        driver.get("https://www.bestbuy.com");

    }
    @Test
    public  void techproedTesti(){
        driver.get("https://www.techproeducation.com");

    }
}
