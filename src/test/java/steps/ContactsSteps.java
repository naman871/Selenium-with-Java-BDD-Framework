package steps;

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
