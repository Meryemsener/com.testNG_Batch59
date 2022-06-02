package tests.day17_pom;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02_PageClassKullanimi {

    @Test
    public void test01(){
        //AmazonPage amazonPage=new AmazonPage();//AmazonPage classindan obje ureterek buradan methodlarini cagiriyoruz
         AmazonPage amazonPage=new AmazonPage();
        //1-amazona gidelim
        Driver.getDriver().get("http://www.amazon.com");

        //2-nutellayi aratalim
        amazonPage.aramaKutusu.sendKeys("nutella"+Keys.ENTER);

        //3-sonuc yazisinin nutella icerdigini test edelim
        String actualSonucu=amazonPage.aramaSonucElementi.getText();
        String arananKelime="nutella";

        Assert.assertTrue(actualSonucu.contains(arananKelime));
    }

}
