package com.example.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
      // "src/test/java/com/example/features/loginPage.feature",
      "src/test/java/com/example/features/login.feature",
}, glue = "com.example.steps")
public class TestRunner {
}