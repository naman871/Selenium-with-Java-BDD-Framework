package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonPage extends PageFactory {
    @FindBy(xpath = "//input[@name='username']")
    public WebElement enterUsername;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement enterpassword;

    @FindBy(xpath = "//button[@id='login-button']")
    public WebElement loginButton;

    WebDriver driver;
    public CommonPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, CommonPage.this);

    }

}
