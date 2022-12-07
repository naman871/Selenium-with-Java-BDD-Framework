package stepdefinitions;

import io.cucumber.java.en.When;
import steps.AccountSteps;
import steps.CommonSteps;
import steps.ContactsSteps;

import io.cucumber.java.en.When;
import steps.CommonSteps;
import steps.ContactsSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import steps.CommonSteps;
import steps.ContactsSteps;
import steps.HomePageSteps;

public class ContactsStepdefinition {
    public ContactsSteps contactsSteps = new ContactsSteps();

    @When("Navigate to contact module")
    public void clickOnAccountDropdown() throws InterruptedException {
        Thread.sleep(8000);
        contactsSteps.navigateToContactModule();
    }

    @When("contact Dropdown should display submodules")
    public void contactModuleDisplaySubmodules() throws InterruptedException {
        Thread.sleep(8000);
        contactsSteps.contactModuleDisplaySubmodules();
    }


    @When("click on Contacts dropdown")
    public void clickonContactsdropdown() throws InterruptedException {
        Thread.sleep(8000);
        contactsSteps.clickContactsdropdown();

    }


    @And("click on create contacts")
    public void clickOnCreateContacts() {
        contactsSteps.clickOncreatecontacts();
    }

    @Then("enter required details on create contacts page")
    public void enterRequiredDetailsOnCreateContactsPage() {
        contactsSteps.enterdetailsonCreatecontactpage();

    }

    @Then("Validate create page")
    public void validateCreatePage() {
        contactsSteps.validateCreatePage();
    }


//    @And("User is able to select create contact")
//    public void clickOnCreateContact() {
//        contactsSteps = new ContactsSteps();
//        contactsSteps.clickOnCreateContact();
//
//    }


    @And("user is able to select view contact")
    public void clickOnViewContact() {
        contactsSteps = new ContactsSteps();
        contactsSteps.clickOnViewContact();
    }

//    @Then("User Enters required details")
//    public void enterDetailsInFileds() {
//        contactsSteps = new ContactsSteps();
//        contactsSteps.enterDetailsInFields();
//
//    }

//    @And("Click on Save button")
//    public void clickOnSaveButton() {
//        contactsSteps = new ContactsSteps();
//        contactsSteps.clickOnSaveButton();
//    }

    @Then("user Clicks on Edit Button")
    public void clickOnEditButton() {
        contactsSteps = new ContactsSteps();
        contactsSteps.clickOnEditButton();

    }

    @Then("Delete the contact")
    public void deleteTheContact() {
        contactsSteps = new ContactsSteps();
        contactsSteps.DeleteContact();
    }
    @Then("user clicks on cancel button")
    public void clickOnCancelButton() {
        contactsSteps = new ContactsSteps();
        contactsSteps.clickOnCancelButton();
    }

    @Then("clicks on Contacts")
    public void clicksOnContact() throws InterruptedException {
        contactsSteps = new ContactsSteps();
        contactsSteps.clickContactsModule();
        Thread.sleep(1000);

    }
}
