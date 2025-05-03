package com.aashish.constants;

public class FrameworkConstants {
	
	//All constants here are static and final to access them across the FW and without instantiation.

	public static final String CONFIG_FILE_PATH = "C:\\Users\\AASHISH RATHORE\\workspace\\CompleteBDDFramework\\src\\test\\resources\\Configurations\\Config.properties";
	public static final String QA_TEST_DATA_FILE_PATH = "C:\\Users\\AASHISH RATHORE\\workspace\\CompleteBDDFramework\\src\\test\\resources\\Configurations\\QA_Test_Data.properties";
	public static final String PROD_TEST_DATA_FILE_PATH = "C:\\Users\\AASHISH RATHORE\\workspace\\CompleteBDDFramework\\src\\test\\resources\\Configurations\\Prod_Test_Data.properties";

	public static final String CHROME_BROWSER = "chrome";
	public static final String FIREFOX_BROWSER = "firefox";
	public static final String EDGE_BROWSER = "edge";
	
	public static final int EXPLICIT_WAIT_TIME = 10;
	
	public static String ENVIRONMENT;
	public static String BROWSER;
}
