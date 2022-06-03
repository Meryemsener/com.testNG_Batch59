package tests.day19_smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class NegatiefLoginTest {

    BrcPage brcPage;
    @Test
    public void yanlisSifre() throws InterruptedException {

        brcPage = new BrcPage();

        // Bir test method olustur positiveLoginTest()

        //https://www.bluerentalcars.com/ adresine git

        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        //login butonuna bas
        Thread.sleep(3000);
        brcPage.ilkLoginButton.click();

        //test data user email: boss@bluerentalcars.com ,
        brcPage.emailTextBox.sendKeys(ConfigReader.getProperty("brcWrongEmailAdress"));

        //test data password : 54321
        brcPage.passwordTextBox.sendKeys(ConfigReader.getProperty("brcWrongPassword"));
        // login butonuna tiklayin
        brcPage.ikinciLoginButton.click();

        // Degerleri girildiginde sayfaya basarili sekilde girilemedigini test et
        Assert.assertTrue(brcPage.ikinciLoginButton.isDisplayed());

    }

}
