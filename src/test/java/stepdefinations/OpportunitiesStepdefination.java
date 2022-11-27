package stepdefinations;

import io.cucumber.java.en.And;
import pages.OpportunitiesPage;
import steps.OpportunitiesSteps;

public class OpportunitiesStepdefination {

    OpportunitiesSteps opportunitiesSteps = new OpportunitiesSteps();

    @And("clicks on create opportunitiy with type {string}")
    public void createOpportunity(){

    }



}
