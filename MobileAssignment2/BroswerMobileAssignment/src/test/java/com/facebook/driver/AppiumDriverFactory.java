package com.facebook.driver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class AppiumDriverFactory {

    private static AppiumDriver driver;

    public static synchronized AppiumDriver getDriver() {
        if (driver == null) {
            try {
                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability("platformName", "Android");
                capabilities.setCapability("deviceName", "Pixel 7a API 34");
                capabilities.setCapability("browserName", "chrome");
                capabilities.setCapability("automationName", "UiAutomator2");
                capabilities.setCapability("chromedriverExecutable", "C:/Users/renukar/Downloads/chromedriver-win64 (2)/chromedriver-win64/chromedriver.exe");

                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.setExperimentalOption("useAutomationExtension", false);
                capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);

                System.out.println("Initializing AppiumDriver...");
                driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
                System.out.println("AppiumDriver initialized successfully.");

            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException("Failed to initialize the AppiumDriver", e);
            }
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
