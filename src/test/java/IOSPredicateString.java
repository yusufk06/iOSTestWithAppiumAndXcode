import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IOSPredicateString {
    public static void main(String[] args) throws Exception {
        AppiumDriver driver = StartDriverSession.initializeDriver("iOS");
        Thread.sleep(1000);

        WebElement myElement = driver.findElement(AppiumBy.iOSNsPredicateString("name ==\"Activity Indicators\""));
        By myElement1= AppiumBy.iOSNsPredicateString("Activity Indicators");
        myElement.click();

        WebElement myElement2 = driver.findElement(AppiumBy.iOSNsPredicateString("type ==\"XCUIElementTypeStaticText\" AND name ==\"Activity Indicators\""));
        //eger class ismi de yazilmasi gerekirse type olarak belirtiyoruz
    }
}
