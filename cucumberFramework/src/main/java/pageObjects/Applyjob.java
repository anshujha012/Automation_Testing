package pageObjects;

import helper.WaitHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.logging.Logger;

public class Applyjob {
    WebDriver driver;
    WaitHelper waitHelper =new WaitHelper(driver);
    Logger log;

    @FindBy(xpath="//input[contains(@id,'jobs-search-box-keyword-id-ember')]")
    public WebElement jobtitle;

    @FindBy(xpath="//input[contains(@id,'jobs-search-box-location-id-ember')]")
    public WebElement joblocation;
    @FindBy(xpath="//button[contains(@class,'jobs-search-box__submit-button artdeco-button artdeco-button')]")
    public WebElement jobsubmit;


    public Applyjob(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
        waitHelper = new WaitHelper(driver);
        waitHelper.WaitForElement(jobtitle, 60);
    }

    public void enteronjobtitle(String jobtitle)
    {
        log.info("enter job title" + jobtitle);
        this.jobtitle.sendKeys(jobtitle);

    }

    public void enterjoblocation(String joblocation)
    {
        this.joblocation.sendKeys(joblocation);
    }
    public void clickjobsubmitbutton()
    {
        jobsubmit.click();
    }

}
