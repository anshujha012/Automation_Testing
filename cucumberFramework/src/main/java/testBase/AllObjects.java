package testBase;

import pageObjects.Applyjob;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public interface AllObjects {

    LoginPage loginPage = new LoginPage(TestBase.driver);
    HomePage homePage = new HomePage(TestBase.driver);
    //Applyjob applyjob= new Applyjob(TestBase.driver);
}