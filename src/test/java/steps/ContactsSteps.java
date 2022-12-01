package steps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.AccountPage;
import pages.ContactsPage;
import pages.HomePage;

public class ContactsSteps extends CommonSteps {

        private static final Logger logger = LogManager.getLogger(ContactsSteps.class);

        public ContactsPage contactsPage ;
        public HomePage homePage;
    public void clickContactsdropdown() {
        contactsPage = new ContactsPage(driver);
        contactsPage.contactsDropdown.click();

    }

    public void clickOncreatecontacts() {
        contactsPage = new ContactsPage(driver);
        //driver.findElement(By.xpath("(//a[contains(text(),' Create Contact')])[1]")).click();
        contactsPage.createContacts.click();
    }

    public void enterdetailsonCreatecontactpage() {
        contactsPage = new ContactsPage(driver);
        contactsPage.fristName.sendKeys("Mithin");
        contactsPage.lastName.sendKeys("samuel");

    }

    public void validateCreatePage() {
        contactsPage = new ContactsPage(driver);
        Assert.assertTrue(contactsPage.createContactsLabel.isDisplayed());

    }
    public void navigateToContactModule() {
        contactsPage = new ContactsPage (driver);
        contactsPage.contactModule.click();
    }
    public void contactModuleDisplaySubmodules() throws InterruptedException {
        contactsPage = new ContactsPage (driver);
        contactsPage.createAccountOption.isDisplayed();
        contactsPage.createContactsForVcartOption.isDisplayed();
        contactsPage.viewedContactsOption.isDisplayed();
        //contactsPage.contactModuleDropdown.isDisplayed();
    }
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pages.ContactsPage;
import pages.HomePage;

public class ContactsSteps extends CommonSteps{
    private static final Logger logger = LogManager.getLogger(HomePageSteps.class);

    public ContactsPage contactsPage;

    public void clickOnCreateContact() {
        contactsPage = new ContactsPage(this.driver);
        contactsPage.createContact.click();

    }

    public void clickOnViewContact() {
        contactsPage = new ContactsPage(this.driver);
        contactsPage.viewContact.click();
    }

    public void enterDetailsInFields(){
        contactsPage = new ContactsPage(this.driver);
        contactsPage.firstName.sendKeys("Mark");
        contactsPage.lastName.sendKeys("zucker");
    }

    public void clickOnSaveButton(){
        contactsPage = new ContactsPage(this.driver);
        contactsPage.saveButton.click();

    }

    public void clickOnEditButton(){
        contactsPage = new ContactsPage(this.driver);
        contactsPage.editButton.click();

    }

}
