package com.aashish.utils;

import com.aashish.constants.FrameworkConstants;

import java.util.Properties;

public class TestDataLoader {
	
	private Properties prop;
	//Instance of this class (Static)
	private static TestDataLoader testDataLoader;
	
	// private Constructor that allows the instantiation of this class within itself only
	
	private TestDataLoader() throws Exception {
		switch (FrameworkConstants.ENVIRONMENT) {
		case "QA":
			prop = PropertyFileReader.loadConfigFiles(FrameworkConstants.QA_TEST_DATA_FILE_PATH);
			break;
		case "PROD":
			prop = PropertyFileReader.loadConfigFiles(FrameworkConstants.PROD_TEST_DATA_FILE_PATH);
			break;
		default:
			break;
		}
	}
	
	//Getter to get the instance of this class and create one if its null
	public static TestDataLoader getInstance() throws Exception {
		if(testDataLoader == null) {
			testDataLoader = new TestDataLoader();
		}

		return testDataLoader;
	}
	
	//Getter methods for each data in TestData properties files
	public String getAppURL() {
		return prop.getProperty("appurl");
	}

	public String getUserName() {
		return prop.getProperty("username");
	}

	public String getpassword() {
		return prop.getProperty("password");
	}
	
	
//	
//	public static void setTestDataLoader(TestDataLoader testDataLoader) {
//		TestDataLoader.testDataLoader = testDataLoader;
//	}
//





}
