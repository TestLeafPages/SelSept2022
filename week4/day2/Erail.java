package week4.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);

		driver.get("https://erail.in/");

		driver.manage().window().maximize();
		
		WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
		fromStation.clear();
		fromStation.sendKeys("MAS");
		Thread.sleep(500);
		fromStation.sendKeys(Keys.ENTER);
		
		WebElement toStation = driver.findElement(By.id("txtStationTo"));
		toStation.clear();
		toStation.sendKeys("CBE");
		Thread.sleep(500);
		toStation.sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		Thread.sleep(1000);
		List<WebElement> trainNameEles = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//td[2]/a"));
		
		List<String> trainNames = new ArrayList<String>();
		System.out.println(trainNameEles.size());
		for (WebElement eachEle : trainNameEles) {
			String text = eachEle.getText();
			trainNames.add(text);
			System.out.println(text);
		}
		
		Set<String> trains = new HashSet<String>(trainNames);
		
		if(trainNames.size() == trains.size()) {
			System.out.println("No Duplicates");
		} else {
			System.out.println("Duplicates found");
		}
		
		
		
	}

}
