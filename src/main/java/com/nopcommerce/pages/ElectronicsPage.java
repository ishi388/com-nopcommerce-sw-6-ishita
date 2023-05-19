package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ElectronicsPage extends Utility {

    private static final Logger log = LogManager.getLogger(ElectronicsPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Electronics']")
    WebElement electronicsTabText;

    /**
     * get Electronics HeaderText
     *
     * @return
     */
    public String getElectronicsHeaderText() {
        log.info("get Electronics HeaderText " + electronicsTabText.toString());
        return getTextFromElement(electronicsTabText);
    }

    /**
     * This method select menu on top menu
     *
     * @param menu
     */
    public void selectMenu(String menu) {
        log.info("This method select menu on top menu ");
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='" + menu + "']"));
    }
}
