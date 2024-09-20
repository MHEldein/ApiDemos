package AppDemos;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class MediaPage {
    private final AndroidDriver driver;
    private final By androidFx = By.xpath("//android.widget.TextView[@content-desc=\"AudioFx\"]");

    public MediaPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public Boolean checkSuccessNavToMedia() throws InterruptedException {
        Thread.sleep(100);
        return driver.findElement(androidFx).isDisplayed();
    }
}
