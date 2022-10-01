package week5.day1;

import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass in parent");
	}
	
	
	
}
