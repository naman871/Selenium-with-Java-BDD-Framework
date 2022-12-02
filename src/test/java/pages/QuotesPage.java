package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuotesPage extends PageFactory {
    WebDriver driver;

    public QuotesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[@href=\"#/quotes\"]")
    public WebElement quotes;

    @FindBy(xpath = "")
    public WebElement createQuotes;

    @FindBy(xpath = "//input[@title=\"Save\"]")
    public WebElement saveQuotes;

    @FindBy(xpath = "//div[text()=\"Missing required field: Title\"]")
    public WebElement errorMessageAfterSave;





}
