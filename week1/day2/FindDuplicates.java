package week1.day2;

import java.util.Arrays;

public class FindDuplicates {

	public static void main(String[] args) {
		int[] nums = {12, 25, 12, 56, 89, 25};
		
		// 12, 12, 25, 25, 56, 89
		Arrays.sort(nums);
		
		for(int i =0; i<nums.length-1;i++) {
			if (nums[i] == nums[i+1]) {
				System.out.println("Duplicates are: " + nums[i]);
			}
		}
		
	}

}
