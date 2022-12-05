package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import steps.AccountSteps;
import steps.CommonSteps;

public class AccountStepdefinition {
    public AccountSteps accountSteps = new AccountSteps();

    @When("click on Account dropdown")
    public void clickOnAccountDropdown() throws InterruptedException {
        Thread.sleep(8000);
        accountSteps.clickAccountDropdown();
    }

    @Then("verify Account dropdown option")
    public void verifyAccountDropdownOption() {
        accountSteps.verifyAccountDropdownoptions();
    }

    @Then("validate create account page")
    public void validateCreateAccountPage() {
        accountSteps.validatecreateaccountPage();
    }

    @And("click on create account")
    public void clickOnCreateAccount() throws InterruptedException {
        accountSteps.clickcreateaccount();
    }

    @And("click on view account")
    public void clickOnViewAccount() {
        accountSteps.clickViewAccount();
    }

    @Then("validate view account page")
    public void validateViewAccountPage() {
        accountSteps.validateAccountspage();
    }

    @Then("Enter required details")
    public void enterRequiredDetails() throws InterruptedException {
        accountSteps.enterrequireddetails();
    }

    @And("click save")
    public void clickSave() {
        accountSteps.clickSave();
    }

    @And("Validate saved account")
    public void validateSavedAccount() {
        accountSteps.validateSavedAccount();
    }

    @Then("Delete the account")
    public void deleteTheAccount() {
        accountSteps.deleteAccount();
    }

    @And("Navigate to Account module")
    public void navigateToAccountModule() {
        accountSteps.navigateToAccountModule();

    }

    @And("click on Create Account option from the dropdown list")
    public void clickOnCreateAccountOptionFromTheDropdownList() {
        accountSteps.createAccountOptionFromDropdown();
    }

    @Then("required fields are empty and click on Save Button")
    public void requiredFieldsAreEmptyAndClickOnSaveButton() {
        accountSteps.clickOnSaveButton();
    }

    @And("Error message {string} should be displayed.")
    public void errorMessageShouldBeDisplayed(String arg0) {
        accountSteps.errorMessageShouldBeDisplayed();
    }

    @Then("Fill all the required data")
    public void fillAllTheRequiredData() {
        accountSteps.fillAllTheRequiredField();
    }

    @And("Click on save button")
    public void clickOnSaveButton() {
        accountSteps.clickOnSaveButton();
    }

    @And("Click on Edit button")
    public void clickOnEditButton() throws InterruptedException {
        accountSteps.clickOnEditButton();
    }

    @Then("After completion of editing click on save button and data edited successfully")
    public void afterCompletionOfEditingClickOnSaveButton() {
        accountSteps.afterCompletionOfEditingClickOnSave();
    }

    @And("click on cancel button")
    public void clickOnCancelButton() {
        accountSteps.clickOnCancelButton();
    }

    @Then("account page should be displayed")
    public void accountPageShouldBeDisplayed() {
        accountSteps.accountPageDisplayed();
    }

    @And("click on ok button on popup message")
    public void clickOnOkButtonOnPopupMessage() {
        accountSteps.clickOnOkButtonOnPopUpMessage();
    }

    @And("Click on {string} button")
    public void clickOnButton(String arg0) {
        accountSteps.clickOnNewButton();

    }

    @Then("create page should be displayed")
    public void createPageShouldBeDisplayed() {
        accountSteps.createPageDisplayed();
    }

    @And("Click on {string} dropdown list")
    public void clickOnDropdownList(String arg0) {
        accountSteps.clickOnActionDropdown();

    }

    @Then("Action dropdown list should be displayed")
    public void actionDropdownListShouldBeDisplayed() throws InterruptedException {
        accountSteps.actionDropdwonListDisplayed();
    }

    @Then("click on delete button from action dropdown")
    public void clickOnDeleteButtonFromActionDropdown() {
        accountSteps.clickOnDeleteButtonFromActionDropdown();
    }

    @And("click on proceed button when popup message displayed and record deleted successfully")
    public void clickOnProceedButtonWhenPopupMessageDisplayed() {
        accountSteps.clickOnProceedButtonAndRecordDeleted();
    }
}





