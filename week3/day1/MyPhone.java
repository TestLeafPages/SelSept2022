package week3.day1;

public class MyPhone {

	public static void main(String[] args) {
		
		// Trying to call Interface
		// Mobile m = new Mobile(); // You cannot create object for interface !
		
		// Trying to call abstract class
		// Android an = new Android(); // You are not allowed 
		
		// Trying to call concrete class
		OnePlus myPhone = new OnePlus();
		
		// I can access methods !
		myPhone.makeCall();
	}

}
