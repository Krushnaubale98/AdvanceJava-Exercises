package T05CollectionComparableComparatorSorting;

import java.util.*;
// Sort String object

public class SortStringObject {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();

		al.add("Ramesh");
		al.add("Ganesh");
		al.add("Raju");
		System.out.println("Intial list:"+al);
		
		Collections.sort(al);
		System.out.println("After sorting the list:"+al);
	
	}

}
