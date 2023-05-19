package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;


    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Checkout as Guest']")
    WebElement guestCheckout;

    /**
     * get Welcome Text
     *
     * @return
     */
    public String getWelcomeText() {
        log.info("get Welcome Text " + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    /**
     * click On Guest Checkout
     */
    public void clickOnGuestCheckout() {
        log.info("click On Guest Checkout " + guestCheckout.toString());
        clickOnElement(guestCheckout);
    }

}
