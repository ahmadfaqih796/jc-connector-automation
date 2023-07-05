package com.example.steps;

import com.example.pages.LoginPage;
import com.example.utils.WebDriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
   private WebDriver driver;
   private LoginPage loginPage;

   @Before
   public void setUp() {
      // Inisialisasi WebDriver
      driver = WebDriverFactory.createWebDriver();
      loginPage = new LoginPage(driver);
   }

   @Given("I am on the login page")
   public void navigateToLoginPage() {
      driver.get("https://www.example.com/login");
   }

   @When("I enter username as {string} and password as {string}")
   public void enterCredentials(String username, String password) {
      loginPage.enterUsername(username);
      loginPage.enterPassword(password);
   }

   @When("I click the login button")
   public void clickLoginButton() {
      loginPage.clickLoginButton();
   }

   @Then("I should be logged in successfully")
   public void verifySuccessfulLogin() {
      // Verifikasi atau tindakan setelah login berhasil
   }

   @After
   public void tearDown() {
      // Tutup browser
      driver.quit();
   }
}
