package com.aashish.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CartPage extends BasePageClass {
    public CartPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[text()='Open Menu']")
    private WebElement hamburgerIcon;

    @FindBy(xpath = "//button[text()='Close Menu']")
    private WebElement closeIcon;

    @FindBy(css = ".bm-item.menu-item")
    private List<WebElement> hamburgerOptions;

    @FindBy(className = "inventory_item_name")
    private List<WebElement> cartItemsList;

    @FindBy(xpath = "//button[text() = 'Checkout']")
    private WebElement checkoutBtn;

    @FindBy(xpath = "//button[text()='Continue Shopping']")
    private WebElement continueShopBtn;

    public boolean isDisplayed(){
        return isUserOnExpectedPageURL("cart");
    }

    //method for expanding hamburger icon
    public void clickOpenMenu(){
        clickElement(hamburgerIcon);
    }
    //method for collapsing hamburger icon
    public void clickCloseMenu(){
        clickElement(closeIcon);
    }
    //method for selecting any option from hamburger icon
    public void clickOnMenuOptions(String option){
        clickElement(getWebElementFromList(hamburgerOptions, option));
    }
    //method for removing item from cart
    public void removeItemsFromCart(String itemName){
        WebElement itemToBeRemoved = getWebElementFromList(cartItemsList, itemName);
        clickElement(itemToBeRemoved.findElement(By.xpath(".//button[contains(text(),'Remove')]")));
    }
    //method for checking out button
    public void checkout(){
        clickElement(checkoutBtn);
    }
    //method for going back to inventory
    public void continueShopping(){
        clickElement(continueShopBtn);
    }
}
