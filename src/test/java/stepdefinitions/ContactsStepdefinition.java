package stepdefinitions;

import io.cucumber.java.en.When;
import steps.AccountSteps;
import steps.CommonSteps;
import steps.ContactsSteps;

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


}
