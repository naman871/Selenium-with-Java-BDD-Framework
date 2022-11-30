package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import steps.CommonSteps;
import steps.HomePageSteps;

public class HomePageStepdefinition {

    public HomePageSteps homePageSteps = new HomePageSteps();

    public CommonSteps commonSteps = new CommonSteps();


    @Then("user is on HomePage")
    public void userIsOnHomePage() throws InterruptedException {
        Thread.sleep(8000);
        homePageSteps.clickOnHomePage();

    }

    @Then("Validate SuiteCRM DashBoard")
    public void validateSuiteCRMDashBoard() {
        homePageSteps.validateSuiteCRM();
    }

    @Then("clicks on Opportunities")
    public void clicksOnOpportunities() throws InterruptedException {
        homePageSteps.clickOpportunitiesModule();
        Thread.sleep(5000);
        commonSteps.closeBrowser();
    }

    @Then("Validate Homepage DashBoard")
    public void validateHomepageDashBoard() {
        homePageSteps.validateHomepageDashboard();
    }

    @Then("user validates invalid error message")
    public void userValidatesInvalidErrorMessage() {
        homePageSteps.validateErrorMessage();
    }

    @Then("Validate Missing Message")
    public void validateMissingMessage() {
        homePageSteps.validateMissingMessage();
    }

    @Then("clicks on Contacts")
    public void clicksOnContact() throws InterruptedException {
        homePageSteps = new HomePageSteps();
        homePageSteps.clickContactsModule();
        Thread.sleep(1000);

    }

    @And("User is able to select create contact")
    public void clickOnCreateContact() {
        homePageSteps = new HomePageSteps();
        homePageSteps.clickOnCreateContact();

    }


    @And("User is able to select view contact")
    public void clickOnViewContact() {
        homePageSteps = new HomePageSteps();
        homePageSteps.clickOnViewContact();
    }
}

