package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends PageFactory {

    @FindBy(xpath = "//a[contains(text(),' Import Accounts')]")
    public WebElement importaccount;

    @FindBy(xpath = "//a[@href='#/accounts']")
    public WebElement accountDropdown;

    @FindBy(xpath = "//a[contains(text(),' Create Account')]")
    public WebElement createaccount;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement name;

    @FindBy(xpath = "//span[text()='Create']")
    public WebElement createaccountpage;

    @FindBy(xpath = "//scrm-module-title[@class='list-view-title']")
    public WebElement viewaccountlist;

    @FindBy(xpath = "//button[contains(text(),' Save ')]")
    public WebElement save;

    @FindBy(xpath = "//scrm-dynamic-label[@class='ng-star-inserted']")
    public WebElement savedaccount;

    @FindBy(xpath = "//button[contains(text(),' Actions ')]")
    public WebElement actiondropdown;

    @FindBy(xpath = "//div[contains(text(),' Delete ')]")
    public WebElement delete;

    @FindBy(xpath = "//a[contains(text(),' View Accounts')]")
    public WebElement viewaccount;

    @FindBy(xpath = "//a[@href='#/accounts']")
    public WebElement accountModule;

    @FindBy(xpath = "//a[@href='#/accounts/edit?return_module=Accounts&return_action=DetailView']")
    public WebElement createAccountModule;

    @FindBy(xpath = "//button[contains(text(),'Save')]")
    public WebElement saveButton;
    @FindBy(xpath = "//div[@class=\"ng-tns-c336-0 alert alert-dismissible alert-warning fade message shadow show ng-trigger ng-trigger-fade ng-star-inserted\"]\n")
    public WebElement errorMessage;

    @FindBy(xpath = "//body/app-root[1]/div[1]/scrm-create-record[1]/div[1]/scrm-record-container[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/scrm-record-content[1]/div[1]/div[1]/div[1]/div[1]/scrm-field-layout[1]/form[1]/div[1]/div[1]/div[2]/div[1]/scrm-field[1]/scrm-dynamic-field[1]/scrm-varchar-edit[1]/input[1]")
    public WebElement nameTextBox;

    @FindBy(xpath = " //label[text()=\"NAME\"]")
    public WebElement nameLabel;

    @FindBy(xpath = "//label[text()=\"WEBSITE\"]")
    public WebElement websiteLabel;

    @FindBy(xpath = "/label[text()=\"OFFICE PHONE\"]")
    public WebElement officeLabel;

    @FindBy(xpath = "//body/app-root[1]/div[1]/scrm-create-record[1]/div[1]/scrm-record-container[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/scrm-record-content[1]/div[1]/div[1]/div[1]/div[1]/scrm-field-layout[1]/form[1]/div[2]/div[1]/div[2]/div[1]/scrm-field[1]/scrm-dynamic-field[1]/scrm-varchar-edit[1]/input[1]")
    public WebElement websiteTextBox;

    @FindBy(xpath = "//body/app-root[1]/div[1]/scrm-create-record[1]/div[1]/scrm-record-container[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/scrm-record-content[1]/div[1]/div[1]/div[1]/div[1]/scrm-field-layout[1]/form[1]/div[1]/div[2]/div[2]/div[1]/scrm-field[1]/scrm-dynamic-field[1]/scrm-varchar-edit[1]/input[1]")
    public WebElement officePhoneTextbox;
    @FindBy(xpath = "//button[contains(text(),'Edit')]")
    public WebElement editButton;
    @FindBy(xpath = "//button[contains(text(),'Cancel')]")
    public WebElement cancelButton;

    @FindBy(xpath = "//scrm-module-title[contains(text(),'ACCOUNTS')]")
    public WebElement accounPage;
    @FindBy(xpath = " //scrm-label[contains(text(),'Ok')]")
    public WebElement okButton;

    @FindBy(xpath = "/html/body/app-root/div/scrm-record/div/scrm-record-header/div/div/div[2]/div/div[2]/scrm-action-group-menu/div/scrm-button-group/div/scrm-button[1]/button")
    public WebElement newButton;

    @FindBy(xpath = "//span[contains(text(),'Create')]")
    public WebElement createPage;

    @FindBy(xpath = "//button[contains(text(),'Actions')]")
    public WebElement actionDropdown;

    @FindBy(xpath = "//div[@class=\"dropdown-menu show\"]")
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
