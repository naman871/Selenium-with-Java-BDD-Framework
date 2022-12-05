package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends PageFactory {

    @FindBy(xpath = "//a[@id='tab0']")
    public WebElement suiteCrmDashboardButton;

    @FindBy(xpath = "//a[@href='#/opportunities']")
    public WebElement opportunitiesModule;

    @FindBy(xpath = "//a[@href='#/contacts']")
    public WebElement contactsModule;

    @FindBy(xpath = "//a[@class='home-nav-link']")
    public WebElement homePageButton;

    @FindBy(xpath = "//span[text()[normalize-space()='My Calls']]")
    public WebElement myCallsLabel;

    @FindBy(xpath = "//div[text()='Login credentials incorrect, please try again.']")
    public WebElement InvalidErrorMsg;

    @FindBy(xpath = "//div[text()=' Missing required field ']")
    public WebElement MissingErrorMsg;

    @FindBy(xpath = "//iframe[@src=\"./legacy/index.php?module=Home\"]")
    public WebElement iframeForHomepage;

    @FindBy(xpath = "//span[text()[normalize-space()='My Calls']]")
    public WebElement mycalls;

    @FindBy(xpath = "//span[text()[normalize-space()='My Accounts']]")
    public WebElement myaccounts;

    @FindBy(xpath = "//span[text()[normalize-space()='My Leads']]")
    public WebElement myleads;

    @FindBy(xpath = "//span[text()[normalize-space()='My Activity Stream']]")
    public WebElement myactivitystream;

    @FindBy(xpath = "//span[text()[normalize-space()='My Meetings']]")
    public WebElement mymeetings;

    @FindBy(xpath = "//span[text()[normalize-space()='My Top Open Opportunities']]")
    public WebElement mytopopenoppurtunities;

    @FindBy(xpath = "//span[text()[normalize-space()='My Activity Stream']]")
    public WebElement myActivityStreamLabel;

    @FindBy(xpath = "//span[text()[normalize-space()='My Meetings']]")
    public WebElement myMeetingslabel;

    @FindBy(xpath = "//span[text()[normalize-space()='My Accounts']]")
    public WebElement myAccounts;

    @FindBy(xpath = "//span[text()[normalize-space()='My Leads']]")
    public WebElement myLeads;


    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
