package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpportunitiesPage extends PageFactory {

    /*
    comment - CSS locators are not working at all and sometimes Xpath are also not working
     */

    @FindBy(xpath = "//a[contains(text(),' Create Opportunity')]")
    public WebElement createOpporunity;

    @FindBy(xpath = "//a[@href='#/opportunities/index?return_module=Opportunities&return_action=DetailView']")
    public WebElement viewOpportunities;

    @FindBy(xpath = "//a[contains(text(),' Import Opportunities')]")
    public WebElement importOpportunities;

    @FindBy(xpath = "//span[text()='Create']")
    public WebElement createLabel;

    @FindBy(xpath = "//button[contains(text(),'Save')]")
     public WebElement saveButton;

    @FindBy(xpath = "//input[@class='form-control form-control-sm ng-pristine ng-invalid is-invalid ng-touched']\n")
     public WebElement opportunitiyName;






    WebDriver driver;

    public OpportunitiesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }


}
