package week5.day2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EditLead extends BaseClass{

	@Test(dataProvider = "edit")
	public void runEditLead(String phone, String company) throws InterruptedException {

		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phone);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(company);
		driver.findElement(By.name("submitButton")).click();

	}
	
	// phone number, company Name
	
	@DataProvider(name="edit")
	public String[][] fetchData() throws IOException {
		
		/*
		String[][] data = new String[3][2];
		
		// first set
		data[0][0] = "9";
		data[0][1] = "Infosys";
		
		// second set
		data[1][0] = "8";
		data[1][1] = "Amazon";
		
		// third set
		data[2][0] = "7";
		data[2][1] = "HCL";
		
		return data;
		*/
		
		return ReadExcelData.readSheetData("EditLead");
		
	}
	
}






