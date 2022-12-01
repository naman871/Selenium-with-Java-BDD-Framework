package steps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.CommonPage;
import java.time.Duration;


public class CommonSteps {

    private static final Logger logger = LogManager.getLogger(CommonPage.class);
    public static WebDriver driver ;

    CommonPage commonPage;


    public void openBrowser() {
        String path=System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",""+path+"\\Drivers\\chromedriver_win32\\chromedriver.exe");
        //        System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.get("https://suite8demo.suiteondemand.com/#/Login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        logger.info("Driver is Chrome");
    }

    public void entersUsernameAndPassword(String Username, String Password) {
        commonPage = new CommonPage(driver);
        commonPage.enterUsername.sendKeys(Username);
        logger.info("username is  --> will");
        commonPage.enterpassword.sendKeys(Password);
        logger.info("password is  --> will");
    }

    public void clickLoginButton() {
        commonPage.loginButton.click();

    }
    public void closeBrowser() {
        driver.quit();
    }


}
