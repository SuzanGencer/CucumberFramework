package com.saucelabs.pages;

import static com.saucelabs.base.BasePage.driver; //Sadece static olan driver'i aktarmak icin.

import com.saucelabs.utils.HelperMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage /*extends BasePage*/ {

    // Fields: Locators, webelements

    @FindBy(id = "user-name")
    public static WebElement username;

    @FindBy(id = "password")
    public static WebElement password;

    @FindBy(id = "login-button")
    public static WebElement loginBtn;

    @FindBy(xpath = "//h3[@data-test='error']")
    public static WebElement errorMsg;

    // Constructor:
    //In the Const initialize Pagefactory elements
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public static String verifyTitle() {
        return HelperMethods.doGetPageTitle();
    }

    public static void enterUsername(String user) {
        HelperMethods.sendText(username, user);
    }

    public static void enterPassword(String pass) {
        HelperMethods.sendText(password, pass);
    }

    public static void clickLoginButton() {
        HelperMethods.doClick(loginBtn);
    }

    public static String verifyURL() {
        return HelperMethods.getCurrentURL();
    }

    public static boolean verifyErrMessage(){ return  HelperMethods.doIsDisplayed(errorMsg);}
}
