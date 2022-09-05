package week1.day2;

import java.util.Arrays;

public class FindMinMax {

	public static void main(String[] args) {
		int[] nums = {22, 3981, -19, 82, 0, 45, 37};
		
		/*
		 * 1. Sort the array
		 * 2. value at index 0 is the min value
		 * 3. value at index (length-1) is the max value
		 */
//		Arrays.sort(nums);
		
//		System.out.println("Min value is: " + nums[0]);
//		System.out.println("Max value is: " + nums[nums.length-1]);
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if (min > nums[i]) {
				min = nums[i];
			}
			if (max < nums[i]){
				max = nums[i];
			}
		}
		System.out.println("Min value is: " + min);
		System.out.println("Max value is: " + max);
	}

}
