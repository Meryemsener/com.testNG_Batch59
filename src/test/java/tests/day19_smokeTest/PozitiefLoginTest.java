package tests.day19_smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class PozitiefLoginTest {

    BrcPage brcPage = new BrcPage();
    @Test
    public void test01() {


        // Bir test method olustur positiveLoginTest()

        //https://www.bluerentalcars.com/ adresine git

        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        //login butonuna bas
        brcPage.ilkLoginButton.click();

        //test data user email: customer@bluerentalcars.com ,
        brcPage.emailTextBox.sendKeys(ConfigReader.getProperty("brcValidEmail"));

        //test data password : 12345
        brcPage.passwprdTextBox.sendKeys(ConfigReader.getProperty("brcValidPassword"));
        // login butonuna tiklayin
        brcPage.ikinciLoginButton.click();

        // Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        String actualUserName=brcPage.kullaniciProfilIsmi.getText();
        String expectedUserName=ConfigReader.getProperty("brcValidUserName");
        Assert.assertEquals(actualUserName, expectedUserName);
        Driver.closeDriver();

    }
}
