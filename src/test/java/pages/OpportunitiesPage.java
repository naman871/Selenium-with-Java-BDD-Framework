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
//    public WebElement createOpporunity;   ---> not working because HTML free text is not correctly defined

    @FindBy(xpath = "//a[@href='#/opportunities']")
    public WebElement opportunity;

    @FindBy(xpath = "//table/tbody/tr[1]/td[@role='gridcell'][2]/scrm-field/scrm-dynamic-field")
    public WebElement opportunitiesGridFirstOpportunity;

    @FindBy(xpath = "//table/tbody/tr[1]/td[@role='gridcell'][1]/label/input[@type='checkbox']")
    public WebElement firstCheckboxFromOpportunityGrid;

    @FindBy(xpath = "//a[@href='#/opportunities/edit?return_module=Opportunities&return_action=DetailView']")
    public WebElement createOpportunity;

    @FindBy(xpath = "//a[@href='#/opportunities/index?return_module=Opportunities&return_action=DetailView']")
    public WebElement viewOpportunities;

    @FindBy(xpath = "//a[@xpath='1']")
    public WebElement recentlyViewedItem;

    @FindBy(xpath = "//a[contains(text(),' Import Opportunities')]")
    public WebElement importOpportunities;

    @FindBy(xpath = "//scrm-module-title[contains(text(),'OPPORTUNITIES')]")
    public WebElement opportunitiesLabel;   // under view opportunities page

    @FindBy(xpath = "//span[text()='Create']")
    public WebElement createLabel;

    @FindBy(xpath = "//button[contains(text(),'Filter')]")
    public WebElement filterButton;

    @FindBy(xpath = "//scrm-list-header/div[1]/div[3]/div[1]/div[1]/scrm-list-filter[1]/scrm-panel[1]/div[1]/div[2]/div[1]/scrm-field-grid[1]/form[1]/div[3]/div[4]/div[1]/div[1]/scrm-button[2]/button[@type='button']")

    public WebElement searchButton;
    @FindBy(xpath = "//button[contains(text(),'Save')]")

    public WebElement saveButton;
    @FindBy(xpath = "//button[contains(text(),'Edit')]")

    public WebElement editButton;
    @FindBy(xpath = "//button[text()=' Actions ']")

    public WebElement actionDropdownButton;
    @FindBy(xpath = "//scrm-dropdown-button/div/div/a[2]/div/div[text()=' Duplicate ']")

    public WebElement duplicateButton;
    @FindBy(xpath = "//scrm-dropdown-button/div/div/a[1]/div/div[text()=' Delete ']")

    public WebElement deleteButton;
    @FindBy(xpath = "//scrm-dropdown-button/div/div/a[4]/div/div[text()=' Find Duplicates ']")

    public WebElement findDuplicatesButton;
    @FindBy(xpath = "//scrm-modal/div/div[3]/div/scrm-modal-button-group/scrm-button-group/div/scrm-button[2]//button[@type='button']")

    public WebElement proceedButton;
    @FindBy(xpath = "//iframe[@src='./legacy/index.php?action_module=Opportunities&return_action=DetailView&return_module=Opportunities&return_id=10c2523f-7c8c-71bc-35a8-638c8bb33244&module=MergeRecords&action=Step1&record=10c2523f-7c8c-71bc-35a8-638c8bb33244']")

    public WebElement iframeForNextStepButton;//  not working because I frame is changing
    @FindBy(xpath = "//table/tbody/tr/td/input[@title='Move to Next Step']")

    public WebElement nextStepButton;
    @FindBy(xpath = "(//input[@type='text'])[2]")

    public WebElement opportunitiyName;

    @FindBy(xpath = "//nav/div/ul/li[3]/scrm-menu-item/scrm-base-menu-item/div[@aria-labelledby='navbarDropdownMenu']/div")
    public List<WebElement> opportunityDropdown;

    @FindBy(xpath = "(//input[@type='text'])[6]")
    public WebElement salesStage;

    @FindBy(xpath = "(//input[@type='text'])[5]")
    public WebElement oppportunityAmount;

    @FindBy(xpath = "//input[@placeholder='yyyy-mm-dd']")
    public WebElement expectedClosedDate;

    @FindBy(xpath = "(//input[@type='text'])[3]")
    public WebElement enterAccountName;

    @FindBy(xpath = "//*[@id='ngb-nav-0-panel']/div/scrm-field-layout/form/div[2]/div[2]/div[2]/div[1]/scrm-field/scrm-dynamic-field/scrm-date-edit/div/span/scrm-button/button")
    public WebElement calendarIcon;

    @FindBy(xpath = "//div[@title='Prospecting']")
    public WebElement prospecting;   // only work when sales stage is given prospecting

    @FindBy(xpath = "//a[@href='#/opportunities/index?return_module=Opportunities&return_action=DetailView']")
    public WebElement ViewOpportunitiy;
    @FindBy(xpath = "(//button/label/span[@class='checkmark'])[1]")
    public WebElement SelectAllCheckbox;

    @FindBy(xpath = "//div[@class='d-inline-block dropdown-button dropdown bulk-action-group float-left']/button[text()=' Bulk Action ']")
    public WebElement bulkActionDropdown;
    @FindBy(xpath = "//tbody/tr[1]/td[1]/label[1]/span[1]")
    public  WebElement selectRecord;

    @FindBy(xpath = "//div[@class='dropdown-menu show']//div[@class='flex-grow-1'][normalize-space()='Mass Update']")
    public WebElement selectMassupdate;
//    @FindBy(xpath = "//a[@id='ngb-nav-0']")
//    public WebElement CreateOpportunities;
//
//    @FindBy(xpath = "//a[@id='ngb-nav-1']")
//    public WebElement ClickOpportunities;
//
//    @FindBy(xpath = "//a[@id='ngb-nav-2']")
//    public WebElement ImportOpportunities;

    WebDriver driver;

    public OpportunitiesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }


}
