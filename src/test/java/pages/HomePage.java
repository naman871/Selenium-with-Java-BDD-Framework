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

    @FindBy(xpath = "//a[@class='home-nav-link']")
    public WebElement homePageButton;

    @FindBy(xpath = "//span[text()[normalize-space()='My Calls']]")
     public WebElement myCallsLabel;

    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

}
