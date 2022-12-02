package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OpportunitiesPage extends PageFactory {

    /*
    comment - CSS locators are not working at all and sometimes Xpath are also not working
     */

//    @FindBy(xpath = "//a[contains(text(),' Create Opportunity')]")
//    public WebElement createOpporunity;   ---> not working

    @FindBy(xpath = "//a[@href=\"#/opportunities\"]")
    public WebElement opportunity;

    @FindBy(xpath = "//a[@href=\"#/quotes\"]")
    public WebElement quotes;



    @FindBy(xpath = "//a[@href=\"#/opportunities/edit?return_module=Opportunities&return_action=DetailView\"]")
    public WebElement createOpportunity;
    @FindBy(xpath = "//a[contains(text(),' View Opportunities')]")
    public WebElement viewOpportunities;

    @FindBy(xpath = "//a[contains(text(),' Import Opportunities')]")
    public WebElement importOpportunities;

    @FindBy(xpath = "//span[text()='Create']")
    public WebElement createLabel;

    @FindBy(xpath = "//button[contains(text(),'Save')]")
    public WebElement saveButton;
    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement opportunitiyName;

    @FindBy(xpath = "//nav/div/ul/li[3]/scrm-menu-item/scrm-base-menu-item/div[@aria-labelledby='navbarDropdownMenuLink']/div")
    public List<WebElement> opportunityDropdown;
    @FindBy(xpath = "(//input[@type='text'])[6]")
    public WebElement salesStage;

    @FindBy(xpath = "//div[@title='Prospecting']")
    public WebElement prospecting;   // only work when sales stage is given prospecting

    @FindBy(xpath = "//a[@id='ngb-nav-0']")
    public WebElement CreateOpportunities;

    @FindBy(xpath = "//a[@id='ngb-nav-1']")
    public WebElement ClickOpportunities;

    @FindBy(xpath = "//a[@id='ngb-nav-2']")
    public WebElement ImportOpportunities;

    WebDriver driver;

    public OpportunitiesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }


}
