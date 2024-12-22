package com.facebook.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

public class LoginPage {

	
	AppiumDriver driver;

    public LoginPage(AppiumDriver driver) {
        this.driver = driver;
    }
    
    
 // Locators
    By usernameField = By.id("m_login_email");
    By passwordField = By.id("m_login_password");
    By loginButton = By.xpath("//android.widget.Button[@text='Log in']");

    // Actions
    public void enterUsername(String username) {
        WebElement usernameInput = driver.findElement(usernameField);
        usernameInput.sendKeys(username);
    }

    public void enterPassword(String password) {
        WebElement passwordInput = driver.findElement(passwordField);
        passwordInput.sendKeys(password);
    }

    public void clickLogin() {
        WebElement loginBtn = driver.findElement(loginButton);
        loginBtn.click();
    }
}
