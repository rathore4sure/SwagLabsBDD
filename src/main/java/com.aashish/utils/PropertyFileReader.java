package com.aashish.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileReader {

	//Method to read the properties passed property file and return the object
	public static Properties loadConfigFiles(String filepath) throws Exception {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(filepath);
		prop.load(fis);
		
		return prop;


	}

}
