package steps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pages.AccountPage;
import pages.CommonPage;
import pages.ContactsPage;
import pages.HomePage;

import static steps.CommonSteps.driver;

public class ContactsSteps {
    private static final Logger logger = LogManager.getLogger(AccountSteps.class);

    public ContactsPage contactsPage;
    public CommonPage commonPage;
    public HomePage homePage;


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
}
