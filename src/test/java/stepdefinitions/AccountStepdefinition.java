package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import steps.AccountSteps;
import steps.CommonSteps;

public class AccountStepdefinition {
    public AccountSteps accountSteps = new AccountSteps();
    public CommonSteps commonSteps = new CommonSteps();
    @When("click on Account dropdown")
    public void clickOnAccountDropdown() {
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
    public void enterRequiredDetails() {
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


}
