package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends PageFactory {

    @FindBy(xpath = "//a[contains(text(),' Import Accounts')]")
    public WebElement importaccount;

    @FindBy(xpath = "//a[@href='#/accounts']")
    public WebElement accountDropdown;

    @FindBy(xpath = "//a[contains(text(),' Create Account')]")
    public WebElement createaccount;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement name;

    @FindBy(xpath = "//span[text()='Create']")
    public WebElement createaccountpage;

    @FindBy(xpath = "//scrm-module-title[@class='list-view-title']")
    public WebElement viewaccountlist;

    @FindBy(xpath = "//button[contains(text(),' Save ')]")
    public WebElement save;

    @FindBy(xpath = "//scrm-dynamic-label[@class='ng-star-inserted']")
    public WebElement savedaccount;

    @FindBy(xpath = "//button[contains(text(),' Actions ')]")
    public WebElement actiondropdown;

    @FindBy(xpath = "//div[contains(text(),' Delete ')]")
    public WebElement delete;

    @FindBy(xpath = "//a[contains(text(),' View Accounts')]")
    public WebElement viewaccount;

    WebDriver driver;

    public AccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }


}
