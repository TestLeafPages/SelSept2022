package com.testleaf.pages;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.testleaf.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	
	public LoginPage(ChromeDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.ID, using = "username") 
	List<WebElement> eleUsername;
	//AND Condition
//	@FindBys(
//			{
//				@FindBy(how = How.CLASS_NAME, using = "inputLogin"),
//				@FindBy(how = How.XPATH, using = "//input[@id='username']")
//			}
//			)
	//OR Condition
//	@FindAll(
//			{
//				@FindBy(how = How.CLASS_NAME, using = "inputLogin"),
//				@FindBy(how = How.XPATH, using = "//input[@id='username']")
//			}
//			)
	public LoginPage enterUserName(String userName) throws IOException {
		try {
			eleUsername.get(0).sendKeys(userName);
			reportStep("Username is entered successfully", "pass");
		} catch (NoSuchElementException e) {
			reportStep("Username element is not found", "fail");
		}
//		LoginPage lp = new LoginPage();
		return this;
	}
	
	@FindBy(how = How.ID, using = "password") 
	WebElement elePassword;
	public LoginPage enterPassword(String password) throws IOException {
		try {
			elePassword.sendKeys(password);
			reportStep("Password "+password+" is entered successfully", "pass");
		} catch (Exception e) {
			reportStep("Password "+password+" entered incorrect", "fail");
		}
		return this;
	}
	
	public HomePage clickLogin() throws IOException {
		try {
			driver.findElement(By.className("decorativeSubmit")).click();
			reportStep("Clicked on Login successfully", "pass");
		} catch (Exception e) {
			reportStep("Unable to click on Login", "fail");
		}
		return new HomePage(driver);
	}
}
