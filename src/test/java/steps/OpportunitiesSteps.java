package steps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import pages.OpportunitiesPage;

public class OpportunitiesSteps extends CommonSteps {

    private static final Logger logger = LogManager.getLogger(OpportunitiesSteps.class);
    Actions a;
    public OpportunitiesPage opportunitiesPage;

    public void clickOpportunities() {
        opportunitiesPage = new OpportunitiesPage(driver);
        opportunitiesPage.opportunity.click();
    }
    public void clickViewOpporunities() {
        opportunitiesPage = new OpportunitiesPage(driver);
        opportunitiesPage.viewOpportunities.click();
    }

    public void createOpportunity() {
        opportunitiesPage = new OpportunitiesPage(driver);
        opportunitiesPage.createOpportunity.click();
    }

    /**
     * @Author - Naman
     * Usage - This method is used to enter details for creating opportunity
     * @param opportunityName
     * @param salesStageName
     * @param amount
     * @param date
     * @param accountName
     */

    public void enterDetailsToCreateOpportunity(String opportunityName, String salesStageName, String amount, String date, String accountName) {
        Actions actions = new Actions(driver);
        opportunitiesPage = new OpportunitiesPage(driver);
        opportunitiesPage.opportunitiyName.sendKeys(opportunityName);
        logger.info(opportunityName);
        opportunitiesPage.enterAccountName.sendKeys(accountName);
        logger.info(accountName);
        opportunitiesPage.salesStage.sendKeys(salesStageName);
        logger.info(salesStageName);
        actions.doubleClick().click(opportunitiesPage.prospecting);
        opportunitiesPage.oppportunityAmount.sendKeys(amount);
        logger.info(amount);
        opportunitiesPage.expectedClosedDate.sendKeys(date);
        logger.info(date);
        opportunitiesPage.saveButton.click();
    }

    public void clickRecentlyView() {
        opportunitiesPage = new OpportunitiesPage(driver);
        opportunitiesPage.recentlyViewedItem.click();
    }

    public void verifySubModules() {
        opportunitiesPage = new OpportunitiesPage(driver);
        Assert.assertTrue(opportunitiesPage.createOpportunity.isDisplayed());
        Assert.assertTrue(opportunitiesPage.viewOpportunities.isDisplayed());
        Assert.assertTrue(opportunitiesPage.importOpportunities.isDisplayed());
    }

    public void selectFirstOpportunityFromOpportunitiesGridUnderViewOpportunities() throws InterruptedException {
        opportunitiesPage = new OpportunitiesPage(driver);
        Assert.assertTrue(opportunitiesPage.opportunitiesGridFirstOpportunity.isDisplayed());
        Thread.sleep(7000);
        opportunitiesPage.opportunitiesGridFirstOpportunity.click();

    }
    public void verifyOpportunitiesLabel(){
        opportunitiesPage = new OpportunitiesPage(driver);
        opportunitiesPage.opportunitiesLabel.isDisplayed();
    }
    public void clickOnEditButton(){
        opportunitiesPage = new OpportunitiesPage(driver);
        opportunitiesPage.editButton.click();
    }

    /**
     * @Author - Naman
     *
     * @ This method is used to modify 2 paramaters while updating opportunity
     * @param opportunityName
     * @param amount
     */
    public void updateOpportunityNameAndOpportunityAmount(String opportunityName,String amount){
        opportunitiesPage = new OpportunitiesPage(driver);
        String preModifiedOpportunityName = opportunitiesPage.opportunitiyName.getText();
        logger.info(preModifiedOpportunityName);
        Assert.assertNotEquals(preModifiedOpportunityName,opportunityName);
        opportunitiesPage.opportunitiyName.clear();
        opportunitiesPage.opportunitiyName.sendKeys(opportunityName);
        logger.info(opportunityName);
        String preModifiedOpportunityamount = opportunitiesPage.oppportunityAmount.getText();
        Assert.assertNotEquals(preModifiedOpportunityamount,amount);
        logger.info(preModifiedOpportunityamount);
        opportunitiesPage.oppportunityAmount.sendKeys(amount);
        logger.info(amount);

    }
    public void clickDuplicateButton(){
        opportunitiesPage = new OpportunitiesPage(driver);
        opportunitiesPage.duplicateButton.click();
    }
    public void clickOnSaveButton(){
        opportunitiesPage = new OpportunitiesPage(driver);
        opportunitiesPage.saveButton.click();
    }
    public void clickOnActionDropDown(){
        opportunitiesPage = new OpportunitiesPage(driver);
        opportunitiesPage.actionDropdownButton.click();
    }
    public void clickOnFirstCheckboxFromOpportunityGrid(){
        opportunitiesPage = new OpportunitiesPage(driver);
        opportunitiesPage.firstCheckboxFromOpportunityGrid.click();
    }
    public void clickOnDeleteButton(){
        opportunitiesPage = new OpportunitiesPage(driver);
        opportunitiesPage.deleteButton.click();
        opportunitiesPage.proceedButton.click();
    }
    public void findDuplicatesButton(){
        opportunitiesPage = new OpportunitiesPage(driver);
        opportunitiesPage.findDuplicatesButton.click();
        driver.switchTo().frame(opportunitiesPage.iframeForNextStepButton);
        opportunitiesPage.nextStepButton.click();
    }
    public void clickOnFilterButton(){
        opportunitiesPage = new OpportunitiesPage(driver);
        opportunitiesPage.filterButton.click();
    }

    /**
     * @author- Naman
     * This method is used to enter filter criteria which is opportunity name for filter criteria
     * @param opportunityName
     */
    public void enterFilterCriteria(String opportunityName) throws InterruptedException {
        opportunitiesPage.opportunitiyName.sendKeys(opportunityName);
        opportunitiesPage.searchButton.click();
        Thread.sleep(9000);

    }

}
