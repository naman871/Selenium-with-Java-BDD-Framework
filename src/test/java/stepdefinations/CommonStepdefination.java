package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import steps.CommonSteps;


public class CommonStepdefination {

    CommonSteps commonSteps = new CommonSteps();

    @Given("launch browser")
    public void launchBrowser() {
        commonSteps.openBrowser();

    }

    @Then("user enters {string} and {string}")
    public void userEntersAndUsernameAndPassword(String username, String password) {
        commonSteps.entersUsernameAndPassword(username, password);
    }

    @And("clicks on login button")
    public void clicksOnLoginButton() {
        commonSteps.clickLoginButton();

    }

}
