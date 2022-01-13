package tests.Android;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import tests.BaseTest;

import java.net.MalformedURLException;
import java.net.URL;

import static tests.BaseTest.Android_setUp_freshInstall;
import static tests.BaseTest.tearDown;

public class FreshInstallTest {
    AndroidDriver driver;


    @Test
    public void verify_LoggedOut_State() throws MalformedURLException {
        Android_setUp_freshInstall();
        Helpers.swipeScreen(Helpers.Direction.LEFT,driver,400);

        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Get Started\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Accept\")").click();

        driver.findElementById("com.mubaloo.android.hargreaveslansdown:id/bottom_nav_portfolio");
        driver.findElementById("com.mubaloo.android.hargreaveslansdown:id/bottom_nav_watchlist");
        driver.findElementById("com.mubaloo.android.hargreaveslansdown:id/bottom_nav_search");
        driver.findElementById("com.mubaloo.android.hargreaveslansdown:id/bottom_nav_market");
        driver.findElementById("com.mubaloo.android.hargreaveslansdown:id/bottom_nav_news");

    }

    @Test
    public void click_Markets_BottomNav() {

        String toolbarTitle = driver.findElementById("com.mubaloo.android.hargreaveslansdown:id/toolbarTitle").getText();
        Assert.assertEquals("Markets",toolbarTitle);

        tearDown();
    }


}
