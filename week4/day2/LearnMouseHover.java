package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnMouseHover {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);

		driver.get("https://www.myntra.com/");

		driver.manage().window().maximize();
		
		WebElement menEle = driver.findElement(By.xpath("//a[text()='Men']"));
		
		Actions builder = new Actions(driver);
		
		// mouse hover on an element
		builder.moveToElement(menEle).perform();
		
	}

}
