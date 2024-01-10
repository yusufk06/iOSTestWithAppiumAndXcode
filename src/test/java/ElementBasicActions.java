import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.remote.RemoteWebElement;

public class ElementBasicActions {

    public static void main(String[] args) throws Exception {
        AppiumDriver driver=StartDriverSession.initializeDriver("Android");

        By views=  AppiumBy.accessibilityId("Views");

        WebElement element=driver.findElement(AppiumBy.id("android:id/list"));
        driver.executeScript("mobile : swipeGesture", ImmutableMap.of("elementId", ((RemoteWebElement)element)
        .getId(),"direction","up","percent",0.75));

       

    }
}
