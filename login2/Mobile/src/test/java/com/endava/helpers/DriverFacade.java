package com.endava.helpers;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFacade extends AndroidDriver {
    private DriverFacade(URL remoteAddress, Capabilities desiredCapabilities) {
        super(remoteAddress, desiredCapabilities);
    }

    public static DriverFacade setDriver() {
        DesiredCapabilities desiredCapabilities = CapabilitiesSetUp.DefineCapabilitites();
        try {
            return new DriverFacade(new URL(Constants.SERVER_URL), desiredCapabilities);
        } catch (MalformedURLException e) {
            return null;
        }
    }

    public void backButtonPress() {
        pressKeyCode(AndroidKeyCode.BACK);
    }

    public void waitForElementToLoad(WebElement element) {
        WebDriverWait wait = new WebDriverWait(this, 7);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

}
