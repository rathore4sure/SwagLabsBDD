package com.aashish.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class InventoryPage extends BasePageClass {

    public InventoryPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[text()='Add to cart']")
    private WebElement addToCart;

    @FindBy(xpath = "//button[text()='Remove']")
    private WebElement removeFromCart;

    @FindBy(css = ".shopping_cart_link")
    private WebElement cartIcon;

    @FindBy(xpath = "//button[text()='Open Menu']")
    private WebElement hamburgerIcon;

    @FindBy(xpath = "//button[text()='Close Menu']")
    private WebElement closeIcon;

    @FindBy(css = ".bm-item.menu-item")
    private List<WebElement> hamburgerOptions;

    @FindBy(css = ".product_sort_container")
    private WebElement sortDropdown;

    //Method to click on product link
    public void goToProduct(String partialProductName){
        clickLinkByPartialText(partialProductName);
    }
    //method to add products to cart
    public void addProductToCart() {
        clickElement(addToCart);
    }
    //method to remove products from cart
    public void removeProductFromCart() {
        clickElement(removeFromCart);
    }
    // method to get the cart item count
    public String getCartItemCount() {
        return cartIcon.getText();
    }
    //method to navigate to cart page
    public void goToCart(){
        clickElement(cartIcon);
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
    public void clickOnMenuOptions(String option) {
        clickElement(getWebElementFromList(hamburgerOptions, option));
    }
    //method for scrolling a product in view
    public void scrollProductIntoView(String productName){
        scrollElementIntoView(productName);
    }
    //method for filtering the items based on price or name
    public void filterProducts(String basedOn){
        handleDropDown(sortDropdown, basedOn);
    }

    public boolean isDisplayed(){
        return isUserOnExpectedPageURL("inventory");
    }


}
