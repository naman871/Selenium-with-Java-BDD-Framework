package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


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
    @FindBy(xpath = "//a[@href='#/contacts']")
    public WebElement contactsDropdown;
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
    @FindBy(xpath = "//a[contains(text(),' Create Contact')]")
    public WebElement createContact;

    @FindBy(xpath = "/html/body/app-root/div/scrm-navbar-ui/scrm-base-navbar/div/nav/div[1]/ul/li[1]/scrm-menu-item/scrm-base-menu-item/div/div[3]/scrm-menu-item-link/scrm-base-menu-item-link/a")
    public WebElement viewContact;

//    @FindBy(xpath = "//input[@class='form-control form-control-sm ng-pristine ng-valid ng-touched']")
//    public WebElement firstName;

    @FindBy(xpath = "//input[@class='form-control form-control-sm ng-pristine ng-invalid is-invalid ng-touched']")
    public WebElement lastName1;


    @FindBy(xpath = "/html/body/app-root/div/scrm-record/div/scrm-record-header/div/div/div[2]/div/div[2]/scrm-action-group-menu/div/scrm-button-group/div/scrm-button[2]/button")
    public WebElement editButton;

    WebDriver driver;

    public ContactsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
