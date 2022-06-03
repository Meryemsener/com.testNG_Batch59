package tests.day21_reusableMethods_HtmlReports;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C03_PozitiefLoginTestiRaporu extends TestBaseRapor  {
    BrcPage brcPage = new BrcPage();
    @Test
    public void positieveLoginTest() {


        extentTest=extentReports.createTest("Pozitif Login","gecerli user name ve sifre ile login yapmali");
        // Bir test method olustur positiveLoginTest()

        //https://www.bluerentalcars.com/ adresine git

        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        //login butonuna bas
        brcPage.ilkLoginButton.click();

        //test data user email: customer@bluerentalcars.com ,
        brcPage.emailTextBox.sendKeys(ConfigReader.getProperty("brcValidEmail"));

        //test data password : 12345
        brcPage.passwordTextBox.sendKeys(ConfigReader.getProperty("brcValidPassword"));
        // login butonuna tiklayin
        brcPage.ikinciLoginButton.click();

        // Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        String actualUserName=brcPage.kullaniciProfilIsmi.getText();
        String expectedUserName=ConfigReader.getProperty("brcValidUserName");
        Assert.assertEquals(actualUserName, expectedUserName);
        Driver.closeDriver();

    }
}
