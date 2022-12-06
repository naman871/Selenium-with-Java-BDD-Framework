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

    @And("click on Quotes module")
    public void clickOnQuotesDropdown() {
        quotesSteps.clickOnQuotesDropdown();

    }
    @Then("Click on Create Quotes option")
    public void clickOnCreateQuote() {
        quotesSteps.clickOnCreateQuote();

    }
    @And("Enter all the required fields")
    public void titleTextBoxQuotes() {
        quotesSteps.titleTextBoxQuotes();

    }
    @Then("Click on Save")
    public void saveButtonQuotes() {
        quotesSteps.saveButtonQuotes();
    }
    @And("Quote with the given title name should be created and displayed in new page")
    public void quoteWithTheGivenTitleNameShouldBeCreatedAndDisplayedInNewPage() {
        quotesSteps.verifyTitleNameInNewPage();
    }
}
