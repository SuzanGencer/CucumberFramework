package com.saucelabs.pages;

import com.saucelabs.utils.HelperMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.saucelabs.base.BasePage.driver;
import java.util.List;

public class HomePage {
    //Locators
    @FindBy(xpath = "//div[@class='inventory_item_name']")
    public static List<WebElement> itemsList;

    public HomePage() {
        PageFactory.initElements(driver,this);
    }

    //Action methods

    public static void clickItem(String itemName){
        for (WebElement item : itemsList) {
            if (item.getText().equals(itemName)) {
                HelperMethods.doClick(item);
                break;
            }
        }
    }
}
