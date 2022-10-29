package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.testleaf.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	
	public HomePage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public MyHomePage clickCRMSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver);
	}
	
	public LoginPage clickLogout() {
		
		return new LoginPage(driver);
	}
	
	public HomePage verifyLoginIsSuccessful() {
		String actual ="";
		String expected = "";
		Assert.assertTrue(actual.contains(expected));
		return this; 
	}
	
}
