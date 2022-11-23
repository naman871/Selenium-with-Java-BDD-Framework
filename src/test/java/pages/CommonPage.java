package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonPage {
    @FindBy(xpath = "//input[@name='username']")
    public WebElement enterUsername;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement enterpassword;

    @FindBy(xpath = "//button[@id='login-button']")
    public WebElement loginButton;

    @FindBy(xpath = "//a[@id='tab0']")
    public WebElement suiteCrmDashboardButton;

    @FindBy(xpath = "//a[@href='#/opportunities']")
    public WebElement opportunitiesModule;

    @FindBy(xpath = "//a[@class='home-nav-link']")
     public WebElement homePage;

    WebDriver driver;
    public CommonPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, CommonPage.this);

    }

}
