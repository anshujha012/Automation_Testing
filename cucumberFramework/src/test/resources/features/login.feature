@Login
Feature: Sign In
  As an employee of the company
  I want to login to application with my credentails
  In order to use the application features.

  Background: User navigates to Application URL
    Given I am on the Login page URL "https://www.linkedin.com/login?trk=guest_homepage-basic_nav-header-signin"
    Then I should see Log In Page

  @sanity
  Scenario: Sign In with valid credential
    When I enter username as "sharmaanshu29081989@gmail.com"
    And I enter password as "anshu123"
    And click on login button
    Then I sould see application homepage
    And I must see my LinkidIn home page
    When I click on logout button
    Then I must be logged out from LinkindIn


  @sanity
  Scenario: job search
   Given I am on home page
   When I click on jobs icon
   And Enter job title as "SDET"
   And Enter job location as "Canada"
   When click on search button
   Then It should rediredt to job listed page
      Then It should rediredt to job listed page





