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
    Then I should see LinkidIn  homepage
    And I should see Welcome text message on home page








