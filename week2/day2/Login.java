package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// set up browser driver
		WebDriverManager.chromedriver().setup();
		String driverPath = System.getProperty("webdriver.chrome.driver");
		System.out.println(driverPath);
		
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();
//		EdgeDriver driver1 = new EdgeDriver();
		
		// Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		// maximize the browser
		driver.manage().window().maximize();
		
//		Thread.sleep(5000);
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Enter the username
		WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		userName.sendKeys("DemoSalesManager");
		
//		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
		
		String name = "Haja";
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys(name);
		
		name = driver.findElement(By.id("createLeadForm_firstName")).getAttribute("value");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("J");
		
		// Select Conference from Source dropdown
		WebElement source = driver.findElement(By.xpath("//select[@name='dataSourceId']"));
		Select dd = new Select(source);
		dd.selectByValue("LEAD_CONFERENCE");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		String firstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(firstName);
		
		if(firstName.equals(name)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		driver.close();
	}

}
