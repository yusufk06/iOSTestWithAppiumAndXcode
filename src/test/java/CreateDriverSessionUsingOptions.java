import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class CreateDriverSessionUsingOptions {
    public static void main(String[] args) throws MalformedURLException {
//        String appURL=System.getProperty("user.dir")+ File.separator+"src"+ File.separator+"main"+File.separator
//                +"resources"+File.separator+"UIKitCatalog-iphonesimulator.app";
//        XCUITestOptions options=new XCUITestOptions().setDeviceName("iphone 12 mini").
//                setAutomationName("XCUITest").setUdid("376E7DBC-4A34-4DD4-A067-76E458C4247A").setApp(appURL);
//        URL url=new URL("http://127.0.0.1:4723/");
//        AppiumDriver driver=new IOSDriver(url,options);

/// adb shell "dumpsys activity activities | grep mResumedActivity" |bu duz cizgi bu komut appactivity degerini
        // veriyor yani ana sayfa ya da icinde oldugumuz sayfanin baslangic degeri


        String appURL=System.getProperty("user.dir")+ File.separator+"src"+ File.separator+"main"+File.separator
               +"resources"+File.separator+"9.apk";
        UiAutomator2Options options=new UiAutomator2Options().setDeviceName("PIXEL 2").
                setAutomationName("UiAutomator2").setApp(appURL);
        URL url=new URL("http://127.0.0.1:4723/");
        AppiumDriver driver =new AndroidDriver(url,options);

    }
}
