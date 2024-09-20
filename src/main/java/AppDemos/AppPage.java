package AppDemos;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class AppPage {
    private final AndroidDriver driver;
    private final By deviceAdmin = By.xpath("//android.widget.TextView[@content-desc=\"Device Admin\"]");

    public AppPage(AndroidDriver driver){
        this.driver=driver;
    }

    public Boolean checkSuccessNavToApp(){
        return driver.findElement(deviceAdmin).isDisplayed();
    }
}
