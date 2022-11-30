package steps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pages.HomePage;
import pages.OpportunitiesPage;

public class OpportunitiesSteps extends CommonSteps {

    private static final Logger logger = LogManager.getLogger(OpportunitiesSteps.class);

    public OpportunitiesPage opportunitiesPage;

    public void clickCreateOpportunities() {
        opportunitiesPage = new OpportunitiesPage(driver);
        opportunitiesPage.createOpporunity.click();
    }

    public void viewOppotunities() {
        opportunitiesPage = new OpportunitiesPage(driver);
        opportunitiesPage.viewOpportunities.click();

    }

}
