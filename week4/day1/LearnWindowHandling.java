package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/window.xhtml");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//h5[text()='Click and Confirm new Window Opens']/following-sibling::button")).click();
		
		// switch to window/tab
		String parentHandle = driver.getWindowHandle();
		System.out.println(parentHandle);
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(windowHandles);
		
		// get total handles count
		System.out.println(windows.size());
		
		// get current window title
		System.out.println(driver.getTitle());
		
		// switch to new tab
		driver.switchTo().window(windows.get(1));
		
		// get title of new tab
		System.out.println(driver.getTitle());
		
//		driver.findElement(By.xpath("")).click();
		
//		Set<String> windowHandles1 = driver.getWindowHandles();
//		List<String> windows1 = new ArrayList<String>(windowHandles);
//		
//		driver.switchTo().window(windows1.get(2));
		
		// close current tab
		driver.close();
		
		driver.switchTo().window(windows.get(0));
//		driver.switchTo().window(parentHandle);
		
		System.out.println(driver.getTitle());
		
		// close the current window/tab in which control is present
		driver.close();
		
		// close all open tabs/windows
//		driver.quit();
	}

}
