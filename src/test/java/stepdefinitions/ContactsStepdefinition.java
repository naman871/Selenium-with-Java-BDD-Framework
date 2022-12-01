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

public class ContactsStepdefinition {
    public ContactsSteps contactsSteps = new ContactsSteps();
    public CommonSteps commonSteps = new CommonSteps();

    @When("Navigate to contact module")
    public void clickOnAccountDropdown() throws InterruptedException {
        Thread.sleep(8000);
        contactsSteps.navigateToContactModule();
    }
    @When("Contact Dropdown should display submodules")
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
        //Thread.sleep(8000);
        contactsSteps.clickOncreatecontacts();
    }

    @Then("Enter required details on create contacts page")
    public void enterRequiredDetailsOnCreateContactsPage() {
        contactsSteps.enterdetailsonCreatecontactpage();

    }

    @Then("Validate create page")
    public void validateCreatePage() {
        contactsSteps.validateCreatePage();
    }
}
