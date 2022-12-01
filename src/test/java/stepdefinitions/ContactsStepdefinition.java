package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import steps.CommonSteps;
import steps.ContactsSteps;
import steps.HomePageSteps;

public class ContactsStepdefinition {

    public ContactsSteps contactsSteps = new ContactsSteps();

    public CommonSteps commonSteps = new CommonSteps();

    @And("User is able to select create contact")
    public void clickOnCreateContact() {
        contactsSteps = new ContactsSteps();
        contactsSteps.clickOnCreateContact();

    }


    @And("User is able to select view contact")
    public void clickOnViewContact() {
        contactsSteps = new ContactsSteps();
        contactsSteps.clickOnViewContact();
    }

    @Then("User Enters required details")
    public void enterDetailsInFileds() {
        contactsSteps = new ContactsSteps();
        contactsSteps.enterDetailsInFields();

    }

    @And("Click on Save button")
    public void clickOnSaveButton() {
        contactsSteps = new ContactsSteps();
        contactsSteps.clickOnSaveButton();
    }

    @Then("User Clicks on Edit Button")
    public void clickOnEditButton(){
        contactsSteps = new ContactsSteps();
        contactsSteps.clickOnEditButton();

    }

}
