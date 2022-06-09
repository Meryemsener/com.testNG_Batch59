package tests.day22_CrossBrowser;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;


public class C03_DataProvider {

    @Test
    public void test01() {
        AmazonPage amazonPage = new AmazonPage();
        //amazon anasayfasina gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        //nutella icin arama yapalim
        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        //sonuclarin nutella icerdigini test edelim
        String expectedWord = "Nutella";
        String actualWord = amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualWord.contains(expectedWord));
    }

    @DataProvider
    public static Object[][] AraranacakKelimeler() {
        Object[][] arananKelimeArrayi={{"Nutella"},{"Java"},{"Kedi"}};
        return arananKelimeArrayi;
    }

    @Test(dataProvider = "AraranacakKelimeler")
    //arayacagamiz kelimeleri bir liste gibi tutup
    //bana yollayacak bir veri saglayicisi olusturacagiz

    public void dataProviderTesti(String arananKelime) {
        AmazonPage amazonPage = new AmazonPage();
        //amazon anasayfasina gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        //nutella,Java, kedi icin arama yapalim
        amazonPage.aramaKutusu.sendKeys(arananKelime + Keys.ENTER);

        //sonuclarin aradigimiz kelimeleri icerdigini test edelim
        String expectedWord = arananKelime;
        String actualWord = amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualWord.contains(expectedWord));

        //sayfayi kapatalimi
        Driver.closeDriver();
    }
}