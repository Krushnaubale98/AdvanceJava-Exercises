package T05CollectionComparableComparatorSorting;

import java.util.*;

// Java colloections max()Method 
public class CollectionsMax {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		list.add(12);
		list.add(544);
		list.add(45);
		list.add(0);
		System.out.println("Intial list elements" + list);
		Collections.reverse(list);
		System.out.println("Reverse list:"+list);
		
		
		System.out.println("Value of maximum elements from the collection: " + Collections.max(list));

		int a = Collections.min(list);
		System.out.println("Minimum valu of collection:" + a);

		// find the min and max value into a list without using min and max method
		System.out.print("Elements of arraylist: ");
		int n = list.size();
		for (int i = 0; i < n; i++) {
			System.out.print(list.get(i) + " ");

		}
		System.out.println();
		Collections.sort(list);
		System.out.println("After sorting list:"+list);
		
		int min=list.get(0);
		System.out.println("min value="+min);
		int max=list.get(n-1);
		System.out.println("mac value="+max);
		 

	}

}
