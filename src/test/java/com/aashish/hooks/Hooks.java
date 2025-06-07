package com.aashish.hooks;

import com.aashish.constants.FrameworkConstants;
import com.aashish.driversetup.DriverSetup;
import com.aashish.pages.CheckoutPage;
import com.aashish.pages.InventoryPage;
import com.aashish.pages.LoginPage;
import com.aashish.pages.ProductPage;
import com.aashish.utils.PropertyFileReader;
import com.aashish.utils.TestDataLoader;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.io.File;
import java.io.IOException;
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

    @AfterStep
    public static void attachScreenshot(Scenario scenario){

        TakesScreenshot ts = (TakesScreenshot)driver;
        byte[] screenshotInBytes = ts.getScreenshotAs(OutputType.BYTES);

        scenario.attach(screenshotInBytes, "image/png", "myStepScreenshot");

    }

    @After
    public static void afterHooks() {
        // Close the browser after each scenario
        if (driver != null) {
            driver.quit();
        }

    }


    @AfterAll
    public static void openExtentReports(){
        File myReport = new File("target/ExtentReports/MyFWReports.html");

        if (myReport.exists()){
            try {
                Desktop.getDesktop().browse(myReport.toURI());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public static WebDriver getDriver() {
        return driver;
    }
}


