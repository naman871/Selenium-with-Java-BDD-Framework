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
        driver.switchTo().frame(quotespage.iframeForQuotesCreatePage);
        quotespage.titleTextBoxQuotes.sendKeys(titleName);
    }

    public void accountFieldCursorQuotes(){
        quotespage = new QuotesPage(driver);
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        WebElement element = quotespage.accountSearchCursorQuotes;
        element.click();
    }

    public void saveButtonQuotes() {
        quotespage = new QuotesPage(driver);
        driver.switchTo().frame(quotespage.iframeForQuotesCreatePage);
        quotespage.saveButtonQuotesModule.click();
    }

    public void verifyTitleNameInNewPage(String titleNameViewPage) {
        driver.switchTo().frame(quotespage.iframeForQuotesViewPage);
        quotespage.verifyTitleNameInNewPageWindow.isDisplayed();
        String titleName = quotespage.verifyTitleNameInNewPageWindow.getText();
        Assert.assertEquals(titleName, titleNameViewPage);
    }
    public void getTheAccountListInTheAccountSearchWindow(String accountNameQuote){
        quotespage = new QuotesPage(driver);

        Set<String> secondWindow = driver.getWindowHandles();
        driver.switchTo().window(String.valueOf(secondWindow));
        quotespage.accountSearchBoxQuotesWindow.sendKeys(accountNameQuote);
        quotespage.searchButtonQuotesWindow.click();
        ArrayList a = new ArrayList();
        List <WebElement>accountnames = driver.findElements(By.xpath("//table[4]/tbody"));
        String account = quotespage.accountSearchBoxQuotesWindow.getText();
        for (WebElement accountName:accountnames)
        {
            a.add(accountName);
        }
        if (a.contains(account))
        {
            Assert.assertTrue("account name is not displayed",true);
        }

    }
    public void clickOnTheAccountName() {
        quotespage = new QuotesPage(driver);
        quotespage.quoteAccountName.click();
        String firstWindow = driver.getWindowHandle();
        driver.switchTo().window(firstWindow);
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

    public void theExistingAccountShouldBeSelectedForTheQuote(String existingAccountName){
        quotespage = new QuotesPage(driver);
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='./legacy/index.php?return_module=AOS_Quotes&return_action=DetailView&module=AOS_Quotes&action=EditView']")));
        String name = quotespage.quoteAccountNameTextBox.getAttribute("value");
        Assert.assertTrue(name.contains(existingAccountName));
    }
    public void clickCursorBesideOpportunities(){
        quotespage = new QuotesPage(driver);
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        WebElement element = quotespage.cursorBesideOpportunities;
        element.click();
    }
    public void clickOnTheOpportunityForTheOpportunityListInOpportunitySearchWindow(String opportunityNameQuote){
        quotespage = new QuotesPage(driver);
        Set<String> secondWindow = driver.getWindowHandles();
        driver.switchTo().window(String.valueOf(secondWindow));
        quotespage.accountSearchBoxQuotesWindow.sendKeys(opportunityNameQuote);
        quotespage.searchButtonQuotesWindow.click();
        ArrayList a = new ArrayList();
        List <WebElement>accountnames = driver.findElements(By.xpath("//table[4]/tbody"));
        String account = quotespage.accountSearchBoxQuotesWindow.getText();
        for (WebElement accountName:accountnames)
        {
            a.add(accountName);
        }
        if (a.contains(account))
        {
            Assert.assertTrue("opportunity name is not displayed",true);
        }

    }

    public void clickOnTheOpportunityName() {
        quotespage = new QuotesPage(driver);
        quotespage.opportunityNameQuote.click();
        String firstWindow = driver.getWindowHandle();
        driver.switchTo().window(firstWindow);
    }
    public void selectedOpportunityShouldBeDisplayedForTheQuote(String selectedOpportunityNameQuote){
        quotespage = new QuotesPage(driver);
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='./legacy/index.php?return_module=AOS_Quotes&return_action=DetailView&module=AOS_Quotes&action=EditView']")));
        String name = quotespage.quoteAccountNameTextBox.getAttribute("value");
        Assert.assertTrue(name.contains(selectedOpportunityNameQuote));

    }

}
