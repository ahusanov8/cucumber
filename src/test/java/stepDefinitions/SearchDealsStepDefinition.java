package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchDealsStepDefinition {

    @Given("user is on Amazon Home page")
    public void user_is_on_amazon_home_page() {
        // TODO: code to initialize browser
        // navigate to amazon.com
        System.out.println("userIsOnAmazonHomePage");
    }

    @When("user selects {string} option from Departmants")
    public void user_selects_option_from_Departmants(String option) {
        // TODO: code here to select an option from drop down
        System.out.println("userSelectsOptionFromDepartments: " + option);
    }

    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
        //Todo: code to click the seach button
        System.out.println("userClicksOnSearchButton");
    }

    @Then("search displays the result set")
    public void search_displays_the_result_set() {
        //todo: code to verify result count > 0
        System.out.println("searchDisplaysTheResultSet");
    }

    @Then("result container header should have {string}")
    public void result_container_header_should_have_message(String message) {
        //todo: code to verify the message
        System.out.println("resultContainerHeaderShoudHaveValue:  " + message);
    }


}


