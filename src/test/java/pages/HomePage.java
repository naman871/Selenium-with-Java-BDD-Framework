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


    @FindBy(xpath = "//a[@href='#/contacts/edit?return_module=Contacts&return_action=DetailView']")
    public WebElement createContact;

    @FindBy(xpath = "//a[@href='#/contacts/index?return_module=Contacts&return_action=DetailView']")
    public WebElement viewContact;

    @FindBy(xpath = "//a[@class='home-nav-link']")
    public WebElement homePageButton;

    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

}
