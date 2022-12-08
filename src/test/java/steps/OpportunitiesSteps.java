package steps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import pages.OpportunitiesPage;

import java.util.List;

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
        logger.info("Opportunity Name is -->"+opportunityName);
        opportunitiesPage.enterAccountName.sendKeys(accountName);
        logger.info("Account Name is -->"+accountName);
        opportunitiesPage.salesStage.sendKeys(salesStageName);
        logger.info("Sales Stage Name  is -->"+salesStageName);
        actions.doubleClick().click(opportunitiesPage.prospecting);
        opportunitiesPage.oppportunityAmount.sendKeys(amount);
        logger.info("Amount is -->"+amount);
        opportunitiesPage.expectedClosedDate.sendKeys(date);
        logger.info("Expected Closed Date is -->"+date);
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
    public void updateOpportunityNameAndOpportunityAmount(String opportunityName,String amount) throws InterruptedException {
        opportunitiesPage = new OpportunitiesPage(driver);
        String preModifiedOpportunityName = opportunitiesPage.opportunitiyName.getText();
        logger.info("Opportunity name pre modified -->"+preModifiedOpportunityName);
        Assert.assertNotEquals(preModifiedOpportunityName,opportunityName);
        Thread.sleep(5000);
        opportunitiesPage.opportunitiyName.clear();
        opportunitiesPage.opportunitiyName.sendKeys(opportunityName);
        logger.info("Opportunity name post modified -->"+opportunityName);
        String preModifiedOpportunityamount = opportunitiesPage.oppportunityAmount.getText();
        Assert.assertNotEquals(preModifiedOpportunityamount,amount);
        logger.info("Opportunity amount pre modified -->"+preModifiedOpportunityamount);
        Thread.sleep(5000);
        opportunitiesPage.oppportunityAmount.clear();
        opportunitiesPage.oppportunityAmount.sendKeys(amount);
        logger.info("Opportunity amount post modified -->"+amount);

    }
    public void clickDuplicateButton(){
        opportunitiesPage = new OpportunitiesPage(driver);
        opportunitiesPage.duplicateButton.click();
    }
    public void clickOnSaveButton() throws InterruptedException {
        opportunitiesPage = new OpportunitiesPage(driver);
        Thread.sleep(8000);
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
    public void clickOnViewOpportunities() throws InterruptedException {
        opportunitiesPage = new OpportunitiesPage(driver);
        opportunitiesPage.ViewOpportunitiy.click();
    }

    public void selectAllCheckbox() throws InterruptedException {
        opportunitiesPage = new OpportunitiesPage(driver);
        Thread.sleep(5000);
        opportunitiesPage.SelectAllCheckbox.click();
    }

    public void clickOnBulkActionDropdown() throws InterruptedException {
        opportunitiesPage = new OpportunitiesPage(driver);
        Thread.sleep(5000);
        opportunitiesPage.bulkActionDropdown.click();
    }

    public void verifyDropdown() {
        opportunitiesPage = new OpportunitiesPage(driver);
        List<WebElement> L1=driver.findElements(By.xpath("//div[@class='dropdown-menu show']/a"));
        for (int i = 0; i < L1.size(); i++) {
            Assert.assertTrue(L1.get(i).isDisplayed());
        }
    }
    public void selectRecord() throws InterruptedException {
        opportunitiesPage = new OpportunitiesPage(driver);
        Thread.sleep(5000);
        opportunitiesPage.selectRecord.click();
        Thread.sleep(5000);
    }

    public void selectMassUpdate() throws InterruptedException {
        opportunitiesPage = new OpportunitiesPage(driver);
        Thread.sleep(5000);
        opportunitiesPage.selectMassupdate.click();
    }
}
