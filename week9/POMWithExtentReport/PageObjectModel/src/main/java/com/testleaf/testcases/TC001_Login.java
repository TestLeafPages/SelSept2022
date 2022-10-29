package com.testleaf.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testleaf.base.ProjectSpecificMethods;
import com.testleaf.pages.HomePage;
import com.testleaf.pages.LoginPage;

public class TC001_Login extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setData() {
		fileName = "Login";
		testName = "Create Lead";
		testDescription = "Create lead with mandatory information";
		testAuthor = "Haja";
		testCategory = "Smoke";
	}

	@Test(dataProvider = "fetchData")
	public void runLogin(String userName, String password) throws IOException {
//		LoginPage lp = new LoginPage();
		System.out.println(driver);
		new LoginPage(driver)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin();
		
//		LoginPage lp = new LoginPage();
//		lp.enterUserName();
//		lp.enterPassword();
//		lp.clickLogin();
//		
//		HomePage hp = new HomePage();
//		hp.clickCRMSFA();
	}
	
}
