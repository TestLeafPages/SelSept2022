package com.testleaf.testcases;

public class LearnThrow {

	public void divide(int num1, int num2) {
		if (num1 > num2) {
			System.out.println(num1 / num2);
		} else {
			throw new RuntimeException("Element you are trying to find is not found");
//			throw new ArithmeticException("Invalid input - num1 is less than num2");
		}

	}

	public static void main(String[] args) {
		LearnThrow lt = new LearnThrow();
		lt.divide(2, 5);
		lt.sleep(2000);
	}

	public void sleep(int mSecs) {
		try {
			Thread.sleep(mSecs);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
