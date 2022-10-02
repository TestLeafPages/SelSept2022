package week5.day2;


import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {

	@Test(dataProvider = "create")
	public void runCreateLead(String companyName, String firstName, String lastName) {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.name("submitButton")).click();
	}
	
	// Step 1: CompanyName, FirstName, LastName
	
	// Step 2: Create dataprovider annotation with name attribute. and relate to @Test
	@DataProvider(name="create")
	public String[][] fetchData() throws IOException {
		String[][] data ;
		
		/*
		// first row 
		data[0][0] = "TestLeaf";
		data[0][1] = "Hari";
		data[0][2] = "Radhakrishnan";
		
		// second row
		data[1][0] = "Qeagle";
		data[1][1] = "Babu";
		data[1][2] = "Manickam";
		
		*/
		data = ReadExcelData.readSheetData("CreateLead");
		return data;
	}
	
	// one dimension for the row, other for the column !
	
}
