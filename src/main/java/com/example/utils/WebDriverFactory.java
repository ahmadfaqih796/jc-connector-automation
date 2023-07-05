package com.example.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverFactory {
   public static WebDriver createWebDriver() {
      System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
      ChromeOptions options = new ChromeOptions();
      return new ChromeDriver(options);
   }
}