package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass{

	@Given("Click on CRMSFA")
	public void clickCRMSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	@Given("Verify First Name is displayed as (.*)$")
	public void verify(String expectedText) {
		String actualText = driver.findElement(By.id("")).getText();
		if(actualText.equals(expectedText)) {
			System.out.println();
		}
	}
}
