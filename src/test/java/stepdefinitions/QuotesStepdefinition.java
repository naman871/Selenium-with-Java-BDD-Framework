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

    @And("Enter the required Fields title as {string}")
    public void enterTheRequiredFieldsTitleAs(String titleName) {
        quotesSteps.enterTheRequiredFieldsTitleAs(titleName);
    }

    @And("In Address Information section click on cursor beside account field")
    public void inAddressInformationSectionClickOnCursorBesideAccountField() throws InterruptedException {
        quotesSteps.accountFieldCursorQuotes();
    }

    @Then("Click on Save")
    public void saveButtonQuotes() {
        quotesSteps.saveButtonQuotes();
    }

    @And("Quote with the given title name should be created and displayed in new page")
    public void quoteWithTheGivenTitleNameShouldBeCreatedAndDisplayedInNewPage() {
        quotesSteps.verifyTitleNameInNewPage();
    }

    @And("Get the account list in the Account search window")
    public void getTheAccountListInTheAccountSearchWindow() {
        quotesSteps.getTheAccountListInTheAccountSearchWindow();
    }

    @And("Click on the account name")
    public void clickOnTheAccountName() {
        quotesSteps.clickOnTheAccountName();
    }

    @And("The existing account should be selected for the quote")
    public void theExistingAccountShouldBeSelectedForTheQuote() {
        quotesSteps.theExistingAccountShouldBeSelectedForTheQuote();
    }

    @And("Account with the entered name should be displayed in the list")
    public void accountWithTheEnteredNameShouldBeDisplayedInTheList() {
        quotesSteps.getTheAccountListInTheAccountSearchWindow();
    }

    @Then("Click on cross button beside account field")
    public void clickOnCrossButtonBesideAccountField() {
        quotesSteps.clickCrossButtonBesideAccountName();
    }

    @And("Account field should get cleared")
    public void accountFieldShouldGetCleared() {
        quotesSteps.accountFieldCleared();
    }

    @And("Click on  Copy address from left checkbox in Address Information section is enabled")
    public void clickOnCopyAddressFromLeftCheckboxInAddressInformationSectionIsEnabled() {
        quotesSteps.verifyCopyAddressCheckboxEnabled();
    }

}
