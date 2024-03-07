import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class SampleTest {

    private AndroidDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android" );
        desiredCapabilities.setCapability("appium:automationName", "UIAutomator2");

        URL remouteUrl = new URL("http://127.0.0.1:4723");

        driver = new AndroidDriver(remouteUrl, desiredCapabilities);
    }

    @Test
    public void sampleTest() {
        MobileElement el1 = (MobileElement) driver.findElement("xpath", "//android.widget.TextView[@content-desc=\"Phone\"]");
        el1.click();
        el1.click();;
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}