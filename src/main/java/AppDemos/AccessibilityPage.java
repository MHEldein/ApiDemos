package AppDemos;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class AccessibilityPage {
    private final AndroidDriver driver;
    private final By accessibilityNodeProvider = By.xpath("//android.widget.TextView[@content-desc=\"Accessibility Node Provider\"]");
    public AccessibilityPage(AndroidDriver driver){
        this.driver=driver;
    }

    public Boolean checkSuccessNavToAccessibility() throws InterruptedException {
        Thread.sleep(100);
        return driver.findElement(accessibilityNodeProvider).isDisplayed();
    }
}
