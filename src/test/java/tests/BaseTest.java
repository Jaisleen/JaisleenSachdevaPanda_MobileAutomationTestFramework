package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest extends AbstractTestNGCucumberTests {

    public static AppiumDriver driver;

    public static void Android_setUp_freshInstall() throws MalformedURLException {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("platformName", "Android");
            caps.setCapability("automationName", "UiAutomator2");
            caps.setCapability("platformVersion", "12");
            caps.setCapability("deviceName", "Android Emulator");
            caps.setCapability("forceEspressoRebuild", true);

            // Reset the app to test fresh install
            caps.setCapability("noReset", false);
            caps.setCapability("app", System.getProperty("user.dir") + "/apps/HL_base.apk");
            driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);

            // Delay starting the testing by 2 seconds
            // Since the app takes time to load and start up
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }

    }
    public static void Android_setUp_noReset() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("platformVersion", "11");
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

    public static void tearDown() {
        if (null != driver) {
            driver.quit();
        }
    }

}
