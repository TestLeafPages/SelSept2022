package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrames {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/frame.xhtml");
		
		driver.manage().window().maximize();
		
		// switch to frame
		
		WebElement frame = driver.findElement(By.xpath("//h5text()=' Click Me (Inside frame)']/following-sibling::iframe"));
		driver.switchTo().frame(frame);
		
		driver.switchTo().frame(3);
		
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		
		// to get back to the main window
		driver.switchTo().defaultContent();
		
		// to get back of one frame
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame(1);
		
		driver.findElement(By.xpath("//button[text()='Count Frames']")).click();
	}

}
