package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import steps.LeadsSteps;

public class LeadsStepdefinition {
        public LeadsSteps leadsSteps =new LeadsSteps();
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
    }

