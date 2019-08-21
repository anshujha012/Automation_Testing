                   @Job
                      Feature: Job Search
                       Background: User should be on Home page
                           Given I am on the Login page URL "https://www.linkedin.com/login?trk=guest_homepage-basic_nav-header-signin"
                           When I enter username as "sharmaanshu29081989@gmail.com"
                           And I enter password as "anshu123"
                           And click on login button
                           Then I should see LinkidIn  homepage


                       @sanity @regression
                        Scenario:Apply Job
                           When I click on jobs icon
                           And Enter job_title as "SDET"
                           And Enter job location as "Canada"
                           When click on search button
                           Then It should rediredt to job listed page
                           Then I should verify the job information

