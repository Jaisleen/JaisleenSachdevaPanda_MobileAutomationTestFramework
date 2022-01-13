package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tests.BaseTest;
import tests.MarketsPage;

import java.net.MalformedURLException;

public class MarketSection extends BaseTest {

    String validRegex = "^-?(?:\\d+|\\d{1,3}(?:,\\d{3})+)?(?:\\.\\d+)?$";

    MarketsPage marketsPage;

    @Given("the User in on the markets page")
    public void theUserInOnTheMarketsPage() throws MalformedURLException {
        // Setup Appium
        Android_setUp_noReset();
        // Create an object of a class
        marketsPage = new MarketsPage(driver);
        marketsPage.checkUserIsOnTheMarketsPage("Markets");
    }

    @Then("the name of the market is shown")
    public void theNameOfTheMarketIsShown() {
        String expectedText = "FTSE 100";

        marketsPage.checkTheNameOfTheMarketIsShown(expectedText);
    }

    @And("the rate of the market is shown")
    public void theRateOfTheMarketIsShown() {
        marketsPage.checkRateIsInteger(validRegex);
    }

    @And("the change of the market is shown")
    public void theChangeOfTheMarketIsShown() {
        marketsPage.checkMarketChangeIsPercentage();
    }

    @When("the User decides to view all markets")
    public void theUserDecidesToViewAllMarkets() {
        marketsPage.clickViewAllMarkets();
    }

    @And("the User returns from all markets page")
    public void theUserReturnsFromAllMarketsPage() {
        marketsPage.clickNavigateUpButton();
    }

    @Then("the User returns to the markets page")
    public void theUserReturnsToTheMarketsPage() { marketsPage.checkUserIsOnTheMarketsPage("Markets");
    }

    @Then("the price delayed disclaimer is correctly displayed")
    public void theDisclaimerIsCorrectlyDisplayed() {
        String expectedDisclaimerText = "Delayed by at least 15 mins.";
        marketsPage.checkDisclaimerTextIsShown(expectedDisclaimerText);

    }

    @When("the User scrolls to the FTSE One Hundred tab")
    public void theUserScrollsToTheFTSEOneHundredTab() {

    }
}
