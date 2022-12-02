package steps;

import org.junit.Assert;
import pages.OpportunitiesPage;
import pages.QuotesPage;

import static steps.CommonSteps.driver;

public class QuotesSteps {

    public QuotesPage quotesPage;

    public void clickQuotes() {
        quotesPage = new QuotesPage(driver);
        quotesPage.quotes.click();
    }
    public void clickCreateQuotes(){
        quotesPage = new QuotesPage(driver);
        quotesPage.createQuotes.click();
    }
    public void clickSave(){
        quotesPage = new QuotesPage(driver);
        quotesPage.saveQuotes.click();
    }
    public void verifyErrorMessage(String errorMessage){
        quotesPage = new QuotesPage(driver);
        String errorMessageText = quotesPage.errorMessageAfterSave.getText();
        System.out.println(errorMessageText);
        Assert.assertEquals("Error message is not displayed",errorMessageText,errorMessage);
    }
}
