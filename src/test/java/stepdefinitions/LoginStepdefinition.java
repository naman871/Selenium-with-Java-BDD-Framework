package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import steps.LoginSteps;


public class LoginStepdefinition {

    LoginSteps loginSteps = new LoginSteps();

    @Given("launch browser")
    public void launchBrowser() {
        loginSteps.openBrowser();
    }

    @Then("user enters {string} and {string}")
    public void userEntersAndUsernameAndPassword(String username, String password) {
        loginSteps.entersUsernameAndPassword(username, password);
    }

    @And("clicks on login button")
    public void clicksOnLoginButton() {
        loginSteps.clickLoginButton();
        loginSteps.closeBrowser();

    }

}
