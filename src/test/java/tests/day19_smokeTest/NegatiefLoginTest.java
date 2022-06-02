package tests.day19_smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class NegatiefLoginTest {

    BrcPage brcPage = new BrcPage();
    @Test
    public void yanlisSifre() {


        // Bir test method olustur positiveLoginTest()

        //https://www.bluerentalcars.com/ adresine git

        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        //login butonuna bas
        brcPage.ilkLoginButton.click();

        //test data user email: boss@bluerentalcars.com ,
        brcPage.emailTextBox.sendKeys(ConfigReader.getProperty("brcWrongEmailAdress"));

        //test data password : 54321
        brcPage.passwprdTextBox.sendKeys(ConfigReader.getProperty("brcWrongPassword"));
        // login butonuna tiklayin
        brcPage.ikinciLoginButton.click();

        // Degerleri girildiginde sayfaya basarili sekilde girilemedigini test et
        Assert.assertTrue(brcPage.ikinciLoginButton.isDisplayed());

    }

}
