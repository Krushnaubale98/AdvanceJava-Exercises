package T02ListAndItsImplementation;

import java.util.*;

public class ListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("Amit");
		list.add("Vijay");
		list.add("Kumar");
		
		// add the element from specific place using index value
		list.add(1,"Sachin");
		// add the elements specific place using get() method.
		System.out.println("An elements at 2nd position :"+list.get(2));
		
		// print the list of this array
		System.out.println(list);
		
		//print the Iterate array
		for(String str:list) {
			System.out.println(str);
		}

	}

}
