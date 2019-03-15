package pages;

import helpers.PropertiesReader;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class BasePage extends PropertiesReader {

    private static AndroidDriver driver;
    PropertiesReader properties = new PropertiesReader();

    public void startApplication() throws IOException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("app",new File().getAbsolutePath());
        //desiredCapabilities.setCapability("app",new File("C:\\Users\\cmarquez\\Documents\\Mobile_Challenge_Repo\\TestingApplicationMobileChallenge\\com.olx.olx_52505_apps.evozi.com.apk").getAbsolutePath());
        desiredCapabilities.setCapability("deviceName","emulator-5554");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);
       // WebDriverWait wait = new WebDriverWait(driver, 100);
      //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/contentPanel")));





    }


}
