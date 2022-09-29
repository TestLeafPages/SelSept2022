package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDoubleClick {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);

		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");

		driver.manage().window().maximize();
		
		Actions builder = new Actions(driver);
		
		driver.switchTo().frame("iframeResult");
		
		WebElement ele = driver.findElement(By.xpath("//p[text()='Double-click this paragraph to trigger a function.']"));
		
		builder.doubleClick(ele).perform();
		
	}

}
