package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BuildYourOwnComputerPage extends Utility {

    private static final Logger log = LogManager.getLogger(BuildYourOwnComputerPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Build your own computer']")
    WebElement buildYourOwnComputerText;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement selectProcessor;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement selectRam;

    @CacheLookup
    @FindBy(xpath = "//div[@class='product-price']//span")
    WebElement totalPrice;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
    WebElement microsoftOfficeSoftwareOption;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement totalCommanderSoftwareOption;
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//div[@id='bar-notification']")
    WebElement successfullyText;
    @CacheLookup
    @FindBy(xpath = "//span[@title='Close']")
    WebElement closeNotificationBar;
    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-label']")
    WebElement shopingCart;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Go to cart']")
    WebElement goToCart;

    /**
     * get Build Your Own Computer Text
     *
     * @return
     * @throws InterruptedException
     */
    public String getBuildYourOwnComputerText() throws InterruptedException {
        Thread.sleep(1000);
        log.info("get Build Your Own Computer Text " + buildYourOwnComputerText.toString());
        return getTextFromElement(buildYourOwnComputerText);
    }

    /**
     * select Processor
     *
     * @param name
     * @throws InterruptedException
     */
    public void selectProcessor(String name) throws InterruptedException {
        Thread.sleep(1000);
        log.info("select Processor " + selectProcessor.toString());
        selectByVisibleTextFromDropDown(selectProcessor, name);
    }

    /**
     * select Ram
     *
     * @param name
     * @throws InterruptedException
     */
    public void selectRam(String name) throws InterruptedException {
        Thread.sleep(1000);
        log.info("select Ram " + selectRam.toString());
        selectByVisibleTextFromDropDown(selectRam, name);
    }

    /**
     * select HDD
     *
     * @param value
     * @throws InterruptedException
     */
    public void selectHDD(String value) throws InterruptedException {
        Thread.sleep(1000);
        log.info("select HDD ");
        clickOnElement(By.xpath("//label[normalize-space()='" + value + "']"));
    }

    /**
     * select Os
     *
     * @param value
     * @throws InterruptedException
     */
    public void selectOs(String value) throws InterruptedException {
        Thread.sleep(1000);
        log.info("select Os ");
        clickOnElement(By.xpath("//label[contains(normalize-space(),'" + value + "')]"));
    }

    /**
     * select Microsoft Office SoftwareOption
     *
     * @throws InterruptedException
     */
    public void selectMicrosoftOfficeSoftwareOption() throws InterruptedException {
        Thread.sleep(1000);
        log.info(" select Microsoft Office SoftwareOption " + microsoftOfficeSoftwareOption.toString());
        selectCheckBox(microsoftOfficeSoftwareOption);
    }

    /**
     * select Total Commander Software Option
     *
     * @throws InterruptedException
     */
    public void selectTotalCommanderSoftwareOption() throws InterruptedException {
        Thread.sleep(1000);
        log.info(" select Total Commander Software Option " + totalCommanderSoftwareOption.toString());
        clickOnElement(totalCommanderSoftwareOption);
    }

    /**
     * get Total Price Text
     *
     * @return
     * @throws InterruptedException
     */
    public String getTotalPriceText() throws InterruptedException {
        Thread.sleep(1000);
        log.info("get Total Price Text " + totalPrice.toString());
        return getTextFromElement(totalPrice);
    }

    /**
     * click On Add to Cart
     *
     * @throws InterruptedException
     */
    public void clickOnAddtoCart() throws InterruptedException {
        Thread.sleep(1000);
        log.info("click On Add to Cart " + addToCart.toString());
        clickOnElement(addToCart);
    }

    /**
     * get Successfully Added To CartText
     *
     * @return
     * @throws InterruptedException
     */
    public String getSuccessfullAddedToCartText() throws InterruptedException {
        Thread.sleep(1000);
        log.info("get Successfully Added To CartText " + successfullyText.toString());
        return getTextFromElement(successfullyText);
    }

    /**
     * close Notification Bar
     *
     * @throws InterruptedException
     */
    public void closeNotificationBar() throws InterruptedException {
        Thread.sleep(1000);
        log.info("close Notification Bar " + closeNotificationBar.toString());
        clickOnElement(closeNotificationBar);
    }

    /**
     * mouse Hover To ShoppingCart And ClickOnCart
     *
     * @throws InterruptedException
     */
    public void mouseHoverToShoppingCartAndClickOnCart() throws InterruptedException {
        Thread.sleep(1000);
        log.info("mouse Hover To ShoppingCart " + shopingCart.toString());
        mouseHoverToElement(shopingCart);
        log.info("mouse Hover To ShoppingCart And ClickOnCart " + goToCart.toString());
        mouseHoverToElementAndClick(goToCart);
    }

}
