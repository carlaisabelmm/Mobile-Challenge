package com.endava.screens;

import org.openqa.selenium.WebDriver;

public class BaseScreen {

    WebDriver driver;

    public BaseScreen(WebDriver driver) {
        this.driver = driver;
    }
}
