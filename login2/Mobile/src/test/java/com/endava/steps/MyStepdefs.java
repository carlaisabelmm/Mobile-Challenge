package com.endava.steps;

import com.endava.helpers.DriverFacade;
import com.endava.screens.HomeScreen;
import com.endava.screens.LandingScreen;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MyStepdefs {
    HomeScreen homeScreen;
    private WebDriver driver;
    private LandingScreen landingScreen;

    @Before
    public void SetUp() {
        driver = DriverFacade.setDriver();
        landingScreen = PageFactory.initElements(driver, LandingScreen.class);
    }

    @After
    public void TestClosure() {
        driver.quit();
    }


    @Given("^The user wants to login in the OLX app$")
    public void theUserWantsToLoginInTheOLXApp() {
         landingScreen.selectLocation();
         landingScreen.confirmLocation();
        landingScreen.clickLoginWithMail();
    }

    @When("^the user fills the fields with valid credentials$")
    public void theUserFillsTheFieldsWithValidCredentials() {
        landingScreen.fillLoginFields();
    }

    @And("^taps the enter button$")
    public void tapsTheEnterButton() {
        landingScreen.sendLoginCredentials();
    }

    @Then("^the user is logged in$")
    public void theUserIsLoggedIn() {

    }
}
