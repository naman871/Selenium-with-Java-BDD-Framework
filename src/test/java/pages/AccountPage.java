package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends PageFactory {

    @FindBy(xpath = "//a[contains(text(),' Import Accounts')]")
    public WebElement importAccount;

    @FindBy(xpath = "//a[@href='#/accounts']")
    public WebElement accountDropdown;

    @FindBy(xpath = "//a[contains(text(),' Create Account')]")
    public WebElement createAccount;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement name;

    @FindBy(xpath = "//span[text()='Create']")
    public WebElement createAccountPage;

    @FindBy(xpath = "//scrm-module-title[@class='list-view-title']")
    public WebElement viewAccountList;

    @FindBy(xpath = "//button[contains(text(),' Save ')]")
    public WebElement save;

    @FindBy(xpath = "//scrm-dynamic-label[@class='ng-star-inserted']")
    public WebElement savedAccount;

    @FindBy(xpath = "//button[contains(text(),' Actions ')]")
    public WebElement actiondropdown;

    @FindBy(xpath = "//div[contains(text(),' Delete ')]")
    public WebElement delete;

    @FindBy(xpath = "//a[contains(text(),' View Accounts')]")
    public WebElement viewAccount;

    @FindBy(xpath = "//a[@href='#/accounts']")
    public WebElement accountModule;

    @FindBy(xpath = "//a[@href='#/accounts/edit?return_module=Accounts&return_action=DetailView']")
    public WebElement createAccountModule;

    @FindBy(xpath = "//button[contains(text(),'Save')]")
    public WebElement saveButton;
    @FindBy(xpath = "//div[@class='ng-tns-c336-0 alert alert-dismissible alert-warning fade message shadow show ng-trigger ng-trigger-fade ng-star-inserted']\n")
    public WebElement errorMessage;

    @FindBy(xpath = "//input[@class='form-control form-control-sm ng-untouched ng-pristine ng-invalid']")
    public WebElement nameTextBox;

    @FindBy(xpath = " //label[text()='NAME']")
    public WebElement nameLabel;

    @FindBy(xpath = "//scrm-dynamic-field[@class='dynamic-field dynamic-field-mode-detail dynamic-field-name-name dynamic-field-type-name ng-star-inserted']//input[@type='text']")
    public WebElement nameTextBoxEdit;

    @FindBy(xpath = "//label[text()='WEBSITE']")
    public WebElement websiteLabel;

    @FindBy(xpath = "/label[text()='OFFICE PHONE']")
    public WebElement officeLabel;

    @FindBy(xpath = "//scrm-dynamic-field[@class='dynamic-field dynamic-field-mode-edit dynamic-field-name-website dynamic-field-type-link ng-star-inserted']//input[@type='text']")
    public WebElement websiteTextBox;

    @FindBy(xpath = "//button[contains(text(),'Edit')]")
    public WebElement editButton;

    @FindBy(xpath = "//button[contains(text(),'Cancel')]")
    public WebElement cancelButton;

    @FindBy(xpath = "//scrm-module-title[contains(text(),'ACCOUNTS')]")
    public WebElement accounPage;

    @FindBy(xpath = " //scrm-label[contains(text(),'Ok')]")
    public WebElement okButton;

    @FindBy(xpath = "//button[@class='button-group-button settings-button'][normalize-space()='New']")
    public WebElement newButton;

    @FindBy(xpath = "//span[contains(text(),'Create')]")
    public WebElement createPage;

    @FindBy(xpath = "//button[contains(text(),'Actions')]")
    public WebElement actionDropdown;

    @FindBy(xpath = "//div[@class='dropdown-menu show']")
    public WebElement actionDropdowndisplay;

    //div[contains(text(),'Delete')]
    @FindBy(xpath = "  //div[contains(text(),'Delete')]")
    public WebElement deleteOptionDropdown;

    @FindBy(xpath = "//scrm-label[contains(text(),'Proceed')]")
    public WebElement proceedButton;


    WebDriver driver;

    public AccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }


}
