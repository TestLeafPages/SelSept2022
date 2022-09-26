package week4.day1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeSnap {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);

		driver.get("https://leafground.com/alert.xhtml");

		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//h5[text()=' Alert (Simple Dialog)']/following-sibling::button"));
		
//		File source = ele.getScreenshotAs(OutputType.FILE);
		File source = driver.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("./snaps/scrnshot1.png");

		FileUtils.copyFile(source, destination);
	}
}
