package com.aashish.stepdefinitions;

import com.aashish.hooks.Hooks;
import com.aashish.pages.InventoryPage;
import com.aashish.pages.ProductPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductSteps {

    InventoryPage inventoryPage = new InventoryPage(Hooks.getDriver());
    ProductPage productPage = new ProductPage(Hooks.getDriver());

    @Then("I should be redirected to the product detail page")
    public void i_should_be_redirected_to_the_product_detail_page() {
      productPage.isDisplayed();
    }
    @When("I click on the product named {string}")
    public void i_click_on_the_product_named(String productName) {
       inventoryPage.scrollProductIntoView(productName);
       inventoryPage.goToProduct(productName);
    }
}
