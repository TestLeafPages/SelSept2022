package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDroppable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);

		driver.get("https://jqueryui.com/droppable/");

		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		Actions builder = new Actions(driver);
		
		WebElement dragEle = driver.findElement(By.id("draggable"));
		
		WebElement dropEle = driver.findElement(By.id("droppable"));
		
		builder.dragAndDrop(dragEle, dropEle).perform();
		
		
	}

}
