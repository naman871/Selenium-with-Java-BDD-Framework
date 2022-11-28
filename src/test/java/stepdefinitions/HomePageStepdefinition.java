package stepdefinitions;

import io.cucumber.java.en.Then;
import steps.CommonSteps;
import steps.HomePageSteps;

public class HomePageStepdefinition {

    public HomePageSteps homePageSteps = new HomePageSteps();

    public CommonSteps commonSteps = new CommonSteps();


    @Then("user is on HomePage")
    public void userIsOnHomePage() throws InterruptedException {
        Thread.sleep(8000);
        homePageSteps.verifyMyCallsLabel();

    }

    @Then("clicks on Opportunities")
    public void clicksOnOpportunities() throws InterruptedException {
        homePageSteps.clickOpportunitiesModule();
        Thread.sleep(5000);
        commonSteps.closeBrowser();
    }
}
