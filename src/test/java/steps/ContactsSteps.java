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
}
