package com.saucelabs.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleLoginStepDefinition {
    WebDriver driver;
    By user = By.id("txtUsername");
    By pass = By.id("txtPassword");
    By lgnBtn = By.id("btnLogin");


    @Given("User will be on Login Page")
    public void given1() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @When("User enter correct username and password and click login")
    public void when1() {
        driver.findElement(user).sendKeys("admin");
        driver.findElement(pass).sendKeys("admin123");
        driver.findElement(lgnBtn).click();
    }

    @Then("Verify login")
    public void then1() {
        String currentUrl = driver.getCurrentUrl();
        String expectedUrl = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
        Assert.assertEquals(expectedUrl, currentUrl);
    }

    @Then("^close")
    public void close() {
        driver.close();
    }
}
