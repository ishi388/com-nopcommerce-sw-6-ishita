package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CellPhonePage extends Utility {

    private static final Logger log = LogManager.getLogger(CellPhonePage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Cell phones']")
    WebElement cellPhone;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Nokia Lumia 1020']")
    WebElement ProductName;
    @CacheLookup
    @FindBy(xpath = "//div[@class='product-price']//span[normalize-space()='$349.00']")
    WebElement PriceName;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='List']")
    WebElement listView;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_enteredQuantity_20']")
    WebElement updateQuantity;
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-20']")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//div[@id='bar-notification']")
    WebElement successfullyText;
    @CacheLookup
    @FindBy(xpath = "//span[@title='Close']")
    WebElement closeNotificationBar;

    /**
     * get Cell Phone Text
     *
     * @return
     * @throws InterruptedException
     */
    public String getCellPhoneText() throws InterruptedException {
        Thread.sleep(1000);
        log.info("get Cell Phone Text " + cellPhone.toString());
        return getTextFromElement(cellPhone);
    }

    /**
     * click On List ViewIcon
     */
    public void clickOnListViewIcon() {
        log.info("click On List ViewIcon " + cellPhone.toString());
        clickOnElement(listView);
    }

    /**
     * select Phone FromList
     *
     * @param phone
     * @throws InterruptedException
     */
    public void selectPhoneFromList(String phone) throws InterruptedException {
        Thread.sleep(1000);
        log.info("select Phone FromList ");
        clickOnElement(By.xpath("//h2[@class='product-title']//a[contains(text(),'" + phone + "')]"));
    }

    /**
     * get Product NameText
     *
     * @return
     * @throws InterruptedException
     */
    public String getProductNameText() throws InterruptedException {
        Thread.sleep(1000);
        log.info("get Product NameText " + ProductName.toString());
        return getTextFromElement(ProductName);
    }

    /**
     * get PriceText
     *
     * @return
     * @throws InterruptedException
     */
    public String getPriceText() throws InterruptedException {
        Thread.sleep(1000);
        log.info("get PriceText " + PriceName.toString());
        return getTextFromElement(PriceName);
    }

    /**
     * update Quantity
     *
     * @param value
     * @throws InterruptedException
     */
    public void updateQuantity(String value) throws InterruptedException {
        Thread.sleep(1000);
        log.info("update Quantity " + updateQuantity.toString());
        sendTextToElement(updateQuantity, value);
    }

    /**
     * click On Add ToCart
     *
     * @throws InterruptedException
     */
    public void clickOnAddToCart() throws InterruptedException {
        Thread.sleep(1000);
        log.info("click On Add ToCart " + addToCart.toString());
        clickOnElement(addToCart);
    }

    /**
     * get Successfull Added To CartText
     *
     * @return
     * @throws InterruptedException
     */
    public String getSuccessfullAddedToCartText() throws InterruptedException {
        Thread.sleep(1000);
        log.info("get Successfull Added To CartText " + successfullyText.toString());
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

}
