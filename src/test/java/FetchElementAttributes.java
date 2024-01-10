import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class FetchElementAttributes {

    public static void main(String[] args) throws Exception {
        AppiumDriver driver = StartDriverSession.initializeDriver("Android");

        By accessibility = AppiumBy.accessibilityId("Accessibility");
        System.out.println("text:"+driver.findElement(accessibility).getText());
        System.out.println("text:"+driver.findElement(accessibility).getAttribute("text"));
        System.out.println("checked:"+driver.findElement(accessibility).getAttribute("checked"));
        System.out.println("displayed:"+driver.findElement(accessibility).getAttribute("displayed"));
        System.out.println("selected:"+driver.findElement(accessibility).getAttribute("selected"));

        System.out.println("displayed:"+driver.findElement(accessibility).isDisplayed());

        // inspector da elementin ozelliklerini kontrol etmek icin kullanilir

    }
}
