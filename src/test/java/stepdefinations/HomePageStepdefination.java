package stepdefinations;

import io.cucumber.java.en.Then;
import steps.CommonSteps;
import steps.HomePageSteps;

public class HomePageStepdefination {

    public HomePageSteps homePageSteps = new HomePageSteps();

    public CommonSteps commonSteps = new CommonSteps();


    @Then("User is on HomePage")
    public void userIsOnHomePage() throws InterruptedException {
        Thread.sleep(8000);
        homePageSteps.clickOnHomePage();

    }

    @Then("clicks on Opportunities")
    public void clicksOnOpportunities() throws InterruptedException {
        homePageSteps.clickOpportunitiesModule();
        Thread.sleep(5000);
        commonSteps.closeBrowser();
    }
}
