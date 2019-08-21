package pageObjects;

import helper.Constants;
import helper.WaitHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;


    @FindBy(xpath="//input[@id='username']")
    public WebElement userName;

    @FindBy(xpath=" //input[@id='password']")
    WebElement password;

    @FindBy(xpath="//button[@class='btn__primary--large from__button--floating']")
    WebElement loginButton;

    WaitHelper waitHelper;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        waitHelper = new WaitHelper(driver);
        waitHelper.WaitForElement(userName, Constants.getExplicitwait());
    }

    public void enterUserName(String userName){
        this.userName.sendKeys(userName);
    }

    public void enterPassword(String password){
        this.password.sendKeys(password);
    }

    public void clickLoginButton(){
        loginButton.click();
    }

}