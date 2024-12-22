package com.facebook.hooks;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import com.facebook.driver.AppiumDriverFactory;

public class Hooks {

    // Before each scenario, initialize the driver
    @Before
    public void beforeScenario() {
        AppiumDriverFactory.getDriver();  // Initialize driver before each scenario
    }

    // After each scenario, quit the driver
    @After
    public void afterScenario() {
        if (AppiumDriverFactory.getDriver() != null) {
            AppiumDriverFactory.getDriver().quit();  // Quit the driver after each scenario
        }
    }
}
