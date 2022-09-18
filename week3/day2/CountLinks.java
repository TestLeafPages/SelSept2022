package week3.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		int count = allLinks.size();
		
		System.out.println(count);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
