package com.aashish.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CheckoutPage extends BasePageClass {
    public CheckoutPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[text()='Open Menu']")
    private WebElement hamburgerIcon;

    @FindBy(xpath = "//button[text()='Close Menu']")
    private WebElement closeIcon;

    @FindBy(css = ".bm-item.menu-item")
    private List<WebElement> hamburgerOptions;

    @FindBy(id = "first-name")
    private WebElement firstName;

    @FindBy(id = "last-name")
    private WebElement lastName;

    @FindBy(id = "postal-code")
    private WebElement zipCode;

    @FindBy(xpath = "//button[text()='Cancel']")
    private WebElement cancelButton;

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement continueButton;

    @FindBy(xpath = "//button[text()='Finish']")
    private WebElement finishBtn;

    @FindBy(id = "cancel")
    private WebElement cancelButtonOnfinishPage;

    @FindBy(xpath = "//h2[contains(text(), 'Thank you')]")
    private WebElement successMessage;

    @FindBy(xpath = "//button[text()='Back Home']")
    private WebElement backHomeBtn;

    public boolean isDisplayed(){
        return isUserOnExpectedPageURL("checkout");
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
    //method for filling in the firstnae
    public void fillFirstName(String value){
        clearAndFillValues(firstName, value);
    }
    //method for filling in the lastname
    public void fillLastName(String value){
        clearAndFillValues(lastName, value);
    }
    //method for filling in the zipcode
    public void fillZipCode(String value){
        clearAndFillValues(zipCode, value);
    }

    //method to fill the form
    public void fillForm(String first, String last, String zip){
        fillFirstName(first);
        fillLastName(last);
        fillZipCode(zip);
    }

    //method for going back to the cart
    public  void clickCancelButton(){
        clickElement(cancelButton);
    }
    //method to continue to checout page 2
    public void clickContinueBtn(){
        clickElement(continueButton);
    }
    //method to finish checkingout
    public void clickFinishCheckout(){
        clickElement(finishBtn);
    }
    //method to cancel and go back to ibventory directly
    public void cancelCheckout(){
        clickElement(cancelButtonOnfinishPage);
    }
    //method to verify the checkout complete
    public boolean verifyCheckoutSuccess(){
        return successMessage.isDisplayed() && successMessage.getText().contains("Thank you");
    }
    //method to go back to homepage
    public void clickBackHomeBtn(){
        clickElement(backHomeBtn);
    }

}
