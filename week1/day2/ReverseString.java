package week1.day2;

public class ReverseString {

	public static void main(String[] args) {
		String str = "TestLeaf";
		
		char[] chArr = str.toCharArray();
		
		// 7 --> 0
		for(int i=chArr.length-1; i>=0; i--) {
			System.out.print(chArr[i]);
		}
		
		for(int i=str.length()-1; i>=0;i-- ) {
			System.out.print(str.charAt(i));
		}
		
	}

}
