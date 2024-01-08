import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class StartDriverSession {


    public static AppiumDriver initializeDriver(String platformName) throws Exception {
        DesiredCapabilities caps=new DesiredCapabilities();
        caps.setCapability("platformName",platformName);
        caps.setCapability("newCommandTimeout",300); // bu 5 dakika demek
        URL url=new URL("http://127.0.0.1:4723/");

        switch (platformName){
            case "Android":

        caps.setCapability("deviceName","pixel2");
        caps.setCapability("automationName","UiAutomator2");
        //caps.setCapability("udid","emulator-5554");
                caps.setCapability("newCommandTimeout",300); //inspector icin bir kod
        caps.setCapability("avd","pixel2");
        caps.setCapability("avdLaunchTimeout",180000);
        String andappURL=System.getProperty("user.dir")+ File.separator+"src"+File.separator+"main"+File.separator
                +"resources"+File.separator+"API Demos for Android_1.9.0_Apkpure.apk";
       // caps.setCapability("app",andappURL);

        caps.setCapability("appPackage","com.touchboarder.android.api.demos"); // uygulamayi tekrar tekrar yuklemek yerine
        caps.setCapability("appActivity","com.touchboarder.androidapidemos.MainActivity"); //uygulamayi tekrar tekrar yuklemek yerine
                return new AndroidDriver(url,caps);
                // System.out.println("session id:"+driver.getSessionId());
                //oturum kimligini yazdirmak ve inspectorde debugging yapmak icin lazim
            case "iOS":
                caps.setCapability("platformName","iOS");
                caps.setCapability("deviceName","iphone 12 mini");
                caps.setCapability("automationName","XCUITest");
                caps.setCapability("udid","376E7DBC-4A34-4DD4-A067-76E458C4247A");
                String iOSappURL=System.getProperty("user.dir")+ File.separator+"src"+File.separator+"main"+File.separator
                        +"resources"+File.separator+"UIKitCatalog-iphonesimulator.app";
                //caps.setCapability("app",iOSappURL);
                caps.setCapability("simulatorStartupTimeout",180000);
                caps.setCapability("bundleId","com.example.apple-samplecode.UICatalog");
                return new IOSDriver(url,caps);

            default:
                throw new Exception("invalid platform");

        }







    }
}
