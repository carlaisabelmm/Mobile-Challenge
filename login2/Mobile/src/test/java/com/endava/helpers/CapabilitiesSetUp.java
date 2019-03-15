package com.endava.helpers;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

public class CapabilitiesSetUp {


    public static DesiredCapabilities DefineCapabilitites() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        boolean sauceLabOn = false;
        if (sauceLabOn) {

            desiredCapabilities.setCapability("app", new File(Constants.APP_PATH).getAbsolutePath());
            desiredCapabilities.setCapability("testobject_api_key", Constants.API_KEY);
            desiredCapabilities.setCapability("platformName", "Android");
            desiredCapabilities.setCapability("platformVersion", "5");
            desiredCapabilities.setCapability("deviceName", "Motorola_Moto_E2_real_us");
            desiredCapabilities.setCapability("phoneOnly", "false");
            desiredCapabilities.setCapability("tabletOnly", "false");
            desiredCapabilities.setCapability("privateDevicesOnly", "false");
            desiredCapabilities.setCapability("testobject_app_id", "4");
        } else {
            desiredCapabilities.setCapability("app", new File(Constants.APP_PATH).getAbsolutePath());
            desiredCapabilities.setCapability("udid", "BQUCS4KZZSWKVOBY");
            desiredCapabilities.setCapability("platformName", "Android");
            desiredCapabilities.setCapability("deviceName", "dovahPhone");

        }

        return desiredCapabilities;
    }
}
