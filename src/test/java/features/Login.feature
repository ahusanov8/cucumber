Feature: Application Login

Scenario: Home page defualt login
Given User is on Net Banking landing page
When User login into application with username and password
Then Home page is populated
And Cards are displayed
