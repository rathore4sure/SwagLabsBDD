package com.aashish.hooks;

import com.aashish.constants.FrameworkConstants;
import com.aashish.driversetup.DriverSetup;
import com.aashish.pages.CheckoutPage;
import com.aashish.pages.InventoryPage;
import com.aashish.pages.LoginPage;
import com.aashish.pages.ProductPage;
import com.aashish.utils.PropertyFileReader;
import com.aashish.utils.TestDataLoader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class Hooks {

    public static WebDriver driver;

    @Before
    public static void beforeHooks() throws Exception {
        Properties prop = PropertyFileReader.loadConfigFiles(FrameworkConstants.CONFIG_FILE_PATH);

        FrameworkConstants.BROWSER = prop.getProperty("browser");
        FrameworkConstants.ENVIRONMENT = prop.getProperty("environment");

        driver = DriverSetup.invokeDriver(FrameworkConstants.BROWSER);
        driver.get(TestDataLoader.getInstance().getAppURL());

        // Initialize PageObjects
        new LoginPage(driver);
        new InventoryPage(driver);
        new ProductPage(driver);
        new CheckoutPage(driver);
    }

    @After
    public static void afterHooks() {
        // Close the browser after each scenario
        if (driver != null) {
            driver.quit();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }
}


