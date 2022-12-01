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

    @FindBy(xpath = "//a[@href='#/opportunities']")
    public WebElement opportunity;
    @FindBy(xpath = "//a[@href='#/opportunities/edit?return_module=Opportunities&return_action=DetailView']")
    public WebElement createOpportunity;
    @FindBy(xpath = "//a[@href='#/opportunities/index?return_module=Opportunities&return_action=DetailView']")
    public WebElement viewOpportunities;
    @FindBy(xpath = "//a[@xpath='1']")
    public WebElement recentlyViewedItem;

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
    @FindBy(xpath = "(//input[@type='text'])[5]")
    public WebElement oppportunityAmount;
    @FindBy(xpath = "//input[@placeholder=\"yyyy-mm-dd\"]")
    public WebElement expectedClosedDate;
    @FindBy(xpath = "(//input[@type='text'])[3]")
    public WebElement enterAccountName;

    @FindBy(xpath = "//*[@id=\"ngb-nav-0-panel\"]/div/scrm-field-layout/form/div[2]/div[2]/div[2]/div[1]/scrm-field/scrm-dynamic-field/scrm-date-edit/div/span/scrm-button/button")
    public WebElement calendarIcon;
    @FindBy(xpath = "//div[@title='Prospecting']")
    public WebElement prospecting;   // only work when sales stage is given prospecting

    WebDriver driver;

    public OpportunitiesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }


}
