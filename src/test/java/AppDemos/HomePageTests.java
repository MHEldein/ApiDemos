package AppDemos;

import Base.Base;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class HomePageTests extends Base {
    private AccessibilityPage accessibilityPage;
    private AnimationPage animationPage;
    private AppPage appPage;
    private ContentPage contentPage;
    private GraphicsPage graphicsPage;
    private MediaPage mediaPage;

    @Test(priority = 1)
    public void testNavToAccessibility() throws InterruptedException {
        accessibilityPage = homePage.navToAccessibilityPage();
        assertTrue(accessibilityPage.checkSuccessNavToAccessibility());
    }

    @Test(priority = 2)
    public void testNavToAnimation() throws InterruptedException {
        animationPage = homePage.navToAnimationPage();
        assertTrue(animationPage.checkSuccessNavToAnimation());
    }

    @Test(priority = 3)
    public void testNavToApp() throws InterruptedException {
        appPage = homePage.navToAppPage();
        appPage.checkSuccessNavToApp();
    }

    @Test(priority = 4)
    public void testNavToContent() throws InterruptedException {
        contentPage = homePage.navToContentPage();
        contentPage.checkSuccessNavToContent();
    }

    @Test(priority = 5)
    public void testNavToGraphics() throws InterruptedException {
        graphicsPage = homePage.navToGraphicsPage();
        graphicsPage.checkSuccessNavToGraphics();
    }

    @Test(priority = 6)
    public void testNavToMedia() throws InterruptedException {
        mediaPage = homePage.navToMediaPage();
        mediaPage.checkSuccessNavToMedia();
    }

}
