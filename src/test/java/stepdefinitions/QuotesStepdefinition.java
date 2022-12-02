package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import steps.QuotesSteps;

public class QuotesStepdefinition {
    QuotesSteps quotesSteps = new QuotesSteps();

    @Then("user clicks on quotes module")
    public void user_clicks_on_quotes_module() {
        quotesSteps.clickQuotes();

    }

    @And("user click on create quotes modules")
    public void userClickOnCreateQuotesModules() {
        quotesSteps.clickCreateQuotes();
    }

    @And("user clicks on save button")
    public void userClicksOnSaveButton() {
        quotesSteps.clickSave();
    }

    @And("user verify {string} error message after save")
    public void userVerifyErrorMessageAfterSave(String arg0) {
        quotesSteps.verifyErrorMessage(arg0);
    }
}
