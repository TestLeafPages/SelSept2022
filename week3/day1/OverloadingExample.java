package week3.day1;

public class OverloadingExample {
	
	// Why overloading ? To improve verbose.
	
	// number of arguments are different !!
	public int sum2(int a, int b) {
		return a+b;
	}
	
	public int sum3(int a, int b, int c) {
		return a+b+c;
	}
	
	// Number of argument -> 1 but the data type is different 
	public String getVehicleName(String whom) {
		return "Babu";
	}

	public String getVehicleName(int what) {
		return "Babu";
	}
	
	public String getVehicleName(String whom, int data) {
		return "Babu";
	}
	
	public String getVehicleName(int data, String whom) {
		return "Babu";
	}
}
