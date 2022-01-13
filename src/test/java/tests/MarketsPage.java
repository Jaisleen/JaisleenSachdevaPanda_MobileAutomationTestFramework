package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.testng.Assert;

public class MarketsPage extends BasePage{

    public MarketsPage(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "toolbarTitle")
    MobileElement toolbarTitle;

    @AndroidFindBy(id = "marketCellNameText")
    MobileElement marketCellNameTextField;

    @AndroidFindBy(id = "marketCellValueText")
    MobileElement marketCellValueTextField;

    @AndroidFindBy(id = "marketCellChangePercentText")
    MobileElement marketCellChangePercentTextField;

    @AndroidFindBy(id = "marketsViewAllButton")
    MobileElement marketsViewAllButton;

    @AndroidFindBy(accessibility = "Navigate up")
    MobileElement navigateUpButton;

    @AndroidFindBy(id = "listFooterTimestamp")
    MobileElement DisclaimerTextField;



    public void checkUserIsOnTheMarketsPage(String expectedTitle){
        String toolbarTitleText = toolbarTitle.getText();
        boolean isTitleEqualToMarkets = toolbarTitleText.equals(expectedTitle);
        Assert.assertTrue(toolbarTitleText.equals(expectedTitle));
    }

    public void checkTheNameOfTheMarketIsShown(String expectedText){
        String marketsName = marketCellNameTextField.getText();
        Assert.assertTrue(marketsName.equals(expectedText));
    }

    public void checkRateIsInteger(String validRegex){
        String marketCellValueText = marketCellValueTextField.getText();
        boolean result = marketCellValueText.matches(validRegex);
        Assert.assertTrue(result);
    }

    public void checkMarketChangeIsPercentage(){
        String marketChangePercentText = marketCellChangePercentTextField.getText();
        boolean percentageResult = marketChangePercentText.contains("%");
        Assert.assertTrue(percentageResult);
    }

    public void checkDisclaimerTextIsShown(String expectedDisclaimerText){
       String disclaimerTextInApp =  DisclaimerTextField.getText();
        boolean disclaimerTextResult = disclaimerTextInApp.contains(expectedDisclaimerText);
        Assert.assertTrue(disclaimerTextResult);
    }





    public void clickViewAllMarkets(){
        marketsViewAllButton.click();
    }

    public void clickNavigateUpButton(){
        navigateUpButton.click();
    }

}
