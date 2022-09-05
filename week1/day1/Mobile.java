package week1.day1;

public class Mobile {

	// Access_Modifier 
	public static void main(String[] args) {
		/*
		 * int, boolean, float, char
		 */
		/*
		 * Syntax of variable:
		 * 
		 * data_type variable_name = value;
		 * 
		 * variable name - camelcase
		 */
		int price = 20000;
		boolean isAndroid = true;
		float osVersion = 11.21F;
		char logo = 'B';
		String mblName = "OnePlus";
		
		System.out.println(price);
		System.out.println(isAndroid);
		System.out.println(osVersion);
		System.out.println(logo);
		System.out.println(mblName);
		
		OnePlus mbl = new OnePlus();
		mbl.batteryStatus();
		
	}

}
