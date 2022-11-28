package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import steps.AccountSteps;

public class AccountStepdefination {
    public AccountSteps accountSteps = new AccountSteps();

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

  @Then("After completion of editing click on save button")
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
        
    }@Then("create page should be displayed")
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
