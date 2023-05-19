package com.nopcommerce.steps;

import com.nopcommerce.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.UUID;

public class ElectronicsSteps {

    String email;

    @Given("^User is on homepage$")
    public void userIsOnHomepage() {
    }

    @When("^User Mouse Hover on “Electronics” Tab$")
    public void userMouseHoverOnElectronicsTab() {
        new HomePage().mouseHoverToElectronicTab();
    }

    @And("^User Mouse Hover on “Cell phones” and click$")
    public void userMouseHoverOnCellPhonesAndClick() {
        new HomePage().mouseHoverToCellPhonesAndClick();
    }

    @Then("^User Verify the text “Cell phones”$")
    public void userVerifyTheTextCellPhones() throws InterruptedException {
        String expectedMessage = "Cell phones";
        String actualMessage = new CellPhonePage().getCellPhoneText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @And("^User Click on List View Tab$")
    public void userClickOnListViewTab() {
        new CellPhonePage().clickOnListViewIcon();
    }

    @And("^User Click on product name Nokia Lumia (\\d+) link$")
    public void userClickOnProductNameNokiaLumiaLink(String phone) throws InterruptedException {
        new CellPhonePage().selectPhoneFromList(phone);
    }


    @Then("^User Verify the text \"([^\"]*)\"$")
    public void userVerifyTheText(String expectedMessage) throws InterruptedException {
        String actualMessage = new CellPhonePage().getProductNameText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Then("^Verify the price \"([^\"]*)\"$")
    public void verifyThePrice(String expectedMessage) throws InterruptedException {
        String actualMessage = new CellPhonePage().getPriceText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @And("^User Change quantity to \"([^\"]*)\"$")
    public void userChangeQuantityTo(String qty) throws InterruptedException {
        new CellPhonePage().updateQuantity(qty);
    }

    @And("^User Click on ADD TO CART tab$")
    public void userClickOnADDTOCARTTab() throws InterruptedException {
        new CellPhonePage().clickOnAddToCart();
    }

    @Then("^User Verify the Message \"([^\"]*)\" on Top green Bar$")
    public void userVerifyTheMessageOnTopGreenBar(String expectedMessage) throws InterruptedException {
        String actualMessage = new CellPhonePage().getSuccessfullAddedToCartText();
        Assert.assertEquals(actualMessage, expectedMessage);

    }

    @And("^User close notification bar$")
    public void userCloseNotificationBar() throws InterruptedException {
        new CellPhonePage().closeNotificationBar();
    }

    @And("^User MouseHover on Shopping cart$")
    public void userMouseHoverOnShoppingCart() throws InterruptedException {
        new ShoppingCartPage().mouseHoverToShoppingCard();
    }

    @And("^User MouseHover and click on GO TO CART button$")
    public void userMouseHoverAndClickOnGOTOCARTButton() throws InterruptedException {
        new ShoppingCartPage().mouseHoverToGoToCardAndClick();
    }

    @Then("^User Verify the message \"([^\"]*)\"$")
    public void userVerifyTheMessage(String expectedMessage) throws InterruptedException {
        String actualMessage = new ShoppingCartPage().getShoppingCartText();
        Assert.assertEquals(actualMessage, expectedMessage);

    }

    @Then("^User Verify the quantity is \"([^\"]*)\"$")
    public void userVerifyTheQuantityIs(String expectedMessage) throws InterruptedException {
        String actualMessage = new ShoppingCartPage().getNumberOfQuantityValue();
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Then("^User Verify the Total \"([^\"]*)\"$")
    public void userVerifyTheTotal(String expectedMessage) throws InterruptedException {
        String actualMessage = new ShoppingCartPage().getPriceText();
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @And("^User click on checkbox I agree with the terms of service$")
    public void userClickOnCheckboxIAgreeWithTheTermsOfService() throws InterruptedException {
        new ShoppingCartPage().selectTermsAndCondition();
    }

    @And("^User Click on CHECKOUT$")
    public void userClickOnCHECKOUT() throws InterruptedException {
        new ShoppingCartPage().clickOnCheckOut();
    }

    @Then("^User Verify the Text \"([^\"]*)\" on Home Page$")
    public void userVerifyTheTextOnHomePage(String expectedMessage) throws InterruptedException {
        String actualMessage = new LoginPage().getWelcomeText();
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @And("^User Click on REGISTER tab$")
    public void userClickOnREGISTERTab() {
        new HomePage().clickOnRegisterTab();
    }

    @And("^User enter First Name \"([^\"]*)\"$")
    public void userEnterFirstName(String firstName) throws InterruptedException {
        new RegisterPage().enterFirstname("Prime");
    }

    @And("^User enter Last Name \"([^\"]*)\"$")
    public void userEnterLastName(String LastName) throws InterruptedException {
        new RegisterPage().enterLastname(LastName);
    }

    @And("^User enter EmailId \"([^\"]*)\"$")
    public void userEnterEmailId(String arg0) throws InterruptedException {
        String name = UUID.randomUUID().toString();
        email = name + "@gmail.com";
        String option = "Register";
        new RegisterPage().enterEmail(email);
    }

    @And("^User enter password \"([^\"]*)\"$")
    public void userEnterPassword(String password) throws InterruptedException {
        new RegisterPage().enterPassword(password);
    }

    @And("^User enter confirm password \"([^\"]*)\"$")
    public void userEnterConfirmPassword(String confirmPassword) throws InterruptedException {
        new RegisterPage().enterConfirmPassword(confirmPassword);
    }

    @And("^User click on register button$")
    public void userClickOnRegisterButton() throws InterruptedException {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("^User Verify the message \"([^\"]*)\" on register page$")
    public void userVerifyTheMessageOnRegisterPage(String expectedMessage) throws InterruptedException {
        String actualMessage = new RegisterPage().getRegistrationCompletedText();
        Assert.assertEquals(actualMessage, expectedMessage);
    }

}
