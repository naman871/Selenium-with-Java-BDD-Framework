package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends PageFactory {

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
    //label[text()="OFFICE PHONE"]
    @FindBy(xpath = "/label[text()=\"OFFICE PHONE\"]")
    public WebElement officeLabel;

    @FindBy(xpath = "//body/app-root[1]/div[1]/scrm-create-record[1]/div[1]/scrm-record-container[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/scrm-record-content[1]/div[1]/div[1]/div[1]/div[1]/scrm-field-layout[1]/form[1]/div[2]/div[1]/div[2]/div[1]/scrm-field[1]/scrm-dynamic-field[1]/scrm-varchar-edit[1]/input[1]")
    public WebElement websiteTextBox;
    @FindBy(xpath = "//body/app-root[1]/div[1]/scrm-create-record[1]/div[1]/scrm-record-container[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/scrm-record-content[1]/div[1]/div[1]/div[1]/div[1]/scrm-field-layout[1]/form[1]/div[1]/div[2]/div[2]/div[1]/scrm-field[1]/scrm-dynamic-field[1]/scrm-varchar-edit[1]/input[1]")
    public WebElement officePhoneTextbox;

    //button[contains(text(),'Edit')]
    @FindBy(xpath = "//button[contains(text(),'Edit')]")
    public WebElement editButton;








    WebDriver driver;
    public AccountPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

}
