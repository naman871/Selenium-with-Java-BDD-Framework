package steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.QuotesPage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static java.lang.System.in;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class QuotesSteps extends CommonSteps {

    public QuotesPage quotespage;

    public void clickQuotes() {
        quotespage = new QuotesPage(driver);
        quotespage.quotes.click();
    }

    public void clickCreateQuotes() {
        quotespage = new QuotesPage(driver);
        quotespage.createQuotes.click();
    }

    public void clickSave() {
        quotespage = new QuotesPage(driver);
        quotespage.saveQuotes.click();
    }

    public void verifyErrorMessage(String errorMessage) {
        quotespage = new QuotesPage(driver);
        String errorMessageText = quotespage.errorMessageAfterSave.getText();
        System.out.println(errorMessageText);
        Assert.assertEquals("Error message is not displayed", errorMessageText, errorMessage);
    }

    public void clickOnQuotesDropdown() {
        quotespage = new QuotesPage(driver);
        quotespage.quotesDropdown.click();
    }

    public void clickOnCreateQuote() {
        quotespage = new QuotesPage(driver);
        quotespage.createQuotes.click();
    }
    public void  enterTheRequiredFieldsTitleAs(String titleName){
        quotespage = new QuotesPage(driver);
        driver.switchTo().frame(quotespage.iframeForQuotesViewPage);
        quotespage.verifyTitleNameInNewPageWindow.isDisplayed();
        String title = quotespage.verifyTitleNameInNewPageWindow.getText();
        Assert.assertEquals(title, titleName);
    }

    public void accountFieldCursorQuotes(){
        quotespage = new QuotesPage(driver);
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        WebElement element = quotespage.accountSearchCursorQuotes;
        element.click();
    }

    public void saveButtonQuotes() {
        quotespage = new QuotesPage(driver);
        quotespage.saveButtonQuotesModule.click();
    }

    public void verifyTitleNameInNewPage() {
        driver.switchTo().frame(quotespage.iframeForQuotesViewPage);
        quotespage.verifyTitleNameInNewPageWindow.isDisplayed();
        String titleName = quotespage.verifyTitleNameInNewPageWindow.getText();
        Assert.assertEquals(titleName, "Quotes");
    }
    public void getTheAccountListInTheAccountSearchWindow(){
        quotespage = new QuotesPage(driver);
        Assert.assertEquals(2, driver.getWindowHandles());
        Set<String> secondWindow = driver.getWindowHandles();
        driver.switchTo().window(String.valueOf(secondWindow));
        String variable = "Sea Region Inc";
        ArrayList a = new ArrayList();
        List <WebElement>accountnames = driver.findElements(By.xpath("//table[4]/tbody"));
        for (WebElement accountName:accountnames)
        {
            a.add(accountName);
        }
        quotespage.accountSearchBoxQuotesWindow.sendKeys("Sea Region Inc");
        quotespage.searchButtonQuotesWindow.click();
        if (a.contains("Sea Region Inc"))
        {
            Assert.assertEquals("Sea Region Inc", variable);
        }
    }
    public void clickOnTheAccountName(){
        quotespage = new QuotesPage(driver);
        quotespage.quoteAccountName.click();
        String firstWindow = driver.getWindowHandle();
        driver.switchTo().window(firstWindow);
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='./legacy/index.php?return_module=AOS_Quotes&return_action=DetailView&module=AOS_Quotes&action=EditView']")));
        String name = quotespage.quoteAccountNameTextBox.getAttribute("value");
        Assert.assertTrue(name.contains("Sea Region Inc"));
    }
    public void clickCrossButtonBesideAccountName(){
        quotespage.crossButtonBesideAccountName.click();
    }
    public void accountFieldCleared(){
        String accountTextBox = quotespage.quoteAccountNameTextBox.getText();
        Assert.assertTrue("AccountText box is empty",accountTextBox.isEmpty());
    }
    public void verifyCopyAddressCheckboxEnabled(){
        boolean copyAddressCheckbox = quotespage.copyAddressCheckbox.isEnabled();
        Assert.assertTrue("Copy Address from left Checkbox is not enabled",copyAddressCheckbox);
    }

    public void theExistingAccountShouldBeSelectedForTheQuote(){
        quotespage = new QuotesPage(driver);
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='./legacy/index.php?return_module=AOS_Quotes&return_action=DetailView&module=AOS_Quotes&action=EditView']")));
        String name = quotespage.quoteAccountNameTextBox.getAttribute("value");
        Assert.assertTrue(name.contains("Sea Region Inc"));
    }

}
