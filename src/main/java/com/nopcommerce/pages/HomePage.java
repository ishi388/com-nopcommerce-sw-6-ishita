package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computerTabOnTopMenu;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']")
    WebElement electronicsTabOnTopMenu;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']")
    WebElement cellPhone;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Thank you']")
    WebElement thankYouText;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Welcome to our store']")
    WebElement welcomeStoreText;
    @CacheLookup
    @FindBy(xpath = "//strong[normalize-space()='Your order has been successfully processed!']")
    WebElement successfulText;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 register-button']")
    WebElement registerTab;


    /**
     * click On Computer Tab
     */
    public void clickOnComputerTab() {
        log.info("click On Computer Tab " + computerTabOnTopMenu.toString());
        clickOnElement(computerTabOnTopMenu);
    }

    /**
     * get Thank You Text
     *
     * @return
     * @throws InterruptedException
     */
    public String getThankYouText() throws InterruptedException {
        Thread.sleep(1000);
        log.info("get Thank You Text " + thankYouText.toString());
        return getTextFromElement(thankYouText);
    }

    /**
     * get Successful Text
     *
     * @return
     * @throws InterruptedException
     */
    public String getSuccessfulText() throws InterruptedException {
        Thread.sleep(1000);
        log.info("get Successful Text " + successfulText.toString());
        return getTextFromElement(successfulText);
    }

    /**
     * click On Continue
     *
     * @throws InterruptedException
     */
    public void clickOnContinue() throws InterruptedException {
        Thread.sleep(1000);
        log.info("click On Continue " + continueButton.toString());
        clickOnElement(continueButton);
    }

    /**
     * get Welcome Store Text
     *
     * @return
     * @throws InterruptedException
     */
    public String getWelcomeStoreText() throws InterruptedException {
        Thread.sleep(1000);
        log.info("get Welcome Store Text " + welcomeStoreText.toString());
        return getTextFromElement(welcomeStoreText);
    }

    /**
     * mouse Hover To Electronic Tab
     */
    public void mouseHoverToElectronicTab() {
        log.info("mouse Hover To Electronic Tab " + electronicsTabOnTopMenu.toString());
        mouseHoverToElement(electronicsTabOnTopMenu);
    }

    /**
     * +
     * mouseHover ToCell Phones And Click
     */
    public void mouseHoverToCellPhonesAndClick() {
        log.info("mouseHover ToCell Phones And Click " + cellPhone.toString());
        mouseHoverToElementAndClick(cellPhone);
    }

    /**
     * click On Register Tab
     */
    public void clickOnRegisterTab() {
        log.info("click On Register Tab " + registerTab.toString());
        clickOnElement(registerTab);
    }

}
