package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import steps.AccountSteps;
import steps.LeadsSteps;
import steps.CommonSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import steps.LeadsSteps;

public class LeadsStepdefinition {
    public LeadsSteps leadsSteps = new LeadsSteps();

    @When("click on Leads dropdown")
    public void clickOnLeadsDropdown() throws InterruptedException {
        Thread.sleep(8000);
        leadsSteps.clickLeadsDropdown();
    }

    @Then("verify Leads dropdown option")
    public void verifyLeadsDropdownOption() {
        leadsSteps.verifyLeadsDropdownoptions();

    }


    @And("click on create lead")
    public void clickOnCreateLead() throws InterruptedException {
        leadsSteps.clickcreatelead();
    }

    @Then("validate create lead page")
    public void validateCreateLeadPage()  {
        leadsSteps.validatecreateLeadPage();
    }

    @Then("clicks on Leads")
    public void clicksOnLeads()  {
        leadsSteps.clickLeadsModule();
    }

    @Then("clicks on Create Leads Sub Module")
    public void clicksOnCreateLeads()  {
        leadsSteps.clicksOnCreateLeads();
    }

    @Then("Enter all the mandatory Fields")
    public void enterAllTheMandatoryFields() throws InterruptedException {
        leadsSteps.enterAllTheMandatoryFields();
    }

    @And("User Navigate to {string} Module")
    public void userNavigateToModule(String arg0) throws InterruptedException {
        leadsSteps.Module(arg0);
    }

    @And("Click on Create Lead Dropdown")
    public void clickOnCreateLeadDropdown() throws InterruptedException {
        leadsSteps.clickOnCreateLead();
    }

    @Then("Validate Missing Required Fields Error Message")
    public void validateMissingRequiredFieldsErrorMessage() {
        leadsSteps.verifyErrorMessage();
    }

    @And("click on Cancel Button")
    public void clickOnCancelButton() {
        leadsSteps.cancelButtonLeads();
    }

    @Then("User should be able to create new Lead and new Lead page will be displayed")
    public void userShouldBeAbleToCreateNewLeadAndNewLeadPageWillBeDisplayed() {
        leadsSteps.validateNewLeadPage();
    }

    @And("user should able to view the warning message")
    public void userShouldAbleToViewTheWarningMessage() throws InterruptedException {
        leadsSteps.verifyWarningMessage();
    }
    @And("user should be able to view Search section in Create Lead window")
    public void userShouldBeAbleToViewSearchSectionInCreateLeadWindow() {
        leadsSteps.searchBoxLeadsModule();
    }

    @And("click on Cancel Button on cancel popup window")
    public void clickOnCancelButtonOnPopupWindow() throws InterruptedException {
        leadsSteps.clickOnCancelButtonOnPopupWindow();
    }

    @And("click on Ok Button on cancel popup window")
    public void clickOnOkButtonOnPopupWindow() throws InterruptedException {
        leadsSteps.clickOnOkButtonOnPopupWindow();
    }

    @And("clicks on create lead under leads dropdown")
    public void clicksOnCreateLeadUnderLeadsDropdown() throws InterruptedException {
        Thread.sleep(8000);
        leadsSteps.clickleads();
        leadsSteps.createlead();

    }
    @Then("enter mandatory fields like lead name {string}  and mobile number {string}  Account name {string}")
    public void enterMandatoryFieldsLikeLeadNameAndMobileNumberAccountName(String leadName, String mobileNumber, String accountName) {
        leadsSteps.enterDetailsToCreatelead(leadName, mobileNumber, accountName);

    }
    @And("user should be able to view tabs Overview,More Information,Other in Create Leads window")
    public void userShouldBeAbleToViewTabsInCreateLeadsWindow() {
        leadsSteps.verifyTabs();
    }

    @Then("user should be navigated to LEADS Create Page")
    public void userShouldBeNavigatedToLEADSCreatePage() {
        leadsSteps.userShouldBeNavigatedToLEADSCreatePage();
    }

}

