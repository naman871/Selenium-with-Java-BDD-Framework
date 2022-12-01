package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ContactsPage extends PageFactory{

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
    @FindBy(xpath = "//a[@href='#/contacts']")
    public WebElement contactsDropdown;
    @FindBy(xpath = "(//a[contains(text(),' Create Contact')])[1]")
    public WebElement createContacts;
    @FindBy(xpath = "(//input[@type='text'])[3]")
    public WebElement fristName;

    @FindBy(xpath = "(//input[@type='text'])[4]")
    public WebElement lastName;
    @FindBy(xpath = "//span[text()='Create']")
    public WebElement createContactsLabel;

    WebDriver driver;
    public ContactsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

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
