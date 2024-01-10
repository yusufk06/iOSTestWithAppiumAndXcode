import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

public class AndroidGestures {
    public static void main(String[] args) throws Exception {
        AppiumDriver driver= StartDriverSession.initializeDriver("Android");
        longClikGesture(driver);
    }

    public static void longClikGesture(AppiumDriver driver){
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
        WebElement element=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));

        driver.executeScript("mobile: longClickGesture",
                ImmutableMap.of(
                        //"elementId",((RemoteWebElement)element).getId(),
                "x",217,"y",659,  //elementID yeriner koordinat ile almak istenirse
                        "duration",1000));
    }
}
