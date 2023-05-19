package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputersPage extends Utility {

    private static final Logger log = LogManager.getLogger(ComputersPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//li[@class='active last']//a[normalize-space()='Desktops']")
    WebElement desktop;


    @CacheLookup
    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement shortingFilterOption;

    /**
     * click On Desktop
     */
    public void clickOnDesktop() {
        log.info("click On Desktop " + desktop.toString());
        clickOnElement(desktop);
    }

    /**
     * select Value From Shorting DropDown
     *
     * @param text
     * @throws InterruptedException
     */
    public void selectValueFromShortingDropDown(String text) throws InterruptedException {
        Thread.sleep(1000);
//        WebElement dropDown = driver.findElement(shortingFilterOption);
//        Select select = new Select(dropDown);
//        // Select by visible text
//        select.selectByVisibleText(text);
        log.info("select Value From Shorting DropDown " + shortingFilterOption.toString());
        selectByVisibleTextFromDropDown(shortingFilterOption, text);
        Thread.sleep(1000);
    }

    /**
     * click Add to Cart By ProductName
     *
     * @param productName
     * @throws InterruptedException
     */
    public void clickAddtoCartByProductName(String productName) throws InterruptedException {
        Thread.sleep(1000);
        log.info("click Add to Cart By ProductName " );
        clickOnElement(By.xpath("(//h2//a[normalize-space()='" + productName + "']//following::button)[1]"));
    }

    /**
     * @return
     * @throws InterruptedException
     */
    public List<String> sortDesktopByPositionZtoA() throws InterruptedException {
        //    waitUntilVisibilityOfElementLocated(By.xpath("//div[@class='picture']//img"),5);
        Thread.sleep(2000);
        List<WebElement> beforeShortValue = driver.findElements(By.xpath("//h2[@class='product-title']//a"));
        List<String> beforeShortDesktopValue = new ArrayList<>();
        for (WebElement value : beforeShortValue) {
            beforeShortDesktopValue.add(value.getText());
        }
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='products-orderby']"), "Name: Z to A");
        Thread.sleep(2000);
        waitUntilVisibilityOfElementLocated(By.xpath("//div[@class='picture']//img"), 5);

        // After shorting value
        List<WebElement> afterShortValue = driver.findElements(By.xpath("//h2[@class='product-title']//a"));
        List<String> afterShortDesktopValue = new ArrayList<>();

        for (WebElement value1 : afterShortValue) {
            afterShortDesktopValue.add(value1.getText());
        }

        Collections.sort(beforeShortDesktopValue);// Ascending order

        Collections.reverse(beforeShortDesktopValue);// reverse

        return beforeShortDesktopValue;
    }

    /**
     * @return
     * @throws InterruptedException
     */
    public List<String> getAllProductNamesAfterShorting() throws InterruptedException {
        Thread.sleep(2000);
        log.info("Get all product name after shorting " );
        waitUntilVisibilityOfElementLocated(By.xpath("//div[@class='picture']//img"), 5);
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='products-orderby']"), "Name: Z to A");
        Thread.sleep(2000);
        waitUntilVisibilityOfElementLocated(By.xpath("//div[@class='picture']//img"), 5);

        // After shorting value
        List<WebElement> afterShortValue = driver.findElements(By.xpath("//h2[@class='product-title']//a"));
        List<String> afterShortDesktopValue = new ArrayList<>();

        for (WebElement value1 : afterShortValue) {
            afterShortDesktopValue.add(value1.getText());
        }
        return afterShortDesktopValue;
    }
}
