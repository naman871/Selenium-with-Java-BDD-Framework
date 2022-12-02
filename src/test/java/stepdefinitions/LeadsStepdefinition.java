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
    public CommonSteps commonSteps = new CommonSteps();

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
    public void validateCreateLeadPage() throws InterruptedException {
        leadsSteps.validatecreateLeadPage();
    }

    @Then("clicks on Leads")
    public void clicksOnLeads() throws InterruptedException {
        leadsSteps.clickLeadsModule();
    }

    @Then("clicks on Create Leads Sub Module")
    public void clicksOnCreateLeads() throws InterruptedException {
        leadsSteps.clicksOnCreateLeads();
    }

    @Then("Enter all the mandatory Fields")
    public void enterAllTheMandatoryFields() throws InterruptedException {
        leadsSteps.enterAllTheMandatoryFields();
    }

    @And("click on Cancel Button")
    public void clickOnCancelButton() {
        leadsSteps.cancelButtonLeads();
    }

    @And("user should able to view the warning message")
    public void userShouldAbleToViewTheWarningMessage() throws InterruptedException {
        leadsSteps.verifyWarningMessage();
    }

    @And("User should be able to view tabs {string},{string},{string} in Create Leads window")
    public void userShouldBeAbleToViewTabsInCreateLeadsWindow(String arg0, String arg1, String arg2) {
        leadsSteps.verifyTabs();
    }

    @And("User should be able to view Search section in Create Lead window")
    public void userShouldBeAbleToViewSearchSectionInCreateLeadWindow() {
        leadsSteps.searchBoxLeadsModule();
    }

    @And("Click on Cancel Button on cancel popup window")
    public void clickOnCancelButtonOnPopupWindow() throws InterruptedException {
        leadsSteps.clickOnCancelButtonOnPopupWindow();
    }

    @And("Click on Cancel Button on Ok popup window")
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
        leadsSteps.enterDetailsToCreatelead(leadName,mobileNumber,accountName);

    }
}

