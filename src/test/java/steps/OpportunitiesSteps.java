package steps;

import io.cucumber.datatable.DataTable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import pages.OpportunitiesPage;

public class OpportunitiesSteps extends CommonSteps {

    private static final Logger logger = LogManager.getLogger(OpportunitiesSteps.class);
    Actions a ;
    public OpportunitiesPage opportunitiesPage;

    public void clickOpportunities() {
        opportunitiesPage = new OpportunitiesPage(driver);
        opportunitiesPage.opportunity.click();
    }

    public void viewOppotunities() {
        opportunitiesPage = new OpportunitiesPage(driver);
        opportunitiesPage.viewOpportunities.click();

    }
    public void createOpportunity(){
        opportunitiesPage = new OpportunitiesPage(driver);
        opportunitiesPage.createOpportunity.click();
    }

    public void enterDetailsToCreateOpportunity(String opportunityName ,String salesStageName){
        Actions actions = new Actions(driver);
        opportunitiesPage = new OpportunitiesPage(driver);
        opportunitiesPage.opportunitiyName.sendKeys(opportunityName);
        opportunitiesPage.salesStage.sendKeys(salesStageName);
        actions.doubleClick().click(opportunitiesPage.prospecting);



    }

}
