package week1.day1;

public class ConditionalStatements {

	public static void main(String[] args) {
		/*
		 * Print Postive if number is greater than 0
		 * Print Negative if number is less than 0
		 * Print Zero if number is 0
		 */
		int num = 1;
		if(num>0) {
			System.out.println("Positive");
		} else if(num<0){
			System.out.println("Negative");
		} else {
			System.out.println("Zero");
		}
	}

}
