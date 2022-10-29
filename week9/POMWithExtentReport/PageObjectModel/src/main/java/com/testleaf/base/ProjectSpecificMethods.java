package com.testleaf.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.testleaf.utils.ReadExcelData;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.handler.codec.http.multipart.FileUpload;

public class ProjectSpecificMethods {

	public ChromeDriver driver;
	public String fileName;
	public static Properties prop1;
	public ExtentReports extent;
	public static ExtentTest test, node;
	public String testName, testDescription, testAuthor, testCategory;

	@BeforeMethod
	public void preCondition() throws IOException {
		// set the node
		node = test.createNode(testName);
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println(driver);
		driver.manage().window().maximize();

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(new File("src/main/resources/config.properties"));
		prop.load(fis);
		String url = prop.getProperty("url");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		String lang = prop.getProperty("lang");
		prop1 = new Properties();
		FileInputStream fis1 = new FileInputStream(new File("src/main/resources/" + lang + ".properties"));
		prop1.load(fis1);

	}

	@AfterMethod
	public void postCondition() {
		driver.close();
	}

	@DataProvider(name = "fetchData")//, indices = 1)
	public String[][] fetchData() throws IOException {
		return ReadExcelData.readSheetData(fileName);
	}

	@BeforeSuite
	public void startReport() {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
	}
	
	@BeforeClass
	public void testDetails() {
		test = extent.createTest(testName, testDescription);
		test.assignAuthor(testAuthor);
		test.assignCategory(testCategory);
	}
	
	@AfterSuite
	public void stopReport() {
		extent.flush();
	}
	
	public void reportStep(String message, String status) throws IOException {
		if (status.equalsIgnoreCase("pass")) {
			node.pass(message, MediaEntityBuilder.createScreenCaptureFromPath(".././images/img" + takeSnap() + ".png").build());
		} else if (status.equalsIgnoreCase("fail")) {
			node.fail(message, MediaEntityBuilder.createScreenCaptureFromPath(".././images/img" + takeSnap() + ".png").build());
			throw new RuntimeException("See the report for details");
		}
	}
	
	public int takeSnap() throws IOException {
		int random = (int) (Math.random() * 9999999);
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./images/img" + random+".png");
		FileUtils.copyFile(src, desc);
		return random;
	}
}
