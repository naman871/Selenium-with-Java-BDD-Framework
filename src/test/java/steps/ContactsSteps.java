package steps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.ContactsPage;
import pages.HomePage;

public class ContactsSteps extends CommonSteps {

    private static final Logger logger = LogManager.getLogger(ContactsSteps.class);

    public ContactsPage contactsPage;

    public void clickContactsdropdown() {
        contactsPage = new ContactsPage(driver);
        contactsPage.contactsDropdown.click();

    }

    public void clickOncreatecontacts() {
        contactsPage = new ContactsPage(driver);
        driver.findElement(By.xpath("(//a[contains(text(),' Create Contact')])[1]")).click();
        //contactsPage.createContacts.click();
    }

    public void enterdetailsonCreatecontactpage(String firstname,String lastname) {
        contactsPage = new ContactsPage(driver);
        contactsPage.firstName.sendKeys(firstname);
        logger.info("First name is entered"+firstname);
        contactsPage.lastName.sendKeys(lastname);
        logger.info("Last name is entered"+lastname);

    }

    public void validateCreatePage() {
        contactsPage = new ContactsPage(driver);
        Assert.assertTrue(contactsPage.createContactsLabel.isDisplayed());

    }

    public void navigateToContactModule() {
        contactsPage = new ContactsPage(driver);
        contactsPage.contactModule.click();
    }

    public void contactModuleDisplaySubmodules() throws InterruptedException {
        contactsPage = new ContactsPage(driver);
        contactsPage.createAccountOption.isDisplayed();
        contactsPage.createContactsForVcartOption.isDisplayed();
        contactsPage.viewedContactsOption.isDisplayed();
        //contactsPage.contactModuleDropdown.isDisplayed();
    }


//    public void clickOnCreateContact() {
//        contactsPage = new ContactsPage(this.driver);
//        contactsPage.createContacts.click();
//
//    }
  public void clickOnCreateContact() {
      contactsPage = new ContactsPage(this.driver);
      contactsPage.createContacts.click();

   }

    public void clickOnViewContact() {
        contactsPage = new ContactsPage(driver);
        contactsPage.viewContact.click();
    }

//    public void enterDetailsInFields() {
//        contactsPage = new ContactsPage(this.driver);
//        contactsPage.firstName.sendKeys("Mark");
//        contactsPage.lastName1.sendKeys("zucker");
//    }


    public void clickOnEditButton() {
        contactsPage = new ContactsPage(driver);
        contactsPage.editButton.click();

    }

    public void DeleteContact() {
        contactsPage = new ContactsPage(driver);
        //contactsPage.delete.click();
        driver.findElement(By.xpath("//div[text()=' Delete ']")).click();
        contactsPage.proceed.click();

    }
    public void clickOnCancelButton() {
        contactsPage = new ContactsPage(this.driver);
        contactsPage.cancelButton.click();
    }

    public void clickContactsModule() {
        contactsPage = new ContactsPage(this.driver);
        contactsPage.contactModule.click();


    }

}
