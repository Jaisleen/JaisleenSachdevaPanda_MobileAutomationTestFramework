package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tests.BaseTest;
import tests.WatchlistPage;

import java.net.MalformedURLException;

public class CreateNewWatchlist extends BaseTest {
    WatchlistPage watchlistPage;

    @Given("^Click Watchlist tab$")
    public void clickWatchlistTab() throws MalformedURLException {
        Android_setUp_noReset();
        watchlistPage = new WatchlistPage(driver);
        watchlistPage.clickWatchlistTab();
    }

    @Given("^Click Create a Watchlist$")
    public void clickCreateAWatchlist() {
        watchlistPage.clickCreateAWatchlist();
    }

    @Given("^Enter Watchlist Name$")
    public void enterWatchlistName() {
        watchlistPage.enterWatchlistName("BestStocks");
    }

    @Given("^Click Add a Watchlist$")
    public void clickAddAWatchlist() {
        watchlistPage.clickSaveWatchlist();
    }
    @Then("^Watchlist is created successfully$")
    public void watchlistIsCreatedSuccessfully() {
        watchlistPage.checkWatchlistIsAdded("BestStocks");
    }

    @Given("the user is on watchlist page")
    public void theUserIsOnWatchlistPage() throws MalformedURLException {
        Android_setUp_noReset();
        watchlistPage = new WatchlistPage(driver);
        watchlistPage.clickWatchlistTab();

    }

    @When("the user has no watchlist added")
    public void theUserHasNoWatchlistAdded() {watchlistPage.


    }
}
