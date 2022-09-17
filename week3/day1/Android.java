package week3.day1;

/*
 * A class with partial implementation
 * it would have both implemented and unimplemented methods
 * unimplemented -> abstract 
 * 
 * When it is abstract class -> it is not mandatory to implement
 * 
 */
public abstract class Android implements Mobile{

	public void makeCall() {
		// TODO Auto-generated method stub
		
	}

	public void sendSMS() {
		// TODO Auto-generated method stub
		
	}

	public boolean switchOn() {
		// TODO Auto-generated method stub
		return false;
	}

	// You can create your own abstract method.
	public abstract void switchOff();

}
