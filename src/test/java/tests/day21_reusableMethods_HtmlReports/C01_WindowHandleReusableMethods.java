package tests.day21_reusableMethods_HtmlReports;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

public class C01_WindowHandleReusableMethods {

    @Test
    public void test01() {
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        //clickhere butonuna basalim
        Driver.getDriver().findElement(By.linkText("Click Here")).click();

        //acilan yeni tabin title'inin"New Window" oldugunu test edin
        ReusableMethods.switchToWindow("New Window");

        String expectedTitle="New Window";
        String actualTitle=Driver.getDriver().getTitle();
        ReusableMethods.waitFor(5);
        Assert.assertEquals(actualTitle, expectedTitle);
        Driver.closeDriver();
    }

        }


