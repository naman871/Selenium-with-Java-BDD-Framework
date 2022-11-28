package steps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.AccountPage;
import pages.CommonPage;
import pages.HomePage;

public class AccountSteps extends CommonSteps{
    private static final Logger logger = LogManager.getLogger(AccountSteps.class);

    public     AccountPage accountPage;
     public CommonPage commonPage;
     public HomePage homePage;


    public void clickAccountDropdown() {
        accountPage = new AccountPage(driver);
        //driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src=\"./legacy/index.php?module=Home\"]")));
        accountPage.accountDropdown.click();
    }

    public void verifyAccountDropdownoptions() {
        accountPage = new AccountPage(driver);
        Assert.assertTrue(accountPage.createaccount.isDisplayed());
        Assert.assertTrue(accountPage.viewaccount.isDisplayed());
        Assert.assertTrue(accountPage.importaccount.isDisplayed());

    }
    public void validatecreateaccountPage() {
        accountPage = new AccountPage(driver);
        accountPage.createaccountpage.isDisplayed();
    }

    public void clickcreateaccount() throws InterruptedException {
        accountPage = new AccountPage(driver);
        Thread.sleep(2000);
        accountPage.createaccount.click();


    }

    public void clickViewAccount() {
        accountPage = new AccountPage(driver);
        accountPage.viewaccount.click();
    }

    public void validateAccountspage() {
        accountPage = new AccountPage(driver);
        Assert.assertTrue(accountPage.viewaccountlist.isDisplayed());
    }

    public void enterrequireddetails() throws InterruptedException {
        accountPage = new AccountPage(driver);
       // driver.switchTo().frame(homePage.iframeForHomepage);
        Thread.sleep(5000);
        accountPage.name.sendKeys("Ganga");
    }

    public void clickSave() {
        accountPage = new AccountPage(driver);
        accountPage.save.click();
    }
    public void validateSavedAccount() {
        accountPage = new AccountPage(driver);
        Assert.assertTrue(accountPage.savedaccount.isDisplayed());
    }

    public void deleteAccount() {
       // accountPage = new AccountPage(this.driver);
        accountPage = new AccountPage(driver);
        accountPage.actiondropdown.click();
        accountPage.delete.click();
    }
}


