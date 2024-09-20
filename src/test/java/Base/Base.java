package Base;
import org.testng.ITestListener;
import AppDemos.HomePage;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;

public class Base {
    protected HomePage homePage;
    private AndroidDriver driver;


    public void  configureAppium() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("appium:deviceName", "Pixel8Pro");
        caps.setCapability("udid", "emulator-5554");
        caps.setCapability("platformName", "Android");
        caps.setCapability("appium:platformVersion", "VanillaIceCream");
        caps.setCapability("appium:app", "/Users/mahmoudhossam/IdeaProjects/first-appium/src/main/resources/ApiDemos-debug.apk");
        caps.setCapability("appPackage", "io.appium.android.apis");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appActivity", "io.appium.android.apis.ApiDemos");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), caps);
        homePage = new HomePage(driver);

    }

    @BeforeMethod
    public void tearDown(){
        if (driver != null){
            driver.quit();
        }
    }
}
