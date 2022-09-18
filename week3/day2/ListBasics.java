package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
/*
 * add() -> used to add value to a list
 * size() -> used to find the number of items in a list
 * The first data index will be also 0
 * last index -> size() - 1
 * get(index) -> to get the value from list
 * remove() -> to remove a data from list
 * Collections.sort(<List>) -> to the sort the values in ascending order
 * Collections.reverse(<List>) -> to reverse the sorting
 * indexOf(object) -> index of an item
 * 
 */

public class ListBasics {

	public static void main(String[] args) {
		// <> -> generic to restric the datatype
		// int -> primitive datatype

		List<String> values = new LinkedList<String>();

		values.add("Hari"); // index start with 0
		values.add("Babu"); // 1
		values.add("Aravind");// 2
		values.add("Vidya"); // 3
		values.add("Subraja"); // 4

		// to find the number of items in a list

		values.add("Haja"); // 5
		values.add("Hari");
		// int count = values.size();
		// System.out.println(count);
		// System.out.println(values.size()); //6

		// to get single data from list
		/*
		 * String data = values.get(5); System.out.println(data);
		 */

		// to get the last data
		values.get(values.size() - 1);

		// 0 to 5
		/*
		 * for (int i = 0; i < values.size(); i++) {
		 * 
		 * System.out.println(values.get(i));
		 * 
		 * }
		 */
		System.out.println(values.size());

		values.remove("Hari");

		System.out.println(values.size());

		// to sort the data in ascending order
		Collections.sort(values);
		
		//to reverse the sorting
		Collections.reverse(values);
		
		System.out.println(values.indexOf("Babu"));

		for (String eachData : values) {
			System.out.println(eachData);
		}
		
		
		/*
		 * int[] num = {100,200,300,400};
		 * 
		 * List<Integer> listValues = new ArrayList<Integer>();
		 * 
		 * for (Integer eachValue : num) {
		 * 
		 * listValues.add(eachValue);
		 * 
		 * }
		 
		
		System.out.println(listValues); */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
