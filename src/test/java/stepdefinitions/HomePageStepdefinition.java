package stepdefinitions;

import io.cucumber.java.en.Then;
import steps.CommonSteps;
import steps.HomePageSteps;

public class HomePageStepdefinition {

    HomePageSteps homePageSteps;

    CommonSteps commonSteps;


    @Then("User is on HomePage")
    public void userIsOnHomePage() throws InterruptedException {
        Thread.sleep(8000);
        homePageSteps = new HomePageSteps();
        homePageSteps.clickOnHomePage();

    }

    @Then("clicks on Opportunities")
    public void clicksOnOpportunities() throws InterruptedException {
        homePageSteps = new HomePageSteps();
        homePageSteps.clickOpportunitiesModule();
        Thread.sleep(5000);
        commonSteps = new CommonSteps();
        commonSteps.closeBrowser();
    }
}
