package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends Utility {

    private static final Logger log = LogManager.getLogger(CheckOutPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_FirstName']")
    WebElement firstName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_LastName']")
    WebElement lastName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_Email']")
    WebElement email;

    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement country;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_City']")
    WebElement city;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_Address1']")
    WebElement address1;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
    WebElement zipCode;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
    WebElement phoneNumber;
    @CacheLookup
    @FindBy(xpath = "//button[@onclick='Billing.save()']")
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")
    WebElement shippingContinueButton;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    WebElement paymentContinueButton;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
    WebElement paymentInfoContinueButton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='shippingoption_1']")
    WebElement nextDayAir;
    @CacheLookup
    @FindBy(xpath = "//input[@id='paymentmethod_1']")
    WebElement creditCard;
    @CacheLookup
    @FindBy(xpath = "//select[@id='CreditCardType']")
    WebElement creditCardType;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardholderName']")
    WebElement cardHolderName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardNumber']")
    WebElement cardNumber;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireMonth']")
    WebElement selectMonth;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireYear']")
    WebElement selectYear;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardCode']")
    WebElement cardCode;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Credit Card']")
    WebElement paymentTypeMessage;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Next Day Air']")
    WebElement shippingMethodText;
    @CacheLookup
    @FindBy(xpath = "//span[@class='product-subtotal']")
    WebElement totalPriceText;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Confirm']")
    WebElement confirmButton;

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
     * select Country
     *
     * @param value
     * @throws InterruptedException
     */
    public void selectCountry(String value) throws InterruptedException {
        Thread.sleep(1000);
        log.info("select Country " + email.toString());
        selectByVisibleTextFromDropDown(country, value);
    }

    /**
     * enter City
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterCity(String value) throws InterruptedException {
        Thread.sleep(1000);
        log.info("enter City " + city.toString());
        sendTextToElement(city, value);
    }

    /**
     * enter Address1
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterAddress1(String value) throws InterruptedException {
        Thread.sleep(1000);
        log.info("enter Address1 " + address1.toString());
        sendTextToElement(address1, value);
    }

    /**
     * enter ZipCode
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterZipCode(String value) throws InterruptedException {
        Thread.sleep(1000);
        log.info("enter Address1 " + zipCode.toString());
        sendTextToElement(zipCode, value);
    }

    /**
     * enter Phone Number
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterPhoneNumber(String value) throws InterruptedException {
        Thread.sleep(1000);
        log.info("enter Phone Number " + phoneNumber.toString());
        sendTextToElement(phoneNumber, value);
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
     * select Next DayAir
     *
     * @throws InterruptedException
     */
    public void selectNextDayAir() throws InterruptedException {
        Thread.sleep(1000);
        log.info("select Next DayAir " + nextDayAir.toString());
        clickOnElement(nextDayAir);
    }

    /**
     * click On Shipping Continue
     *
     * @throws InterruptedException
     */
    public void clickOnShippingContinue() throws InterruptedException {
        Thread.sleep(1000);
        log.info("click On Shipping Continue " + shippingContinueButton.toString());
        clickOnElement(shippingContinueButton);
    }

    /**
     * click On CreditCard
     *
     * @throws InterruptedException
     */
    public void clickOnCreditCard() throws InterruptedException {
        Thread.sleep(1000);
        log.info("click On CreditCard " + creditCard.toString());
        clickOnElement(creditCard);
    }

    /**
     * click On Payment Continue
     *
     * @throws InterruptedException
     */
    public void clickOnPaymentContinue() throws InterruptedException {
        Thread.sleep(1000);
        log.info("click On Payment Continue " + paymentContinueButton.toString());
        clickOnElement(paymentContinueButton);
    }

    /**
     * select CreditCard Type
     *
     * @param value
     * @throws InterruptedException
     */
    public void selectCreditCardType(String value) throws InterruptedException {
        Thread.sleep(1000);
        log.info("select CreditCard Type " + creditCardType.toString());
        selectByVisibleTextFromDropDown(creditCardType, value);
    }

    /**
     * enter Card Holder Name
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterCardHolderName(String value) throws InterruptedException {
        Thread.sleep(1000);
        log.info("enter Card Holder Name " + cardHolderName.toString());
        sendTextToElement(cardHolderName, value);
    }

    /**
     * enter CardNumber
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterCardNumber(String value) throws InterruptedException {
        Thread.sleep(1000);
        log.info(" enter CardNumber " + cardNumber.toString());
        sendTextToElement(cardNumber, value);
    }

    /**
     * select Expiration Date
     *
     * @param month
     * @param year
     * @throws InterruptedException
     */
    public void selectExpirationDate(String month, String year) throws InterruptedException {
        Thread.sleep(1000);
        log.info(" select Expiration Date ");
        selectByVisibleTextFromDropDown(selectMonth, month);
        selectByVisibleTextFromDropDown(selectYear, year);
    }

    /**
     * enter CardCode
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterCardCode(String value) throws InterruptedException {
        Thread.sleep(1000);
        log.info("enter CardCode ");
        sendTextToElement(cardCode, value);
    }

    /**
     * get Payment Type Text
     *
     * @return
     * @throws InterruptedException
     */
    public String getPaymentTypeText() throws InterruptedException {
        Thread.sleep(1000);
        log.info("get Payment Type Text " + paymentTypeMessage.toString());
        return getTextFromElement(paymentTypeMessage);
    }

    /**
     * get Shipping Method Text
     *
     * @return
     * @throws InterruptedException
     */
    public String getShippingMethodText() throws InterruptedException {
        Thread.sleep(1000);
        log.info("get Shipping Method Text " + shippingMethodText.toString());
        return getTextFromElement(shippingMethodText);
    }

    /**
     * get Total PriceText
     *
     * @return
     * @throws InterruptedException
     */
    public String getTotalPriceText() throws InterruptedException {
        Thread.sleep(1000);
        log.info("get Total PriceText " + totalPriceText.toString());
        return getTextFromElement(totalPriceText);
    }

    /**
     * click On Confirm
     *
     * @throws InterruptedException
     */
    public void clickOnConfirm() throws InterruptedException {
        Thread.sleep(1000);
        log.info("click On Confirm " + confirmButton.toString());
        clickOnElement(confirmButton);
    }

    /**
     * click On Payment Info Continue
     *
     * @throws InterruptedException
     */
    public void clickOnPaymentInfoContinue() throws InterruptedException {
        Thread.sleep(1000);
        log.info("click On Payment Info Continue " + paymentInfoContinueButton.toString());
        clickOnElement(paymentInfoContinueButton);
    }
}
