package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.DesktopPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class DesktopsSteps {
    @Then("I select sort by Name Z to A")
    public void iSelectSortByNameZToA() {
        new DesktopPage().selectPositionByZtoA();
    }

    @And("I can see the products displayed in Descending order")
    public void iCanSeeTheProductsDisplayedInDescendingOrder() {
        String actualText = new DesktopPage().getAllProductNameText();
        Assert.assertEquals(actualText, "Product will arrange Descending order");
    }

    @When("I mouse hover and click on desktop tab")
    public void iMouseHoverAndClickOnDesktopTab() {
        new DesktopPage().mouseHoverOnDesktopLinkAndClick();
    }

    @And("I select currency {string}")
    public void iSelectCurrency(String currency) {
        new DesktopPage().MouseHoverOnCurrencyDropdownAndClick();
    }

    @And("I click on show all desktops")
    public void iClickOnShowAllDesktops() {
        new DesktopPage().clickOnShowAllDesktops();
    }

    @And("I select product sort by {string}")
    public void iSelectProductSortBy(String product) {
        new DesktopPage().selectPositionByAtoZ();
    }

    @And("I select product “<product>”")
    public void iSelectProductProduct() {
        new DesktopPage().clickOnShowAllDesktops();
    }

    @Then("Verify the Text {string} is displayed")
    public void verifyTheTextIsDisplayed(String arg0) {
    }

    @And("I add quantity {string} for product using Select class.")
    public void iAddQuantityForProductUsingSelectClass(String value) {
        new DesktopPage().enterQuantity();
    }

    @And("I click on add to cart button")
    public void iClickOnAddToCartButton() {
        new DesktopPage().clickOnAddToCart();
    }

    @And("Verify the Message “Success: You have added “<product>” to your shopping cart!”")
    public void verifyTheMessageSuccessYouHaveAddedProductToYourShoppingCart() {
        String actualText1 = new DesktopPage().getSuccessText();
        Assert.assertEquals(actualText1, "Success: You have added “<product>” to your shopping cart!");
    }

    @And("I click on shopping cart button")
    public void iClickOnShoppingCartButton() {
        new DesktopPage().clickOnShoppingCart1();
    }

    @Then("I should see shopping cart text")
    public void iShouldSeeShoppingCartText() {
        String actualText2 = new DesktopPage().clickOnShoppingCart();
        Assert.assertEquals(actualText2, "Shopping Cart");
    }

    @And("Verify the Product name {string}")
    public void verifyTheProductName(String value) {
        String actualText3 = new DesktopPage().verifyProductName();
        Assert.assertEquals(actualText3, "Product name");
    }

    @And("Verify the Model {string}")
    public void verifyTheModel(String value) {
        String actualText4 = new DesktopPage().verifyModel();
        Assert.assertEquals(actualText4, "model");
    }

    @And("Verify the Total {string}")
    public void verifyTheTotal(String value) {
        String actualText5 = new DesktopPage().verifyTotal();
        Assert.assertEquals(actualText5, "total");

    }

    @Then("Verify the product will arrange in descending order")
    public void verifyTheProductWillArrangeInDescendingOrder() {
        new DesktopPage().selectPositionByZtoA();
    }

    @And("I select product {string}")
    public void iSelectProduct(String arg0) {

    }

    @And("I add quantity {int} for product using Select class.")
    public void iAddQuantityForProductUsingSelectClass(int arg0) {
    }

    @And("Verify the Message {string}")
    public void verifyTheMessage(String arg0) {
    }
}