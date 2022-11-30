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
import java.util.List;

public class AccountSteps extends CommonSteps {
    private static final Logger logger = LogManager.getLogger(AccountSteps.class);
    AccountPage accountPage;

    public void navigateToAccountModule() {
        accountPage = new AccountPage(driver);
        accountPage.accountModule.click();
    }

    public void createAccountOptionFromDropdown() {
        accountPage = new AccountPage(driver);
        accountPage.createAccountModule.click();
    }

    public void FieldsEmptyAndClickOnSaveButton() {
        accountPage = new AccountPage(driver);
        accountPage.saveButton.click();
    }

    public void errorMessageShouldBeDisplayed() {
        accountPage = new AccountPage(driver);
        accountPage.errorMessage.isDisplayed();
    }

    public void fillAllTheRequiredField() {
        accountPage = new AccountPage(driver);
        accountPage.nameLabel.isDisplayed();
        accountPage.nameTextBox.sendKeys("Internet");
        accountPage.websiteLabel.isDisplayed();
        accountPage.websiteTextBox.sendKeys("www.facebook.com");

        //accountPage.officeLabel.isDisplayed();
        //accountPage.officePhoneTextbox.sendKeys("76548934");
    }

    public void clickOnSaveButton() {
        accountPage = new AccountPage(driver);
        accountPage.saveButton.click();
    }

    public void clickOnEditButton() throws InterruptedException {
        accountPage = new AccountPage(driver);
        accountPage.editButton.click();
        Thread.sleep(2000);
    }

    public void afterCompletionOfEditingClickOnSave() {
        accountPage = new AccountPage(driver);
        //Actions action = new Actions(driver);
        accountPage.nameLabel.isDisplayed();
        //accountPage.nameTextBox.sendKeys("Internet");
        accountPage.nameTextBox.click();
        //action.perform();
        accountPage.nameTextBox.sendKeys(Keys.BACK_SPACE);
        accountPage.saveButton.click();
    }

    public void clickOnCancelButton() {
        accountPage = new AccountPage(driver);
        accountPage.cancelButton.click();
    }

    public void accountPageDisplayed() {
        accountPage = new AccountPage(driver);
        accountPage.accounPage.isDisplayed();
    }

    public void clickOnOkButtonOnPopUpMessage() {
        accountPage = new AccountPage(driver);
        accountPage.okButton.click();
    }

    public void clickOnNewButton() {
        accountPage = new AccountPage(driver);
        accountPage.newButton.click();
    }

    public void createPageDisplayed() {
        accountPage = new AccountPage(driver);
        accountPage.createPage.isDisplayed();
    }

    public void clickOnActionDropdown() {
        accountPage = new AccountPage(driver);
        accountPage.actionDropdown.click();
    }

    public void actionDropdwonListDisplayed() throws InterruptedException {
        accountPage = new AccountPage(driver);
        Thread.sleep(50);
        accountPage.actionDropdowndisplay.isDisplayed();

    }
    public void clickOnDeleteButtonFromActionDropdown() {
        accountPage = new AccountPage(driver);
        accountPage.deleteOptionDropdown.click();
    }
    public void clickOnProceedButtonAndRecordDeleted() {
        accountPage = new AccountPage(driver);
        accountPage.proceedButton.click();
    }

}


