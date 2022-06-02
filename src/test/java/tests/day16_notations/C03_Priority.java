package tests.day16_notations;

import org.testng.annotations.Test;
import utilities.TestBase;

public class C03_Priority extends TestBase {
    /*
    testNG isim sirasina gore calistirir ama onceligi baska methoda vermek
    isterseniz priorty ile yapabilirsiniz.
    Eger priority ye deger atanmamissa degeri 0 olarak alir.
     */
    @Test(priority=5)
    public  void amazon(){
        driver.get("https://www.amazon.com");

    }
    @Test(priority = -2)
    public  void bestBuy(){
        driver.get("https://www.bestbuy.com");

    }
    @Test
    public  void techproedTesti(){
        driver.get("https://www.techproeducation.com");

    }
}
