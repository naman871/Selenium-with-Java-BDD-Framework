package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import steps.OpportunitiesSteps;

public class OpportunitiesStepdefinition {

    OpportunitiesSteps opportunitiesSteps = new OpportunitiesSteps();

    @And("clicks on create opportunity under opportunities dropdown")
    public void clickOnCreateOpportunity(){
        opportunitiesSteps.clickOpportunities();
        opportunitiesSteps.createOpportunity();
    }

    @Then("enter mandatory fields like opportunity name {string} sales stage {string} and amount {string} date {string} Account name {string}")
    public void enterManditoryFieldsUnderOpportunity(String opportunityName,String salesStageName,String amount,String date,String accountName) {
        opportunitiesSteps.enterDetailsToCreateOpportunity(opportunityName,salesStageName,amount,date,accountName);
    }

    @And("clicks on recently viewed items under opportunities dropdown")
    public void clicksOnRecentlyViewedItemsUnderOpportunitiesDropdown() {
        opportunitiesSteps.clickOpportunities();
        opportunitiesSteps.clickRecentlyView();
    }
}
