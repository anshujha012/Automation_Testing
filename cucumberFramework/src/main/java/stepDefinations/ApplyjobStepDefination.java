package stepDefinations;
import beans.JobData;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.LoggerHelper;
import helper.WaitHelper;
import org.testng.Assert;
import pageObjects.Applyjob;
import pageObjects.JobVerification;
import testBase.TestBase;

import java.util.logging.Logger;

public class ApplyjobStepDefination extends TestBase {

    WaitHelper waitHelper=new WaitHelper(driver);
    Applyjob applyjob = new Applyjob(driver);
    JobVerification jobVerification= new JobVerification(driver);
     org.apache.log4j.Logger log= LoggerHelper.getLogger(ApplyjobStepDefination.class);
    @When("^Enter job title as \"([^\"]*)\"$")
    public void enter_job_title_as(String arg1) throws Throwable {
        JobData.setjobtitle(arg1);
        applyjob.enteronjobtitle(arg1);
    }

    @When("^Enter job location as \"([^\"]*)\"$")
    public void enter_job_location_as(String arg1) throws Throwable {
        JobData.setjobtitle(arg1);
        applyjob.enterjoblocation(arg1);
    }

    @When("^click on search button$")
    public void click_on_serch_button() throws Throwable {
        applyjob.clickjobsubmitbutton();
    }
    @Then("^It should rediredt to job listed page$")
    public void It_should_redirect_to_job_listed_page() throws Throwable
    {
     log.info("job title is " + JobData.getJobtitle());
        log.info("job location is " +JobData.getJoblocation());
        if(jobVerification.getJobtitle().getText().contains(JobData.getJobtitle())&&jobVerification.getJobtitle().getText().contains(JobData.getJoblocation()))
        {
        }
        else
        {
          Assert.assertTrue(false,"Applied job is invalid" +jobVerification.getJobtitle().getText() );
        }
    }

    @Then("^I should verify the job information$")
    public void I_should_verify_the_job_information() throws Throwable
    {
        Assert.assertEquals(jobVerification.getJobtitle().getText(),JobData.getJobtitle());
        Assert.assertEquals(jobVerification.getJoblocation().getText(),JobData.getJoblocation());
    }

}
