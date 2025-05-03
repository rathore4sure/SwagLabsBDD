package com.aashish.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductPage extends BasePageClass {

    public ProductPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[text()='Open Menu']")
    private WebElement hamburgerIcon;

    @FindBy(xpath = "//button[text()='Close Menu']")
    private WebElement closeIcon;

    @FindBy(css = ".bm-item.menu-item")
    private List<WebElement> hamburgerOptions;

    @FindBy(id = "back-to-products")
    private WebElement backToProducts;

    @FindBy(xpath = "//button[text()='Add to cart']")
    private WebElement addToCartButton;

    @FindBy(xpath = "//button[text()='Remove']")
    private WebElement removeCartButton;


    public boolean isDisplayed(){
        return isUserOnExpectedPageURL("inventory-item");
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

    //method for going back on the inventory page
    public  void backToProducts(){
        clickElement(backToProducts);
    }
    //method for adding item to cart
    public void addCurrItemToCart(){
        clickElement(addToCartButton);
    }
    //method for removing item from cart
    public void removeCurrItemFromCart(){
        clickElement(removeCartButton);
    }
}
