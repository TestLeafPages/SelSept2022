package week3.day2;

import java.util.LinkedHashMap;
import java.util.Map;

public class LearnMap {

	public static void main(String[] args) {
		//Key,Value
		Map<Integer,String> map = new LinkedHashMap<Integer,String>();
		
		map.put(100,"Babu");
		map.put(200,"Hari"); //old value
		map.put(200,"Haja"); //new value
		map.put(200,"Aravind"); 
		
	  System.out.println(map.get(200));
		
		
		

	}

}
