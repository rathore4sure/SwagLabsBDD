package com.aashish.driversetup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.aashish.constants.FrameworkConstants;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSetup {
	private static WebDriver driver;

	public static WebDriver invokeDriver(String browserName) {
		switch (browserName.toLowerCase()) {
			case FrameworkConstants.CHROME_BROWSER:
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				break;
			case FrameworkConstants.FIREFOX_BROWSER:
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				break;
			case FrameworkConstants.EDGE_BROWSER:
				driver = new EdgeDriver();
				driver.manage().window().maximize();
				break;
			default:
				throw new IllegalStateException("Invalid Browser Name passed");
		}

		return driver;

	}
}
