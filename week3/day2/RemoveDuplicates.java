package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String input = "PayPal India";

		char[] charArray = input.toCharArray();

		Set<Character> values = new LinkedHashSet<Character>();

		for (char ch : charArray) {
			if(ch != ' ') {
				values.add(ch);
			}

		}

		String output = "";
		for (Character eachChar : values) {
			output = output+eachChar;
			
		}
		System.out.println(output);
		
	}

}
