package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
   private WebDriver driver;
   private By usernameInput = By.id("username");
   private By passwordInput = By.id("password");
   private By loginButton = By.cssSelector("button[type='submit']");

   public LoginPage(WebDriver driver) {
      this.driver = driver;
   }

   public void enterUsername(String username) {
      driver.findElement(usernameInput).sendKeys(username);
   }

   public void enterPassword(String password) {
      driver.findElement(passwordInput).sendKeys(password);
   }

   public void clickLoginButton() {
      driver.findElement(loginButton).click();
   }
}