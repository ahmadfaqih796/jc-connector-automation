package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTest {
   public static void main(String[] args) {
      WebDriver driver = new ChromeDriver();
      // System.setProperty("chromedriver.chrome.driver",
      // "C:\\Users\\PT.DIKA\\Documents\\Software\\Selenium\\chromedriver.exe");
      System.setProperty("chromedriver.chrome.driver",
            "lib/chromedriver.exe");
      driver.get("https://aws.peluangkerjaku.com/timesheet/");
   }
}