package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import steps.QuotesSteps;

public class QuotesStepdefinition {

    QuotesSteps quotesSteps = new QuotesSteps();


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

}
