package AppDemos;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class ContentPage {
    private final AndroidDriver driver;
    private final By storage = By.xpath("//android.widget.TextView[@content-desc=\"Storage\"]");
    public ContentPage(AndroidDriver driver){
        this.driver=driver;
    }

    public Boolean checkSuccessNavToContent(){
        return driver.findElement(storage).isDisplayed();
    }
}
