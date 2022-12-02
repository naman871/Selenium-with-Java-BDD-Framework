package steps;

import org.junit.Assert;
import pages.HomePage;
import pages.LeadsPage;

public class LeadsSteps extends CommonSteps{
    LeadsPage leadsPage;
    public void clickLeadsModule() {
        leadsPage= new LeadsPage(this.driver);
        leadsPage.leadsModule.click();
    }
    public void clicksOnCreateLeads() {
        leadsPage= new LeadsPage(this.driver);
        leadsPage.CreateLeads.click();
    }
    public void enterAllTheMandatoryFields() throws InterruptedException {
        leadsPage = new LeadsPage(this.driver);
        leadsPage.FirstName.click();
        Thread.sleep(5000);
        leadsPage.FirstName.sendKeys("sukanya");
        Thread.sleep(5000);
        leadsPage.LastName.sendKeys("J");
    }
    public void cancelButtonLeads(){
        leadsPage = new LeadsPage(this.driver);
        leadsPage.CancelButtonLeads.click();
    }
    public void verifyWarningMessage() throws InterruptedException {
        leadsPage = new LeadsPage(this.driver);
        String s=leadsPage.VerifyWarningMessage.getText();
        System.out.print(s);
        leadsPage.CancelButtonLeadsPopupwindow.isDisplayed();
        leadsPage.OkButtonLeadsPopupwindow.isDisplayed();
    }
    public void verifyTabs(){
        leadsPage = new LeadsPage(this.driver);
        Assert.assertTrue("Overview tab is not displayed",leadsPage.OverviewTab.isDisplayed());
        Assert.assertTrue("Other tab is not displayed",leadsPage.OtherTab.isDisplayed());
        Assert.assertTrue("MoreInformation tab is not displayed",leadsPage.MoreInformationTab.isDisplayed());
    }
    public void searchBoxLeadsModule(){
        leadsPage = new LeadsPage(this.driver);
        Assert.assertTrue("search box is not displayed",leadsPage.SearchBoxLeads.isDisplayed());
    }
    public void clickOnCancelButtonOnPopupWindow() throws InterruptedException {
        leadsPage = new LeadsPage(this.driver);
        Thread.sleep(5000);
        leadsPage.CancelButtonLeadsPopupwindow.click();
    }
    public void clickOnOkButtonOnPopupWindow() throws InterruptedException {
        leadsPage = new LeadsPage(this.driver);
        Thread.sleep(5000);
        leadsPage.OkButtonLeadsPopupwindow.click();
    }

}

