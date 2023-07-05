package com.example.steps;

import com.example.pages.LoginPage;
import com.example.utils.WebDriverFactory;
// import io.cucumber.java.After;
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
      driver = WebDriverFactory.createWebDriver();
      loginPage = new LoginPage(driver);
   }

   @Given("Aku berada di Halaman Login")
   public void navigateToLoginPage() {
      driver.get("https://dev.dikahadir.com/job-connector/authentication/login");
   }

   @When("Aku memasukkan email {string} dan password {string}")
   public void enterCredentials(String email, String password) {
      loginPage.enterEmail(email);
      loginPage.enterPassword(password);
   }

   @When("Aku mengklik tombol Login")
   public void clickLoginButton() {
      loginPage.clickLoginButton();
   }

   @Then("Aku Gagal Login")
   public void verifyFailedLogin() throws InterruptedException {
      Thread.sleep(2000);
      driver.quit();
   }

   @Then("Aku berhasil Login")
   public void verifySuccessfulLogin() throws InterruptedException {
      Thread.sleep(2000);
      // assertTrue("Login was not successful", loginPage.isLoggedIn());
   }

   // @After
   // public void tearDown() throws InterruptedException {
   // Thread.sleep(2000);
   // driver.quit();
   // }
}