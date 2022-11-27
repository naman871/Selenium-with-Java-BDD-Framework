package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpportunitiesPage extends PageFactory {

    @FindBy(xpath = "//a[@href='#/opportunities/edit?return_module=Opportunities&return_action=DetailView']")
    public WebElement createOpporunity;

    @FindBy(xpath = "//a[@href='#/opportunities/index?return_module=Opportunities&return_action=DetailView']")
    public WebElement viewOpportunities;




    WebDriver driver;
    public OpportunitiesPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }


}
