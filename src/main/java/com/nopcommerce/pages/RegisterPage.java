package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {

    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;
    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmpassword;
    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='result']")
    WebElement registrationCompleted;

    /**
     * enter Firstname
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterFirstname(String value) throws InterruptedException {
        Thread.sleep(1000);
        log.info("enter Firstname " + firstName.toString());
        sendTextToElement(firstName, value);
    }

    /**
     * enter Lastname
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterLastname(String value) throws InterruptedException {
        Thread.sleep(1000);
        log.info("enter Lastname " + lastName.toString());
        sendTextToElement(lastName, value);
    }

    /**
     * enter Email
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterEmail(String value) throws InterruptedException {
        Thread.sleep(1000);
        log.info("enter Email " + email.toString());
        sendTextToElement(email, value);
    }

    /**
     * enter Password
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterPassword(String value) throws InterruptedException {
        Thread.sleep(1000);
        log.info("enter Password " + password.toString());
        sendTextToElement(password, value);
    }

    /**
     * enter Confirm Password
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterConfirmPassword(String value) throws InterruptedException {
        Thread.sleep(1000);
        log.info("enter Confirm Password " + confirmpassword.toString());
        sendTextToElement(confirmpassword, value);
    }

    /**
     * click On Register Button
     *
     * @throws InterruptedException
     */
    public void clickOnRegisterButton() throws InterruptedException {
        Thread.sleep(1000);
        log.info("click On Register Button " + registerButton.toString());
        clickOnElement(registerButton);
    }

    /**
     * get Registration Completed Text
     *
     * @return
     * @throws InterruptedException
     */
    public String getRegistrationCompletedText() throws InterruptedException {
        Thread.sleep(1000);
        log.info("get Registration Completed Text " + registrationCompleted.toString());
        return getTextFromElement(registrationCompleted);
    }
}
