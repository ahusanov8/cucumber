Feature: Amazon Deals Search without Login

Scenario: Verify Amazon Home page defualt menu bar
Given user is on Amazon Home page
When user selects "Deals" option from Departmants
When user clicks on search button
Then search displays the result set
Then result container header should have "Shop all deals"
