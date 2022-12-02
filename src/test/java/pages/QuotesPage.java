package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuotesPage extends PageFactory {
    @FindBy(xpath = "//a[normalize-space()='Quotes']")
    public WebElement quotesDropdown;

    @FindBy(xpath = "//a[@href='#/quotes/edit?return_module=AOS_Quotes&return_action=DetailView']")
    public WebElement createQuotes;

    @FindBy(xpath = "//div//input[@id='name']")
    public WebElement titleTextBoxQuotes;

    @FindBy(xpath = "//iframe[@src=\"./legacy/index.php?return_module=AOS_Quotes&return_action=DetailView&module=AOS_Quotes&action=EditView\"]")
    public WebElement iframeForQuotesCreatePage;

    @FindBy(xpath = "//input[@id='SAVE']")
    public WebElement saveButtonQuotesModule;

    WebDriver driver;
    public QuotesPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

}
