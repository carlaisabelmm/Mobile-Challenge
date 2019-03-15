package pages;

import helpers.PropertiesReader;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.*;
import java.net.URL;


public class BasePage extends PropertiesReader {

    private static AndroidDriver driver;

    public void startApplication() throws IOException {

        dataFileFromConfigProperties();
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("app", new File("C:\\Users\\cmarquez\\Documents\\Mobile_Challenge_Repo\\TestingApplicationMobileFirst\\com.olx.olx_52505_apps.evozi.com.apk").getAbsolutePath());
        desiredCapabilities.setCapability("deviceName", getValueByKey("udid"));
        driver = new AndroidDriver(new URL(getValueByKey("URL")), desiredCapabilities);
        WebDriverWait wait = new WebDriverWait(driver, 100);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(getValueByKey("id"))));
    }


}