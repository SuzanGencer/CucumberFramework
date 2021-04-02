package com.saucelabs.stepdefinitions;

import com.saucelabs.base.ConfigReader;
import com.saucelabs.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CheckoutSD {

    @Given("user is actually successfully login")
    public void verifyUserLoggedIn(){
        LoginPage.enterUsername(ConfigReader.getProperty("username"));
        LoginPage.enterPassword(ConfigReader.getProperty("password"));
        LoginPage.clickLoginButton();
        String expectedURL = "https://www.saucedemo.com/inventory.html";
        Assert.assertEquals(expectedURL, LoginPage.verifyURL());
    }

    @When("I click on item with name {string}")
    public void clickOnTheItem(String itemName) {
        HomePage.clickItem(itemName);
    }

    @And("I click on the ADD to CART button")
    public void clickOnAddCart() {
        ItemPage.clickAddToCart();
    }

    @And("I click on the SHOPPING CART button")
    public void clickOnShoppingCart() {
        ItemPage.clickToShoppingCart();
    }

    @And("I click on the CHECKOUT button")
    public void clickOnCheckout() {
        CheckoutStepOne.clickOnCheckout();
    }

    @And("I enter the order information as {string}, {string} and {string}")
    public void enterInfo(String firstName, String lastName, String zipcode) {
        CheckoutStepTwo.sendOrderInformation(firstName, lastName, zipcode);
    }

    @And("I click on continue button")
    public void clickOnContinue() {
        CheckoutStepTwo.clickContinue();
    }

    @Then("Item name mathces that of {string}")
    public void verifyNameMathces(String item) {
        Assert.assertTrue(CheckoutStep3.verifyItem(item));
    }
}
