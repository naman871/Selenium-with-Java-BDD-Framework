package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import steps.AccountSteps;

public class AccountStepdefinition {
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
}
