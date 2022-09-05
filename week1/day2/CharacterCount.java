package week1.day2;

public class CharacterCount {

	public static void main(String[] args) {
		String str = "TestLeaf"; // 8
		char ch = 'e';
		
		int count=0;
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i] == ch) {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
