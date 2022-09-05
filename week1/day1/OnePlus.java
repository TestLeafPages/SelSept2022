package week1.day1;

import javax.management.modelmbean.ModelMBean;

public class OnePlus {
	
	/*
	 * AccessModifer, Return type, name
	 * methodName - camelcase
	 */
	protected void batteryStatus() {
		System.out.println("90%");
	}
	
	public void switchOff() {
		System.out.println("Switch Off");
	}
	
	public String getModelName() {
		return "9RT";
	}
	
	public void getName() {
		System.out.println("9RT");
	}
	
	public int getLauchYear() {
		return 2022;
	}
	

	public static void main(String[] args) {
		// ClassName refName = new ClassName()
		OnePlus mbl = new OnePlus();
		mbl.batteryStatus();
		mbl.switchOff();
		// ctrl+2, L
		String modelName = mbl.getModelName();
		System.out.println(modelName);
	}

}
