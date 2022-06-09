package tests.day22_CrossBrowser;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C04_NegatifLoginProvider {
    BrcPage brcPage;

    @DataProvider
    public static Object[][] kullaniciListesi() {
        Object[][] kullaniciBilgileri={{"mariaaa@gmail.com","123456"},
                {"aliye@gmail.com","ASDEFGG"}};

        return kullaniciBilgileri;
    }

    @Test(dataProvider = "kullaniciListesi")
    public void yanlisSifre(String userMail, String password) throws InterruptedException {
       //22.satirdaki String password, Strign userMail iki parametredir. Bu da
        //ic arrayde kac deger olmasi gerektigini gosterir. Sayet 3 deger istiyorsak
        //22. satirda da 3 deger olmalidir.
        brcPage=new BrcPage();
        // Bir test method olustur positiveLoginTest()
        //		 https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        //		login butonuna bas
        Thread.sleep(2000);
        brcPage.ilkLoginButonu.click();
        // test data user email: dataprovider'dan alalim,
        brcPage.emailTextBox.sendKeys(userMail);
        // test data password : dataprovider'dan alalim,
        brcPage.passwordTextBox.sendKeys(password);
        // login butonuna tiklayin
        brcPage.ikinciLoginButonu.click();
        // Degerleri girildiginde sayfaya basarili sekilde girilemedigini test et

        Assert.assertTrue(brcPage.ikinciLoginButonu.isDisplayed());

        Driver.closeDriver();
    }
    // bu class'da 2 test methodu daha oilusturun
    // biri yanlisKullanici
    // digeri de yanlis sifre ve kullanici adi

}
