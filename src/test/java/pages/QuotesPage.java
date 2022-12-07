package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuotesPage extends PageFactory {

    @FindBy(xpath = "//a[@href='#/quotes']")
    public WebElement quotes;

    @FindBy(xpath = "//input[@title='Save']")
    public WebElement saveQuotes;

    @FindBy(xpath = "//div[text()='Missing required field: Title']")
    public WebElement errorMessageAfterSave;

    @FindBy(xpath = "//a[normalize-space()='Quotes']")
    public WebElement quotesDropdown;

    @FindBy(xpath = "//a[@href='#/quotes/edit?return_module=AOS_Quotes&return_action=DetailView']")
    public WebElement createQuotes;

    @FindBy(xpath = "//div//input[@id='name']")
    public WebElement titleTextBoxQuotes;

    @FindBy(xpath = "//iframe[@src='./legacy/index.php?return_module=AOS_Quotes&return_action=DetailView&module=AOS_Quotes&action=EditView']")
    public WebElement iframeForQuotesCreatePage;
    @FindBy(xpath = "//iframe[@src='./legacy/index.php?module=AOS_Quotes&action=DetailView&record=71bf689d-3750-53e3-3391-638dc9e846bd']")
    public WebElement iframeForQuotesViewPage; //    Iframe is constantly changing
    @FindBy(xpath = "//input[@id='SAVE']")
    public WebElement saveButtonQuotesModule;
    @FindBy(xpath = "//button[@id='btn_billing_account']//*[name()='svg']")
    public WebElement accountSearchCursorQuotes;

    @FindBy(xpath = "//span[@id='name']")
    public WebElement verifyTitleNameInNewPageWindow;

    @FindBy(xpath = "//a[normalize-space()='Sea Region Inc']")
    public WebElement quoteAccountName;

    @FindBy(xpath = "//input[@name='billing_account']")
    public WebElement  quoteAccountNameTextBox;

    @FindBy(xpath = "//input[@id='name_advanced']")
    public WebElement accountSearchBoxQuotesWindow;

    @FindBy(xpath = "//input[@id='search_form_submit']")
    public WebElement searchButtonQuotesWindow;
    WebDriver driver;
    public QuotesPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

}
