package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage extends PageFactory{

    @FindBy(xpath = "//a[@href='#/contacts']")
     public WebElement contactModule;

    @FindBy(xpath = "//a[normalize-space()='Contacts']")
    public WebElement contactModuleDropdown;

    @FindBy(xpath = "//a[@href='#/contacts/edit?return_module=Contacts&return_action=DetailView']")
    public WebElement createAccountOption;

    @FindBy(xpath = "//a[@href='#/contacts/importvcard']")
    public WebElement createContactsForVcartOption;

    @FindBy(xpath = "//a[@href='#/contacts/index?return_module=Contacts&return_action=DetailView']")
    public WebElement viewedContactsOption;

    @FindBy(xpath = "//li[@class='top-nav nav-item dropdown non-grouped active ng-tns-c303-1 ng-star-inserted']//div[4]//scrm-menu-item-link[1]//scrm-base-menu-item-link[1]//a[1]")
    public WebElement importOption;
//    @FindBy(xpath = "//a[@href='#/contacts']")
//    public WebElement contactsDropdown;

    @FindBy(xpath = "(//a[contains(text(),' Create Contact')])[1]")
    public WebElement createContacts;

    @FindBy(xpath = "(//input[@type='text'])[3]")
    public WebElement firstName;

    @FindBy(xpath = "//div[contains(text(),' Delete ')]")
    public WebElement delete;

    @FindBy(xpath = "(//input[@type='text'])[4]")
    public WebElement lastName;

    @FindBy(xpath="(//button[@type='button'])[20]")
    public WebElement proceed;

    @FindBy(xpath = "//span[text()='Create']")
    public WebElement createContactsLabel;

//    @FindBy(xpath = "//a[contains(text(),' Create Contact')]")
//    public WebElement createContact;



    @FindBy(xpath = "(//a[contains(text(),' View Contacts')])")
    public WebElement viewContact;



//    @FindBy(xpath = "//input[@class='form-control form-control-sm ng-pristine ng-invalid is-invalid ng-touched']")
//    public WebElement lastName1;

//    @FindBy(xpath = "//button[normalize-space()='Save']")
//    public WebElement saveButton;

    @FindBy(xpath = "//button[normalize-space()='Edit']")
    public WebElement editButton;

    @FindBy(xpath = "//button[normalize-space()='Cancel']")
    public WebElement cancelButton;

    @FindBy(xpath = "//div[contains(text(),'Delete')]")
    public WebElement deleteoption;

    @FindBy(xpath = "//div[contains(text(),'Duplicate')]")
    public WebElement duplicate;

    @FindBy(xpath = "//div[contains(text(),'View Change Log')]")
    public WebElement viewChangeLog;

    @FindBy(xpath = "//div[contains(text(),'Find Duplicates')]")
    public WebElement findDuplicates;

    @FindBy(xpath = "//div[contains(text(),'Print as PDF')]")
    public WebElement printasPDF;


    WebDriver driver;

    public ContactsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
