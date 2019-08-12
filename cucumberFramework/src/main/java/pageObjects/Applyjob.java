package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Applyjob {
    WebDriver driver;

    @FindBy(xpath="//a/span[@id='jobs-tab-icon']")
    public WebElement jobicon;
    @FindBy(id="\"jobs-tab-icon\"")
    public WebElement jobssearch;
    @FindBy(xpath="//input[contains(@id,'jobs-search-box-keyword-id-ember')]")
    public WebElement jobtitle;
    @FindBy(id="\"jobs-tab-icon\"")
    public WebElement jobsearch;
    @FindBy(xpath="//input[contains(@id,'jobs-search-box-location-id-ember')]")
    public WebElement joblocation;
    @FindBy(xpath="//button[contains(@class,'jobs-search-box__submit-button artdeco-button artdeco-button')]")
    public WebElement jobsubmit;

    public void clickonjobicon(){
        jobicon.click();
    }

    public void enterjobtitle(String jobtitle){
        this.jobtitle.sendKeys(jobtitle);
    }
    public void enterjoblocation(String joblocation){
        this.joblocation.sendKeys(joblocation);
    }
    public void clickjobsubmitbutton(){
        jobsubmit.click();
    }

}
