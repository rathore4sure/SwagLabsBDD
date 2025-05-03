package com.aashish.pages;

import com.aashish.constants.FrameworkConstants;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePageClass {

    private WebDriver driver;
    private WebDriverWait wait;

    public BasePageClass(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(FrameworkConstants.EXPLICIT_WAIT_TIME));
        PageFactory.initElements(driver, this);
    }

    //Custom methods used in this project are all defined in this class
    private WebElement waitForElementToBeClickable(WebElement element) {
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    private WebElement waitForElementToBeVisible(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    private WebElement getWebElementByVisibleText(String partialText) {
        return driver.findElement(By.xpath("//*[contains(text(), '" + partialText + "')]"));
    }


    protected void clickLinkByPartialText(String text){
        clickElement(getWebElementByVisibleText(text));

    }

    protected void clickElement(WebElement element) {
        waitForElementToBeClickable(element).click();
    }

    protected void clearAndFillValues(WebElement element, String value) {
        waitForElementToBeVisible(element).clear();
        element.sendKeys(value);
    }


    protected boolean isUserOnExpectedPageURL(String expectedUrlFragment) {
        String currentUrl = driver.getCurrentUrl();
        return currentUrl.contains(expectedUrlFragment);
    }

    protected WebElement getWebElementFromList(List<WebElement> options, String itemName) {
        for (WebElement element : options) {
            if (element.getText().toLowerCase().contains(itemName.toLowerCase())) {
                return element;
            }
        }
        System.out.println("No match found for item: " + itemName);
        return null;
    }

    protected void handleDropDown(WebElement dropdown, String text) {
        Select select = new Select(dropdown);
        select.selectByVisibleText(text);
    }

    protected void scrollElementIntoView(String name) {
        WebElement element = getWebElementByVisibleText(name);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth',block: 'center'})", element);
    }


    public boolean isMessageDispalyed(String mssg) {
        return driver.getPageSource().contains(mssg);
    }
}