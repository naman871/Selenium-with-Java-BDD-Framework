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

    @And("user clicks on opportunities module")
    public void userClicksOnOpportunitiesModule() {
        opportunitiesSteps.clickOpportunities();
    }

    @Then("user verify submodules are displayed under opportunities")
    public void userVerifySubmodulesAreDisplayedUnderOpportunies() {
        opportunitiesSteps.verifySubModules();
    }

    @And("click on view opportunities")
    public void clickOnViewOpportunities() {
        opportunitiesSteps.clickOpportunities();
        opportunitiesSteps.clickViewOpporunities();
    }

    @Then("select opportunities from table")
    public void selectOpportunitiesFromTable() throws InterruptedException {
        opportunitiesSteps.verifyOpportunitiesLabel();
        opportunitiesSteps.selectFirstOpportunityFromOpportunitiesGridUnderViewOpportunities();

    }

    @And("click on Edit button")
    public void clickOnEditButton() {
        opportunitiesSteps.clickOnEditButton();
    }

    @Then("enter a new opportunity name {string} and amount {string}")
    public void enterANewOpportunityName(String opportunityName,String amount) {
        opportunitiesSteps.updateOpportunityNameAndOpportunityAmount(opportunityName, amount);
    }

    @And("select duplicate from action dropdown")
    public void selectDuplicateFromActionDropdown() {
        opportunitiesSteps.clickOnActionDropDown();
        opportunitiesSteps.clickDuplicateButton();

    }
    @And("click on Save Button")
    public void clickOnSaveButton(){
        opportunitiesSteps.clickOnSaveButton();
    }

    @Then("select first checkbox for opportunity grid")
    public void selectFirstCheckboxForOpportunityGrid() {
        opportunitiesSteps.clickOnFirstCheckboxFromOpportunityGrid();

    }

    @And("select delete from action dropdown")
    public void selectDeleteFromActionDropdown() {
        opportunitiesSteps.clickOnActionDropDown();
        opportunitiesSteps.clickOnDeleteButton();

    }

    @And("select find duplicates from action dropdown")
    public void selectFindDuplicatesFromActionDropdown() {
        opportunitiesSteps.clickOnActionDropDown();
        opportunitiesSteps.findDuplicatesButton();
    }

    @And("click on filter")
    public void clickOnFilter() {
        opportunitiesSteps.clickOnFilterButton();
    }

    @Then("enter filter criteria as opportunity name {string}")
    public void enterFilterCriteriaAsOpportunityName(String opportunityName) throws InterruptedException {
        opportunitiesSteps.enterFilterCriteria(opportunityName);
    }
    @And("Click on  View Opportunities option")
    public void clickOnViewOpportunitiesOption() throws InterruptedException {
        opportunitiesSteps.clickOnViewOpportunities();
    }

//    @Then("enter mandatory fields like opportunity name {string} sales stage {string}")
//    public void enterManditoryFieldsUnderOpportunity(String opportunityName , String salesStageName) {
//        opportunitiesSteps.enterDetailsToCreateOpportunity(opportunityName,salesStageName);
//    }

    @Then("Select checkbox beside {string} dropdown")
    public void selectCheckboxBesideBulkActionDropdown() {
        opportunitiesSteps.selectAllCheckbox();
    }

    @And("Click on {string} dropdown")
    public void clickOnBulkActionDropdown() throws InterruptedException {
        opportunitiesSteps.clickOnBulkActionDropdown();
    }

    @Then("User able to view Delete,Export,Merge,Mass updates options")
    public void userAbleToViewDeleteExportMergeMassUpdatesOptions() {
        opportunitiesSteps.verifyDropdown();
    }
    @Then("Select one Checkbox \\(Record) under Opportunities Grid")
    public void selectOneCheckboxRecordUnderOpportunitiesGrid() throws InterruptedException {
        opportunitiesSteps.selectRecord();
    }

    @Then("Select Mass Update link")
    public void selectMassUpdateLink() {
        opportunitiesSteps.SelectMassUpdate();
    }

}
