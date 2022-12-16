package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage extends PageFactory{

    @FindBy(xpath = "//a[@href='#/leads']")
    public WebElement leadsDropdown;

    @FindBy(xpath = "//a[contains(text(),'Create Lead')]")
    public WebElement createlead;

    @FindBy(xpath = "//a[contains(text(),'Create Lead From vCard')]")
    public WebElement createleadfromvcard;

    @FindBy(xpath = "//a[contains(text(),'View Leads')]")
    public WebElement viewleads;

    @FindBy(xpath = "//a[contains(text(),'Import Leads')]")
    public WebElement importleads;

   // @FindBy(xpath = "//a[@href='#/leads/edit?return_module=Leads&return_action=DetailView']")
    //public WebElement createLeadModule;

    @FindBy(xpath = "//span[text()='Create']")
    public WebElement createleadpage;

   // @FindBy(xpath = "//a[@href='#/leads']")
    //public WebElement leadsModule;

    //@FindBy(xpath = "//a[@href='#/leads/edit?return_module=Leads&return_action=DetailView']")
    //public WebElement CreateLeads;

    @FindBy(xpath = "(//scrm-dynamic-field//input[@type='text'])[2]")
    public WebElement FirstName;

    @FindBy(xpath = "(//scrm-dynamic-field//input[@type='text'])[3]")
    public WebElement LastName;

    @FindBy(xpath = "//button[normalize-space()='Cancel']")
    public WebElement CancelButtonLeads;

    @FindBy(xpath = "//scrm-label[normalize-space()='Ok']")
    public WebElement OkButtonLeadsPopupwindow;

    @FindBy(xpath = "//scrm-label[normalize-space()='Cancel']")
    public WebElement CancelButtonLeadsPopupwindow;

    @FindBy(xpath = "//scrm-label[@class='ng-tns-c337-8']")
    public WebElement VerifyWarningMessage;
    @FindBy(xpath = "//span[@class='dynamic-label ng-star-inserted']")
    public WebElement NewLeadPage;
    @FindBy(xpath = "//a[@id='ngb-nav-0']")
    public WebElement OverviewTab;

    @FindBy(xpath = "//a[@id='ngb-nav-1']")
    public WebElement MoreInformationTab;

    @FindBy(xpath = "//a[@id='ngb-nav-2']")
    public WebElement OtherTab;

    @FindBy(xpath = "//input[@placeholder='Search...']")
    public WebElement SearchBoxLeads;

    //@FindBy(xpath = "//a[@href='#/leads']")
   // public WebElement leads;

    //@FindBy(xpath = "//a[@href=\"#/leads/edit?return_module=Leads&return_action=DetailView\"]")
    //public WebElement createLead;

    @FindBy(xpath = "(//input[@type='text'])[4]")
    public static WebElement enterleadName;

    @FindBy(xpath = "(//input[@type='text'])[10]")
    public static WebElement enterAccountName;

    @FindBy(xpath = "(//input[@type='text'])[7]")
    public static WebElement leadnum;

   // @FindBy(xpath = "//a[@href='#/leads/edit?return_module=Leads&return_action=DetailView']")
    //public static WebElement clickLead;
    @FindBy(xpath = "//span[contains(text(),'Missing required field')]")
    public static WebElement ErrorMessage;
    WebDriver driver;
    public LeadsPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

}

