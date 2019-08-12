package stepDefinations;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.WaitHelper;
import pageObjects.Applyjob;
import pageObjects.LoginPage;
import testBase.TestBase;

public class ApplyjobStepDefination extends TestBase {
    //LoginPage loginPage = new LoginPage(driver);
    WaitHelper waitHelper;
    Applyjob applyjob = new Applyjob();

    @Given("^I am on home page$")
    public void i_am_on_home_page() throws Throwable {
        waitHelper.WaitForElement(applyjob.jobicon, 60);
    }
    @Then("^I click on jobs icon$")
    public void i_click_on_jobs_icon() throws Throwable {
        applyjob.clickjobsubmitbutton();
    }

    @When("^Enter job title as \"([^\"]*)\"$")
    public void enter_job_title_as(String arg1) throws Throwable {
        applyjob.enterjobtitle(arg1);
    }

    @When("^Enter job location as \"([^\"]*)\"$")
    public void enter_job_location_as(String arg1) throws Throwable {
        applyjob.enterjoblocation(arg1);
    }

    @When("^click on search button$")
    public void click_on_serch_button() throws Throwable {
        applyjob.clickjobsubmitbutton();
    }

    @Then("^It should rediredt to job listed page$")
    public void it_should_redirect_to_job_serch_page() throws Throwable {

    }
}
