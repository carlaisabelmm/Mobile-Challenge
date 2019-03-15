package tests;

import helpers.PropertiesReader;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class main {


    public static void main(String[] args) throws IOException {
       PropertiesReader propertiesReader = new PropertiesReader();
       propertiesReader.dataFileFromConfigProperties();
       System.out.println(propertiesReader.getValueByKey("appDir"));
        System.out.println(propertiesReader.getValueByKey("id"));
        System.out.println(propertiesReader.getValueByKey("URL"));
        System.out.println(propertiesReader.getValueByKey("udid"));
       BasePage basePage = new BasePage();
       basePage.startApplication();




    }
}
