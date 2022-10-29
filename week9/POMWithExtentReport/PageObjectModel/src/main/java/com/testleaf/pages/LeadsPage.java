package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testleaf.base.ProjectSpecificMethods;

public class LeadsPage extends ProjectSpecificMethods{
	
	public LeadsPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public CreateLeadPage clickCreateLead() {
		driver.findElement(By.linkText(prop1.getProperty("Create_Lead_link"))).click();
		return new CreateLeadPage(driver);
	}
	
	public void clickFindLeads() {
		
	}

}
