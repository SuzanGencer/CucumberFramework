package com.saucelabs.stepdefinitions;

import com.saucelabs.base.BasePage;
import com.saucelabs.base.PageManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    //Testlerin basi ve sonu icin
    @Before
    public void start() { //browser'i init burada yapilir
        BasePage.initializeDriver();
        //PageManager.initialize();
    }

    @After
    public void end() {
        BasePage.tearDowm();
    }
}
