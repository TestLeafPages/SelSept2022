package com.testleaf.testcases;

public class LearnExceptionHandling {

	public static void main(String[] args) {
		
		int x = 10;
		
		int y = 1;
		
		int[] arr = {2, 5, 6};
		
		try {
			System.out.println(x/y);
			System.out.println(arr[1]);
			System.out.println("Within try block");
		} 
		catch (ArithmeticException e) {
			System.out.println(e);
			if (y==0) {
				System.out.println(x/1);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The index which you trying to access from array is not available");
		} catch (Exception e) {
			System.out.println(e);
		} 
		finally {
			System.out.println("I am in finally block");
		}
		
		System.out.println("End of program");
	}

}
