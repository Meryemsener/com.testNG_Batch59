package day16_notations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBase;

import java.util.List;

public class C07_SOftAssert extends TestBase {
    @Test
    public void test01() {
        //1-"https://zero.webappsecurity.com/" adresine gidin
        driver.get("https://zero.webappsecurity.com/");

        //2-sign in butonuna basin
        driver.findElement(By.id("signin_button")).click();

        //3-login kutusuna "usernam" yazin
        WebElement loginKutusu = driver.findElement(By.xpath("//input[@name='user_login']"));
        loginKutusu.sendKeys("username");

        //    4-password kutusuna "password" yazin
        WebElement passwordKutusu=driver.findElement(By.xpath("//input[@id='user_password']"));
        passwordKutusu.sendKeys("password");

        //    5-sign in tusuna basin
        driver.findElement(By.xpath("//input[@name='submit']")).click();
        driver.navigate().back();

        //    6-online banking menusu icinde Pay Bills sayfasina gidin
       driver.findElement(By.xpath("//strong[text()='Online Banking']")).click();
       driver.findElement(By.xpath("//span[@id='pay_bills_link']")).click();

        //    7-"purchase Foreign Currency" tusuna basin
        driver.findElement(By.xpath("//*[text()='Purchase Foreign Currency']")).click();

        //    8-"Currency" drop down menusunden Eurozone'u secin
        WebElement ddo=driver.findElement(By.xpath("//select[@name='currency']"));
        Select select= new Select(ddo);
        select.selectByVisibleText("Eurozone(euro");
        //    9-soft assert kullanarak "Eurozone(Euro)" secildigini test edin
        SoftAssert softAssert=new SoftAssert();
        String secilenOption=select.getFirstSelectedOption().getText();
        String expectedOption="Eurozone (Euro)";
        softAssert.assertEquals(expectedOption,"secilen option uygun degil");
        //    10-soft assert kullanarak Dropdown listesinin su secenekleri oldgunu test edin "Sele
        List<WebElement> optionList=select.getOptions();



    }
}