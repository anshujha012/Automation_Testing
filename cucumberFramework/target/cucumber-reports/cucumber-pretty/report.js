$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "Sign In",
  "description": "As an employee of the company\r\nI want to login to application with my credentails\r\nIn order to use the application features.",
  "id": "sign-in",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    }
  ]
});
formatter.background({
  "line": 7,
  "name": "User navigates to Application URL",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "I am on the Login page URL \"https://www.linkedin.com/login?trk\u003dguest_homepage-basic_nav-header-signin\"",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I should see Log In Page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 12,
  "name": "Sign In with valid credential",
  "description": "",
  "id": "sign-in;sign-in-with-valid-credential",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I enter username as \"sharmaanshu29081989@gmail.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I enter password as \"anshu123\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I sould see application homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I must see my LinkidIn home page",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on logout button",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I must be logged out from LinkindIn",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "line": 7,
  "name": "User navigates to Application URL",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "I am on the Login page URL \"https://www.linkedin.com/login?trk\u003dguest_homepage-basic_nav-header-signin\"",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I should see Log In Page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 23,
  "name": "job search",
  "description": "",
  "id": "sign-in;job-search",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 22,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "I click on jobs icon",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "Enter job title as \"SDET\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Enter job location as \"Canada\"",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "click on search button",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "It should rediredt to job listed page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});