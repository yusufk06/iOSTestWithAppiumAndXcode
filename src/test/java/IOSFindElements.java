import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public class IOSFindElements {
    public static void main(String[] args) throws Exception {


        AppiumDriver driver = StartDriverSession.initializeDriver("iOS");
        Thread.sleep(1000);

        driver.findElement(AppiumBy.accessibilityId("Activity Indicators")).click();
        WebElement element=  driver.findElement(AppiumBy.name("Activity Indicators"));
        driver.findElement(AppiumBy.className("XCUIElementTypeStaticText"));
        driver.findElements(AppiumBy.className("XCUIElementTypeStaticText")).get(1); // buda elementler icinden indexe gore getirir
        driver.findElement(AppiumBy.id("Activity Indicators"));
        driver.findElement(AppiumBy.xpath("//XCUIElementTypeStaticText[@name=\"Activity Indicators\"]"));
        driver.findElement(AppiumBy.tagName("Activity Indicators")); // guvenli degil genel oldugu icin




    }
}