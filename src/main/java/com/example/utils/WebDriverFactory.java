package com.example.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverFactory {
   public static WebDriver createWebDriver() {
      // Set the path to the chromedriver executable
      System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");

      // Configure ChromeOptions if needed
      ChromeOptions options = new ChromeOptions();
      // options.addArguments("...");

      // Create and return the WebDriver instance
      return new ChromeDriver(options);
   }
}