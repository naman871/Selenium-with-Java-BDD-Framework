package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage extends PageFactory {

    @FindBy(xpath = "/html/body/app-root/div/scrm-navbar-ui/scrm-base-navbar/div/nav/div[1]/ul/li[1]/scrm-menu-item/scrm-base-menu-item/div/div[1]/scrm-menu-item-link/scrm-base-menu-item-link/a")
    public WebElement createContact;

    @FindBy(xpath = "/html/body/app-root/div/scrm-navbar-ui/scrm-base-navbar/div/nav/div[1]/ul/li[1]/scrm-menu-item/scrm-base-menu-item/div/div[3]/scrm-menu-item-link/scrm-base-menu-item-link/a")
    public WebElement viewContact;

    @FindBy(xpath = "//input[@class='form-control form-control-sm ng-pristine ng-valid ng-touched']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@class='form-control form-control-sm ng-pristine ng-invalid is-invalid ng-touched']")
    public WebElement lastName;

    @FindBy(xpath = "/html/body/app-root/div/scrm-create-record/div/scrm-record-header/div/div/div[2]/div/div[2]/scrm-action-group-menu/div/scrm-button-group/div/scrm-button[1]/button")
    public WebElement saveButton;

    @FindBy(xpath = "/html/body/app-root/div/scrm-record/div/scrm-record-header/div/div/div[2]/div/div[2]/scrm-action-group-menu/div/scrm-button-group/div/scrm-button[2]/button")
    public WebElement editButton;

    WebDriver driver;

    public ContactsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
