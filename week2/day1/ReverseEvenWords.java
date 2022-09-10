package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		/*
		 * Pseudo Code:
		 * 
		 * Declare the input as Follow String test = "I am a software tester"; a) split
		 * the words and have it in an array b) Traverse through each word (using loop)
		 * c) find the odd index within the loop (use mod operator)
		 * 
		 * d)split the words and have it in an array
		 * 
		 * e)print the even position words in reverse order using another loop (nested
		 * loop) 
		 * f) Convert words to character array if the position is even else print
		 * the word as it is(concatenate space at the end).
		 * 
		 */
		
		String test = "I am a software tester";
		// I ma a erawtfos tester
		
		String[] words = test.split(" ");
		
		for (int i = 0; i < words.length; i++) {
			if (i%2 != 0) {
				// reverse string
				StringBuilder sb = new StringBuilder(words[i]);
				System.out.print(sb.reverse()+ " ");
			} else {
				System.out.print(words[i] + " ");
			}
		}
	}

}
