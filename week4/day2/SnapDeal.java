package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);

		driver.get("https://www.snapdeal.com/");

		driver.manage().window().maximize();
		
		// Escape Sequence
		WebElement ele = driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]"));
		WebElement shirtsEle = driver.findElement(By.xpath("//span[text()='Shirts']"));
		Actions builder = new Actions(driver);
		
		builder.moveToElement(ele)
		.pause(500)
		.click(shirtsEle)
		.perform();
		
		Thread.sleep(2000);
		WebElement firstShirtEle = driver.findElement(By.xpath("//div[@class='product-tuple-image ']"));
		
		builder.moveToElement(firstShirtEle)
		.perform();
		
		driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();
		
		
		
	}

}
