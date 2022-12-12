package steps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.AccountPage;
import pages.CommonPage;
import pages.HomePage;
public class AccountSteps extends CommonSteps {
    private static final Logger logger = LogManager.getLogger(AccountSteps.class);
    public AccountPage accountPage;
    public CommonPage commonPage;
    public HomePage homePage;
    public void clickAccountDropdown() {
        accountPage = new AccountPage(driver);
        //driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src=\"./legacy/index.php?module=Home\"]")));
        accountPage.accountDropdown.click();
    }
    public void verifyAccountDropdownoptions() {
        accountPage = new AccountPage(driver);
        Assert.assertTrue(accountPage.createAccount.isDisplayed());
        Assert.assertTrue(accountPage.viewAccount.isDisplayed());
        Assert.assertTrue(accountPage.importAccount.isDisplayed());
    }
    public void validatecreateaccountPage() {
        accountPage = new AccountPage(driver);
        accountPage.createAccountPage.isDisplayed();
    }public void clickcreateaccount() throws InterruptedException {
        accountPage = new AccountPage(driver);
        Thread.sleep(2000);
        accountPage.createAccount.click();


    }public void clickViewAccount() {
        accountPage = new AccountPage(driver);
        accountPage.viewAccount.click();
    }

    public void validateAccountspage() {
        accountPage = new AccountPage(driver);
        Assert.assertTrue(accountPage.viewAccountList.isDisplayed());
    }

    public void enterrequireddetails(String name) throws InterruptedException {
        accountPage = new AccountPage(driver);
        // driver.switchTo().frame(homePage.iframeForHomepage);
        Thread.sleep(5000);
        accountPage.name.sendKeys(name);
        logger.info("Required details in entering -->"+name);
    }

    public void clickSave() {
        accountPage = new AccountPage(driver);
        Assert.assertTrue(accountPage.save.isEnabled());
        accountPage.save.click();
    }

    public void validateSavedAccount() {
        accountPage = new AccountPage(driver);
        Assert.assertTrue(accountPage.savedAccount.isDisplayed());
    }

    public void deleteAccount() {
        accountPage = new AccountPage(driver);
        accountPage.actiondropdown.click();
        accountPage.delete.click();
        driver.findElement(By.xpath("(//button[@type='button'])[20]")).click();
    }

    public void navigateToAccountModule() {
        accountPage = new AccountPage(driver);
        accountPage.accountModule.click();
    }

    public void createAccountOptionFromDropdown() {
        accountPage = new AccountPage(driver);
        accountPage.createAccountModule.click();
        //create
    }
//    public void FieldsEmptyAndClickOnSaveButton() {
//        accountPage = new AccountPage(driver);
//        accountPage.saveButton.click();
//    }

    public void errorMessageShouldBeDisplayed(String errorMessage) {
        accountPage = new AccountPage(driver);
        String errorMessageText = accountPage.errorMessage.getText();
        System.out.println(errorMessageText);
        Assert.assertEquals("There are validations error, unable to perform actions", errorMessageText, errorMessage);
        Assert.assertTrue(accountPage.errorMessage.isDisplayed());
    }

    public void fillAllTheRequiredField(String name, String website, String billingAddress, String billingPostalCode) {
        accountPage = new AccountPage(driver);
        accountPage.nameLabel.isDisplayed();
        accountPage.nameTextBox.sendKeys(name);
        logger.info("Account Name is -->"+name);
        accountPage.websiteTextBox.sendKeys(website);
        logger.info("Website Name is -->"+website);
        accountPage.billingStreetTextBox.sendKeys(billingAddress);
        logger.info("BillingAddress is -->"+billingAddress);
        accountPage.billingCoastleTextbox.sendKeys(billingPostalCode);
        logger.info("BillingPostalCode is -->"+billingPostalCode);
    }

    public void clickOnSaveButton() throws InterruptedException {
        accountPage = new AccountPage(driver);
        accountPage.saveButton.click();
        Thread.sleep(5000);
    }

    public void clickOnEditButton() throws InterruptedException {
        accountPage = new AccountPage(driver);
        accountPage.editButton.click();
        Thread.sleep(2000);
    }
    public void afterCompletionOfEditingClickOnSave() {
        accountPage = new AccountPage(driver);
        accountPage.editButton.click();
        accountPage.nameTextBoxEdit.clear();
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

    public void clickOnNewButton(String New) {
        accountPage = new AccountPage(driver);
        accountPage.newButton.click();
    }

    public void createPageDisplayed() {
        accountPage = new AccountPage(driver);
        Assert.assertTrue(accountPage.createPage.isDisplayed());
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


