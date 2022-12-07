package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import steps.CommonSteps;


public class CommonStepdefinition {

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

    @And("close Browser")
    public void closeBrowser() {
        commonSteps.closeBrowser();
    }


    @And("click on New Button")
    public void clickOnNewButton() throws InterruptedException {
        Thread.sleep(2000);
        commonSteps.clickonNewButton();
    }
}
