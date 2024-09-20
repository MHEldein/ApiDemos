package AppDemos;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class AnimationPage {
    private final AndroidDriver driver;
    private final By layoutAnimation = By.xpath("//android.widget.TextView[@content-desc=\"Layout Animations\"]");

    public AnimationPage(AndroidDriver driver){
        this.driver=driver;
    }

    public Boolean checkSuccessNavToAnimation() throws InterruptedException {
        Thread.sleep(100);
        return driver.findElement(layoutAnimation).isDisplayed();
    }
}
