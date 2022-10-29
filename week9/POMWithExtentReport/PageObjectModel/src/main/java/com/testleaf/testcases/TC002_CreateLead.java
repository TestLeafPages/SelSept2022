package com.testleaf.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testleaf.base.ProjectSpecificMethods;
import com.testleaf.pages.HomePage;
import com.testleaf.pages.LoginPage;

public class TC002_CreateLead extends ProjectSpecificMethods{

	@BeforeTest
	public void setData() {
		fileName = "CreateLead";
	}
	
	@Test(dataProvider = "fetchData")
	public void runLogin(String userName, String password, String comName, String fName, String lName) {
//		LoginPage lp = new LoginPage();
		new LoginPage(driver)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName(comName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickCreateLead();
		
//		LoginPage lp = new LoginPage();
//		lp.enterUserName();
//		lp.enterPassword();
//		lp.clickLogin();
//		
//		HomePage hp = new HomePage();
//		hp.clickCRMSFA();
	}
	
}
