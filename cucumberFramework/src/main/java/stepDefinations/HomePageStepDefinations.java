package stepDefinations;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.WaitHelper;
import pageObjects.HomePage;
import testBase.TestBase;

public class HomePageStepDefinations extends TestBase {
    HomePage homePage=new HomePage(driver);
    WaitHelper waitHelper;

    @Then("^I should see LinkidIn  homepage&")
    public void i_should_see_LinkidIn_homepage()throws Throwable
    {
        waitHelper = new WaitHelper(driver);
        homePage.getWelcome().isDisplayed();
    }
    @Then("^I should see Welcome text message on home page&")
    public void i_should_see_Welcome_text_message_on_home_page()throws Throwable
    {
        homePage.Welcome.isDisplayed();
    }
    @When("^I click on jobs icon$")
    public void i_click_on_jobs_icon() throws Throwable {
        homePage.Jobs.click();
    }
}
