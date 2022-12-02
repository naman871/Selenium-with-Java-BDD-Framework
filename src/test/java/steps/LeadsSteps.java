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
import pages.AccountPage;
import pages.LeadsPage;
import pages.CommonPage;
import pages.HomePage;

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
        leadsPage.createleadpage.isDisplayed();
    }
}
