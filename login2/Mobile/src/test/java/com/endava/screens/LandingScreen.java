package com.endava.screens;

import com.endava.helpers.DriverFacade;
import com.endava.helpers.RandomData;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingScreen extends BaseScreen {

    @FindBy(id = "com.olx.olx:id/autolocation_button")
    WebElement autoLocateButton;
    @FindBy(id = "com.olx.olx:id/walkthrough_next")
    WebElement confirmLocationButton;
    @FindBy(id = "com.olx.olx:id/tutorial_btn_sign_in")
    WebElement loginWithMailButton;
    @FindBy(id = "com.olx.olx:id/tutorial_form_edt_email")
    WebElement emailField;
    @FindBy(id = "com.olx.olx:id/password_edt")
    WebElement passwordFiedl;
    @FindBy(id = "com.olx.olx:id/tutorial_signup_btn_register")
    WebElement sendEmailButton;
    @FindBy(id = "com.olx.olx:id/email_confirmation_btn_ok")
    WebElement confirmEmailButton;
    @FindBy(id = "com.olx.olx:id/tv_content")
    WebElement firstTimeWelcom;
    @FindBy(id = "com.olx.olx:id/search_location")
    WebElement searchLocationBar;
    @FindBy(id = "com.olx.olx:id/search_button")
    WebElement sendSearchLocation;
    @FindBy(id = "com.olx.olx:id/fragment_tutorial_start")
    WebElement skipTutorialButton;


    public LandingScreen(WebDriver driver) {
        super(driver);
    }

    public void selectLocation() {
        waitForElementAndClick(skipTutorialButton);
        waitForElement(searchLocationBar);
        searchLocationBar.sendKeys("Bogota");
        sendSearchLocation.click();
        ((DriverFacade)driver).tap(1,311,365,2);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void confirmLocation() {
        waitForElementAndClick(confirmLocationButton);
    }

    public void clickLoginWithMail() {
        waitForElementAndClick(loginWithMailButton);
    }

    public void sendLoginCredentials() {
        waitForElementAndClick(sendEmailButton);
        waitForElementAndClick(confirmEmailButton);
        waitForElementAndClick(firstTimeWelcom);
    }

    public void fillLoginFields() {
        waitForElement(emailField);
        fillEmailField();
        fillPasswordField();
        ((DriverFacade) driver).backButtonPress();
    }

    private void fillPasswordField() {
        String randomPassword = RandomData.generateRandomData();
        passwordFiedl.sendKeys(randomPassword);
    }

    private void fillEmailField() {
        String randomMail = RandomData.generateRandomData() + "@gmail.com";
        emailField.clear();
        emailField.sendKeys(randomMail);
    }

    private void waitForElement(WebElement webElement) {
        ((DriverFacade) driver).waitForElementToLoad(webElement);
    }

    private void waitForElementAndClick(WebElement webElement) {
        ((DriverFacade) driver).waitForElementToLoad(webElement);
        webElement.click();
    }
}
