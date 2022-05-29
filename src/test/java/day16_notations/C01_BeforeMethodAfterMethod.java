package day16_notations;

import org.testng.annotations.Test;
import utilities.TestBase;

public class C01_BeforeMethodAfterMethod extends TestBase {

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
