package com.aashish.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePageClass {

    public LoginPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "user-name")
    private WebElement userName;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    public void enterUserName(String value){
        clearAndFillValues(userName, value);
    }

    public void enterPassword(String value){
        clearAndFillValues(password, value);
    }

    public void clickLoginBtn(){
        clickElement(loginButton);
    }
    public boolean isDisplayed(){
        return isUserOnExpectedPageURL("sauce");
    }

}
