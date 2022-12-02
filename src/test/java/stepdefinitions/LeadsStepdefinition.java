package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import steps.AccountSteps;
import steps.LeadsSteps;
import steps.CommonSteps;

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

}
