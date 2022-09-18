package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
/*
 * add() -> used to add value to a list
 * size() -> used to find the number of items in a list
 * The first data index will be also 0
 * last index -> size() - 1
 * remove() -> to remove a data from list
 * get(index) is not available for Set
 * 
 */
import java.util.Set;
import java.util.TreeSet;

public class LearnSetBasics {

	public static void main(String[] args) {
		
		Set<String> values = new TreeSet<String>(); //will maintain the insertion order

		values.add("Hari");  //true
		values.add("Babu"); 
		values.add("Aravind");
		values.add("Vidya"); 
		values.add("Subraja"); 
		values.add("Haja"); 
	
	//	System.out.println(values.add("Hari")); //duplicate -> false
		
		for (String eachData : values) {
			System.out.println(eachData);
			
		}
				
		//to get the single data from Set -> Copy the set into list and use get(index) in list
		
		List<String> listValues = new ArrayList<String>(values); //copy one collection into another
		
		System.out.println("***************************");
		
		System.out.println(listValues.get(3));
		

	}

}
