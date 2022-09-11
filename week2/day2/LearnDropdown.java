package week2.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		
		WebElement eleAT = driver.findElement(By.className("ui-selectonemenu"));
		
		Select dd = new Select(eleAT);
		
//		dd.selectByIndex(1);
		
//		dd.selectByVisibleText("Playwright");

//		dd.selectByValue("");
//		
//		dd.getFirstSelectedOption();
		
		List<WebElement> options = dd.getOptions();
		
		for (int i = 0; i < options.size(); i++) {
			WebElement eachOption = options.get(i);
			String text = eachOption.getText();
			System.out.println(text);
		}
		
		dd.selectByIndex(options.size()-2);
	}

}
