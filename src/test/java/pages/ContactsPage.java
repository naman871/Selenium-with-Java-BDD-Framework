package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ContactsPage {

    @FindBy(xpath = "//a[@href=\"#/contacts\"]")
    public WebElement contactModule;

    @FindBy(xpath = "//body/app-root[1]/div[1]/scrm-navbar-ui[1]/scrm-base-navbar[1]/div[1]/nav[1]/div[1]/ul[1]/li[2]/scrm-menu-item[1]/scrm-base-menu-item[1]/div[1]\n")
    public WebElement contactModuleDropdown;

    @FindBy(xpath = "//body[1]/app-root[1]/div[1]/scrm-navbar-ui[1]/scrm-base-navbar[1]/div[1]/nav[1]/div[1]/ul[1]/li[2]/scrm-menu-item[1]/scrm-base-menu-item[1]/div[1]/div[1]/scrm-menu-item-link[1]/scrm-base-menu-item-link[1]/a[1]")
    public WebElement createAccountOption;

    @FindBy(xpath = "//body/app-root[1]/div[1]/scrm-navbar-ui[1]/scrm-base-navbar[1]/div[1]/nav[1]/div[1]/ul[1]/li[2]/scrm-menu-item[1]/scrm-base-menu-item[1]/div[1]/div[2]/scrm-menu-item-link[1]/scrm-base-menu-item-link[1]/a[1]")
    public WebElement createContactsForVcartOption;

    @FindBy(xpath = "//body/app-root[1]/div[1]/scrm-navbar-ui[1]/scrm-base-navbar[1]/div[1]/nav[1]/div[1]/ul[1]/li[2]/scrm-menu-item[1]/scrm-base-menu-item[1]/div[1]/div[3]/scrm-menu-item-link[1]/scrm-base-menu-item-link[1]/a[1]")
    public WebElement viewedContactsOption;





    WebDriver driver;


    public ContactsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
}
