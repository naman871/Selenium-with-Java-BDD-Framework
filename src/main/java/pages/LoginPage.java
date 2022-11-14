package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver driver;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement enterUsername;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement enterpassword;

    @FindBy(xpath = "//button[@id='login-button']")
    public WebElement loginButton;


    public LoginPage(){PageFactory.initElements(driver, this);

    }

}
