package tests.Android;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
public class MarketTabTest {

    AndroidDriver driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("platformVersion", "12");
        caps.setCapability("deviceName", "Android Emulator");
        caps.setCapability("forceEspressoRebuild", true);
        caps.setCapability("noReset", true);
        caps.setCapability("app", System.getProperty("user.dir") + "/apps/HL_base.apk");
        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);

        // Delay starting the testing by 2 seconds
        // Since the app takes time to load and start up
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
//             ignore
        }
    }

    @Test
    public void check_Markets_Price_Ratio() {

//        Helpers.swipeScreen(Helpers.Direction.LEFT,driver,400);
//
//        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Get Started\")").click();
//        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Accept\")").click();

        driver.findElementById("com.mubaloo.android.hargreaveslansdown:id/bottom_nav_market").click();

        String ratioText = driver.findElementById("com.mubaloo.android.hargreaveslansdown:id/marketCellChangePercentText").getText();
        Assert.assertTrue(ratioText.contains("%"));
    }

    @Test
    public void click_Markets_BottomNav() {


        String toolbarTitle = driver.findElementById("com.mubaloo.android.hargreaveslansdown:id/toolbarTitle").getText();
        Assert.assertEquals("Markets",toolbarTitle);
    }


    @AfterTest
    public void tearDown() {
        if (null != driver) {
            driver.quit();
        }
    }

}
