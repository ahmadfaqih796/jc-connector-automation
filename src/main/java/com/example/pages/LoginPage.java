package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
   private WebDriver driver;
   private By emailInput = By.id("email");
   private By passwordInput = By.id("password");
   private By loginButton = By.xpath("//button[contains(text(), 'Masuk')]");

   public LoginPage(WebDriver driver) {
      this.driver = driver;
   }

   public void enterEmail(String email) {
      driver.findElement(emailInput).sendKeys(email);
   }

   public void enterPassword(String password) {
      driver.findElement(passwordInput).sendKeys(password);
   }

   public void clickLoginButton() {
      driver.findElement(loginButton).click();
   }
}