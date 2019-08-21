package pageObjects;

import helper.Constants;
import helper.WaitHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public WebDriver driver;
    WaitHelper waitHelper;


    @FindBy(xpath = "//span[@class='t-16 t-black t-bold']")
    public WebElement Welcome;

    @FindBy(xpath = "//span[@id='feed-tab-icon']")
    public WebElement Home;
    @FindBy(xpath = "//li[@id='mynetwork-nav-item']//a[@class='nav-item__link nav-item__link--underline js-nav-item-link']")
    public WebElement My_network;
    @FindBy(xpath = "//span[@id='jobs-tab-icon']")
    public WebElement Jobs;
    @FindBy(xpath = "//span[@id='messaging-tab-icon']")
    public WebElement Messaging;
    @FindBy(xpath = "//span[@id='notifications-tab-icon']")
    public WebElement Notifications;
    @FindBy(xpath = "//img[@class='nav-item__profile-member-photo nav-item__icon ghost-person']")
    public WebElement Me;



    public HomePage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }
    public Applyjob navigatetoJobs()
    {
        Jobs.click();
        return new Applyjob(driver);
    }
    public WebElement getWelcome() {
        waitHelper.WaitForElement(Welcome, Constants.getExplicitwait());
        return Welcome;
    }

}
