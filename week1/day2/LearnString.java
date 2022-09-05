package week1.day2;

import java.util.Arrays;

public class LearnString {

	public static void main(String[] args) {
		// String literal
		String companyName = "Welcome to TestLeaf";
		
		// String Object
		String company = new String("WlecometoTestLeaf");
		
		// compare 2 Strings
		boolean isEqual = companyName.equals(company);
		System.out.println("Without ignores: "+isEqual);
		System.out.println("Ignores check: "+companyName.equalsIgnoreCase(company));
		
		System.out.println(companyName == company);
		
		// to get the length of String
		int length = companyName.length();
		System.out.println("Length is:" + length);
		
		// to convert the String an char array
		char[] charArray = companyName.toCharArray();
		System.out.println(charArray);
		
		// to get a particular char
		char charAt = companyName.charAt(length-1);
		System.out.println(charAt);
		
		// to get the index of a char
		int indexOf = companyName.indexOf('e');
		System.out.println(indexOf);
		
		// to check if string has a specific text
		boolean contains = companyName.contains("Leaf");
		System.out.println(contains);
		
		// to get a particular word from Sequence of words
		String[] split = companyName.split(" ");
		System.out.println("Split Output:" +split[2]);
		
		/*
		 * Check if a String is an Anagram
		 * String str1 = "hello"
		 * String str2 = "elohl"
		 * 
		 * 1. convert the string to char array
		 * 
		 */
		
		String str1 = "hello"; // h, e, l, l o // e, h, l, l , o
		String str2 = "elohl"; // e, l, o, h, l// a, h, l, l , o
		
		if (str1.length() != str2.length()) {
			System.out.println("Not an Anagram");
		} else {
			char[] charArray1 = str1.toCharArray();
			char[] charArray2 = str2.toCharArray();

			Arrays.sort(charArray1);
			Arrays.sort(charArray2);

//		if(charArray1.equals(charArray2)) {
//			System.out.println(true);
//		} else {
//			System.out.println(false);
//		}
			boolean isAnagram = true;
			for (int i = 0; i < charArray2.length; i++) {
				if (charArray1[i] != charArray2[i]) {
					System.out.println("Not an Anagram");
					isAnagram = false;
					break;
				}
			}
			if (isAnagram == true) {
				System.out.println("Anagram");
			}
		}
		
		// to convert a String to UpperCase/ LowerCase
		System.out.println(companyName.toUpperCase());
		System.out.println(companyName.toLowerCase());
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
