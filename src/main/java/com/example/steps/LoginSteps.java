package com.example.steps;

import com.example.pages.LoginPage;
import com.example.utils.WebDriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
      driver.get("https://dev.dikahadir.com/job-connector/authentication/login");
   }

   @When("I enter username as {string} and password as {string}")
   public void enterCredentials(String email, String password) throws InterruptedException {
      loginPage.enterEmail(email);
      loginPage.enterPassword(password);
      Thread.sleep(2000);
   }

   @When("I click the login button")
   public void clickLoginButton() throws InterruptedException {
      loginPage.clickLoginButton();
      Thread.sleep(2000);
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
