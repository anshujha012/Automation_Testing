package testBase;

import pageObjects.LoginPage;

public interface AllObjects {

    static LoginPage loginPage = new LoginPage(TestBase.driver);
   // static HomePage homePage = new HomePage(TestBase.driver);
}