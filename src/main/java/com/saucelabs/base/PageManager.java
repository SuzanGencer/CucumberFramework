package com.saucelabs.base;

import com.saucelabs.pages.*;

public class PageManager {  //Sayfalari burada initialize ediyoruz

    public static LoginPage loginPage;
    public static ItemPage itemPage;
    public static CheckoutStep3 checkoutStep3;
    public static CheckoutStepOne checkoutStepOne;
    public static CheckoutStepTwo checkoutStepTwo;
    public static HomePage homePage;

    public static void initialize(){
        // initialize all pages
        loginPage = new LoginPage();
        itemPage = new ItemPage();
        checkoutStepOne = new CheckoutStepOne();
        checkoutStepTwo = new CheckoutStepTwo();
        checkoutStep3 = new CheckoutStep3();
        homePage = new HomePage();

    }
}
