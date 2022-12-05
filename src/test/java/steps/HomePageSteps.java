package steps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pages.CommonPage;
import pages.HomePage;

public class HomePageSteps extends CommonSteps {

    private static final Logger logger = LogManager.getLogger(HomePageSteps.class);

    public HomePage homePage;


    public void verifySuiteCRMDashBoardButton() {
        homePage = new HomePage(driver);
        driver.switchTo().frame(homePage.iframeForHomepage);
        homePage.suiteCrmDashboardButton.isDisplayed();

    }

    public void clickOpportunitiesModule() {
        homePage = new HomePage(driver);
        driver.switchTo().frame(homePage.iframeForHomepage);
        homePage.opportunitiesModule.click();
    }

    public void clickOnHomePage() {
        homePage = new HomePage(driver);
        homePage.homePageButton.click();
    }

    public void verifyMyCallsLabel() {
        homePage = new HomePage(driver);
        driver.switchTo().frame(homePage.iframeForHomepage);
        //driver.switchTo().frame(homePage.iframeForHomepage);
        Assert.assertTrue(homePage.myCallsLabel.isDisplayed());
    }

    public void validateSuiteCRM() {
        homePage = new HomePage(driver);
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src=\"./legacy/index.php?module=Home\"]")));
        homePage.suiteCrmDashboardButton.isDisplayed();
    }

    public void validateHomepageDashboard() {
        homePage = new HomePage(driver);
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src=\"./legacy/index.php?module=Home\"]")));
        Assert.assertTrue(homePage.myaccounts.isDisplayed());
        Assert.assertTrue(homePage.mycalls.isDisplayed());
        Assert.assertTrue(homePage.myleads.isDisplayed());
        Assert.assertTrue(homePage.myactivitystream.isDisplayed());
        Assert.assertTrue(homePage.mymeetings.isDisplayed());
        Assert.assertTrue(homePage.mytopopenoppurtunities.isDisplayed());
    }

    public void validateErrorMessage() {
        homePage = new HomePage(driver);
        Assert.assertTrue(homePage.InvalidErrorMsg.isDisplayed());

    }

    public void validateMissingMessage() {
        homePage = new HomePage(driver);
        Assert.assertTrue(homePage.MissingErrorMsg.isDisplayed());
    }


    public void clickContactsModule() {
        homePage = new HomePage(driver);
        homePage.contactsModule.click();

    }


}