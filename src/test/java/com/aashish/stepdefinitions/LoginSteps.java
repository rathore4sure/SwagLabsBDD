package com.aashish.stepdefinitions;

import com.aashish.hooks.Hooks;
import com.aashish.pages.InventoryPage;
import com.aashish.pages.LoginPage;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class LoginSteps {

    LoginPage loginPage = new LoginPage(Hooks.getDriver());
    InventoryPage inventoryPage = new InventoryPage(Hooks.getDriver());

    @Given("I am on the SauceDemo login page")
    public void i_am_on_the_sauce_demo_login_page() {
       Assert.assertTrue(loginPage.isDisplayed());
    }
    @When("I enter username {string}")
    public void i_enter_username(String string) {
        loginPage.enterUserName(string);
    }
    @When("I enter password {string}")
    public void i_enter_password(String string) {
        loginPage.enterPassword(string);
    }
    @When("I click the Login button")
    public void i_click_the_Login_button() {
        loginPage.clickLoginBtn();
    }
    @Then("I should be redirected to the inventory page")
    public void i_should_be_redirected_to_the_inventory_page() {
       Assert.assertTrue(inventoryPage.isDisplayed());
    }
    @Then("I should see an error message {string}")
    public void i_should_see_an_error_message(String string) {
        loginPage.isMessageDispalyed(string);
    }
}
