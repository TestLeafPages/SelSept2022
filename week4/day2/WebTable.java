package week4.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);

		driver.get("https://leafground.com/table.xhtml");

		driver.manage().window().maximize();
		
		String text = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table//tr[1]/td[1]")).getText();
		System.out.println(text);
		
		List<WebElement> rows = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr"));
		int rowCount = rows.size();
		
		List<WebElement> columns = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-header-box']/table//th"));
		int colCount = columns.size();
		
//		for (WebElement eachRow : rows) {
//			System.out.println(eachRow.getText());
//		}
		
		for(int i=1; i <= rowCount; i++) {
			for(int j=1; j <= colCount; j++) {
				String value = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table//tr[" + i + "]/td["+ j +"]")).getText();
				System.out.println(value);
			}
		}
		
		WebElement ele = driver.findElement(By.id(""));
		ele.sendKeys("");
		Thread.sleep(500);
		ele.sendKeys(Keys.ENTER);
	}

}
