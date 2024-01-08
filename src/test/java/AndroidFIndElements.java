import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AndroidFIndElements {
    public static void main(String[] args) throws Exception {
        AppiumDriver driver=StartDriverSession.initializeDriver("Android");
      // WebElement myElement= driver.findElement(AppiumBy.xpath("//*[@text='Storage']"));
       Thread.sleep(1000);
       // System.out.println(myElement.getText());


        WebElement myElementa=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Storage\")"));
        myElementa.click();
        By myElement1=AppiumBy.androidUIAutomator("new UiSelector().text(\"Storage\")");







    }
}
