package steps;

import pages.QuotesPage;

public class QuotesSteps extends CommonSteps {

     public QuotesPage quotespage;
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
