package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
/*
 * put() -> to insert data into map
 * get(key) -> to get the value of a key
 * containKey(key) -> true if it contains the key; false if it donsn't contain the key
 * 
 */

public class CharacterOccurance {

	public static void main(String[] args) {
		String input = "amazon indian";
		//output a=3 , m=1, z=1, o=1, n=2, i=2, d=1
		
		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		
		char[] charArray = input.toCharArray();
		
		/*
		 * for (char ch : charArray) { //a //check whether 'a' is already available in
		 * map if(map.containsKey(ch)) {
		 * 
		 * map.put(ch, map.get(ch)+1);
		 * 
		 * }else { map.put(ch, 1); //first time occurance -> }
		 * 
		 * 
		 * }
		 */
		
		/*
		 * for (int i = 0; i < charArray.length; i++) {
		 * 
		 * if(map.containsKey(charArray[i])) { map.put(charArray[i],
		 * map.get(charArray[i])+1);
		 * 
		 * }else { map.put(charArray[i], 1); }
		 * 
		 * 
		 * }
		 */
		
		for (char ch : charArray) {
			
			map.put(ch, map.getOrDefault(ch,0)+1);
			
		}
		
		System.out.println(map);
		
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		
		int maxOccurance = 0;
		char maxCharacter = 0;
		
		List<String> maxChar = new ArrayList<String>();
		String str ="";
		for (Entry<Character, Integer> eachEntry : entrySet) {
			
			if (eachEntry.getValue() >= maxOccurance) { //3 > 0
				maxCharacter = eachEntry.getKey();
				maxOccurance = eachEntry.getValue();
				 str = maxCharacter+"-->"+maxOccurance;
				maxChar.add(str);
			}
			
			/*
			 * Character key = eachEntry.getKey(); // to get the key alone //
			 * System.out.println(key); Integer value = eachEntry.getValue(); // to get the
			 * value alone System.out.println(key+"-->"+value);
			 */
			
		}
		
			
		System.out.println(maxChar);
		
		
		
		
		
		
		
		
		
		
		

	}

}
