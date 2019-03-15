package helpers;

import helpers.PropertiesReader;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.*;
import java.net.URL;


public class CapabilitiesInit extends PropertiesReader{

    private static AndroidDriver driver;

    public void startApplication() throws IOException {
        dataFileFromConfigProperties();
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("app",new File(getValueByKey("appDir")).getAbsolutePath());
        desiredCapabilities.setCapability("deviceName",getValueByKey("udid"));
        driver = new AndroidDriver(new URL(getValueByKey("URL")),desiredCapabilities);
        WebDriverWait wait = new WebDriverWait(driver, 100);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(getValueByKey("id"))));
    }


}
