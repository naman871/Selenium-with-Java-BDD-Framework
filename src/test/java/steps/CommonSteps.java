package steps;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.CommonPage;

import java.io.IOException;
import java.time.Duration;


public class CommonSteps {

    private static final Logger logger = LogManager.getLogger(CommonPage.class);
    public static WebDriver driver;

//     static ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
//     static ExtentReports extentReports = new ExtentReports();
//
//    public  ExtentTest test = extentReports.createTest("Report", "Description");


    CommonPage commonPage;


    public void openBrowser() {
        String path = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", "" + path + "\\Drivers\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.get("https://suite8demo.suiteondemand.com/#/Login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
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


    public void clickonNewButton() {
        commonPage = new CommonPage(driver);
        commonPage.NewButton.click();
    }
}
