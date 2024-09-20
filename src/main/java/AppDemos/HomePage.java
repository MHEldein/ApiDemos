package AppDemos;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private final AndroidDriver driver;
    private final By goToAccessibility = By.xpath("//android.widget.TextView[@content-desc=\"Accessibility\"]");
    private final By goToAnimation = By.xpath("//android.widget.TextView[@content-desc=\"Animation\"]");
    private final By goToApp = By.xpath("//android.widget.TextView[@content-desc=\"App\"]");
    private final By goToContent = By.xpath("//android.widget.TextView[@content-desc=\"Content\"]");
    private final By goToGraphics = By.xpath("//android.widget.TextView[@content-desc=\"Graphics\"]");
    private final By goToMadia = By.xpath("//android.widget.TextView[@content-desc=\"Media\"]");
    public HomePage (AndroidDriver driver){
        this.driver = driver;
    }

    public AccessibilityPage navToAccessibilityPage(){
        driver.findElement(goToAccessibility).click();
        return new AccessibilityPage(driver);
    }

    public AnimationPage navToAnimationPage(){
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.visibilityOf(driver.findElement(goToAnimation)));
        driver.findElement(goToAnimation).click();
        return new AnimationPage(driver);
    }

    public AppPage navToAppPage(){
        driver.findElement(goToApp).click();
        return new AppPage(driver);
    }

    public ContentPage navToContentPage(){
        driver.findElement(goToContent).click();
        return new ContentPage(driver);
    }

    public GraphicsPage navToGraphicsPage(){
        driver.findElement(goToGraphics).click();
        return new GraphicsPage(driver);
    }

    public MediaPage navToMediaPage(){
        driver.findElement(goToMadia).click();
        return new MediaPage(driver);
    }
}

