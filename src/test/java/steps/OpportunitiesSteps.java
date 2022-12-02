package steps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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

    public void viewOppotunities() {
        opportunitiesPage = new OpportunitiesPage(driver);
        opportunitiesPage.viewOpportunities.click();

    }

    public void createOpportunity() {
        opportunitiesPage = new OpportunitiesPage(driver);
        opportunitiesPage.createOpportunity.click();
    }

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

}
