package pageObjects;

import helper.Constants;
import helper.LoggerHelper;
import helper.WaitHelper;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobVerification {
    WebDriver driver;
    private WaitHelper waitHelper = new WaitHelper(driver);
    private static Logger log = LoggerHelper.getLogger(JobVerification.class);

    @FindBy(xpath = "//input[contains(@id,'jobs-search-box-keyword-id-ember')]")
    WebElement jobtitle;

    @FindBy(xpath = "//input[contains(@id,'jobs-search-box-location-id-ember')]")
    WebElement joblocation;

    @FindBy(xpath = "//span[contains(text(),'Track my jobs')]")
    WebElement trackmyjobs;

 public JobVerification(WebDriver driver)
 {
     this.driver=driver;
     PageFactory.initElements(driver,this);
     waitHelper=new WaitHelper(driver);
 }

    public WebElement getJobtitle() {
         waitHelper.WaitForElement(jobtitle, Constants.getExplicitwait());
        return jobtitle;
    }

    public WebElement getJoblocation() {
        return joblocation;
    }
    public WebElement getTrackmyjobs() {
        waitHelper.WaitForElement(trackmyjobs, Constants.getExplicitwait());
        return trackmyjobs;
    }
    public void setJobtitle(WebElement jobtitle) {
        this.jobtitle = jobtitle;
    }

    public void setJoblocation(WebElement joblocation) {
        this.joblocation = joblocation;
    }
    public void setTrackmyjobs(WebElement trackmyjobs) {
        this.trackmyjobs = trackmyjobs;
    }

}

