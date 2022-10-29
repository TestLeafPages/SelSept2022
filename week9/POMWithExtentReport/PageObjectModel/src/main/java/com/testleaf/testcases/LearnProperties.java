package com.testleaf.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LearnProperties {

	public static void main(String[] args) throws IOException {
		
		// Create Object for Properties
		Properties prop = new Properties();
		
		// Create Object for FileInputStream
		FileInputStream fis = new FileInputStream(new File("src/main/resources/config.properties"));
		
		// Load the properties file
		prop.load(fis);
		
		// Read the data
		String uName = prop.getProperty("username");
		System.out.println(uName);
		System.out.println(prop.getProperty("browser"));
		
	}

}
