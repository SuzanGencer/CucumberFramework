package com.saucelabs.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // This creates cucumber report
        plugin = {"pretty", "html:target/site/cucumber-pretty.html",
                "json:target/cucumber-html-reports/cucumber.json",
                "junit:target/cucumber-xml-reports/cucumber.xml"},
        features = {"src/test/resources/features"},
        glue = {"com/saucelabs/stepdefinitions"},
        tags = "@login",
        // Changes the console output and if value is true, concole output is going to look more simple
        monochrome = false,
        // Checks if the steps are defined or not
        // dryRun = true adimlari hizli bir sekilde kontrol eder
        dryRun = false

)
public class TestRunner {





}
