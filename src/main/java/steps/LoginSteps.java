package steps;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class LoginSteps {
    public LoginPage loginPage;
    public WebDriver driver;


    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://suite8demo.suiteondemand.com/#/Login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);

    }

    public void closeBrowser(){
        driver.quit();
    }

    public void entersUsernameAndPassword(String Username,String Password) throws InterruptedException {
        driver.manage().wait(5000);
        driver.findElement(By.xpath("//input[@name='username']")).isEnabled();

//        driver.findElement(By.name("username")).sendKeys(Username);
//        driver.findElement(By.name("password")).sendKeys(Password);
        loginPage.enterUsername.sendKeys(Username);
        loginPage.enterpassword.sendKeys(Password);

    }
    public void clickLoginButton(){
//        driver.findElement(By.id("login-button")).click();
        loginPage.loginButton.click();


    }




}
