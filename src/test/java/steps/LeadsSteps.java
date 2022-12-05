package steps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.*;

public class LeadsSteps extends CommonSteps {
    private static final Logger logger = LogManager.getLogger(LeadsSteps.class);

    public LeadsPage leadsPage;
    public CommonPage commonPage;
    public HomePage homePage;

    public void clickLeadsDropdown() {
        leadsPage = new LeadsPage(driver);
        //driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src=\"./legacy/index.php?module=Home\"]")));
        leadsPage.leadsDropdown.click();
    }

    public void verifyLeadsDropdownoptions() {
        leadsPage = new LeadsPage(driver);
        Assert.assertTrue(leadsPage.createlead.isDisplayed());
        Assert.assertTrue(leadsPage.createleadfromvcard.isDisplayed());
        Assert.assertTrue(leadsPage.viewleads.isDisplayed());
        Assert.assertTrue(leadsPage.importleads.isDisplayed());
    }

    public void clickcreatelead() throws InterruptedException {
        leadsPage = new LeadsPage(driver);
        Thread.sleep(2000);
        leadsPage.createLeadModule.click();


    }

    public void validatecreateLeadPage() {
        leadsPage=new LeadsPage(driver);
        Assert.assertTrue(leadsPage.createleadpage.isDisplayed());
    }

    public void clickLeadsModule() {
        leadsPage= new LeadsPage(this.driver);
        leadsPage.leadsModule.click();
    }
    public void clicksOnCreateLeads() {
        leadsPage= new LeadsPage(this.driver);
        leadsPage.CreateLeads.click();
    }
    public String Lastname="J";
    public void enterAllTheMandatoryFields() throws InterruptedException {
        leadsPage = new LeadsPage(this.driver);
        leadsPage.FirstName.click();
        Thread.sleep(5000);
        leadsPage.FirstName.sendKeys("sukanya");
        Thread.sleep(5000);
        leadsPage.LastName.sendKeys();
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
    public void validateNewLeadPage() {
        leadsPage = new LeadsPage(driver);
        String name1=driver.findElement(By.xpath("//span[@class='dynamic-label ng-star-inserted']")).getText();
        Assert.assertEquals(Lastname,name1);
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

    public void clickleads() {
        leadsPage = new LeadsPage(driver);
        leadsPage.leads.click();
    }
    public void createlead() {
        leadsPage = new LeadsPage(driver);
        leadsPage.createLead.click();
    }

    public void enterDetailsToCreatelead(String leadName, String mobileNumber, String accountName) {
        Actions actions = new Actions(driver);
        leadsPage=new LeadsPage(driver);
        LeadsPage.enterleadName.sendKeys(leadName);
        logger.info(leadName);
        LeadsPage.enterAccountName.sendKeys(accountName);
        logger.info(accountName);
        LeadsPage.leadnum.sendKeys(mobileNumber);
        logger.info(mobileNumber);
    }
    public void clickOnCreateLead() throws InterruptedException {
        leadsPage = new LeadsPage(driver);
        Thread.sleep(5000);
        LeadsPage.clickLead.click();
    }
    public void verifyErrorMessage() {
        leadsPage = new LeadsPage(driver);
        Assert.assertTrue(leadsPage.ErrorMessage.isDisplayed());
    }
    public void Module(String module) throws InterruptedException {
        leadsPage = new LeadsPage(driver);
        Actions action = new Actions(driver);
        Thread.sleep(5000);
        action.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='"+module+"']"))).perform();
    }
}

