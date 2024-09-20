package AppDemos;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import javax.swing.text.StyledEditorKit;

public class GraphicsPage {
    private final AndroidDriver driver;
    private final By colorMatrix = By.xpath("//android.widget.TextView[@content-desc=\"ColorMatrix\"]");
    public GraphicsPage(AndroidDriver driver){
        this.driver=driver;
    }

    public Boolean checkSuccessNavToGraphics() throws InterruptedException {
        Thread.sleep(100);
        return driver.findElement(colorMatrix).isDisplayed();
    }
}
