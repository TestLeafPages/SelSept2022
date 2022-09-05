package week1.day2;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		int[] marks = {85, 97, 89, 75, 69};
		
		// to get the number of items in array
		int length = marks.length;
		System.out.println(length);
		
		// to get the first item
		System.out.println(marks[0]);
		
		// to get the last item
		System.out.println(marks[length-1]);
		
		/*
		 * Find the number of times 97 is present.
		 */
		
		int num = 97;
		int count = 0;
		
		for(int i=0; i<marks.length;i++) {
			if(marks[i] == num) {
//				count = count+1;
				count++;
			}
		}
		System.out.println(count);
		
		// sort an array
		Arrays.sort(marks); // will sort in ascending
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
		for (int i = marks.length-1; i >=0; i--) {
			System.out.println(marks[i]);
		}
		
	}

}
