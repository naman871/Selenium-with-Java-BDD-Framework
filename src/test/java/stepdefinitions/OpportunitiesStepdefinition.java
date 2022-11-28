package stepdefinitions;

import io.cucumber.java.en.And;
import steps.OpportunitiesSteps;

public class OpportunitiesStepdefinition {

    OpportunitiesSteps opportunitiesSteps = new OpportunitiesSteps();

    @And("clicks on create opportunity under opportunities dropdown")
    public void clickOnCreateOpportunity(){
        opportunitiesSteps.clickCreateOpportunities();
    }




}
