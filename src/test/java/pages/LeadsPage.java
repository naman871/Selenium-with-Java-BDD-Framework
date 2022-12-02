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

    @FindBy(xpath = "//a[@href='#/leads/edit?return_module=Leads&return_action=DetailView']")
    public WebElement createLeadModule;

    @FindBy(xpath = "//span[text()='Create']")
    public WebElement createleadpage;




    WebDriver driver;

    public LeadsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

}
