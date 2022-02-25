package T03HashsetAndTreeset;

import java.util.*;

public class TreesetExp {

	public static void main(String[] args) {

		// Creating and add elements

		TreeSet<String> tset = new TreeSet<String>();

		tset.add("One");
		tset.add("Two");
		tset.add("Three");
		System.out.println("TreeSet");
		System.out.println(tset);

		System.out.println("\nadd dublicate elements but it is not added");
		tset.add("Two");
		System.out.println(tset);

		// Traverse the Elements

		System.out.println("\nTraverse the elements");
		Iterator<String> itr = tset.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
