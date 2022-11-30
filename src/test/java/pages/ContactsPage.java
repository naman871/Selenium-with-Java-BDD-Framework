package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ContactsPage {
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

}
