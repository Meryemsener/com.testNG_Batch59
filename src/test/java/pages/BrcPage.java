package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BrcPage {
    public BrcPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath="//a[@class='btn btn-primary btn-sm']")

    public WebElement ilkLoginButton;

    @FindBy(xpath="(//input[@class='form-control is-invalid'])[1]")

    public WebElement emailTextBox;

    @FindBy(xpath="(//input[@class='form-control is-invalid'])[2]")

    public WebElement passwordTextBox;

    @FindBy(xpath="//*[@class='btn btn-primary']")

    public WebElement ikinciLoginButton;

    @FindBy(id="dropdown-basic-button")

    public WebElement kullaniciProfilIsmi;
}
