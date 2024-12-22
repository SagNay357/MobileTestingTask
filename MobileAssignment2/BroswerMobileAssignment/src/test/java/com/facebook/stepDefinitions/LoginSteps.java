package com.facebook.stepDefinitions;

import com.facebook.driver.AppiumDriverFactory;
import com.facebook.pages.LoginPage;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	private AppiumDriver driver;
    private LoginPage loginPage;

    @Before
    public void setUp() {
        // Initialize the driver and the login page here
        driver = AppiumDriverFactory.getDriver();
        loginPage = new LoginPage(driver);
    }
	
    @Given("the user is on the Facebook login page")
    public void givenTheUserIsOnFacebookLoginPage() {
    	
    	if (driver != null) {
        driver.get("https://www.facebook.com");
    }
   
    	else {
            System.out.println("Appium driver is not initialized!");
        }
    }

    @When("the user enters a valid username and password")
    public void whenUserEntersValidCredentials() {
        loginPage.enterUsername("renukarajendran268@gmail.com");  // Replace with actual username
        loginPage.enterPassword("Renuka@98");  // Replace with actual password
        loginPage.clickLogin();
    }

    @When("the user enters an invalid username or password")
    public void whenUserEntersInvalidCredentials() {
        loginPage.enterUsername("renu@gmail.com");
        loginPage.enterPassword("renu123");
        loginPage.clickLogin();
    }

    

    
}
