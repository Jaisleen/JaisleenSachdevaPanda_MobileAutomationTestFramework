package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class WatchlistPage extends BasePage {
    public WatchlistPage(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "bottom_nav_watchlist")
    MobileElement bottonNavWatchlist;
    @AndroidFindBy(id = "watchlistName")
    MobileElement watchlistNameTxt;
    @AndroidFindBy(id = "watchlist_create_button")
    MobileElement watchlistCreateBtn;
    @AndroidFindBy(id = "add_a_watchlist_button")
    MobileElement addWatchlistBtn;
    @AndroidFindBy(id = "watchlist_input_box")
    MobileElement watchlistInputBoxTxt;
    @AndroidFindBy(id = "toolbarTitle")
    MobileElement watchlistToolbatTitle;

    @AndroidFindBy(id = "watchlist_info_header")
    MobileElement watchlistTextInAppBelowEyeIcon;


    public void clickWatchlistTab(){
     bottonNavWatchlist.click();
    }

    public void clickCreateAWatchlist(){
        watchlistCreateBtn.click();
    }

    public void enterWatchlistName(String txt){
        watchlistInputBoxTxt.sendKeys(txt);
    }

    public void clickSaveWatchlist(){
        addWatchlistBtn.click();
    }
    public Boolean checkWatchlistIsAdded(String txt){
        String txtAdded = watchlistToolbatTitle.getText();
        return txtAdded.equalsIgnoreCase(txt);
    }

    public void theUserHasNoWatchlistAdded (String  ){


    }

}
