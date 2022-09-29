package week4.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Constructor {
	
	String comName = "TestLeaf";
	
	/*
	 * Default Constructor
	 */
	
	/*
	 * Constructor are like methods without return type
	 * name of the constructor = name of the class
	 * Used to perform some common actions while creating object
	 */
	public Constructor() {
//		this("test"); // Constructor Chaining
		System.out.println("I am in default constructor");
	}
	
	// Parametrized Constructor
	public Constructor(String comName) {
		System.out.println("Inside Parametrized constructor " + comName);
		this.comName = comName;
//		this.method();
	}
	public void method() {
		String n = "";
		System.out.println("In method");
	}

	public static void main(String[] args) {

//		WebDriverManager.chromedriver().setup();
//		ChromeOptions options = new ChromeOptions();
//		ChromeDriver driver = new ChromeDriver(options);
		
		Constructor cons = new Constructor("Test");
		cons.method();
		System.out.println(cons.comName);
		
		Constructor con = new Constructor();
		System.out.println(con.comName);
	}

}
