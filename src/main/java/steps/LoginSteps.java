package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import java.time.Duration;



public class LoginSteps {

    WebDriver driver = null;

    LoginPage loginPage;

    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://suite8demo.suiteondemand.com/#/Login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    public void entersUsernameAndPassword(String Username, String Password) {
        loginPage = new LoginPage(this.driver);
        loginPage.enterUsername.sendKeys(Username);
        loginPage.enterpassword.sendKeys(Password);

    }

    public void clickLoginButton() {
        loginPage = new LoginPage(this.driver);
        loginPage.loginButton.click();

    }
    public void closeBrowser() {
        driver.quit();
    }
    public void clickSuiteDashBoard(){
        loginPage.suiteCrmDashboardButton.isDisplayed();

    }
    public void clickOpportunitiesModule(){
        loginPage.opportunitiesModule.click();
    }
    public void clickOnHomePage(){
        loginPage.homePage.click();
    }


}
