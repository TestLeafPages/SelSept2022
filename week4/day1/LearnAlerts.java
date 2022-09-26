package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/alert.xhtml");
		
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//h5[text()=' Alert (Simple Dialog)']/following-sibling::button")).click();
		driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']/following-sibling::button")).click();
		
		// Swicthing to alert
		Alert alert = driver.switchTo().alert();
		
		// get the alert text
		String alertText = alert.getText();
		System.out.println(alertText);
		
		// accepting the alert (clicking on OK)
//		alert.accept();
		
		// enter the text in alert box
		alert.sendKeys("TestLeaf");
		
//		Thread.sleep(5000);
		
		// dismiss the alert (Clicking on Cancel)
		alert.dismiss();
		
		String text = driver.findElement(By.id("confirm_result")).getText();
		System.out.println(text);
	}

}
