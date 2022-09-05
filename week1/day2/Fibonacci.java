package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		// 0 1 1 2 3 5 8 13 21 35 56
		/*
		 * Initialize 3 int variables
		 */
		int firstNum = 0;
		int secNum = 1;
		int sum;
		System.out.println(0);
		System.out.println(1);
		
		for(int i=2; i<=11; i++) {
			sum = firstNum + secNum;
			firstNum = secNum;
			secNum = sum;
			System.out.println(sum);
		}
		
	}

}
