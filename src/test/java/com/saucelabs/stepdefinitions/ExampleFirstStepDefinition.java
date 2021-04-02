package com.saucelabs.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExampleFirstStepDefinition {

    // feature'da hangi given oldugunu belirttiysen burada da ayni adla belirtmelisin
    // ^ adin basina bunu koyarsan bununla baslayan ifadeyi arar
    // & isaretini bir kelimenin sonuna koyarsan sonu bununla bitek ifadeyi arar
    // Herhangi bir karakter yoksa equals olmali isimler
    /*@Given("This is GIVEN {int}")
    public void method1(int integer) {
        System.out.println("This is given method1 " + integer);
    }

    @When("This is {string}")
    public void method2(String string) {
        System.out.println("This is when method2 " + string);
    }

    @Then("This is {word}")
    public void method3(String word) {
        System.out.println("This is then method3 " + word);
    }*/


    @Given("This is GIVEN {int}")
    public void method1(int integer) {
        System.out.println("This is given method1 " + integer);
    }

    @When("This is {string}")
    public void method2(String string) {
        System.out.println("This is when method2 " + string);
    }

    @Then("^This is Then$")
    public void method3() {
        System.out.println("This is then method3");
    }


}
