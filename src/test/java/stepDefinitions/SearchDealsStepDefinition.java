package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class SearchDealsStepDefinition {

    @Given("user is on Amazon Home page")
    public void userIsOnAmazonHomePage() {
        // TODO: code to initialize browser
        // navigate to amazon.com
        System.out.println("userIsOnAmazonHomePage");
    }
    @When("user selects 'Deals' option from Departmants")
    public void userSelectsOptionFromDepartments(String option) {
        // TODO: code here to select an option from drop down
        System.out.println("userSelectsOptionFromDepartments");
    }

    @When("user clicks on search button")
    public void userClicksOnSearchButton() {
        //Todo: code to click the seach button
        System.out.println("userClicksOnSearchButton");
    }
    @Then("search displays the result set")
    public void searchDisplaysTheResultSet() {
        //todo: code to verify result count > 0
        System.out.println("searchDisplaysTheResultSet");
    }
    @Then("result container header should have 'Shop all deals'")
    public void resultContainerHeaderShoudHaveValue(String message) {
        //todo: code to verify the message
        System.out.println("resultContainerHeaderShoudHaveValue");
    }


}


