package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;

public class HomePageSteps extends CommonSteps {

    HomePage homePage;


    public void verifySuiteDashBoard() {
        homePage.suiteCrmDashboardButton.isDisplayed();
//        Actions action = new Actions(driver);
//        action.moveToElement(commonPage.opportunitiesModule).build().perform();  // build().perform

    }

    public void clickOpportunitiesModule() {
        homePage = new HomePage(this.driver);
        homePage.opportunitiesModule.click();
    }

    public void clickOnHomePage() {
        homePage = new HomePage(this.driver);
        homePage.homePageButton.click();
    }

    public void clickContactsModule() {
        homePage = new HomePage(this.driver);
        homePage.contactsModule.click();

    }

    public void clickOnCreateContact() {
        homePage = new HomePage(this.driver);
        homePage.createContact.click();

    }

    public void clickOnViewContact() {
        homePage = new HomePage(this.driver);
        homePage.viewContact.click();
    }
}