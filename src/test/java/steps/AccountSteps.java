package steps;


import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AccountPage;
import pages.HomePage;

public class AccountSteps extends CommonSteps {
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

}




