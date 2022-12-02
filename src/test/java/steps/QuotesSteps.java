package steps;

import org.junit.Assert;
import pages.OpportunitiesPage;
import pages.QuotesPage;

import static steps.CommonSteps.driver;

public class QuotesSteps extends CommonSteps {

     public QuotesPage quotespage;

    public void clickQuotes() {
        quotespage = new QuotesPage(driver);
        quotespage.quotes.click();
    }
    public void clickCreateQuotes(){
        quotespage = new QuotesPage(driver);
        quotespage.createQuotes.click();
    }
    public void clickSave(){
        quotespage = new QuotesPage(driver);
        quotespage.saveQuotes.click();
    }
    public void verifyErrorMessage(String errorMessage){
        quotespage = new QuotesPage(driver);
        String errorMessageText = quotespage.errorMessageAfterSave.getText();
        System.out.println(errorMessageText);
        Assert.assertEquals("Error message is not displayed",errorMessageText,errorMessage);
    }
     public void clickOnQuotesDropdown() {
          quotespage= new QuotesPage(this.driver);
          quotespage.quotesDropdown.click();
     }
     public void clickOnCreateQuote() {
          quotespage= new QuotesPage(this.driver);
          quotespage.createQuotes.click();
     }
     public void titleTextBoxQuotes() {
          quotespage= new QuotesPage(this.driver);
          driver.switchTo().frame(quotespage.iframeForQuotesCreatePage);
          quotespage.titleTextBoxQuotes.sendKeys("sukanya");
     }
     public void saveButtonQuotes(){
          quotespage= new QuotesPage(this.driver);
          quotespage.saveButtonQuotesModule.click();
     }
      }
