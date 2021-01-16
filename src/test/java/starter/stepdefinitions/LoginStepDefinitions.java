package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {
    @Given("(.*) has an active account")
    public void has_an_active_account(String a) {

    }

    @When("he sends their valid credentials")
    public void he_sends_their_valid_credentials() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("he should have access to manage his account")
    public void he_should_have_access_to_manage_his_account() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
