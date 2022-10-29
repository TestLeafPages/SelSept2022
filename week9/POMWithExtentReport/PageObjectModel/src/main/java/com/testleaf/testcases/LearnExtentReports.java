package com.testleaf.testcases;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReports {

	public static void main(String[] args) throws IOException {
		System.out.println("Extent Report Generation");
		// setup the physical report path
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");
		
		// Create an object for ExtentReports
		ExtentReports extent = new ExtentReports();
		
		// Attach the data with physical file
		extent.attachReporter(reporter);
		
		// Create a test case
		ExtentTest test = extent.createTest("Create Lead", "Create lead with mandatory information");
		test.assignAuthor("Haja");
		test.assignCategory("Smoke");
		
		ExtentTest test2 = extent.createTest("Edit Lead", "Edit the newly created lead");
		test2.assignAuthor("Hari");
		test2.assignCategory("Sanity");
		
		// Step level information
		test.pass("Username is entered successfully");
		test.pass("Password is entered successfully");
		test.pass("Click on Login button");
		test.pass("Login is successful", MediaEntityBuilder.createScreenCaptureFromPath(".././images/img5901919.png").build());
		
		test2.pass("Username is entered successfully");
		test2.pass("Password is entered successfully");
		test2.pass("Click on Login button");
		test2.fail("Login is unsuccessful");
		
		// Flush report
		extent.flush();
		
	}

}
