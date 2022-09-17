package week3.day1;

public class MyVehicle {
	
	/*
	 * Inheriting methods, variables from the super class
	 * Keyword: extends
	 * Multi-level : Allowed
	 * Multiple : No
	 */

	public static void main(String[] args) {
		
		Audi myCar = new Audi();
		myCar.applyBrake();
		
		myCar.soundHorn();
		myCar.turnAC();
		myCar.openSunRoof();
		
		
		BMW myOtherCar = new BMW();
		myOtherCar.applyBrake();

	}

}
